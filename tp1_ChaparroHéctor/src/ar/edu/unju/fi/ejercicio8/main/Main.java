package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Ingrese un número: ");
		int num = sc.nextInt();
		
		CalculadoraEspecial n = new CalculadoraEspecial();
		n.setN(num);
		
		double sumatoria = n.calcularSumatoria();
		System.out.println("La sumatoria es: "+sumatoria);
		double productoria = n.calcularProductoria();
		System.out.println("La productoria es: " + productoria);
		
		
		sc.close();
		

	}

}
