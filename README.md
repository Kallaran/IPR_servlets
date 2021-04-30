## TP6 : Les servlets

L'objectif de ce tp est de se familiariser avec les servlets et les technologies associées en développant un chat.


### Configuration du projet

1. Téléchargez la dernière version d'Eclipse IDE for Java EE Developers.
2. Clonez ce repo dans le workplace d'Eclipse.
3. Dans Eclipse utilisez "Import" > "Existing Maven Projects".
4. Téléchargez Tomcat 9 et dézippez le.
5. Dans Eclipse JEE, ajouter la vue serveur : Windows > Show View > Servers.
6. A partir de cette vue serveur, créez un nouveau serveur Tomcat v9.0 server et choisissez le dossier apache-tomcat-9.0.X (dézippé précédemment) dans "Tomcat installation directory."

Vous pouvez maintenant utiliser "Run As" > "Run on Server" sur le projet.

Pour voir le rendu du projet sur un navigateur web : http://localhost:8080/pr.tp.web/ 

### Organisation du projet

Le projet comporte une servlet présente dans Chat.java
Deux fichiers JSP : chat.jsp et login.jsp.
Ainsi que deux fichiers CSS : chat.css et login.css.

En plus de ces fichiers CSS nous utilisons également BootstrapCDN.

Dans web.xml nous avons définit login.jsp comme page d'accueil du site web : 

```xml
	<welcome-file-list>
		<welcome-file>login.jsp</welcome-file>
	</welcome-file-list>
```

### Lancer dans Tomcat sans passer par Eclipse

Un fichier WAR, pr.tp.web.war a été généré avec "export" > "WAR file" sur le projet dans Eclipse.

Déplacez ce WAR dans le dossier "webapps" de "apache-tomcat-9.0.X".

Définissez la variable d'environnement "CATALINA_HOME" avec pour valeur le chemin vers le dossier "apache-tomcat-9.0.X"

Ainsi que "JRE_HOME" avec le chemin vers une JRE.


![](https://i.imgur.com/MR5yD23.png)

Vous pouvez maintenant lancer le script startup.bat contenu dans "apache-tomcat-9.0.X/bin"

![](https://i.imgur.com/K6EIEAF.png)
![](https://i.imgur.com/HOvrrJI.png)






### Question : Expliquez la signification de l'erreur 405.

![](https://i.imgur.com/EnRfHZj.png)

Le code de statut de réponse HTTP 405 Method Not Allowed indique que la méthode utilisée (GET) pour la requête est connue du serveur mais qu'elle n'est pas supportée par la ressource ciblée.

Pour corriger cela il suffit de override doGet :

![](https://i.imgur.com/JGjvbPi.png)


