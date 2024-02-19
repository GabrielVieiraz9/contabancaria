package conta;

import conta.util.Cores; //conta.util é o pacote e Cores é a classe
import conta.model.Conta;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta1 = new Conta();
		conta1.setNumero(032);
		conta1.setAgencia(22);
		conta1.setTipo("Corrente");
		conta1.setTitular("Jessica");
		conta1.setSaldo(10000);
		
		System.out.println("Seu número: " + conta1.getNumero());
		System.out.println("Sua agência: " + conta1.getAgencia());
		System.out.println("Tipo de conta: " + conta1.getTipo());
		System.out.println("Seu nome: " + conta1.getTitular());
		System.out.println("Seu saldo: " + conta1.getSaldo());

		Cores.cores();
		
	}

}