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
	public void testEvenNumbers() {
		int cantidad = counter.getPares();
		assertEquals(cantidad, 2);
		
	}
	
	@Test 
	public void testUnevennumbers() {
		int cantidad = counter.getImpares();
		assertEquals(cantidad, 8);
	}
	
	@Test 
	public void testEsMultiploDe() {
		int cantidad = counter.getMultiplosDe(2);
		assertEquals(cantidad, 2);
		
	}
	

	@Test
	public void multiplos() {
		int amount = counter.multiplos(3, 2);	
		assertEquals(amount, 996);
	}





}
