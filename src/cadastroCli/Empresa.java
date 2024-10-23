package cadastroCli;

public class Empresa {

	public static void main(String[] args) {
		/*
		 * Instanciando com Construtor parametrizado e parâmatros corretos
		 */
		System.out.println("\nCONSTRUTOR PARAMETRIZADO COM DADOS VÁLIDOS");
		Funcionario funcionario1 = new Funcionario("João Silva", 4500.00);
		funcionario1.list();
		
		/* 
		 * Instanciando com Construtor padrão e parâmetros usando set
		 */
		Funcionario funcionario2 = new Funcionario();
		
		/*
		 * Parâmetro de nome inválido
		 */
		System.out.println("\nMÉTODO setNome() COM DADOS INVÁLIDOS");
		funcionario2.setNome("Jo");
		
		/*
		 * Parâmetro de salário inválido
		 */
		System.out.println("\nMÉTODO setSalario() COM DADOS INVÁLIDOS");
		funcionario2.setSalario(-100.00);
		
		funcionario2.list();
		
		/*
		 * Instanciando com Contrutor parametrizado e nome incorreto
		 */
		System.out.println("\nCONSTRUTOR PARAMETRIZADO COM NOME INVÁLIDO");
		Funcionario novo = new Funcionario("",300.3);
		novo.list();
		
		/*
		 * Instanciando com Contrutor parametrizado e Salário incorreto
		 */
		System.out.println("\nCONSTRUTOR PARAMETRIZADO COM SALARIO INVÁLIDO");
		Funcionario novo1 = new Funcionario("Sergio",-300.3);
		novo1.list();
	}

}
