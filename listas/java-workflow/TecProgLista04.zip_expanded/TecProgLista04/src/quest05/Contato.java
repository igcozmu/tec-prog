package quest05;

import java.util.ArrayList;
import java.util.Scanner;

public class Contato {

	private int codigo = 0;
	private String nome = "(vazio)";
	private String endereco = "(vazio)";
	private String email = "(vazio)";
	private int telefone = 0;
	private String observacao = "(vazio)";
	

	// Construtores
	public Contato() {
		
	}
	
	public Contato(int codigo) {
		
		this.codigo = codigo;
		
	}

	public Contato(int codigo, String nome) {
		
		this.codigo = codigo;
		this.nome = nome;
		
	}

	public Contato(int codigo, String nome, String email) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		
	}

	public Contato(int codigo, String nome, String email, int telefone) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		
	}

	
	// Gets e Sets
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	// Metodos
	ArrayList<Contato> criarContatos() {
		
		ArrayList<Contato> listaContatos = new ArrayList<Contato>();
		Scanner inserir = new Scanner(System.in);
		
		String nomeContato;	int codContato; int telefoneContato;
		
		System.out.println("Quantos contatos adicionar criar? ");
		int qntContatos = inserir.nextInt();
		
		for (int i = 0; i < qntContatos; i++ ) {
			
			System.out.println("CONTATO " + (i + 1));
			
			System.out.println("Insira um codigo valido (entre 1000 e 9999) para o contato: ");
			codContato = inserir.nextInt(); 
			codContato = validaCodigoContato(codContato);
			
			System.out.println("Insira o nome para o contato: ");
			nomeContato = inserir.next(); 
			
			System.out.println("Insira um numero de telefone valido (8 digitos) para o contato: ");
			telefoneContato = inserir.nextInt(); 
			telefoneContato = validaTelefone(telefoneContato);
			
			Contato contatos = new Contato(codContato, nomeContato);
			
			System.out.println();
			listaContatos.add(contatos);
			
		}
		
		
		return listaContatos;
		
	}
	
	void imprimirContato (ArrayList<Contato> contatos) {
		
		System.out.println();
		System.out.println("IMPRESSAO DE CONTATOS:");
		
		for(int i = 0; i < contatos.size(); i++ ) {
			
			System.out.println("Cod.: " + contatos.get(i).getCodigo());
			System.out.println("Nome: " + contatos.get(i).getNome());
			System.out.println("Endereco: " + contatos.get(i).getEndereco());
			System.out.println("E-Mail: " + contatos.get(i).getEmail());
			System.out.println("Telefone: " + contatos.get(i).getTelefone());
			System.out.println("Obsevacao: " + contatos.get(i).getObservacao());
			System.out.println("");
			
		}
		
	}
	
	int validaCodigoContato(int codContato) {

		Scanner inserirCod = new Scanner(System.in);
		
		int codContatoValido = codContato;
		
		while ( (codContatoValido < 1000 || codContatoValido > 9999) ) {
			
			System.out.println("Codigo Invalido! Um codigo valido deve está entre 1000 e 9999");
			codContatoValido = inserirCod.nextInt();
			
		}
		
		
		return codContatoValido;
	}
	
	int validaTelefone (int telefoneContato) {
		int telefoneContatoValido = telefoneContato;
		
		Scanner inserirTele = new Scanner(System.in);
		
		while ( Integer.toString(telefoneContatoValido).length() != 8 ) {
			
			System.out.println("Telefone Invalido! Um numero de telefone valido deve ter 8 digitos!");
			telefoneContatoValido = inserirTele.nextInt();
			
		}
		
		
		return telefoneContatoValido;
	}
	
	void duplicarContato ( ArrayList<Contato> contatos ) {
		
		boolean validaBusca = false; int i = -1; int codigoContatoBusca = 0;
		
		Scanner inserirBusca = new Scanner(System.in);
		
		System.out.println("DUPLICANDO CONTATO: ");
		System.out.println("Digite o codigo do contato que deseja duplicar: ");
		codigoContatoBusca = inserirBusca.nextInt(); 
		
		
		while ( validaBusca == false ) {
			
			i++;
			if( contatos.get(i).getCodigo() == codigoContatoBusca ) {
				validaBusca = true;
			}
			
		}
		
		if ( validaBusca == true ) {
			
			System.out.println("Duplicando contato de codigo " + codigoContatoBusca + ".......");
			contatos.add( contatos.get(i) );
			imprimirContato(contatos);
			
		}else {
			
			System.out.println("Codigo Invalido!");
			
		}
		
		System.out.println();
	}
	
	void verificaCamposContato(ArrayList<Contato> contatos) {
		
		System.out.println("VERIFICACAO DOS CAMPOS DOS CONTATOS ADICIONADAS NA AGENDA: \n");
		for(int i = 0; i < contatos.size(); i++ ) {
			
			System.out.println("VERIFICANDO CAMPOS DO CONTATO " + (i + 1));
			
			if ( contatos.get(i).getCodigo() == this.codigo) {
				System.out.println("Codigo Nao Esta Preenchido! Codigo: " + contatos.get(i).getCodigo());	
			} else {
				System.out.println("Codigo Esta Preenchido! Codigo: " + contatos.get(i).getCodigo());
			}
			
			if ( contatos.get(i).getNome().equals(this.nome)) {
				System.out.println("Nome Nao Esta Preenchido! Nome: " + contatos.get(i).getNome());	
			} else {
				System.out.println("Nome Esta Preenchido! Nome: " + contatos.get(i).getNome());
			}
			
			if ( contatos.get(i).getEndereco().equals(this.endereco)) {
				System.out.println("Endereco Nao Esta Preenchido! Endereco: " + contatos.get(i).getEndereco());	
			} else {
				System.out.println("Endereco Esta Preenchido! Endereco: " + contatos.get(i).getEndereco());
			}
			
			if ( contatos.get(i).getEmail().equals(this.email)) {
				System.out.println("E-Mail Nao Esta Preenchido! Email: " + contatos.get(i).getEmail());	
			} else {
				System.out.println("E-mail Esta Preenchido! Email: " + contatos.get(i).getEmail());
			}
			
			if ( contatos.get(i).getTelefone() == this.telefone) {
				System.out.println("Telefone Nao Esta Preenchido! Telefone: " + contatos.get(i).getTelefone());	
			} else {
				System.out.println("Telefone Esta Preenchido! Codigo: " + contatos.get(i).getTelefone());
			}
			
			if ( contatos.get(i).getObservacao().equals(this.observacao)) {
				System.out.println("Observacao Nao Esta Preenchido! Observacao: " + contatos.get(i).getObservacao());	
			} else {
				System.out.println("Observacao Esta Preenchido! Observacao: " + contatos.get(i).getObservacao());
			}
			
			System.out.println();
			
		} 
		
		System.out.println();
		
	}
	
}
