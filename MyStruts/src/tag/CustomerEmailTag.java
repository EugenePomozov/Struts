package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

import beans.Email;
import beans.User;

public class CustomerEmailTag extends TagSupport {
	private static final long serialVersionUID = 1L;

	public int doStartTag() throws JspException {
		User user = (User) pageContext.getAttribute("user",
				PageContext.SESSION_SCOPE);
		Email email = user.getReservation().getCustomer().getEmail();
		pageContext.getRequest().setAttribute("email", email);
		return SKIP_BODY;
	}
}
