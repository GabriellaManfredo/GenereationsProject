package array_matrix;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numbers[][] = new int[3][3];
		int x, y, index;
		
		int sum1 = 0, sum2 = 0;
		
for (x = 0; x < 3; x++) {
			
			for (y = 0; y < 3; y++) {
				System.out.println("Digite um número [" + x + "][" + y + "] : ");
				numbers[x][y] = read.nextInt();
			}
		}

		
		System.out.println("Elementos da Diagonal Principal: ");
		for (index = 0; index < 3; index++) {
			sum1 += numbers[index][index];
			System.out.println(numbers[index][index] + " ");
		}
		
		System.out.println("Elementos da Diagonal Secundária: ");
		for (index = 0; index < 3; index++) {
			sum2 += numbers[index][2- index];
			System.out.println(numbers[index][2 - index]);	
		}
		
		System.out.println("Soma dos Elementos da Diagonal Principal: " + sum1);
		
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + sum2);
		
	
	}
}