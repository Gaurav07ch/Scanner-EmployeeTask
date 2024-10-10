package com.client;

import java.util.Scanner;

import com.controller.Controller;

public class ClientEmp {

	public static void main(String[] args) throws Exception {

		Controller cont = new Controller();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("**********Welcome to Employee Management System...**************");
			System.out.println(
					"\n1. See Employee\n2. Insert Employee \n3. Update Employee \n4. Delete Employee\n5. Exit");
			System.out.println("****************************************************************************");
			System.out.println("Enter the choice : ");
			System.out.println("****************************************************************************");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				cont.getallEmployee();
				break;

			case 2:
				cont.insertEmp();
				break;
				
			case 3:
				cont.UpdateEmp();
				break;

			case 4:
				cont.deleteEmp();
				break;

			default:
				System.exit(0);

			}
		}
	}

}
