package com.te.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.emp.bean.EmployeeDetails;
import com.te.emp.dao.EmployeeDao;

@Service
public class EmployeeSeviceImpl implements EmployeeService{
   
	@Autowired
	EmployeeDao dao;
	@Override
	public EmployeeDetails authenticate(int id, String password) {
		if(id<0) {
			return null;
		}
		
		return dao.authenticate(id, password);
	}

}
