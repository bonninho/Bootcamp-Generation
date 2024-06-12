package listaex1006;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExCollection01 {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite 5 cores:");
		for (int i = 0; i < 5; i++) {
			cores.add(teclado.nextLine());
		}

		teclado.close();

		System.out.println("Cores na lista:\n");

		Iterator<String> iCores = cores.iterator();
		while (iCores.hasNext()) {
			System.out.println(iCores.next());
		}

		cores.sort(null);

		System.out.println("\nCores em ordem alfabética:\n");

		Iterator<String> iCores2 = cores.iterator();
		while (iCores2.hasNext()) {
			System.out.println(iCores2.next());
		}

	}

}
