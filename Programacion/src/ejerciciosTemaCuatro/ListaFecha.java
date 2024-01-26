package ejerciciosTemaCuatro;

public interface ListaFecha {
	/**
	 * Cambiar la fecha actual con el día, mes, y año indicados
	 * 
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public void cambiar(Integer dia, Integer mes, Integer año);

	/**
	 * Cambiar la fecha actual por el día, mes y año del día en curso
	 * 
	 */
	public void cambiaractual();

	/**
	 * Devuelve la representación en cadena de la fecha según el formato configurado
	 * 
	 * @return
	 */

	public String toString();

	public Boolean validar();

	public void CambiarFormato(String patron);

	public boolean equals(Object obj);

	public Integer getDia();

	public Integer getMes();

	public Integer getAño();

	public String getDiaSemana();

	public void sumarDias(Integer dias);

	public void sumarMeses(Integer meses);

	public void sumarAños(Integer años);

	public Boolean esFestivo();

	/**
	 * Se restan dos días
	 * 
	 * @param dato
	 * @param dato2
	 * @return dato-dato2
	 */
	public Integer restar(Integer dato, Integer dato2);

	public Integer getDiasRestantesAño(ListaFecha fecha);

	public Boolean esBisiesto();

	public Integer getDiferencia(ListaFecha fecha1, ListaFecha fecha2);

}
