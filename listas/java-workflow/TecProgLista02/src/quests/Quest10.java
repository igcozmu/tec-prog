package quests;

public class Quest10 {

	public static void main(String[] args) {
		
		int varTam = 5;
		
		
		// A) INICIO	
		System.out.println("A) INICIO\n");
		
		for ( int j = 1; j <= varTam; j++) {
		
			for (int i = 1; i <= j; i++) {
					
				System.out.print((i-1) + "\t");
					
			}
				
			System.out.println("");
				
		}
			
			
		System.out.println("");
		System.out.println("");
			
		
		// B) INICIO
		System.out.println("B) INICIO\n");
		
		int cont = 1;
		
		for ( int i = 1; i <= varTam; i++ ) {
				
			for ( int j = 1; j <= (varTam); j++ ) {
				
				if ( ( cont % 2) > 0 ) {
					System.out.print("@\t");
				} else {
					System.out.print("*\t");
				}
					
				cont++;
					
			}
			
			System.out.println("");
		
		}			
	
		
		System.out.println("");
		System.out.println("");
		
		
		// C) INICIO
		System.out.println("C) INICIO\n");
		
		int varAux = (varTam / 2 );
		cont = 1;
		
		for ( int i = 0; i < varTam; i++ ) {
			
			for ( int j = 0 ; j < varTam; j++ ) {
				
				if ( j == varAux || i == varAux) {
					
					System.out.print("@\t");
					
				} else {
					
					if ( (i % 2) > 0 ) {
						System.out.print( j + "\t");
					} else {
						System.out.print( ( varTam - ( j + 1) ) + "\t");
					}
					
				}
			
			}
			
			System.out.println("");
		}

		
		System.out.println("");
		System.out.println("");
		
		
		// D) INICIO
		System.out.println("D) INICIO\n");
		
		for ( int i = 0; i < varTam; i++ ) {
			
			for ( int j = 0; j < varTam; j++ ) {
				
				if ( i == 0 ) {
					
					System.out.print(j + "\t");	
					
				} else if (  i == (varTam - 1) ) {
						
					System.out.print( ( (varTam - 1) - j) + "\t");
						
				}		
					
				else if ( j == 0 ) {
					
					System.out.print(i + "\t");
					
				} else if ( j == (varTam - 1) ) {
						
					System.out.print( (varTam - 1) - i + "\t");
					
				}
		
				else {
					
					System.out.print("*\t");
					
				}
				
			}
			
			System.out.println("");
			
		}
		
		
		System.out.println("");
		System.out.println("");
		
		
		// E) INICIO
		System.out.println("E) INICIO\n");
		
		for ( int i = 0; i < varTam; i++ ) {
			
			for ( int j = 0; j < varTam; j++ ) {
				
				if ( i != varAux && j == varAux) {
						
					System.out.print("||\t");
					
				} else if ( i == varAux && j != varAux ) {
					
					System.out.print("=\t");
					
				} else if ( i == varAux && j == varAux )	
					
					System.out.print("||\t");
				
				else {
					
					if ( i > -1 && i < ( varTam / 2) ) {
						
						if ( j > -1 && j < ( varTam / 2) )	
							
							System.out.print("#\t");
						
						
					} if ( i > -1 && i < ( varTam / 2) ) {
						
						if ( j > ( varTam / 2) && j < ( varTam ) )		
							
							System.out.print("!\t");
						
					} if ( i > ( varTam / 2) && i < ( varTam ) ) {
						
						if ( j > -1 && j < ( varTam / 2) )	
						
							System.out.print("*\t");
						
					} if ( i > ( varTam / 2) && i < ( varTam ) ) {
						
						if ( j > ( varTam / 2) && j < ( varTam ) )
						
							System.out.print("%\t");
						
					}
					
				}
				
			}
			
			System.out.println("");
			
		}
	
		
		System.out.println("");
		System.out.println("");
		
		
		// F) INICIO
		System.out.println("F) INICIO\n");
				
		int r = 0;
				
		for ( int i = 1; i <= varTam; i++) {
					
			for ( int j = 1; j <= varTam; j++) {
						
				if ( i == j ) {
							
					System.out.print((i-1) + "\t");
						
				} else if ( j == ( varTam - r ) ) {
							
					System.out.print( (varTam - i) + "\t");
							
				} 
				else {
						
					System.out.print("*\t");
				}
						
				if ( j == varTam ) {
					r++;
					System.out.println("");
				}
			}
					
		}
		
				
	}

}
	