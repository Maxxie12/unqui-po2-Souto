package ar.edu.unq.po2.tp3;

import java.util.HashSet;
import java.util.Set;

public class EquipoDeTrabajo {
	
	private String nombre;
	private Set<Persona> equipo = new HashSet<Persona>();

	public String nombre() {
		return nombre;
	}

	public void addPerson(Persona p) {
		equipo.add(p);
	}

	public double promedio() {
		return equipo.stream().mapToDouble(p -> Double.valueOf(p.getEdad())).average().orElse(0.0);
	}
}
