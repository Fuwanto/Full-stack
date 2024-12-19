// Implementa una función recursiva para calcular la suma de los primeros `n` números naturales.

function sum(n) {
  if (n === 0) return 0;
  return n + sum(n - 1);
}

console.log(sum(5));

console.log(sum(10));

console.log(sum(100));
