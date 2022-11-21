package org.openmrs.module.birthnotification2.fragment.controller;

import javax.servlet.http.HttpSession;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Father;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class UpdateFatherFragmentController {
	
	Birthnotification2Service birthnotification2Service;
	
	public void controller(PageModel model, HttpSession session,
	        @RequestParam(required = true, value = "fatherId") Integer fatherId,
	        @RequestParam(required = true, value = "givenName") String givenName,
	        @RequestParam(required = true, value = "surname") String surname,
	        @RequestParam(required = true, value = "nationalId") String nationalId,
	        @RequestParam(required = true, value = "village") String village,
	        @RequestParam(required = true, value = "district") String district,
	        @RequestParam(required = true, value = "subcounty") String subcounty,
	        @RequestParam(required = true, value = "age") int age) {
		
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		Father father = birthnotification2Service.getFatherById(fatherId);
		
		if (givenName != null) {
			father.setGivenName(givenName);
		}
		
		if (surname != null) {
			father.setSurname(surname);
		}
		
		if (nationalId != null) {
			father.setNationalId(nationalId);
		}
		
		if (age != 0) {
			father.setAge(age);
		}
		if (village != null) {
			father.setVillage(village);
		}
		if (subcounty != null) {
			father.setSubcounty(subcounty);
		}
		if (district != null) {
			father.setDistrict(district);
		}
	}
	
	public void get(PageModel model) {
		
	}
}
