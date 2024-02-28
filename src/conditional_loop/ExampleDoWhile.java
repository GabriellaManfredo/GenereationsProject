package conditional_loop;

import java.util.Scanner;

public class ExampleDoWhile {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		/* do{
		 * 	code to be executed
		 * } while (condition);
		 * The code block is executed first, and then the condition is evaluated.
		 * If the condition is true, the loop continues to execute. 
		 * If the condition is false, the loop terminates.
		 * */
		
		int number, result, i = 0 ;
		

		do {
			i = 0;
			System.out.println("\nDigite um número inteiro: ");
			number = read.nextInt();

			result = number * 5;

			System.out.println("\nO resultado da multiplicação é: " + result);

			i++;
			
		} while (i <= 2);
		
		read.close();
	}

}
