package ejerciciosTemaCuatro;

public class Mascota {
	private String nombre;
	protected Integer edad;
	
	public Boolean estaVivo() {
		if (edad > 30) {
			return false;
		}
		return true;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
