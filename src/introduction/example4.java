package introduction;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		//variable
		float number1;
		float number2;
		float number3;
		float number4;
		float difference;
		
		//input
		System.out.println("Digite seu primeiro número: ");
		number1 = read.nextFloat();
		
		System.out.println("Digite seu segundo número: ");
		number2 = read.nextFloat();
		
		System.out.println("Digite seu terceiro número: ");
		number3 = read.nextFloat();
		
		System.out.println("Digite seu quarto número: ");
		number4 = read.nextFloat();
		
		difference = (number1*number2)-(number3 * number4);
		
		read.close();
		
		//output
		System.out.printf("A diferença entre o produto do n1 e o n2 pelo produto entre o n3 e n4 é: %.2f", difference);

	}

}
