package ejerciciosTemaCuatro;

import java.util.Objects;

public class Alumno extends Persona {
	private String dni;

	private Integer nota;

	private Curso cursoAlumno;

	public Alumno() {

		if (dni != null) {
			this.dni = dni.toUpperCase();
		}
	}

	public Curso getCurso() {
		return cursoAlumno;
	}

	public void setCurso(Curso cursoAlumno) {
		this.cursoAlumno = cursoAlumno;
	}

	public Alumno(String dni) {
		if (dni != null) {
			this.dni = dni.toUpperCase();
		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni != null) {
			this.dni = dni.toUpperCase();
		}
	}

	public Boolean validarDNI(String dni) {

		if (dni.isBlank()) {
			return false;

		}
		if (dni.length() == 9) {
			return true;
		} else {

			return false;
		}

	}

	public void aprobar() {
		if (nota < 5) {
			nota = 5;
		}

	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", cursoAlumno=" + cursoAlumno + ", Nombre=" + getNombre()
				+ ", Edad=" + getEdad() + "]";
	}

//	public Boolean validarDNI() {
//		if(dni.isEmpty()) {
//		
//		}
//	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

}
