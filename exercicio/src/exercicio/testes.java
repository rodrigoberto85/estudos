package exercicio;

public class testes {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		
		f1.nome  = "Rodrigo";
		f1.rg = "338.726.268-09";
		f1.departamento = "Informatica";
		
		
		
		f1.dataEntrada = data;
		f1.dataEntrada.dia = 17;
		f1.dataEntrada.mes = 02;
		f1.dataEntrada.ano = 2015;
		
		f1.salario = 2000;
		
		//f1.recebeAumento(200);
		
		//f1.calculaGanhoAnual();
		f1.dataEntrada.formatada();
		
		//f1.mostra();
		
		//System.out.println("Nome: " + f1.nome + " \nRG: " + f1.rg + "\nDepartamento: " 
		//					+ f1.departamento + "\nSalario: " + f1.salario );
		//System.out.println(f1.dataEntrada.dia + "/" + f1.dataEntrada.mes + "/" + f1.dataEntrada.ano);
		
	}
	
}
