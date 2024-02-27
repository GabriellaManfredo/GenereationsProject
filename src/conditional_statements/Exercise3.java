package conditional_statements;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String name;
		int age;
		boolean firstDonation;
		
		System.out.println("Olá! Como posso te chamar?");
		name = read.next();
		
		System.out.println("Quantos anos você tem?");
		age = read.nextInt();
		
		System.out.println("É a sua primeira doação de sangue? (true/false)");
		firstDonation = read.nextBoolean();
		
		if (age >= 18 && age < 60) {
			System.out.println(name + " você está apto(a) para doar sangue!");
		} else if (age >= 60 && firstDonation) {
			System.out.println(name + " você não está apto(a) para doar sangue!");
		} else if (age < 18) {
			System.out.println(name + " você não está apto(a) para doar sangue!");
		}else {
			System.out.println(name + " você está apto(a) para doar sangue!");
		}
		
		read.close();		
	}

}
