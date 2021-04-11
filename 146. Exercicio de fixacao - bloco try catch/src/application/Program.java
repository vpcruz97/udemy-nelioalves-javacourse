package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.ContaBancaria;
import model.exceptions.ContaException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Insira os dados da conta: ");
			System.out.print("Número: ");
			int numeroDaConta = sc.nextInt();
			
			System.out.print("Titular: ");
			String titular = sc.next();
			
			System.out.print("Saldo inicial: ");
			double saldoInicial = sc.nextDouble();
			
			System.out.print("Limite de saque: ");
			double limiteDeSaque = sc.nextDouble();
			
			ContaBancaria conta = new ContaBancaria(numeroDaConta, titular, saldoInicial, limiteDeSaque);
			
			System.out.print("Entre com a quantia para sacar: ");
			double quantia = sc.nextDouble();
			
			conta.saque(quantia);
			System.out.print("Saldo atual: " + String.format("%.2f", conta.getSaldo()));
		}
		catch (InputMismatchException e) {
			System.out.println("Valor não suportado.");
		}
		catch (ContaException e){
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			System.out.println("\n === Fim do Programa ===");
		}
		
		
	}

}
