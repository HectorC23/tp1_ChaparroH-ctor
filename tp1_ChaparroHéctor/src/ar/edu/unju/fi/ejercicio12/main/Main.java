package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		Persona persona = new Persona();
		
		Calendar hoy = Calendar.getInstance();
		
		
		System.out.println("Ingrese el nombre de la persona: ");
		String nombre = sc.next();
		System.out.println("Ingrese el año de nacimiento en formato (DD,MM,YYYY): ");
		String fechaString = sc.next();
		
		int d = Integer.parseInt(fechaString.substring(0, fechaString.indexOf(",")));
		int m = Integer.parseInt( fechaString.substring(fechaString.indexOf(",")+1,fechaString.lastIndexOf(",") ));
		int a = Integer.parseInt(fechaString.substring(fechaString.lastIndexOf(",")+ 1));
		
		
		hoy.set(a,m - 1,d);
		
//		System.out.println(hoy.getTime());
//		System.out.println(d);
//		System.out.println(m);
//		System.out.println(a);
		
		persona.setNombre(nombre);
		persona.setFechaDeNacimiento( hoy );
		
		
		System.out.println(persona.getNombre());
		System.out.println(persona.getFechaDeNacimiento().getTime());
		
		// ESTA ES UNA MANERA EN COMO LO HICE USANDO LAS VARIABLES QUE DEFINÍ ANTES
		System.out.println("\n");
		System.out.println( "Nombre: " + persona.getNombre() + "\nFecha nacimiento: " + d + "/" + m + "/" + a + "\nEdad: " + persona.cuantosAniosTiene() + "\nSigno del zodiaco: " + persona.singoDelZodiaco() + "\nEstacion: " + persona.estacionDelAnio() );
		
		// SI LO HAGO TOMANDO LOS DATOS DEL OBJETO SERIA:
		System.out.println("\n");
		System.out.println( "Nombre: " + persona.getNombre() + "\nFecha nacimiento: " + persona.getFechaDeNacimiento().get(Calendar.DAY_OF_MONTH) + "/" + (persona.getFechaDeNacimiento().get(Calendar.MONTH)+1) + "/" + persona.getFechaDeNacimiento().get(Calendar.YEAR) + "\nEdad: " + persona.cuantosAniosTiene() + "\nSigno del zodiaco: " + persona.singoDelZodiaco() + "\nEstacion: " + persona.estacionDelAnio() );
		
		// SI LO QUE TENIA QUE HACER PARA MOSTRAR LOS DATOS ERA UN METODO, ENTONCES SE INVOCARIA ASI EL TOSTRING: 
		System.out.println("\n");
		System.out.println(persona.toString());
		
		sc.close();
	}

}
