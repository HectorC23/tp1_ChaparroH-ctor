package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] nombres = new String[5];
		int i;
		
		for (i = 0; i < nombres.length; i++) {
			
			System.out.println("Ingresa un nombre de persona: ");
			nombres[i] = sc.next();
			
		}
		i= 0;
		System.out.println("\n El contenido del arreglo es: \n");
		while( i < nombres.length) {
			System.out.println("Indice: " + i + " - Nombre: " + nombres[i]);
			i++;
		}
		
		System.out.println("\n El Tamaño del arreglo es : " + nombres.length);
		
		
		System.out.println("\n Ingrese un número entre 1 y 5 para eliminar del arreglo: ");
		
		byte n;
		do {
			
			n = sc.nextByte();
			
			if (n < 1 || n >5) {
				System.out.println("Número no valido, ingrese otro: ");
			}
			
		} while (n < 1 || n >5);
		
		
		// NO SABIA SI HABIA QUE BORRAR CON FOR O UN DO WHILE;
		// ACÁ BORRADO POR FOR
//		for (int j = (n-1); j < nombres.length-1; j++) {
//			nombres[j] = nombres[j + 1];
//		}
//		nombres[4] = "";
		
		// ACÁ BORRADO POR DO WHILE;
		int k = n-1;
		do {
			if(k != 4) {
				nombres[k] = nombres[k+1];
				k++;
			}
			
		} while (k < nombres.length-1);
		nombres[k] = "";

		for (i = 0; i < nombres.length; i++) {
			System.out.println("Indice: " + i + " - Nombre: " + nombres[i]);
		}
		
		sc.close();
	}

}
