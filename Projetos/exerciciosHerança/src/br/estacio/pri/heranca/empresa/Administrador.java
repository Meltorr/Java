package br.estacio.pri.heranca.empresa;

public class Administrador extends Empregado{
	private float ajudaDeCusto;

	//Construtores;
	public Administrador(){
		
	}
	//Getters e Setters:
	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	//public double calcularSalario() {
		//return ((double) this.getSalarioBase() - this.getImposto()) + this.ajudaDeCusto;
	//}
	
	public double calcularSalario() {
		return super.calcularSalario() + ajudaDeCusto;
	}
}
