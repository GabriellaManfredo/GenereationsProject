package introduction;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		//variable
		String name;
		int age;
		
		//Input of data
		System.out.println("Como posso te chamar?");
		name = read.nextLine();
		
		System.out.println("Quantos anos você tem?");
		age = read.nextInt();
		
		//Output of data
		System.out.println("Olá, " + name);
		System.out.println("A sua idade é: " + age +" anos.");
		
	}

}
