# Docker-Jenkins

Récupérez le fichier Dockerfile pour le mettre dans le dossier ou se trouvera votre docker.

Construire l'image du docker :
"""
docker build -t leeroy -f path .
"""

Lancer le docker, il exécutera le Dockerfile pour télécharger les ressources nécessaires  :
"""
docker run -p 8080:8080 -d leeroy
"""
