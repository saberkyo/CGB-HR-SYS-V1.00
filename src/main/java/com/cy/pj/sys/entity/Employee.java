package com.cy.pj.sys.entity;

import java.util.Date;

import lombok.Data;
@Data
public class Employee {
	private Integer id;
	private Integer employeeNumber;
	private String name;
	private String gender;
	private Date birthday;
	private String telephone;
	private String email;
	private String address;
	private String photo;
	private String education;
	private Integer departmentNumber;
	private Integer positionNumber;
	private Date inTime;
	private String password;
	private String notes;
}
