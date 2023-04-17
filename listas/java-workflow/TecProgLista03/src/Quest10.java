
public class Quest10 {

	public static boolean verificaIgualdade (int vetElementosA[], int vetElementosB[] ) {
		
		boolean varValida = true;
		
		for ( int i = 0; i < vetElementosA.length; i++ ) {
			
			if ( vetElementosA[i] == vetElementosB[i] ) {
				
				varValida = true;
				
			} else {
				
				return false;
				
			}
			
		}
		
		return varValida;
	}
	
	public static void main(String[] args) {
		
		int vetElementosA[] = {1, 9, 10, 44, 2, 18, 53};
		int vetElementosB[] = {1, 9, 10, 44, 2, 18, 53};

		if (verificaIgualdade(vetElementosA, vetElementosB)) {
			
			System.out.println("Os vetores A e B sao iguais!");
			
		} else {
			
			System.out.println("Os vetores A e B nao sao iguais!");
			
		}
		
	}

}
