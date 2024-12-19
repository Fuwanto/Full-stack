// Escribe una función que determine si una cadena contiene más de 10 caracteres.

function masDe10Caracteres(cadena) {
  if (cadena.length > 10) {
    return true;
  } else {
    return false;
  }
}

console.log(masDe10Caracteres("hola mundo"));

console.log(masDe10Caracteres("hola mundo cruel"));

console.log(masDe10Caracteres("hola mundo cruel y despiadado"));
