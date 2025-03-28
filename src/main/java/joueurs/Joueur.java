package main.joueurs;

public class Joueur {
    private String nom;
    private char pion;

    public Joueur(String nom, char pion) {
        this.nom = nom;
        this.pion = pion;
    }

    public String getNom() {
        return nom;
    }

    public char getPion() {
        return pion;
    }
}
