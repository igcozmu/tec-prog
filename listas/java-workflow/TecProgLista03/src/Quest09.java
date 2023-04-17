
public class Quest09 {

	public static int kesimoMenorValor( int varK, int vetElementos[]) {
		
		int aux = 0;

			for(int i = 0; i < vetElementos.length; i++ ) {
				
				for ( int j = 0; j < (vetElementos.length - 1); j++ ) {
					
					if (vetElementos[j] > vetElementos[j + 1]) {
						
						aux = vetElementos[j];
						
						vetElementos[j] = vetElementos[j + 1];
						
						vetElementos[j + 1] = aux;
						
					}
					
				}
				
			}
			
		return vetElementos[varK-1];
	
	}
	
	public static void main(String[] args) {
		
		int vetElementos[] = {1, 5, 7, 9, 10, 8, 2};
		int varK = 5;
		
		System.out.print("Elementos do vetor: ");
		for ( int i = 0; i < vetElementos.length; i++ ) {
			System.out.print(vetElementos[i] + " ");
		}
		System.out.println("\nK-esimo valor: " + varK);
		
		if ( varK <= 0 || varK > vetElementos.length  ) {
			
			System.out.println("Valor de K invalido para o tamanho do vetor!");

		} else {
		
			System.out.println("\nO "+ varK + " menor valor do vetor eh: " + kesimoMenorValor(varK, vetElementos));
		
		}

	}

}
