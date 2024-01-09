package ejerciciosTemaCuatro;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Curso curso1 = new Curso();

		System.out.println("DNI");

		Alumno alumno1 = new Alumno(sc.nextLine());

		System.out.println("Nombre");
		alumno1.setNombre(sc.nextLine());
		System.out.println("Edad");
		alumno1.setEdad(sc.nextInt());
		System.out.println("Nota");
		alumno1.setNota(sc.nextInt());
		System.out.println("Curso ID");
		curso1.setIdentificador(sc.nextLine());
		System.out.println("Descripcion");
		curso1.setDescripcion(sc.nextLine());
		

		System.out.println("DNI: " + alumno1.getDni());
		System.out.println("Nombre: " + alumno1.getNombre());
		System.out.println("Edad: " + alumno1.getEdad());
		System.out.println("Nota: " + alumno1.getNota());
		System.out.println("Curso: " + curso1.getIdentificador());
		alumno1.setCurso(curso1);
		System.out.println("Curso alumno: " + alumno1.getCurso().getDescripcion());
		System.out.println("Curso alumno: " + alumno1.getCurso().getIdentificador());

		

		sc.close();

	}
}
