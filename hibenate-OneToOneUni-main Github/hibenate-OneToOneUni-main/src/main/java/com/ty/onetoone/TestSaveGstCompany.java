package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveGstCompany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Company company = new Company();
		company.setName("KaruNadu Software Solution");
		company.setPhone(965432345);
		company.setWeb("Karunadu.com");
		
		Gst gst = new Gst();
		gst.setGstNumber("INKAKSS123");
		gst.setState("Karnataka");
		gst.setCountry("India");
		
		gst.setCompany(company);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit(); 
	}
}
