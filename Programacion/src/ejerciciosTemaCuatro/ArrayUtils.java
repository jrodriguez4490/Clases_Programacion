package ejerciciosTemaCuatro;


public class ArrayUtils {
	public static void imprimirArray(String[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static String obtenerPalabra(Integer pos, String[] cadena) {
		String palabra = "";
		for (int i = 0; i < cadena.length; i++) {
			if (pos == i) {
				palabra = cadena[i];

			}

		}
		return palabra;
	}

	public static Integer buscarPalabra(String[] array, String palabra, Integer posicion) {

		return posicion;
	}
	public static void cadenaPalabras (String [] cadenas, Integer posicion) {
		
		String palabra = cadenas[posicion];
		System.out.println(palabra);
		if(posicion < cadenas.length -1) {
		cadenaPalabras(cadenas, posicion +1);
		}
	}
}
