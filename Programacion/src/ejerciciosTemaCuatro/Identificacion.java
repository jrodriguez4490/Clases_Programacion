package ejerciciosTemaCuatro;

public abstract class Identificacion {

	private String nombre;
	private Integer añoNacimiento;
	private String nacionalidad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAñoNacimiento() {
		return añoNacimiento;
	}

	public void setAñoNacimiento(Integer añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public abstract Integer getSueldo();

	@Override
	public String toString() {
		return "Identificacion [nombre=" + nombre + ", añoNacimiento=" + añoNacimiento + ", nacionalidad="
				+ nacionalidad + "]";
	}
		
		//Actores -> 100.000; Director -> 200.000; Guionista -> 50.000
		

	
	
	
}
