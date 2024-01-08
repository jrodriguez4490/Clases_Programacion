package ejerciciosTemaCuatro;

import java.util.Scanner;

public class E10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe una frase larga, para hacer un array con ella.");
		String respuesta = sc.nextLine();
		String [] arrayFinal = respuesta.split(" ");
		System.out.println("Dime qué posición sacar");
		int numero = sc.nextInt();
		
		//ArrayUtils.imprimirArray(arrayFinal);
		String respuestaFinal = ArrayUtils.obtenerPalabra(numero, arrayFinal);
		System.out.println(respuestaFinal);
		sc.close();
	}
	}
