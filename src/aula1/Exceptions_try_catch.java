package aula1;

public class Exceptions_try_catch {

	public static void main(String[]args) {
		
		try {
			int[] array = new int[5];
			
			System.out.println("Antes da excepetion");
			
			array[5] = 1;
			
			System.out.println("Esse texto não será impresso");
				
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao acessar um índice do vetor que não existe");
		}
		
		System.out.println("Esse texto será impresso após a exception");
		
	}
}
