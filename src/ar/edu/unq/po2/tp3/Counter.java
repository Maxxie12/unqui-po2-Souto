package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	
	 public  ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
	 
	 public boolean esNumeroPar(int numero) {
		 return (numero%2 == 0);
	 }
	 
	 public void add(int numero) {
		 this.listaDeNumeros.add(numero);
		 
	 }
	
	 
	 public int getPares() {
	    int pares   = 0;
		
		for (int i=0;i<listaDeNumeros.size();i++) {
			if(esNumeroPar(i)) {
				pares = pares + 1;
				
			}
		}
		return pares;
	 }
	 
	 public int sumarImpares() {
		 int impares = 0;
		 
		 for (int i=0;i<listaDeNumeros.size();i++) {
				if(! esNumeroPar(i)) {
					impares = impares + 1;
		}
			
				return (impares);		 
	 }
	 
	

		 
		 
	 



}
