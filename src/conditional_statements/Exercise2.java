package conditional_statements;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int value;
		
		System.out.println("Digite um número: ");
		value = read.nextInt();
		
		if (value % 2 == 0 && value > 0 ) {
			System.out.println("O número " + value + " é par e positivo!");
		} else if (value % 2 != 0 && value > 0) {
			System.out.println("O número " + value + " é impar e positivo!");
		} else if (value %2 == 0 && value < 0) {
			System.out.println("O número " + value + " é par e negativo!");
		}else if (value == 0) {
			System.out.println("O número digitado é zero!");
		} else {
			System.out.println("O número " + value + " é impar e negativo!");
		}
		
		read.close();
	}

}
