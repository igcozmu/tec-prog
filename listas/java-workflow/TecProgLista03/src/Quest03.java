
public class Quest03 {

	public static double mediaPonderada(int vetNota[], int vetPeso[] ) {
		
		double varMediaP = 0.0;
		double varSomaP = 0.0;
		int varPeso = 0;
		
		for ( int i = 0; i < vetNota.length; i++ ) {
			
			varSomaP += ( vetNota[i] * vetPeso[i] );
			varPeso += vetPeso[i];
		}
		
		
		varMediaP = varSomaP / varPeso;
		
		return varMediaP;
	}
	
	public static void main(String[] args) {
		
		int vetNota[] = new int [3];
		int vetPeso[] = new int [3];
		
		vetNota[0] = 7;
		vetNota[1] = 8;
		vetNota[2] = 6;
		
		vetPeso[0] = 2;
		vetPeso[1] = 3;
		vetPeso[2] = 1;
	
		System.out.print("Valores do vetor Nota: ");
		
		for (int i = 0; i < vetNota.length; i++ ) {
			System.out.print(vetNota[i] + " ");
		}
		
		System.out.print("\nValores do vetor Peso: ");
		
		for (int i = 0; i < vetPeso.length; i++ ) {
			System.out.print(vetPeso[i] + " ");
		}
		
		System.out.println("\nResultado da media ponderada das notas: " + mediaPonderada(vetNota, vetPeso));
		
	}

}
