package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        Random rnd = new Random();
        this.codice = rnd.nextInt(100000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }


    public double getPrezzoBase() {
        return prezzo;
    }

    public double getPrezzoConIva() {
        return prezzo + (prezzo * iva / 100);
    }


    public String getNomeEsteso() {
        return codice + "-" + nome;
    }
}
