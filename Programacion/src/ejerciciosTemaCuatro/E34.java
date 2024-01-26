package ejerciciosTemaCuatro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class E34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		List<String> lista = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Dame una palabra");
			lista.add(sc.nextLine());
		}

		System.out.println(lista);
		
		for (int i = 0; i < 5; i++) {
			lista.set(i, lista.get(i).toUpperCase().toString());

		}
		System.out.println(lista);
		
		for (Iterator <String> iterator = lista.iterator(); iterator.hasNext();) {
			String palabra = (String) iterator.next();

			if(palabra.length() < 6) {
				iterator.remove();
			}
		}
		if(lista.contains("")) {
			System.out.println("Hay posiciones vacías");
		}
		System.out.println(lista);
		
		sc.close();

	}
}
