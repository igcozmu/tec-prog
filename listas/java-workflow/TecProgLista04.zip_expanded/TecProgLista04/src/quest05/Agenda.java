package quest05;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda extends Contato{
	
	private String nomeAgenda;
	private String descricaoAgenda;
	private ArrayList<Contato> contatosAgenda;
	
	public Agenda() {
		super();
	}
	
	public Agenda(String nomeCliente) {
		
		super();
		
		this.setNomeAgenda(this.adicionarNomeAgenda());
		this.setDescricaoAgenda(this.adicionarDescricaoAgenda());
		
		Contato contatos = new Contato();
		this.setContatosAgenda(  contatos.criarContatos() );
		
		
	}
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public String getDescricaoAgenda() {
		return descricaoAgenda;
	}
	public void setDescricaoAgenda(String descricaoAgenda) {
		this.descricaoAgenda = descricaoAgenda;
	}

	public ArrayList<Contato> getContatosAgenda() {
		return contatosAgenda;
	}

	public void setContatosAgenda(ArrayList<Contato> contatosAgenda) {
		this.contatosAgenda = contatosAgenda;
	}
	
	
	// Metodos
	String adicionarNomeAgenda() {
		
		String nomeAgenda;
		Scanner inserir = new Scanner(System.in);
		
		System.out.println("Adicione um nome para a agenda: ");
		nomeAgenda = inserir.next();
		
		return nomeAgenda;
				
	}
	
	String adicionarDescricaoAgenda() {
		
		String descricaoAgenda;
		Scanner inserir = new Scanner(System.in);		
		
		System.out.println("Adicione uma descricao para a agenda: ");
		descricaoAgenda = inserir.next();
		
		return descricaoAgenda;
			
	}
	
	

}
