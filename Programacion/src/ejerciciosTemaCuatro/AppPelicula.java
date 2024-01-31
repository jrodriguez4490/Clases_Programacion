package ejerciciosTemaCuatro;

import java.util.ArrayList;
import java.util.List;

public class AppPelicula {
public static void main(String[] args) {
	
	Estreno pelicula = new Estreno();
	Titulo peli = new Titulo();
	List <Actor> listaActores = new ArrayList <Actor>();
	Guionista guionista = new Guionista();
	Guionista guionista2 = new Guionista();

	Director director = new Director();
	Actor actor = new Actor ();
	Actor actor2 = new Actor ();
	Actor actor3 = new Actor ();
	Actor actor4 = new Actor ();
	List<Actor> listaPelicula2 = new ArrayList <Actor>();

	actor.setNombre("Blas Blau");
	actor.setNacionalidad("España");
	actor.setAñoNacimiento(1983);
	listaActores.add(actor);
	
	actor2.setNombre("Laura Pozo");
	actor2.setNacionalidad("Italia");
	actor2.setAñoNacimiento(1981);
	listaActores.add(actor2);

	actor3.setNombre("Marcel Cade");
	actor3.setNacionalidad("Suiza");
	actor3.setAñoNacimiento(2001);
	
	actor4.setNombre("Violeta Volo");
	actor4.setNacionalidad("Rusia");
	actor4.setAñoNacimiento(1999);
	
	director.setNombre("Sara Marea");
	director.setNacionalidad("Reino Unido");
	director.setAñoNacimiento(1994);
	
	guionista.setNombre("Marco Smith");
	guionista.setNacionalidad("Reino Unido");
	guionista.setAñoNacimiento(1988);
	
	guionista2.setNombre("Cheng Shu");
	guionista2.setNacionalidad("China");
	guionista2.setAñoNacimiento(1977);
	
	listaPelicula2.add(actor);
	listaPelicula2.add(actor2);
	listaPelicula2.add(actor3);
	listaPelicula2.add(actor4);



	
	
	
	Pelicula pelicula1 = new Pelicula();
	
	
	peli.setTitulo("Do you know Joe Blas?");
	pelicula.setAñoEstreno(2027);
	pelicula1.setTitulo(peli);
	pelicula1.setEstreno(pelicula);
	
	pelicula1.setGuionista(guionista);
	pelicula1.setDirector(director);
	pelicula1.setListaActores(listaActores);
	
	Pelicula pelicula2 = new Pelicula();
	pelicula2.setDirector(director);
	pelicula2.setEstreno(pelicula);
	Titulo titulo2 = new Titulo();
	titulo2.setTitulo("Muerte en la sombra");
	pelicula2.setTitulo(titulo2);
	pelicula2.setDirector(director);
	pelicula2.setGuionista(guionista2);
	pelicula2.setListaActores(listaPelicula2);
	
	System.out.println(pelicula2.getListaActores());
	
	
	System.out.println(pelicula1.getDirector().getSueldo() + " " + pelicula1.getDirector().getNacionalidad());
	
	
	pelicula2.listaActores.remove(2);
	pelicula1.listaActores.add(actor3);
	System.out.println(pelicula2.getListaActores());
	System.out.println(pelicula1.getListaActores());
	

	

	
	
}
	
	
}
