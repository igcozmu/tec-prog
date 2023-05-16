package quest02;

public class Main {

	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("Francisco", "Nascimento", 1500.0);
		Empregado empregado2 = new Empregado();
		
		empregado2.setPrimeiroNome("Antonio");
		empregado2.setSegundoNome("Machado");
		empregado2.setSalarioMensal(1700.0);
		
		empregado1.exibirInfoEmpregado(empregado1);
		empregado2.exibirInfoEmpregado(empregado2);
		
		System.out.println();
		
		empregado1.exibirSalarioAnual(empregado1);
		empregado2.exibirSalarioAnual(empregado2);
		
		System.out.println();
		
		empregado1.aumentoSalario(empregado1);
		empregado2.aumentoSalario(empregado2);
		
		
		empregado1.exibirSalarioAnual(empregado1);
		empregado2.exibirSalarioAnual(empregado2);

	}

}
