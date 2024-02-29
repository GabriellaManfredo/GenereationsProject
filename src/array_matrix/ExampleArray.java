package array_matrix;

import java.util.Scanner;

public class ExampleArray {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		// How to declare an array? type name[] = new type[size];
		
		int quantity;
		System.out.println("Quantos nomes de cachorros você deseja incluir? ");
		quantity = read.nextInt();
		
		String cachorros[] =  new String[quantity];
		
		int index;
		
		for (index = 0; index < quantity; index++) {
			System.out.println("Digite o " + (index + 1)+" º nome: ");
			cachorros[index] = read.nextLine();
		}
		
		for (index = 0; index < cachorros.length ; index++) {
			System.out.println(cachorros[index]);
		}
		
	}

}
