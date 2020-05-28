package NfilhosArvore;

import java.util.ArrayList;
import java.util.EmptyStackException;



public class Funcionario {
	//Atributos
	private int id;
	private String nome;
	private Tarefa inicial;
	private Tarefa ultima;
	private int quantasTarefasFaltam;
	private ArrayList<Funcionario> subordinados = new ArrayList<Funcionario>();
	
	//Construtores
	public Funcionario() {
		this.id =0;
		this.nome ="";
		this.inicial=null;
		this.ultima=null;
		this.subordinados=null;
	}
	
	public Funcionario(int id, String nome) {
		this.id=id;
		this.nome=nome;
		this.inicial=null;
		this.ultima=null;
		this.subordinados=null;
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
	
	//metodos
	
	public void addFuncionario(Funcionario novo) {
	    subordinados.add(novo);
	}
	
	public void addTarefa(int i) {
		// TODO Auto-generated method stub
		Tarefa nova = new Tarefa();
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
