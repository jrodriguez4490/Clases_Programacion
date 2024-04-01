package e59;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Geografia geo = new Geografia();
		
		Integer contador = 1;
		while(contador <= 5) {
			System.out.println("Indícame el país " + contador);
			String pais = sc.nextLine();
			System.out.println("Indícame su capital ");
			String capital = sc.nextLine();
			if (geo.agregarPais(pais, capital)) {
				System.out.println("Este país ya me lo habías dicho. Dime otro, por favor");
			}
			else {
				contador++;
			}
		}
		
		geo.imprimirPaises();
		System.out.println("Promedio letras: " + geo.calcularLongitudMediaPaises());
		System.out.println("Dime una letra bonita");
		String letra = sc.nextLine();
		System.out.println("Paises cuya capital empiezan por " + letra);
		geo.imprimirNumeroPaisesLetra(letra);
		System.out.println("Paises cuya capital empiezan por la misma letra que su nombre");
		geo.mismaLetra();
		geo.eliminarPaisConCapitalLetra(letra);
		System.out.println("Paises cuya capital empiezan por " + letra);
		geo.imprimirNumeroPaisesLetra(letra);
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
	
}

