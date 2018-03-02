/**
 * 
 */
package com.gestione.figure;

/**
 * @author Vittorio
 *
 */
public abstract class Figura {
	
	public abstract double area();
	
	
	@Override
	public String toString() {
		return "L'area della figura è "+area();
	};
	
	
}
