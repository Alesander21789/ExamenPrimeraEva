FROM ubuntu:latest
RUN apt-get update
# install Apache and PHP
#Actualiza la lista de paquetes disponibles en el sistema operativo base.
RUN apt-get update && \
#Instala el paquete tzdata
apt-get install -y tzdata && \
#Configuración tzdata
ln -fs /usr/share/zoneinfo/Europe/Madrid /etc/localtime && \
dpkg-reconfigure -f noninteractive tzdata && \
#Instala Apache
apt-get install -y apache2 && \
#Php para apache
apt-get install -y libapache2-mod-php 
#Copio la aplicación php al directorio de apache
COPY simple-php-website-master /var/www/html/simple-php-website-master
#Nombre de servidor como lcoalhost
RUN echo "ServerName localhost" >> /etc/apache2/apache2.conf
#Expone el puerto 80
EXPOSE 80
#Inicia el servidor Apache 
CMD ["/usr/sbin/apache2ctl", "-D", "FOREGROUND"]
