package ejerciciosTemaCuatro;

public class Calculadora {

	public static Integer calculadora(String funcion, Integer entero1, Integer entero2) {

		int calculadora = 0;

		if (funcion.equalsIgnoreCase("ADD")) {
			calculadora = entero1 + entero2;

		} else if (funcion.equalsIgnoreCase("SUB")) {
			calculadora = entero1 - entero2;

		} else if (funcion.equalsIgnoreCase("MUL")) {
			calculadora = entero1 * entero2;

		} else if (funcion.equalsIgnoreCase("DIV")) {
			calculadora = entero1 / entero2;

		}
		return calculadora;

	}
}
