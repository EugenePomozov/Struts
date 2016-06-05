package mytag;

import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class HelloTag extends TagSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstname;

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int doStartTag() {
		try {
			pageContext.getOut().write("Hello, " + firstname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
