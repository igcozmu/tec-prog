package quests;

public class Quest06 {

	public static void main(String[] args) {
		
		int varTam = 3;
		int varMatriz[][] = new int [varTam][varTam];
		boolean varVerifica = false;
		
		
		varMatriz[0][0] = 2;
		varMatriz[0][1] = 5;
		varMatriz[0][2] = 11;

		varMatriz[1][0] = 5;
		varMatriz[1][1] = 4;
		varMatriz[1][2] = 17;

		varMatriz[2][0] = 11;
		varMatriz[2][1] = 17;
		varMatriz[2][2] = 6;
		
		
		// IMPRIMIR MATRIZ
		for ( int i = 0; i < varTam; i++) {
			
			for ( int j = 0; j < varTam; j++ ) {
						
				System.out.print(varMatriz[i][j] + "\t");
				
			}
			
			System.out.println("");
			
		}
		
		
		// VERIFICA SE EH SIMETRICA
		for ( int i = 0; i < varTam; i++) {
			
			for ( int j = 0; j < varTam; j++ ) {
				
				if ( varMatriz[i][j] != varMatriz[j][i] ) {
					
					varVerifica = true;
					
				}
				
			}
			
		}
		
		if ( varVerifica ) {
			
			System.out.println("Essa matriz nao eh simetrica!");
			
		} else {
			
			System.out.println("Essa matriz eh simetrica!");
			
		}

	}

}
