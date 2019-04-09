Pour compiler et exécuter un fichier source java :
    
    javac Exemple.java //compilation : crée les fichiers .class des classes présentes dans le code
    java Exemple // Exécution

    Si la classe n'est pas dans le repertoire courant:
    javac -cp cheminverslefichierjava Classe.java
    javac paquetage.Classe.java
    java -cp cheminverslefichierjava Classe

    Fichier jar
    java -jar fichier.jar