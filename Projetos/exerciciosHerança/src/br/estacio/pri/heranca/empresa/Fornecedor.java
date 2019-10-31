package br.estacio.pri.heranca.empresa;

public class Fornecedor extends Pessoa{
	private float valorCredito;
	private float valorDivida;
	
	//Construtores:
	public Fornecedor(){
		
	}

	
	//Getters e Setters:
	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	public float getValorCredito() {
		return this.valorCredito;
	}
	
	
	
	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public float getValorDivida() {
		return this.valorDivida;
	}
	
	
	
	//Métodos:
	public float obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}
}
