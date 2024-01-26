package ejerciciosTemaCuatro;

import java.util.Objects;

public class Resultado {
	
	private Integer golesLocales;
	private Integer golesVisitante;
	
	public Resultado() {
		this.golesLocales = 0;
		this.golesVisitante = 0;
	}
	@Override
	public int hashCode() {
		return Objects.hash(golesLocales, golesVisitante);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resultado other = (Resultado) obj;
		return Objects.equals(golesLocales, other.golesLocales) && Objects.equals(golesVisitante, other.golesVisitante);
	}
	@Override
	public String toString() {
		return golesLocales + " - " + golesVisitante;
	}
	
	public Boolean isVictoriaLocal() {
		if(golesLocales > golesVisitante) {
			return true;
		}else {
			return false;
		}
	}
	public Boolean isVictoriaVisitante() {
		if(golesLocales < golesVisitante) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public Boolean isEmpate() {
		if(golesLocales == golesVisitante) {
			return true;
		}else {
			return false;
		}
	}
	
	
}


