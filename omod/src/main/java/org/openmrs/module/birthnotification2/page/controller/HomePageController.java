package org.openmrs.module.birthnotification2.page.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.openmrs.api.ConceptService;
import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.model.Baby;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class HomePageController {
	
	Birthnotification2Service birthnotification2Service;
	
	ConceptService conceptService;
	
	public void post(PageModel pageModel, HttpSession session,
	        @RequestParam(required = true, value = "givenName") String givenName,
	        @RequestParam(required = true, value = "dateOfBirth") Date dateOfBirth,
	        @RequestParam(required = true, value = "facility") String facility,
	        @RequestParam(required = true, value = "weightAtBirth") int weightAtBirth,
	        @RequestParam(required = true, value = "gender") String gender,
	        @RequestParam(required = true, value = "district") String district,
	        @RequestParam(required = true, value = "village") String village
	
	) {
		
		birthnotification2Service = Context.getService(Birthnotification2Service.class);
		
		Baby baby = new Baby();
		baby.setDateOfBirth(dateOfBirth);
		baby.setGivenName(givenName);
		baby.setGender(gender);
		baby.setDistrict(district);
		baby.setVoided(false);
		baby.setVillage(village);
		baby.setFacility(facility);
		baby.setWeightAtBirth(weightAtBirth);
		
		birthnotification2Service.saveOrUpdate(baby);
	}
	
	public void get(PageModel model) {
		
	}
	
}
