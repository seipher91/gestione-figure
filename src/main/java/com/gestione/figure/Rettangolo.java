/**
 * 
 */
package com.gestione.figure;

/**
 * @author Vittorio
 *
 */
public class Rettangolo extends Figura {

	public Rettangolo() {
		super();
		this.variabili = 2;
	}
	
	
	public Rettangolo(double l, double h) {
		super();
		this.lato1 = l;
		this.lato2 = h;
		this.variabili = 2;
	}

	@Override
	public double area() {
		double area = 0;
		area = this.lato1 * this.lato2;
		return area;
	}
	
	public double variabili() {
		return this.variabili;
	}

}
