// 1. Implementa el algoritmo de selección para ordenar un arreglo de números.
// 2. Escribe una función que ordene un arreglo usando el algoritmo Mergesort.

// Algoritmo de selección
function selectionSort(arr) {
  for (let i = 0; i < arr.length; i++) {
    let min = i;
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[j] < arr[min]) {
        min = j;
      }
    }
    if (i !== min) {
      [arr[i], arr[min]] = [arr[min], arr[i]];
    }
  }
  return arr;
}

// Mergesort
function mergeSort(arr) {
  if (arr.length < 2) {
    return arr;
  }
  const middle = Math.floor(arr.length / 2);
  const left = arr.slice(0, middle);
  const right = arr.slice(middle);
  return merge(mergeSort(left), mergeSort(right));
}

function merge(left, right) {
  let result = [];
  let indexLeft = 0;
  let indexRight = 0;

  while (indexLeft < left.length && indexRight < right.length) {
    if (left[indexLeft] < right[indexRight]) {
      result.push(left[indexLeft]);
      indexLeft++;
    } else {
      result.push(right[indexRight]);
      indexRight++;
    }
  }

  return result.concat(left.slice(indexLeft)).concat(right.slice(indexRight));
}

// Prueba de los algoritmos
const arr = [4, 2, 3, 1, 5];
console.log(selectionSort(arr)); // [1, 2, 3, 4, 5]

const arr2 = [7, 4, 5, 2, 1, 3, 6];
console.log(mergeSort(arr2)); // [1, 2, 3, 4, 5, 6, 7]
