package ejerciciosTemaCuatro;

public class App2 {
	public static void main(String[] args) {
		Pilas pila = new Pilas();
		System.out.println("1:: " + pila);

		pila.añadirCadena("primero");
		pila.añadirCadena("segundo");
		System.out.println("2:: " + pila);

		System.out.println(pila.sacarCadena());
		System.out.println("3:: " + pila);

		pila.añadirCadena("tercero");
		System.out.println("4:: " + pila);

		while (pila.getTamaño() > 0) {
			System.out.println(pila.sacarCadena());
		}
		System.out.println("5:: " + pila);

		pila.añadirCadena("cuarto");
		System.out.println("6:: " + pila);
	}

}
