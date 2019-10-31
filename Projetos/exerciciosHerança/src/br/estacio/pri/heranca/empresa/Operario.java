package br.estacio.pri.heranca.empresa;

public class Operario extends Empregado{
	private float valorProducao;
	private double comissao;
	
	//Construtores:
	public Operario() {
	}
	
	
	//Getters e setters:
	public float getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	//M�todos:
	public double calcularSalario() {
		return super.calcularSalario() + comissao;
	}
	
}
