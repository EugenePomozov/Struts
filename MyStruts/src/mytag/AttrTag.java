package mytag;

import java.io.IOException;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class AttrTag extends BodyTagSupport {
	private static final long serialVersionUID = 1L;
	private int num;

	public void setNum(String num) {
		this.num = new Integer(num);
	}

	public int doStartTag() throws JspTagException {
		try {
			pageContext.getOut().write("<TABLE BORDER=\"3\" WIDTH=\"100%\">");
			pageContext.getOut().write("<TR><TD>");
		} catch (IOException e) {
			throw new JspTagException(e.getMessage());
		}
		return EVAL_BODY_INCLUDE;
	}

	public int doAfterBody() throws JspTagException {
		if (num-- > 1) {
			try {
				pageContext.getOut().write("</TD></TR><TR><TD>");
			} catch (IOException e) {
				throw new JspTagException(e.getMessage());
			}
			return EVAL_BODY_AGAIN;
		} else {
			return SKIP_BODY;
		}
	}

	public int doEndTag() throws JspTagException {
		try {
			pageContext.getOut().write("</TD></TR>");
			pageContext.getOut().write("</TABLE>");
		} catch (IOException e) {
			throw new JspTagException(e.getMessage());
		}
		return SKIP_BODY;
	}
}