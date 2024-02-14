package e54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Aplicatsionne {
	public static void main(String[] args) {
		
		
		CuentaAhorros uno = new CuentaAhorros("111A");
		LocalDate fecha = LocalDate.now();
		BigDecimal pruebas = new BigDecimal("22.00");
		Retirada prueba = new Retirada();
		
		prueba.setFecha(fecha);
		prueba.setImporte(pruebas);
		
		uno.addMovimientos(prueba);
		System.out.println(prueba);
		
		
		
	}
}
