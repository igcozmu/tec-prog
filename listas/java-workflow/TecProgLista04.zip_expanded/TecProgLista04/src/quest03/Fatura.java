package quest03;

public class Fatura {
	
	// Atributos
	private int IdentificadorItem;
	private String DescricaoItem;
	private int QntCompradaItem;
	private double ValorUnitarioItem;
	private double ValorTotalItem;
	
	// Construtor
	public Fatura(int identificadorItem, String descricaoItem, int qntCompradaItem, double valorUnitarioItem) {
		
		this.setIdentificadorItem(identificadorItem);
		this.setDescricaoItem(descricaoItem);
		this.setQntCompradaItem(qntCompradaItem);
		this.setValorUnitarioItem(valorUnitarioItem);
		
	}
	
	// Gets e Sets
	public int getIdentificadorItem() {
		return IdentificadorItem;
	}
	public void setIdentificadorItem(int identificadorItem) {
		IdentificadorItem = identificadorItem;
	}
	public String getDescricaoItem() {
		return DescricaoItem;
	}
	public void setDescricaoItem(String descricaoItem) {
		DescricaoItem = descricaoItem;
	}
	public int getQntCompradaItem() {
		return QntCompradaItem;
	}
	public void setQntCompradaItem(int qntCompradaItem) {
		if( qntCompradaItem < 0) { qntCompradaItem = 0; }
		
		QntCompradaItem = qntCompradaItem;
	}
	public double getValorUnitarioItem() {
		return ValorUnitarioItem;
	}
	public void setValorUnitarioItem(double valorUnitarioItem) {
		if( valorUnitarioItem < 0) { valorUnitarioItem = 0; }
		ValorUnitarioItem = valorUnitarioItem;
	}
	public double getValorTotalItem() {
		return ValorTotalItem;
	}
	public void setValorTotalItem(double valorTotalItem) {
		ValorTotalItem = valorTotalItem;
	}
	
	// Metodos
	void exibirFatura() {
		
		System.out.println("Produto: " + this.getDescricaoItem());
		System.out.println("Id do Produto: " + this.getIdentificadorItem());
		System.out.println("Qnt. do Produto: " + this.getQntCompradaItem());
		System.out.println("Valor Uni. do Produto: " + this.getValorUnitarioItem());
		System.out.println();
		
	}
	
	double getValorFatura() {
		
		System.out.println("Calculando o valor total.....");
		double ValorTotalFatura = this.ValorUnitarioItem * this.QntCompradaItem;
		System.out.println(this.QntCompradaItem + " X " + this.DescricaoItem);
		System.out.println("Fatura: " + ValorTotalFatura);
		System.out.println();
		
		return ValorTotalFatura;
	}
	
	void aplicarDesconto(double desconto) {
		
		double descontoDecimal = desconto / 100;
		System.out.println("Resgatando Desconto.....");
		System.out.println("Aplicando Desconto de " + desconto + "%");
		
		double ValorTotalDescontado = this.getValorTotalItem() - (this.getValorTotalItem() * descontoDecimal);
		
		setValorTotalItem(ValorTotalDescontado);
		
		System.out.println("Fatura final com desconto de " + desconto + "%: " + ValorTotalDescontado);
		System.out.println("--------------------------------------");
		System.out.println();
	}
	
	
	
	
	
}
