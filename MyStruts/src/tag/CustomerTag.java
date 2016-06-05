package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

import beans.Customer;
import beans.User;

public class CustomerTag extends TagSupport {
	private static final long serialVersionUID = 1L;

	public int doStartTag() throws JspException {
		User user = (User) pageContext.getAttribute("user",
				PageContext.SESSION_SCOPE);
		Customer customer = user.getReservation().getCustomer();
		pageContext.getRequest().setAttribute("customer", customer);
		return SKIP_BODY;
	}
}
