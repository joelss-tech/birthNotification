package org.openmrs.module.birthnotification2.fragment.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.ui.framework.fragment.FragmentModel;

public class BabyFragmentController {
	
	public void controller(FragmentModel model) {
		Birthnotification2Service bService = Context.getService(Birthnotification2Service.class);
		model.addAttribute("baby", bService.getAllBabies());
		
	}
	
}
