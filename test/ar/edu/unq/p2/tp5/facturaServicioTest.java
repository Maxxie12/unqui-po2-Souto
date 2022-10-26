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

class facturaServicioTest {
	
	FacturaServicio luz, arba;
	Agencia agenciaEdesur;

	@BeforeEach
	void setUp() throws Exception {
		agenciaEdesur = new Agencia("Edesur");
		luz = new FacturaServicio(10, 5, agenciaEdesur);
		arba = new FacturaServicio(500, 5, agenciaEdesur);	
	}

	@Test
	void montoDelServicio() {
		assertEquals(luz.montoAPagar(), 50);
		assertEquals(arba.montoAPagar(), 2500);
	}

}