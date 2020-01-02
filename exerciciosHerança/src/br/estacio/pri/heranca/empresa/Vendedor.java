package br.estacio.pri.heranca.empresa;

public class Vendedor extends Empregado{
	private float valorVendas;
	private double comissao;
	
	//Construtores:
	public Vendedor(){
		
	}
	
	//Getters e Setters:
	public float getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	//Métodos:
	public double calcularSalario(){
		return super.calcularSalario() + this.comissao;
	}
}
