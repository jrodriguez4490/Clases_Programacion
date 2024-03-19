package e55;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Evaluacion {
 
	private Map<String, BigDecimal> alumnos;

	

	public Evaluacion() {
		alumnos = new HashMap<String, BigDecimal>();
	}



	public Boolean addNota(String dniAlumno, BigDecimal notaAlumno) {

		if (alumnos.containsKey(dniAlumno)) {
			return false;
		} else {
			alumnos.put(dniAlumno, notaAlumno);
			return true;
		}

	}

	public Boolean corregirNota(String dniAlumno, BigDecimal notaAlumno) {
		if (alumnos.containsKey(dniAlumno)) {
			
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
		if(alumnos.isEmpty()) {
			return BigDecimal.ZERO;
		}
		BigDecimal notaMedia = BigDecimal.ZERO;
		BigDecimal alumnosCantidad = BigDecimal.ZERO;
		for (Entry<String, BigDecimal> recorrido : alumnos.entrySet()) {
			alumnosCantidad = alumnosCantidad.add(BigDecimal.ONE);
			notaMedia = notaMedia.add(recorrido.getValue());

		}

		return notaMedia.divide(alumnosCantidad, 2, RoundingMode.HALF_DOWN);
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
	
//	public List<String> obtenerSuspensos(){
//		List<String> suspensos = new ArrayList<String>();
//		for(String dni: alumnos.keySet()) {
//			if()
//		}
//	}
//	
	
	
//	public void borrarAprobados() {
//		BigDecimal media = new BigDecimal(4.99);
//
//for (Iterator <String >iterator = alumnos.keySet().iterator(); iterator.hasNext();) {
//	String dni =  iterator.next();
//
//	
//}
//		
//	}
//	
	private Boolean isAprobado(BigDecimal nota) {
		return nota.compareTo(new BigDecimal(5)) >= 0;
	}

	
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,###.0");

		String aprobados = "Aprobados: \n";
		
		if(obtenerCantidadAprobados()>0) {
			for (Entry<String, BigDecimal> recorrido : alumnos.entrySet()) {
				if(recorrido.getValue().compareTo( new BigDecimal (4.99)) > 0) {
					aprobados = aprobados + recorrido.getKey() + " " + "("+ format.format( recorrido.getValue())+")" +"\n";
					
				
				}
				}
		}else {
			
		}
		
		
		
		String suspensos = "Suspensos: \n";
		
		
		if(obtenerSuspensos()>0) {
			for (Entry<String, BigDecimal> recorrido : alumnos.entrySet()) {
				if(recorrido.getValue().compareTo( new BigDecimal (4.99)) <= 0) {
					suspensos = suspensos + recorrido.getKey() + " " + "("+ format.format( recorrido.getValue())+")" +"\n";
					
				
				}else {
					
				}
				}
		}
		
		return aprobados + "\n" + suspensos;
	}
	
	
	
	
	
}
