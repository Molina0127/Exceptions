package aula4;

public class Exceptions_generico {

	public static void main(String[]args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for(int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i]+"/"+demon[i]+" = " + (numeros[i]/demon[i]));
			}
			catch(Exception e1) {
				System.out.println(e1.getMessage());
				e1.printStackTrace();
			}
			
			
			
		}
	}
}
