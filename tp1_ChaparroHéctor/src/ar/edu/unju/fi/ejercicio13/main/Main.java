package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] elements = new int[8];
		
		System.out.println("Ingrese 8 números enteros (por separado): ");
		
		for (int i = 0; i < elements.length; i++) {
			
//			System.out.println("");
			elements[i] = sc.nextInt();
			
		}
		
		System.out.println("\n Lista de números: ");
		
		for (int i = 0; i < elements.length; i++) {
			System.out.println("Indice: " + i + " - Número: " + elements[i]);
		}

		sc.close();
	}

}
