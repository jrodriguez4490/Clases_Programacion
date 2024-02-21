package e5Repaso;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List <Publicaciones> articulos;
	
	
	
	public Biblioteca() {
		
		articulos = new ArrayList<Publicaciones>();

	}

	public List<Publicaciones> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Publicaciones> articulos) {
		this.articulos = articulos;
	}

	@Override
	public String toString() {
		return "Biblioteca [articulos=" + articulos +  "]";
	}


	
	
}
