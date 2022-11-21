package org.openmrs.module.birthnotification2.page.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Father;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class EditFatherPageController {
	
	Birthnotification2Service birthnotification2Service;
	
	public void controller(PageModel model, @RequestParam(required = true, value = "fatherId") Integer fatherId) {
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		Father father = birthnotification2Service.getFatherById(fatherId);
		model.addAttribute("father", father);
		
	}
}
