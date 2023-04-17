
public class Quest07 {

	public static boolean verificaOrdenacao(int vetElementos[]) {
		
		boolean varValida = true;
		
		for(int i = 0; i < vetElementos.length; i++ ) {
			
			for ( int j = 0; j < (vetElementos.length - 1); j++ ) {
				
				if (vetElementos[j] > vetElementos[j + 1]) {
					
					varValida = false;
					
					j = vetElementos.length + 1;
					
					i = vetElementos.length + 1;
					
				} 
				
			}
			
		}
		
		return varValida;
		
	}
	
	public static void main(String[] args) {
		
		int vetElementos[] = {1, 2, 5, 7, 9};
		boolean varValida;
		
		System.out.print("Elementos do vetor Elementos: ");
		for (int i = 0; i < vetElementos.length; i++ ) {
			System.out.print(vetElementos[i] + " ");
		}
		
		varValida = verificaOrdenacao(vetElementos);
		
		if (varValida) {
			System.out.println("\nO vetor Elementos esta ordenado em ordem crescente!");
		} else {
			System.out.println("\nO vetor Elementos nao esta ordenado em ordem crescente!");
		}

	}

}
