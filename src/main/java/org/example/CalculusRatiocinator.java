package org.example;

import org.example.ratiocinator.*;

public class CalculusRatiocinator {
    public static void main (String[] args){
        Affirmation verite_1 = new Verite(); // Lou est beau
        Affirmation mensonge_1 = new Mensonge(); // Lou est pauvre
        AffirmationGenerale affirmation_1 = new AffirmationGenerale(false); //Lou est généreux

        Affirmation compos1 = new Et(mensonge_1, affirmation_1); // Lou est pauvre et Lou est généreux
        Affirmation compos2 = new Donc(verite_1, mensonge_1); // Lou est beau. Donc Lou est pauvre
        Affirmation compos3 = new Donc(mensonge_1, affirmation_1); // Lou est pauvre. Donc Lou est généreux
        Affirmation compos4 = new Donc(new Ou(verite_1, affirmation_1), mensonge_1); // Lou est beau ou Lou est généreux.
        // Donc Lou est pauvre
        Affirmation compos5 = new Et(new Donc(new Ou(verite_1, affirmation_1), mensonge_1), new Ou(mensonge_1, affirmation_1));
        // Premièrement :« Lou est beau ou Lou est généreux. Donc Lou est pauvre. »
        // Et deuxièmement : Lou est pauvre ou Lou est généreux


        System.out.println("Lou est pauvre et Lou est généreux: " + resultat(compos1));
        System.out.println("Lou est beau. Donc Lou est pauvre: " + resultat(compos2));
        System.out.println("Lou est pauvre. Donc Lou est généreux: " + resultat(compos3));
        System.out.println("Lou est beau ou Lou est généreux. Donc Lou est pauvre: " + resultat(compos4));
        System.out.println("Premièrement : « Lou est beau ou Lou est généreux. Donc Lou est pauvre. » Et deuxièmement : Lou est pauvre ou Lou est généreux: " + resultat(compos5));

        // Modifier l'affirmation générale pour vérifier d'autres cas
        affirmation_1.setValeur(true);
        System.out.println("Lou est généreux (affirmation modifiée): " + resultat(affirmation_1));
    }

    private static String resultat(Affirmation affirmation) {
        try {
            return affirmation.evaluer() ? "vrai" : "faux";
        } catch (Exception e) {
            return "jenesaispas";
        }
    }

}
