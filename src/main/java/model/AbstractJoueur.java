package model;

public abstract class AbstractJoueur implements IJoueur {
    private String nom;
    private char pion;

    public AbstractJoueur(String nom, char pion) {
        this.nom = nom;
        this.pion = pion;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public char getPion() {
        return pion;
    }

    @Override
    public abstract int[] jouerTour(IPlateau plateau);
}
