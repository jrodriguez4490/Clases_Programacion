package ejerciciosTemaCuatro;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("prueba");
		String texto = sc.nextLine();
		System.out.println("1 o 2");
		Integer opcion = sc.nextInt();
		String textomodificado = getMayMin(opcion, texto);
		System.out.println(textomodificado);
		sc.close();

	}

	public static String getMayMin(Integer num, String cadena) {

		if (num == 1) {
			return E1.getMayusculas(cadena);
		} else {
			return E2.getMinusculas(cadena);
		}

	}
}
