package maquinas.de.cafe;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MaquinaEstafadoraTest {

	MaquinaDeCafe maquina;
	
	@Before
	public void setUp() throws Exception {
		maquina = new MaquinaEstafadora();
	}

	@After
	public void tearDown() throws Exception {
		maquina = null;
	}

	@Test
	public void queDevuelveUnVasoAlServir() {
		assertNotNull(maquina.servirCafe());
	}
	
	@Test
	public void quePudeServirUnCafe() {
		assertTrue(maquina.puedeServir());
	}
	
	@Test
	public void queElPrimerVasoEstaLlenoYElSiguienteVacio() {
		assertFalse(maquina.servirCafe().estaLleno());
		assertTrue(maquina.servirCafe().estaLleno());
		assertFalse(maquina.servirCafe().estaLleno());
		assertTrue(maquina.servirCafe().estaLleno());
	}
	
	@Test
	public void queSeAgoteElCafe() {
		for(int i = 0; i < 200; i++)
			maquina.servirCafe();
		assertFalse(maquina.puedeServir());
	}

	@Test
	public void queNoSeAgotaElCafe() {
		VasoDeCafe vaso = null;
		for(int i = 0; i < 200; i++)
			vaso = maquina.servirCafe();
		assertFalse(vaso.estaLleno());
	}
	
	@Test
	public void queLuegoDeAgotarElCafeSirveVasoVacio() {
		for(int i = 0; i < 200; i++)
			maquina.servirCafe();
		assertFalse(maquina.servirCafe().estaLleno());
	}

}
