// 1. Escribe una función que realice una búsqueda secuencial en un arreglo y devuelva el índice del elemento encontrado.
// 2. Implementa la búsqueda binaria en un arreglo ordenado de números.

// Búsqueda secuencial
function busquedaSecuencial(arr, elemento) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === elemento) {
      return i;
    }
  }
  return -1;
}

// Búsqueda binaria
function busquedaBinaria(arr, elemento) {
  let inicio = 0;
  let fin = arr.length - 1;
  while (inicio <= fin) {
    let medio = Math.floor((inicio + fin) / 2);
    if (arr[medio] === elemento) {
      return medio;
    } else if (arr[medio] < elemento) {
      inicio = medio + 1;
    } else {
      fin = medio - 1;
    }
  }
  return -1;
}

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let numero = 5;
// Prueba de la búsqueda secuencial
console.log(busquedaSecuencial(arr, numero)); // 4

// Prueba de la búsqueda binaria
console.log(busquedaBinaria(arr, numero)); // 4
