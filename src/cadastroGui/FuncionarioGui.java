package cadastroGui;

import javax.swing.JOptionPane;

public class FuncionarioGui {
	private String nome;
	private Double salario=0.0;
	public String msg;
	
	/*
	 * MÉTODO CONSTRUTOR
	 * */
	public FuncionarioGui() {}
	public FuncionarioGui(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
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
		}else {
			this.nome=null;
			this.salario=0.0;
			msg = "Tentando definir um nome inválido...Nome inválido! O nome deve possuir pelo menos 3 caracteres.";
            JOptionPane.showMessageDialog(null, msg);
		}
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		if(salario > 0) {
			this.salario = salario;
		}else {
			this.nome=null;
			this.salario=0.0;
			msg = "Tentando definir um salário inválido...Salário inválido! O valor deve ser positivo.";
            JOptionPane.showMessageDialog(null, msg);
		}
	}
	
	/*
	 * MÉTODOS CONVENCIONAIS
	 */
	public void list() {
		if(this.nome==null && this.salario==0.0) {
			msg = "Funcionário Inexistente";
			JOptionPane.showMessageDialog(null, msg);
	    }else {
	    	String salarioFormat = String.format("%.2f", this.salario);
	    	msg = "Nome do funcionário: "+this.nome+"\nSalário do funcionário: "+salarioFormat;
	    	JOptionPane.showMessageDialog(null, msg);
	    }
	}
	
	public void atualiza(String nome, String salarioString) {
			setNome(nome);
			try {
				this.salario=(Double.parseDouble(salarioString));
				setSalario(salario);
				if(this.nome!=null && this.salario!=0.0) {
					msg = "\nDados salvos com sucesso!";
					JOptionPane.showMessageDialog(null, msg);
			    }else {
			    	this.nome=null;
			    	this.salario=0.0;
			    }
			}catch (NumberFormatException e) {
			    msg = "Tentando definir um salário inválido...Salário inválido! O valor deve ser positivo.";
			    JOptionPane.showMessageDialog(null, msg);
			}
	}
	public void reset() {
		this.nome=null;
		this.salario=0.0;
	}
}