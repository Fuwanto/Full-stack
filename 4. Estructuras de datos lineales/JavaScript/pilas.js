// clase Pila
class Pila {
  constructor() {
    this.pila = [];
  }
  push(elemento) {
    this.pila.push(elemento);
  }
  pop() {
    return this.pila.pop();
  }
  peek() {
    return this.pila[this.pila.length - 1];
  }
  isEmpty() {
    return this.pila.length === 0;
  }
  size() {
    return this.pila.length;
  }
  print() {
    console.log(this.pila);
  }
}

// 1. Implementa una pila que permita verificar si una cadena tiene paréntesis balanceados.
function parentesisBalanceados(cadena) {
  const pila = new Pila();
  for (let i = 0; i < cadena.length; i++) {
    if (cadena[i] === "(") {
      pila.push(cadena[i]);
    } else if (cadena[i] === ")") {
      if (pila.isEmpty()) {
        return false;
      }
      pila.pop();
    }
  }
  return pila.isEmpty();
}

console.log(
  "La cadena '(())' tiene paréntesis balanceados: ",
  parentesisBalanceados("(())")
); // true
console.log(
  "La cadena '(()' tiene paréntesis balanceados: ",
  parentesisBalanceados("(()")
); // false

// 2. Escribe una función que convierta un número decimal a binario usando una pila.
function decimalToBinary(decimal) {
  const pila = new Pila();
  let binario = "";
  while (decimal > 0) {
    pila.push(decimal % 2);
    decimal = Math.floor(decimal / 2);
  }
  while (!pila.isEmpty()) {
    binario += pila.pop();
  }
  return binario;
}

console.log("10 en binario es: ", decimalToBinary(10)); // 1010
console.log("15 en binario es: ", decimalToBinary(15)); // 1111
