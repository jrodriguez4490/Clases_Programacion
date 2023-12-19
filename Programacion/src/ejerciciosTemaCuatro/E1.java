package ejerciciosTemaCuatro;

import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Prueba");
		String texto=sc.nextLine();
		String textoFinal = getMayusculas(texto);
		System.out.println(textoFinal);
		sc.close();
	}

	public static String getMayusculas(String mayusculas) {

		mayusculas = mayusculas.trim().toUpperCase();

		return mayusculas;

		// .trim

	}

}
