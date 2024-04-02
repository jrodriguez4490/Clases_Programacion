package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> numeros = new ArrayList<Integer>();

		Integer numero = 0;

		try {
			//try(Scanner sc = new Scanner(System.in)){
			//}
			do {
				System.out.println("Dame un número");
				numero = sc.nextInt();
				if (numero != -1) {
					numeros.add(numero);
				}
			} while (numero != -1);
			System.out.println(numeros);
		} finally {

			sc.close();

		}

	}
}
