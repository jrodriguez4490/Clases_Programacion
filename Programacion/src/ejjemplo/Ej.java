package ejjemplo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ej {
	
	public static void main(String[] args) {
		
		BigDecimal x = new BigDecimal ("12.42312314");
		BigDecimal y = new BigDecimal ("2.2362314");

		System.out.println(x);
		x= x.setScale(2, RoundingMode.HALF_DOWN);
		 
		System.out.println(x);
		
		System.out.println(x.add(y));
		System.out.println(x.subtract(y));
		
		System.out.println(x.add(y).multiply(y).subtract(y));
		BigDecimal a = new BigDecimal ("12.420");
		BigDecimal e = new BigDecimal ("2.42");

		
		BigDecimal resultado = a.divide(e, 6, RoundingMode.HALF_DOWN);
		
		resultado.negate();
		resultado.plus();
		resultado.abs();
		
		System.out.println(resultado);
//		
//		if(x.equals(y)) {
//			System.out.println("Son iguales");
//		}
//		if(x.compareTo(y) < 8) {
//			System.out.println("x es menor que y");
//			
//		}else if(x.compareTo(y) > 0) {
//			System.out.println("Equis es mayor que y");
//		}else {
//			System.out.println("Son iguales");
//		}
		
		DecimalFormat formato = new DecimalFormat("#,###.000 €");
		System.out.println(formato.format(x));
	}
	
	
}
