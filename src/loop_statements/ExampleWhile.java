package loop_statements;

import java.util.Scanner;

public class ExampleWhile {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		/* while(condition){
		 * 	code to be execute
		 * }
		 * 
		 * condition -> is evaluated before each iteration. If it evaluates to true,
		 * the loop's body is executed. If it evaluates to false, the loop terminates.
		 * The loop continues to execute as long as the condition remains true.
		 * */
		
		String proceed = "s";
	    int number1, number2, result;
	     
	     
	    // proceed é igual a n? => proceed == "n" XXXXXX
	    // proceed.equals("n) => proceed ["s"] é igual a "n"? False
	    // ! == False => True| !proceed.equals("n") => true
	    
	    //(7 == 8) -> false
	    //!(7 == 8)-> true
	     
	    while (!proceed.equals("n")) {
	     System.out.println("Digite primeiro valor: ");
	     number1 = read.nextInt();

	     System.out.println("Digite segundo valor: ");
	     number2 = read.nextInt();

	     result = number1 + number2;

	     System.out.println("O resultado da soma é: " + result);

	     System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
	     System.out.println("\nDeseja somar dois valores?");
	     System.out.println("\nDigite s para sim OU digite n para não: ");
	     proceed = read.next();
	     System.out.println("++++++++++++++++++++++++++++++++++");
	    }
	    
	    read.close();
	}

}
