
package com.mycompany.main;


public class AfterShave {
    private String nume;
    private double cantitate;
    private double pret;
    private String marca;
    private String tipParfum;

    public AfterShave(String nume, double cantitate, double pret, String marca, String tipParfum) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
        this.marca = marca;
        this.tipParfum = tipParfum;
    }

    @Override
    public String toString() {
        return "Aftershave:\nNume: " + nume + "\nCantitate: " + cantitate + " ml\nPret: " + pret + " RON\nMarca: " + marca + "\nTip Parfum: " + tipParfum;
    }
}
