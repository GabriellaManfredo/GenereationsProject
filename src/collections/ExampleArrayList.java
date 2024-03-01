package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExampleArrayList {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); 
		
		// Criando a coleção
		ArrayList<Double> grades = new ArrayList<Double>();
		
		double number;
		
		grades.add(7.0);
		grades.add(5.0);
		grades.add(4.0);
		grades.add(10.0);
		grades.add(4.0);
		
		System.out.println("\nNotas cadastradas: " + grades);
		
		System.out.println("Digite o número que você deseja procurar: ");
		number = read.nextDouble();
		
		System.out.println("\nA posição da nota " + (number) + " é: " + grades.indexOf(number));
		
	}

}
