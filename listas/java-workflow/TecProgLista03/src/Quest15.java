
public class Quest15 {

	
	public static boolean verificaPalindromo ( String stringNome) {
		
		String [] stringNomeObj = stringNome.split("");
		
		int varTamVet = stringNomeObj.length - 1;	
		
		for (int i = 0; i < ( stringNomeObj.length / 2 ); i++ ) {
			
			if ( !( stringNomeObj[i].equals( stringNomeObj[varTamVet - i ] ) ) ) {
				
				return false;
				
			}
		
		}
		
		return true;
		
	} 
	
	
	public static void main(String[] args) {
		
		String varNome = "ana";
		
		if (verificaPalindromo(varNome)) {
			System.out.println("A palavra \"" + varNome + "\" eh palindroma!");
		} else {
			System.out.println("A palavra \"" + varNome + "\" nao eh palindroma!");
		}

	}

}
