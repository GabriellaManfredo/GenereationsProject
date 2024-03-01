package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {

	public static void main(String[] args) {
		
		// Criando a Collection de FILA
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i <= 10; i++)
			queue.add(i);

		System.out.println("\nElementos na fila: "	+ queue);
		
		System.out.println("\nRemover Elemento: " + queue.remove());

		System.out.println("\nFila atualizada: " + queue);
		
		System.out.println("\nAdicionar Elemento 11: " + queue.add(11));

		System.out.println("\nExibir a Fila atualizada: " + queue);

		System.out.println("\nExibir o Primeiro Elemento da fila: " + queue.peek());
		
		// Criando a Collection de Iteração
		Iterator<Integer> iterator = queue.iterator();
		
		while(iterator.hasNext()){
			   System.out.println(iterator.next());
			}


	}

}
