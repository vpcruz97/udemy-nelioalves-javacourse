package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
	
		Account acc =  new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING -> Passar da subclasse para a superclasse
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING -> Converter objeto da superclasse para a subclass
		// BusinessAccount acc4 = acc2; // Erro: incompatibilidade de tipos
		BusinessAccount acc4 = (BusinessAccount)acc2; // Downcasting são manuais
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3; 
		// Não é possível converter subclasses para outras subclasses
		// O copilador não indentificado o erro, somente em tempo de execução

		
		// instanceof -> verifica que se o objeto é uma instancia de classe
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
