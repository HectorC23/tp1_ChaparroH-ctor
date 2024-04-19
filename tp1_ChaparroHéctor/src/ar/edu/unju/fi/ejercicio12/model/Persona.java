package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	
	
	private String nombre;
	private Calendar fechaDeNacimiento;
	
	public Persona () {
		// TODO Auto-generated constructor stub
	}
	
	
	public int cuantosAniosTiene() {
		
		Calendar hoy = Calendar.getInstance();
		
		if ((hoy.get(Calendar.YEAR) > fechaDeNacimiento.get(Calendar.YEAR)) && (hoy.get(Calendar.MONTH) >= fechaDeNacimiento.get(Calendar.MONTH)) && (hoy.get(Calendar.DAY_OF_MONTH) >= fechaDeNacimiento.get(Calendar.DAY_OF_MONTH))) {
			return (hoy.get(Calendar.YEAR)- fechaDeNacimiento.get(Calendar.YEAR));	
		}
		
		
		return (hoy.get(Calendar.YEAR) - fechaDeNacimiento.get(Calendar.YEAR) - 1);	
	}
	
	
	public String singoDelZodiaco() {
//	Aries: 21 de marzo - 19 de abril					+
//	Tauro: 20 de abril - 20 de mayo						+
//	Géminis: 21 de mayo - 20 de junio					+
//	Cáncer: 21 de junio - 22 de julio					+
//	Leo: 23 de julio - 22 de agosto						+
//	Virgo: 23 de agosto - 22 de septiembre				+
//	Libra: 23 de septiembre - 22 de octubre				+
//	Escorpio: 23 de octubre - 21 de noviembre			+
//	Sagitario: 22 de noviembre - 21 de diciembre		+
//	Capricornio: 22 de diciembre - 19 de enero			+
//	Acuario: 20 de enero - 18 de febrero				+
//	Piscis: 19 de febrero - 20 de marzo					+
	
		String 	signo;
		switch (fechaDeNacimiento.get(Calendar.MONTH)) {
			case 0:
				if (fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 20) {
					signo = "Capricornio";
				} else {
					signo = "Acuario";
				}
				break;
			case 1:
				if (fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 19) {
					signo = "Acuario";
				} else {
					signo = "Piscis";
				}
				break;
			case 2:
				if (fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 21) {
					signo = "Piscis";
				} else {
					signo = "Aries";
				}
				break;
			case 3:
				if (fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 20) {
					signo = "Aries";
				} else {
					signo = "Tauro";
				}
				break;
			case 4:
				if (fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 21) {
					signo = "Tauro";
				} else {
					signo = "Géminis";
				}
				break;
			case 5:
				if (fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 21) {
					signo = "Géminis";
				} else {
					signo = "Cáncer";
				}
				break;
			case 6:
				if (fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 23) {
					signo = "Cáncer";
				} else {
					signo = "Leo";
				}
				break;
			case 7:
				if (fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 23) {
					signo = "Leo";
				} else {
					signo = "Virgo";
				}
				break;
			case 8:
				if (fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 23) {
					signo = "Virgo";
				} else {
					signo = "Libra";
				}
				break;
			case 9:
				if (fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 23) {
					signo = "Libra";
				} else {
					signo = "Escorpio";
				}
				break;
			case 10:
				if (fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 22) {
					signo = "Escorpio";
				} else {
					signo = "Sagitario";
				}
				break;
			case 11:
				if (fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 22) {
					signo = "Sagitario";
				} else {
					signo = "Capricornio";
				}
				break;

			default:
				signo = "No nacio"
				;
		}
		
		return signo;
	}

	public String estacionDelAnio() {
		
		String estacion;
		
		if ((fechaDeNacimiento.get(Calendar.MONTH) <= 2) && ( fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 22 )) {
			estacion = "Verano";
		} else if( (fechaDeNacimiento.get(Calendar.MONTH) <= 5) && ( fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 22 ) ) {
			estacion = "Otoño";
		} else if( (fechaDeNacimiento.get(Calendar.MONTH) <= 8) && ( fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 22 ) ) {
			estacion = "Invierno";
		} else {
			estacion = "Primavera";
		}
		return estacion;
	}
	
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Calendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
		// AQUÍ USÉ UN CLONE DE FECHA, YA QUE SI SOLO USABA FECHA PARA DEFINIRLO ME TIRABA ALGO QUE NO ENTENDIA
		this.fechaDeNacimiento = (Calendar)  fechaDeNacimiento.clone();
	}


	@Override
	public String toString() {
		return ("Nombre: " + this.getNombre() + "\nFecha nacimiento: " + this.getFechaDeNacimiento().get(Calendar.DAY_OF_MONTH) + "/" + (this.getFechaDeNacimiento().get(Calendar.MONTH)+1) + "/" + this.getFechaDeNacimiento().get(Calendar.YEAR) + "\nEdad: " + this.cuantosAniosTiene() + "\nSigno del zodiaco: " + this.singoDelZodiaco() + "\nEstacion: " + this.estacionDelAnio());

	}
	
	

	
	
	
	
	
}
