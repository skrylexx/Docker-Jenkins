# Docker-Jenkins

## Projet Jenkins Docker
Ce projet propose une version Docker de Jenkins. Elle permet une maintenance et une mise en place simple.

##Prérequis
Récupérez le fichier Dockerfile pour le mettre dans le dossier ou se trouvera votre docker.

##Construire l'image du docker
`docker build -t leeroy -f path .`

`-t` donne le nom "leeroy" à l'image
`-f` précise le chemin du Dockerfile pour construire l'image

##Lancer le containeur docker
Une fois l'image construire, vous pouvez lancer votre docker avec la commande :
`docker run -p 8080:8080 -d leeroy`

`-p` précise le mappage du port (ici de 8080 à 8080)
`-d` lance le containeur en fond (mode détaché)

##Accès à Jenkins
Pour accèder à votre service, vous pouvez coller ce lien dans votre navigateur : http://localhost:8080

##License
Ce projet est sous license MIT.
