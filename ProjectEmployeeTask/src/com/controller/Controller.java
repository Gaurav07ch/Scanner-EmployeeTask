package com.controller;

import com.service.ServiceEmp;


public class Controller {
	
	ServiceEmp service = null;
	
	public void getallEmployee() throws Exception {
		service = new ServiceEmp();
		service.getallEmployee();
	}
	
	public void insertEmp() throws Exception {
		service = new ServiceEmp();
		service.insertEmployee();
	}
	
	public void UpdateEmp() throws Exception {
		service = new ServiceEmp();
		service.UpdateEmployee();
	}
	
	public void deleteEmp() throws Exception {
		service = new ServiceEmp();
		service.deleteEmp();
	}	
}
