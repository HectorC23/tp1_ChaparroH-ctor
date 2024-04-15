package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Producto producto = new Producto();
		
		// no pide arrays
		String nombre;
		String codigo;
		double precio;
		int descuento;
		
		int i = 3;
		
		do {
			
			System.out.println("Ingrese el Nombre del producto: ");
			nombre = sc.next();
			System.out.println("Ingrese el código del producto: ");
			codigo = sc.next();
			System.out.println("Ingrese el precio del producto: ");
			precio = sc.nextDouble();
			System.out.println("Ingrese el descuento que tiene el producto, entre [0,50]%: ");
			descuento = sc.nextInt();
			while (descuento < 0 || descuento > 50) {
				System.out.println("\n Error \nIngrese el descuento que tiene el producto, entre [0,50]%: ");
				descuento = sc.nextInt();
			}
			
			producto.setNombre(nombre);
			producto.setCodigo(codigo);
			producto.setPrecio(precio);	
			producto.setDescuento(descuento);
			
			System.out.println(producto.mostrarProducto());
			i--;
		} while (i>0);
		
		sc.close();
		

	}

}
