package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {

	private String dni;
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String provincia;
	
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = provincia;
	}
	
	
	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = "Jujuy";
	}
	
	
	public int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		if ((fechaActual.getYear() > fechaDeNacimiento.getYear()) && (fechaActual.getMonthValue() >= fechaDeNacimiento.getMonthValue()) && (fechaActual.getDayOfMonth() >= fechaDeNacimiento.getDayOfMonth()) ) {
			return (fechaActual.getYear()-fechaDeNacimiento.getYear());	
		}
		return (fechaActual.getYear()-fechaDeNacimiento.getYear()-1);	
	}
	
	public boolean mayorDeEdad() {
		
		return this.calcularEdad() >= 18;
			
	}
	
	
	public String mostrarDatos() {
		
		if (this.mayorDeEdad()) {
			return "Los Datos de la persona son: \nDNI = " + dni + ", nombre = " + nombre + ", fechaDeNacimiento = " + fechaDeNacimiento
					+ ", provincia=" + provincia + ", La persona es mayor de edad” ";
		} else {
			return "Los Datos de la persona son: \nDNI = " + dni + ", nombre = " + nombre + ", fechaDeNacimiento = " + fechaDeNacimiento
					+ ", provincia=" + provincia + ", La persona no es mayor de edad";
		}
		
		
	}
	
	
	


	


	public String getDni() {
		return dni;
	}
	
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	

}
