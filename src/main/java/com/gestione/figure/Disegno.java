/**
 * 
 */
package com.gestione.figure;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vittorio
 *
 */
public class Disegno {

	private Figura[] disegno;
	private Figura f;

	public Disegno() {
		this.disegno = new Figura[0];
	}

	public Figura[] addFigura(Figura[] figure, Figura f) {
		if (figure == null) {
			figure = new Figura[1];
			this.disegno = figure;
		} else {
			figure = Arrays.copyOf(figure, figure.length + 1);
		}
		figure[figure.length - 1] = f;
		this.disegno = figure;
		return this.disegno;
	}

	private Disegno sceltaFigura(String s, Scanner input) {
		String figuraScelta = s.toLowerCase();

		switch (figuraScelta) {
		case "quadrato":
			this.addFigura(this.disegno, new Quadrato());
			break;
		case "rettangolo":
			this.addFigura(this.disegno, new Rettangolo());
			break;
		case "triangolo":
			this.addFigura(this.disegno, new Triangolo());
			break;
		case "cerchio":
			this.addFigura(this.disegno, new Cerchio());
			break;
		default:
			System.out.println("Non hai inserito una figura corretta!");
			figuraScelta = input.nextLine();
			this.sceltaFigura(figuraScelta, input);
			break;
		}
		return this;
	}

	private void inserimentoVariabili(double lato1) {

		this.disegno[this.disegno.length - 1].setLato1(lato1);
	}

	private void inserimentoVariabili(double lato1, double lato2) {

		this.inserimentoVariabili(lato1);
		this.disegno[this.disegno.length - 1].setLato2(lato2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		init();
	}

	public static void init() {

		Scanner input = new Scanner(System.in);
		String s;
		Disegno d = new Disegno();
		double lato1 = 0.0, lato2 = 0.0;
		do {
			System.out.println("Ciao!\nQuesto è un programma che ti permette di calcolare l'area di una figura piana.\n"
					+ "Scrivi l'area della figura che vuoi calcolare:\n1. Quadrato\n2. Rettangolo\n3. Triangolo\n4. Cerchio");
			s = input.nextLine();
			d.sceltaFigura(s, input);

			System.out.println("\nInserisci il valore del lato");
			if (d.disegno[d.disegno.length - 1].getVariabili() == 1) {
				lato1 = input.nextDouble();
				input.nextLine();
				d.inserimentoVariabili(lato1);
			} else {
				lato1 = input.nextDouble();
				input.nextLine();
				System.out.println("\nInserisci il valore dell'altezza");
				lato2 = input.nextDouble();
				input.nextLine();
				d.inserimentoVariabili(lato1, lato2);
			}

			System.out.println("\nElenco delle aree calcolate!");
			for (Figura f : d.disegno) {
				System.out.println(f);
			}

			System.out.println("\nVuoi chiudere il programma? Si/No");
			s = input.nextLine();
		} while (s.charAt(0) != 's' && s.charAt(0) != 'S');
		input.close();
		System.out.println("\nProgramma chiuso");
	}

}
