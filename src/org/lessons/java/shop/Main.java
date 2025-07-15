package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        // Creo un prodotto
        Prodotto p1 = new Prodotto("Mouse", "Mouse wireless ergonomico", 25.99, 22);

        // Accedo direttamente agli attributi
        System.out.println("Codice: " + p1.codice);
        System.out.println("Nome: " + p1.nome);
        System.out.println("Descrizione: " + p1.descrizione);
        System.out.println("Prezzo base: " + p1.getPrezzoBase() + "€");
        System.out.println("Prezzo con IVA: " + p1.getPrezzoConIva() + "€");
        System.out.println("Nome esteso: " + p1.getNomeEsteso());

        System.out.println();

        // Altro prodotto 
        Prodotto p2 = new Prodotto("Tastiera", "Tastiera meccanica retroilluminata", 79.90, 22);

        System.out.println("Codice: " + p2.codice);
        System.out.println("Nome: " + p2.nome);
        System.out.println("Descrizione: " + p2.descrizione);
        System.out.println("Prezzo base: " + p2.getPrezzoBase() + "€");
        System.out.println("Prezzo con IVA: " + p2.getPrezzoConIva() + "€");
        System.out.println("Nome esteso: " + p2.getNomeEsteso());
    }
}
