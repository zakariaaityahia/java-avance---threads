package Tp2;

public class Sommeur implements Runnable {

    int [] table;
    int debut;
    int fin;
    int somme;

    public int getSomme() {
        return somme;
    }

    public Sommeur(int[] table, int debut, int fin) {
        this.table = table;
        this.debut = debut;
        this.fin = fin;
        this.somme = 0;
    }

    @Override
    public void run() {
        for (int i = debut; i <= fin; i++) {
            somme += table[i];
        }
    }
}
