package ejercicio2Repaso;

public abstract class Telefonos {
	protected Integer numero;
	protected Boolean enLlamada;

	public Telefonos(Integer numero) {
		super();
		this.numero = numero;
		enLlamada = false;
	}

	public Integer consultarNumero() {

		return this.numero;

	}

	public void  marcar(Integer numTef) {
		System.out.println("Llamando a...");
		if (numTef.equals(this.numero)) {
			System.out.println("Comunicando");
		} else {
			enLlamada = true;
			System.out.println("En comunicación");
		}

	}

	public void colgar() {
		if (enLlamada) {
			System.out.println("Comunicación terminada");
			enLlamada = false;
		} else {

		}
	}

}
