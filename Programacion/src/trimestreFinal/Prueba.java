package trimestreFinal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prueba {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();

		Map<String, String> mapa = new HashMap<String, String>();

		mapa.put("bigotitos", "gato feo");
		mapa.put("pelusilla", "gata arisca");
		mapa.put("wasabi", "huele mal");

		System.out.println(mapa);

		String wasabi = mapa.get("wasabi");
		System.out.println(wasabi);
		System.out.println(mapa.get("wasabi").toUpperCase());

//	Funciones

//	mapa.isEmpty();
//	mapa.clear();
//	mapa.size();

		if (mapa.get("blas") == null) {
			System.out.println("no existe");
		}
		if (mapa.containsValue("gato feo")) {
			System.out.println("Ta feo");
		}

		mapa.put("bigotitos", "se está sobreescribiendo");
		System.out.println(mapa.get("bigotitos"));

		for (String clave : mapa.keySet()) {

			System.out.println(clave);
			System.out.println("--->" + mapa.get(clave));

		}

//	Set<String> claves = mapa.keySet();
//	
//	for (String clave : claves) {
//		System.out.println(clave);
//		System.out.println("-->" + mapa.get(clave));
//	}

		for (String value : mapa.values()) {
			System.out.println(value);
		}

//Otra forma de hacer el recorrido de manera automática con los atajos del teclado.
//for (Map.Entry<String, String> entry : mapa.entrySet()) {
//	String key = entry.getKey();
//	String val = entry.getValue();
//	
//}

		for (Entry<String, String> dupla : mapa.entrySet()) {
			System.out.println(dupla.getKey());
			System.out.println(dupla.getValue());
		}

		for (Iterator<String> iterator = mapa.keySet().iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			if (key.startsWith("b")) {
				iterator.remove();
			}
		}
		System.out.println(mapa);

		
	}
}
