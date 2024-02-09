package ejercicio49;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class E49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> lista = new HashSet<>();
		Set<String> lista2 = new HashSet<>();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Dame la palabra " + i);
			lista.add(sc.nextLine());
		}
		
		System.out.println(lista);
		
		
		
		
	
		
		for (String string : lista) {
			lista2.add(string.toUpperCase());
			
			lista= lista2;
			
			
		}
		
		
		
		
		System.out.println(lista);
		
		if (lista.contains("")) {
			System.out.println("Hay alguna palabra vacía en la lista");
		}
		
		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			if (it.next().length() < 6) {
				it.remove();
			}
		}
		System.out.println(lista);
		
		sc.close();
		
		
		
		
	}

}
