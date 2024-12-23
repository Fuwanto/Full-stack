// 1. Crea un arreglo con los nombres de tus amigos y muestra el nombre más largo.
const friends = [
  "Ariadna",
  "Geronimo",
  "Julio",
  "Juan",
  "Federico",
  "Valentina",
  "Max",
];
const longestName = friends.reduce(
  (acc, name) => (name.length > acc.length ? name : acc),
  ""
);
console.log(longestName);

// 2. Escribe una función que duplique cada número en un arreglo de enteros.
const duplicateNumbers = (numbers) => numbers.map((number) => number * 2);
console.log(duplicateNumbers([1, 2, 3, 4, 5])); // [2, 4, 6, 8, 10]
