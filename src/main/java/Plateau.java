public class Plateau {
    private char[][] plateau;

    public Plateau() {
        plateau = new char[3][3];
        initialiserPlateau();
    }

    public void initialiserPlateau() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                plateau[i][j] = ' ';
            }
        }
    }

    public void afficherPlateau() {
        System.out.println("\n  0 1 2");
        System.out.println(" -------");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < 3; j++) {
                System.out.print(plateau[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println("|");
            if (i < 2) System.out.println(" -------");
        }
        System.out.println();
    }

    public boolean placerPion(int ligne, int colonne, char pion) {
        if (ligne >= 0 && ligne < 3 && colonne >= 0 && colonne < 3) {
            if (plateau[ligne][colonne] == ' ') {
                plateau[ligne][colonne] = pion;
                return true;
            } else {
                System.out.println("Case déjà occupée. Choisissez une autre case.");
                return false;
            }
        } else {
            System.out.println("Coordonnées invalides. Entrez des valeurs entre 0 et 2.");
            return false;
        }
    }

    public boolean verifierVictoire(char pion) {
        // Vérifier les lignes, colonnes et diagonales
        for (int i = 0; i < 3; i++) {
            if (plateau[i][0] == pion && plateau[i][1] == pion && plateau[i][2] == pion) return true;
            if (plateau[0][i] == pion && plateau[1][i] == pion && plateau[2][i] == pion) return true;
        }
        if (plateau[0][0] == pion && plateau[1][1] == pion && plateau[2][2] == pion) return true;
        if (plateau[0][2] == pion && plateau[1][1] == pion && plateau[2][0] == pion) return true;
        return false;
    }

    public boolean estPlein() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (plateau[i][j] == ' ') return false;
            }
        }
        return true;
    }
}