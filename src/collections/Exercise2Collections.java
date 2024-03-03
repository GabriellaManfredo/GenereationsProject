package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2Collections {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); 
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		int number;
		
		numbers.add(2);
		numbers.add(5);
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(9);
		numbers.add(7);
		numbers.add(8);
		numbers.add(10);
		numbers.add(6);
		
		System.out.println(numbers);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		number = read.nextInt();
		
		if (numbers.contains(number)) {
			System.out.println("O número " + number + " está localizado na posição: " + numbers.lastIndexOf(number));
		} else {
			System.out.println("O número " + number + " não foi encontrado!");
		}
			
	}

}
