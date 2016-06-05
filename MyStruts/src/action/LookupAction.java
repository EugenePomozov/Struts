package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


import form.LookupForm;

public class LookupAction extends Action {
	protected String getProfession(Long professionId) {
        if (professionId.equals(1L)) {
            return "Chemist";
        }
        return null;
    }
 
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String profession = null;
 
       
        
        // �������� ���� �����-��������� � �������
        LookupForm lookupForm = (LookupForm) form;
        // ������������� ����� �� ���������
        String target = "success";
        Long professionId = null;
        if (form != null) {
            try {
                professionId = Long.parseLong(lookupForm.getProfessionId());
                profession = getProfession(professionId);
            } catch (Exception e) {
            }
        }
        // � ��������� ����� � ������ �������
        if (profession == null) {
            target = "failure";
            ActionErrors errors = new ActionErrors();
            errors.add(ActionErrors.GLOBAL_MESSAGE, new ActionMessage("errors.lookup.unknown", professionId));
            saveErrors(request, errors);
        } else {
            lookupForm.setProfessionName(profession);
        }
        // ��������� �� ������ �������� � ����������� �� �������������� target
        return (mapping.findForward(target));
    }
}
