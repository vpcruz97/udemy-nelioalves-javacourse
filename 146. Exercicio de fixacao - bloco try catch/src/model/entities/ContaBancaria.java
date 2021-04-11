package model.entities;

import model.exceptions.ContaException;

public class ContaBancaria {
	private Integer numeroDaConta;
	private String titular;
	private Double saldo;
	private Double limiteDeSaque;

	public ContaBancaria(Integer numeroDaConta, String titular, Double saldo, Double limiteDeSaque) {
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public void depositar(Double quantia) {
		saldo += quantia;
	}
	
	public void saque(Double quantia) throws ContaException{
		if(saldo <= 0) {
			throw new ContaException("Não é possível sacar quando o saldo é igual ou menor que 0");
		}
		
		if(quantia > saldo) {
			throw new ContaException("Não é possível sacar um valor inexistente na conta.");
		}
		
		if(quantia > limiteDeSaque) {
			throw new ContaException("Não é possível sacar uma quantia maior que seu limite de saque.");
		}
		
		this.saldo -= quantia;
	}
}
