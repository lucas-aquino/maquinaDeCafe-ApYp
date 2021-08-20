package maquinas.de.cafe;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MaquinaPremiumTest {

	MaquinaDeCafe maquina;
	
	@Before
	public void setUp() throws Exception {
		maquina = new MaquinaPremium();
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
	public void queSeAgoteElCafe() {
		for(int i = 0; i < 100; i++)
			maquina.servirCafe();
		assertFalse(maquina.puedeServir());
	}

	@Test
	public void queLuegoDeAgotarElCafeSirveVasoVacio() {
		for(int i = 0; i < 100; i++)
			maquina.servirCafe();
		assertFalse(maquina.servirCafe().estaLleno());
	}
}
