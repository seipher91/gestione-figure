/**
 * 
 */
package com.gestione.figure;

/**
 * @author Vittorio
 *
 */
public class Rettangolo extends Figura {

	private double l, h;

	public Rettangolo(double l, double h) {
		super();
		this.l = l;
		this.h = h;
	}

	@Override
	public double area() {
		double area = 0;
		area = this.l * this.h;
		return area;
	}

}
