package e55;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Evaluacion {
	private String dni;
	private BigDecimal nota;
	private Map<String, BigDecimal> alumnos;
	
	

	public Evaluacion() {
		alumnos = new HashMap<String, BigDecimal>();
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNota(BigDecimal nota) {
		this.nota = nota;
	}

	public Boolean addNota(String dniAlumno, BigDecimal notaAlumno) {

		if (alumnos.values().isEmpty()) {
			alumnos.put(dniAlumno, notaAlumno);
			return true;
		} else {
			return false;
		}

	}

	public Boolean corregirNota(String dniAlumno, BigDecimal notaAlumno) {
		if (!alumnos.values().isEmpty()) {
			alumnos.put(dniAlumno, notaAlumno);
			return true;
		} else {
			return false;
		}
	}

	public BigDecimal obtenerNotaAlumno(String dniAlumno) {
		BigDecimal notaAlumno = BigDecimal.ZERO;
		if (alumnos.containsKey(dniAlumno)) {
			notaAlumno = alumnos.get(dniAlumno);
			return notaAlumno;

		}

		return BigDecimal.ZERO;
	}

	public BigDecimal obtenerNotaMedia() {
		BigDecimal notaMedia = BigDecimal.ZERO;
		BigDecimal alumnosCantidad = BigDecimal.ZERO;
		for (Entry<String, BigDecimal> recorrido : alumnos.entrySet()) {
			alumnosCantidad = alumnosCantidad.add(BigDecimal.ONE);
			notaMedia = notaMedia.add(recorrido.getValue());

		}

		return notaMedia.divide(alumnosCantidad);
	}
	
	public Integer obtenerCantidadAprobados(){
		Integer contador = 0;
		BigDecimal media = new BigDecimal(4.99);
		for (Entry<String, BigDecimal> recorrido : alumnos.entrySet()) {
		if(recorrido.getValue().compareTo(media) > 0) {
			contador++;
		}else {
			
		}
		}
		return contador;

	}
	public Integer obtenerSuspensos(){
		Integer contador = 0;
		BigDecimal media = new BigDecimal(5);
		for (Entry<String, BigDecimal> recorrido : alumnos.entrySet()) {
		if(recorrido.getValue().compareTo(media) < 0) {
			contador++;
		}else {
			
		}
		}
		return contador;

	}
	
	public void imprimirAprobados() {
		if(obtenerCantidadAprobados()>0) {
			System.out.println("Aprobados: \n");
			for (Entry<String, BigDecimal> recorrido : alumnos.entrySet()) {
				if(recorrido.getValue().compareTo( new BigDecimal (4.99)) > 0) {
					System.out.println(recorrido.getKey() + " : " + recorrido.getValue());
					
				
				}
				}
		}else {
			System.out.println("No hay aprobados");
		}
	}

	public void imprimirSuspensos() {
		if(obtenerSuspensos()>0) {
			System.out.println("Suspensos: \n");
			for (Entry<String, BigDecimal> recorrido : alumnos.entrySet()) {
				if(recorrido.getValue().compareTo( new BigDecimal (5)) < 0) {
					System.out.println(recorrido.getKey() + " : " + recorrido.getValue());
					
				
				}
				}
		}else {
			System.out.println("No hay aprobados");
		}
	}
	@Override
	public String toString() {

		
		
		return imprimirAprobados();
	}
	
	
	
	
	
}
