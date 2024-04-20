package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Jugador> jugadores = new ArrayList();
		
//		ArrayList arrayPlayers = new ArrayList;
		
		Jugador player = new Jugador("hector", "chaparro", LocalDate.parse("2000-04-21"), "Argentina", 1.64f , 55.500f, "delantero");
		Jugador player2 = new Jugador("lucas", "mamani", LocalDate.parse("2000-04-21"), "Perú", 1.64f , 55.500f, "delantero");
		
		System.out.println(player.calcularEdad());
		
		jugadores.add(player);
		jugadores.add(player2);
		System.out.println(jugadores.size());
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(player.getApellido().equals("chaparro"));
		jugadores.forEach(e -> System.out.println(e));
		System.out.println(jugadores.get(0).getApellido());
		
		int op;
		Jugador auxiliar = null;
		
		do {
			menu();
//			do {
//				
//				try {
//					
//					op = sc.nextInt();
//				} catch (Exception e) {
//					System.out.println("Error: " + e.getMessage());
//					sc.nextLine();
//				}
//				
//			} while (true);
			
			do {
	            try {
//	            	menu();
	                op = sc.nextInt();
	                if (op < 1 || op > 8) {
	                    throw new IllegalArgumentException("Elija una opcion entre 1 y 8: ");
	                }
	                // Si se ingresó un número válido, salir del bucle
	                break;
	            } catch (Exception e) {
	                // Capturar cualquier excepción que ocurra durante la lectura
	                System.out.println("Error: dato invalido, valor: " + e.getMessage());
	                // Limpiar el buffer del scanner para evitar bucles infinitos
	                sc.nextLine();
	            }
	        } while (true);
			
			switch (op) {
				case 1: altaJugador(jugadores);
						break;
						
				case 2: 
						auxiliar = buscarJugador(jugadores);
						if(auxiliar != null) {
							System.out.println(auxiliar.toString());
						} else {
							System.out.println("No encontrado");
						}
						break;
						
				case 3: 
						ordenarJugadores(jugadores);
						//jugadores.forEach(e -> System.out.println(e));
						mostrarJugadores(jugadores);
						break;
						
				case 4: 
						modificarJugador(jugadores);
						break;
						
				case 5:
						eliminarJugador(jugadores);
						break;
						
				case 6: 
						mostrarJugadores(jugadores);
						break;
						
				case 7:	
						filtroNacionalidad(jugadores);
						break;

			default:
				break;
			}
//			jugadores.forEach(e -> System.out.println(e));
//			sc.close();
			sc.nextLine();
		} while (op != 8);
		sc.close();

	}
	
	
	public static void menu() {
		System.out.println("\n----------------Menú de jugadores \nIngrese una opcion: ");
		System.out.println("1- Alta de Jugador");
		System.out.println("2 – Mostrar los datos del jugador (el usuario debe ingresar el nombre y el apellido)");
		System.out.println("3 – Mostrar todos los jugadores ordenados por apellido");
		System.out.println("4 – Modificar los datos de un jugador (el usuario debe ingresar el nombre y el apellido del jugador)");
		System.out.println("5 – Eliminar un jugador (el usuario debe ingresar el nombre y apellido. Utilice Iterator)");
		System.out.println("6 – Mostrar la cantidad total de jugadores que tiene el ArrayList");
		System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
		System.out.println("8 – Salir");	
	}
	
	public static void altaJugador(List jugadores) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----------------Menú Alta de jugador: ");
		System.out.println("Ingrese los datos del jugador: ");
		
		if(jugadores == null) {
			jugadores = new ArrayList<>();
		}
		
		System.out.println("Ingrese nombre del jugador: ");
		String nombre = sc.next();
		
		System.out.println("Ingrese apellido del jugador: ");
		String apellido = sc.next();
		
		String fechaNacimientoString;
		LocalDate fecha;
		do {
			System.out.println("Ingrese fecha de nacimiento del jugador(YYYY-MM-DD): ");
            try {
            	fechaNacimientoString = sc.next();
            	fecha = LocalDate.parse(fechaNacimientoString);
                break; // Salir del bucle si se ingresa una fecha válida
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar una fecha en el formato especificado.");
            }
        } while (true);
		
		System.out.println("Ingrese nacionalidad del jugador (PAIS): ");
		String nacionalidad = sc.next();

		float estatura;
		 do {
			 System.out.println("Ingrese estatura del jugador (1,54)m: ");
	            try {
	            	estatura = sc.nextFloat() ;
	                break; // Salir del bucle si se ingresa un número float válido
	            } catch (Exception e) {
	                System.out.println("Error: Debe ingresar un peso válido.");
	                sc.nextLine(); // Limpiar el buffer del scanner
	            }
	      } while (true);
		
		
		float peso;
		 do {
			 System.out.println("Ingrese peso del jugador (55,800)kg: ");
	            try {
	            	peso = sc.nextFloat();
	                break; // Salir del bucle si se ingresa un número float válido
	            } catch (Exception e) {
	                System.out.println("Error: Debe ingresar una estatura valida.");
	                sc.nextLine(); // Limpiar el buffer del scanner
	            }
	      } while (true);
		 
		 
		 String posicion;
		 do {
			 System.out.println("Ingrese posicion del jugador (delantero, medio, defensa, arquero): ");
	            try {
	            	posicion = sc.next();
	            	if (posicion.compareTo("delantero") != 0 && posicion.compareTo("medio") != 0 && posicion.compareTo("defensa") != 0 && posicion.compareTo("arquero") != 0) {
	                    throw new IllegalArgumentException("Elija una posicion valida (delantero, medio, defensa, arquero): ");
	                }
	                break; // Salir del bucle si se ingresa un número float válido
	            } catch (Exception e) {
	                System.out.println("Error: Debe ingresar una estatura valida.");
	                sc.nextLine(); // Limpiar el buffer del scanner
	            }
	      } while (true);

		jugadores.add(new Jugador(nombre, apellido, LocalDate.parse(fechaNacimientoString), nacionalidad, estatura, peso, posicion));	
		System.out.println("\n Jugador creado con exito\n ");
		
//		System.out.println(jugadores.get(jugadores.size()-1));
//		sc.close();
	}
	
	public static Jugador buscarJugador(List<Jugador> jugadores) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----------------Menú Mostrar Jugador: ");
		System.out.println("Ingresa el nombre: ");
		String nombreBuscado = sc.next();
		System.out.println("Ingresa el apellido: ");
		String apellidoBuscado = sc.next();
		
		Jugador jugadorEncontrado = null;
		if(jugadores == null) {
			System.out.println("\n La lista de jugadores está vacia\n ");
		} else {
			
			for(Jugador player : jugadores) {
				if(player.getApellido().compareTo(apellidoBuscado) == 0 && player.getNombre().compareTo(nombreBuscado)== 0) {
					jugadorEncontrado = player;
					break;
				}
			}
		}
//		sc.close();
		return jugadorEncontrado;
		
	}
	
	
	
	public static void modificarJugador(List<Jugador> jugadores) {
		
		Scanner sc = new Scanner(System.in);
		if(jugadores == null) {
			System.out.println("\n La lista de jugadores está vacia\n ");
		} else {
			System.out.println("\n----------------Interfaz Modificar Jugador: ");
			System.out.println("Ingresa el nombre: ");
			String nombreBuscado = sc.next();
			System.out.println("Ingresa el apellido: ");
			String apellidoBuscado = sc.next();
			for(Jugador player : jugadores) {
				
				if(player.getApellido().compareTo(apellidoBuscado) == 0 && player.getNombre().compareTo(nombreBuscado)== 0) {
					
					System.out.println("\n Ingrese los nuevos datos del jugador: \n ");
					System.out.println("Ingrese nuevo nombre del jugador: ");
					String nombre = sc.next();
					
					System.out.println("Ingrese nuevo apellido del jugador: ");
					String apellido = sc.next();
					
					String fechaNacimientoString;
					LocalDate fecha;
					do {
						System.out.println("Ingrese nueva fecha de nacimiento del jugador(YYYY-MM-DD): ");
			            try {
			            	fechaNacimientoString = sc.next();
			            	fecha = LocalDate.parse(fechaNacimientoString);
			                break; // Salir del bucle si se ingresa una fecha válida
			            } catch (Exception e) {
			                System.out.println("Error: Debe ingresar una fecha en el formato especificado.");
			            }
			        } while (true);
					
					
					System.out.println("Ingrese nueva nacionalidad del jugador (PAIS): ");
					String nacionalidad = sc.next();

					float estatura;
					 do {
						 System.out.println("Ingrese nueva estatura del jugador (1,54)m: ");
				            try {
				            	estatura = sc.nextFloat() ;
				                break; // Salir del bucle si se ingresa un número float válido
				            } catch (Exception e) {
				                System.out.println("Error: Debe ingresar un peso válido.");
				                sc.nextLine(); // Limpiar el buffer del scanner
				            }
				      } while (true);
					
					
					float peso;
					 do {
						 System.out.println("Ingrese nuevo peso del jugador (55,800)kg: ");
				            try {
				            	peso = sc.nextFloat();
				                break; // Salir del bucle si se ingresa un número float válido
				            } catch (Exception e) {
				                System.out.println("Error: Debe ingresar una estatura valida.");
				                sc.nextLine(); // Limpiar el buffer del scanner
				            }
				      } while (true);
					 
					 
					 String posicion;
					 do {
						 System.out.println("Ingrese nueva  posicion del jugador (delantero, medio, defensa, arquero): ");
				            try {
				            	posicion = sc.next();
				            	if (posicion.compareTo("delantero") != 0 && posicion.compareTo("medio") != 0 && posicion.compareTo("defensa") != 0 && posicion.compareTo("arquero") != 0) {
				                    throw new IllegalArgumentException("Elija una posicion valida (delantero, medio, defensa, arquero): ");
				                }
				                break; // Salir del bucle si se ingresa un número float válido
				            } catch (Exception e) {
				                System.out.println("Error: Debe ingresar una estatura valida.");
				                sc.nextLine(); // Limpiar el buffer del scanner
				            }
				      } while (true);
					
					player.setApellido(apellido);
					player.setNombre(nombre);
					player.setEstatura(estatura);
					player.setFechaNacimiento(LocalDate.parse(fechaNacimientoString));
					player.setPeso(peso);
					player.setPosicion(posicion);
					player.setNacionalidad(nacionalidad);
					
					System.out.println("\n Se modificó al jugador con exito \n ");
					break;
				}
			}
		}
//		sc.close();
		
	}
	
	
	public static void ordenarJugadores(List<Jugador> jugadores) {
		if(jugadores == null) {
			System.out.println("\n La lista de jugadores está vacia\n ");
		} else {
			jugadores.sort(Comparator.comparing(Jugador::getApellido));
		}
		
		
	}
	
	
	public static void eliminarJugador(List<Jugador> jugadores) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------- Interfaz Eliminar un Jugador: ");
		System.out.println("Ingresa el nombre: ");
		String nombreBuscado = sc.next();
		System.out.println("Ingresa el apellido: ");
		String apellidoBuscado = sc.next();
		
		Iterator<Jugador> iterator = jugadores.iterator();
		
		while(iterator.hasNext()) {
			Jugador player = iterator.next();
			if(player.getNombre().compareTo(nombreBuscado)==0 && player.getApellido().compareTo(apellidoBuscado)==0){
				iterator.remove();
				System.out.println("Se eliminó con exito al jugador: " + nombreBuscado + " " + apellidoBuscado);
				break;
			} else if (!iterator.hasNext()) {
				System.out.println("No se encontró al jugador: " + nombreBuscado + " " + apellidoBuscado);
			}
		}
//		sc.close();
	}
	
	public static void mostrarJugadores(List<Jugador> jugadores) {
		
		System.out.println("--------------- Interfaz Lista de Jugadores: ");
		
//		for(int i = 0;i < jugadores.size();i++) {
//			
//		}
		System.out.println("El Array de jugadores tiene en total: " + jugadores.size() + " jugadores");
		jugadores.forEach((e) -> System.out.println(e));
		
	}
	

	public static void filtroNacionalidad(List<Jugador> jugadores) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------- Lista de paises con la misma nacionalidad: ");
		System.out.println("Ingresa el nombre de la nacional a filtrar: ");
		String nacionalidadBuscada = sc.next();
		
		
//		jugadores.forEach(e -> if(e.getNacionalidad) {});
		
		Iterator<Jugador> iterator = jugadores.iterator();
		
		while(iterator.hasNext()) {
			Jugador player = iterator.next();
			if(player.getNacionalidad().compareTo(nacionalidadBuscada)==0){
				System.out.println(player.toString());
			}
		}
//		sc.close();
	}
	
	
}
