package maquinas.de.cafe;

public class VasoDeCafe {

	private boolean lleno;
	
	public VasoDeCafe(boolean lleno) {
		this.lleno = lleno;
	}
	
	public boolean estaLleno() {
		return this.lleno;
	}

	@Override
	public String toString() {
		return "VasoDeCafe [lleno=" + lleno + "]";
	}
}
