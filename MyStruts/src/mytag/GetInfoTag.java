package mytag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class GetInfoTag extends TagSupport {

	private static final long serialVersionUID = 1L;
	
	public int doStartTag() throws JspException {
		//получение информации, передаваемой на страницу
		int size = new Integer(12);
		String str = "Size =<B>( " + size + " )</B>";
		try {
		JspWriter out = pageContext.getOut();
		out.write(str);
		} catch (IOException e) {
		throw new JspException(e.getMessage());
		}
		return SKIP_BODY;
		}


}
