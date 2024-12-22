// 1. Usa `map` para convertir un arreglo de grados Celsius a Fahrenheit.
const celsius = [0, 15, 30, 45, 60, 75, 90];
const fahrenheit = celsius.map((c) => c * 1.8 + 32);
console.log(fahrenheit);

// 2. Aplica `filter` para filtrar los nombres con más de 5 caracteres en un arreglo de strings.
const nombres = ["Juan", "Ana", "Pedro", "Antonella", "María", "Milagros"];
const nombresLargos = nombres.filter((nombre) => nombre.length > 5);
console.log(nombresLargos);

// 3. Utiliza `reduce` para sumar todos los números en un arreglo.
const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const suma = numeros.reduce((acc, num) => acc + num, 0);
console.log(suma);
