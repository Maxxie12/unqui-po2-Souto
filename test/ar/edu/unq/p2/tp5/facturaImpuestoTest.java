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

class facturaImpuestoTest {

	FacturaImpuesto liderar,telecentro;
	Agencia agenciaEdesur;

	@BeforeEach
	void setUp() throws Exception {
		agenciaEdesur = new Agencia("Edesur");
		telecentro = new FacturaImpuesto(50, agenciaEdesur);
		liderar = new FacturaImpuesto(200, agenciaEdesur);	
	}

	@Test
	void montoDelImpuesto() {
		assertEquals(liderar.montoAPagar(), 200);
		assertEquals(telecentro.montoAPagar(), 50);
	}
	
	@Test
	void tasaDeServicios() {
		assertEquals(liderar.montoAPagar(), 200);
		assertEquals(telecentro.montoAPagar(), 50);
	}
}