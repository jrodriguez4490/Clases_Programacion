package ejerciciosTemaCuatro;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private Integer identificador;
	private String descripcion;
	private List<Alumno> alumnos;

	public Curso() {
		alumnos = new ArrayList<Alumno>();
	}

	public void addAlumno(Alumno alumnoNuevo) {
		alumnos.add(alumnoNuevo);
	}

	public List<Alumno> getAlumnos() {

		return alumnos;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Curso [identificador=" + identificador + ", descripcion=" + descripcion + "]";
	}

}
