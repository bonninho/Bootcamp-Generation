package listaex0606;

import java.util.Scanner;

public class LacosWhile4 {

	public static void main(String[] args) {
		
		int idade,genero,dev,
			back=0,mulherFront=0,homemMobile=0,nbsFull=0, total=0;
		float somaidade = 0;
		String continua = "s";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Pesquisa de devs!");
		while(!continua.equals("n")) {
			
			System.out.print("Idade: ");
			idade = teclado.nextInt();
			
			System.out.print("Gênero: ");
			genero = teclado.nextInt();
			
			System.out.print("Desenvolvimento: ");
			dev = teclado.nextInt();
			
			total++;
			somaidade = somaidade + idade;
			if(dev == 1) {
				back++;
			}
			if ((genero == 1||genero == 4)&& dev == 2) {
				mulherFront++;
			}
			if((genero == 2 || genero == 5)&& dev == 3 && idade > 40) {
				homemMobile++;
			}
			if (genero == 3 && dev == 4 && idade < 30) {
				nbsFull++;
			}
			
			System.out.printf("\nDeseja continuar? (s/n): ");
			continua = teclado.next();
		}
		teclado.close();
		System.out.println("");
		System.out.println("Total de devs Backend: " + back);
		System.out.println("Total de mulheres cis e trans desenvolvedoras Frontend: " + mulherFront);
		System.out.println("Total de homens cis e trans desenvolvedores Mobile acima de 40 anos: "+ homemMobile);
		System.out.println("Total de pessoas não-binárias desenvolvedoras Fullstack abaixo de 30 anos: " + nbsFull);
		System.out.println("Total de pessoas que responderam à pesquisa: " + total);
		System.out.println("Média de idade das pessoas que responderam à pesquisa: " + somaidade/total);
	}

}
