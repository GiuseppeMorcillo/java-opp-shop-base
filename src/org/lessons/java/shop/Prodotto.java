package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    // ATTRIBUTI
    private final int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    // COSTRUTTORE COMPLETO
    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        Random rnd = new Random();
        this.codice = rnd.nextInt(100000);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // COSTRUTTORE PARZIALE
    public Prodotto(String nome, String marca) {
        Random rnd = new Random();
        this.codice = rnd.nextInt(100000);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = BigDecimal.ZERO;
        this.iva = BigDecimal.ZERO;
    }

    // GETTER solo per codice
    public int getCodice() {
        return codice;
    }

    // GETTER e SETTER per gli altri attributi
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    // METODO di utilità: prezzo con IVA
    public BigDecimal getPrezzoConIva() {
        if (prezzo != null && iva != null) {
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    // METODO di utilità: nome esteso
    public String getNomeEsteso() {
        return codice + " - " + nome;
    }
}
