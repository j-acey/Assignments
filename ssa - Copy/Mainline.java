package ssa;

public class Mainline {

	public static void main(String[] args) {
		
		Account checking = new Account();
		checking.accountId = 100;
		checking.description = "my personal checking account";
		checking.balance = 500;
		System.out.println("My checking account id is " + checking.accountId + ", for " + checking.description + " with a current balance of " + checking.balance);
		System.out.println("I deposit 200 and my new balance is " + checking.deposit(200));
		System.out.println("I withdrew 600 and my new balance is " + checking.withdraw(600));
		checking.deposit(100);
		checking.withdraw(300);
		// 200 - 300, should display "Insufficient funds!"
		System.out.println("I withdraw 200 and my new balance is " + checking.withdraw(200) + "\n");

		
		Account savings = new Account();
		savings.accountId = 200;
		savings.description = "my personal savings account";
		savings.balance = 1000;
		System.out.println("My savings account id is " + savings.accountId + ", for " + savings.description + " with a current balance of " + savings.balance);
		System.out.println("I withdrew 750 and my new balance is " + savings.withdraw(750));
		System.out.println("I withdrew 250 and my new balance is " + savings.withdraw(250));
		System.out.println("I deposit 200 and my new balance is " + savings.deposit(200) + "\n");
		// final print of both accounts' details
		System.out.println("My savings account balance is " + savings.balance + "\n" + "My checking account balance is " + checking.balance);
	}

}
