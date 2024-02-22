package conta;

import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String opcao;
		
		// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
        // Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
        cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*".repeat(53));
		System.out.println(" ".repeat(53));
		System.out.println(" ".repeat(16) + "BANCO DO BRAZIL COM Z" + " ".repeat(16));
		System.out.println(" ".repeat(53));
		System.out.println("*".repeat(53));
		System.out.println(" ".repeat(53));
		System.out.println(" ".repeat(12) + "1 - Criar Conta" + " ".repeat(26));
		System.out.println(" ".repeat(12) + "2 - Listar todas as Contas" + " ".repeat(15));
		System.out.println(" ".repeat(12) + "3 - Buscar Conta por Numero" + " ".repeat(14));
		System.out.println(" ".repeat(12) + "4 - Atualizar Dados da Conta" + " ".repeat(13));
		System.out.println(" ".repeat(12) + "5 - Apagar Conta" + " ".repeat(25));
		System.out.println(" ".repeat(12) + "6 - Sacar" + " ".repeat(32));
		System.out.println(" ".repeat(12) + "7 - Depositar" + " ".repeat(28));
		System.out.println(" ".repeat(12) + "8 - Transferir valores entre Contas" + " ".repeat(6));
		System.out.println(" ".repeat(12) + "9 - Sair" + " ".repeat(33));
		System.out.println(" ".repeat(53));
		System.out.println("*".repeat(53));
		System.out.println("Entre com a opção desejada:" + " ".repeat(26));
		System.out.println(" ".repeat(53) + Cores.TEXT_RESET);
		
		opcao = leia.nextLine();
		
		switch (opcao) {
		case "1":
			System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
			break;
			
		case "2":
			System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
			break;
			
		case "3":
			System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
			break;
			
		case "4":
			System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
			break;
			
		case "5":
			System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
			break;
			
		case "6":
			System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
			break;
			
		case "7":
			System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
			break;
			
		case "8":
			System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
			break;
			
		case "9":
			System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
			sobre();
             leia.close();
			System.exit(0);
			break;
			
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nPor favor, digite uma opção válida!\n" + Cores.TEXT_RESET);
			break;
		}
		
		
		
	}

	public static void sobre() {
		System.out.println("*".repeat(53));
		System.out.println("Projeto Desenvolvido por: Gabriel de Andrade Vieira");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/GabrielVieiraz9/contabancaria");
		System.out.println("*".repeat(53));
		
	}
	
}