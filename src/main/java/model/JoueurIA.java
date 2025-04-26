package model;

import java.util.Random;

public class JoueurIA extends AbstractJoueur {
    private Random random;
    private String difficulte;

    public JoueurIA(String nom, char pion, String difficulte) {
        super(nom, pion);
        this.difficulte = difficulte;
        this.random = new Random();
    }

    @Override
    public int[] jouerTour(IPlateau plateau) {
        System.out.println(getNom() +"réfléchit...");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        switch(difficulte) {
            case "moyen":
                return jouerTourMoyen(plateau);
            case "difficile":
                return jouerTourDifficile(plateau);
            case "facile":
            default:
                return jouerTourFacile(plateau);
        }
    }
    private int[] jouerTourFacile(IPlateau plateau) {
        char[][] etatPlateau = plateau.getEtatPlateau();
        int ligne, colonne;

        do {
            ligne = random.nextInt(3);
            colonne = random.nextInt(3);
        } while (etatPlateau[ligne][colonne] != ' ');

        return new int[]{ligne, colonne};
    }

    private int[] jouerTourMoyen(IPlateau plateau) {
        char[][] etatPlateau = plateau.getEtatPlateau();

        // Vérifier si l'IA peut gagner
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (etatPlateau[i][j] == ' ') {
                    etatPlateau[i][j] = getPion();
                    if (plateau.verifierVictoire(getPion())) {
                        return new int[]{i, j};
                    }
                    etatPlateau[i][j] = ' ';
                }
            }
        }

        // Vérifier si l'adversaire peut gagner
        char adversaire = getPion() == 'X' ? 'O' : 'X';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (etatPlateau[i][j] == ' ') {
                    etatPlateau[i][j] = adversaire;
                    if (plateau.verifierVictoire(adversaire)) {
                        return new int[]{i, j};
                    }
                    etatPlateau[i][j] = ' ';
                }
            }
        }

        // Jouer au hasard si aucune des deux options n'est disponible
        return jouerTourFacile(plateau);
    }

    private int[] jouerTourDifficile(IPlateau plateau) {
        // Implémentation d'un algorithme de Minimax ou autre stratégie avancée
        // Pour l'instant, on utilise la même logique que pour le mode moyen
        return jouerTourMoyen(plateau);
    }
}
