package org.example.ratiocinator;

public class AffirmationGenerale extends Affirmation{
    private boolean valeur;

    public void setValeur(boolean valeur) {
        this.valeur = valeur;
    }

    public AffirmationGenerale(boolean valeur){
        this.valeur= valeur;

    }
    @Override
    public boolean evaluer(){
        return valeur;
    }
}
