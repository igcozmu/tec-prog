
public class Quest05 {

	public static int[] copiaDeVetor (int vetElementos[]) {
		
		int varTam = vetElementos.length;
		int vetElementosCopia[] = new int[varTam];
		
		for( int i = 0; i < vetElementos.length; i++ ) {
			
			vetElementosCopia[i] = vetElementos[i];
			
		}
		
		return vetElementosCopia;
	}
 	
	public static void main(String[] args) {
		
		int vetElementos[] = {1, 5, 7, 3, 9};
		
		System.out.println("Vetor Elementos: ");
		for ( int i = 0; i < vetElementos.length; i++ ) {
			System.out.print(vetElementos[i] + " ");
		}
		
		int vetElementosCopia[] = copiaDeVetor(vetElementos);
		
		System.out.println("\nCopia do Vetor Elementos: ");
		for ( int i = 0; i < vetElementos.length; i++ ) {
			System.out.print(vetElementosCopia[i] + " ");
		}
		
	}

}
