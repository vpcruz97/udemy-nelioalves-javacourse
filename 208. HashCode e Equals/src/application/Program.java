package application;

import entities.Client;

public class Program {
	public static void main(String[] args) {
		
		/*Anotações*/
		/*
		 * Metodo equals() -> Compara se dois elementos são estritamente(100%) iguais,
		 * mas é um método lento
		 * 
		 * Metodo hashCode() -> Gera um código muito rápido, mas sem precisão.
		 * Esse método raramente gera códigos diferentes para objetos iguais.
		 * 
		 * Geralmente utiliza-se o metodo hashCode() para procurar um elemento,
		 * e através do equals() verificar se os elementos são 100% iguais.
		 */
		
		Client c1 = new Client("Maria", "maria@mymail.com");
		Client c2 = new Client("Maria", "alex@mymail.com");
		
		System.out.println("HashCode");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	
		System.out.println("\nEquals");
		System.out.println(c1.equals(c2));
	}
}
