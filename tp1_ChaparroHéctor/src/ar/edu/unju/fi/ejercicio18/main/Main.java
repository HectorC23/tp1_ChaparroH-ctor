package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	
	private static List<Pais> arrayPaises = new ArrayList<Pais>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		arrayPaises.add(new Pais("A101", "Francia"));
		arrayPaises.add(new Pais("A102", "Argentina"));
		arrayPaises.add(new Pais("A103", "Polonia"));
		
		
		List<DestinoTuristico> arrayDestinos = new ArrayList<DestinoTuristico>();
		
		arrayDestinos.add(new DestinoTuristico("beta", "segundo", 350000f, arrayPaises.get(1), 10));
		arrayDestinos.add(new DestinoTuristico("pi", "tercero", 58620f, arrayPaises.get(2), 30));
		arrayDestinos.add(new DestinoTuristico("alfa", "primero", 2000f, arrayPaises.get(0), 20));
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		
		do {
		//	menu();
			
			do {
	            try {
	            	menu();
	                op = sc.nextInt();
	                if (op < 1 || op > 9) {
	                    throw new IllegalArgumentException("Elija una opcion entre 1 y 9: ");
	                }
	                // Si se ingresó un número válido, salir del bucle
	                break;
	            } catch (Exception e) {
	                // Capturar cualquier excepción que ocurra durante la lectura
	                System.out.println("Error: dato invalido: " + e.getMessage());
	                // Limpiar el buffer del scanner para evitar bucles infinitos
	                sc.nextLine();
	            }
	        } while (true);
			
			switch (op) {
				case 1: altaDestino(arrayDestinos);
						break;
						
				case 2: 
						mostrarDestinos(arrayDestinos);
						break;
						
				case 3: 
						modificarDestino(arrayDestinos);
						break;
						
				case 4: 
						arrayDestinos.clear();
						System.out.println("--------------- SE ELIMINARON TODOS LOS DESTINOS -------------- ");
						break;
						
				case 5:
						eliminarUnDestino(arrayDestinos);
						break;
						
				case 6: 
						ordenarDestinos(arrayDestinos);
						break;
						
				case 7:	
						System.out.println("--------------- Interfaz Lista de Paises: ");
						
						System.out.println("El total de Paises disponibles es de: " + arrayPaises.size());
						arrayPaises.forEach((e) -> System.out.println(e.toString()));
						break;
						
				case 8: 
						filtroPais(arrayDestinos);
						break;

			default:
				break;
			}
//			jugadores.forEach(e -> System.out.println(e));
//			sc.close();
			sc.nextLine();
		} while (op != 9);
		sc.close();
		
		
		
	}
	
	public static void menu() {
		System.out.println("\n----------------Menú de Destinos \nIngrese una opcion: ");
		System.out.println("1 – Alta de destino turístico (para asociar el país se ingresa el código de páis).");
		System.out.println("2 – Mostrar todos los destinos turísticos.");
		System.out.println("3 – Modificar el país de un destino turístico.");
		System.out.println("4 – Limpiar el ArrayList de destino turísticos.");
		System.out.println("5 – Eliminar un destino turístico (el usuario debe ingresar el código del destino turístico. Utilice Iterator). ");
		System.out.println("6 – Mostrar los destinos turísticos ordenados por nombre");
		System.out.println("7 –  Mostrar todos los países.");
		System.out.println("8 – Mostrar los destinos turísticos que pertenecen a un país");	
		System.out.println("9 – Salir");	
	}
	
	
	
	public static void altaDestino(List<DestinoTuristico> arrayDestinos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----------------Menú Alta de Destino: ");
		System.out.println("Ingrese los datos del destino turistico: ");
		
		if(arrayDestinos == null) {
			arrayDestinos = new ArrayList<>();
		}
		
		System.out.println("Ingrese Codigo del Destino Turistico: ");
		String codigo = sc.next();
		
		System.out.println("Ingrese nombre del Destino Turistico: ");
		String nombre = sc.next();
		
		float precio;
		 do {
			 System.out.println("Ingrese precio: ");
	            try {
	            	precio = sc.nextFloat() ;
	                break; // Salir del bucle si se ingresa un número float válido
	            } catch (Exception e) {
	                System.out.println("Error: Debe ingresar un presio válido.");
	                sc.nextLine(); // Limpiar el buffer del scanner
	            }
	      } while (true);
		 
		 
		 Pais pais = null;
		 String codigoPais;
			do {
				System.out.println("Ingrese Codigo del pais(A101 // A102 // A103 ): ");
	            try {
	            	codigoPais = sc.next();
	            	if (codigoPais.compareTo("A101") != 0 && codigoPais.compareTo("A102") != 0 && codigoPais.compareTo("A103") != 0) {
	                    throw new IllegalArgumentException("Elija un codigo valida (A101 // A102 // A103 ): ");
	                }
	                break;
	            } catch (Exception e) {
	                System.out.println("Error: Debe ingresar un codigo de destino valido");
	            }
	        } while (true);
			
		int dias;
		do {
			System.out.println("Ingrese Cantidad de días: ");
            try {
            	dias = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error: dato invalido, valor: " + e.getMessage());
                sc.nextLine();
            }
        } while (true);
		
		Iterator<Pais> iterator = arrayPaises.iterator();
		while(iterator.hasNext()) {
			Pais p = iterator.next();
			if(p.getCodigo().compareTo(codigoPais)==0){
				pais = p;
			}
		}
		
		arrayDestinos.add(new DestinoTuristico(codigoPais, nombre, precio, pais, dias));
		System.out.println("\n Destino Turistico creado con exito\n ");
		
		System.out.println(arrayDestinos.get(arrayDestinos.size()-1));
	}
	
	
	public static void mostrarDestinos(List<DestinoTuristico> arrayDestinos) {
		
		System.out.println("--------------- Interfaz Lista de Destinos Turisticos: ");
		
		System.out.println("El total de Destinos disponibles de: " + arrayDestinos.size());
		arrayDestinos.forEach((e) -> System.out.println(e.toString()));
		
	}
	
	
	public static void modificarDestino(List<DestinoTuristico> arrayDestinos) {
		Scanner sc = new Scanner(System.in);
		if(arrayDestinos == null) {
			System.out.println("\n La lista de jugadores está vacia\n ");
		} else {
			System.out.println("\n----------------Interfaz Modificar Destino Turistico: ");
			System.out.println("Ingresa el codigo del Destino Turistico: ");
			String destinoBuscado = sc.next();
			
			for(DestinoTuristico destini : arrayDestinos) {
				
				
				if(destini.getCodigo().compareTo(destinoBuscado) == 0) {
					
					
					
					Pais pais = null;
					 String codigoPais;
						do {
							System.out.println("Ingrese Codigo del nuevo pais(A101 // A102 // A103 ): ");
				            try {
				            	codigoPais = sc.next();
				            	if (codigoPais.compareTo("A101") != 0 && codigoPais.compareTo("A102") != 0 && codigoPais.compareTo("A103") != 0) {
				                    throw new IllegalArgumentException("Elija un codigo valida (A101 // A102 // A103 ): ");
				                }
				                break;
				            } catch (Exception e) {
				                System.out.println("Error: Debe ingresar un codigo de destino valido");
				            }
				        } while (true);
						
					Iterator<Pais> iterator = arrayPaises.iterator();
					while(iterator.hasNext()) {
						Pais p = iterator.next();
						if(p.getCodigo().compareTo(codigoPais)==0){
							pais = p;
						}
					}
						
					destini.setPais(pais);
					System.out.println("\n Destino encontrado y modificado \n ");
					
				} else if (arrayDestinos.get(arrayDestinos.size()-1) == destini ) {
					System.out.println("\n Destino no encontrado \n ");
				}
					
			}
		}
		
		
	}




	public static void eliminarUnDestino(List<DestinoTuristico> arrayDestinos) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------- Interfaz Eliminar un Destino Turistico: ");
		System.out.println("Ingresa el codigo del Destino Turistico: ");
		String destinoBuscado = sc.next();
		
		Iterator<DestinoTuristico> iterator = arrayDestinos.iterator();
		while(iterator.hasNext()) {
			DestinoTuristico destini = iterator.next();
			if(destini.getCodigo().compareTo(destinoBuscado)==0){
				iterator.remove();
				System.out.println("Se eliminó con exito al Destino: " + destinoBuscado);
				break;
			} else if (arrayDestinos.get(arrayDestinos.size()-1) == destini ) {
				System.out.println("\n Destino no encontrado \n ");
			}
		}
		
	}
	
	
	
	public static void ordenarDestinos(List<DestinoTuristico> arrayDestinos) {
		if(arrayDestinos == null || arrayDestinos.size()==0) {
			System.out.println("\n La lista de jugadores está vacia\n ");
		} else {
			System.out.println("\n ENTRE\n ");
			arrayDestinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
			mostrarDestinos(arrayDestinos);
		}
	}
	
	
	
	//8
	
public static void filtroPais(List<DestinoTuristico> arrayDestinos) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------- Lista de Destinos que le pertenecen a un pais: ");
		System.out.println("Ingresa el codigo del Pais a filtrar (A101 // A102 // A103 ): ");
		String paisFiltro = sc.next();
		
		
//		jugadores.forEach(e -> if(e.getNacionalidad) {});
		int cont = 0;
		Iterator<DestinoTuristico> iterator = arrayDestinos.iterator();
		while(iterator.hasNext()) {
			DestinoTuristico destini = iterator.next();
			if(destini.getPais().getCodigo().compareTo(paisFiltro)==0){
				cont++;
				System.out.println(destini.toString());
			}
		}
		System.out.println("\nLa cantidad total de Destinos que le pertenecen al pais: " + paisFiltro + ", es de: " + cont + " Destino/s");
//		sc.close();
	}
	
	
	
	
	

}
