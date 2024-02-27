package conditional_statements;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		/*if-else statement
		* if(condition){
		* 	code block 
		* } else{
		* 	code block 
		* }
		* */
			
		int age;
			
		System.out.println("Quantos anos você tem?");
		age = read.nextInt();
			
			
		if(age >= 18) {
			System.out.println("Você é maior de idade.");
		} else {
			System.out.println("Você é menor de idade.");
		}
		
		read.close();
	}
}
