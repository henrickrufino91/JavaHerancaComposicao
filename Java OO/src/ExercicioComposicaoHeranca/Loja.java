package ExercicioComposicaoHeranca;

import java.util.List;
import java.util.Objects;

public class Loja {

	
	private String nome;
	
	private String cnpj;
	
	
	private List<Funcionario> funcionarios;


	
	public Loja() {
		
	}



	public Loja(String nome, String cnpj, List<Funcionario> funcionarios) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionarios = funcionarios;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}



	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}



	@Override
	public int hashCode() {
		return Objects.hash(cnpj, funcionarios, nome);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loja other = (Loja) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(funcionarios, other.funcionarios)
				&& Objects.equals(nome, other.nome);
	}



	@Override
	public String toString() {
		return "Nome da Loja=" + nome + ", CNPJ da loja=" + cnpj + ", "
				+ "\n" +"Lista de Funcionarios=" + funcionarios + "]";
	}
	
	
}