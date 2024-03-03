package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4Collections {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		Set<Integer> numbersSet = new HashSet<Integer>();
		
		int number;
		
		numbersSet.add(2);
		numbersSet.add(5);
		numbersSet.add(1);
		numbersSet.add(3);
		numbersSet.add(4);
		numbersSet.add(9);
		numbersSet.add(7);
		numbersSet.add(8);
		numbersSet.add(10);
		numbersSet.add(6);
		
		System.out.println(numbersSet);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		number = read.nextInt();
		
		if (numbersSet.contains(number)) {
			System.out.println("O número " + number + " foi encontrado!");
		} else {
			System.out.println("O número " + number + " não foi encontrado!");
		}
		
	}
}
