package prueba;

import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Libro x = new Libro();
		Libro y = new Libro();
		Libro z = x;
		
		
		x.setTitulo("Juan Antonio");
		
		y = x; 
		// SI NO HAY UN NEW LIBRO EN Y Y SE CREA LIBRO Y = X AMBOS APUNTARÁN AL MISMO OBJETO AUNQUE CAMBIES LOS VALORES DE Y. PERO SI HAY 
		//DOS ENTIDADES LIBRO Y Y=X Y CAMBIAMOS LOS VALORES DE Y, X TAMBIÉN CAMBIA.

		y.setTitulo("No es el libro de Juan Antonio");
		


		sc.close();
		x.setAutor("Juan");
		x.setNumPag(400);
		x.setEditorial("Editoriales Juan Antonio");
		// x.setMaterial("Papiro"); Al ser estático no es lógico llamarlo a través del
		// objeto. Es funcional pero no es correcto.
		// y.setMaterial("Papel");
		Libro.setMaterial("Papiro");

		System.out.println(y.getTitulo());
		System.out.println(Libro.getMaterial());

		System.out.println(x.getTitulo());
		System.out.println(Libro.getMaterial());
		System.out.println(z.getTitulo());

		// System.out.println(x.getAutor());
		// System.out.println(x.getNumPag());
		// System.out.println(x.getEditorial());

		sc.close();

	}

}
