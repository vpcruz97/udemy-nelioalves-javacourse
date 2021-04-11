package model.services;

public abstract class Contribuinte {
	
	private String nome;
	private Double rendaAnual;
	private Double taxaDeImpostos;
	
	public Contribuinte(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public Double getTaxaDeImpostos() {
		return taxaDeImpostos;
	}

	public void setTaxaDeImpostos(Double taxaDeImpostos) {
		this.taxaDeImpostos = taxaDeImpostos;
	}
	
	public abstract Double taxa();
}
