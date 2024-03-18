package e55;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Map.Entry;

public class Evaluacion {
	private String dni;
	private BigDecimal nota;
	private Map<String, BigDecimal> alumnos;
	
	

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
		
	}
	
}
