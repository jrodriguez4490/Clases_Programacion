package ejerciciosTemaCuatro;

public class PruebaGato {
	public static void main(String[] args) {
		Gato bigotitos = new Gato();
		Gato manoplas = new Gato("manoplas","callejero", 20);
		Gato antonio = new Gato();
		

		bigotitos.setRaza("persa");
		manoplas.setRaza("naranja");
		System.out.println(bigotitos.getRaza());
		System.out.println(manoplas.getRaza());
		System.out.println(antonio.getRaza());
		System.out.println(manoplas.getNombre());
		System.out.println(manoplas.getRaza());
		System.err.println(manoplas.getEdad());
	}
}
