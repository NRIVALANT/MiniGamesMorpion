package model;

public interface IPlateau {
    boolean placerPion(int ligne, int colonne, char pion);
    boolean verifierVictoire(char pion);
    boolean estPlein();
    char[][] getEtatPlateau();
    void initialiserPlateau();
}
