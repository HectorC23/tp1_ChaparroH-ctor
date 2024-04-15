package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero entre 1 y 9: ");
		Integer num = sc.nextInt();
		

		if ((num <= 9) && (num >= 1)) {
			
			System.out.println("Tabla de multiplicar del número: " + num);
			
			for (int i = 0; i <= 10; i++) {
				
				System.out.println(num + " * " + i + " = " + (num*i) );
				
			}
			
		} else {
			System.out.println("Número no valido");
		}
		sc.close();
		
	}

}
