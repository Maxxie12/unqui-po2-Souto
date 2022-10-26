package ar.edu.unq.po2.tp5;

public class ProductoDeEmpresa extends Producto {

	public ProductoDeEmpresa(double precio, int stock) {
		
		this.setStock(stock);
		this.setPrecio(precio);
		
	}

	@Override
	public double montoAPagar() {
		return this.getPrecio();
	}

}