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
		bigotitos.setNombre("bigotitos");
		
		if (bigotitos.estaVivo()) {
			System.out.println("Vive");
		}
		else {
			System.out.println("Que te den Bigotitos a la tumba");
		}
		//manchitas = bigotitos; si en lugar de un .equals lo hacemos con "==" nos dirá que son iguales.
		//con el equals sería exáctamente lo mismo . Pero pdoemos sobrescribirlo en la clase
		if (bigotitos.equals(juan)) {
			System.out.println("Los gatos son iguales");
		}
		else {
			System.out.println("Los gatos son distintos");
		}
		
		System.out.println(bigotitos);
		
		
		
		
	}
}
