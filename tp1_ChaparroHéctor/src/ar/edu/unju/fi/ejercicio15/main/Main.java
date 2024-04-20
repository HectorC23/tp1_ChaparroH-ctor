package ar.edu.unju.fi.ejercicio15.main;

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
			
			System.out.println("Ingresa un nombre de persona: ");
			palabras[i] = sc.next();
			
		}
		System.out.println("\n El contenido del array invertido es: \n");
		for (int i = (palabras.length - 1); i >= 0; i--) {
			System.out.println("Indice: " + i + " - Nombre: " + palabras[i]);
		}
		sc.close();

	}

}
