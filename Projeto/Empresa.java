package NfilhosArvore;

public class Empresa{
	
	private Funcionario raiz;
	private String[] saida = new String[0];

	
	public Funcionario inserir(int num, String nome) {
		// TODO Auto-generated method stub
		if(raiz == null) {
			Funcionario novo = new Funcionario();
			raiz = novo;
		}else {
			throw new IllegalStateException("  ");
		}
		return raiz;
	}

	public Funcionario inserir(String num, Funcionario pai) {
		// TODO Auto-generated method stub
		Funcionario novo = new Funcionario();
		if(pai==null) {
			throw new NullPointerException();
		}else {
			pai.addFuncionario(novo);
		}
		return novo;
	}

	
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
/*
 * Procurar Funcionario no meio da Arvore hierarquica da empresa
 * Atribuir cargos aos funcionarios e hierarquizá-los
 * Apenas os cargos acima do funcionário é que lhe podem atribuir tarefas
*/