package ejercicio53;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hucha {

	private BigDecimal dinero;
	DecimalFormat formato = new DecimalFormat("#,##0.00 €");

	public Hucha() {
		super();
		dinero = BigDecimal.ZERO;

	}

	public BigDecimal meterDinero(BigDecimal dinero) {
		this.dinero = this.dinero.add(dinero).setScale(2, RoundingMode.HALF_DOWN);
		return this.dinero;
	}

	public BigDecimal sacarDinero(BigDecimal sacar) {
		if (sacar.compareTo(dinero) > 0) {
			BigDecimal sacado = dinero;
			dinero = BigDecimal.ZERO;
			return sacado;

		}
		dinero = dinero.subtract(sacar).setScale(2, RoundingMode.HALF_DOWN);
		return sacar;

	}

	public BigDecimal contarDinero() {
		return dinero.setScale(2, RoundingMode.HALF_DOWN);
	}

	public BigDecimal romperHucha() {
		return sacarDinero(dinero);

	}

	@Override
	public String toString() {
		return "Dinero en la hucha " + formato.format(dinero);
	}

}
