package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;


class CounterTestCase {
	private Counter counter;

	
	
	@BeforeEach
	public void setUp() throws Exception {
		//creo el contador
		counter = new Counter();
		
		counter.add(1);
		counter.add(2);
		counter.add(5);
		counter.add(7);
		counter.add(9);
		counter.add(1);
		counter.add(1);
		counter.add(1);
		counter.add(1);
		counter.add(4);
	}
	
	@Test 
	public void testEsPar() {
		assertTrue(counter.esNumeroPar(2));
		
		}
	
	
	@Test
	public int testEvenNumbers() {
		int cantidad = counter.getPares();
		assertEquals(cantidad, 1);
	}

}
