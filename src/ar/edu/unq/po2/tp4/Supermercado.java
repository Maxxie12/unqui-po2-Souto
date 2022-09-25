package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.Collection;

public class Supermercado {
	 	
	private String nombre;
	private String direccion;
	private Collection<Producto> productos = new ArrayList<Producto>();

	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}

	public double getPrecioTotal() {
		return productos.stream().mapToDouble(Producto::getPrecio).sum();
	}

	public void agregarProducto(Producto p) {
		productos.add(p);
	}

}
