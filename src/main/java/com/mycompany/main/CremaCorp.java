
package com.mycompany.main;


public class CremaCorp {
    private String nume;
    private double cantitate;
    private double pret;
    private String marca;
    private String tipPiele;

    public CremaCorp(String nume, double cantitate, double pret, String marca, String tipPiele) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
        this.marca = marca;
        this.tipPiele = tipPiele;
    }

    @Override
    public String toString() {
        return "Crema de corp:\nNume: " + nume + "\nCantitate: " + cantitate + " ml\nPret: " + pret + " RON\nMarca: " + marca + "\nTip Piele: " + tipPiele;
    }
}
