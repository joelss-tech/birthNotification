package org.openmrs.module.birthnotification2.page.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Baby;
import org.openmrs.module.birthnotification2.model.Father;
import org.openmrs.module.birthnotification2.model.Mother;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class PrintDetailsPageController {
	
	Birthnotification2Service birthnotification2Service;
	
	public void controller(PageModel model, @RequestParam(required = true, value = "babyId") Integer babyId,
	        @RequestParam(required = true, value = "fatherId") Integer fatherId,
	        @RequestParam(required = true, value = "motherId") Integer motherId) {
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		Father viewFather = birthnotification2Service.getFatherById(fatherId);
		Baby viewBaby = birthnotification2Service.getBabyById(babyId);
		Mother viewMother = birthnotification2Service.getMotherById(motherId);
		model.addAttribute("viewMother", viewMother);
		model.addAttribute("viewBaby", viewBaby);
		model.addAttribute("viewFather", viewFather);
	}
	
}
