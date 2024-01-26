package ejerciciosTemaCuatro;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {

	private List<String> listaCadenas;

	public ColaCadenas() {

		listaCadenas = new ArrayList<String>();

	}

	public void añadirCadena(String cadena) {

		listaCadenas.add(cadena);

	}

	public String sacarCadena() {
		if(listaCadenas.isEmpty()) {
			return null;
		}

		String resultado = listaCadenas.get(0);
		listaCadenas.remove(0);
		return resultado;

	}

	public Integer getTamaño() {

		return listaCadenas.size();

	}

	@Override
	public String toString() {
		return listaCadenas.toString();
	}

}
