
public class Quest19 {

	public static boolean verificaNumeroPerfeito (int varNumero) {
		
		int varAux = 0;
		
		for (int i = 1; i < varNumero; i++ ) {
			
			if ( ( varNumero % i ) == 0 ) {
				
				varAux += i;
				
			}
			
		}
		
		if ( varAux == varNumero ) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int varNumero = 496;
		
		if ( verificaNumeroPerfeito(varNumero) ) {
			
			System.out.println("O numero " + varNumero + " eh um numero perfeito!");
			
		} else {
			
			System.out.println("O numero " + varNumero + " nao eh um numero perfeito!");
			
		}

	}

}
