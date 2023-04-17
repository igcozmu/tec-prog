
public class Quest14 {

	public static int[] remocaoElementosVetor( int vetElementos[], int varNumero ) {
		
		int cont = 0;
		
		for ( int i = 0; i < vetElementos.length; i++ ) {

			if ( vetElementos[i] != varNumero ) {
				
				cont++;
				
			}
			
		}
		
		int vetAux[] = new int[cont];
		
		cont = 0;
		
		for ( int i = 0; i < vetElementos.length; i++ ) {

			if ( vetElementos[i] != varNumero ) {
				
				vetAux[cont] = vetElementos[i];
				cont++;
				
			}
			
		}
		
		return vetAux;
		
	}
	
	public static void main(String[] args) {

		int vetElementos[] = {1, 2, 3, 2, 4};
		int varNumero = 2;
		
		System.out.print("Vetor Elementos: ");
		for ( int i = 0; i < vetElementos.length; i++ ) {
			System.out.print(vetElementos[i] + " ");
		}
		
		System.out.println();
		
		int vetAux[] = remocaoElementosVetor(vetElementos, varNumero);
		
		System.out.print("Vetor Elementos sem o elemento [" + varNumero + "]: ");
		for ( int i = 0; i < vetAux.length; i++ ) {
			System.out.print(vetAux[i] + " ");
		}
		
	}

}
