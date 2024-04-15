package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {

	
	
	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientesEspeciales;
	
	public static final int veinte = 500;
	public static final int treinta = 750;
	public static final int cuarenta = 1000;
	
	
	public Pizza() {
		
	}
	
	public void calcularPrecio(){
		
		
		if (this.diametro == 20) {
			if (!ingredientesEspeciales) {
				
				this.precio = 4500;
				
			} else {
				this.precio = 4500 + veinte; //5000
			}
			
		} else if(this.diametro == 30 ) {
			if (!ingredientesEspeciales) {
				
				this.precio =  4800;
				
			} else {
				this.precio =  4800 + treinta; //5500
			}
			

		} else {
			if (!ingredientesEspeciales) {
				
				this.precio =  5500;
				
			} else {
				this.precio =  5500 + cuarenta; //6500
			}
			
		}
		
	}
	
	public void calcularArea() {
		
		this.area = Math.PI * Math.pow((this.diametro/2),2);
		
	}
	
	
	
	
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	
	
	
	
	
}
