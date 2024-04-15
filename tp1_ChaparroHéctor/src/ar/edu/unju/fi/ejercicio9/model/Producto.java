package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	
	
	private String nombre;
	private String codigo;
	private double precio;
	private int descuento;
	
	//tomo el descuento como porcentaje 
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public double calcularDescuento() {
		
		if (this.descuento > 0) {
			double aux = 1 - (this.descuento / 100);
			
			this.precio = this.precio * aux;
			
			
		}
		
		return this.precio;
	}
	
	

	public String mostrarProducto() {
		return "Nombre del producto: " + nombre + ", codigo: " + codigo + ", precio: " + precio + ", descuento: " + descuento + "%" + (descuento > 0 && descuento <=50 ? (", Precio con descuento: " + descuento) : "");
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
