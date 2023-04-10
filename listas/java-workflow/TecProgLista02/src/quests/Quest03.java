package quests;

import java.util.Scanner;

public class Quest03 {

	public static void main(String[] args) {
		
		int varNumeroSecreto = 37;
		
		Scanner input = new Scanner(System.in);
		int varTentativa = input.nextInt();
		
		
		while ( varTentativa != varNumeroSecreto) {
			
			if ( varTentativa > varNumeroSecreto ) {
				
				System.out.println("O numero secreto eh menor que: " + varTentativa);
				varTentativa = input.nextInt();
				
			} else {
				
				System.out.println("O numero secreto eh maior que: " + varTentativa);
				varTentativa = input.nextInt();
				
			}
			
		}
		
		System.out.println("Parabens! Voce acertou! Numero secreto: " + varNumeroSecreto);

		input.close();

	}

}
