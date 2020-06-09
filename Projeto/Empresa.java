package Projeto;

import java.util.ArrayList;

import java.util.Arrays;


public class Empresa{
	
	private Funcionario raiz;
	private String[] saida = new String[0];

	
	public	Funcionario inserir(Funcionario adicionarF, Funcionario BossF) {
		if(raiz==null) {
			raiz = adicionarF;
		}else {
			BossF.getSubordinados().add(adicionarF);
		}
		return adicionarF;
	}
	
	private Funcionario procurar(Funcionario funcionario, int id) {//Depois fazer para o nome,m so trocar int para string
		if(funcionario!=null) {
			if(funcionario.getId()==id) {
				return funcionario;
			}else {
				
				ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
				funcionarios = funcionario.getSubordinados(); 
			    Funcionario res = null;
			    for (int i = 0; res == null && i < funcionarios.size(); i++) {         
			        res = procurar(funcionarios.get(i), id);
			    }
			    return res;
			}
		}
		return funcionario;
	}
	


	public Funcionario procurar(int id) {
		return procurar(raiz, id);
	}
	
	
	public String[] preOrder() {
		// TODO Auto-generated method stub
		if(raiz == null) {
			return new String[0];
		}
		return preOrder(raiz);
	}
	
	private String[] preOrder(Funcionario raiz) {
		addFuncionarios(saida, raiz.getNome());
		if(raiz!=null) {
			for(int i=0; i<raiz.getSubordinados().size(); i++) {
				preOrder(raiz.getSubordinados().get(i));
			}
		}
		
		return saida;
	}
	
	
	private void addFuncionarios(String sai[], String string) {
		String[] temp = new String [sai.length+1];
		for (int i =0; i<sai.length; i++) {
			temp[i]=sai[i];
		}
		temp[temp.length-1]=string;
		saida=temp;
	}
	
	@Override
	public String toString() {
		return "Empresa [raiz=" + raiz + ", saida=" + Arrays.toString(saida) + "]";
	}
	
}
/*
 * Apenas os cargos acima do funcionário é que lhe podem atribuir tarefas
*/