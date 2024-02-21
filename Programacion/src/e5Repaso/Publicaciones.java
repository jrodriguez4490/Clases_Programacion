package e5Repaso;

import java.util.Objects;

public abstract class Publicaciones {
	private Integer codigo;
	private String autor;
	private String titulo;
	private Integer añoPublicacion;

	public Publicaciones(Integer codigo, String autor, String titulo, Integer añoPublicacion) {
		super();
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(Integer añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	@Override
	public String toString() {
		return "Publicaciones [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", añoPublicacion="
				+ añoPublicacion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicaciones other = (Publicaciones) obj;
		return Objects.equals(codigo, other.codigo);
	}

	
}
