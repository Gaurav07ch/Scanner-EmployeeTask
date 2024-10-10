package com.service;

import com.dao.DaoEmp;


public class ServiceEmp {

	DaoEmp dao = null;
	
	public void getallEmployee() throws Exception {
		dao = new DaoEmp();
		dao.getAllEmp();
	}
	
	public void insertEmployee() throws Exception {
		dao = new DaoEmp();
		dao.insertemp();
	}
	
	public void UpdateEmployee() throws Exception {
		dao = new DaoEmp();
		dao.updateEmp();
	}
	
	public void deleteEmp() throws Exception {
		dao = new DaoEmp();
		dao.DeleteEmp();
	}
}
