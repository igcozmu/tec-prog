package quests;

import java.util.Scanner;

public class Quest02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int varEntrada = 0;
		int varSoma = 0;
		
		while ( varEntrada >= 0 ) {
			
			varEntrada = input.nextInt();
			
			if ( varEntrada >= 0 ) {
				
				varSoma += varEntrada;
				
			}
				
		}
		
		input.close();
		
		System.out.println("soma dos numeros positivos lidos = " + varSoma);

	}

}
