package org.openmrs.module.birthnotification2.page.controller;

import javax.servlet.http.HttpSession;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Father;
import org.openmrs.module.uicommons.util.InfoErrorMessageUtil;
import org.springframework.web.bind.annotation.RequestParam;

public class DeleteFatherPageController {
	
	Birthnotification2Service birthnotification2Service;
	
	public String controller(HttpSession session, @RequestParam(required = true, value = "fatherId") Integer fatherId) {
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		Father father = birthnotification2Service.getFatherById(fatherId);
		birthnotification2Service.saveOrUpdate(father);
		InfoErrorMessageUtil.flashInfoMessage(session, "successfully deleted father" + father.getGivenName());
		return "allFathers";
	}
	
}
