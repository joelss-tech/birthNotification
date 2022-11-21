package org.openmrs.module.birthnotification2.page.controller;

import javax.servlet.http.HttpSession;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Mother;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class RegisterMotherPageController {
	
	Birthnotification2Service birthnotification2Service;
	
	public void post(PageModel model, HttpSession session,
	        @RequestParam(required = true, value = "givenName") String givenName,
	        @RequestParam(required = true, value = "surname") String surname,
	        @RequestParam(required = true, value = "nationalId") String nationalId,
	        @RequestParam(required = true, value = "age") int age,
	        @RequestParam(required = true, value = "village") String village,
	        @RequestParam(required = true, value = "subcounty") String subcounty,
	        @RequestParam(required = true, value = "district") String district,
	        @RequestParam(required = true, value = "parity") int parity) {
		
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		
		Mother mother = new Mother();
		mother.setGivenName(givenName);
		mother.setSurname(surname);
		mother.setNationalId(nationalId);
		mother.setParity(parity);
		mother.setAge(age);
		mother.setVillage(village);
		mother.setSubcounty(subcounty);
		mother.setDistrict(district);
		mother.setVoided(false);
		birthnotification2Service.saveOrUpdate(mother);
		
	}
	
	public void get(PageModel model) {
		
	}
	
}
