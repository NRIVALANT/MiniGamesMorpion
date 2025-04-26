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
<<<<<<< HEAD
=======

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
>>>>>>> 44a3332f062a9e5094efb3137c1859630d4763e0

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
```

---

## ▶️ Utilisation

### 🔧 Compilation

```bash
mvn clean compile
```

### 📦 Création du JAR

```bash
mvn package
```

### 🕹️ Lancement du jeu

```bash
java -jar target/MiniGamesMorpion-1.0-SNAPSHOT.jar
# ou
mvn exec:java
```

---

## 🧱 Architecture du code

Le projet suit une architecture MVC simplifiée :

- `Plateau` : gestion de l'état du jeu
- `Joueur` : représente chaque joueur
- `JeuMorpion` : logique principale
- `Morpion` : point d’entrée (main)

---

## 📁 Structure du projet

```text
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

---

## 🛠️ Configuration Maven

Le projet utilise **Maven** pour la gestion des dépendances et le build :

- [`Java-WebSocket`](https://github.com/TooTallNate/Java-WebSocket) (v1.5.3)

> Pour modifier les dépendances, éditez le fichier `pom.xml`.

---

## 🧪 Commandes Maven utiles

```bash
mvn clean       # Nettoie le dossier target
mvn compile     # Compile le code source
mvn package     # Crée le JAR exécutable
mvn install     # Installe le package dans le repo local
```

---

## 🤝 Contribuer

Les contributions sont les bienvenues !  
N'hésitez pas à :
- Soumettre une **pull request**
- Ouvrir une **issue**
- Proposer des améliorations ✨

---

## 📄 Licence

Ce projet est sous licence **MIT**.  
Vous pouvez l’utiliser, le modifier, et le redistribuer librement.

---

## 🌟 À venir

- Interface graphique (JavaFX ?)
- Multijoueur en ligne via WebSocket
- Site web vitrine avec téléchargement
- Tableau de scores
