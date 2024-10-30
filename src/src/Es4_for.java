package src;

import java.util.Scanner;

public class Es4_for {
	/* Esercizio 4 - voti pagella
	Scrivi un programma che effettua il calcolo della 
	media dei voti della pagella, inserendoli uno alla
	volta e chiedendo prima all'utente il numero di 
	materie da inserire.
	 * */
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int num_materie, media, somma = 0, voto;
		
		System.out.println("Inserisci il numero di materie: ");
		num_materie = in.nextInt();
		
		// Inizio un ciclo che si ripete per ogni materia
		// Se le materie sono 5 i sarà: 0, 1, 2, 3, 4
		for(int i = 0; i < num_materie; i++) {
			// chiedo e memorizzo un voto
			System.out.println("Inserisci voto materia " + (i + 1));
			voto =  in.nextInt();
			
			// Aggiungo il voto acquisito alla somma totale
			somma += voto;
		}
		
		// Al termine del ciclo, dopo aver chiesto tutti i voti calcolo la media
		media = somma / num_materie;
		
		System.out.println("La media è: " + media);
		
		in.close();
	}

}
