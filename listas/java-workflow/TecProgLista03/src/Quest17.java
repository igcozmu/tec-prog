
public class Quest17 {

	public static String inverteString( String stringNome ) {
		
		String[] stringNomeObj = stringNome.split("");
		
		int varTamVet = stringNomeObj.length - 1;
		
		String varAux = "";
		
		for (int i = 0; i < ( stringNomeObj.length / 2 ); i++ ) {
			
			varAux = stringNomeObj[i];
			stringNomeObj[i] = stringNomeObj[ varTamVet - i ];
			stringNomeObj[ varTamVet - i ] = varAux;
		
		}
		
		varAux = "";
		
		for ( int i = 0; i < stringNomeObj.length; i++ ) {
			
			varAux += stringNomeObj[i];
			
		}
		
		return varAux;
		
	}
	
	public static void main(String[] args) {

		String varNome = "carro";
		
		System.out.println("A palavra \"" + varNome + "\" inverdida eh: " + inverteString(varNome));

	}

}
