package e56;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer respuesta = 0;
		Map<Integer, Integer> numeros = new HashMap<Integer, Integer>();
		do {
			System.out.println("Dame un número entero");
			Integer a = 0;
			respuesta = sc.nextInt();
			if (!numeros.containsKey(respuesta)) {
				numeros.put(respuesta, 0);
			}
			if (numeros.containsKey(respuesta)) {
				a = numeros.get(respuesta);
				a++;
				numeros.put(respuesta, a);
			}

		} while (respuesta != 0);

		Integer suma = 0;
		for (Integer valor : numeros.values()) {

			Integer sustituto = valor;
			suma = suma + sustituto;

		}
		System.out.println("Total números indicados : " + suma);

		System.out.println("Distribución");

		for (Entry<Integer, Integer> recorrido : numeros.entrySet()) {

			System.out.println("\t" + "> Número " + recorrido.getKey() + " : " + recorrido.getValue() + " veces");
		}

		sc.close();
	}

}
