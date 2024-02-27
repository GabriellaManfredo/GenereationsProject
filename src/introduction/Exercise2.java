package introduction;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float grade1;
		float grade2;
		float grade3;
		float grade4;
		float average;
		
		System.out.println("Digite sua primeira nota: ");
		grade1 = read.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		grade2 = read.nextFloat();
		
		System.out.println("Digite sua terceira nota: ");
		grade3 = read.nextFloat();
		
		System.out.println("Digite sua quarta nota: ");
		grade4 = read.nextFloat();
		
		average = (grade1 + grade2 + grade3 + grade4)/4;
		
		System.out.printf("Sua média é: %.2f" ,average);
		
		read.close();
	}

}
