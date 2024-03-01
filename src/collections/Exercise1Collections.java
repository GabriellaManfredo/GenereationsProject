package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise1Collections {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); 
		
		ArrayList<String> colors = new ArrayList<String>();
		String colorAdd;
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + " cor: ");
			colorAdd = read.nextLine();
			colors.add(colorAdd);
		}
		
		System.out.println("Cores adicionadas: ");
		for(String color : colors) {
			System.out.println(color);
		}
		
		
		Collections.sort(colors);
		
		System.out.println("Cores ordenadas em ordem alfabética: ");
		
		for(String color : colors) {
			System.out.println(color);
		}
	}

}