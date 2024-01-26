package ejerciciosTemaCuatro;

import java.util.ArrayList;
import java.util.List;

public class PilaColaCadenas {

	private List<String> lista;
	private Boolean funcionamiento;

	public PilaColaCadenas() {
		lista = new ArrayList<String>();
		funcionamiento = true;

	}

	public void añadirCadena(String cadena) {

		lista.add(cadena);

	}

	public Integer getTamaño() {

		return lista.size();

	}

	@Override
	public String toString() {
		return lista.toString();
	}

	public void setModoCola() {
		funcionamiento = true;

	}

	public void setModoPila() {
		funcionamiento = false;

	}

	public String sacarCadena() {
		if (funcionamiento) {
			if (lista.isEmpty()) {
				return null;
			}

			int ultimo = lista.size() - 1;
			String resultado = lista.get(ultimo);

			lista.remove(ultimo);

			return resultado;
		}

		else {
			if (lista.isEmpty()) {
				return null;
			}

			String resultado = lista.get(0);
			lista.remove(0);
			return resultado;

		}

	}

}
