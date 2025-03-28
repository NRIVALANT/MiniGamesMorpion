package joueurs;

public class Joueurs {
    private String nom;
    private char pion;

    public Joueurs(String nom, char pion) {
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
