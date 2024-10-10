package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DaoEmp {
	Scanner sc = new Scanner(System.in);
	String path = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3307/newemployee";
	String uname = "root";
	String pwd = "root";

	Connection conn = null;

	String query = "SELECT * FROM employee";
	String updatequery = "UPDATE employee SET  name =?, department=?, salary=?, hiringdate=?, address=? WHERE id =? ";
	String insertquery = "INSERT INTO employee (id, name, department, salary, hiringdate, address)VALUES (?,?,?,?,?,?)";
	String Deletequery = "DELETE FROM employee WHERE id = ?";

	public void getAllEmp() throws Exception {

		Class.forName(path);

		conn = DriverManager.getConnection(url, uname, pwd);

		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt("id") + rs.getString("name") + rs.getString("department") + rs.getInt("salary")
					+ rs.getString("hiringdate") + rs.getString("address"));
		}

	}

	public void insertemp() throws Exception {

		System.out.println("Enter emp id");
		int id = sc.nextInt();

		System.out.println("Enter emp name");
		String name = sc.next();

		System.out.println("Enter emp Department");
		String department = sc.next();

		System.out.println("Enter emp salary");
		int salary = sc.nextInt();

		System.out.println("Enter emp dd-mm-yyyy");
		String hiringdate = sc.next();

		System.out.println("Enter emp Address");
		String address = sc.next();

		Class.forName(path);

		conn = DriverManager.getConnection(url, uname, pwd);
		PreparedStatement ps = conn.prepareStatement(insertquery);

		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, department);
		ps.setInt(4, salary);
		ps.setString(5, hiringdate);
		ps.setString(6, address);

		int rs = ps.executeUpdate();

		if (rs > 0)
			System.out.println("Data Successful Inserted....");
		else
			System.err.println("Failed...");
		System.out.println("****************************************************************************");
	}
	

	public void updateEmp() throws Exception {

		System.out.println("Enter emp id");
		int id = sc.nextInt();

		System.out.println("Enter emp name");
		String name = sc.next();

		System.out.println("Enter emp Department");
		String department = sc.next();

		System.out.println("Enter emp salary");
		int salary = sc.nextInt();

		System.out.println("Enter emp dd-mm-yyyy");
		String hiringdate = sc.next();

		System.out.println("Enter emp Address");
		String address = sc.next();

		Class.forName(path);

		conn = DriverManager.getConnection(url, uname, pwd);
		PreparedStatement ps = conn.prepareStatement(updatequery);

		ps.setString(1, name);
		ps.setString(2, department);
		ps.setInt(3, salary);
		ps.setString(4, hiringdate);
		ps.setString(5, address);
		ps.setInt(6, id);

		int rs = ps.executeUpdate();
		if (rs > 0)
			System.out.println("Data Successfully Updated....");
		else
			System.err.println("Failed to Update Data....");
		System.out.println("****************************************************************************");
	}

	public void DeleteEmp() throws Exception {

		System.out.println("Enter Employee id : ");
		int id = sc.nextInt();

		Class.forName(path);
		Connection conn = DriverManager.getConnection(url, uname, pwd);

		PreparedStatement ps = conn.prepareStatement(Deletequery);

		ps.setInt(1, id);

		int rs = ps.executeUpdate();

		if (rs > 0)
			System.out.println("Data is Deleted...");
		else
			System.out.println("Data is not Deleted...");
		System.out.println("****************************************************************************");
	}
}
