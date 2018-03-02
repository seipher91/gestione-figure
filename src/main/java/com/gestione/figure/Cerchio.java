/**
 * 
 */
package com.gestione.figure;

/**
 * @author Vittorio
 *
 */
public class Cerchio extends Figura {

	private double r;

	public Cerchio(double r) {
		super();
		this.r = r;
	}

	@Override
	public double area() {
		double area = 0;
		area = Math.PI * Math.pow(this.r, 2);
		return area;
	}

}
