
package com.mycompany.main;


public class Main {
    public static void main(String[] args) {
        Sampon sampon1 = new Sampon("Shampoo Vital", 250, 15.5, "L'Oreal", "Normal");
        Sampon sampon2 = new Sampon("Shampoo Nourish", 300, 20.0, "Pantene", "Uscat");
        Sampon sampon3 = new Sampon("Shampoo Moisture", 200, 18.0, "Dove", "Uscat");

        CremaFata cremaFata1 = new CremaFata("Crema Fata Hidratare", 50, 45.0, "Nivea", "Uscat");
        CremaFata cremaFata2 = new CremaFata("Crema Fata Anti-Aging", 75, 65.0, "Olay", "Sensibil");
        CremaFata cremaFata3 = new CremaFata("Crema Fata Revitalizanta", 30, 40.0, "L'Oreal", "Normal");

        CremaCorp cremaCorp1 = new CremaCorp("Crema Corp Hidratare", 200, 50.0, "Vaseline", "Uscat");
        CremaCorp cremaCorp2 = new CremaCorp("Crema Corp Relaxare", 150, 60.0, "Aveeno", "Normal");
        CremaCorp cremaCorp3 = new CremaCorp("Crema Corp Reparator", 250, 70.0, "Eucerin", "Sensibil");

        AfterShave afterShave1 = new AfterShave("AfterShave Fresh", 100, 30.0, "Gillette", "Citron");
        AfterShave afterShave2 = new AfterShave("AfterShave Cool", 150, 40.0, "Nivea", "Mentol");
        AfterShave afterShave3 = new AfterShave("AfterShave Sport", 125, 35.0, "Old Spice", "Lavanda");

        GelDeDus gelDeDus1 = new GelDeDus("Gel Dus Fresh", 250, 25.0, "Dove", "Citrus");
        GelDeDus gelDeDus2 = new GelDeDus("Gel Dus Relax", 300, 27.5, "Nivea", "Lavanda");
        GelDeDus gelDeDus3 = new GelDeDus("Gel Dus Energy", 200, 22.0, "Adidas", "Pepene");

        System.out.println(sampon1);
        System.out.println(sampon2);
        System.out.println(sampon3);
        System.out.println("\n");

        System.out.println(cremaFata1);
        System.out.println(cremaFata2);
        System.out.println(cremaFata3);
        System.out.println("\n");

        System.out.println(cremaCorp1);
        System.out.println(cremaCorp2);
        System.out.println(cremaCorp3);
        System.out.println("\n");

        System.out.println(afterShave1);
        System.out.println(afterShave2);
        System.out.println(afterShave3);
        System.out.println("\n");

        System.out.println(gelDeDus1);
        System.out.println(gelDeDus2);
        System.out.println(gelDeDus3);
    }
}
