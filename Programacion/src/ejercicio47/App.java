package ejercicio47;

public class App {
public static void main(String[] args) {
	
	Cliente cliente = new Cliente ("12345678X", "Blas de los Montes");
	Carrito cesta = new Carrito(cliente);
	Ropa camiseta = new Ropa();
	camiseta.setColor("azul");
	camiseta.setTalla("XL");
	camiseta.setDescripcion("Poncho");
	camiseta.setPrecio(20.0);
	System.out.println(cesta);
	cesta.addArticulo(camiseta);
	cesta.addArticulo(camiseta);
	System.out.println(cesta);
	Libros libro = new Libros();
	libro.setAutor("Nixe");
	libro.setDescripcion("Asi hablo saratusta");
	libro.setPrecio(15.0);
	cesta.addArticulo(libro);
	cesta.borrarArticulo(1);
	System.out.println(cesta);
	cesta.vaciarCesta();
	System.out.println(cesta);
	System.out.println(cesta.getPrecioMedio());
	cesta.addArticulo(libro);
	cesta.addArticulo(libro);
	System.out.println(cesta.getPrecioMedio());

}
}
