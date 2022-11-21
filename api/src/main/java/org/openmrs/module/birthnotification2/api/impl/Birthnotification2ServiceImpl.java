/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.birthnotification2.api.impl;

import java.util.List;

import org.openmrs.api.APIException;
import org.openmrs.api.UserService;
import org.openmrs.api.impl.BaseOpenmrsService;

import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.api.dao.Birthnotification2Dao;
import org.openmrs.module.birthnotification2.model.Baby;
import org.openmrs.module.birthnotification2.model.Father;
import org.openmrs.module.birthnotification2.model.Mother;

public class Birthnotification2ServiceImpl extends BaseOpenmrsService implements Birthnotification2Service {
	
	Birthnotification2Dao dao;
	
	UserService userService;
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setDao(Birthnotification2Dao dao) {
		this.dao = dao;
	}
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public Baby saveOrUpdate(Baby baby) throws APIException {
		return dao.saveOrUpdate(baby);
		
	}
	
	@Override
	public List<Baby> getAllBabies() throws APIException {
		return dao.getAllBabies();
		
	}
	
	@Override
	public void deleteBaby(Baby Baby) throws APIException {
		dao.deleteBaby(Baby);
		
	}
	
	@Override
	public Father saveOrUpdate(Father father) throws APIException {
		return dao.saveOrUpdate(father);
		
	}
	
	@Override
	public Father getFatherById(Integer fatherId) throws APIException {
		return dao.getFatherById(fatherId);
		
	}
	
	@Override
	public List<Father> getAllFathers() throws APIException {
		
		return dao.getAllFathers();
	}
	
	@Override
	public void deleteFather(Father father) throws APIException {
		dao.deleteFather(father);
		
	}
	
	@Override
	public Mother saveOrUpdate(Mother mother) throws APIException {
		return dao.saveOrUpdate(mother);
		
	}
	
	@Override
	public Mother getMotherById(Integer motherId) throws APIException {
		return dao.getMotherById(motherId);
		
	}
	
	@Override
	public List<Mother> getAllMothers() throws APIException {
		
		return dao.getAllMothers();
	}
	
	@Override
	public void delete(Mother mother) throws APIException {
		dao.delete(mother);
		
	}
	
	@Override
	public Baby getBabyById(Integer babyId) throws APIException {
		
		return dao.getBabyById(babyId);
	}
}
