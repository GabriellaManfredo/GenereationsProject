package introduction;

import java.util.Scanner;

public class ComplExercise3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int seconds, minutes, hours;
		
		System.out.println("Digite o valor: ");
		seconds = read.nextInt();
		
		hours = seconds/3600;
		seconds %= 3600;
		
		minutes = seconds/60;
		seconds %= 60;
		
		System.out.printf("Valor formatado: %d:%d:%d" ,hours, minutes, seconds);
		read.close();
	}

}
