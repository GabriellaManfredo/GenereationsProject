package introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float grossSalary;
		float netSalary;
		float overtime;
		float discount;
		float nightWork;
		
		System.out.println("Digite seu salário bruto");
		grossSalary = read.nextFloat();
		
		System.out.println("Digite seu adicional noturno");
		nightWork = read.nextFloat();
		
		System.out.println("Digite suas horas extras");
		overtime = read.nextFloat();
		
		System.out.println("Digite seus descontos");
		discount = read.nextFloat();
		
		netSalary = (grossSalary + nightWork + (overtime * 5))- discount;
		
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeBR);
		
		System.out.println("Seu salário líquido é: " + currencyFormatter.format(netSalary));
		
		read.close();
	}	
}
