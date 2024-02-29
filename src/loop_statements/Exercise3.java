package loop_statements;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int age,under21 = 0, over50 = 0, between = 0;
		
		System.out.println("Digite as idades. \nPara verificas as pessoas que são < 21 e quantas são > 50, coloque uma idade negativa.");
		
		while(true) {
			System.out.println("Idade: ");
			age = read.nextInt();
			
			if (age < 0){
			break;
			}else if (age < 21) {
				under21++;
			} else if(age > 50 ) {
				over50++;
			} else {
				between++;
			}
			
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + under21 + ". \n");
		System.out.println("Total de pessoas com mais de 50 anos: " + over50 + ". \n");
		System.out.println("Total de pessoas com idade entre 21 anos e 50 anos: " + between + ". \n");
		
		read.close();
	}

}
