package ejercicio2Repaso;

import java.math.BigDecimal;

public class GPS {
	private BigDecimal coord1;
	private BigDecimal coord2;
	
	
	public GPS(BigDecimal coord1, BigDecimal coord2) {
		super();
		this.coord1 = coord1;
		this.coord2 = coord2;
	}
	
	public BigDecimal getCoord1() {
		return coord1;
	}
	public void setCoord1(BigDecimal coord1) {
		this.coord1 = coord1;
	}
	public BigDecimal getCoord2() {
		return coord2;
	}
	public void setCoord2(BigDecimal coord2) {
		this.coord2 = coord2;
	}

	

}
