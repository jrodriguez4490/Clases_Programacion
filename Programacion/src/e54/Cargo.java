package e54;

import java.math.BigDecimal;

public class Cargo extends Movimiento{
	private String cif;

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	
	@Override
	public BigDecimal getPositivo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getNegativo() {
		// TODO Auto-generated method stub
		return getImporte().negate();
	}
	@Override
	public String getTipo() {
		String tipo = "Cargo";
		return tipo;
	}
	@Override
	public String toString() {
		return "[Cargo]" + "Fecha: " + fecha + " Importe: " + importe + " CIF : " + getCif() ;
	}
	
	
}

