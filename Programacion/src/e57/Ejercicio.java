package e57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String respuesta = "";
		Map<String, List<String>> mapa = new HashMap<String, List<String>>();
		do {
			System.out.println("Dame palabritas");
			respuesta = sc.nextLine().toLowerCase();
			if (!mapa.containsKey(respuesta.substring(0, 1))) {
				mapa.put(respuesta.substring(0, 1), new ArrayList<String>());
				mapa.get(respuesta.substring(0, 1)).add(respuesta);
			} else {
				mapa.get(respuesta.substring(0, 1)).add(respuesta);
			}
		} while (!respuesta.equalsIgnoreCase("fin"));
		do {
			System.out.println("Dame una letra");
			respuesta = sc.nextLine().toLowerCase();
			if (mapa.containsKey(respuesta)) {
				System.out.println("hay " + mapa.get(respuesta).size() + " que empiezan por " + respuesta);
				for (int i = 0; i < mapa.get(respuesta).size(); i++) {
					System.out.println("\t > " + mapa.get(respuesta).get(i));
				}
			} else {
				System.out.println("Túuu, que eso no estáaaa en la listaa");
			}
		} while (!respuesta.equalsIgnoreCase("fin"));
		System.out.println("Gracias por jugar");
		sc.close();
	}
}
