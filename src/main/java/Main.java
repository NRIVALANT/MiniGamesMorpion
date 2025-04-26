import java.util.Scanner;

import controller.JeuController;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            JeuController jeu = new JeuController(scanner);
            jeu.jouer();
            System.out.println("Merci d'avoir joué !");
        } finally {
            scanner.close();
        }
    }
}
