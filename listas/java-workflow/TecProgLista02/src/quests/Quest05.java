package quests;

import java.util.Scanner;

public class Quest05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe o valor do limite: ");
		int varLimite = input.nextInt();
		
		input.close();
		
		for ( int i = 0; i <= varLimite; i++ ) {
			
			for ( int j = 0; j <= varLimite; j++ ) {
				
				System.out.println(i + " - " + j);
				
			}
			
		}

	}

}
