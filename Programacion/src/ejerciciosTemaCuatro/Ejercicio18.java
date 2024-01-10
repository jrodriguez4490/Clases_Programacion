package ejerciciosTemaCuatro;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Curso curso1 = new Curso();
		curso1.setIdentificador("1");
		curso1.setDescripcion("DAM-DAW");
		Alumno[] arrayAlumnos = new Alumno[3];

		for (int i = 0; i < arrayAlumnos.length; i++) {

			System.out.println("Dame el DNi");

			arrayAlumnos[i] = new Alumno(sc.nextLine());

			System.out.println("Dame el nombre");

			arrayAlumnos[i].setNombre(sc.nextLine());

			System.out.println("Dame la edad");

			arrayAlumnos[i].setEdad(sc.nextInt());

			System.out.println("Dame la nota");

			arrayAlumnos[i].setNota(sc.nextInt());

			arrayAlumnos[i].setCurso(curso1);

			sc.nextLine();

		}

		for (int i = 0; i < arrayAlumnos.length; i++) {
			System.out.println(arrayAlumnos[i]);

		}

		if (arrayAlumnos[0].equals(arrayAlumnos[1])) {
			System.out.println("Alumno 1 y 2 tienen el mismo dni");
		} else if (arrayAlumnos[1].equals(arrayAlumnos[2])) {
			System.out.println("Alumno 2 y 3 tienen el mismo dni");
		} else if (arrayAlumnos[0].equals(arrayAlumnos[2])) {
			System.out.println("Alumno 1 y 3 poseen el mismo dni");
		} else {
			System.out.println("No se repiten los dni");

		}

//		
//		Alumno alumno2 = new Alumno();
//
//		System.out.println("DNI");
//
//		Alumno alumno1 = new Alumno(sc.nextLine());

//		System.out.println("Nombre");
//		alumno1.setNombre(sc.nextLine());
//		System.out.println("Edad");
//		alumno1.setEdad(sc.nextInt());
//		System.out.println("Nota");
//		alumno1.setNota(sc.nextInt());
//		sc.nextLine();
//		System.out.println("Curso ID");
//		curso1.setIdentificador(sc.nextLine());
//		System.out.println("Descripcion");
//		curso1.setDescripcion(sc.nextLine());
//		alumno1.setCurso(curso1);

		// System.out.println("DNI: " + alumno1.getDni());
		// System.out.println("Nombre: " + alumno1.getNombre());
		// System.out.println("Edad: " + alumno1.getEdad());
//		System.out.println("Nota: " + alumno1.getNota());
//		System.out.println("Curso: " + curso1.getIdentificador());
//		alumno1.setCurso(curso1);
//		System.out.println("Curso alumno: " + alumno1.getCurso().getDescripcion());
//		System.out.println("Curso alumno: " + alumno1.getCurso().getIdentificador());
//
//		System.out.println(alumno1);
//		System.out.println(curso1);

		sc.close();

	}
}
