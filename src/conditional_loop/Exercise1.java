package conditional_loop;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int number1, number2, i;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		number1 = read.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		number2 = read.nextInt();
		
		if(number1 >= number2) {
			System.out.println("Intervalo inválido!");
			
		} else {
			
			for (i = number1; i <= number2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5\n");
					
				}
				read.close();
			}
		}	

	}

}
