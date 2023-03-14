package service;

import java.util.Random;

import employee.Employee;

public class CredentialService {
	
	public final String Company = "SS";
	
	public String generatePassword() {
		int length = 8;
		String Symbol = "!@#$%^&*_+/";
		String Caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Smalls = "abcdefghijklmnopqrstuvwxyz";
		String Numbers = "0123456789";
		String finalString = Caps+Smalls+Numbers+Symbol;
		Random random = new Random();
		char[] password = new char[length];
		for(int i =0;i<length;i++)
		{
			password[i] = finalString.charAt(random.nextInt(finalString.length()));
		}
		return password.toString();
	}
	
	public String generateEmail(Employee employee,String Department) {
		return employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+"@"+Department+"."+Company+".com";
	}
	public void ShowCredentials(Employee employee,String Department) {
		System.out.println("Dear "+employee.getFirstName()+" Your generated credentials are as follows");
		System.out.println("Email----->"+generateEmail(employee,Department));
		System.out.println("Password---->"+generatePassword());
	}
}
