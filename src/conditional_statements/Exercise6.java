package conditional_statements;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeBR);
		
		String name;
		int code;
		float salary, newSalary;
		
		System.out.println("Olá! Como posso te chamar?");
		name = read.next();
		
		System.out.println("************************ MENU *****************************");
		System.out.println("*** Código 1 -> GERENTE -> Percentual do Reajuste: 10% ****");
		System.out.println("*** Código 2 -> VENDENDOR -> Percentual do Reajuste: 7% ***");
		System.out.println("** Código 3 -> SUPERVISOR -> Percentual do Reajuste: 9% ***");
		System.out.println("*** Código 4 -> MOTORISTA -> Percentual do Reajuste: 6% ***");
		System.out.println("** Código 5 -> ESTOQUISTA -> Percentual do Reajuste: 5% ***");
		System.out.println("* Código 6 -> TÉCNICO DE TI -> Percentual do Reajuste: 8% *");
		System.out.println("***********************************************************");
		
		System.out.println("Qual é o código do seu cargo?");
		code = read.nextInt();
		
		System.out.println("Qual é o seu salário?");
		salary = read.nextFloat();
		
		switch (code) {
		
		case 1:
			newSalary = salary + (salary * 0.10f);
			System.out.println("Nome do colaborador: " + name);
			System.out.println("Cargo: Gerente");
			System.out.println("Salário: " + currencyFormatter.format(newSalary));
			break;
			
		case 2:
			newSalary = salary + (salary * 0.07f);
			System.out.println("Nome do colaborador: " + name);
			System.out.println("Cargo: Vendendor");
			System.out.println("Salário: " + currencyFormatter.format(newSalary));
			break;
			
		case 3:
			newSalary = salary + (salary * 0.09f);
			System.out.println("Nome do colaborador: " + name);
			System.out.println("Cargo: Supervisor");
			System.out.println("Salário: " + currencyFormatter.format(newSalary));
			break;
			
		case 4:
			newSalary = salary + (salary * 0.06f);
			System.out.println("Nome do colaborador: " + name);
			System.out.println("Cargo: Motorista");
			System.out.println("Salário: " + currencyFormatter.format(newSalary));
			break;
			
		case 5:
			newSalary = salary + (salary * 0.05f);
			System.out.println("Nome do colaborador: " + name);
			System.out.println("Cargo: Estoquista");
			System.out.println("Salário: " + currencyFormatter.format(newSalary));
			break;
			
		case 6:
			newSalary = salary + (salary * 0.08f);
			System.out.println("Nome do colaborador: " + name);
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Salário: " + currencyFormatter.format(newSalary));
			break;
			
		default:
			System.out.println(name + " digite o código de colaborador válido.");
		}
		
		read.close();
	}
}
