En este documento se explican los pasos a realizar para poder registrarse usando un formulario
html y que este conecte con una base de datos Mysql.


<-------------------CARPETA BASE DE DATOS----------------->

Empezando por la base de datos sera necesario tener instalado Xampp, una vez instalado iniciar Apache y Mysql.
Desde ahi acceder a phpMyAdmin y importar el archivo sql de la carpeta Base de Datos.

Para poder ver el modelo entidad relacion de la base de datos sera necesario subirlo a Drive o bien abrirlo desde
la pagina web de Draw.io.

En la misma carpeta tambien encontraremos un archivo .php de inscripcion, que tendra que ir en la carpeta Htdocs, que se
encuentra en la carpeta de Xampp.

<---------------------------------------------------------->

<--------------------CARPETA PAGINA WEB-------------------->

Aqui encontraremos todos los archivos de la pagina separados en sus respectivas carpetas, el archivo de la pagina principal
index.html, la carpeta de CSS con los estilos, una carpeta HTML para las paginas secundarias de la web, una carpeta de
imagenes y por ultimo una carpeta para los Scripts de Java.

Tendremos que mover todo de nuevo a la carpeta Htdocs de Xampp para que funcione la inscripcion.

<---------------------------------------------------------->

<--------------------CARPETA PROGRAMACION------------------>

En esta carpeta se encuentra el codigo Java en un bloc de notas con el que podremos conectar con la base de datos y sacar
informacion, hay varias funciones con comentarios de lo que hace cada una de ellas.

Tambien tenemos un archivo mysql.jar que sera necesario instalar como libreria en la carpeta del proyecto donde tengamos
la clase. 


