package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Caja {
	
	public Caja() {}

	private List<IPagable> pagables = new ArrayList<IPagable>();
	
	public double montoTotalAPagar() {
		return pagables.stream().collect(Collectors.summingDouble(p -> p.montoAPagar()));
	}
	
	public void registrarPagable(IPagable pagable) throws Exception {	
		pagables.add(pagable);
		pagable.registrar();	
	}
	
	public int getCantidadPagables() {
		return pagables.size();
	}
	
}
