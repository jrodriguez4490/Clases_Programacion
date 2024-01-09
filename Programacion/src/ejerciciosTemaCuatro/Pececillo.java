package ejerciciosTemaCuatro;

public class Pececillo extends Mascota {

	private Boolean aguaCaliente;

	public Boolean getAguaCaliente() {
		return aguaCaliente;
	}
	public void setAguaCaliente(Boolean aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}

		@Override
		public Boolean estaVivo() {
			
			if(aguaCaliente) {
				if(getEdad() > 3) {
					return false;
				}
				else {
					if(getEdad()>5) {
						return false;
					}
				}
			}
			
			return super.estaVivo();
		}
	
	}
	

