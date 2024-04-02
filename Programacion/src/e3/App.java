package e3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SacoNumeros numeros = new SacoNumeros();
		Integer numero = 0;
		try {
			do {
				System.out.println("Dime un número");
				try {
					numero = scanner.nextInt();
					if (numero != -1) {
						numeros.addNumero(numero);
					}
				} catch (InputMismatchException e) {
					System.out.println("No puede ser una letra");
					scanner.nextLine();
				}

			} while (numero != -1);
			System.out.println(numeros);

			do {
				System.out.println("Quiero posicion");
				try {
					numero = scanner.nextInt();
					System.out.println(numeros.getNumero(numero));
				} catch (IndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
					System.out.println("Esa posición no existe");
				}

			} while (numero != -1);

		} finally {
			System.out.println("El escáner se ha cerrado");
			scanner.close();
		}
System.out.println(numeros.division());
	}
}
