package quest05;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Jose");
		
		cliente.imprimirContato(cliente.getAgendaCliente().getContatosAgenda());
		
		cliente.duplicarContato(cliente.getAgendaCliente().getContatosAgenda());
		
		cliente.verificaCamposContato(cliente.getAgendaCliente().getContatosAgenda());
		
		cliente.imprimirContato(cliente.getAgendaCliente().getContatosAgenda());
		
		
	}
	
}


