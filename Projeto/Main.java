package NfilhosArvore;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArvoreNNos t = new ArvoreNNos();
		
		Funcionario t1 = t.inserir(2);
		t.inserir(3, t1);
		
		
		
		System.out.println(Arrays.toString(t.preOrder()));
	}

}