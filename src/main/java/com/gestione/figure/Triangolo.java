package com.gestione.figure;

/**
 * @author Vittorio
 *
 */
public class Triangolo extends Figura {
	
	public Triangolo() {
		super();
		this.variabili = 2;
	}

	public Triangolo(double l, double h) {
		super();
		this.lato1 = l;
		this.lato2 = h;
		this.variabili = 2;
	}

	@Override
	public double area() {
		double area = 0;
		area = (this.lato1 * this.lato2) / 2;
		return area;
	}

}
