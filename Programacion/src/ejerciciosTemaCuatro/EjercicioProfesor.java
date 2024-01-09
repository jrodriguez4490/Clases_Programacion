package ejerciciosTemaCuatro;

import java.util.Scanner;

public class EjercicioProfesor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Profesor profesor1 = new Profesor();
		System.out.println("Edad");
		profesor1.setEdad(sc.nextInt());
		sc.nextLine();
		System.out.println("Nombre");
		profesor1.setNombre(sc.nextLine());
		System.out.println(profesor1.getEdad());
		System.err.println(profesor1.getNombre());
		sc.close();

	}
	
}
