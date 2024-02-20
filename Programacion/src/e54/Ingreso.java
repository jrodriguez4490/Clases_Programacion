package e54;

import java.math.BigDecimal;

public class Ingreso extends Movimiento{
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	@Override
	public BigDecimal getPositivo() {
		// TODO Auto-generated method stub
		return getImporte().plus();
	}

	@Override
	public BigDecimal getNegativo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "[Ingreso]" + " Fecha: " + getFecha + " Importe: " + importe + " CIF : " + getDescripcion() ;
	}
	
	@Override
	public String getTipo() {
		String tipo = "Ingreso";
		return tipo;
	}
	
}

