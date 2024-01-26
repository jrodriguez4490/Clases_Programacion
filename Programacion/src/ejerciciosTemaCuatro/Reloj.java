package ejerciciosTemaCuatro;

import java.util.Objects;

public class Reloj {
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean formato24horas;

	public Reloj() {
		horas = 0;
		minutos = 0;
		segundos = 0;
		formato24horas = true;
	}

	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		formato24horas = true;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public Boolean getFormato24horas() {
		return formato24horas;
	}

	public void ponerEnHora(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}

	public void ponerEnHora(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public void setFormato24horas(Boolean formato24horas) {
		this.formato24horas = formato24horas;
	}

	public Boolean check() {
		return (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59);
	}

	@Override
	public String toString() {
		if (!check()) {
			return "HORA INCORRECTA";
		}
		if (formato24horas || horas <= 12) {
			String cadena = formatNumber(horas) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos);
			if (!formato24horas) {
				cadena += " am";
			}
			return cadena;
		}
		return formatNumber(horas - 12) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos) + " pm";
	}

	private String formatNumber(Integer x) {
		if (x >= 10) {
			return x.toString();
		}
		return "0" + x;
	}

	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}

}
