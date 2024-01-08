package prueba;

import java.util.Objects;

public class Libro {
	private static String material;

	private String titulo;
	private String autor;
	private Integer numPag;
	private String editorial;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getNumPag() {
		return numPag;
	}
	public void setNumPag(Integer numPag) {
		this.numPag = numPag;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public static String getMaterial() {
		return material;
	}
	public static void setMaterial(String material) {
		Libro.material = material;
	}
	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(titulo, other.titulo);
	}



}
