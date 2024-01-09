package ejerciciosTemaCuatro;

public class Alumno extends Persona {
	private String dni;

	private Integer nota;
	
	private Curso cursoAlumno;

	
	

	public Curso getCurso() {
		return cursoAlumno;
	}

	public void setCurso(Curso cursoAlumno) {
		this.cursoAlumno = cursoAlumno;
	}
	
	

	public Alumno(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

}
