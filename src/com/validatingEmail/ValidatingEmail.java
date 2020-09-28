package com.validatingEmail;

import java.util.*;
import java.util.regex.*;

public class ValidatingEmail {
	
	public static String isValidEmailId(String emailId) {
		String regex="^[a-zA-Z0-9]+[@][a-zA-Z0-9]+(.com)";
		Pattern pattern=Pattern.compile(regex);
		if(pattern.matcher(emailId).matches())
			return "correct";
		else
			return "wrong";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Email Valiadtion Program");

			System.out.println("Enter the email id:");
			Scanner scan=new Scanner(System.in);
			String email=scan.nextLine();
			
			System.out.println("The email id: "+email+" is "+isValidEmailId(email));
	}

}
