package Projeto;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa t = new Empresa();
		
		Funcionario t1 = new Funcionario(1, "Ze");
		Funcionario t2 = new Funcionario(2, "Zes");
		Funcionario t3 = new Funcionario(3, "Zess");
		Funcionario t4 = new Funcionario(4, "Zesss");
		
		t.inserir(t1, null);
		t.inserir(t2, t.procurar(1));
		t.inserir(t3, t.procurar(2));
		t.inserir(t4, t.procurar(2));
		
		t2.addFuncionario(5, "5Ze");
		
		t2.addTarefa("Lel");
		t3.addTarefa("Diz olá", t4);
		System.out.println(t2.obterPrimeiraTarefa());
		t2.terminarTarefa();
		System.out.println(t2.obterPrimeiraTarefa());
		System.out.println(t4.obterPrimeiraTarefa());
		
		System.out.println(t.procurar(3).getNome());
		
		System.out.println(Arrays.toString(t.preOrder()));
	}
	
}