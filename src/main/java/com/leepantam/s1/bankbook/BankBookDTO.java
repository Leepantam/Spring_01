package com.leepantam.s1.bankbook;

public class BankBookDTO {
	private int account_number;
	private String account_name;
	private double interest_rate;
	private String can_make;
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public double getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(double interest_rate) {
		this.interest_rate = interest_rate;
	}
	public String getCan_make() {
		return can_make;
	}
	public void setCan_make(String can_make) {
		this.can_make = can_make;
	}
	
	
	
	
}
