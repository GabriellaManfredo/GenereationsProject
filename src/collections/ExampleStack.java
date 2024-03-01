package collections;

import java.util.Stack;

public class ExampleStack {

	public static void main(String[] args) {
		//LIFO: "O último elemento inserio na pilha
		//é o primeiro elemento que será retirado da pilha."
		
		// Criando a Collection de PILHA
		Stack<String> stack = new Stack<String>();
		
		stack.push("Prato Verde");
		stack.push("Prato Azul");
		stack.push("Prato Branco");
		stack.push("Prato Amarelo");
		stack.push("Prato Vermelho");
		
		System.out.println("\nElemenetos da pilha: " + stack);
		System.out.println("\nRetirar elemento da pilha: " + stack.pop());
		System.out.println("\nElementos da pilha: " + stack);
	}

}
