package com.te.emp.service;

import com.te.emp.bean.EmployeeDetails;

public interface EmployeeService {
	public EmployeeDetails authenticate(int id,String password);

}
