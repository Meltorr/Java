package br.estacio.pri.heranca.empresa;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private float salarioBase;
	private double imposto;
	
	//Construtores:
	public Empregado() {
		
	}
	
	//Getters e Setters:
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	
	//Métodos:
	public double calcularSalario() {
		return (double) this.salarioBase - this.imposto;
	}
	
}
