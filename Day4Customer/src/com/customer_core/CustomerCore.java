package com.customer_core;
import java.time.LocalDate;

public class CustomerCore {
	private int customerid;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private Serviceplan plan;
	private static int idGenrator = 4030;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Serviceplan getPlan() {
		return plan;
	}

	public void setPlan(Serviceplan plan) {
		this.plan = plan;
	}

	public CustomerCore(String firstname, String lastname, String email, String password, double registrationAmount,
			LocalDate dob, Serviceplan plan) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		this.idGenrator += 3;

	}
/* @Override
 public boolean equals(Object obj) {
	 if(obj instanceof Customer_core) {
		 Customer_core other=(Customer_core)obj;	 
	return this.email.equals(other.email);
 
 }
	 return false;
}*/

public CustomerCore(String email) {
		
		this.email = email;
	}

@Override
public String toString() {
	return "Customer_core [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname
			+ ", email=" + email + ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob="
			+ dob + ", plan=" + plan + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CustomerCore other = (CustomerCore) obj;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!this.email.equals(other.email))
		return false;
	return true;
}

public CustomerCore getCustomer(String email,list<>) {
	
}


}

