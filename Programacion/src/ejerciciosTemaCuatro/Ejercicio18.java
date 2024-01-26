package ejerciciosTemaCuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Curso curso1 = new Curso();
		curso1.setIdentificador(1);
		curso1.setDescripcion("DAM-DAW");
		List<Alumno> lista = new ArrayList<>();

		String dni = "";

		for (int i = 0; i < 3; i++) {
			
			Alumno alumno = new Alumno(dni);
			lista.add(alumno);

			System.out.println("Dame el DNi");

			dni = sc.nextLine();

			if (lista.get(i).validarDNI(dni)) {

			}

			System.out.println("Dame el nombre");

			lista.get(i).setNombre(sc.nextLine());

			System.out.println("Dame la edad");

			lista.get(i).setEdad(sc.nextInt());

			System.out.println("Dame la nota");

			lista.get(i).setNota(sc.nextInt());

			lista.get(i).setCurso(curso1);

			sc.nextLine();

		}

		System.out.println(lista);
		

		if (lista.get(0).equals(lista.get(1))) {
			System.out.println("Alumno 1 y 2 tienen el mismo dni");
		} else if (lista.get(1).equals(lista.get(2))) {
			System.out.println("Alumno 2 y 3 tienen el mismo dni");
		} else if (lista.get(0).equals(lista.get(2))) {
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
