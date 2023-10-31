package com.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.customer_core.*;
import com.exeption.EmailValidate;
import com.validate.ValidateInputs;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			List<CustomerCore> cust=new ArrayList<>();
			boolean status= false;
			while(!status){
			try{
				System.out.println("1.Sign up 2.Sign in 3.Change Password 4.Display Customer 5.Exit");
			switch(sc.nextInt())
			{
			case 1:
				//String firstname, String lastname, String email, String password, double registrationAmount,
				//String dob, String plan
				//System.out.println("firstname, lastname, email,  password, registrationAmount,dob(yyyy-MM-dd), plan");
				System.out.println("firstname, lastname, email,  password, registrationAmount,dob(yyyy-MM-dd), plan");
				CustomerCore cc = ValidateInputs.vaildateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
				cust.add(cc);
				System.out.println(cc);
				System.out.println(cust);
				break;
			case 2:
				System.out.println("Enter Your Email");
				String email=ValidateInputs.ValidateEmail(sc.next());
					System.out.println("Enter Your Password");
					String passCode=sc.next();
					boolean flag =false;
					for(CustomerCore customer : cust) {
						if(customer.getEmail().equals(email) && customer.getPassword()==(passCode)) {
							System.out.println("Login successfully");
						}
					}
						
				
				
				
				
//				boolean flag =false;
//				for(CustomerCore customer : cust) {
//					
//				}
//					if(cust.contains(dfa)) {
//						System.out.println("Login successfully");
//					}
				
				break;
			case 3:
				break;
			case 4:
				for(CustomerCore f:cust){
						System.out.println(f);
				}
				break;
			}
		}catch(Exception e) {
			
			}
			
		}
		}
	}

}
