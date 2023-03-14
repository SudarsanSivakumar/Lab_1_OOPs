package main;

import service.CredentialService;

import employee.Employee;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HR");
		System.out.println("4.Legal");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		Employee employee = new Employee("Sudarsan","Sivakumar");
		CredentialService cs = new CredentialService();
		switch(user){
			
			case 1: cs.ShowCredentials(employee,"tech");
			break;
			case 2: cs.ShowCredentials(employee,"admin");
			break;
			case 3: cs.ShowCredentials(employee,"Hr");
			break;
			case 4: cs.ShowCredentials(employee,"legal");
			break;
			default:
				System.out.println("invalid input");
				
			
		}
		sc.close();

	}

}
