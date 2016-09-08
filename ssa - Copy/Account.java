package ssa;

// type of bank accounts
public class Account {
	
	int accountId;
	String description;
	int balance; //amount in the account at any time
	
	int deposit(int deposit) {
		balance = deposit + balance;
		return balance;
	}
	
	int withdraw(int withdraw) {
		if (withdraw > balance) { 
		System.out.println("Insufficent funds!");
		} else		
		balance = balance - withdraw;
		return balance;
	}

}
