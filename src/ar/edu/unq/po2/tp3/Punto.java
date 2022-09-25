package ar.edu.unq.po2.tp3;

public class Punto {
	int x,y ;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x < 0) {
			this.x = 0;
		}
		else {
			this.x = x;
		}
	}

	public int getY() {
		 
		return y;
	}

	public void setY(int y) {
		if (y < 0) {
			this.y = 0;
		}
		else {
			this.y = y;
		}
	}
	
	public Punto() {
		setX(0);
		setY(0);
	}
	
	public Punto(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public void moverPunto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punto sumarPunto(Punto punto) {
		this.x += punto.getX();
		this.y += punto.getY();	
		return this;
	}
	

	
}