package view;

import model.IPlateau;

public class ConsoleView {
    public void afficherPlateau(IPlateau plateau) {
        char[][] etat = plateau.getEtatPlateau();
        
        System.out.println("\n  0 1 2");
        System.out.println(" -------");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < 3; j++) {
                System.out.print(etat[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println("|");
            if (i < 2) System.out.println(" -------");
        }
        System.out.println();
    }
    
    public void afficherMessage(String message) {
        System.out.println(message);
    }
    
    public void afficherTour(String nomJoueur, char pion) {
        System.out.println("C'est au tour de " + nomJoueur + " (" + pion + ")");
    }
    
    public void afficherVictoire(String nomJoueur) {
        System.out.println(nomJoueur + " a gagné!");
    }
    
    public void afficherMatchNul() {
        System.out.println("Match nul!");
    }
}