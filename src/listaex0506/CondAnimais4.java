package listaex0506;

import java.util.Scanner;

public class CondAnimais4 {

	public static void main(String[] args) {
		
		String carac1, carac2, carac3;

		Scanner teclado = new Scanner(System.in);
		
		carac1 = teclado.nextLine();
		carac2 = teclado.nextLine();
		carac3 = teclado.nextLine();
		
		teclado.close();
		
		if(carac1.equalsIgnoreCase("vertebrado")){
			if(carac2.equalsIgnoreCase("ave")) {	
				if (carac3.equalsIgnoreCase("carnívoro")) {
					System.out.print("Águia");
					}
				else if(carac3.equalsIgnoreCase("onívoro")) {
					System.out.print("Pomba");
					}
			}
			else if (carac2.equalsIgnoreCase("mamífero")) {
				if(carac3.equalsIgnoreCase("onívoro")) {
					System.out.print("Homem");
					}
				else if (carac3.equalsIgnoreCase("herbívoro")) {
					System.out.print("Vaca");
					}
			}
			
		}else if(carac1.equalsIgnoreCase("invertebrado")) {
			if (carac2.equalsIgnoreCase("inseto")) {
				if (carac3.equalsIgnoreCase("hematófago")) {
					System.out.print("Pulga");
					}
				else if (carac3.equalsIgnoreCase("Herbívoro")) {
					System.out.print("Lagarta");
					}
			}
			else if(carac2.equalsIgnoreCase("Anelídio")) {
				if (carac3.equalsIgnoreCase("hematófago")) {
					System.out.print("Sanguessuga");
					}
				else if (carac3.equalsIgnoreCase("onívoro")) {
					System.out.print("Minhoca");
					}
			}
			
		}
		
		
	}

}
