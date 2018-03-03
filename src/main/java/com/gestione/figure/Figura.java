/**
 * 
 */
package com.gestione.figure;

/**
 * @author Vittorio
 *
 */
public abstract class Figura {

	protected int variabili = 0;
	protected double lato1 = 0, lato2 = 0;

	public double getVariabili() {
		return this.variabili;
	}
	

	protected double setLato1(double lato1) {
		return this.lato1 = lato1;
	}


	protected void setLato2(double lato2) {
		this.lato2 = lato2;
	}


	public abstract double area();

	@Override
	public String toString() {
		return "L'area della figura " + this.getClass().getSimpleName() + " è " + area();
	};

}
