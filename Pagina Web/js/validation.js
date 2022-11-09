function validarNombre() {
    let x = document.forms["form-register"]["nombre"].value;
    if (x == "") {
      alert("Debes introducir un nombre");
      return false;
    }
  }


