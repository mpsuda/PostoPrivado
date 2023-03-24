package ProdutoServico;

public class Abastecer {
	
	public static void abastecer(double valorAbastecer, int tipoCombustivel) {
	
	double precoGasolina = 4.75;
	double precoEtanol = 3.85;
	double precoDiesel = 5.15;
	double quantidadeCombustivel;
		
		if (tipoCombustivel == 1) {
			quantidadeCombustivel = valorAbastecer / precoGasolina;
			System.out.printf("Foi abastecido o valor de %.2f, rendendo a quantidade de %.3f", valorAbastecer, quantidadeCombustivel);
		} else if (tipoCombustivel == 2) {
			quantidadeCombustivel = valorAbastecer / precoEtanol;
			System.out.printf("Foi abastecido o valor de %.2f, rendendo a quantidade de %.3f", valorAbastecer, quantidadeCombustivel);
		} else if (tipoCombustivel == 3) {
			quantidadeCombustivel = valorAbastecer / precoDiesel;
			System.out.printf("Foi abastecido o valor de %.2f, rendendo a quantidade de %.3f", valorAbastecer, quantidadeCombustivel);
		} else {
			System.out.println("Opção inválida!");
		}
	}
}
