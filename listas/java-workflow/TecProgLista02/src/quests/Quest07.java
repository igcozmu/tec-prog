package quests;

import java.util.Scanner;

public class Quest07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int varEntrada = input.nextInt();
		int varCont = varEntrada;
		
		input.close();
		
		while ( varCont > 0 ) {
			
			varCont--;
			
			if ( varEntrada == 1 ) {
				System.out.println("Maior numero primo entre 0 e " + varEntrada + " nao existe pois 1 nao eh primo"); varCont = 0;
				
			} else if ( varEntrada == 2 ) {
				System.out.println("Maior numero primo entre 0 e " + varEntrada + " nao existe"); varCont = 0;
				
			} else if ( varEntrada == 3 ) {
				System.out.println("Maior numero primo entre 0 e " + varEntrada + " = 2"); varCont = 0;
				
			} else if ( varEntrada == 4 ) {
				System.out.println("Maior numero primo entre 0 e " + varEntrada + " = 3"); varCont = 0;
				
			} else if ( varEntrada == 5 ) {
				System.out.println("Maior numero primo entre 0 e " + varEntrada + " = 3"); varCont = 0;
				
			} else if ( varEntrada == 6 ) {
				System.out.println("Maior numero primo entre 0 e " + varEntrada + " = 5"); varCont = 0;
				
			} else if ( varEntrada == 7 ) {
				System.out.println("Maior numero primo entre 0 e " + varEntrada + " = 5"); varCont = 0;
				
			} else { 
			
				if ( ( varCont % 2 ) > 0 ) {
					
					if ( ( varCont % 3 ) > 0 ) {
						
						if ( ( varCont % 5 ) > 0 ) {
						
							if ( ( varCont % 11 ) > 0 ) {
								
								System.out.println("Maior numero primo entre 0 e " + varEntrada + " = " + varCont);
								varCont = 0;
								
							}
							
						}
	
					}
				}
			}	
		}

	}

}












/*



*/
