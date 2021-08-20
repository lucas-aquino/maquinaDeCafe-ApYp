package maquinas.de.cafe;

public class MaquinaEstafadora extends MaquinaPremium {

	private boolean yaEstafe = false;

	@Override
	public VasoDeCafe servirCafe() {
		if(this.yaEstafe) {
			this.yaEstafe = false;
			return super.servirCafe();
		}
		
		this.yaEstafe = true;
		return new VasoDeCafe(false); // Entonces sirve un vaso vacio
	}
}
