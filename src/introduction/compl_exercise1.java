package introduction;

import java.util.Scanner;

public class compl_exercise1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float value1, value2,addition, subtraction, multiplication, division; 
		
		System.out.println("Digite o primeiro valor: ");
		value1 = read.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		
		value2 = read.nextFloat();
		
		addition = value1 + value2;
		
		subtraction = value1 - value2;
		
		multiplication = value1 * value2;
		
		division = value1 / value2;
		
		System.out.println("Soma: " + addition);
		System.out.println("Diferença: " + subtraction);
		System.out.println("Multiplicação: " + multiplication);
		System.out.printf("Divisão: %.3f" ,division);
		
		read.close();

	}

}
