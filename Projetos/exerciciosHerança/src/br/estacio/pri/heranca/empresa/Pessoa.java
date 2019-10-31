package br.estacio.pri.heranca.empresa;

public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	
	//Construtores:
	public Pessoa(){
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return this.endereco;
	}
	
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
}
