package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercise1DataStructures {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); 
		
		Queue<String> queue = new LinkedList<String>();
		
		int option;
		String name;
		
		do {
		
			System.out.println("**************************************");
			System.out.println("");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.println("");
			System.out.println("**************************************");
			System.out.println("Entre com a opção desejada: ");
			
			option = read.nextInt();
			read.nextLine();

		
			switch(option){
				case 1:
					System.out.println("Digite o nome do cliente: ");
					name = read.nextLine();
					queue.add(name);
					System.out.println("\nFila: ");
					System.out.println(queue);
					System.out.println("\nCliente adicionado!");
					break;
					
				case 2:
					System.out.println("Fila: ");
					System.out.println(queue);
					break;
					
				case 3:
					if(queue.isEmpty()) {
						System.out.println("A fila está vazia!");
					} else {
						System.out.println("Fila: ");
						queue.remove();
						System.out.println(queue);
						System.out.println("O cliente foi chamado!");
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
