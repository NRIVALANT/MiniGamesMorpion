package model;

public class Plateau implements IPlateau {
    private char[][] plateau;

    public Plateau() {
        plateau = new char[3][3];
        initialiserPlateau();
    }

    @Override
    public void initialiserPlateau() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                plateau[i][j] = ' ';
            }
        }
    }

    @Override
    public char[][] getEtatPlateau() {
        // Retourner une copie pour préserver l'encapsulation
        char[][] copie = new char[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(plateau[i], 0, copie[i], 0, 3);
        }
        return copie;
    }

    @Override
    public boolean placerPion(int ligne, int colonne, char pion) {
        if (ligne < 0 || ligne >= 3 || colonne < 0 || colonne >= 3 || plateau[ligne][colonne] != ' ') {
            return false; // Position invalide
        }
        plateau[ligne][colonne] = pion;
        return true;
    }

    @Override
    public boolean verifierVictoire(char pion) {
        // Vérifier les lignes et les colonnes
        for (int i = 0; i < 3; i++) {
            if ((plateau[i][0] == pion && plateau[i][1] == pion && plateau[i][2] == pion) ||
                (plateau[0][i] == pion && plateau[1][i] == pion && plateau[2][i] == pion)) {
                return true;
            }
        }
        // Vérifier les diagonales
        if ((plateau[0][0] == pion && plateau[1][1] == pion && plateau[2][2] == pion) ||
            (plateau[0][2] == pion && plateau[1][1] == pion && plateau[2][0] == pion)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean estPlein() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (plateau[i][j] == ' ') {
                    return false; // Il y a encore des cases vides
                }
            }
        }
        return true; // Le plateau est plein
    }
}