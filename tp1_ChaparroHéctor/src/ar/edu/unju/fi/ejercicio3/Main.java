package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		Solicitar al usuario que ingrese por consola un número entero que debe ser almacenado en una
//		variable (Investigue como utilizar la clase Scanner para poder ingresar datos por consola).
//		Si el número ingresado es impar mostrar el doble del número y si es par mostrar el triple del número
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero: ");
		
		Integer num = sc.nextInt();
		
		if ((num % 2) == 0) {
			System.out.println("El número es par, su triple es: " +num*3);
		} else {
			System.out.println( "El número es impar, su doble es: " + num*2);
		}
		
		sc.close();
	}

}
