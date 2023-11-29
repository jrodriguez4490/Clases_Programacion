package ejerciciosTemaCuatro;


public class E1 {
	public static void main(String[] args) {

		String texto = getMayusculas(" Este es un ejemplo ");

		System.out.println(texto);

	}

	public static String getMayusculas(String mayusculas) {
		
		String cadena = mayusculas.trim().toUpperCase();

		return cadena;

		// .trim
		
	}

}
