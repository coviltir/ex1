
package com.mycompany.main;


public class CremaFata {
    private String nume;
    private double cantitate;
    private double pret;
    private String marca;
    private String tipTen;

    public CremaFata(String nume, double cantitate, double pret, String marca, String tipTen) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
        this.marca = marca;
        this.tipTen = tipTen;
    }

    @Override
    public String toString() {
        return "Crema de fata:\nNume: " + nume + "\nCantitate: " + cantitate + " ml\nPret: " + pret + " RON\nMarca: " + marca + "\nTip Ten: " + tipTen;
    }
}

