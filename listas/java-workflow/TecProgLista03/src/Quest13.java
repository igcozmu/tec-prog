
public class Quest13 {

	public static int[] buscaPorOcorrencia ( int vetElementosA[], int vetElementosB[] ) {
		
		int varTamVet = 0;
		
		if ( vetElementosA.length > vetElementosB.length ) {
			
			varTamVet = vetElementosA.length;
			
		} else {
			
			varTamVet = vetElementosB.length;
			
		}
		
		int vetAux[] = new int [varTamVet];
		int cont = 0;
		
		for ( int i = 0; i < vetElementosA.length; i++ ) {
			
			for ( int j = 0; j < vetElementosB.length; j++ ) {
				
				if ( vetElementosA[i] == vetElementosB[j] ) {
					
					vetAux[cont] = vetElementosA[i];
					
					cont++;
					
				}
				
			}
			
		}
		
		int vetOcorrencias[] = new int [cont]; 
		
		for ( int i = 0; i < cont; i++ ) {
			
			vetOcorrencias[i] = vetAux[i];
			
		}
		
		return vetOcorrencias;
		
	}
	
	public static void main(String[] args) {
		
		int vetElementosA[] = {2, 4, 6, 8, 10, 12, 14, 16};
		int vetElementosB[] = {2, 4, 5, 7, 9, 11, 13, 15};
		
		System.out.print("Elementos do Vetor A: ");
		for ( int i = 0; i < vetElementosA.length; i++ ) {
			System.out.print(vetElementosA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Elementos do Vetor B: ");
		for ( int i = 0; i < vetElementosB.length; i++ ) {
			System.out.print(vetElementosB[i] + " ");
		}
		
		int vetOcorrencia[] = buscaPorOcorrencia(vetElementosA, vetElementosB);
		
		System.out.println();
		
		System.out.print("Vetor Ocorrencias: ");
		for ( int i = 0; i < vetOcorrencia.length; i++ ) {
			System.out.print(vetOcorrencia[i] + " ");
		}
		

	}

}
