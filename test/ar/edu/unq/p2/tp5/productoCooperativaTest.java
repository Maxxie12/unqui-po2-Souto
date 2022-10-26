package ar.edu.unq.p2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import ar.edu.unq.po2.tp5.Agencia;
import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.FacturaImpuesto;
import ar.edu.unq.po2.tp5.FacturaServicio;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoDeCooperativa;
import ar.edu.unq.po2.tp5.ProductoDeEmpresa;

class productoCooperativaTest {
	
	ProductoDeCooperativa tomate;
	ProductoDeCooperativa carne;

	@BeforeEach
	void setUp() throws Exception {		
		carne = new ProductoDeCooperativa(50.0,10);
		tomate = new ProductoDeCooperativa(20.0,5);
	}

	@Test
	void cantidadDeStock() {
		carne.decrementarStock();
		assertEquals(carne.getStock(),9);
		carne.decrementarStock();
		assertEquals(carne.getStock(),8);
		tomate.decrementarStock();
		assertEquals(tomate.getStock(),4);
		tomate.decrementarStock();
		tomate.decrementarStock();
		assertEquals(tomate.getStock(),2);
		carne.decrementarStock();
		assertEquals(carne.getStock(),7);
	}
	
	@Test
	void precioProducto() {
		assertEquals(carne.getPrecio(),50.0d);
		assertEquals(tomate.getPrecio(),20.0d);
	}

}