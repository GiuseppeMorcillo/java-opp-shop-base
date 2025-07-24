package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Creo un prodotto completo
        Prodotto p1 = new Prodotto("Mouse", "Logitech", new BigDecimal("25.99"), new BigDecimal("0.22"));

        // Creo un prodotto usando il costruttore parziale
        Prodotto p2 = new Prodotto("Tastiera", "Corsair");
        p2.setPrezzo(new BigDecimal("79.00"));
        p2.setIva(new BigDecimal("0.22"));

        // Stampo info p1
        System.out.println("=== PRODOTTO 1 ===");
        System.out.println("Codice: " + p1.getCodice());
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Marca: " + p1.getMarca());
        System.out.println("Prezzo base: " + p1.getPrezzo());
        System.out.println("Prezzo con IVA: " + p1.getPrezzoConIva());
        System.out.println("Nome esteso: " + p1.getNomeEsteso());

        System.out.println();

        // Stampo info p2
        System.out.println("=== PRODOTTO 2 ===");
        System.out.println("Codice: " + p2.getCodice());
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Marca: " + p2.getMarca());
        System.out.println("Prezzo base: " + p2.getPrezzo());
        System.out.println("Prezzo con IVA: " + p2.getPrezzoConIva());
        System.out.println("Nome esteso: " + p2.getNomeEsteso());
    }
}
