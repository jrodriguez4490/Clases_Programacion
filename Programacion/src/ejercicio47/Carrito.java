package ejercicio47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Carrito {
	private Cliente cliente;
	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
//	private List<Articulos> articulos;
	private Set<Articulos> articulo;

	public Carrito(Cliente cliente) {
		super();
		fechaCreacion = LocalDate.now();
//		articulos = new ArrayList<Articulos>();
		articulo = new HashSet<Articulos>();
		this.cliente = cliente;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaActualizacion() {
		fechaActualizacion = LocalDate.now();
		return fechaActualizacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Set<Articulos> getArticulos() {
		return articulo;
	}

	public Integer getCantidad() {

		return articulo.size();

	}

	public Double getTotal() {
		Double total = 0.0;
		for (Articulos articulo : articulo) {
			total = total + articulo.getPrecio();
		}

		return total;
	}

	public Double getPrecioMedio() {
		if (articulo.isEmpty()) {
			return 0D;
		}
		return getTotal() / getCantidad();

	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		return "Carrito [cliente=" + cliente.getDni() + cliente.getNombre() + ", getFechaActualizacion()="
				+ getFechaActualizacion().format(formato) + ", getCantidad()=" + getCantidad() + ", getTotal()="
				+ getTotal() + "]";
	}

	public void addArticulo(Articulos articulo) {
		articulo.add(articulo);
		fechaUltimaAct = LocalDate.now();
	}


	public void borrarArticulo(int posicion) {

		articulo.remove(posicion);
		fechaActualizacion = LocalDate.now();

	}

	public void vaciarCesta() {
		articulo.clear();
		fechaActualizacion = LocalDate.now();

	}

}
