/**
 * 
 */
package com.gestione.figure;

/**
 * @author Vittorio
 *
 */
public class Quadrato extends Figura {

	private double l;

	public Quadrato(double l) {
		super();
		this.l = l;
	}

	@Override
	public double area() {
		double area = 0.0;
		area = Math.pow(this.l, 2);
		return area;
	}

}
