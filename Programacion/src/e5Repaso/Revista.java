package e5Repaso;

public class Revista extends Publicaciones implements IConsultable{
	private Boolean consulta;

	public Revista(Integer codigo, String autor, String titulo, Integer añoPublicacion) {
		super(codigo, autor, titulo, añoPublicacion);
		this.consulta = false;
	}

	public Boolean getConsulta() {
		return consulta;
	}

	public void setConsulta(Boolean consulta) {
		this.consulta = consulta;
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

	@Override
	public String toString() {
		return super.toString() + "Revista [consulta=" + consulta + "]";
	}
	
	

}
