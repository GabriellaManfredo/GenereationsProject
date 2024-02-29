package loop_statements;

import java.util.Scanner;

public class ExampleFor {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		/*for (initialization; condition; update){
		 * 	Loop body
		 * }
		 * initialization -> is where you initialize the counter/control variable.
		 * condition -> is the condition that must be true to continue the loop execution.
		 * update -> is where you update the counter/control variable after each iteration.
		 * */
		
		String name;
		int i;
	
	    for(i= 0; i <= 2; i++) {
	     System.out.println("Digite o " + (i+1) + "º nome: ");
		 name = read.nextLine();
		 System.out.println("O " +(i + 1) + " nome é: " + name + "\n");
		 read.close();
	    }

	    System.out.println("Fora do loop");    	        
	}

}
