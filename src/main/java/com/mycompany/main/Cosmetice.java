
package com.mycompany.main;

public class Cosmetice {
    protected String nume;
    protected double cantitate;
    protected double pret;
    protected String marca;

    public Cosmetice(String nume, double cantitate, double pret, String marca) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Nume: " + nume + "\nCantitate: " + cantitate + " ml\nPret: " + pret + " RON\nMarca: " + marca;
    }
}

