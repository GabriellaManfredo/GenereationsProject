package conditional_statements;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
Scanner read = new Scanner(System.in);
		
		String charact1, charact2, charact3;
		
		System.out.println("Seu animal é vertebrado ou invertebrado?");
		charact1 = read.next();
		
		if (charact1.equalsIgnoreCase("vertebrado")) {
			System.out.println("Seu animal é uma ave ou um mamífero? ");
			charact2 = read.next();
			
			if (charact2.equalsIgnoreCase("ave")) {
				System.out.println("Seu animal é carnívoro ou onívoro?");
				charact3 = read.next();
				
				if (charact3.equalsIgnoreCase("carnívoro")) {
					System.out.println("ÁGUIA.");
				
				} else if (charact3.equalsIgnoreCase("onívoro")) {
					System.out.println("POMBA.");
				} else {
					System.out.println("Digite se seu animal é carnívoro ou onívoro");
					
				}
				
			} else if (charact2.equalsIgnoreCase("mamífero")) {
				System.out.println("Seu animal é onívoro ou herbívoro?");
				charact3 = read.next();
				
				if (charact3.equalsIgnoreCase("onívoro")) {
					System.out.println("HOMEM.");
				} else if (charact3.equalsIgnoreCase("herbívoro")) {
					System.out.println("VACA.");
				} else {
					System.out.println("Digite se seu animal é onívoro ou herbívoro");
				}
				
			} else {
				System.out.println("Digite se seu animal é uma ave ou um mamífero!");
			}
			
		} else if (charact1.equalsIgnoreCase("invertebrado")){
			System.out.println("Seu animal é um inseto ou um anelídeo? ");
			charact2 = read.next();
			
			if (charact2.equalsIgnoreCase("inseto")) {
				System.out.println("Seu animal é hematófago ou herbívoro?");
				charact3 = read.next();
				
				if(charact3.equalsIgnoreCase("hematófago")){
					System.out.println("PULGA");
				} else if (charact3.equalsIgnoreCase("herbívoro")) {
					System.out.println("LAGARTA");
				} else {
					System.out.println("Digite se seu animal é hematófago ou herbívoro.");
				}
				
			} else if (charact2.equalsIgnoreCase("anelídeo")) {
				System.out.println("Seu animal é hematófago ou onívoro?");
				charact3 = read.next();
				
				if(charact3.equalsIgnoreCase("hematófago")) {
					System.out.println("SANGUESSUGA.");
				} else if (charact3.equalsIgnoreCase("onívoro")){
					System.out.println("MINHOCA.");
				} else {
					System.out.println("Digite se seu animal é hematófago ou onívoro");
				}
			} else {
				System.out.println("Digite se seu animal é um inseto ou um anelídeo");
			}
			
			
		} else {
			System.out.println("Digite se seu animal é vertabrado ou invertebrado!");
		}
		
		read.close();
	}

}
