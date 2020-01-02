package br.estacio.pri.heranca.empresa;

public class GabrirnaTeste {
	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor();	
		
		f1.setNome("Gabriel");
		f1.setEndereco("Rua Álvares Cabral, 943");
		f1.setTelefone("(85) xxxx-xxxx");
		
		f1.setValorCredito(1500f);
		f1.setValorDivida(1000f);
		
		System.out.println("Método obter saldo: " + f1.obterSaldo());
		System.out.println("Nome: " + f1.getNome());
	
	
	
	
	
	
	}
}
