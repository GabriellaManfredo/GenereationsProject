package conditional_statements;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeBR);
		
		int code;
		float accountBalancy, value;
		
		accountBalancy = 1000f;

		System.out.println("Digite o código da opeação que deseja realizar: ");
		System.out.println("********** MENU ********");
		System.out.println("*** Código 1 | SALDO ***");
		System.out.println("*** Código 2 | SAQUE ***");
		System.out.println("* Código 3  | DEPÓSITO *");
		code = read.nextInt();
		
		switch (code) {
		
		case 1:
			System.out.println("Saldo: " + currencyFormatter.format(accountBalancy));
			break;
			
		case 2:
			System.out.println("Qual valor deseja sacar? ");
			value = read.nextFloat();
			
			if(value > accountBalancy) {
				System.out.println("Saldo insuficiente!");
			} else {
				accountBalancy -= value;
				System.out.println("Saldo: " + currencyFormatter.format(accountBalancy));
			}	
			break;
			
		case 3:
			System.out.println("Qual valor deseja depositar? ");
			value = read.nextFloat();
			accountBalancy += value;
			System.out.println("Saldo: " + currencyFormatter.format(accountBalancy));
			break;
			
		default:
			System.out.println("Operação inválida!");
		}
		
		read.close();
	}

}
