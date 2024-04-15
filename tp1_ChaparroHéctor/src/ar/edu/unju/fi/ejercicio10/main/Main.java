package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		Pizza producto = new Pizza();
		
		int diametro;
		boolean ingredientesEspeciales;

		
		int i = 1;
		
		do {
			System.out.println("Ingrese el Diametro de la pizza (pequeña: 20, mediana: 30, grande: 40): ");
			diametro = sc.nextInt();
			while (diametro != 20 && diametro != 30 && diametro != 40) {
				System.out.println("\n Error \nIngrese el Diametro de la pizza (pequeña: 20, mediana: 30, grande: 40): ");
				diametro = sc.nextInt();
			}
			
			System.out.println("Tiene ingredientes especiales (si: \"true\", no: \"false\" ");
			ingredientesEspeciales = sc.nextBoolean();
			
			producto.setDiametro(diametro);
			producto.setIngredientesEspeciales(ingredientesEspeciales);

			producto.calcularPrecio();
			producto.calcularArea();

			
			System.out.println("	** Pizza " + i + " ** \n Diámetro = " + diametro + "\n Ingredientes especiales = " + ingredientesEspeciales + "\n Preccio Pizza = " + producto.getPrecio() + "$ \n Área de la pizza = " + producto.getArea()+"\n");
			
			
			i++;
		} while ( i <= 3);
		
		
		sc.close();
	}

}
