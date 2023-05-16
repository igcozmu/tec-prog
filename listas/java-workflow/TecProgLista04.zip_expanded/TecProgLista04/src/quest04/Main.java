package quest04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Produto> listaProduto = new ArrayList<Produto>();
		Scanner teclado = new Scanner(System.in);
		Produto metodosProdutos = new Produto();
		
		
		System.out.print("Quantos Produto deseja Adicionar? ");
		int maxProdutos = teclado.nextInt();
		
		for (int i = 0; i < maxProdutos; i++ ) {

			System.out.println("Produto " + (i + 1) + ": ");
			
			System.out.println("Digite o nome do produto: ");
			String nome = teclado.next();
			
			System.out.println("Digite o valor do produto: ");
			double valor = teclado.nextDouble();
			
			System.out.println("Digite a quantiadde do produto: ");
			int quantidade = teclado.nextInt();
			
			Produto produtos = new Produto(nome, valor, quantidade);
			
			listaProduto.add(produtos);			
		
		}

		metodosProdutos.exibirProdutos(listaProduto);
		
		System.out.println("Qual produto deseja comprar? ");
		String compraProdutoNome = teclado.next();
		System.out.println("Qual a quantidade? ");
		int compraProdutoQnt = teclado.nextInt();
		
		teclado.close();
		
		metodosProdutos.comprarProduto(listaProduto, compraProdutoNome, compraProdutoQnt);
		
		metodosProdutos.exibirProdutos(listaProduto);
		
		
	}

}
