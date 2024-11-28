
package com.mycompany.main;


public class GelDeDus {
    private String nume;
    private double cantitate;
    private double pret;
    private String marca;
    private String aroma;

    public GelDeDus(String nume, double cantitate, double pret, String marca, String aroma) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
        this.marca = marca;
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        return "Gel de dus:\nNume: " + nume + "\nCantitate: " + cantitate + " ml\nPret: " + pret + " RON\nMarca: " + marca + "\nAroma: " + aroma;
    }
}
