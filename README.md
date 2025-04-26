# 🎮 MiniGames Morpion

Un mini jeu de morpion (Tic-Tac-Toe) en ligne de commande, développé en Java avec une architecture orientée objet, géré via Maven.

---

## 🧩 Fonctionnalités

- 👥 Jeu local pour deux joueurs personnalisables
- 🤖 Mode contre IA (facile, moyen, difficile)
- 🖥️ Interface en ligne de commande intuitive
- 🧠 Vérification des conditions de victoire et d’égalité
- 🔁 Option pour rejouer
- ❌ Gestion des erreurs de saisie
- 🌐 Support WebSocket (préparé pour version en ligne)

---

## ⚙️ Prérequis

- Java Development Kit (JDK) **21** ou supérieur
- Apache Maven **3.6** ou supérieur
- Visual Studio Code avec extensions **Java** et **Maven**

---

## 🚀 Installation

```bash
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
│           ├── Main.java                    # Point d’entrée
│           ├── controller/
│           │   └── JeuController.java       # Contrôleur du jeu
│           ├── model/
│           │   ├── AbstractJoueur.java      # Classe abstraite
│           │   ├── IJoueur.java             # Interface joueur
│           │   ├── IPlateau.java            # Interface plateau
│           │   ├── JoueurHumain.java        # Implémentation joueur humain
│           │   ├── JoueurIA.java            # IA
│           │   └── Plateau.java             # Plateau de jeu
│           └── view/
│               └── ConsoleView.java         # Vue console
├── target/                                   # Répertoire Maven (build)
├── pom.xml                                   # Config Maven
└── README.md                                 # Ce fichier


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
