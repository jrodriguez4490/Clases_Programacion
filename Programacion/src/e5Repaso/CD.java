package e5Repaso;

public class CD extends Publicaciones implements IPrestable {
	private Boolean prestado;

	public CD(Integer codigo, String autor, String titulo, Integer añoPublicacion) {
		super(codigo, autor, titulo, añoPublicacion);
		this.prestado = false;
	}

	public Boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(Boolean prestado) {
		this.prestado = prestado;
	}


	@Override
	public void prestar() {

		this.prestado = true;

	}

	@Override
	public void devolver() {
		this.prestado = false;

	}

	@Override
	public Boolean estaPrestado() {
		if (!this.prestado) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "CD [prestado=" + prestado + "]";
	}
	
	

}
