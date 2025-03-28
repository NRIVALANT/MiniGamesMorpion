# MiniGame Morpion

Mini jeu local de morpion (Tic-Tac-Toe) affiché dans le terminal, développé en Java avec la programmation orientée objet et géré avec Maven.

## Fonctionnalités
- Jeu en local pour deux joueurs personnalisables
- Interface en ligne de commande intuitive avec coordonnées
- Affichage amélioré du plateau dans le terminal
- Gestion des erreurs de saisie
- Possibilité de rejouer une partie
- Vérification des conditions de victoire et d'égalité
- Support pour WebSocket (préparation pour une future version en ligne)

## Prérequis
- Java Development Kit (JDK) 17 ou supérieur
- Apache Maven 3.6 ou supérieur
- Visual Studio Code
- Extension Java et Maven pour Visual Studio Code

## Installation
1. Clonez le projet :
   ```sh
   git clone https://github.com/votre-utilisateur/MiniGamesMorpion.git
   cd MiniGamesMorpion

## Utilisation
1. Compiler le projet avec Maven :
    ```sh
    mvn clean compile
    ```
2. Créer le JAR exécutable :
    ```sh
    mvn package
    ```
3. Exécuter le jeu : 
    ```sh
    java -jar target/MiniGamesMorpion-1.0-SNAPSHOT.jar
    ```
    ou 
    ```sh
    mvn exec:java
    ```
4. Suivez les instructions du terminal pour jouer.

## Architecture
Le projet suit une architecture orientée objet avec :
- Une classe `Plateau` pour gérer l'état du jeu
- Une classe `Joueur` pour représenter les joueurs
- Une classe `JeuMorpion` pour encapsuler la logique du jeu
- Une classe principale `Morpion` qui orchestre le tout

## Structure du projet

MiniGamesMorpion/
├── src/
│   └── main/
│       └── java/
│           ├── [JeuMorpion.java]
│           ├── [Morpion.java]
│           ├── [Plateau.java]
│           └── joueurs/
│               ├── [Joueur.java]
│               └── [Joueurs.java]
├── target/ # Répertoire généré par Maven (ignoré par Git)
├── [pom.xml] # Configuration Maven
└── [README.md]

## Configuration Maven

Le projet utilise Maven pour la gestion des dépendances et la construction. Les principales dépendances incluent :

- Java-WebSocket (v1.5.3) : Bibliothèque pour le support de WebSocket.

Pour ajouter de nouvelles dépendances ou modifier la configuration, consultez le fichier pom.xml.

## Développement

#### Modifier le code

Pour faire des modfications, effectuez des pull request pour vos contibutions.

#### Commandes Maven Utiles

    - mvn clean: Nettoie le dossier target
    - mvn compile: Compile le code source
    - mvn package: Créer le JAR exécutable
    - mvn isntall: Installe le package dans le dépot local Maven

## Contribuer
Les contributions sont les bienvenues ! Veuillez soumettre une pull request ou ouvrir une issue pour discuter des changements que vous souhaitez apporter.
