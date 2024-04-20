package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número entre 5 y 10: ");
		int n;
//		boolean band = false;
		
		do {
			
			n = sc.nextInt();
			
			if (n < 5 || n >10) {
				System.out.println("Número no valido, ingrese otro: ");
			}
			
		} while (n < 5 || n >10);
		
		System.out.println("\n Lista creada\n");
		
		String[] palabras = new String[n];
		
		for (int i = 0; i < palabras.length; i++) {
			
			System.out.println("Ingresa un número entero: ");
			palabras[i] = sc.next();
			
		}
		
		int acu = 0;
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Indice: " + i + " - Número: " + palabras[i]);
			acu = acu + Integer.parseInt(palabras[i]);
		}
		
		System.out.println("La suma de todos los valores del array es: " + acu);

		sc.close();
	}

}
