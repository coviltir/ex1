
package com.mycompany.main;


public class Sampon {
    private String nume;
    private double cantitate;
    private double pret;
    private String marca;
    private String tipPar;

    public Sampon(String nume, double cantitate, double pret, String marca, String tipPar) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
        this.marca = marca;
        this.tipPar = tipPar;
    }

    @Override
    public String toString() {
        return "Sampon:\nNume: " + nume + "\nCantitate: " + cantitate + " ml\nPret: " + pret + " RON\nMarca: " + marca + "\nTip Par: " + tipPar;
    }
}

