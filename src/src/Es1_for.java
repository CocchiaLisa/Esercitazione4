package src;
import java.util.Scanner;
/*
 * Esercizio 1 - tabellina
Creare un'applicazione in grado
di mostrare la  tabellina di un numero
scelto dall'utente partendo dal numero moltiplicato 
per zero fino al numero  moltiplicato per 10.
*/
public class Es1_for {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		// dichiarazioni variabili
		int n;
		
		// Chiedo il numero all'utente
		System.out.println("Inserisci un numero: ");
		n = in.nextInt();
		
		 // Utilizzo un ciclo for per stampare la tabellina del numero
        // Il ciclo va da 0 a 10, incrementando di 1 ad ogni iterazione
		for(int i = 0; i <= 10; i++) {
			// Stampo il risultato della moltiplicazione
			// La forma della stampa sarà: 5 x 0 = 0, 5 x 1 = 5, ...
			System.out.println(n + " x " + i + " = " +  n * i);
		}
		
		in.close();
	}

}
