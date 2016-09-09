package ssa;

import java.text.NumberFormat;

public class Account {
	
	
	private int id;
	private String description;
	private double balance; //amount in the account at any time
	static int acctTrack =100;
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	double deposit(double deposit) {
		this.balance += deposit ;
			return this.balance;
	}
	
	double withdraw(double withdraw) {
		if (withdraw < this.balance){
			this.balance -= withdraw;
		   return this.balance;
			
		     
		}else
		{		
			System.out.println("Insufficent funds!");
			return this.balance;
		}
	} 
	
	// The Transfer Method
	public void transferFrom(Account account, double amount) {
		if (account.balance > amount) { 
		    account.withdraw(amount);
		    this.deposit(amount);
		} else	
				System.out.println("Transfer Fail!");
	}
	
	// Print Method
	public String print() {
		return ("Account " + this.id + " balance is " + fmt.format(this.balance));
	}
	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	 void setId(int id) {
		this.id = id;
	}
	
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	private void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @param balance
	 */

	
	
	
	// The class should allow new instances to be created in multiple ways.
	// #1
	public Account() {
		this.balance = 0;
		this.id = acctTrack;
		acctTrack += 100;
	}
	// #2
	public Account(int id, String description) {
		this.balance = 0;
		this.id = id;
		this.description = description;
	}
	// #3
	public Account(String description) {
		this.balance = 0;
		this.description = description; 
		this.id = acctTrack;
		acctTrack += 100;
	}
	
	// #4
	public Account(double balance) {
		this.balance = balance;
		this.description = "sjdgsdg"; 
		this.id = acctTrack;
		acctTrack += 100;
	}
	// #4
//	public Account(int id) {
//	}
	
}
	
	

