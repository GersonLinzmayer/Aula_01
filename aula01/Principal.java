package aula01;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente_01 = new Cliente ("02850435902", 1980, "Marcos da Rocha Souza", "mr_souza@gmail.com");
		
		/*
		//também funciona e faz a mesma coisa
		Cliente cliente_01 = new Cliente();
		cliente_01.cpf = "02850435902";
		cliente_01.anoNascimento = 1980;
		cliente_01.nome = "Marcos da Rocha Souza";
		cliente_01.email = "mr_souza@gmail.com";*/
		
		
		Conta conta_01 = new Conta (1521, 750.63f);
		
		
		
		
	}
	
}
