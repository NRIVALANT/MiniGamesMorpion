package main.java;
import java.util.Scanner;

import main.joueurs.Joueur;

public class JeuMorpion {
    private Plateau plateau;
    private Joueur joueur1;
    private Joueur joueur2;
    private Joueur joueurActuel;
    private Scanner scanner;
    private boolean jeuTermine;

    public JeuMorpion(Scanner scanner) {
        this.scanner = scanner;
        plateau = new Plateau();
        jeuTermine = false;
    }

    public void initialiserJeu() {
        System.out.println("=== MORPION ===");
        System.out.print("Nom du Joueur 1 (X): ");
        String nom1 = scanner.nextLine();
        joueur1 = new Joueur(nom1.isEmpty() ? "Joueur 1" : nom1, 'X');
        
        System.out.print("Nom du Joueur 2 (O): ");
        String nom2 = scanner.nextLine();
        joueur2 = new Joueur(nom2.isEmpty() ? "Joueur 2" : nom2, 'O');
        
        joueurActuel = joueur1;
        plateau.initialiserPlateau();
    }

    public void jouer() {
        initialiserJeu();
        
        while (!jeuTermine) {
            tour();
        }
        
        System.out.println("Voulez-vous rejouer? (o/n)");
        String reponse = scanner.nextLine().toLowerCase();
        if (reponse.equals("o")) {
            jeuTermine = false;
            plateau.initialiserPlateau();
            joueurActuel = joueur1;
            jouer();
        }
    }

    private void tour() {
        plateau.afficherPlateau();
        System.out.println("C'est au tour de " + joueurActuel.getNom() + " (" + joueurActuel.getPion() + ")");
        System.out.print("Entrez la ligne (0-2): ");
        
        int ligne = -1;
        int colonne = -1;
        
        try {
            ligne = Integer.parseInt(scanner.nextLine());
            System.out.print("Entrez la colonne (0-2): ");
            colonne = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Veuillez entrer des nombres valides.");
            return;
        }
        
        if (plateau.placerPion(ligne, colonne, joueurActuel.getPion())) {
            if (plateau.verifierVictoire(joueurActuel.getPion())) {
                plateau.afficherPlateau();
                System.out.println(joueurActuel.getNom() + " a gagné!");
                jeuTermine = true;
            } else if (plateau.estPlein()) {
                plateau.afficherPlateau();
                System.out.println("Match nul!");
                jeuTermine = true;
            } else {
                joueurActuel = (joueurActuel == joueur1) ? joueur2 : joueur1;
            }
        }
    }
}
