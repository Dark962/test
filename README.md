# voyageEnTrain

Durant les séances restantes de TD/TP de la matière Méthodologie de Proiduction d'Applications vous allez :
- utiliser Git (partage de code à plisieurs)
- Planifier le développement d'un projet en méthode agile Scrum avec GitLab
- Tester votre programme
- Utiliser des techniques d'intégration continue

## Séance 1 : préparation du projet

### Répartition du travail

Créer des binômes

### Installation d’un client git
Pour communiquer à partir de votre machine avec un projet qui est sur github, il vous faut un client git installé sur votre machine.

Si votre système d’exploitation est Linux ou apparenté (MacOS) git est en général installé par défaut. Pour le vérifier, ouvrez un terminal et tapez la commande git.
Vous pouvez télécharger en installer git via le lien suivant :
https://git-scm.com/downloads

Git est utilisable de deux façons :
-	Via une interface graphique
-	Via un terminal en ligne de commande

La deuxième façon est préférable car elle est absolument portable (vous pourrez utiliser les commandes git sur n’importe quel système). C’est cette façon qui est utilisée dans la suite de ce TP. C’est le mode Bash. Sous Windows, tapez git dans le menu démarrer et vous devriez pour choisir le mode bash.

### Télécharger et tester le projet de référence
Ce projet utilise la version 11 de Java JDK.

Commencer par vérifier quelle est la version de Java sur votre machine

Récupérer le projet sur votre machine : git clone https://gitlab.com/BenOrcha/voyageentrain

Importer le projet dans Eclipse : 

### Uploader le projet de référence vers votre projet Gitlab

### Utiliser git

## Séance 2 : Planification de projets avec la méthode agile SCRUM

Soit la copie d’écran d’une maquette d’une application de réservation de billets de train.

![](doc/voyage.png "bla")

L’objectif du projet est développer un système de réservation qui n’est qu’une maquette (où les réservations sont uniquement simulées dans le système à développer). Il n’y a pas d’impression des billets de train. De plus, le système travaille sur un jeu de données réelles mais limité. Dans ces conditions, l’objectif du projet est de présenter à la direction de la société de transport un prototype émulant de façon réaliste mais limité un système de réservation. Ce prototype devant servir à la direction à décider si elle donne son accord pour lancer le développement du système réel ou si le projet est abandonné.

### Question 1 : constitution du backlog du produit.
Etablissez le contenu du backlog du produit, c'est-à-dire la liste des user stories (vous pouvez vous limiter au user stories les plus importantes).



### Question 3 : constitution du backlog ordonné
Classez, en justifiant vos choix, les éléments du backlog du produit selon l’ordre dans lequel ils vont être développés.

## Séance 2 : spécifier les cas de tests fonctionnel

Dans la suite on se focalise sur la User Story : En tant qu’utilisateur, je veux choisir les dates ainsi que les lieux de départ et d’arrivée de mon voyage afin de déterminer une liste de train qui respectent au mieux mes choix.

### Question 1
Identifiez les différentes conditions d'exécution du programme.

### Question 2
Déduisez-en des cas de tests fonctionnels en utilisant une matrice de tests fonctionnels.

## Séance 4 : dévelopopement guidé par les tests
Complélter la classe de test avec les tests fonctionnels de la question précédente


## Séance 5 ; couverture de code / Livraison Continue
Vérifier la couverture de votre code par le programme de test.

Modifiez votre code jusqu'à obtenir une couverture maximale

## Séance 6 : qualité logiciel