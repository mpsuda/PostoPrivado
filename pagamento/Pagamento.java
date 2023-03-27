package pagamento;

// Classe Pagamento criada/revisada por todos os integrantes do grupo: Naty, Juju e Suda

import	java.util.Scanner;

public class Pagamento {
	
	public static void formaPagamento(int formaPagamento, double valorPago) {
		
		Scanner input = new Scanner(System.in);
		
		double quantiaDinheiro;
		double quantiaDebito;
		double quantiaCredito;
		double valorAbastecer;
		
				
		switch (formaPagamento) {
		case 1:
			System.out.println("Pagamento em dinheiro realizado com sucesso!");
			
			
			break;
			
		case 2:
			System.out.println("Pagamento no débito realizado com sucesso!");
			
			
			break;
			
		case 3:
			System.out.println("Pagamento no crédito realizado com sucesso!");
			
			
			break;
			
		default: 
			break;
		}
	}
}
