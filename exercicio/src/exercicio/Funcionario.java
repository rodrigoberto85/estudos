package exercicio;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataEntrada;
	String rg;
	boolean estaNaEmpresa;
	
	void recebeAumento(double valor) {
		this.salario = this.salario + valor;
	}

	void calculaGanhoAnual() {
		double ganhoAnual = this.salario * 12;
		System.out.println("Ganho Anual: " + ganhoAnual);
		
	}
	
	void mostra () {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data Entrada: " + this.dataEntrada.dia + "/" + this.dataEntrada.mes + "/" + this.dataEntrada.ano);
		this.calculaGanhoAnual();
		this.dataEntrada.formatada();
	}
	
	

}
