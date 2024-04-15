package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Declare las variables necesarias para realizar el cálculo del factorial de un número que se introduce
//		por consola y está dentro del rango numérico [0,10]. Utilice una estructura de control iterativa While
//		para resolver el ejercicio. Muestre el resultado por consola.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero entre 0 y 10: ");
		Integer num = sc.nextInt();
		
		if ((num <= 10) && (num >= 0)) {
			int i = num;
			int acu = 1;
			
			while (i > 0) {
				
				acu = acu * i;
				
				i--;
				
			}
			
			System.out.println("El número ingresado fue: " + num + " , y el factorial de ese número es: " + acu);
			
			
			
		} else {
			System.out.println("Número no valido");
		}
		sc.close();

	}

}
