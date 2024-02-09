package ejercicio50;

import java.util.Objects;

public class Pais {
	private String codigo;
	private String descripcion;
	
	

	public Pais(String codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Código del país : " + codigo + ", descripcion del país : " + descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo.toUpperCase());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Pais other = (Pais) obj;
		return Objects.equals(codigo.toUpperCase(), other.codigo.toUpperCase());
	}
	
	

	
}
