package NfilhosArvore;

public class Tarefa {
	
	//atributos
	private String tarefa;
	private Tarefa proximo;
	
	//construtores
	public Tarefa() {
		tarefa = "";
		proximo = null;
	}
	
	//Acessores
	
	public Tarefa(String tarefa, Tarefa proximo) {
		this.tarefa=tarefa;
		this.proximo=proximo;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public Tarefa getProximo() {
		return proximo;
	}

	public void setProximo(Tarefa proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "Tarefa [tarefa=" + tarefa + "]";
	}
	
}
