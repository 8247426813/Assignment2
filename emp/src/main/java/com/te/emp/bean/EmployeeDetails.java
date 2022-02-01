package com.te.emp.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EmployeeDetails implements Serializable {

	@Id
	private int id;
	
	private String name;
	private String address;
	private String password;
}
