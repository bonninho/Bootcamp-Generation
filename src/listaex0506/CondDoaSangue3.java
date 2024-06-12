package listaex0506;

import java.util.Scanner;

public class CondDoaSangue3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o nome do doador: ");
		nome = teclado.nextLine();
		
		System.out.printf("\nDigite a idade do doador: ");
		idade = teclado.nextInt();
		
		System.out.printf("\nPrimeira doação de sangue? ");
		primeiraDoacao = teclado.nextBoolean();
		
		teclado.close();
		
		if( idade < 18 || idade > 69 || (idade >=60 && primeiraDoacao)) {
				System.out.printf("%s não está apte para doar sangue!", nome);
			
		} else System.out.printf("%s está apte para doar sangue!", nome);
		
	}

}
