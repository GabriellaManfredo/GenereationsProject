package conditional_loop;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int number, sum = 0;
		
		do {
			System.out.println("Digite um número: ");
			number = read.nextInt();
			
			if (number > 0) {
				sum += number;
			}
			
			
		} while (number != 0);
		
		System.out.println("A soma dos números positivos é: " + sum);
		read.close();
	}

}
