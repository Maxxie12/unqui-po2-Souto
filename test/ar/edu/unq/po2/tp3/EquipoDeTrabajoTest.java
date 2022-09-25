package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {

	private Persona maxi;
	private Persona pablo;
	private Persona nico;
	private EquipoDeTrabajo equipo;

	@BeforeEach
	public void setUp() throws Exception {
		Date fecha = new Date();
		equipo = new EquipoDeTrabajo();
		maxi = new Persona(32,fecha, "maximiliano", "souto");
		pablo = new Persona(30,fecha,"mablo", "alvarez");
		nico = new Persona(29,fecha,"nicolas", "coripeta");
		equipo.addPerson(maxi);
		equipo.addPerson(pablo);
		equipo.addPerson(nico);
	}

	@Test
	void sumar() {
		double average = equipo.promedio();	
		System.out.println("El promedio es: " + average);
		assertEquals(average, 30.333333333333332);
	}

}
