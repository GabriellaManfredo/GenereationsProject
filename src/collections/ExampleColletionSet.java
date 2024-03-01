package collections;

import java.util.HashSet;
import java.util.Set;

public class ExampleColletionSet {

	public static void main(String[] args) {
		
		// As collections do tipo set não repete os dados. 
		Set<String> setFruits = new HashSet<String>();
		
		setFruits.add("Abacate");
		setFruits.add("Banana");
		setFruits.add("Jaboticaba");
		setFruits.add("Kiwi");
		setFruits.add("Maçã");
		setFruits.add("Morango");
		setFruits.add("Pêra");
		setFruits.add("Jaboticaba");
		setFruits.add("Kiwi");
		
		System.out.println("\nDados da collection: " + setFruits);
		
		// For Each
		for(String fruit: setFruits) {
				System.out.println("A posição de " + fruit + " é: " + fruit.hashCode());
		
		}
		
	}

}
