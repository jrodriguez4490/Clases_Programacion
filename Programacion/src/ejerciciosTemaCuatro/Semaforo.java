package ejerciciosTemaCuatro;

public class Semaforo {
	public static final String ROJO = "rojo";
	public static final String AMBAR = "ámbar";
	public static final String VERDE = "verde";

	private String color;
	private Boolean parpadeando;

	public Semaforo() {
		color = ROJO;
		parpadeando = false;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (!color.equals(ROJO) && !color.equals(AMBAR) && !color.equals(VERDE)) {
			System.out.println("Color no válido");
		} else {
			this.color = color;
		}
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		if (parpadeando && !color.equals(AMBAR)) {
			return;
		}
		this.parpadeando = parpadeando;

	}

	@Override
	public String toString() {
		if (color.equals(AMBAR) && parpadeando) {
			return "semaforo en ÁMBAR parpadeando";
		} else {
			return "semáforo en " + color.toUpperCase();
		}

	}

	public void cambiarEstado() {

		if (color.equals(VERDE)) {
			color = AMBAR;
			parpadeando = true;
		} else if (color.equals(AMBAR) && parpadeando) {
			parpadeando = false;

		} else if (color.equals(AMBAR) && !parpadeando) {
			color = ROJO;
		} else if (color.equals(ROJO)) {
			color = VERDE;
		}

	}

}
