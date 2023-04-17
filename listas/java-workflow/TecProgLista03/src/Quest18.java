
public class Quest18 {

	public static double jurosCompostos ( double varInicial, double varTaxa, int varPeriodo ) {
		
		double varMontante, varJuroComp = 1;
		
		for (int i = 1; i <= varPeriodo; i++ ) {
			
			varJuroComp = varJuroComp * ( 1 + varTaxa );
			
		}
		
		varMontante = varInicial * varJuroComp;
		
		return varMontante;
		
	}
	
	public static void main(String[] args) {
		
		double varInicial = 1000;
		double varTaxa = 0.05;
		int varPeriodo = 3;
		
		System.out.println("Juros Compostos");
		System.out.println("Valor Inicial: " + varInicial);
		System.out.println("Taxa: " + varTaxa);
		System.out.println("Periodo: " + varPeriodo);
		System.out.println("Montante final: " + jurosCompostos(varInicial, varTaxa, varPeriodo));

	}

}
