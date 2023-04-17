
public class Quest01 {

	public static int somatorio(int vetElementos[]) {
		
		int varSomatorio = 0;
		
		for ( int i = 2; i <  (vetElementos.length) - 2; i++ ) {
			
			varSomatorio += vetElementos[i];
			
		}
		
		return varSomatorio;
	}
	
	public static void main(String[] args) {
		
		int vetElementos[] = new int [10];
		
		System.out.print("Valores do vetor: ");
		
		for (int i = 0; i < vetElementos.length; i++ ) {
			vetElementos[i] = i+1;
			System.out.print(vetElementos[i] + " ");
		}
		
		System.out.println("\nResultado da soma do vetor menos as duas primeiras e ultimas posicoes: " + somatorio(vetElementos));

	}

}
