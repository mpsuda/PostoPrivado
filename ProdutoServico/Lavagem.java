package ProdutoServico;

public class Lavagem {
	
	public static void realizarLavagem(int tipoLavagem) {
	
	double precoPequeno = 20.00;
	double precoMedio = 25.00;
	double precoGrande = 30.00;
	double precoFora = 15.00;
		
	
		if(tipoLavagem == 1) {
			System.out.printf("Foi realizada a lavagem do carro pequeno, no valor de R$ %2f%n", precoPequeno);
		} else if (tipoLavagem == 2) {
			System.out.printf("Foi realizada a lavagem do carro médio, no valor de R$ %2f%n", precoMedio);
		}else if(tipoLavagem == 3) {
			System.out.printf("Foi realizada a lavagem do carro grande, no valor de R$ R$ %2f%n", precoGrande);
		} else if (tipoLavagem == 4){ 
			System.out.printf("Foi realizada a lavagem por fora do carro (Ducha), no valor de R$ %2f%n", precoFora);
		} else {
			System.out.println("Opção inválida!");
		}
	}
}
