package tag;

import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

import beans.Payment;
import beans.User;

public class CustomerPaymentsTag extends TagSupport {
	private static final long serialVersionUID = 1L;

	public int doStartTag() throws JspException {
		User user = (User) pageContext.getAttribute("user",
				PageContext.SESSION_SCOPE);
		List<Payment> payments = user.getReservation().getCustomer()
				.getPayments();
		pageContext.getRequest().setAttribute("payments", payments);
		return SKIP_BODY;
	}
}
