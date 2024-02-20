package ejercicio4Repaso;

import java.time.LocalDate;

public abstract class Libros {
	private String titulo;
	private String autor;
	private LocalDate fechaEdicion;
	private Integer numPag;
	
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
	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(LocalDate fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}
	public Integer getNumPag() {
		return numPag;
	}
	public void setNumPag(Integer numPag) {
		this.numPag = numPag;
	}
	
	public abstract Boolean getTipo();
	
	
	
	
}
