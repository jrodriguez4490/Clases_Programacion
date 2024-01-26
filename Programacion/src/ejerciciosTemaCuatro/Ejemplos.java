package ejerciciosTemaCuatro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejemplos {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Alberto");
		lista.add("4 horitas de SSII");

		lista.add(1, "uno");
		System.out.println(lista);
		System.out.println(lista.size());
//		String palabra = lista.get(0);
//		System.out.println(palabra);
		lista.remove(1);
		System.out.println(lista);
		System.out.println(lista.size());

		System.out.println(lista);

		System.out.println(lista.isEmpty());
		
		lista.remove("Alberto");
		System.out.println(lista);
		
		lista.set(0, "blas");
		System.out.println(lista);
		
		lista.add("jajeji");
		lista.add("jejiju");
		System.out.println(lista);
		
//		lista.set(1, null);
//		System.out.println(lista);
//		lista.clear();
//		System.out.println(lista);
		System.out.println(lista.contains("jajeji"));
		System.out.println(lista.indexOf("jejiju"));
		System.out.println(lista.indexOf("klfgdh"));
		
		
//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//			String palabra2 = lista.get(i);
//			if(palabra2.contains("e")) {
//				lista.remove(i);
//			} 
//		} Esto no funciona porque se modifica su tamaño por la función "if"
		System.out.println("ESpacio de ejemplo ");
		for (String x : lista) {
			System.out.println(x);
			
		}
		
		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			String palabra = (String) it.next();
			if(palabra.contains("e")) {
				it.remove();
			}
			
		}
		
		for (Iterator <String> iterator = lista.iterator(); iterator.hasNext();) {
			String palabra = (String) iterator.next();
			if( palabra.contains("e")) {
				it.remove();
			}
			
		}
		
		
		
		
	}

}
