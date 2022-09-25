package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	
	 private  ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
	 
	 public boolean esNumeroPar(int numero) {
		 return (numero%2 == 0);
	 }
	 
	 public void add(int numero) {
		 this.listaDeNumeros.add(numero);
		 
	 }
	 
	 public boolean esMultiploDe(int numero1, int numero2) {
		  return (numero1%numero2 == 0);
	 }
	
	 
	 public int getPares() {
	    int pares   = 0;
		
		for (int i=0;i<listaDeNumeros.size();i++) {
			if(esNumeroPar(listaDeNumeros.get(i))) {
				pares = pares + 1;
							
			}
		}
		return pares;
	 }
	 
	 public int getImpares() {
		 int impares   = 0;
			
			for (int i=0;i<listaDeNumeros.size();i++) {
				if(!esNumeroPar(listaDeNumeros.get(i))) {
					impares = impares + 1;
								
				}
			}
			return impares;
	 	}
	 
	 

	 public int getMultiplosDe(int numero) {
		 int multiplos  = 0;
			
			for (int i=0;i<listaDeNumeros.size();i++) {
				if(esMultiploDe(listaDeNumeros.get(i), numero)) {
					multiplos = multiplos + 1;
								
				}
			}
			return multiplos;
	 	}

	
	 public int multiplos(int x, int y) {
			int numMultiploMasGrande = -1;
			for(Integer i = 0; i <= 1000; i++) {
				if( i % x == 0 && i % y == 0 ) {
					numMultiploMasGrande = i;
				}
			}
			return numMultiploMasGrande;
		}
		 
		 
	 



}
