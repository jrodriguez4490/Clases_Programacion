package ejerciciosTemaCuatro;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	
	List <Actor> listaActores = new ArrayList<Actor>();
	Titulo titulo = new Titulo();
	Director director = new Director();
	Estreno estreno = new Estreno();
	Guionista guionista = new Guionista();

	
	
	public List<Actor> getListaActores() {
		return listaActores;
	}
	public void setListaActores(List<Actor> listaActores) {
		this.listaActores = listaActores;
	}


	public Titulo getTitulo() {
		return titulo;
	}
	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public Estreno getEstreno() {
		return estreno;
	}
	public void setEstreno(Estreno estreno) {
		this.estreno = estreno;
	}
	public Guionista getGuionista() {
		return guionista;
	}
	public void setGuionista(Guionista guionista) {
		this.guionista = guionista;
	}
	
	
	
	
}
