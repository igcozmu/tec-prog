package quest03;

public class Main {

	public static void main(String[] args) {

		Fatura fatura1 = new Fatura(1010, "Teclado", 2, 50);
		Fatura fatura2 = new Fatura(1012, "Mouse", 1, 50);
		Fatura fatura3 = new Fatura(1014, "Conector RJ45", 10, 1.5);
		Fatura fatura4 = new Fatura(1016, "Cabo USB", 4, 15);
		Fatura fatura5 = new Fatura(1018, "Pen-Drive", 3, 25);
	
		
		fatura1.exibirFatura();
		fatura1.setValorTotalItem( fatura1.getValorFatura() );
		fatura1.aplicarDesconto(20);
		
		fatura2.exibirFatura();
		fatura2.setValorTotalItem( fatura1.getValorFatura() );
		fatura2.aplicarDesconto(5);
		
		fatura3.exibirFatura();
		fatura3.setValorTotalItem( fatura1.getValorFatura() );
		fatura3.aplicarDesconto(5);
		
		fatura4.exibirFatura();
		fatura4.setValorTotalItem( fatura1.getValorFatura() );
		fatura4.aplicarDesconto(10);
		
		fatura5.exibirFatura();
		fatura5.setValorTotalItem( fatura1.getValorFatura() );
		fatura5.aplicarDesconto(15);
			
		

	}

}
