/**
 * 
 */
package com.gestione.figure;

/**
 * @author Vittorio
 *
 */
public class Disegno {

	private Figura[] disegno;
	
	
	public Disegno() {
		this.disegno = new Figura[4];
		disegno[0] = new Quadrato(3);
		disegno[1] = new Rettangolo(3,4);
		disegno[2] = new Triangolo(3, 4);
		disegno[3] = new Cerchio(3);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Disegno d = new Disegno();
		for (Figura f: d.disegno) {
			System.out.println(f);
		}
			
	}

}
