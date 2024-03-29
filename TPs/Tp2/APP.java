package Tp2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class APP {
    public static void main(String[] args) {
        int[] table = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int nbThreads = 4;
        int taillePlage = table.length / nbThreads;

        ExecutorService pool = Executors.newFixedThreadPool(nbThreads);
        Sommeur[] sommeurs = new Sommeur[nbThreads];

        // Création et soumission des tâches aux threads
        for (int i = 0; i < nbThreads; i++) {
            int debut = i * taillePlage;
            int fin = (i == nbThreads - 1) ? table.length - 1 : (i + 1) * taillePlage - 1;
            sommeurs[i] = new Sommeur(table, debut, fin);
            pool.submit(sommeurs[i]);
        }

        // Attente de la fin de toutes les tâches
        pool.shutdown();
        try {
            pool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            System.err.println("Erreur lors de l'attente de la fin des threads : " + e.getMessage());
        }

        // Calcul de la somme totale
        int sommeTotale = 0;
        for (Sommeur sommeur : sommeurs) {
            sommeTotale += sommeur.getSomme();
        }

        // Affichage de la somme totale
        System.out.println("Somme totale du tableau : " + sommeTotale);
    }
}
