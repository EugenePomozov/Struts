package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

import beans.Phone;
import beans.User;

public class CustomerPhoneTag extends TagSupport {
	private static final long serialVersionUID = 1L;
	private String prop;		//phone;
	private String source;	//user;
	
	public void setProp(String prop) {
		this.prop = prop;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int doStartTag() throws JspException {
		User user = (User) pageContext.getAttribute(source,
				PageContext.SESSION_SCOPE);
		Phone phone = user.getReservation().getCustomer().getPhone();
		pageContext.getRequest().setAttribute(prop, phone);
		return SKIP_BODY;
	}
}
