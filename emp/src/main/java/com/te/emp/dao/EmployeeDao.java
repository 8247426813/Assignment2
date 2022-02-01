package com.te.emp.dao;

import com.te.emp.bean.EmployeeDetails;

public interface EmployeeDao {
public EmployeeDetails authenticate(int id,String password);
}
