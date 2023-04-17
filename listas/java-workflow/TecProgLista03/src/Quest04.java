
public class Quest04 {

	public static int contagemElementos(int varVerificaNumero, int vetElementosA[], int vetElementosB[]) {
		
		int varOcorrencia = 0;
		
		for ( int i = 0; i < vetElementosA.length; i++ ) {
			
			if( varVerificaNumero == vetElementosA[i] ) {
				varOcorrencia++;
			}
			
		}
		
		for ( int i = 0; i < vetElementosB.length; i++ ) {
			
			if( varVerificaNumero == vetElementosB[i] ) { 
				varOcorrencia++;
			}
				
		}
		
		return varOcorrencia;
	}
	
	public static void main(String[] args) {
		
		int vetElementosA[] = new int [5];
		int vetElementosB[] = new int [5];
		
		vetElementosA[0] = 1;
		vetElementosA[1] = 3;
		vetElementosA[2] = 3;
		vetElementosA[3] = 2;
		vetElementosA[4] = 5;
		
		vetElementosB[0] = 1;
		vetElementosB[1] = 2;
		vetElementosB[2] = 3;
		vetElementosB[3] = 2;
		vetElementosB[4] = 4;
		
		int varVerificaNumero = 2;
		
		System.out.print("Valores do vetor A: ");
		
		for (int i = 0; i < vetElementosA.length; i++ ) {
			System.out.print(vetElementosA[i] + " ");
		}
		
		System.out.print("\nValores do vetor B: ");
		
		for (int i = 0; i < vetElementosB.length; i++ ) {
			System.out.print(vetElementosB[i] + " ");
		}
		
		System.out.println("\nNumero de ocorrencias do numero " + varVerificaNumero + " nos vetores A e B: " + contagemElementos(varVerificaNumero, vetElementosA, vetElementosB));

	}

}
