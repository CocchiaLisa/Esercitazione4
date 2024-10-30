package src;

import java.util.Scanner;

public class Es3_for {
	/*
	 * Esercizio 3 - fattoriale
		Determinare il fattoriale di
		un numero intero N; 
		Valgono le seguenti
		relazioni: 
	     N! = N(N - 1)(N - 2) ... 1
	
	     0! = 1           1! = 1.
     */

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int n, fattoriale = 1;
		// Inizializzo il fattoriale a 1, che è il caso base oe 0 e 1
		
		// Chiedo all'utente il numero per cui vuole calcolare il fattoriale
		System.out.println("Inserisci il numero: ");
		n = in.nextInt();
		
		// Verifico se n è diverso da 0 e 1, poiché il fattoriale di 0 e 1 è già definito come 1
		if(n != 0 || n != 1) {
			// Calcolo del fattoriale usando un ciclo for
            // Iniziamo dal numero n e moltiplichiamo fino a 2
			// N(N - 1)(N - 2) ... 1
			// es. 5 --> 5, 4, 3, 2
			for(int i = n; i > 1; i--) {
				fattoriale *= i; // fattoriale = fattoriale * i;
				// Aggiorno il valore del fattoriale moltiplicandolo per i
			}
		}
		
		System.out.println("Il fattoriale è: " + fattoriale);
		in.close();
	
	}

}
