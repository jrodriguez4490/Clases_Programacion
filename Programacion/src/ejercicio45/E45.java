package ejercicio45;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class E45 {
	public static void main(String[] args) {

		String fechaCadena;
		Boolean validacion = false;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		
		do {
		Scanner sc = new Scanner (System.in);

		System.out.println("Ingresa la fecha de nacimiento");
		 fechaCadena = sc.nextLine();
		
		
		if(!fechaCadena.contains("/")) {
			System.out.println("La fecha no contiene /");
			validacion = false;
		}else {

		validacion= true;
		}

		

	}while(!validacion);
		LocalDate fecha = LocalDate.parse(fechaCadena, formato);
		System.out.println(fecha.format(formato));
		
		if(fecha.isLeapYear()) {
			System.out.println("Naciste en un año bisiesto");
		}else {
			System.out.println("No es un año bisiesto");
		}
		System.out.println("El día de la semana en la que naciste fue el día " + fecha.getDayOfWeek().getValue());
		LocalDate fechaActual= LocalDate.now();
		Period periodo = fecha.until(fechaActual);
		System.out.println("Tienes " + periodo.getYears() + " años.");
		LocalDate fechaMuerte = fecha.plusYears(100);
		periodo = LocalDate.now().until(fechaMuerte);
		System.out.println("Te quedan " + periodo.getYears() + " años " + periodo.getMonths() + " meses " + periodo.getDays() + " días " );
		LocalTime hora = LocalTime.now();
		
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(formato2.format(hora));

		
}
//	private static boolean isFormatoIncorrecto(String fechaCadena) {
//		String [] partes = fechaCadena.split("/");
//		if(partes.length !=3) {
//			return false;
//		}
//		Integer dia = Integer.parseInt(partes[0]);
//		Integer mes = Integer.parseInt(partes[1]);
//		Integer año = Integer.parseInt(partes[2]);
//		return (dia <1 || dia >31 || mes <1 || mes >12);
//
//	}
	
}
