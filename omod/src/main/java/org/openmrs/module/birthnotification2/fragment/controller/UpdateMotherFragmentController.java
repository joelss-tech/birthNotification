package org.openmrs.module.birthnotification2.fragment.controller;

import javax.servlet.http.HttpSession;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Mother;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class UpdateMotherFragmentController {
	
	Birthnotification2Service birthnotification2Service;
	
	public void controller(PageModel model, HttpSession session,
	        @RequestParam(required = true, value = "motherId") Integer motherId,
	        @RequestParam(required = true, value = "givenName") String givenName,
	        @RequestParam(required = true, value = "surname") String surname,
	        @RequestParam(required = true, value = "parity") int parity,
	        @RequestParam(required = true, value = "age") int age,
	        @RequestParam(required = true, value = "village") String village,
	        @RequestParam(required = true, value = "subcounty") String subcounty,
	        @RequestParam(required = true, value = "district") String district,
	        @RequestParam(required = true, value = "nationalId") String nationalId) {
		
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		Mother mother = birthnotification2Service.getMotherById(motherId);
		
		if (givenName != null) {
			mother.setGivenName(givenName);
		}
		if (surname != null) {
			mother.setSurname(surname);
		}
		if (parity != 0) {
			mother.setParity(parity);
		}
		
		if (age != 0) {
			mother.setAge(age);
		}
		
		if (village != null) {
			mother.setVillage(village);
		}
		if (subcounty != null) {
			mother.setSubcounty(subcounty);
			
		}
		if (district != null) {
			mother.setSubcounty(subcounty);
			
		}
		if (nationalId != null) {
			mother.setNationalId(nationalId);
		}
		
	}
	
	public void get(PageModel model) {
		
	}
	
}
