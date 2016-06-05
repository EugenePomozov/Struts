package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;


import beans.User;

public class ReservationDescriptionTag  extends TagSupport {
	private static final long serialVersionUID = 1L;

	public int doStartTag() throws JspException {
		User user=(User)pageContext.getAttribute("user",PageContext.SESSION_SCOPE);
		try {
			pageContext.getOut().print(user.getReservation().getDescription());
		} catch (IOException e) {
			throw new JspException(e.getMessage());
		}
		return SKIP_BODY;
	}
}
