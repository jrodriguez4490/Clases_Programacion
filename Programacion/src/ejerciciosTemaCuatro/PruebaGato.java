package ejerciciosTemaCuatro;

public class PruebaGato {
	public static void main(String[] args) {
		Gato bigotitos = new Gato();
		Gato manoplas = new Gato();
		Gato antonio = new Gato();
		Gato juan = new Gato();
		Pececillo gabriel = new Pececillo();
		
		juan.setNombre("Juan");

		bigotitos.setRaza("persa");
		manoplas.setRaza("naranja");
		bigotitos.setEdad(12);
		
		if (bigotitos.estaVivo()) {
			System.out.println("Vive");
		}
		else {
			System.out.println("Que te den Bigotitos a la tumba");
		}
		
		
	}
}
