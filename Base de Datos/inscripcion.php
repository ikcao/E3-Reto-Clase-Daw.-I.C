<html>
<body>

<?php 
    $email=$_GET["email"];
    $contrasena=$_GET["contrasena"];
    $nombre=$_GET["nombre"];
    $apellido=$_GET["apellido"];
    $edad=$_GET["edad"];
    $telefono=$_GET["telefono"] ?? null;
    
    if (isset ($_GET['genero'])){ 
      $genero=$_GET["genero"];}
    $localidad=$_GET["localidad"];
?>   


<?php
$clave=md5($contrasena);
 //echo 'clave'.$clave;
?>

Gracias por suscribirte !!<br>


<?php
$servidor = "localhost";
$usuario = "root";
$password = "retoiker";
$basedatos = "basedatoseventos";

// Crear conexión
$conn = new mysqli('localhost', 'root', '', 'basedatoseventos');
// Checkear conexión
if ($conn->connect_error) {
  die("Conexión fallida: " . $conn->connect_error);
}

$sql = "INSERT INTO suscritos (email,contrasena,nombre,apellido,edad,genero,telefono,localidad)
VALUES ('$email','$clave','$nombre','$apellido','$edad','$genero','$telefono','$localidad')";

if ($conn->query($sql) === TRUE) {
  echo "Dado de alta satisfactoriamente";
} else {
  echo "Error: " . $sql . "<br>" . $conn->error;
}

// Cerrar conexión
$conn->close();
?>

</body>
</html>