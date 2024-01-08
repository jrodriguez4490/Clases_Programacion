package ejerciciosTemaCuatro;

import java.util.Scanner;

public class E9 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Escribe una frase larga, para hacer un array con ella.");
	String respuesta = sc.nextLine();
	String [] arrayFinal = respuesta.split("");
	ArrayUtils.imprimirArray(arrayFinal);
	sc.close();
}
}
