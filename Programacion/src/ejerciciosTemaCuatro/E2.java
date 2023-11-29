package ejerciciosTemaCuatro;


public class E2 {

	public static void main(String[] args) {
		
		String resultado = getMinusculas(" ESTE ES UN EJEMPLO DE UNA CADENA ");
		
		System.out.println(resultado);

	}

	public static String getMinusculas(String minusculas) {


		String cadena = minusculas.trim().toLowerCase();

		return cadena;

	}

}
