/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.birthnotification2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import org.openmrs.module.birthnotification2.api.Birthnotification2Service;
import org.openmrs.module.birthnotification2.api.dao.Birthnotification2Dao;
import org.openmrs.module.birthnotification2.api.impl.Birthnotification2ServiceImpl;
import org.openmrs.module.birthnotification2.model.Baby;
import org.openmrs.module.birthnotification2.model.Father;
import org.openmrs.module.birthnotification2.model.Mother;

import static org.mockito.Mockito.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This is a unit test, which verifies logic in Birthnotification2Service. It doesn't extend
 * BaseModuleContextSensitiveTest, thus it is run without the in-memory DB and Spring context.
 */
public class Birthnotification2ServiceTest {
	
	@InjectMocks
	Birthnotification2ServiceImpl basicModuleService;
	
	@Mock
	Birthnotification2Dao dao;
	
	@Mock
	Birthnotification2Service service;
	
	@Before
	public void setupMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void saveItem_shouldSetOwnerIfNotSet() {
		
	}
	
	@Test
	public void should_saveBaby() {
		//given
		Baby baby = new Baby();
		baby.setDistrict("luwero");
		baby.setFacility("luwerohospital");
		baby.setGender("female");
		baby.setGivenName("praise");
		baby.setVillage("mordern");
		baby.setWeightAtBirth(3);
		when(dao.saveOrUpdate(baby)).thenReturn(baby);
		
		service.getBabyById(1);
		
		//When
		basicModuleService.saveOrUpdate(baby);
		
		//Then
		Assert.assertEquals("", "luwero", baby.getDistrict());
		Assert.assertEquals("", "luwerohospital", baby.getFacility());
		Assert.assertEquals("", "female", baby.getGender());
		Assert.assertEquals("", "mordern", baby.getVillage());
		Assert.assertEquals("", "praise", baby.getGivenName());
		Assert.assertEquals("", 3, baby.getWeightAtBirth());
	}
	
	@Test
	public void should_getdateOfBirth() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date = (Date) sdf.parse("11-02-2006 04:35:12");
		Baby baby = new Baby();
		baby.setDateOfBirth(date);
		
		Assert.assertEquals("", date, baby.getDateOfBirth());
		
	}
	
	@Test
	public void should_deleteBaby() {
		Baby baby = new Baby();
		baby.getId();
		service.deleteBaby(baby);
		Assert.assertEquals(baby.getGivenName(), null);
		
	}
	
	@Test
	public void should_saveFather() {
		//given
		
		Father father = new Father();
		
		father.setSurname("lubo");
		father.setAge(26);
		father.setGivenName("sozi");
		father.setNationalId("Cm000");
		father.setSubcounty("katikamu");
		father.setVillage("katikamu");
		father.setDistrict("luwero");
		when(dao.saveOrUpdate(father)).thenReturn(father);
		
		service.getFatherById(1);
		
		//When 
		basicModuleService.saveOrUpdate(father);
		
		//then
		Assert.assertEquals("", "luwero", father.getDistrict());
		Assert.assertEquals("", "katikamu", father.getVillage());
		Assert.assertEquals("", "katikamu", father.getSubcounty());
		Assert.assertEquals("", "Cm000", father.getNationalId());
		Assert.assertEquals("", "sozi", father.getGivenName());
		Assert.assertEquals("", "lubo", father.getSurname());
		Assert.assertEquals("", 26, father.getAge());
		
	}
	
	@Test
	public void should_deleteFather() {
		
		Father father = new Father();
		father.getId();
		
		service.deleteFather(father);
		Assert.assertEquals(father.getGivenName(), null);
		
	}
	
	@Test
	public void should_saveMother() {
		//given
		Mother mother = new Mother();
		mother.setAge(20);
		mother.setDistrict("luwero");
		mother.setGivenName("nasozi");
		mother.setNationalId("Cf000");
		mother.setSurname("jovi");
		mother.setParity(3);
		mother.setVillage("modern");
		mother.setSubcounty("katikamu");
		
		service.getMotherById(1);
		
		//when
		
		basicModuleService.saveOrUpdate(mother);
		
		//then
		
		Assert.assertEquals("message", "luwero", mother.getDistrict());
		Assert.assertEquals("katikamu", "katikamu", mother.getSubcounty());
		Assert.assertEquals("message", 20, mother.getAge());
		Assert.assertEquals("message", 3, mother.getParity());
		Assert.assertEquals("message", "nasozi", mother.getGivenName());
		Assert.assertEquals("message", "jovi", mother.getSurname());
		Assert.assertEquals("message", "modern", mother.getVillage());
		Assert.assertEquals("message", "Cf000", mother.getNationalId());
		
	}
	
	@Test
	public void should_deleteMother() {
		Mother mother = new Mother();
		mother.getId();
		
		service.delete(mother);
		
		Assert.assertEquals(mother.getGivenName(), null);
		
	}
	
}
