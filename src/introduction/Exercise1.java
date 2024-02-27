package introduction;

import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float salary;
		float salaryBonus;
		float newSalary;
		
		System.out.println("Digite seu salário");
		salary = read.nextFloat();
		
		System.out.println("Digite seu abono");
		salaryBonus = read.nextFloat();
		
		newSalary = salary + salaryBonus;
		
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeBR);
		
		System.out.println("Seu novo salário é: " + currencyFormatter.format(newSalary));
		
		read.close();
		
	}	
}
