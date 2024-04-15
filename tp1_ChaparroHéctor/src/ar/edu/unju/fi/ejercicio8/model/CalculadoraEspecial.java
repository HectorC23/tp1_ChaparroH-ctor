package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	
	
	private int n;
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
	public double calcularSumatoria() {
		
		double aux = 0;
		double acu = 0;
		
		for (int i = 1; i <= this.n; i++) {
			
			aux = (i * (i+1))/2 ;
			
			aux =Math.pow(aux,2);
			
			acu = (acu + aux);
			
		}
		
		return acu;
		
	}
	
	
public double calcularProductoria() {
		
		double aux = 0;
		double acu = 1;
		
		for (int i = 1; i <= this.n; i++) {
			
			aux = (i * (i+4)) ;
			
			acu = (acu * aux);
			
		}
		
		return acu;
		
	}
	
	
	
	
	
	

}
