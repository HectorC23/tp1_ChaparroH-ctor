package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	private String nombre;
	private String legajo;
	private double salario;
	
	public static final double minimo = 210000.00;
	public static final double aumentoMerito = 20000.00;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Empleado(String nombre, String legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario >= minimo ? salario : minimo;
	}


	public String mostrarDatos() {
		return "Nombre del empleado: " + nombre + "\nLegajo: " + legajo + "\nSalario $: " + salario;
	}
	
	public void darAumento() {
		
		this.salario= this.salario + aumentoMerito;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
