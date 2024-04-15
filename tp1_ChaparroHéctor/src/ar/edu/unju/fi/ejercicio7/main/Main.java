package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Empleado hector = new Empleado("Hector", "F-18", 220000);
		
		
		System.out.println(hector.mostrarDatos());
		
		hector.darAumento();
		System.out.println(hector.mostrarDatos());
		

	}

}
