
public class Quest11 {

	public static int potencia(int varBase, int varExp) {
		
		int varResul = 1;
		
		if ( varExp >= 0 ) {	
			
			for (int i = 1; i <= varExp; i++ ) {
				
				varResul = varResul * varBase;
				
			}
			
		} else {
			
			varExp = varExp * (-1);
			
			for (int i = 1; i <= varExp; i++ ) {
				
				varResul = varResul * varBase;
				
			}
			
		}
		
		return varResul;
		
	}
	
	public static void main(String[] args) {
		
		int varExp = 3, varBase = -2;
		
		if ( varExp >= 0 ) {
			
			System.out.println("O resultado de " + varBase + " elevado a "+ varExp + ": " + potencia(varBase, varExp));
			
		} else {
			
			System.out.println("O resultado de " + varBase + " elevado a "+ varExp + ": 1/" + potencia(varBase, varExp));
			
		}
		
	}

}
