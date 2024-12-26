// 1. Crea un script en JavaScript con un error de tipo y uno de referencia, y muestra cómo corregirlos.
// 2. Escribe un código con un error lógico (por ejemplo, un bucle infinito) y explica cómo se puede depurar.

// Error de tipo
let x = 10;
let y = "10";
console.log(x + y); // 1010

// Error de referencia
let z;
console.log(z); // undefined

// Error lógico
let i = 0;
while (i < 10) {
  console.log(i);
  // i++;
}

// Para depurar el error lógico, se puede utilizar un debugger o un console.log para ver el valor de la variable i en cada iteración del bucle. También se puede agregar una condición de salida para evitar el bucle infinito. Por ejemplo:
let j = 0;
while (j < 10) {
  console.log(j);
  j++;
}
