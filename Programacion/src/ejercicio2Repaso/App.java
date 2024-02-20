package ejercicio2Repaso;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {

		Fijo numFijo = new Fijo(954954954, "Bormujos");
		Movil numMov = new Movil (654654654, new GPS(new BigDecimal (425.34532), new BigDecimal(354.3425)));
		
		System.out.println(numFijo.consultarNumero());
		System.out.println(numMov.consultarNumero());

		
		numFijo.marcar(610610610);
		numFijo.marcar(654654654);
		numFijo.colgar();
		numFijo.colgar();

	}
}
