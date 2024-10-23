package cadastroCli;

public class Funcionario {
	private String nome=null;
	private Double salario=0.0;
	
	/*
	 * MÉTODO CONSTRUTOR
	 * */
	public Funcionario() {}
	public Funcionario(String nome, Double salario) {
			if(nome.length()>=3) {
				if(salario > 0) {
					this.nome = nome;
					this.salario = salario;
				}else {
					System.out.println("Tentando definir um salário inválido...");
					System.out.println("Salário inválido! O valor deve ser positivo.\n");
				}
			}else {
				System.out.println("\nTentando definir um nome inválido...");
				System.out.println("Nome inválido! O nome deve possuir pelo menos 3 caracteres.\n");
			}
	}
	/* 
	 * MÉTODOS GET/SET
	 */
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome.length()>=3) {
			this.nome = nome;
		}
		System.out.println("\nTentando definir um nome inválido...");
		System.out.println("Nome inválido! O nome deve possuir pelo menos 3 caracteres.\n");

	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		if(salario > 0) {
			this.salario = salario;
		}
		System.out.println("Tentando definir um salário inválido...");
		System.out.println("Salário inválido! O valor deve ser positivo.\n");
	}
	
	/*
	 * MÉTODOS CONVENCIONAIS
	 */
	public void list() {
		System.out.println("Nome do funcionário: "+ this.nome);
		System.out.printf("Salário do funcionário: %.2f\n",this.salario);
	}
	
}
