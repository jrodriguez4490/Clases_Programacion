package e58;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Diccionario prueba = new Diccionario();
		String palabra = "";
		List<String> pruebas = new ArrayList<String>();
		do {

			System.out.println("Dame una palabra");
			palabra = sc.nextLine().toLowerCase();
			pruebas.add(palabra);
		} while (!palabra.equalsIgnoreCase("fin"));
		prueba.cargarDiccionario(pruebas);
		do {
			System.out.println("Dame una letra");
			palabra = sc.nextLine().toLowerCase();
			prueba.imprimirPalabras(palabra);
		} while (!palabra.equalsIgnoreCase("fin"));
		sc.close();
	}
}
