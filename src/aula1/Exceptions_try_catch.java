package aula1;

public class Exceptions_try_catch {

	public static void main(String[]args) {
		
		try {
			int[] array = new int[5];
			
			System.out.println("Antes da excepetion");
			
			array[5] = 1;
			
			System.out.println("Esse texto n�o ser� impresso");
				
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao acessar um �ndice do vetor que n�o existe");
		}
		
		System.out.println("Esse texto ser� impresso ap�s a exception");
		
	}
}
