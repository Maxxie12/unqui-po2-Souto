package ar.edu.unq.po2.tp5;

public abstract class Factura implements IPagable {

	protected Agencia agencia;
	
	abstract public double montoAPagar();
	
	@Override
	public void registrar() throws Exception {
		agencia.registrarPago(this);	
	}
	
	public IAgencia getAgencia() {
		return this.agencia;
	}
	
}