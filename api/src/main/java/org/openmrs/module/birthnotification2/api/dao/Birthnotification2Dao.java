/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.birthnotification2.api.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.openmrs.api.APIException;
import org.openmrs.api.db.hibernate.DbSession;
import org.openmrs.api.db.hibernate.DbSessionFactory;

import org.openmrs.module.birthnotification2.model.Baby;
import org.openmrs.module.birthnotification2.model.Father;
import org.openmrs.module.birthnotification2.model.Mother;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("birthnotification2.Birthnotification2Dao")
public class Birthnotification2Dao {
	
	@Autowired
	DbSessionFactory sessionFactory;
	
	private DbSession getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public Baby saveOrUpdate(Baby baby) throws APIException {
		
		getSession().saveOrUpdate(baby);
		return baby;
	}
	
	public Baby getBabyById(Integer babyId) throws APIException {
		return (Baby) getSession().get(Baby.class, babyId);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Baby> getAllBabies() throws APIException {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Baby.class);
		criteria.add(Restrictions.eq("voided", false));
		return criteria.list();
		
	}
	
	public void deleteBaby(Baby Baby) throws APIException {
		getSession().delete(Baby);
		
	}
	
	public Father saveOrUpdate(Father father) throws APIException {
		getSession().saveOrUpdate(father);
		return father;
		
	}
	
	public Father getFatherById(Integer fatherId) throws APIException {
		return (Father) getSession().get(Father.class, fatherId);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Father> getAllFathers() throws APIException {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Father.class);
		criteria.add(Restrictions.eq("voided", false));
		return criteria.list();
		
	}
	
	public void deleteFather(Father father) throws APIException {
		getSession().delete(father);
		
	}
	
	public Mother saveOrUpdate(Mother mother) throws APIException {
		getSession().saveOrUpdate(mother);
		return mother;
		
	}
	
	public Mother getMotherById(Integer motherId) throws APIException {
		
		return (Mother) getSession().get(Mother.class, motherId);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Mother> getAllMothers() throws APIException {
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Mother.class);
		criteria.add(Restrictions.eq("voided", false));
		return criteria.list();
		
	}
	
	public void delete(Mother mother) throws APIException {
		getSession().delete(mother);
	}
	
}
