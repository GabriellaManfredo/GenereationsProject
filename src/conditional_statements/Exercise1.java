package conditional_statements;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int valueA, valueB, valueC, sum;
		
		System.out.println("Digite o valor A: ");
		valueA = read.nextInt();
		
		System.out.println("Digite o valor B: ");
		valueB = read.nextInt();
		
		System.out.println("Digite o balor C: ");
		valueC = read.nextInt();
		
		sum = valueA + valueB;
		
		if (sum > valueC) {
			System.out.println("A soma de A + B é MAIOR do que C.");
		} else if (sum == valueC) {
			System.out.println("A Soma de A + B é IGUAL a C.");
		} else {
			System.out.println("A soma de A +B é MENOR do que C.");
		}
		
		read.close();
	}

}
