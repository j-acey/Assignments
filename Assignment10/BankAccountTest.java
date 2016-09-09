package ssa;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class BankAccountTest {

 
Account account;
Account account2;

@Before

//Each test is ran against the default data directly below: 
public void asetup() {
		account = new Account(300.0);
		account2 = new Account(450.0);
		account.setDescription("Test description for account");
		account.setId(125);
		System.out.println("first");
}


@Test
public void testA() {
			this.account.deposit(200.0);
		assertEquals(500, account.getBalance(),0);
		System.out.println("two");
}
@Test
public void testB() {
	
		assertEquals(100, account.withdraw(200),0);
		System.out.println("three");
}
@Test
public void testC() {
	
		assertEquals(125, account.getId());
		System.out.println("four");
}
@Test
public void testD() {

		assertEquals("Test description for account", account.getDescription());
		System.out.println("five");
}
@Test
public void testE() {

		account.transferFrom(account2, 150.0);
		assertEquals(300, account2.getBalance(),0);
		assertEquals(450, account.getBalance(),0.0);
		System.out.println("six");
	  
}	
}
