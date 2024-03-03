package collections;

import java.util.Scanner;
import java.util.Stack;

public class Exercise2DataStructures {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in); 
		
		Stack<String> books = new Stack<String>();
		
		int option;
		String bookName;
		
		
		
		do {
			System.out.println("**************************************");
			System.out.println("");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("");
			System.out.println("**************************************");
			System.out.println("Entre com a opção desejada: ");
			
			option = read.nextInt();
			read.nextLine();

		
				switch(option){
				
					case 1:
						System.out.println("Digite o nome do livro: ");
						bookName = read.nextLine();
						books.push(bookName);
						System.out.println("\nFila: ");
						System.out.println(books);
						System.out.println("\nLivro adicionado!");
						break;
						
					case 2:
						System.out.println("Pilha: ");
						System.out.println(books);
						break;
						
					case 3:
						if(books.isEmpty()) {
							System.out.println("A pilha está vazia!");
						} else {
							System.out.println("Pilha: ");
							books.pop();
							System.out.println(books);
							System.out.println("O livro foi retirado da pilha!");
						}
						break;
						
					case 0:
						System.out.println("Programa Finalizado!");
						break;
						
					default:
						System.out.println("Digite uma opção válida");
				}
			} while (option != 0);
	}
}
