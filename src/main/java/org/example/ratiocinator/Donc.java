package org.example.ratiocinator;
public class Donc extends Affirmation{
    private Affirmation af1;
    private Affirmation af2;

    public Donc (Affirmation af1, Affirmation af2){
        this.af1=af1;
        this.af2=af2;
    }
    @Override
    public boolean evaluer(){
        return !af1.evaluer() || af2.evaluer();
    }
}
