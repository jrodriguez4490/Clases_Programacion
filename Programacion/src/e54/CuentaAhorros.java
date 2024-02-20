package e54;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;

public class CuentaAhorros {
	private String numCuenta;
	private List<Movimiento> movimientos;
	private List<String> cadenas;

	public CuentaAhorros(String numCuenta) {
		this.numCuenta = numCuenta;
		movimientos = new ArrayList<Movimiento>();
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public BigDecimal getDineroTotal() {
		BigDecimal dineroTotal = BigDecimal.ZERO;
		for (Movimiento movimiento : movimientos) {
			dineroTotal = dineroTotal.add( .getImporte());
		}
		return dineroTotal;
	}

	public void addMovimientos(Movimiento movimiento) {
		movimientos.add(movimiento);
	}

	public List<String> getMovimientos() {
		cadenas = new ArrayList<String>();
		for (Movimiento movimiento : movimientos) {
			cadenas.add(movimiento.toString());

		}
		return cadenas;
	}

	public List<String> getRetiradas() {
		List<String> retiradas = new ArrayList<String>();
		for (Movimiento movimiento : movimientos) {
			if (movimiento.getTipo().equals("Retiradas")) {
				retiradas.add(movimiento.toString());
			}
		}
		return retiradas;
	}

	public List<String> getIngresos() {
		List<String> ingresos = new ArrayList<String>();
		for (Movimiento movimiento : movimientos) {
			if (movimiento.getTipo().equals("Ingreso")) {
				ingresos.add(movimiento.toString());
			}
		}
		return ingresos;
	}

	public List<String> getCargos() {
		List<String> cargo = new ArrayList<String>();
		for (Movimiento movimiento : movimientos) {
			if (movimiento.getTipo().equals("Cargo")) {
				cargo.add(movimiento.toString());
			}
		}
		return cargo;
	}

	@Override
	public String toString() {
		return "CuentaAhorros [numCuenta=" + numCuenta + ", movimientos=" + movimientos + ", cadenas=" + cadenas + "]";
	}

	
}
