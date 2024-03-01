package array_matrix;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numbers[][] = new int[3][3];
		int indexLine, indexColumn, index;
		
		int sum1 = 0, sum2 = 0;
		
for (indexLine = 0; indexLine < 3; indexLine++) {
			
			for (indexColumn = 0; indexColumn < 3; indexColumn++) {
				System.out.println("Digite um número [" + indexLine + "][" + indexColumn + "] : ");
				numbers[indexLine][indexColumn] = read.nextInt();
			}
		}

		
		System.out.println("Elementos da Diagonal Principal: ");
		for (index = 0; index < 3; index++) {
			sum1 += numbers[index][index];
			System.out.printf(numbers[index][index] + " ");
		}
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		for (index = 0; index < 3; index++) {
			sum2 += numbers[index][2- index];
			System.out.print(numbers[index][2 - index] + " ");	
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + sum1);
		
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + sum2);
		
	
	}
}