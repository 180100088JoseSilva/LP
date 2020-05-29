package Projeto;

import java.util.ArrayList;

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
	
	
	/*public Funcionario inserir(String num, Funcionario pai) {
		// TODO Auto-generated method stub
		Funcionario novo = new Funcionario();
		if(pai==null) {
			throw new NullPointerException();
		}else {
			pai.addFuncionario(novo);
		}
		return novo;
	}
*/
	
	public String[] preOrder() {
		// TODO Auto-generated method stub
		if(raiz == null) {
			return new String[0];
		}
		return preOrder(raiz);
	}
	
	private String[] preOrder(Funcionario raiz) {
		addFilhos(saida, raiz.getNome());
		if(raiz!=null) {
			for(int i=0; i<raiz.getSubordinados().size(); i++) {
				preOrder(raiz.getSubordinados().get(i));
			}
		}
		
		return saida;
	}
	
	private void addFilhos(String sai[], String string) {
		String[] temp = new String [sai.length+1];
		for (int i =0; i<sai.length; i++) {
			temp[i]=sai[i];
		}
		temp[temp.length-1]=string;
		saida=temp;
	}
	
}