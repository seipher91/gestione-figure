/**
 * 
 */
package com.gestione.figure;

/**
 * @author Vittorio
 *
 */
public class Cerchio extends Figura {
	
	public Cerchio() {
		super();
		this.variabili = 1;
	}

	public Cerchio(double r) {
		super();
		this.lato1 = r;
		this.variabili = 1;
	}

	@Override
	public double area() {
		double area = 0;
		area = Math.PI * Math.pow(this.lato1, 2);
		return area;
	}

}
