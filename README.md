# TP_Java_dta

Ensemble des TP java (à partir du TP3) : 

#TP03: Affectation élargie :
Affecter la valeur 10 à une variable x de type byte.
Ajouter 1000 à cette variable (avec l’opérateur +=).
Afficher le résultat par System.out.println(...).



#TP04: Conditions:
Première partie : “if”

​ Le but de ce TP est d’utiliser les instructions : if ... else ....

L'exercice consiste à calculer un montant en fonction d’un paramètre.
On établit une remise dont le taux dépend du montant, à savoir :
- 0 % pour un montant inférieur à 1 000 €,
- 1 % pour un montant supérieur ou égal à 1 000 € et inférieur à 2 000 €,
- 3 % pour un montant supérieur ou égal à 2 000 € et inférieur à 5 000 €,
- 5 % pour un montant supérieur ou égal à 5 000 €.
$ java TpJava04 4500
4500.0 => 135.0
Help: utiliser un Float.parseFloat(...).

Seconde partie : “switch”

​ Le but de ce TP est d’utiliser les instructions : switch ... case ... default ....
L'exercice consiste à calculer une taille de sac en fonction d’un poids d’entrée.
On définit la taille en fonction d’un poid (entier) :
- “petit” pour un poid de 1kg,
- “moyen” pour un poid de 2kg,
- “grand” pour un poid supérieur à 2kg.
$ java TpJava04 4500 2
4500.0 => 135.0
moyen



#TP05: Afficher la liste des X premiers nombres:
​ Le but de ce TP est d’utiliser les instructions : do ... while ou while ....
L'exercice consiste à afficher la liste des n premiers nombres.
$ java TpJava05 10
0
1
2
3
4
5
6
7
8
9



#TP06: Afficher la factorielle d’un nombre :

​ Le but de ce TP est d’utiliser les instructions : for ....
L'exercice consiste à calculer la factorielle d’un nombre.
Il s'agit d'écrire un programme qui calcule la factorielle d'un entier et indique à l'écran le résultat. Le
nombre n doit être lu sur la ligne de commande.
$ java TpJava06 10
3628800



#TP07: Afficher des nombres premiers :
Le but de ce TP est de produire un algorithme basé sur les instructions de bases.
L'exercice consiste à calculer et afficher les n premiers nombres premiers.
Récupérer le chiffre passée en ligne de commande.
Afficher la liste des n nombres premiers (n étant la valeur récupérée).
$ java TpJava07 6
2
3
5
7
11
13



__La programmation Objet__

Pour tous les TP suivant, une classe de test avec un “main” sera enrichi pour mettre en
évidence le développement demandé.



#TP10: Classes
Nous voulons simplifier la manipulation dans un programme annexe.
Pour cela, nous avons d’un objet représentant un point dans un espace à deux dimensions,
ainsi que deux figures mathématiques : les ronds et les rectangles.

​ Classe avec primitif
Création d’une classe Point avec:
- le constructeur Point(int, int)
- les accesseurs getX() et getY()
- une méthode toString() qui renvoie “[X;Y]”

​ Classe avec objet
Création d’une classe Rond:
- constructeur Rond(Point, int)
- toString() [ROND [X;Y] , r]
- affiche() => system.out.println() du toString()
Création d’une classe Rectangle:
- constructeur Rectangle(Point, int, int)
- Point getPointBasGauche()
- Point getPointBasDroit()
- Point getPointHautGauche()
- Point getPointHautDroit()
- toString() [RECT [X;Y][X;Y][X;Y][X;Y]]
- affiche() => system.out.println() du toString()



#TP11 : Classe et méthode statique
Afin de simplifier le code qui va effectué un certain nombre d’opérations récurrentes, nous
allons mettre en place une batterie de méthode passe-partout.

​ Compléter la classe point avec :
- les constantes INIT_X et INIT_Y (à 25);
- le constructeur Point() qui initialise à INIT_X et INT_Y

​ Création d’une classe utilitaire FigureUtil avec :
- Rond getRandomRond()
- Rectangle getRandomRectangle()

Help: Ces deux méthodes doivent être publiques pour être utilisées ailleurs, rien ne vous empêche de
créer d’autres méthodes privée pour simplifier votre code, comme par exemple une méthode
getRandomPoint() ...



#TP12 : Héritage
Nous voulons pouvoir manipuler des carrés.

​ Création d’une classe “Carre”
- sans héritage
- constructeur Carre(Point, int)
- toString() [CARRE [X;Y][X;Y][X;Y][X;Y]]
- affiche() => system.out

​ Modifier “Carre” pour hériter de “Rectangle”
- constructeur
- affiche()


Bonus :
- Créer une méthode protected String getType() qui renvoie “RECT” et “CARRE”. Utiliser cette
méthode dans la méthode toString().



#TP13 : Egalité de Point
Nous voulons pouvoir vérifier l’égalité de deux objets de types “Point”.
Compléter la classe Point avec une méthode equals qui renvoie vrai si et seulement les X et les Y des
deux points comparés sont les mêmes.



#TP14 : Classe abstraite
Nous voulons pouvoir manipuler des figures quelconques.
Création d’une classe abstraite Figure.
Faire hériter Rond, Rectangle, Carre
- Quelle(s) méthode(s) peut(peuvent ) être définie sur Figure seulement ?
- Que faire de(s) autre(s) ?
Créer une méthode getRandomFigure() qui crée un Rond, un Rectangle ou un Carre.



#TP15 : Interface
Nous voulons pouvoir calculer la surface d’une figure, lorsque cela est possible.

​ Création d’une classe Segment :
- hérite de figure
- constructeur segment(Point debut, int longueur, boolean horizontal)
- toString() => [[X;Y] à [X;Y]]
Modifier getRandomFigure() pour qu’elle renvoie également des Segment.

​ Création d’une interface Surfacable
- double surface()
Rond, Rectangle, Carre (pas Segment) implémentent Surfaçable
Créer une méthode getRandomSurfacable() qui crée un Rond, un Rectangle ou un Carre (pas de
Segment).



__Les tableaux et les listes__

#TP20: Tableaux
Nous voulons pouvoir accéder à tous les points d’une figure quelconque.
a) Ajouter une méthode (abstraite) Point[] getPoints() à Figure.
- Renvoie la liste des points de la figure (Rond : 1, Segment : 2, Rectangle et Carré : 4)
Modification de FigureUtil
- Point[] getPoints(Figure[])
- prend en paramètre un tableau de Figures
- renvoie le tableau des Points contenus dans ces Figures.

b) Modification de FigureUtil
- Point[] getPoints(Figure, Figure, etc.)
- prend en paramètre 0 à n Figures
- renvoie le tableau des Points contenus dans ces Figures.

Help: Lors de l’initialisation d’un tableau, il est nécessaire d’avoir sa taille finale. Il faut donc faire un
premier passage pour compter les points, puis un second pour remplir la tableau.



#TP21: Choix de collection
Nous voulons pouvoir manipuler des dessins qui sont un ensemble de figure.
​ Création d’une classe Dessin
- construteur Dessin()
- méthode boolean add(Figure)
- méthode Collection<Figure> getFigures()

​ Mettre en commentaire les arguments de votre choix d’implémentation de la collection (ArrayList,
LinkedList, HashMap, TreeMap, TreeSet, HashSet, etc.)
Modification de FigureUtil
- Collection<Figure> genere(int)
- renvoie une collection de x figures créées aléatoirement.
- Les X et les Y doivent être compris entre 0 et 99

​ Modifier FigureUtil::getPoints() et Figure::getPoints() pour qu’elles renvoient une collection de points.
Justifiez vos choix.



#TP22: Iterator
Nous voulons pouvoir savoir quelle figure d’un dessin est en un point donné.

​ Modification de Figure
- méthode couvre(Point)
- renvoie vrai si et seulement si le Point est couvert par la figure

​ Création d’une méthode FigureUtil::getFigureEn(Point, Dessin) en utilisant un Iterator.
- renvoie une figure couvrant le point passé en paramètre
- Si plusieurs figures le couvre, on en renvoie qu’une seule.
- Si aucune figure le couvre, on renvoie null.



#TP23: Egalité de figure
Nous voulons pouvoir vérifier des figures.

​ Implémenter les méthodes equals sur toutes les figures sachant que :
- 2 Ronds sont égaux si leurs centres et leur rayon sont les mêmes
- 2 Segments sont égaux si leurs début et fin sont les mêmes.
- 2 Rectangles sont égaux si leurs 4 points sont les mêmes.
- 2 Carrés sont égaux si leurs 4 points sont les mêmes.
- /!\ 1 Rectangle peut être égal à 1 Carré si leur 4 points sont les mêmes.
- 1 Rond et un Rectangle ne sont jamais égaux.
- 1 Rond et 1 Carré ne sont jamais égaux.
- 1 Rond et un Segment ne sont jamais égaux.
- 1 Segment et un Rectangle ne sont jamais égaux.
- 1 Segment et un Carré ne sont jamais égaux.



#TP24 : Comparable et Comparator
Nous voulons pouvoir comparer des figures de plusieurs façons:
- par rapport à sa distance au point d’origine,
- par rapport à sa surface.

​ Modification de Figure :
- méthode double distanceOrigine()
- renvoie la plus petite distance des points de la figure par rapport au point
[INIT_X;INIT_Y]

​ Implémenter Comparable sur toutes les Figures
- utiliser la “distance à l’origine”
Créer une méthode FigureUtil::trieProcheOrigine(Dessin)
- renvoi la liste des figures trié de la plus proche à la plus lointaine de l’origine.

​ Créer une méthode FigureUtil::trieDominant(Dessin)
- renvoi la liste des figures trié de la plus grande à la plus petite surface.
- /!\ les figures sans surfaces doivent être supprimés.



#TP25 : Les Streams
On fait du Java 8 : utilisons le Java 8 !!
Modifier le code afin d’utiliser des Stream quand cela est possible.



#TP26 : Les Maps
Nous voulons pouvoir retrouver rapidement une figure à partir d’un identifiant.

​ Modification de FigureUtil
- méthodes getRandomXXXX
- enregistrer la figure dans une map avec une nouvelle clef
- méthode get(String id)
- renvoie la figure ayant pour ID la chaîne en paramètre


__Les String, les Enum et les flux__

#TP30 : Enumération
​ Création d’une énumération Couleur
- Rouge, Vert, Bleu, Jaune, Noir
- static getCouleurDefaut() => Noir
- Chaque couleur doit avoir un code composé d’un caractère.
- Rouge => R
- etc.

​ Modification de Figure
- méthode Couleur getCouleur()

​ Modification des classes descendantes de figure
- constructeur existants : utilisation de la couleur par défaut
- ajout d’un constructeur avec une couleur
- modifier l’affichage pour y mettre la couleur
- modifier les générateur de figure aléatoire afin de mettre une couleur aléatoire.
- deux figures ne peuvent être égales que si leurs couleurs sont les mêmes.



#TP31 : Sauvegarde
​ Modification de FigureUtil
- méthode void imprime(Dessin)
- écrit dans un fichier :
- la liste des figures (une par ligne)
- une séparation (exemple : 100 fois “=”)
- le dessin ASCII :
- si un point n’est pas couvert alors “ “ (espace)
- si non, le code de la couleur de la forme qui le couvre
- loggue le nom du fichier utilisé
- méthode void sauvegarde(Dessin)
- sauvegarde le dessin dans un fichier
- méthode Dessin charge()
- charge le dessin d’un fichier

Help:
- Pour créer une fichier temporaire rapidement, utiliser File.createTempFile()
- Pour la sauvegarde et le chargement, utiliser les flux d’objet avec le Serializable


__Les Exceptions et les Threads__

#TP40 : Dessin hors limite
Création d’une ImpressionHorsLimiteException
Lors de l’impression, lever une Exception si une Figure possède une point en dehors de la limite
[0:99] (sur les X ou les Y)

