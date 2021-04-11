package model.entities;

import model.services.Contribuinte;

public class PessoaFisica extends Contribuinte {
	private Double gastosDeSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosDeSaude) {
		super(nome, rendaAnual);
		this.gastosDeSaude = gastosDeSaude;
	}

	@Override
	public Double taxa() {
		double rendaCalculada;
		double gastosCalculados = 0;
		
		if (super.getRendaAnual() < 20000.0) {
			rendaCalculada = super.getRendaAnual() * 0.15;
		}
		else {
			rendaCalculada = super.getRendaAnual() * 0.25;
		}
		
		if(gastosDeSaude > 0) {
			gastosCalculados = gastosDeSaude * 0.5;
		}
		return rendaCalculada - gastosCalculados;	
	}

	@Override
	public String toString() {
		return super.getNome() + ": $ " + String.format("%.2f", taxa());
	}
	
	
}	
