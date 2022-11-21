package org.openmrs.module.birthnotification2.fragment.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Baby;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class UpdateBabyFragmentController {
	
	Birthnotification2Service birthnotification2Service;
	
	public void post(PageModel model, HttpSession session, @RequestParam(required = true, value = "babyId") Integer babyId,
	        @RequestParam(required = true, value = "givenName") String givenName,
	        @RequestParam(required = true, value = "dateOfBirth") Date dateOfBirth,
	        @RequestParam(required = true, value = "facility") String facility,
	        @RequestParam(required = true, value = "weightAtBirth") int weightAtBirth,
	        @RequestParam(required = true, value = "gender") String gender,
	        @RequestParam(required = true, value = "district") String district,
	        @RequestParam(required = true, value = "village") String village
	
	) {
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		Baby baby = birthnotification2Service.getBabyById(babyId);
		
		if (givenName != null) {
			baby.setGivenName(givenName);
		}
		
		if (dateOfBirth != null) {
			baby.setDateOfBirth(dateOfBirth);
		}
		
		if (facility != null) {
			baby.setFacility(facility);
		}
		
		if (weightAtBirth != 0) {
			baby.setWeightAtBirth(weightAtBirth);
			
		}
		
		if (gender != null) {
			baby.setGender(gender);
			
		}
		
		if (district != null) {
			baby.setDistrict(district);
			
		}
		
		if (village != null) {
			baby.setVillage(village);
		}
		
	}
	
	public void get(PageModel model) {
		
	}
}
