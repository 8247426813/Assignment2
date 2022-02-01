package com.te.emp.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.emp.bean.EmployeeDetails;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public EmployeeDetails authenticate(int id, String password) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("unit01");
		EntityManager manager=factory.createEntityManager();
		EmployeeDetails details=manager.find(EmployeeDetails.class,id);
		if(details!=null) {
			if(details.getPassword().equals(password)) {
				return details;
			}
		}
		
		return null;
	}


}
