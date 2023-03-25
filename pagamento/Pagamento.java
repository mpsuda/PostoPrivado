package pagamento;

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
			System.out.println("Selecionado pagamento em dinheiro");
			
			
			break;
			
		case 2:
			System.out.println("Selecionado pagamento no débito");
			
			
			break;
			
		case 3:
			System.out.println("Selecionado pagamento no crédito");
			
			
			break;
			
		default: 
			break;
		}
	}
}
