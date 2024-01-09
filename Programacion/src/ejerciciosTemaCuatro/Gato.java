package ejerciciosTemaCuatro;

public class Gato extends Mascota{
	//private static Double precio; //con static todos los gatos costarían lo mismo siempre.
	private String raza;
	
	public Gato() {
		raza = "desconocida";

		
	}
	public Gato(String nombre) {
		raza = "desconocida";

		
	}



	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}


	

}
