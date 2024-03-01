package array_matrix;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numbers[] = new int[10];
		int index;
		float sum = 0, average; 
		
		for(index = 0; index < 10; index++) {
			System.out.println("Digite o " + (index+1) + "º número:");
			numbers[index] = read.nextInt();
		}

		System.out.println("Elementos nos índices ímpares: ");
		for(index = 1; index < 10; index += 2) {
			System.out.println(numbers[index]);
		}
		
		System.out.println("Elementos pares:");
		for(index = 0; index < 10; index++) {
			if(numbers[index] % 2 == 0) {
				System.out.println(numbers[index]);
			}
		}
		
		
		for(index = 0; index < 10; index++) {
			sum += numbers[index];
		}
		System.out.println("Soma: " + sum);
		
		average = sum/10;
		System.out.println("Média: " + average);
		
	}

}
