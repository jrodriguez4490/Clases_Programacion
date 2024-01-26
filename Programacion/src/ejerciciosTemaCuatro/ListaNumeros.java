package ejerciciosTemaCuatro;

public interface ListaNumeros {
	/**Este metodo añade el numero que recibe a la lista
	 * 
	 * @param numero
	 */
	public void addNumero(Integer numero);
	/** Devuelve el numero de la lista que está en la posición que se indica
	 * 
	 * @param posicion
	 * @return Numero de la posición
	 */
	public Integer getNumeroDePosicion(Integer posicion);
	
	public Integer getPosicionDeNumero(Integer numero);
	
	public Integer getResta(Integer pos1, Integer pos2);

	public Integer sumaTodos();

	public Integer getMayor();
	
	public Integer getMedia();

	public Integer getMenor();

	public void ordenar();

	public void ordenarInverso();
	
	

}
