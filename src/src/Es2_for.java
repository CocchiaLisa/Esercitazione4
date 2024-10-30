package src;

/* Esercizio 2 - multipli di 5
Scrivi un programma che esegue la somma di tutti i numeri 
multipli di 5 compresi tra 10 e 100.
*/
public class Es2_for {

	public static void main(String[] args) {
		int somma = 0;
		
		// Ciclo per iterare attraverso i numeri da 10 a 100, incrementando di 5
        // Questo ci permette di considerare solo i multipli di 5: 10, 15, 20, ..., 100
		for(int i = 10; i <= 100; i = i + 5) {
			// faccio una stampa della somma incrementale (non necessaria)
			System.out.println(somma + " + " + i + " = " + (somma + i));
			somma += i;
		}
		
		/*
         * Ciclo alternativo che esegue la stessa somma, 
         * ma in modo meno efficiente controllando ogni numero da 10 a 100.
         * 
         * for (int i = 10; i <= 100; i++) {
         *     if (i % 5 == 0) {
         *         somma += i; // Aggiungo i solo se è un multiplo di 5
         *     }
         * }
         */
		System.out.println("\nLa somma è: " + somma);
	}

}
