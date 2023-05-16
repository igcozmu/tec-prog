package quest02;

public class Empregado {
	
	private String primeiroNome;
	private String segundoNome;
	private double salarioMensal;
	
	public Empregado() {
		
	}
	
	public Empregado(String primeiroNome, String segundoNome, double salarioMensal) {

		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.salarioMensal = salarioMensal;

	}

	public void exibirInfoEmpregado(Empregado empregado) {
		System.out.println("Empregado: " + empregado.primeiroNome + " " + empregado.segundoNome);
		System.out.println("Salario: " + empregado.salarioMensal);
	}
	
	public void exibirSalarioAnual(Empregado empregado) {
		
		double salarioAnual = empregado.salarioMensal * 12;
		System.out.println("Salario Anual: " + salarioAnual);
		
	}
	
	public void aumentoSalario(Empregado empregado) {
		
		exibirInfoEmpregado(empregado);
		
		double salarioPassado = empregado.salarioMensal;
		empregado.salarioMensal = (salarioPassado * 0.1 ) + salarioPassado;
		
		System.out.println("Aumento de 10% sobre " + salarioPassado);
		System.out.println("Salario mensal atualizado: " + empregado.salarioMensal);
		System.out.println();
		
		
	}
	
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		
		if (salarioMensal < 0) {
			salarioMensal = 0.0;}
		
		this.salarioMensal = salarioMensal;
	}
	
	
	
}
