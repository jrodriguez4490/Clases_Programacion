package Ejercicio44;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	List<Personaje> equipo;
	private Integer puntosVida;
	private Integer puntosCombate;

	public Equipo() {
		equipo = new ArrayList<Personaje>();

	}

	public Integer getPuntosCombate() {
		Integer combate = 0;
		for (int i = 0; i < equipo.size(); i++) {
			combate = combate + equipo.get(i).getDaño();

		}
		return puntosCombate;
	}

	public Integer getPuntosVida() {
		Integer vida = 0;
		for (int i = 0; i < equipo.size(); i++) {
			vida = vida + equipo.get(i).getVida();

		}

		return puntosVida;
	}

	public List<Personaje> getEquipo() {
		return equipo;
	}

//	public void setEquipo(List<Personaje> equipo) {
//		if (equipo.size() < 5) {
//			if(personaje != personaje)
//			this.equipo = equipo;
//
//		} else {
//
//		}
//
//	}
	
	

}
