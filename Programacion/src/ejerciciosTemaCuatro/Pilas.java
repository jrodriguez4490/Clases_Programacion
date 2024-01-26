package ejerciciosTemaCuatro;

import java.util.ArrayList;
import java.util.List;

public class Pilas {

	private List<String> pilas;

	public Pilas() {
		pilas = new ArrayList<String>();

	}

	public void añadirCadena(String cadena) {

		pilas.add(cadena);

	}

	public String sacarCadena() {
		if (pilas.isEmpty()) {
			return null;
		}
		int ultimo = pilas.size() - 1;
		String resultado = pilas.get(ultimo);

		pilas.remove(ultimo);

		return resultado;

	}

	public Integer getTamaño() {

		return pilas.size();

	}

	@Override
	public String toString() {
		return pilas.toString();
	}

}
