package NfilhosArvore;

public class ArvoreNNos implements GeralTree{
	
	private Funcionario raiz;
	private int[] saida = new int[0];

	@Override
	public Funcionario inserir(int num) {
		// TODO Auto-generated method stub
		if(raiz == null) {
			Funcionario novo = new Funcionario(num);
			raiz = novo;
		}else {
			throw new IllegalStateException("  ");
		}
		return raiz;
	}

	@Override
	public Funcionario inserir(int num, Funcionario pai) {
		// TODO Auto-generated method stub
		Funcionario novo = new Funcionario(num);
		if(pai==null) {
			throw new NullPointerException();
		}else {
			pai.addFilho(novo);
		}
		return novo;
	}

	@Override
	public int[] preOrder() {
		// TODO Auto-generated method stub
		if(raiz == null) {
			return new int[0];
		}
		return preOrder(raiz);
	}
	
	private int[] preOrder(Funcionario raiz) {
		addFilhos(saida, raiz.getConteudo());
		if(raiz!=null) {
			for(int i=0; i<raiz.getFilhosNos().size(); i++) {
				preOrder(raiz.getFilhosNos().get(i));
			}
		}
		
		return saida;
	}
	
	private void addFilhos(int[] sai, int novo) {
		int[] temp = new int [sai.length+1];
		for (int i =0;i<sai.length;i++) {
			temp[i]=sai[i];         
		}         
		temp[temp.length-1]=novo;
		saida=temp;
	}
	
}
