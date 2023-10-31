package com.validate;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;


import com.customer_core.CustomerCore;
import com.customer_core.Serviceplan;
import com.exeption.CustomerExeption;
import com.exeption.EmailValidate;

public class ValidateInputs {
	public static LocalDate parseDate(String date) {
		LocalDate fg=LocalDate.parse(date);
		return fg;
	}
	public static Serviceplan parseplan(String plan) {
		Serviceplan psl=Serviceplan.valueOf(plan.toUpperCase());
		return psl;
	}
	public static String ValidateEmail(String email)throws CustomerExeption {
		
		
		 String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";

	        // Compile the regular expression into a Pattern
	        Pattern pattern = Pattern.compile(emailRegex);

	        // Match the given email against the pattern
	        Matcher matcher = pattern.matcher(email);
	        
	        if(matcher.matches()) {
	        	return email;
	        }
	        else {
	        	throw new CustomerExeption("Invalid Email !");
	        }
	        
	        	
	        
	}
	
//	public static void vaildateEmail(List<CustomerCore> cust,String email) throws CustomerExeption{
//		for(CustomerCore dem:cust) {
//			if(dem.getEmail()==email) {
//				throw new CustomerExeption("Email Already exists");
//			}
//		}
//	}
	public static CustomerCore vaildateAllInputs(String firstname, String lastname, String email, String password, double registrationAmount,
			String dob, String plan) throws CustomerExeption{
		email=ValidateEmail(email);
		Serviceplan sp=parseplan(plan);
		if(!(sp.getPlanCharges()==registrationAmount)) {
		throw new CustomerExeption("Plan amount and registration amount is not equal");
		
		}
		return new CustomerCore(firstname,lastname,email,password,registrationAmount,parseDate(dob),sp);
	}
}
