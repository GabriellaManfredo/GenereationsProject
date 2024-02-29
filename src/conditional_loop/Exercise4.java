package conditional_loop;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		// Conditional variables
		String proceed = "s";
		
		// Expressions/Conditional variables		
		int age, genderIdentity,developer;
		
		// Counters
		int womenFront = 0 , menMobile40 = 0, nonBinaryFull30 = 0;  
		int woman = 0, man = 0, nonBinary = 0;
		int backend = 0, total = 0;
		
		// Variables for average
		float sumAge = 0f, averageAge;
		
		while (!proceed.equals("n")) {
			
			System.out.println("Qual é a sua idade?");
			age = read.nextInt();
			sumAge+= age;
			total++;
			
			System.out.println("Como você se identifica?");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			
			genderIdentity = read.nextInt();
			
			switch(genderIdentity) {
			
				case 1:
					woman++;
					break;
					
				case 2:
					man++;
					break;
					
				case 3:
					nonBinary++;
					break;
					
				case 4:
					woman++;
					break;
					
				case 5:
					man++;
					break;
					
				case 6:
					break;
					
				default:
					System.out.println("Digite uma opção valida!");
					break;
			}
			
			System.out.println("Você atua em qual área?");
			System.out.println("1 - BackEnd");
			System.out.println("2 - FrontEnd");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			
			developer = read.nextInt();
			
			switch(developer) {
			
				case 1:
					backend++;
					break;
				
				case 2:
					if (genderIdentity == 1 || genderIdentity == 4) {
						womenFront++;
					}
					break;
					
				case 3:
					if (genderIdentity == 2 || genderIdentity == 5 && age > 40) {
						menMobile40++;
					}
					break;
				
				case 4: 
					if (genderIdentity == 3 && age < 30) {
						nonBinaryFull30++;
					}
					break;
					
				default:
					System.out.println("Digite uma opção válida!");
					break;
			}
			
			System.out.println("\nDeseja cadastrar um novo colaborador ou não (S/N): ");
		    proceed = read.next();
			
		}
		
		averageAge = sumAge / total;
		
		System.out.println("O número de pessoas desenvolvedoras Backend: " + backend + ".\n");
		System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend: " + womenFront + ".\n");
		System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + menMobile40 + ".\n");
		System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: " + nonBinaryFull30 + ".\n" );
		System.out.println("O número total de pessoas que responderam à pesquisa: " + total + ".\n");
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + averageAge + ".\n");
		
		read.close();
	}

}
