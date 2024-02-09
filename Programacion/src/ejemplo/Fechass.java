package ejemplo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Fechass {
public static void main(String[] args) {
	LocalDate fecha= LocalDate.now();
	System.out.println(fecha);
	
	LocalDate fechaOtra = LocalDate.of(2021, 10, 3);
	
	System.out.println(fechaOtra);
	fechaOtra.withYear(2023);
	System.out.println(fechaOtra);

	fechaOtra=fechaOtra.withYear(2023);
	System.out.println(fechaOtra);

	Integer dia = fechaOtra.getDayOfMonth();
	System.out.println(dia);
	System.out.println(fechaOtra.isLeapYear());
	System.out.println(fechaOtra.lengthOfMonth());
	
	fecha = fecha.plusWeeks(4);
	System.out.println(fecha);
	fecha = fecha.minusWeeks(4);
	System.out.println(fecha);
	System.out.println(fecha.getDayOfWeek().getValue());
	Period periodo = fechaOtra.until(fecha);
	System.out.println(periodo.getYears()*12 + periodo.getMonths());
	System.out.println(periodo.getMonths());
	System.out.println(periodo.getDays());
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String cadena = fecha.format(formato);
	System.out.println(cadena);
	String fechaCadena = "13/04/2022";
	LocalDate newFecha =LocalDate.parse(fechaCadena, formato);
	System.out.println(newFecha);
	


}
}
