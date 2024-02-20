package ejercicio2Repaso;

public class Fijo extends Telefonos {
	private String direccion;

	public Fijo(Integer numero, String direccion) {
		super(numero);
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
