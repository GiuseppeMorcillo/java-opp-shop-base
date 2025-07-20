package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Creo un prodotto

        // Altro prodotto 
        Prodotto p2 = new Prodotto("Tastiera", "Tastiera meccanica retroilluminata", new BigDecimal(79), new BigDecimal(0.22));

        System.out.println("Codice: " + p2.codice);
        System.out.println("Nome: " + p2.nome);
        System.out.println("Descrizione: " + p2.descrizione);
        System.out.println("Prezzo base: " + p2.getPrezzoBase());
        System.out.println("Prezzo con IVA: " + p2.getPrezzoConIva());
        System.out.println("Nome esteso: " + p2.getNomeEsteso());
    }
}
