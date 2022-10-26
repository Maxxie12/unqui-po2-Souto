package ar.edu.unq.p2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Agencia;
import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.FacturaImpuesto;
import ar.edu.unq.po2.tp5.FacturaServicio;
import ar.edu.unq.po2.tp5.ProductoDeCooperativa;
import ar.edu.unq.po2.tp5.ProductoDeEmpresa;

class agenciaTest {

	Caja caja;
	Agencia agenciaEdesur;
	FacturaServicio luz;
	FacturaImpuesto arba;
	
	@BeforeEach
	void setUp() throws Exception {
		
		agenciaEdesur = new Agencia("Edesur");
		caja = new Caja();
		luz = new FacturaServicio(10,5, agenciaEdesur);
		arba = new FacturaImpuesto(500, agenciaEdesur);
		 
		caja.registrarPagable(luz);
		caja.registrarPagable(arba);
	}

	@Test
	void cantidadDeFacturasRegistradasEnLaAgencia() {
		assertEquals(agenciaEdesur.getCantidad(),2);
	}

}