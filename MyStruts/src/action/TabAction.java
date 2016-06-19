package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class TabAction extends DispatchAction {

	public boolean userControl(HttpServletRequest request){
		HttpSession session = request.getSession();
		if (session.getAttribute("user")==null){
			return false;
		}
		return true;
	}
	
	
	 public ActionForward reservationPage(ActionMapping mapping, ActionForm form,
		        HttpServletRequest request, HttpServletResponse response)
		        throws Exception {
		 
		 if(userControl(request)){
			 return mapping.findForward("reservationPage");
		 }else{
			 return mapping.findForward("failure");
		 }
	 }
	 
	 public ActionForward customerPage(ActionMapping mapping, ActionForm form,
		        HttpServletRequest request, HttpServletResponse response)
		        throws Exception {
		 return mapping.findForward("customerPage");
	 }
	 
	 public ActionForward fareFamilyPage(ActionMapping mapping, ActionForm form,
		        HttpServletRequest request, HttpServletResponse response)
		        throws Exception {
		 return mapping.findForward("fareFamilyPage");
	 }
}