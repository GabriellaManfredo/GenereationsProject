package loop_statements;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int number, multiple3 = 0;
		float average, sum = 0f;
		
		do {
			System.out.println("Digite um número: ");
			number = read.nextInt();
			
			if (number % 3 == 0 && number != 0) {
				sum += number;
				multiple3++;
			}
			
		} while (number != 0);
		
		if (multiple3 != 0) {
			average = sum / multiple3;
			System.out.println("A média de todos os números múltiplos de 3 é:  " + average);
		} else {
			System.out.println("Nenhum número multiplo de 3 foi digitado.");
		}
		
		read.close();

	}

}
