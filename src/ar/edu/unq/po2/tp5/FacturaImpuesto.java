package ar.edu.unq.po2.tp5;

public class FacturaImpuesto extends Factura {
	
	private double tasaDeServicios;

	public FacturaImpuesto(double tasaDeServicios, Agencia agencia) {
		super();
		this.tasaDeServicios = tasaDeServicios;
		this.agencia = agencia;
	}

	public double getTasaDeServicios() {
		return tasaDeServicios;
	}

	public void setTasaDeServicios(double tasaDeServicios) {
		this.tasaDeServicios = tasaDeServicios;
	}

	@Override
	public double montoAPagar() {
		return this.getTasaDeServicios();
	}


}