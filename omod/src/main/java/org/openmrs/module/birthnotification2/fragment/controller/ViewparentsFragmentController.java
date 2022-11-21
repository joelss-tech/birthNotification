package org.openmrs.module.birthnotification2.fragment.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Father;
import org.openmrs.module.birthnotification2.model.Mother;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class ViewparentsFragmentController {
	
	Birthnotification2Service birthnotification2Service;
	
	public void controller(PageModel model, @RequestParam(required = true, value = "fatherId") Integer fatherId,
	        @RequestParam(required = true, value = "motherId") Integer motherId) {
		
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		Father father = birthnotification2Service.getFatherById(fatherId);
		Mother mother = birthnotification2Service.getMotherById(motherId);
		
		model.addAttribute("viewParents", father);
		model.addAttribute("viewParents", mother);
		
	}
	
}
