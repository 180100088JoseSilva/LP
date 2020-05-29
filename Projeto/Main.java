package Projeto;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa t = new Empresa();
		
		Funcionario t1 = new Funcionario(1, "Ze", "Patrao");
		Funcionario t2 = new Funcionario(2, "Zes", "Mini-Patrao");
		Funcionario t3 = new Funcionario(3, "Zess", "Gerente");
		Funcionario t4 = new Funcionario(4, "Zesss", "Gerente");
		
		t.inserir(t1, null);
		t.inserir(t2, t.procurar(1));
		t.inserir(t3, t.procurar(2));
		t.inserir(t4, t.procurar(2));
		
		
		System.out.println(t.procurar(3).getNome());
		
		System.out.println(Arrays.toString(t.preOrder()));
	}

}
