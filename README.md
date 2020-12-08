# voyageEnTrain

Durant les 6 séances restantes de TD/TP de la matière Méthodologie de Production d'Applications vous allez :
- utiliser Git (partage de code à plusieurs) - séance 1
- Planifier et suivre le développement d'un projet en méthode agile Scrum avec GitLab - séance 2
- Tester votre programme (tests unitraires et tests de couverture de code) - séances 3 et 4
- Utiliser des techniques d'intégration continue - séance 5
- Amélioration de la qualité de votre projet - séance 6

# Séance 1 : préparation du projet

## Répartition du travail

Créer des binômes. Les binômes seront conservés jusqu'à la fin des 6 séances.

## Installation d’un client git

Git est un logiciel de gestion de versions décentralisé : https://fr.wikipedia.org/wiki/Git

GitHub ou Gitlab (solutions hébergées basées sur git) permettent aux développeurs de stocker et de partager, publiquement ou non, le code qu’ils créent.

Dans la suite c'est Gitlab qui est utilisé.

Commencer par vous créer un compte sur gitlab : https://gitlab.com/

Mémoriser votre nom d'utilisateur et l'adresse mail que vous avez indiquée car vous en aurez besoin au paragraphe suivant.
 
Le principe de git est que chaque développeur a sur sa machine une copie du code présent sur le serveur Gitlab Pour ce faire, il faut disposer sur sa machine d’un client git. Git peut être installé sur Windows, Linux ou Mac. Si votre système d’exploitation est Linux ou apparenté (MacOS), git est en général installé par défaut. Pour le vérifier, ouvrez un terminal et tapez la commande git. Si git n’est pas installé suivez la procédure suivante :
- télécharger git: https://git-scm.com/downloads
- définir le user name : git config --global user.name "Mona Lisa"
- définir l'adresse mail : git config --global user.email "email@example.com"


Git est utilisable de deux façons :
-	Via une interface graphique
-	Via un terminal en ligne de commande

La deuxième façon est préférable car elle est absolument portable (vous pourrez utiliser les commandes git sur n’importe quel système). C’est cette façon qui est utilisée dans la suite de ce TP : c’est le mode Bash. Sous Windows, tapez git dans le menu démarrer et vous devriez pour choisir le mode bash.

## Télécharger et tester le projet de référence
Tous les TP à suivre sont basés sur un projet de référence: https://gitlab.com/BenOrcha/voyageentrain

Ce projet utilise la version 11 de Java JDK.

Commencer par vérifier quelle est la version de Java sur votre machine. Dans une fenêtre de commande utilisez la commande : java -version

Si besoin, installez sur votre machine Java JDK 11 : https://www.oracle.com/java/technologies/javase-jdk11-downloads.html

Placez-vous dans un dossier où vous voulez placez le projet et récupérez le projet via la commande : git clone https://gitlab.com/BenOrcha/voyageentrain

Cette commande va créer un dossier contenant le projet sur votre machine. 
 
Démarrer une version récente d'Eclipse puis importez-y le projet : Import -> Gradle -> Existing Gradle project 

## Uploader le projet de référence vers votre projet Gitlab
A présent vous dévez uploader ce projet vers votre compte gitlab afin de pouvoir le modifier de votre côté. Pour cela utilisez la commande :

git push --set-upstream https://gitlab.com/BenOrcha/nouveau

où BenOrcha est l'url de votre compte gitlab et nouveau est le nom du projet que vous voulez créer dans gitlab. 

## Permettre à des collaborateurs d'accéder à votre projet
A présent vous devez ajouter votre binôme dans le projet gitlab ainsi que le professeur qui vous suit.
Pour cela accéder à menu members dans gitlab et ajouter votre binôme en tant que Maintainer (role permission) et votre professeur en tant que reporter.

## Utiliser git

### Travailler sur la branche principale

Créer dans le dossier src/main/java/transport/voyageEnTrain un fichier appelé Personne.java.

Ajoutez-y une classe Personne.

Comment indiquer à git de prendre en compte de fichier ?

Éditer ce fichier à nouveau (ajouter par exemple une méthode à la classe).

Comment indiquer à git de conserve les différentes versions de vos fichiers ?

Comment renvoyer vers le serveur git votre fichier ?

Créer à présent un nouveau dossier dans le dossier du projet et ajoutez-y un fichier.

Comment indiquer à git de prendre en compte le contenu de ce dossier ?

### Créer des branches
Il est plus judicieux si on travaille à plusieurs sur le même projet que chaque développeur travaille sur une fonctionnalité du projet. Dans ce cas, git préconise d’utiliser des branches.

Comment créer une branche dans votre dossier de projet ?

Comment lister les branches sur votre machine ?

Comment se déplacer sur la nouvelle branche ?

Que contient cette branche ?

Ajoutez-y des fichiers et éditer les (voir la question précédente). N’oubliez pas de faire des commit pour créer des versions de vos fichiers.

Comment poussez cette nouvelle branche vers le dépôt github distant ?

Revenez à présent sur la branche principale (elle s’appelle master ou main). Que contient-elle ?

Comment fusionner la branche sur vous avez créé avec la branche principale ?

### Gérer des conflits

Créez une nouvelle branche et déplacez-vous dessus.

Mais cette fois éditer des fichiers existants dans cette branche.

Revenez vers la branche principale (sans avoir oublié de faire des commit au préalable) et tentez de fusionner les branches. Que constatez-vous ?

Ouvrez les fichiers en cause et voyez comment git a conservé les deux versions de vos fichiers. Choisissez quelle version vous voulez conserver. Faites un commit et tentez à nouveau la fusion (ça devrait marcher).


### Mémento git

git clone https://github.com/charroux/jee	Télécharge le projet donné en adresse dans un nouveau dossier portant le nom du projet

git add contenu	Ajoute au dépôt local git le contenu du dossier et du fichier précisé en argument

git commit -a -m "commentaire"	Créé un nouvelle version de votre dépôt local git

git push adresse-https-du-projet	Renvoi vers github votre projet

git push adresse-https-du-projet brancheLocale:brancheDistante	Renvoi la branche locale de votre projet vers la branche distante sur github

git branch 	Liste les branches sur votre machine

git branch nomBranche	Créé une branche de nom nomBranche

git checkout nomBranche	Se déplace vers la branche de nom nomBranche

git merge nomBranche	Créé une branche de nom nomBranche

## Evaluation de votre travail

Indiquez dans le fichier partagé suivant l'adresse de votre projet sur Gitlab.

Votre enseignant de TP vous fera un retour sur ce que vous avez fait.


# Séance 2 : Planification de projets avec la méthode agile SCRUM

Soit la copie d’écran d’une maquette d’une application de réservation de billets de train.

![](doc/voyage.png "bla")

L’objectif du projet est développer un système de réservation qui n’est qu’une maquette (où les réservations sont uniquement simulées dans le système à développer). Il n’y a pas d’impression des billets de train. De plus, le système travaille sur un jeu de données réelles mais limité. Dans ces conditions, l’objectif du projet est de présenter à la direction de la société de transport un prototype émulant de façon réaliste mais limité un système de réservation. Ce prototype devant servir à la direction à décider si elle donne son accord pour lancer le développement du système réel ou si le projet est abandonné.

## Question 1 : constitution du backlog du produit.
Etablissez le contenu du backlog du produit, c'est-à-dire la liste des user stories (vous pouvez vous limiter au user stories les plus importantes).


## Question 3 : constitution du backlog ordonné
Classez, en justifiant vos choix, les éléments du backlog du produit selon l’ordre dans lequel ils vont être développés.

## Evaluation de votre travail

# Séance 3 : spécifier les cas de tests fonctionnel

Dans la suite on se focalise sur la User Story : En tant qu’utilisateur, je veux choisir les dates ainsi que les lieux de départ et d’arrivée de mon voyage afin de déterminer une liste de train qui respectent au mieux mes choix.

## Question 1
Identifiez les différentes conditions d'exécution du programme.

## Question 2
Déduisez-en des cas de tests fonctionnels en utilisant une matrice de tests fonctionnels.

## Evaluation de votre travail

# Séance 4 : dévelopopement guidé par les tests
Complélter la classe de test avec les tests fonctionnels de la question précédente


## Couverture de code / Livraison Continue
Vérifier la couverture de votre code par le programme de test.

Modifiez votre code jusqu'à obtenir une couverture maximale

# Séance 5 : livraison continu

# Séance 6 : qualité logiciel