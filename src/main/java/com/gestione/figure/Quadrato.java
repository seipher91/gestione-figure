/**
 * 
 */
package com.gestione.figure;

/**
 * @author Vittorio
 *
 */
public class Quadrato extends Figura {

	public Quadrato() {
		super();
		this.variabili = 1;
	}

	public Quadrato(double l) {
		super();
		this.lato1 = l;
		this.variabili = 1;
	}

	@Override
	public double area() {
		double area = 0.0;
		area = Math.pow(this.lato1, 2);
		return area;
	}

}
