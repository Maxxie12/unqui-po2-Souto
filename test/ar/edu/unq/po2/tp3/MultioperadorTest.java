package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {

	private Multioperador multioperador;

	@BeforeEach
	public void setUp() throws Exception {
		multioperador= new Multioperador();
		multioperador.addNumber(1);
		multioperador.addNumber(3);
		multioperador.addNumber(5);

	}

	@Test
	void sumar() {
		int amount = multioperador.sumar(multioperador.getNumeros());	
		assertEquals(amount, 9);
	}

	@Test
	void restar() {
		int amount = multioperador.restar(multioperador.getNumeros());	
		assertEquals(amount, -9);
	}

	@Test
	void multiplicar() {
		int amount = multioperador.multiplicar(multioperador.getNumeros());	
		assertEquals(amount, 15);
	}


}
