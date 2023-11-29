package ejerciciosTemaCuatro;

import java.util.Scanner;

public class E3 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String respuesta = getMayMin(sc, null);
	System.out.println(respuesta);
}
public static String getMayMin(Scanner respuesta,String texto) {
	
	System.out.println("Dame un número. El 1 o el 2.");
	String numero = respuesta.nextLine();
	String cadena = "";
	System.out.println("Dame una cadena");

	if (numero.equals("1")) {
		 cadena = respuesta.nextLine();
		 cadena = cadena.trim().toUpperCase();
	} else if (numero.equals("2")) {
		cadena=respuesta.nextLine();
		cadena = cadena.trim().toLowerCase();
		
	}
	
	return cadena;
	
	
}
}

