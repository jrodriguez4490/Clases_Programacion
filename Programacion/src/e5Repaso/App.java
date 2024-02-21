package e5Repaso;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		Biblioteca bilibiloteca = new Biblioteca();
		List <Publicaciones> articulos = new ArrayList<Publicaciones>();
		bilibiloteca.setArticulos(articulos);
		Libro juan = new Libro(4490, "Juan","la vida de juanes",1999);
		articulos.add(juan);
		Revista chorra = new Revista (4491, "Banana Edision","la vida de las bananas",1990);
		articulos.add(chorra);
		CD losChichos = new CD (0101, "Los chichos", "Chicharos", 1787);
		articulos.add(losChichos);
		System.out.println(bilibiloteca);
		losChichos.prestar();
		juan.prestar();
		System.out.println(bilibiloteca);
		juan.devolver();
		juan.terminarConsulta();
		System.out.println(bilibiloteca);
		
		
		
		
	}
	
}
