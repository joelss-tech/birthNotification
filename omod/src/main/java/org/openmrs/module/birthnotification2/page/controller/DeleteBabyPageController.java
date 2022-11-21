package org.openmrs.module.birthnotification2.page.controller;

import javax.servlet.http.HttpSession;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Baby;

import org.openmrs.module.uicommons.util.InfoErrorMessageUtil;
import org.springframework.web.bind.annotation.RequestParam;

public class DeleteBabyPageController {
	
	Birthnotification2Service birthnotification2Service;
	
	public String controller(HttpSession session, @RequestParam(required = true, value = "babyId") Integer babyId) {
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		Baby baby = birthnotification2Service.getBabyById(babyId);
		baby.setVoided(true);
		birthnotification2Service.saveOrUpdate(baby);
		InfoErrorMessageUtil.flashInfoMessage(session, "baby deleted sucessfully" + baby.getGivenName());
		return "allBabies";
	}
}
