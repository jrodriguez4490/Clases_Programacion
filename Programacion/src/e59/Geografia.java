package e59;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Geografia {

	private Map<String, String> paises;
	
	public Geografia() {
		paises = new HashMap<String, String>();
	}
	
	public Boolean agregarPais(String pais, String capital) {
		pais = pais.toUpperCase();
		capital = capital.substring(0,1).toUpperCase() + capital.substring(1).toLowerCase();
		Boolean yaEstaba = paises.containsKey(pais);
		paises.put(pais, capital);
		return yaEstaba;
	}

	public String obtenerCapital(String pais) {
		if (paises.containsKey(pais.toUpperCase())) {
			return paises.get(pais.toUpperCase());
		}
		return "";
	}
	
	public void imprimirPaises() {
		// ALTERNATIVA 1
//		for (Map.Entry<String, String> entry : paises.entrySet()) {
//			String key = entry.getKey();
//			String val = entry.getValue();
//			System.out.println("PAÍS: " + key + " - CAPITAL: " + val );
//		}
		
		// ALTERNATIVA 2
		for (String pais : paises.keySet()) {
			System.out.println("PAÍS: " + pais + " - CAPITAL: " + paises.get(pais) );
		}
	}
	
	public void eliminarPais(String pais) {
		paises.remove(pais.toUpperCase());
	}
	
	public void eliminarPaisConCapitalLetra(String letra) {
		for (Iterator<String> iterator = paises.keySet().iterator(); iterator.hasNext();) {
			String pais = (String) iterator.next();
			String capital = paises.get(pais);
			if (capital.startsWith(letra.toUpperCase())) {
				iterator.remove();
				break;
				// return; // también válido
			}
		}
	}
	
	public Integer calcularLongitudMediaPaises() {
		if (paises.isEmpty()) {
			return 0;
			
		}
		Integer suma = 0;
		for (String pais : paises.keySet()) {
			suma += pais.length();
		}
		return suma / paises.size();
	}
	
	public Integer numeroPaisesConCapitalLetra(String letra) {
		Integer contador = 0;
		for (String pais : paises.keySet()) {
			String capital = paises.get(pais);
			if (capital.startsWith(letra.toUpperCase())) {
				contador ++;
			}
		}
		return contador;
	}

	public void imprimirNumeroPaisesLetra(String letra) {
		Boolean existeAlguno = false;
		for (String pais : paises.keySet()) {
			String capital = paises.get(pais);
			if (capital.startsWith(letra.toUpperCase())) {
				existeAlguno = true;
				System.out.println("PAÍS: " + pais + " - CAPITAL: " + capital );
			}
		}
		if (!existeAlguno) {
			System.out.println("No hay ningún país cuya capital empiece por " + letra);
		}
	}
	
	public void mismaLetra() {
		Boolean existeAlguno = false;
		for (String pais : paises.keySet()) {
			String capital = paises.get(pais);
			if (capital.startsWith(pais.substring(0,1))) {
				existeAlguno = true;
				System.out.println("PAÍS: " + pais + " - CAPITAL: " + capital );
			}
		}
		if (!existeAlguno) {
			System.out.println("No hay ningún país cuya capital empiece por la misma letra que su nombre");
		}
	}
	
}


