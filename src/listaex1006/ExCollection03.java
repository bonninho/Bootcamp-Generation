package listaex1006;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExCollection03 {

	public static void main(String[] args) {
		
		Set<Integer> colecao = new HashSet<Integer>();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite 10 valores inteiros e não repetidos:");
		
		for (int i = 0; i < 10; i++) {
			colecao.add(teclado.nextInt());
		}
		
		teclado.close();
		
		System.out.println("Dados do set:");
		
		Iterator<Integer> iColecao = colecao.iterator();
		
		while(iColecao.hasNext()) {
			System.out.println(iColecao.next());
		}
		
		
	}

}
