# Algoritmos básicos

## 1. Búsqueda secuencial

Es un algoritmo simple que busca un elemento recorriendo uno por uno los elementos de una lista o arreglo. Si encuentra el elemento, devuelve su posición; de lo contrario, indica que no está presente.

---

#### Pasos del algoritmo

1. Recorrer cada elemento del arreglo o lista.
2. Comparar el elemento actual con el buscado.
3. Si son iguales, retornar el índice (posición).
4. Si se termina la lista sin encontrar el elemento, retornar un valor que indique "no encontrado" (usualmente `-1`).

---

### Implementación en Python

```python
def busqueda_secuencial(lista, elemento):
    for i in range(len(lista)):
        if lista[i] == elemento:
            return i  # Retorna el índice donde encontró el elemento
    return -1  # Si no lo encuentra, retorna -1

# Ejemplo
numeros = [4, 2, 7, 1, 9]
print(busqueda_secuencial(numeros, 7))  # Output: 2
print(busqueda_secuencial(numeros, 3))  # Output: -1
```

---

### Implementación en JavaScript

```javascript
function busquedaSecuencial(lista, elemento) {
  for (let i = 0; i < lista.length; i++) {
    if (lista[i] === elemento) {
      return i; // Retorna el índice donde encontró el elemento
    }
  }
  return -1; // Si no lo encuentra, retorna -1
}

// Ejemplo
const numeros = [4, 2, 7, 1, 9];
console.log(busquedaSecuencial(numeros, 7)); // Output: 2
console.log(busquedaSecuencial(numeros, 3)); // Output: -1
```

---

### Implementación en Java

```java
public class BusquedaSecuencial {
    public static int busquedaSecuencial(int[] lista, int elemento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == elemento) {
                return i; // Retorna el índice donde encontró el elemento
            }
        }
        return -1; // Si no lo encuentra, retorna -1
    }

    public static void main(String[] args) {
        int[] numeros = {4, 2, 7, 1, 9};
        System.out.println(busquedaSecuencial(numeros, 7)); // Output: 2
        System.out.println(busquedaSecuencial(numeros, 3)); // Output: -1
    }
}
```

---

## 2. Búsqueda binaria

Es un algoritmo eficiente para buscar un elemento en una lista **ordenada**. Funciona dividiendo repetidamente el rango de búsqueda a la mitad hasta encontrar el elemento o determinar que no está presente.

---

#### Requisitos

- La lista debe estar **ordenada** de menor a mayor (o viceversa).

#### Pasos del algoritmo

1. Inicializar dos punteros: uno al inicio (`izquierda`) y otro al final (`derecha`) de la lista.

2. Calcular el índice del elemento medio: `medio = (izquierda + derecha) // 2`.

3. Comparar el elemento en la posición

   ```
   medio
   ```

   con el valor buscado:

   - Si son iguales, retorna el índice.
   - Si el valor buscado es menor, ajusta `derecha` al índice `medio - 1`.
   - Si el valor buscado es mayor, ajusta `izquierda` al índice `medio + 1`.

4. Repetir hasta que `izquierda` sea mayor que `derecha` (significa que el elemento no está).

---

### Implementación en Python

```python
def busqueda_binaria(lista, elemento):
    izquierda, derecha = 0, len(lista) - 1

    while izquierda <= derecha:
        medio = (izquierda + derecha) // 2
        if lista[medio] == elemento:
            return medio  # Retorna el índice donde encontró el elemento
        elif lista[medio] < elemento:
            izquierda = medio + 1
        else:
            derecha = medio - 1

    return -1  # Si no lo encuentra, retorna -1

# Ejemplo
numeros = [1, 2, 4, 7, 9]
print(busqueda_binaria(numeros, 7))  # Output: 3
print(busqueda_binaria(numeros, 3))  # Output: -1
```

---

### Implementación en JavaScript

```javascript
function busquedaBinaria(lista, elemento) {
  let izquierda = 0;
  let derecha = lista.length - 1;

  while (izquierda <= derecha) {
    let medio = Math.floor((izquierda + derecha) / 2);

    if (lista[medio] === elemento) {
      return medio; // Retorna el índice donde encontró el elemento
    } else if (lista[medio] < elemento) {
      izquierda = medio + 1;
    } else {
      derecha = medio - 1;
    }
  }
  return -1; // Si no lo encuentra, retorna -1
}

// Ejemplo
const numeros = [1, 2, 4, 7, 9];
console.log(busquedaBinaria(numeros, 7)); // Output: 3
console.log(busquedaBinaria(numeros, 3)); // Output: -1
```

---

### Implementación en Java

```java
public class BusquedaBinaria {
    public static int busquedaBinaria(int[] lista, int elemento) {
        int izquierda = 0, derecha = lista.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (lista[medio] == elemento) {
                return medio; // Retorna el índice donde encontró el elemento
            } else if (lista[medio] < elemento) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return -1; // Si no lo encuentra, retorna -1
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 4, 7, 9};
        System.out.println(busquedaBinaria(numeros, 7)); // Output: 3
        System.out.println(busquedaBinaria(numeros, 3)); // Output: -1
    }
}
```

---

La **búsqueda binaria** es mucho más eficiente que la secuencial, especialmente con listas grandes, ya que tiene una complejidad de **O(log n)** en lugar de **O(n)**.

---

## 3. Ordenamiento por burbuja (Bubble Sort)

Es uno de los algoritmos más simples para ordenar una lista. Funciona comparando pares de elementos adyacentes y los intercambia si están en el orden incorrecto. Este proceso se repite hasta que la lista esté completamente ordenada.

---

#### Pasos del algoritmo

1. Recorre la lista desde el inicio hasta el final.
2. Compara cada par de elementos adyacentes:
   - Si el primero es mayor que el segundo (para orden ascendente), intercámbialos.
3. Al final de cada recorrido, el elemento más grande estará en su posición final.
4. Repite el proceso para los elementos restantes hasta que no haya intercambios en un recorrido completo.

---

#### Características

- Complejidad:
  - Peor caso y promedio: **O(n²)**.
  - Mejor caso (lista ya ordenada): **O(n)**.
- Es un algoritmo ineficiente para listas grandes, pero útil para aprender conceptos básicos de ordenamiento.

---

### Implementación en Python

```python
def ordenamiento_burbuja(lista):
    n = len(lista)
    for i in range(n):
        # La última posición de cada recorrido ya está ordenada
        for j in range(0, n - i - 1):
            if lista[j] > lista[j + 1]:
                # Intercambia elementos
                lista[j], lista[j + 1] = lista[j + 1], lista[j]

# Ejemplo
numeros = [64, 34, 25, 12, 22, 11, 90]
ordenamiento_burbuja(numeros)
print(numeros)  # Output: [11, 12, 22, 25, 34, 64, 90]
```

---

### Implementación en JavaScript

```javascript
function ordenamientoBurbuja(lista) {
  let n = lista.length;
  for (let i = 0; i < n; i++) {
    // La última posición de cada recorrido ya está ordenada
    for (let j = 0; j < n - i - 1; j++) {
      if (lista[j] > lista[j + 1]) {
        // Intercambia elementos
        let temp = lista[j];
        lista[j] = lista[j + 1];
        lista[j + 1] = temp;
      }
    }
  }
}

// Ejemplo
let numeros = [64, 34, 25, 12, 22, 11, 90];
ordenamientoBurbuja(numeros);
console.log(numeros); // Output: [11, 12, 22, 25, 34, 64, 90]
```

---

### Implementación en Java

```java
public class OrdenamientoBurbuja {
    public static void ordenamientoBurbuja(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n; i++) {
            // La última posición de cada recorrido ya está ordenada
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    // Intercambia elementos
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
        ordenamientoBurbuja(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        // Output: 11 12 22 25 34 64 90
    }
}
```

---

## 4. Ordenamiento por selección (Selection Sort)

Este algoritmo divide la lista en dos partes: una parte ordenada y otra no ordenada. Repetidamente selecciona el elemento más pequeño (o el más grande, según el orden) de la parte no ordenada y lo mueve a la parte ordenada.

---

#### Pasos del algoritmo

1. Encuentra el elemento más pequeño en la parte no ordenada de la lista.
2. Intercambia ese elemento con el primer elemento de la parte no ordenada.
3. Marca el nuevo inicio de la parte no ordenada y repite el proceso hasta que toda la lista esté ordenada.

---

#### Características

- Complejidad:
  - Peor caso, mejor caso y promedio: **O(n²)**.
- Ventaja: Hace menos intercambios que el ordenamiento burbuja.
- Desventaja: Comparativamente lento para listas grandes.

---

### Implementación en Python

```python
def ordenamiento_seleccion(lista):
    n = len(lista)
    for i in range(n):
        # Encuentra el índice del elemento más pequeño en la parte no ordenada
        indice_minimo = i
        for j in range(i + 1, n):
            if lista[j] < lista[indice_minimo]:
                indice_minimo = j
        # Intercambia el elemento más pequeño con el primer elemento no ordenado
        lista[i], lista[indice_minimo] = lista[indice_minimo], lista[i]

# Ejemplo
numeros = [64, 25, 12, 22, 11]
ordenamiento_seleccion(numeros)
print(numeros)  # Output: [11, 12, 22, 25, 64]
```

---

### Implementación en JavaScript

```javascript
function ordenamientoSeleccion(lista) {
  let n = lista.length;
  for (let i = 0; i < n; i++) {
    // Encuentra el índice del elemento más pequeño en la parte no ordenada
    let indiceMinimo = i;
    for (let j = i + 1; j < n; j++) {
      if (lista[j] < lista[indiceMinimo]) {
        indiceMinimo = j;
      }
    }
    // Intercambia el elemento más pequeño con el primero no ordenado
    let temp = lista[i];
    lista[i] = lista[indiceMinimo];
    lista[indiceMinimo] = temp;
  }
}

// Ejemplo
let numeros = [64, 25, 12, 22, 11];
ordenamientoSeleccion(numeros);
console.log(numeros); // Output: [11, 12, 22, 25, 64]
```

---

### Implementación en Java

```java
public class OrdenamientoSeleccion {
    public static void ordenamientoSeleccion(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n; i++) {
            // Encuentra el índice del elemento más pequeño en la parte no ordenada
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            // Intercambia el elemento más pequeño con el primero no ordenado
            int temp = lista[i];
            lista[i] = lista[indiceMinimo];
            lista[indiceMinimo] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {64, 25, 12, 22, 11};
        ordenamientoSeleccion(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        // Output: 11 12 22 25 64
    }
}
```

---

## 5. Ordenamiento por inserción (Insertion Sort)

Este algoritmo funciona construyendo la lista ordenada de forma incremental. Toma un elemento de la lista no ordenada, lo inserta en la posición correcta dentro de la lista ordenada y repite el proceso para todos los elementos.

---

#### Pasos del algoritmo

1. Comienza con el segundo elemento (asumiendo que el primero ya está "ordenado").
2. Compara este elemento con los anteriores y lo desplaza hacia la izquierda hasta encontrar su posición correcta.
3. Repite el proceso para todos los elementos de la lista.

---

#### Características

- Complejidad:
  - Peor caso y promedio: **O(n²)**.
  - Mejor caso (lista ya ordenada): **O(n)**.
- Es más eficiente que burbuja y selección para listas pequeñas o casi ordenadas.

---

### Implementación en Python

```python
def ordenamiento_insercion(lista):
    for i in range(1, len(lista)):
        key = lista[i]
        j = i - 1
        # Mueve los elementos mayores que key una posición a la derecha
        while j >= 0 and lista[j] > key:
            lista[j + 1] = lista[j]
            j -= 1
        lista[j + 1] = key

# Ejemplo
numeros = [12, 11, 13, 5, 6]
ordenamiento_insercion(numeros)
print(numeros)  # Output: [5, 6, 11, 12, 13]
```

---

### Implementación en JavaScript

```javascript
function ordenamientoInsercion(lista) {
  for (let i = 1; i < lista.length; i++) {
    let key = lista[i];
    let j = i - 1;
    // Mueve los elementos mayores que key una posición a la derecha
    while (j >= 0 && lista[j] > key) {
      lista[j + 1] = lista[j];
      j--;
    }
    lista[j + 1] = key;
  }
}

// Ejemplo
let numeros = [12, 11, 13, 5, 6];
ordenamientoInsercion(numeros);
console.log(numeros); // Output: [5, 6, 11, 12, 13]
```

---

### Implementación en Java

```java
public class OrdenamientoInsercion {
    public static void ordenamientoInsercion(int[] lista) {
        for (int i = 1; i < lista.length; i++) {
            int key = lista[i];
            int j = i - 1;
            // Mueve los elementos mayores que key una posición a la derecha
            while (j >= 0 && lista[j] > key) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {12, 11, 13, 5, 6};
        ordenamientoInsercion(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        // Output: 5 6 11 12 13
    }
}
```

---

## 5. Quicksort

Quicksort es un algoritmo de **divide y vencerás**. Divide la lista en sublistas alrededor de un **pivote** y ordena cada sublista de manera recursiva.

---

#### Pasos del algoritmo

1. Selecciona un **pivote** (puede ser el primer, último o un elemento aleatorio).
2. Divide la lista en dos sublistas:
   - Elementos menores o iguales al pivote.
   - Elementos mayores al pivote.
3. Aplica recursivamente el algoritmo en las dos sublistas.
4. Combina las sublistas y el pivote en un arreglo ordenado.

---

#### Características

- Complejidad:
  - Peor caso (lista desbalanceada): **O(n²)**.
  - Promedio y mejor caso: **O(n log n)**.
- Es uno de los algoritmos más rápidos para listas grandes.

---

### Implementación en Python

```python
def quicksort(lista):
    if len(lista) <= 1:
        return lista  # Base de la recursión: lista vacía o con un solo elemento

    pivote = lista[len(lista) // 2]  # Elegimos el pivote
    menores = [x for x in lista if x < pivote]
    iguales = [x for x in lista if x == pivote]
    mayores = [x for x in lista if x > pivote]

    # Ordenamos recursivamente las sublistas y las combinamos
    return quicksort(menores) + iguales + quicksort(mayores)

# Ejemplo
numeros = [10, 7, 8, 9, 1, 5]
print(quicksort(numeros))  # Output: [1, 5, 7, 8, 9, 10]
```

---

### Implementación en JavaScript

```javascript
function quicksort(lista) {
  if (lista.length <= 1) {
    return lista; // Base de la recursión: lista vacía o con un solo elemento
  }

  let pivote = lista[Math.floor(lista.length / 2)]; // Elegimos el pivote
  let menores = lista.filter((x) => x < pivote);
  let iguales = lista.filter((x) => x === pivote);
  let mayores = lista.filter((x) => x > pivote);

  // Ordenamos recursivamente las sublistas y las combinamos
  return [...quicksort(menores), ...iguales, ...quicksort(mayores)];
}

// Ejemplo
const numeros = [10, 7, 8, 9, 1, 5];
console.log(quicksort(numeros)); // Output: [1, 5, 7, 8, 9, 10]
```

---

### Implementación en Java

```java
import java.util.ArrayList;
import java.util.List;

public class Quicksort {
    public static List<Integer> quicksort(List<Integer> lista) {
        if (lista.size() <= 1) {
            return lista; // Base de la recursión: lista vacía o con un solo elemento
        }

        int pivote = lista.get(lista.size() / 2); // Elegimos el pivote
        List<Integer> menores = new ArrayList<>();
        List<Integer> iguales = new ArrayList<>();
        List<Integer> mayores = new ArrayList<>();

        for (int num : lista) {
            if (num < pivote) {
                menores.add(num);
            } else if (num == pivote) {
                iguales.add(num);
            } else {
                mayores.add(num);
            }
        }

        // Ordenamos recursivamente las sublistas y las combinamos
        List<Integer> resultado = new ArrayList<>(quicksort(menores));
        resultado.addAll(iguales);
        resultado.addAll(quicksort(mayores));
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(10, 7, 8, 9, 1, 5);
        List<Integer> ordenados = quicksort(new ArrayList<>(numeros));
        System.out.println(ordenados); // Output: [1, 5, 7, 8, 9, 10]
    }
}
```

---

## 6. Mergesort

Mergesort es un algoritmo basado en el paradigma de **divide y vencerás**. Divide la lista en partes más pequeñas, las ordena de forma recursiva y luego combina (merge) las partes ordenadas.

---

#### Pasos del algoritmo

1. Divide la lista en dos mitades aproximadamente iguales.
2. Ordena recursivamente cada mitad usando Mergesort.
3. Combina las dos mitades ordenadas en una sola lista ordenada.

---

#### Características

- Complejidad:
  - Peor caso, mejor caso y promedio: **O(n log n)**.
- Ventaja: Es más estable que Quicksort y no depende del pivote.
- Desventaja: Requiere memoria adicional para combinar las sublistas.

---

### Implementación en Python

```python
def mergesort(lista):
    if len(lista) <= 1:
        return lista  # Base de la recursión

    # Divide la lista en dos mitades
    medio = len(lista) // 2
    izquierda = mergesort(lista[:medio])
    derecha = mergesort(lista[medio:])

    # Combina las mitades ordenadas
    return merge(izquierda, derecha)

def merge(izquierda, derecha):
    resultado = []
    i = j = 0

    # Combina las listas mientras haya elementos en ambas
    while i < len(izquierda) and j < len(derecha):
        if izquierda[i] <= derecha[j]:
            resultado.append(izquierda[i])
            i += 1
        else:
            resultado.append(derecha[j])
            j += 1

    # Agrega los elementos restantes
    resultado.extend(izquierda[i:])
    resultado.extend(derecha[j:])
    return resultado

# Ejemplo
numeros = [38, 27, 43, 3, 9, 82, 10]
print(mergesort(numeros))  # Output: [3, 9, 10, 27, 38, 43, 82]
```

---

### Implementación en JavaScript

```javascript
function mergesort(lista) {
  if (lista.length <= 1) {
    return lista; // Base de la recursión
  }

  // Divide la lista en dos mitades
  const medio = Math.floor(lista.length / 2);
  const izquierda = mergesort(lista.slice(0, medio));
  const derecha = mergesort(lista.slice(medio));

  // Combina las mitades ordenadas
  return merge(izquierda, derecha);
}

function merge(izquierda, derecha) {
  const resultado = [];
  let i = 0,
    j = 0;

  // Combina las listas mientras haya elementos en ambas
  while (i < izquierda.length && j < derecha.length) {
    if (izquierda[i] <= derecha[j]) {
      resultado.push(izquierda[i]);
      i++;
    } else {
      resultado.push(derecha[j]);
      j++;
    }
  }

  // Agrega los elementos restantes
  return resultado.concat(izquierda.slice(i)).concat(derecha.slice(j));
}

// Ejemplo
const numeros = [38, 27, 43, 3, 9, 82, 10];
console.log(mergesort(numeros)); // Output: [3, 9, 10, 27, 38, 43, 82]
```

---

### Implementación en Java

```java
import java.util.ArrayList;
import java.util.List;

public class Mergesort {
    public static List<Integer> mergesort(List<Integer> lista) {
        if (lista.size() <= 1) {
            return lista; // Base de la recursión
        }

        // Divide la lista en dos mitades
        int medio = lista.size() / 2;
        List<Integer> izquierda = mergesort(new ArrayList<>(lista.subList(0, medio)));
        List<Integer> derecha = mergesort(new ArrayList<>(lista.subList(medio, lista.size())));

        // Combina las mitades ordenadas
        return merge(izquierda, derecha);
    }

    public static List<Integer> merge(List<Integer> izquierda, List<Integer> derecha) {
        List<Integer> resultado = new ArrayList<>();
        int i = 0, j = 0;

        // Combina las listas mientras haya elementos en ambas
        while (i < izquierda.size() && j < derecha.size()) {
            if (izquierda.get(i) <= derecha.get(j)) {
                resultado.add(izquierda.get(i));
                i++;
            } else {
                resultado.add(derecha.get(j));
                j++;
            }
        }

        // Agrega los elementos restantes
        resultado.addAll(izquierda.subList(i, izquierda.size()));
        resultado.addAll(derecha.subList(j, derecha.size()));
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(38, 27, 43, 3, 9, 82, 10);
        List<Integer> ordenados = mergesort(new ArrayList<>(numeros));
        System.out.println(ordenados); // Output: [3, 9, 10, 27, 38, 43, 82]
    }
}
```

---

## 7. Recorrido de datos (map, filter, reduce).

### 1. map:

El método `map()` se utiliza para transformar cada elemento de una colección (lista, array, etc.) según una función que le pases. Devuelve una nueva colección con los elementos transformados.

### 2. filter:

El método `filter()` se utiliza para filtrar los elementos de una colección basándose en una condición. Devuelve una nueva colección con solo aquellos elementos que cumplan con la condición.

### 3. reduce:

El método `reduce()` se utiliza para reducir una colección a un único valor, aplicando una función acumuladora a los elementos de la colección.

---

### Python

En Python, podemos usar los métodos `map()`, `filter()`, y `reduce()` (que se encuentra en el módulo `functools`) para trabajar con colecciones.

#### Ejemplo de map, filter y reduce en Python

```python
from functools import reduce

# Datos de ejemplo
numeros = [1, 2, 3, 4, 5]

# map: Multiplicar cada número por 2
map_resultado = list(map(lambda x: x * 2, numeros))
print("Resultado de map:", map_resultado)  # Output: [2, 4, 6, 8, 10]

# filter: Filtrar los números mayores a 3
filter_resultado = list(filter(lambda x: x > 3, numeros))
print("Resultado de filter:", filter_resultado)  # Output: [4, 5]

# reduce: Sumar todos los números
reduce_resultado = reduce(lambda x, y: x + y, numeros)
print("Resultado de reduce:", reduce_resultado)  # Output: 15
```

### Explicación:

- **map**: Aplica una función lambda que multiplica cada número por 2. Devuelve una lista con los resultados.
- **filter**: Filtra los números mayores a 3. Solo mantiene los elementos que cumplen la condición.
- **reduce**: Suma todos los números en la lista, acumulando el valor desde el principio hasta el final.

---

### JavaScript

En JavaScript, los métodos `map()`, `filter()` y `reduce()` se aplican a arrays y funcionan de manera similar a los de Python.

#### Ejemplo de map, filter y reduce en JavaScript

```javascript
// Datos de ejemplo
const numeros = [1, 2, 3, 4, 5];

// map: Multiplicar cada número por 2
const mapResultado = numeros.map((x) => x * 2);
console.log("Resultado de map:", mapResultado); // Output: [2, 4, 6, 8, 10]

// filter: Filtrar los números mayores a 3
const filterResultado = numeros.filter((x) => x > 3);
console.log("Resultado de filter:", filterResultado); // Output: [4, 5]

// reduce: Sumar todos los números
const reduceResultado = numeros.reduce((acc, x) => acc + x, 0);
console.log("Resultado de reduce:", reduceResultado); // Output: 15
```

### Explicación:

- **map**: Multiplica cada número por 2 y devuelve un nuevo array con los resultados.
- **filter**: Filtra los números mayores a 3, devolviendo solo los elementos que cumplen la condición.
- **reduce**: Suma todos los números del array. El primer parámetro de `reduce()` es una función acumuladora, y el segundo es el valor inicial de la acumulación (en este caso, `0`).

---

### Java (Streams)

En Java, para realizar operaciones similares a `map`, `filter` y `reduce`, utilizamos las **Streams**. Las **Streams** son una herramienta poderosa de Java que permite trabajar con colecciones de manera funcional, similar a los métodos en Python y JavaScript.

#### Ejemplo de map, filter y reduce en Java

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecorridoDatos {
    public static void main(String[] args) {
        // Datos de ejemplo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // map: Multiplicar cada número por 2
        List<Integer> mapResultado = numeros.stream()
                                             .map(x -> x * 2)
                                             .collect(Collectors.toList());
        System.out.println("Resultado de map: " + mapResultado);  // Output: [2, 4, 6, 8, 10]

        // filter: Filtrar los números mayores a 3
        List<Integer> filterResultado = numeros.stream()
                                                .filter(x -> x > 3)
                                                .collect(Collectors.toList());
        System.out.println("Resultado de filter: " + filterResultado);  // Output: [4, 5]

        // reduce: Sumar todos los números
        int reduceResultado = numeros.stream()
                                      .reduce(0, (acc, x) -> acc + x);
        System.out.println("Resultado de reduce: " + reduceResultado);  // Output: 15
    }
}
```

### Explicación:

- **map**: Utilizamos `map()` para multiplicar cada número por 2. El resultado se recoge en una lista usando `collect()`.
- **filter**: Utilizamos `filter()` para seleccionar los números mayores a 3. También se recoge el resultado con `collect()`.
- **reduce**: Utilizamos `reduce()` para sumar todos los números. El primer parámetro de `reduce()` es el valor inicial (`0`), y el segundo es la función acumuladora.

### Conclusión:

En Java, las **Streams** proporcionan una forma elegante de realizar operaciones funcionales sobre colecciones, similares a lo que vimos en Python y JavaScript.
