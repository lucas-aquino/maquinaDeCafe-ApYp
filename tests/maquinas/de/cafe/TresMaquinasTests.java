package maquinas.de.cafe;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TresMaquinasTests {

	MaquinaDeCafe[] maquinas;
	
	@Before
	public void setUp() throws Exception {
		maquinas[0] = new MaquinaEconomica();
		maquinas[1] = new MaquinaEstafadora();
		maquinas[2] = new MaquinaPremium();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
	}

}
