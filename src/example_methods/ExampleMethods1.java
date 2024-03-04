package example_methods;

public class ExampleMethods1 {

	public static void main(String[] args) {
			
		System.out.println("O resultado é: " + add(1,2));
		
		text("Bom dia!");
		
		ExampleMethods2.message();

	}
	
	// Método com retorno e com parametro
	public static int add(int number1, int number2) {
		return number1 + number2;
	}
	
	// Método sem retorno e sem parametro
//	public static void message() {
//		System.out.println("Olá amigos!");
//	}
	
	// Método sem retorno e com parametro
	public static void text (String content) {
		System.out.println(content);
	}

}
