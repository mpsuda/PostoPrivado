import java.util.Scanner;
import pessoas.Cliente;
import pessoas.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Posto Transforme-se!");
		
		// Solicitando dados de entrada
		System.out.println("Por favor, escolha o tipo de combustível: 1-Gasolina, 2-Álcool, 3-Diesel");
		int tipoCombustivel = input.nextInt();
		
		System.out.println("Por favor, informe o valor em R$ que deseja abastecer: ");
		int valorAbastecer = input.nextInt();
		
		
		input.close();
	}
}
		
		//Cliente c1 = new Cliente();
		//c1.nome = "Gabriel";
		//c1.sobreNome = "Nunes";
		/*
		Cliente c2 = new Cliente("Gilcemar", "Borges");
		Cliente c3 = new Cliente("Renan", "Teixeira");
		Cliente c4 = new Cliente("Ariel", "Xavier");
		
		System.out.println(c2.nome);
		System.out.println(c2.sobreNome);
		
		System.out.println(Funcionario.enderecoPosto);
		
		Credito.pagoNoCredito("Richard");
		Credito.pagoNoCredito("Qualquer nome");
		*/

	
