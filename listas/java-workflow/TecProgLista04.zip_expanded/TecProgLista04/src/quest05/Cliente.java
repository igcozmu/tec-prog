package quest05;

public class Cliente extends Agenda{

	private String nomeCliente;
	private Agenda agendaCliente;
	
	public Cliente(String nomeCliente) {
		
		this.setNomeCliente(nomeCliente);
		
		System.out.println("CLIENTE: " + getNomeCliente());
		
		Agenda agenda = new Agenda(nomeCliente);
		
		this.setAgendaCliente(agenda);
		
		
	}

	public Agenda getAgendaCliente() {
		return agendaCliente;
	}

	public void setAgendaCliente(Agenda agendaCliente) {
		this.agendaCliente = agendaCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
	
}
