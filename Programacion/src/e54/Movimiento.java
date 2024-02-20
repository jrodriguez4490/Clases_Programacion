package e54;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Movimiento {
	protected LocalDate fecha;
	protected BigDecimal importe;
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getImporte() {
		return importe;
	}
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	public abstract BigDecimal getPositivo();
	public abstract BigDecimal getNegativo();
	
	public abstract String getTipo();

	public String toString() {
		
		return getTipo() + " - " + getFecha() + " - " + getImporte();
	}
	
}


