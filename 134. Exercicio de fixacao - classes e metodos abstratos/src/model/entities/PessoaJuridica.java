package model.entities;

import model.services.Contribuinte;

public class PessoaJuridica extends Contribuinte {
	private Integer numeroDeFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double taxa() {
		if(numeroDeFuncionarios > 10) {
			return super.getRendaAnual() * 0.14;
		} else {
			return super.getRendaAnual() * 0.16;
		}
	}

	@Override
	public String toString() {
		return super.getNome() + ": $ " + String.format("%.2f", taxa());
	}
}
