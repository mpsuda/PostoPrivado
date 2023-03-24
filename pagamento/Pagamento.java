package pagamento;

import	java.util.Scanner;

public class Pagamento {
	
	public static void formaPagamento(int formaPagamento, double valorPago) {
		
		Scanner input = new Scanner(System.in);
		
		int formaEscolhida = input.nextInt();
		
		switch (formaEscolhida) {
		case 1:
			System.out.println("Será pago em dinheiro");
			double quantiaDinheiro = input.nextDouble();
			
			break;
			
		case 2:
			System.out.println("Será pago no débito");
			double quantiaDebito = input.nextDouble();
			
			break;
			
		case 3:
			System.out.println("Será pago no crédito");
			double quantiaCredito = input.nextDouble();
			
			break;
			
		default: 
			break;
			
			
		}
	}

}
