package ejercicio2Repaso;


public class Movil extends Telefonos {
	private GPS posicion;

	public Movil(Integer numero, GPS posicion) {
		super(numero);
		this.posicion = posicion;
	}

	public GPS getPosicion() {
		return posicion;
	}

	public void setPosicion(GPS posicion) {
		this.posicion = posicion;
	}
	



}
