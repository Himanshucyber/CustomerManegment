package com.exeption;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidate {

	public static boolean isValidateEmail(String email)throws CustomerExeption {
		
		
		 String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";

	        // Compile the regular expression into a Pattern
	        Pattern pattern = Pattern.compile(emailRegex);

	        // Match the given email against the pattern
	        Matcher matcher = pattern.matcher(email);
	        
	        if(matcher.matches()) {
	        	return true;
	        }
	        else {
	        	return false;
	        }
	        
	        	
	        
	}
}
