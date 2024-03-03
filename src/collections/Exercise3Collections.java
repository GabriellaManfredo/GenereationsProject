package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercise3Collections {
	
	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in); 
	
		Set<Integer> numbersSet = new HashSet<Integer>();
		
		int number;
		
		System.out.println("Digite 10 números inteiros não repetidos: ");
		
		for (int i = 0; i < 10; i++){
			number = read.nextInt();
;			if(!numbersSet.contains(number)) {
				numbersSet.add(number);
			} else {
				System.out.println("Valor repetido!");
				i--;
			}
		}
		
		Iterator<Integer> iterator = numbersSet.iterator();
		
		System.out.println("\nDados: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	}
	
}

