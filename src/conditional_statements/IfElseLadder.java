package conditional_statements;

import java.util.Scanner;

public class IfElseLadder {
	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
		/*if-else-if ladder
		 * if (condition 1){
		 * 	code block
		 * } else if (condition 2){
		 * 	code block
		 * } else {
		 * 	code block
		 * }
		 * */
	
		int x, y;
		
		System.out.println("Digite o primeiro número:");
		x = read.nextInt();
		
		System.out.println("Digite o segundo número");
		y = read.nextInt();
		
		if (x > y) {
			System.out.println(x + " é maoir que " + y);
		} else if (x == y){
			System.out.println(x + " é igual a " + y);
		} else {
			System.out.println(x + " é menor que " + y);
		}
//---------------EXAMPLE 2---------------//
		float grade1, grade2, average; 
				
		System.out.println("Digite a primeira nota:");
		grade1 = read.nextFloat();
				
		System.out.println("Digite a segunda nota:");
		grade2 = read.nextFloat();
				
		average = (grade1 + grade2)/2;
				
		if (average >= 6) {
			System.out.println("Parabéns! Você foi aprovado! Sua média é: " + average);
		} else if (average >= 5){
			System.out.println("Está de exame. Sua média é: " + average);
		} else {
			System.out.println("Você reprovou! Sua média é: " + average);
		}
			
		read.close();
	}
}
