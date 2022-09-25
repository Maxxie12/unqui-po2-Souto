package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTest {
	
	private Punto punto;

	@BeforeEach
	public void setUp() throws Exception{
		punto = new Punto(3,5);
		
		
		
	}
	
	@Test
	public void testMoverPunto() {
		punto.moverPunto(2,3);
		assertEquals(punto.getX(), 2);
		assertEquals(punto.getY(), 3);
	}
	


}
