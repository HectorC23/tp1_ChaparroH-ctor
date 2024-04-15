package ar.edu.unju.fi.ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		8, 5, 1, 20, 9
		
		int a = 8;
		int b = 5;
		int c = 1;
		int d = 20;
		int e= 9;
		float promedio;
		
		promedio =(a + b + c + d + e)/5f;
		
		System.out.println(promedio);
		
		
		// en la parte de la division me tiraba un número entero si solo ponia 5, necesitaba 
		// especificar que la division era una division de tipo float y no una entera, 
		// por eso agregué el "5f" para que lo tomara asi, tambien pude haber usado la expresion:
		// promedio = (float)(a+b+c+d+e)/5
		// esto tambien convertia la expresión a float y asi evitaba la perdida de decimales.
		

	}

}
