package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Staff;

public class StaffDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akshay");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Staff saveStaff(Staff staff) {
		entityTransaction.begin();
		entityManager.persist(staff);
		entityTransaction.commit();
		System.out.println("Save successfully");
		return staff;
	}

	public Staff deleteStaff(int id) {
		Staff staff = entityManager.find(Staff.class, id);
		if (staff != null) {
			entityTransaction.begin();
			entityManager.remove(staff);
			entityTransaction.commit();
			System.out.println("Delete successfully");
		} else {
			System.out.println("Staff not exist");
		}
		return staff;
	}

	public Staff updateStaffName(int id, String name) {
		Staff staff = entityManager.find(Staff.class, id);
		if (staff != null) {
			staff.setName(name);
			entityTransaction.begin();
			entityManager.merge(staff);
			entityTransaction.commit();
			System.out.println("Name updated successfully");
		} else {
			System.out.println("Staff not exist");
		}
		return staff;
	}

	public Staff updateStaffEmail(int id, String email) {
		Staff staff = entityManager.find(Staff.class, id);
		if (staff != null) {
			staff.setEmail(email);
			entityTransaction.begin();
			entityManager.merge(staff);
			entityTransaction.commit();
			System.out.println("Email updated successfully");
		} else {
			System.out.println("Staff not exist");
		}
		return staff;
	}

	public Staff updateStaffJob(int id, String job) {
		Staff staff = entityManager.find(Staff.class, id);
		if (staff != null) {
			staff.setJob(job);
			entityTransaction.begin();
			entityManager.merge(staff);
			entityTransaction.commit();
			System.out.println("Job updated successfully");
		} else {
			System.out.println("Staff not exist");
		}
		return staff;
	}

	public Staff getStaff(int id) {
		Staff staff = entityManager.find(Staff.class, id);
		if (staff != null) {
			return staff;
		} else {
			System.out.println("staff not exist");
		}
		return null;
	}

	public List<Staff> getAllStaffs() {
		String sql = "Select s from StaffDto s";
		Query query = entityManager.createQuery(sql);
		List<Staff> staff =query.getResultList();
		return staff;
	}
}
