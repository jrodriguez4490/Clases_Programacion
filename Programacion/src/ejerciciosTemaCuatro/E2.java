package ejerciciosTemaCuatro;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Prueba");
		
		String texto=sc.nextLine();
		
		String textoFinal = getMinusculas(texto);
		
		System.out.println(textoFinal);
		sc.close();
	}

	public static String getMinusculas(String minusculas) {

		minusculas = minusculas.trim().toLowerCase();

		return minusculas;

		// .trim

	}

}
