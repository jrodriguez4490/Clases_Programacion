package e54;

import java.math.BigDecimal;

public class Retirada extends Movimiento{
	
	

	@Override
	public BigDecimal getPositivo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getNegativo() {
		return getImporte().negate();
	}
	

	@Override
	public String toString() {
		return "[Retirada]" + "Fecha: " + getFecha() + " Importe: " + importe  ;

	}

	@Override
	public String getTipo() {
		String tipo = "Retirada";
		return tipo;
	}

	
}
