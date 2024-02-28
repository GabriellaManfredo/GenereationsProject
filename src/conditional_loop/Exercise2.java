package conditional_loop;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int i, number, evenNumber = 0, oddNumber = 0;
		
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o " +(i+1)+ "º número: ");
			number = read.nextInt();
			
			if(number % 2 == 0) {
				evenNumber++;
			} else {
				oddNumber++;
			}
		}
		
		System.out.println("Total de números pares: " + evenNumber + "\n");
		System.out.println("Total de números ímpares:" + oddNumber +"\n");
	}

}
