package array_matrix;

public class ExampleMatrix {

	public static void main(String[] args) {
		/* How to declare a matrix?
		 * type name[][] = new type [quantity line][quantity column];
		 * 
		 * To declare a matrix with elements' values
		 * 	type name [][] = {
		 * 			{element12, element12},
		 * 			{element21, element22}
		 * };
		 * */
		
		int numbers[][] = {
				{10, 150, 350},
				{70, 120, 140},
				{50, 100, 150}
		};
		
		int line, column;
		
		//Traverse the rows of the matrix
		for (line = 0; line < 3; line++) {
			
			//Traverse the columns of the matrix
			for (column = 0; column < 3; column++) {
				System.out.println("Numeros [" + line + "][" + column + "] -> " + numbers[line][column]);
			}
		}
	}

}
