package introduction;

import java.util.Scanner;

public class compl_exercise2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double radius, area;
		
		System.out.println("Digite o raio da circunferência: ");
		radius = read.nextDouble();
		
		area = 3.14159 * (radius * radius);
		
		System.out.printf("A área da circunferência é: %.4f" ,area);
		
		read.close();

	}

}
