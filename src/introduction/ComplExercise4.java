package introduction;

import java.util.Scanner;

public class ComplExercise4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int value, bill100, bill50, bill20, bill10, bill5, bill2, bill1;
		
		System.out.println("Digite o valor: ");
		value= read.nextInt();
		
		bill100 = value / 100;
		value %= 100;
		
		bill50 = value / 50;
		value %= 50;
		
		bill20 = value / 20;
		value %= 20;
		
		bill10 = value / 10;
		value %= 10;
		
		bill5 = value / 5;
		value %= 5; 
		
		bill2 = value / 2;
		value %= 2;
		
		bill1 = value / 1;
		value %= 1;
		
		System.out.println(bill100 + " nota(s) de R$ 100,00");
		System.out.println(bill50 + " nota(s) de R$ 50,00");
		System.out.println(bill20 + " nota(s) de R$ 20,00");
		System.out.println(bill10 + " nota(s) de R$ 10,00");
		System.out.println(bill5 + " nota(s) de R$ 5,00");
		System.out.println(bill2 + " nota(s) de R$ 2,00");
		System.out.println(bill1 + " nota(s) de R$ 1,00");
		
		read.close();
	}

}
