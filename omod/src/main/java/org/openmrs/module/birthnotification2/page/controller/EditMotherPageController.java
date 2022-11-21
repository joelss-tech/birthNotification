package org.openmrs.module.birthnotification2.page.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Mother;

import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class EditMotherPageController {
	
	Birthnotification2Service birthnotification2Service;
	
	public void controller(PageModel model, @RequestParam(required = true, value = "motherId") Integer motherId) {
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		Mother mother = birthnotification2Service.getMotherById(motherId);
		model.addAttribute("mother", mother);
		
	}
}
