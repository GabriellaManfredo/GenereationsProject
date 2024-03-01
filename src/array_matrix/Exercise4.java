package array_matrix;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float grades[][] = new float[10][4];
		float average[] = new float[10];
		int indexStudent, indexGrade;
		float sum = 0;
		
		System.out.println("Digite as notas dos alunos: ");
		for(indexStudent = 0; indexStudent < 10; indexStudent++) {
			System.out.println("Aluno " + (indexStudent + 1) + ":");
			sum = 0;
			for(indexGrade = 0; indexGrade < 4; indexGrade++) {
				System.out.println("Nota do " + (indexGrade + 1) + "º bimestre: ");
				grades[indexStudent][indexGrade] = read.nextFloat();
				sum += grades[indexStudent][indexGrade];
			}
			average[indexStudent] = sum / 4;
		}
		
		System.out.println("Médias dos alunos: ");
		for(indexStudent = 0; indexStudent < 10; indexStudent++){
			System.out.printf("Aluno %d: %.1f\n", (indexStudent + 1), average[indexStudent]);
		}
		
	}

}
