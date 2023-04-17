
public class Quest02 {

	public static double media(int vetElementosA[], int vetElementosB[] ) {
		
		double varSoma = 0;
		double varMedia = 0.0;
		
		for ( int i = 0; i < vetElementosA.length; i++ ) {
			varSoma += vetElementosA[i];
		
		}
		
		for ( int i = 0; i < vetElementosA.length; i++ ) {
			varSoma += vetElementosB[i];
			
		}
		
		varMedia = varSoma / (vetElementosA.length + vetElementosA.length);
		
		return varMedia;
	}
	
	public static void main(String[] args) {
		
		int vetElementosA[] = new int [4];
		int vetElementosB[] = new int [4];
		
		vetElementosA[0] = 7;
		vetElementosA[1] = 8;
		vetElementosA[2] = 9;
		vetElementosA[3] = 6;
		
		vetElementosB[0] = 9;
		vetElementosB[1] = 4;
		vetElementosB[2] = 7;
		vetElementosB[3] = 5;
		
		System.out.print("Valores do vetor A: ");
		
		for (int i = 0; i < vetElementosA.length; i++ ) {
			System.out.print(vetElementosA[i] + " ");
		}
		
		System.out.print("\nValores do vetor B: ");
		
		for (int i = 0; i < vetElementosB.length; i++ ) {
			System.out.print(vetElementosB[i] + " ");
		}
		
		System.out.println("\nResultado da media dos vetores: " + media(vetElementosA, vetElementosB));
		
	}

}
