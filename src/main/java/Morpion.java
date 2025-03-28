import java.util.Scanner;

public class Morpion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            JeuMorpion jeu = new JeuMorpion(scanner);
            jeu.jouer();
            System.out.println("Merci d'avoir joué!");
        } finally {
            scanner.close();
        }
    }
}