package ejerciciosTemaCuatro;

public class Gato {
	private static Double precio; //con static todos los gatos costarían lo mismo siempre.
	private String nombre;
	private String raza;
	private Integer edad;
	
	public Gato() {
		raza = "desconocida";
		edad = 0;
		nombre = "anónimo";
		
	}
	public Gato(String nombre) {
		raza = "desconocida";
		edad = 0;
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Gato(String nombre, String raza, Integer edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	

}
