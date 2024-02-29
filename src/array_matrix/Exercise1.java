package array_matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] numbers = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int number;
		int index;
		int position = -1;
		boolean found = false;
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("Qual número, do vetor acima, você deseja saber a posição?");
		number = read.nextInt();
		
		for(index = 0; index < 10 && !found; index++) {
			
			if (number == numbers[index]) {
				found = true;
				position = index; 
			}
		}	
			
		if (found) {
			System.out.println("O número " + number + " está localizado na posição: " +  position);
		} else {
			System.out.println("O número " + number + " não foi encontrado!");
		}
		
		
		
	}

}
