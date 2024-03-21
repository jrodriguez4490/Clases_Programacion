package e58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {
	private Map<String, List<String>> mapa;

	public Diccionario() {
		mapa = new HashMap<String, List<String>>();
	}

	public void cargarDiccionario(List<String> palabras) {
		for (String minuscula : palabras) {
			minuscula = minuscula.toLowerCase();
		}
		for (int i = 0; i < palabras.size(); i++) {
			if (!mapa.containsKey(palabras.get(i).substring(0, 1))) {
				mapa.put(palabras.get(i).substring(0, 1), new ArrayList<String>());
				mapa.get(palabras.get(i).substring(0, 1)).add(palabras.get(i).toLowerCase());
			} else {
				mapa.get(palabras.get(i).substring(0, 1)).add(palabras.get(i).toLowerCase());
			}
		}
	}

	public void borrarDiccionario() {
		mapa.clear();
	}

	public void imprimirPalabras(String letra) {
		letra = letra.substring(0, 1);
		if (mapa.containsKey(letra)) {
			System.out.println("hay " + mapa.get(letra).size() + " que empiezan por " + letra);
			for (int i = 0; i < mapa.get(letra).size(); i++) {
				System.out.println("\t > " + mapa.get(letra).get(i));
			}
		} else {
			System.out.println("no esite");
		}
	}
}
