package NfilhosArvore;

import java.util.ArrayList;

public class Funcionario {
	//Atributos
	private String tarefa;
	private ArrayList<Funcionario> filhosNos = new ArrayList<Funcionario>();
	
	//Construtores
	public Funcionario(){
		this.tarefa="";
		this.filhosNos = null;
	}
	public Funcionario(String c){
		this.tarefa=c;
	}
	
	//Acessores
	public String getConteudo() {
		return tarefa;
	}

	public void setConteudo(String conteudo) {
		this.tarefa = conteudo;
	}

	public ArrayList<Funcionario> getFilhosNos() {
		return filhosNos;
	}
	
	public void addFilho(Funcionario novo) {
	    filhosNos.add(novo);
	}
	@Override
	public String toString() {
		return "No [conteudo=" + tarefa + ", filhosNos=" + filhosNos + "]";
	}

}
