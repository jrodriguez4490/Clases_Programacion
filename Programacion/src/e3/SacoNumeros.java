package e3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SacoNumeros {

	private List<Integer> numeros;

	public SacoNumeros() {
		numeros = new ArrayList<Integer>();
	}

	public void addNumero(Integer numero) { // Si tiene que recibir números de una lista, hay que indicarle el Integer
											// numero
		numeros.add(numero);
	}

	@Override
	public String toString() {
		return "Lista: " + numeros;
	}

	public Integer getNumero(Integer posicion) {
		return numeros.get(posicion);
	}

	public BigDecimal division() {

		BigDecimal resultado = BigDecimal.ZERO;
		try {
			
		
		for (int i = 0; i < numeros.size() -1; i++) {
			
			resultado = new BigDecimal(numeros.get(i)).divide(new BigDecimal(numeros.get(i +1)), 2, RoundingMode.HALF_UP);

			
		}
		}catch(ArithmeticException e) {
			 resultado = BigDecimal.ZERO;

		}
		
		return resultado;
	}
}
