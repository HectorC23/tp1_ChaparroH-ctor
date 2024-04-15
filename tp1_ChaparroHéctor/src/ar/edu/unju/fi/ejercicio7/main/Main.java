package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingrese el Nombre: ");
		String nombre = sc.next();
		System.out.println("Ingrese el Legajo: ");
		String legajo = sc.next();
		System.out.println("Ingrese el Salario (con coma): ");
		double salario = sc.nextDouble();
		
		
		Empleado hector = new Empleado(nombre, legajo, salario);
		
		
		System.out.println(hector.mostrarDatos());
		
		hector.darAumento();
		System.out.println(hector.mostrarDatos());
		

	}

}
