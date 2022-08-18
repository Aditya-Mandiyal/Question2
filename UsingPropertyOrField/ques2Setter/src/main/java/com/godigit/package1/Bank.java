package com.godigit.package1;


public class Bank {

	private Manager manager1;
	private int noOfClerks;
	private String bankName;
	public void welcomeNote() {
		System.out.println("Welcome in "+bankName);
	}
	
	
	
	public String getBankName() {
		return bankName;
	}



	public void setBankName(String bankName) {
		this.bankName = bankName;
	}



	public Manager getManager1() {
		return manager1;
	}
	public void setManager1(Manager manager1) {
		this.manager1 = manager1;
	}
	public int getNoOfClerks() {
		return noOfClerks;
	}
	public void setNoOfClerks(int noOfClerks) {
		this.noOfClerks = noOfClerks;
	}
	
	
	
}
