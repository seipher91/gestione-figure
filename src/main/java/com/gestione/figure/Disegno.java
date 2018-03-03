/**
 * 
 */
package com.gestione.figure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Vittorio
 *
 */
public class Disegno {

	private Figura[] disegno;

	public Disegno() {
		this.disegno = new Figura[0];
	}

	public Figura[] addFigura(Figura[] figure, Figura f) {

		figure = Arrays.copyOf(figure, figure.length + 1);
		figure[figure.length - 1] = f;
		this.disegno = figure;
		return this.disegno;
	}

	public Disegno sceltaFigura(int choose) {

		switch (choose) {
		default:
			System.err.println("Wrong Choose");
		case 1:
			this.addFigura(this.disegno, new Quadrato());
			break;
		case 2:
			this.addFigura(this.disegno, new Rettangolo());
			break;
		case 3:
			this.addFigura(this.disegno, new Triangolo());
			break;
		case 4:
			this.addFigura(this.disegno, new Cerchio());
			break;
		}
		return this;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		init();
	}

	public static void init() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ciao!\nQuesto è un programma che ti permette di calcolare l'area di una figura piana.\n"
				+ "Inserisci l'intero desiderato\n1. Quadrato\n2. Rettangolo\n3. Triangolo\n4. Cerchio");
		int i = sc.nextInt();

		Disegno d = new Disegno();
		d.sceltaFigura(i);

		System.out.println("Inserisci il lato ");

		if (d.disegno[d.disegno.length - 1].getVariabili() == 1) {

			double lato1 = sc.nextDouble();
			sc.nextLine();
			sc.close();
			d.inserimentoVariabili(lato1);
		} else {

			double lato1 = sc.nextDouble();
			sc.nextLine();
			System.out.println("inserisci il lato 2 ");
			double lato2 = sc.nextDouble();
			sc.nextLine();
			d.inserimentoVariabili(lato1, lato2);
			sc.close();
		}

	
		for (Figura f : d.disegno) {
			System.out.println(f);
		}

	}

	public void inserimentoVariabili(double lato1) {

		this.disegno[this.disegno.length - 1].setLato1(lato1);
	}

	public void inserimentoVariabili(double lato1, double lato2) {

		this.disegno[this.disegno.length - 1].setLato1(lato1);
		this.disegno[this.disegno.length - 1].setLato2(lato2);
	}

}
