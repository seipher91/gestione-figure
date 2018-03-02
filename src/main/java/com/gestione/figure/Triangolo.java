package com.gestione.figure;

/**
 * @author Vittorio
 *
 */
public class Triangolo extends Figura {

	private double l, h;

	public Triangolo(double l, double h) {
		super();
		this.l = l;
		this.h = h;
	}

	@Override
	public double area() {
		double area = 0;
		area = (this.h * this.l) / 2;
		return area;
	}

}
