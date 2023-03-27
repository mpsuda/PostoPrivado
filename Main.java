import java.util.Scanner;

import pessoas.Cliente;
import pessoas.Funcionario;
import ProdutoServico.Abastecer;
import ProdutoServico.Lavagem;
import pagamento.Pagamento;
import Pagamento.formaPagamento;

public class Main {

	public static void main(String[] args) {
		
		int escolhaCliente;
		int tipoCombustivel;
		double valorAbastecer;
		int tipoLavagem;
		int formaPagamento;
		double valorPago;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Posto Transforme-se!");
		System.out.println(" ");
		
		// Solicitando dados de entrada
		System.out.println("Qual serviço deseja fazer? 1-Abastecer 2-Lavagem");
		escolhaCliente = input.nextInt();
		
		if(escolhaCliente == 1) {
		
			System.out.println("Escolha o tipo de combustível: 1-Gasolina, 2-Álcool, 3-Diesel");
			tipoCombustivel = input.nextInt();
		
			System.out.println("Quanto gostaria de abastecer?");
			valorAbastecer = input.nextDouble();		
		
			Abastecer.abastecer(tipoCombustivel, valorAbastecer);

		} else if (escolhaCliente == 2) {
		
			System.out.println("Escolha o tipo de Lavagem: 1-Pequeno, 2-Médio, 3-Grande, 4-Personalizado");
			tipoLavagem = input.nextInt();
			
				
			Lavagem.realizarLavagem(tipoLavagem);
						
		} else {
			
			System.out.println("Opção inválida! Por favor, reinicie e escolha um serviço disponível: 1-Abastecimento, 2-Lavagem ");
		}
		
		System.out.println("Favor escolher a forma de pagamento: 1-Dinheiro, 2-Débito, 3-Crédito");
		formaPagamento = input.nextInt();		
				
		System.out.println("Qual será a quantia paga?");
		valorPago = input.nextDouble();
		
		new Pagamento();
		Pagamento.formaPagamento(formaPagamento, valorPago);
		
		System.out.println(" ");
		System.out.println("O posto Transforme-se agradece pela preferência. Volte sempre!");
		
		input.close();
	}
	
}