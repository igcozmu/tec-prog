package quest04;

import java.util.ArrayList;

public class Produto {
	
	// Atributos
	private String NomeProduto;
	private double ValorProduto;
	private int QuantidadeProduto;
	
	
	// Contrutores
	public Produto() {
		
	}
	
	public Produto(String nomeProduto, double valorProduto, int quantidadeProduto) {
		super();
		this.setNomeProduto(nomeProduto);
		this.setValorProduto(valorProduto);
		this.setQuantidadeProduto(quantidadeProduto);
	}


	// Gets e Sets
	public String getNomeProduto() {
		return NomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return ValorProduto;
	}

	public void setValorProduto(double valorProduto) {
		ValorProduto = valorProduto;
	}

	public int getQuantidadeProduto() {
		return QuantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		QuantidadeProduto = quantidadeProduto;
	}
	
	
	// Metodos
	void comprarProduto( ArrayList<Produto> produto, String nomeProdutoComprado, int qntProdutoComprado ) {
		
		double fatura = 0; int i = -1; boolean confirmaBusca = false;
		
		System.out.println("Localizando produto...");
		
		while (confirmaBusca == false) {
			
			i++;
			
			if( produto.get(i).getNomeProduto().equals(nomeProdutoComprado)) {
				confirmaBusca = true;
			}
			
		} 
		
		
		int qntProdutoAtual = produto.get(i).getQuantidadeProduto();
		int qntProdutoAposCompra = qntProdutoAtual - qntProdutoComprado;		
		produto.get(i).setQuantidadeProduto( qntProdutoAposCompra );
		
		fatura = qntProdutoComprado * (produto.get(i).getValorProduto());
		
		System.out.println("Fatura da Compra:");
		System.out.println(produto.get(i).getNomeProduto() + " X " + qntProdutoComprado + " = R$ " + fatura);
		
		
		System.out.println("Verificando se há disconto disponivel.....");
		
		fatura = descontoProduto(fatura);
		
	}
	
	void exibirProdutos( ArrayList<Produto> produtos) {
		
		for (int i = 0; i < produtos.size(); i++ ) {

			System.out.println("Nome Produto: " + produtos.get(i).getNomeProduto());
			System.out.println("Valor do Produto: " + produtos.get(i).getValorProduto());
			System.out.println("Qnt do Produto: " + produtos.get(i).getQuantidadeProduto());
			System.out.println("------------------------------");
		}
		
	}
	
	double descontoProduto (double faturaProduto) {
		
		if (faturaProduto < 100) {
			System.out.println("Não há disconto para faturas abaixo de R$ 100");
			return faturaProduto;
		}
		
		double desconto = 0;
		double faturaDescontada = 0;
		
		if ( faturaProduto >= 100 && faturaProduto <= 200 ) {
			desconto = 0.1;
			faturaDescontada = faturaProduto - ( faturaProduto * desconto );
			
		} else if ( faturaProduto >= 200 && faturaProduto <= 500 ) {
			desconto = 0.2;
			faturaDescontada = faturaProduto - ( faturaProduto * desconto );
			
		} else if ( faturaProduto > 500 ) {
			desconto = 0.25;
			faturaDescontada = faturaProduto - ( faturaProduto * desconto );
			
		}
		
		System.out.println("Aplicando desconto de " + (desconto * 100) + "%");
		System.out.println("Sua fatura da compra agora é: R$ " + faturaDescontada);
		System.out.println();
		
		return faturaDescontada;
		
	}
	
	
	
	
}
