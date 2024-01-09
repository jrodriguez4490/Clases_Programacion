package ejerciciosTemaCuatro;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alumno alumno1 = new Alumno(sc.nextLine());
		Alumno alumno2 = new Alumno("12345678B");
		
		System.out.println("DNI");
		alumno1.setDni(sc.nextLine());
		System.out.println("Nombre");
		alumno1.setNombre(sc.nextLine());
		System.out.println("Edad");
		alumno1.setEdad(sc.nextInt());
		System.out.println("Nota");
		alumno1.setNota(sc.nextInt());
		

		System.out.println("DNI: " + alumno1.getDni());
		System.out.println("Nombre: " + alumno1.getNombre());
		System.out.println("Edad: " + alumno1.getEdad());
		System.out.println("Nota: " + alumno1.getNota());
		alumno2.aprobar();
		System.out.println(alumno2.getNota());
		sc.close();

	}
}
