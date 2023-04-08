package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetBranchAddress {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Branch branch = entityManager.find(Branch.class, 1);
		if (branch != null) {
			System.out.println("Branch Id  :" + branch.getId());
			System.out.println("Branch Name  :" + branch.getName());
			System.out.println("Branch State  :" + branch.getState());
			System.out.println("Branch Country  :" + branch.getCountry());
			System.out.println("Branch Phone  :" + branch.getPhone());
			System.out.println("-------------------------------------------");
			Address address = branch.getAddress();
			if (address != null) {
				System.out.println("Address Id  :" + address.getId());
				System.out.println("Address Name :" + address.getName());
				System.out.println("Address State  :" + address.getState());
				System.out.println("Address Country  :" + address.getCountry());
				System.out.println("Address PinCode  :" + address.getPinCode());
			} else {
				System.out.println("No Address is found");
			}
		} else {
			System.out.println("No data is found");
		}

	}
}
