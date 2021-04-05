package entities;

import entities.enums.Color;

public abstract class Shape {
	/*
	 * Classes abstratas não podem ser instanciadas e servem como contratados.
	 * Os contratos são "regras" a serem seguidas pelas classes que extendem da mesma.
	 */
	
	private Color color;

	public Shape() {};
		
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
	/*
	 * Um metódo abstrato somente é declarado, 
	 * não podendo conter operações dentro de uma classe abstrata.
	 * 
	 * Cada subclasse que extende uma classe abstrata, 
	 * poderá usar os métodos abstratos com suas próprias 
	 * regras de negócios. 
	 * */
}
