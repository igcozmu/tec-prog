
public class Quest02 {

	public static void main(String[] args) {
		
		int varA = 0;
		int varB = 0;
		
		if ( varA < 10 && (varA + varB) == 20 ) {
			
			System.out.println("numero nao valido");
			
			
		} else {
			
			if ( varA < 10 ) 
				System.out.println("A < 10");
			
			if ( (varA + varB) == 20 ) 
				System.out.println("A + B == 20");
			
		}
		
	}

}