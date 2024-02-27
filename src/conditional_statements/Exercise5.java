package conditional_statements;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeBR);
		
		int option, quantity, value;
		
		System.out.println("************************ MENU *****************************");
		System.out.println("* Código 1 -> Cachorro Quente -> Preço Unitário: R$ 10,00 *");
		System.out.println("**** Código 2 -> X-Salada -> Preço Unitário: R$ 15,00 *****");
		System.out.println("***** Código 3 -> X-Bacon -> Preço Unitário: R$ 18,00 *****");
		System.out.println("****** Código 4 -> Bauru -> Preço Unitário: R$ 12,00 ******");
		System.out.println("*** Código 5 -> Refrigerante -> Preço Unitário: R$ 8,00 ***");
		System.out.println("* Código 6 -> Suco de Laranja -> Preço Unitário: R$ 13,00 *");
		System.out.println("***********************************************************");
		
		System.out.println("Digite o código do produto: ");
		option = read.nextInt();
		
		System.out.println("Qual é a quantidade que deseja comprar? ");
		quantity = read.nextInt();
		
		switch (option) {
		
		case 1:
			value = quantity * 10;
			System.out.println("Produto selecionado: Cachorro Quente");
			System.out.println("Quantidade selecionado: " + quantity);
			System.out.println("Valor total: " + currencyFormatter.format(value));
			break;
			
		case 2:
			value = quantity * 15;
			System.out.println("Produto selecionado: X-Salada");
			System.out.println("Quantidade selecionado: " + quantity);
			System.out.println("Valor total: " + currencyFormatter.format(value));
			break;
			
		case 3:
			value = quantity * 18;
			System.out.println("Produto selecionado: X-Bacon");
			System.out.println("Quantidade selecionado: " + quantity);
			System.out.println("Valor total: " + currencyFormatter.format(value));
			break;
			
		case 4:
			value = quantity * 12;
			System.out.println("Produto selecionado: Bauru");
			System.out.println("Quantidade selecionado: " + quantity);
			System.out.println("Valor total: " + currencyFormatter.format(value));
			break;
			
		case 5:
			value = quantity * 8;
			System.out.println("Produto selecionado: Refrigerante");
			System.out.println("Quantidade selecionado: " + quantity);
			System.out.println("Valor total: " + currencyFormatter.format(value));
			break;
			
		case 6:
			value = quantity * 13;
			System.out.println("Produto selecionado: Suco de laranja");
			System.out.println("Quantidade selecionado: " + quantity);
			System.out.println("Valor total: " + currencyFormatter.format(value));
			
		default:
			System.out.println("Selecione uma opção válida!");
		}
		
		read.close();
	}

}
