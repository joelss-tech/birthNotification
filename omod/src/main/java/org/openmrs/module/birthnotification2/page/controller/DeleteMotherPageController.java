package org.openmrs.module.birthnotification2.page.controller;

import javax.servlet.http.HttpSession;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Mother;
import org.openmrs.module.uicommons.util.InfoErrorMessageUtil;
import org.springframework.web.bind.annotation.RequestParam;

public class DeleteMotherPageController {
	
	Birthnotification2Service birthnotification2Service;
	
	public String controller(HttpSession session, @RequestParam(required = true, value = "motherId") Integer motherId) {
		
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		Mother mother = birthnotification2Service.getMotherById(motherId);
		birthnotification2Service.saveOrUpdate(mother);
		InfoErrorMessageUtil.flashInfoMessage(session, "Mother deleted successfully" + mother.getGivenName());
		return "allMothers";
	}
	
}
