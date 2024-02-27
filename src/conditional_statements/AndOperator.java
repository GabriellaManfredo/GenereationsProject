package conditional_statements;

import java.util.Scanner;

public class AndOperator {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		/* if (condition1 && condition2){
		* execute this block of code if both condition 1 and
		* condition2 are true
		*/
		
		int age;
		boolean driversLicense;
		
		System.out.println("Digite sua idade: ");
		age = read.nextInt();
		
		System.out.println("Você tem carteira de habilitação? (true/false)");
		driversLicense = read.nextBoolean();
		
		if (age >= 18 && driversLicense) {
			System.out.println("Você pode dirigir!");
		} else {
			System.out.println("Você não pode dirigir!");
		}

		read.close();
	}

}
