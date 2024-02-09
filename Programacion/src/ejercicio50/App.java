package ejercicio50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		
		Set<Pais> prueba = new HashSet<Pais>();
		System.out.println(prueba);
		
		Pais españa = new Pais ("ES " , "España");
		Pais cook =  new Pais ("CK" , "Islas Cook");
		Pais caiman = new Pais ("CK", "Islas Caimán");
		
		prueba.add(españa);
		prueba.add(cook);
		prueba.add(caiman);
		
		System.out.println(prueba);
		
		Pais españa2 = new Pais ("es " , "España");
		prueba.add(españa2);
		System.out.println(prueba);
		
			
		
				Iterator<Pais> it = prueba.iterator();
				while (it.hasNext()) {
					if (!it.next().equals(españa)) {
						it.remove();
					
			
	
					}
				}
			System.out.println(prueba);
			prueba.clear();

		
				
	}
}
