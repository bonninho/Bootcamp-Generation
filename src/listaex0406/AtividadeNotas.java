package listaex0406;

import java.util.Scanner;

public class AtividadeNotas {

	public static void main(String[] args) {

		float nota1, nota2, nota3, nota4, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Insira a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Insira a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Insira a quarta nota: ");
		nota4 = leia.nextFloat();
		leia.close();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Média final: %.2f", media);
	}

}
