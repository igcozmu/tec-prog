
public class Quest16 {

	public static boolean verificaPrimo (int varNumero ) {
		
		for (int i = 2; i < varNumero; i++ ) {
			
			if( ( varNumero % i) == 0 ) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		int varNumero = 7;
		
		if ( varNumero == 0) {
			
			System.out.println("0 nao eh primo!");
			
		} else if (varNumero == 1){
			
			System.out.println("1 nao eh primo!");
			
		} else if ( varNumero < 0) {
			System.out.println( varNumero + " nao eh primo pois nao ha numeros primos negativos!");
		} else {
			
			if (verificaPrimo(varNumero)) {
				
				System.out.println(varNumero + " eh primo!"); verificaPrimo(varNumero);
				
			} else {
			
				System.out.println(varNumero + " nao eh primo!"); verificaPrimo(varNumero);
				
			}
		
		}

	}

}
