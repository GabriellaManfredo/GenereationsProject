package conditional_statements;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int option;
		float number1, number2, result;
		
		System.out.println("Digite o primeiro número: ");
		number1 = read.nextFloat();
		
		System.out.println("Digite o segundo número");
		number2 = read.nextFloat();
		
		System.out.println("Digite a opção que deseja fazer: ");
		System.out.println("* Opção 1 -> SOMA");
		System.out.println("* Opção 2 -> SUBTRAÇÃO");
		System.out.println("* Opção 3 -> MULTIPLICAÇÃO");
		System.out.println("* Opção 4 -> DIVISÃO");
		
		option = read.nextInt();
		
		switch (option) {
		case 1:
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
		case 2:
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;
		case 3:
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);;
			break;
		case 4:
			result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);;
			break;
		default:
			System.out.println("Operação inválida!");
		}
		
		read.close();
	}

}
