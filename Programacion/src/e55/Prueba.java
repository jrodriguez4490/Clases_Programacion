package e55;

import java.math.BigDecimal;

public class Prueba {
public static void main(String[] args) {
	Evaluacion prueba = new Evaluacion();
	
	prueba.addNota("44444A", BigDecimal.TEN);
	prueba.addNota("DNIjajaja", new BigDecimal (9.22));
	prueba.addNota("ABCDEFG9", new BigDecimal(3.32));
	prueba.addNota("frijo21", new BigDecimal (1.95));
	prueba.addNota("juajjj2", new BigDecimal(7.32));
	
	System.out.println(prueba);
	
	prueba.addNota("juajjj2", new BigDecimal(6.32));
	System.out.println(prueba);
	prueba.corregirNota("juajjj2",  new BigDecimal(2.32));
	prueba.corregirNota("fff",  new BigDecimal(6.32));
	System.out.println(prueba);
	System.out.println(prueba.obtenerCantidadAprobados());
	System.out.println(prueba.obtenerSuspensos());
}
}
