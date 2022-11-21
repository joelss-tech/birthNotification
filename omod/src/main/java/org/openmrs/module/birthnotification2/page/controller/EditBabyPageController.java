package org.openmrs.module.birthnotification2.page.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Baby;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class EditBabyPageController {
	
	Birthnotification2Service birthnotification2Service;
	
	public void controller(PageModel model, @RequestParam(required = true, value = "babyId") Integer babyId) {
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		Baby baby = birthnotification2Service.getBabyById(babyId);
		model.addAttribute("baby", baby);
	}
	
}
