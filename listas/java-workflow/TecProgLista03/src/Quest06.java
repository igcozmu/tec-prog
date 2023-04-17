
public class Quest06 {

	public static int[] ordenacaoCrescente(int vetElementos[]) {
		
		int aux = 0;
		
		// Algoritimo de Ordenação: Bubble Sort
		for(int i = 0; i < vetElementos.length; i++ ) {
			
			for ( int j = 0; j < (vetElementos.length - 1); j++ ) {
				
				if (vetElementos[j] > vetElementos[j + 1]) {
					
					aux = vetElementos[j];
					
					vetElementos[j] = vetElementos[j + 1];
					
					vetElementos[j + 1] = aux;
					
				}
				
			}
			
		}
		
		return vetElementos;
		
	}
	
	public static void main(String[] args) {
		
		int vetElementos[] = {5, 2, 9, 1, 7};
		
		System.out.print("Vetor Elementos nao ordenado: ");
		for (int i = 0; i < vetElementos.length; i++ ) {
			System.out.print(vetElementos[i] + " ");
		}
		
		vetElementos = ordenacaoCrescente(vetElementos);
		
		System.out.print("\nVetor Elementos ordenado: ");
		for (int i = 0; i < vetElementos.length; i++ ) {
			System.out.print(vetElementos[i] + " ");
		}

	}

}
