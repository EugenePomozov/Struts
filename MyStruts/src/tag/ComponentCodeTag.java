package tag;

import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

import beans.ReservationComponent;
import beans.User;

public class ComponentCodeTag extends TagSupport {
	private static final long serialVersionUID = 1L;

	public int doStartTag() throws JspException {
		User user = (User) pageContext.getAttribute("user",
				PageContext.SESSION_SCOPE);
		List<ReservationComponent> list = user.getReservation().getReservationComponents();
		pageContext.getRequest().setAttribute("components", list);
		return SKIP_BODY;
	}
}
