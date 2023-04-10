package quests;

import java.util.Scanner;

public class Quest04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero a ser multiplicado: ");
		int varEntrada = input.nextInt();
		
		System.out.println("Digite o numero que sera o inicio da tabela de multiplicacao de " + varEntrada);
		int varMin = input.nextInt();
		
		System.out.println("Digite o numero que sera o final da tabela de multiplicacao de " + varEntrada);
		int varMax = input.nextInt();
		
		int varResul = 0;
		
		
		while ( varMin <= varMax) {
			
			varResul = varEntrada * varMin;
			System.out.println(varEntrada + " x " + varMin + " = " + varResul);
			varMin++;
			
		}
		
		input.close();

	}

}
