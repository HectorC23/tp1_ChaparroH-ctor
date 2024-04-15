package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Persona pedro = new Persona();
		
		System.out.println("Ingrese el DNI: ");
		String nombre = sc.next();
		System.out.println("Ingrese el Nombre: ");
		String dni = sc.next();
		System.out.println("Ingrese la fecha de nacimiento (YYY-MM-DD) con los guiones: ");
		String fecha = sc.next();
		System.out.println("Ingrese la provincia de origen: ");
		String provincia = sc.next();
		
		pedro.setNombre(nombre);
		pedro.setDni(dni);
		pedro.setFechaDeNacimiento(LocalDate.parse(fecha));
		pedro.setProvincia("Jujuy");

		System.out.println(pedro.mostrarDatos());
		
		//---------------------------------------------------
		
		System.out.println("Nueva Persona:\nIngrese el DNI: ");
		nombre = sc.next();
		System.out.println("Ingrese el Nombre: ");
		dni = sc.next();
		System.out.println("Ingrese la fecha de nacimiento (YYY-MM-DD) con los guiones: ");
		fecha = sc.next();
		System.out.println("Ingrese la provincia de origen: ");
		provincia = sc.next();
		
		Persona hector = new Persona(dni,nombre,LocalDate.parse(fecha),provincia);
		System.out.println(hector.mostrarDatos());
		
		//---------------------------------------------------
		
		System.out.println("Nueva Persona:\nIngrese el DNI: ");
		nombre = sc.next();
		System.out.println("Ingrese el Nombre: ");
		dni = sc.next();
		System.out.println("Ingrese la fecha de nacimiento (YYY-MM-DD) con los guiones: ");
		fecha = sc.next();
		
		Persona lucas = new Persona(dni,nombre,LocalDate.parse(fecha));
		System.out.println(lucas.mostrarDatos());
		
		
		sc.close();

	}

}
