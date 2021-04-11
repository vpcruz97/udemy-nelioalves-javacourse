package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.PessoaFisica;
import model.entities.PessoaJuridica;
import model.services.Contribuinte;

public class Program {

	public static void main(String[] args) {
		List<Contribuinte> contribuintes = new ArrayList<>();
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com o numero de contribuintes: ");
		int numeroDeContribuidores = input.nextInt();
		
		for(int i = 1; i <= numeroDeContribuidores; i++) {
			System.out.println("\nContribuinte #" + i + ": ");
			System.out.print("Pessoa Fisica ou Juridica (f/j)? ");
			char ch = input.next().toLowerCase().charAt(0);
			
			System.out.print("Nome: ");
			String nome = input.next();
			
			System.out.print("Renda Anual: ");
			double rendaAnual = input.nextDouble();
			
			if(ch == 'f') {
				System.out.print("Gastos de Saude: ");
				double gastosDeSaude = input.nextDouble();
				contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosDeSaude));
			} 
			else if (ch == 'j') {
				System.out.print("Numero de Funcionarios: ");
				int numeroDeFuncionarios = input.nextInt();
				contribuintes.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
			}
			else {
				System.out.print("Opção inválida");
			}
		}
		
		System.out.println("\nTaxas Recolhidas: ");
		for(Contribuinte contribuinte : contribuintes) {
			System.out.println(contribuinte);
		}
		
		System.out.println("\nTotal de Taxas: ");
		double total = 0;
		for(Contribuinte contribuinte : contribuintes) {
			total += contribuinte.taxa();
		}
		System.out.println("Total: " + String.format("%.2f", total));
	}
}
