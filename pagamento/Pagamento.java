package pagamento;

import	java.util.Scanner;

public class Pagamento {
	
	public static void formaPagamento(int formaEscolhida, double valorAbastecido) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Favor escolher a forma de pagamento: 1-Dinheiro, 2-Débito, 3-Crédito");
		int formaEscolhida = entrada.nextInt();
		
		switch (formaEscolhida) {
		case 1:
			System.out.println("Será pago em dinheiro");
			
			System.out.println("Qual será a quantia paga?");
			double quantiaDinheiro = entrada.nextDouble();
			
			break;
			
		case 2:
			System.out.println("Será pago no débito");
			
			System.out.println("Qual será a quantia paga?");
			double quantiaDebito = entrada.nextDouble();
			
			break;
			
		case 3:
			System.out.println("Será pago no crédito");
			
			System.out.println("Qual será a quantia paga?");
			double quantiaCredito = entrada.nextDouble();
			
			break;
			
		default:
			break;
		}
	}

}
