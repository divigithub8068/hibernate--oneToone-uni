package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TesSaveBranchAddress {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Branch branch = new Branch();
		branch.setName("BTR Appolo");
		branch.setState("Karnataka");
		branch.setCountry("India");
		branch.setPhone(98765432);
		
		
		Address address = new Address();
		address.setName("BTR");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPinCode(566102);
		
		branch.setAddress(address);
		
		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(address);
		entityTransaction.commit();
	}
}
