package Projeto;

import java.util.ArrayList;
import java.util.EmptyStackException;



public class Funcionario {
	//Atributos
	private String cargo;
	private int id;
	private String nome;
	private Tarefa inicial;
	private Tarefa ultima;
	private int quantasTarefasFaltam;
	private ArrayList<Funcionario> subordinados = new ArrayList<Funcionario>();
	
	

	//Construtores
	public Funcionario() {
		this.cargo="";
		this.id =0;
		this.nome ="";
		this.inicial=null;
		this.ultima=null;
		this.subordinados=null;
	}
	
	public Funcionario(int id, String nome, String cargo) {
		this.cargo = cargo;
		this.id=id;
		this.nome=nome;
		this.inicial=null;
		this.ultima=null;
		this.subordinados=new ArrayList<Funcionario>();
	}
	
	//Acessores
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Funcionario> getSubordinados() {
		return subordinados;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Tarefa getInicial() {
		return inicial;
	}

	public void setInicial(Tarefa inicial) {
		this.inicial = inicial;
	}

	public Tarefa getUltima() {
		return ultima;
	}

	public void setUltima(Tarefa ultima) {
		this.ultima = ultima;
	}

	public int getQuantasTarefasFaltam() {
		return quantasTarefasFaltam;
	}

	public void setSubordinados(ArrayList<Funcionario> subordinados) {
		this.subordinados = subordinados;
	}

	public void addFuncionario(Funcionario novo) {
	    subordinados.add(novo);
	}
	
	public void addTarefa(String tarefa) {
		// TODO Auto-generated method stub
		Tarefa nova = new Tarefa(tarefa);
		if(estaVazia()) {
			inicial = nova;
			ultima = nova;
		}
		else {
			ultima.setProximo(nova);
			ultima = nova;
		}
		quantasTarefasFaltam++;
	}
	public void addTarefa(String tarefa, Funcionario f) {
		// TODO Auto-generated method stub
		Tarefa nova = new Tarefa(tarefa);
		if(f.estaVazia()) {
			inicial = nova;
			ultima = nova;
		}
		else {
			f.getUltima().setProximo(nova);
			f.ultima = nova;
		}
		quantasTarefasFaltam++;
	}
	
	public String obterPrimeiraTarefa() {
		// TODO Auto-generated method stub
		if(estaVazia()) {
			throw new EmptyStackException();
		}else {
			return inicial.getTarefa();
		}
	}
	
	public String terminarTarefa() {
		// TODO Auto-generated method stub
		if(estaVazia()) {
			throw new EmptyStackException();
		}else {
			String sair = inicial.getTarefa();
			inicial = inicial.getProximo();
			quantasTarefasFaltam--;
			return sair;
		}
		
	}
	
	public boolean estaVazia() {
		// TODO Auto-generated method stub
		return quantasTarefasFaltam == 0;
	}
	
	
}
