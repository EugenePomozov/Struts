package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

import beans.Phone;
import beans.User;

public class CustomerPhoneTag extends TagSupport {
	private static final long serialVersionUID = 1L;

	public int doStartTag() throws JspException {
		User user = (User) pageContext.getAttribute("user",
				PageContext.SESSION_SCOPE);
		Phone phone = user.getReservation().getCustomer().getPhone();
		pageContext.getRequest().setAttribute("phone", phone);
		return SKIP_BODY;
	}
}
