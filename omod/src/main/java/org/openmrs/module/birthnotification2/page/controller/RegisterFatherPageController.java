package org.openmrs.module.birthnotification2.page.controller;

import javax.servlet.http.HttpSession;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Father;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class RegisterFatherPageController {
	
	Birthnotification2Service birthnotification2Service;
	
	public void post(PageModel model, HttpSession session,
	        @RequestParam(required = true, value = "givenName") String givenName,
	        @RequestParam(required = true, value = "surname") String surname,
	        @RequestParam(required = true, value = "nationalId") String nationalId,
	        @RequestParam(required = true, value = "age") int age,
	        @RequestParam(required = true, value = "village") String village,
	        @RequestParam(required = true, value = "subcounty") String subcounty,
	        @RequestParam(required = true, value = "district") String district) {
		
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		
		Father father = new Father();
		
		father.setGivenName(givenName);
		father.setSurname(surname);
		father.setAge(age);
		father.setNationalId(nationalId);
		father.setNationalId(nationalId);
		father.setSubcounty(subcounty);
		father.setDistrict(district);
		father.setVillage(village);
		father.setVoided(false);
		birthnotification2Service.saveOrUpdate(father);
	}
	
	public void get(PageModel model) {
		
	}
}
