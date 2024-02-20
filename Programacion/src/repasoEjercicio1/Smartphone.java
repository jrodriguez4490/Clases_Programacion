package repasoEjercicio1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Smartphone {
	private String marca;
	private String modelo;
	private String imei;
	private BigDecimal precio;
	private LocalDate añoFabricacion;
	private Boolean activo;

	public Smartphone() {
		super();
		activo = true;
		precio = BigDecimal.ZERO;
	}

	public Smartphone(String imei) {
		super();
		this.imei = imei;
		activo = true;
		precio = BigDecimal.ZERO;
	}

	public Smartphone(String marca, String modelo, String imei) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.imei = imei;
		activo = true;
		precio = BigDecimal.ZERO;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public void activar() {
		activo = true;

	}

	public void desactivar() {
		activo = false;
	}

	public Integer getEdad() {
		LocalDate añoAnterior = LocalDate.of(2000, 1, 1);
		Period periodo = añoAnterior.until(añoFabricacion);
		Integer diferencia = periodo.getYears();

		return diferencia;
	}

	public void cambiarModelo(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
	}

	public void establecerFabricacion(LocalDate añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public BigDecimal getPrecioMasIva() {
		BigDecimal iva = new BigDecimal(1.21);
		return precio.multiply(iva);
	}

	public Boolean isAltaGama (BigDecimal precio) {
		if(this.precio.compareTo(precio) >0 ){
			return true;
		}
		return false;
		
	}
	
	public Boolean isDatosCompletos(){
		return imei != null && !imei.isBlank() && precio != null;
	}
	
	public Boolean isGratis() {
		return precio.compareTo(BigDecimal.ZERO) == 0;
	}
	
	public void rebajar() {
		precio = precio.subtract(new BigDecimal(10));
		
	}

	@Override
	public String toString() {
		String resultado = marca + " (" + modelo + ") ";
		if (!activo) {
			resultado+= " - Inactivo ";
		}
		return resultado;
	}
	
	

}
