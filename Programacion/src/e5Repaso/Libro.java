package e5Repaso;

public class Libro extends Publicaciones implements IPrestable, IConsultable {
	private Boolean prestado;
	private Boolean consulta;

	public Libro(Integer codigo, String autor, String titulo, Integer añoPublicacion) {
		super(codigo, autor, titulo, añoPublicacion);
		this.prestado = false;
		this.consulta = false;
	}

	public Boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(Boolean prestado) {
		this.prestado = prestado;
	}

	public Boolean getConsulta() {
		return consulta;
	}

	public void setConsulta(Boolean consulta) {
		this.consulta = consulta;
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
	public void retirarParaConsulta() {
		this.consulta = true;
	}

	@Override
	public void terminarConsulta() {
		this.consulta = false;

	}

	@Override
	public Boolean estaConsultando() {
		if (!this.consulta) {
			return false;
		} else {
			return true;
		}
	}

	public void esConsultaPrestado() {
		if (consulta = true) {
			prestado = false;
		} else if (prestado = true) {
			consulta = false;
		}

	}

	@Override
	public String toString() {
		return super.toString() + "Libro [prestado=" + prestado + ", consulta=" + consulta + "]";
	}

}
