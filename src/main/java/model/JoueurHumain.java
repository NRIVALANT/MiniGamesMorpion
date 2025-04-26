package model;

import java.util.Scanner;

public class JoueurHumain extends AbstractJoueur {
    private Scanner scanner;

    public JoueurHumain(String nom, char pion, Scanner scanner) {
        super(nom, pion);
        this.scanner = scanner;
    }

    @Override
    public int[] jouerTour(IPlateau plateau) {
        int ligne = -1;
        int colonne = -1;
        boolean entreeValide = false;

        while (!entreeValide) {
            try {
                System.out.println("Entrez la ligne (0-2): ");
                ligne = Integer.parseInt(scanner.nextLine());
                System.out.println("Entrez la colonne (0-2): ");
                colonne = Integer.parseInt(scanner.nextLine());
                entreeValide = true;
            } catch (NumberFormatException e){
                System.out.println("Veuillez entrer des nombres valides.");
            }
        }
        return new int[]{ligne, colonne};
    }
}
