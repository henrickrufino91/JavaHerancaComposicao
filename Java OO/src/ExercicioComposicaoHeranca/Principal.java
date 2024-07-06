package ExercicioComposicaoHeranca;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	
	public static void main(String[] args) {
				
		Loja l = new Loja();
		Funcionario f = new Funcionario();
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		inserir(l, f, lista);
		
	}
	
	
	public static void inserir(Loja l,Funcionario f,List<Funcionario> lista) {
				
		l.setNome("Loja ABC");
		l.setCnpj("7899");
		f.setNome("Henrique");
		f.setIdade(33);
		f.setSalario(2.000);
		f.setCargo("Analista");
		lista.add(f);
		l.setFuncionarios(lista);
		
		listar(l);
		
	}
	
	
	public static void listar(Loja l) {
		
		JOptionPane.showMessageDialog(null, l.toString());
		
	}
	
}