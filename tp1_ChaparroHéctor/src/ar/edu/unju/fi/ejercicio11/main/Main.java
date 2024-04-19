package ar.edu.unju.fi.ejercicio11.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 40;
		
		for (int i = 2 ; j >= 0; i = i + 2) {
			
			j = j + 40;

            System.out.print((j) + " " );
            
            if (i == 2) {
				i = i + 1;
			}
            
            j = j - i;

		}
	}

}
