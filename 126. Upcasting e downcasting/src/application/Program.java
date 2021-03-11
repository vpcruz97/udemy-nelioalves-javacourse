package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
	
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200);
		System.out.println(acc1.getBalance()); // Metodo sem sobreposicao
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200);
		System.out.println(acc2.getBalance()); // Metodo com sobreposicao na classe SavingsAccount

		Account acc3 = new BusinessAccount(1003, "Mario", 1000.0, 500.0);
		acc3.withdraw(200);
		System.out.println(acc3.getBalance()); 
		
	}
}
