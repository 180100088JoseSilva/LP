package NfilhosArvore;

import java.util.ArrayList;

public class Funcionario {
	//Atributos
	private int conteudo;
	private ArrayList<Funcionario> filhosNos = new ArrayList<Funcionario>();
	
	//Construtores
	public Funcionario(){
		this.conteudo=0;
		this.filhosNos = null;
	}
	public Funcionario(int c){
		this.conteudo=c;
	}
	
	//Acessores
	public int getConteudo() {
		return conteudo;
	}

	public void setConteudo(int conteudo) {
		this.conteudo = conteudo;
	}

	public ArrayList<Funcionario> getFilhosNos() {
		return filhosNos;
	}
	
	public void addFilho(Funcionario novo) {
	    filhosNos.add(novo);
	}
	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + ", filhosNos=" + filhosNos + "]";
	}

}
