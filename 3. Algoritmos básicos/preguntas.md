# Preguntas Teóricas Integradoras

---

## Algoritmos Básicos

**Búsqueda Secuencial**

### ¿Qué es el algoritmo de búsqueda secuencial y en qué casos es más adecuado?

El **algoritmo de búsqueda secuencial** (o búsqueda lineal) es un método sencillo para localizar un elemento dentro de una estructura de datos, como una lista o un arreglo. Funciona recorriendo la estructura desde el primer elemento hasta el último, comparando cada uno con el valor buscado. Si encuentra el valor, retorna su posición; si no, termina indicando que el elemento no está presente.

**Funcionamiento del algoritmo**

1. Se empieza por el primer elemento de la lista.
2. Se compara este elemento con el valor buscado.
3. Si coinciden, el algoritmo retorna la posición actual.
4. Si no coinciden, avanza al siguiente elemento.
5. Este proceso se repite hasta encontrar el valor o hasta recorrer toda la lista.

**Ventajas**

- Es **fácil de implementar** y entender.
- **No requiere orden** en la lista o estructura de datos.
- Funciona en cualquier tipo de estructura de datos lineal.

**Desventajas**

- Es poco eficiente para listas grandes, ya que su complejidad es \( O(n) \), donde \( n \) es el número de elementos en la lista.
- Si el elemento buscado está al final de la lista o no está presente, el tiempo de ejecución es el máximo.

**Casos más adecuados para usar búsqueda secuencial**

1. **Listas pequeñas:** Cuando el tamaño de la lista es reducido, la simplicidad del algoritmo puede ser más importante que la eficiencia.
2. **Estructuras de datos no ordenadas:** Si la lista no está ordenada y no se desea invertir tiempo en ordenarla.
3. **Búsquedas puntuales:** Si se realizan pocas búsquedas, el costo computacional no será significativo.
4. **Búsqueda en estructuras complejas:** En algunos casos donde no se puede acceder a índices directamente, como con listas enlazadas, la búsqueda secuencial es la opción más viable.

**Ejemplo en Python**

```python
def busqueda_secuencial(lista, valor_buscado):
    for i in range(len(lista)):
        if lista[i] == valor_buscado:
            return i  # Retorna la posición del valor encontrado
    return -1  # Retorna -1 si no encuentra el valor

# Ejemplo de uso
numeros = [3, 5, 7, 9, 11]
posicion = busqueda_secuencial(numeros, 7)
print(f"El número 7 está en la posición: {posicion}")  # Salida: 2
```

**Ejemplo en Java**

```java
public class BusquedaSecuencial {
    public static int busquedaSecuencial(int[] lista, int valorBuscado) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == valorBuscado) {
                return i; // Retorna la posición del valor encontrado
            }
        }
        return -1; // Retorna -1 si no encuentra el valor
    }

    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 9, 11};
        int posicion = busquedaSecuencial(numeros, 7);
        System.out.println("El número 7 está en la posición: " + posicion); // Salida: 2
    }
}
```

**Ejemplo en JavaScript**

```javascript
function busquedaSecuencial(lista, valorBuscado) {
  for (let i = 0; i < lista.length; i++) {
    if (lista[i] === valorBuscado) {
      return i; // Retorna la posición del valor encontrado
    }
  }
  return -1; // Retorna -1 si no encuentra el valor
}

// Ejemplo de uso
const numeros = [3, 5, 7, 9, 11];
const posicion = busquedaSecuencial(numeros, 7);
console.log(`El número 7 está en la posición: ${posicion}`); // Salida: 2
```

En resumen, la búsqueda secuencial es más adecuada para contextos simples o con pocas restricciones, pero no es eficiente para listas grandes, donde algoritmos más avanzados, como la búsqueda binaria, pueden ser más apropiados si los datos están ordenados.

**Búsqueda Binaria**

### ¿Cuáles son los requisitos necesarios para usar el algoritmo de búsqueda binaria?

El algoritmo de **búsqueda binaria** es un método eficiente para localizar un elemento en una lista ordenada, dividiendo repetidamente el rango de búsqueda a la mitad. Sin embargo, su correcto funcionamiento depende de cumplir ciertos requisitos:

---

**Requisitos necesarios para usar búsqueda binaria**

1. **Lista ordenada**:

   - La lista o arreglo debe estar ordenado de manera ascendente o descendente antes de aplicar la búsqueda binaria.
   - Si la lista no está ordenada, primero se debe ordenar, lo que puede implicar un costo adicional \( O(n \log n) \).

2. **Acceso aleatorio a los elementos**:

   - Se necesita poder acceder a cualquier elemento de la lista por su índice, lo que es posible en estructuras como arreglos o listas dinámicas (arrays).
   - No es adecuado para estructuras como listas enlazadas, ya que no permiten acceso directo a los elementos.

3. **Datos comparables**:

   - Los elementos de la lista deben ser comparables entre sí para determinar si el valor buscado es mayor, menor o igual a un elemento dado. Esto implica que el operador de comparación (\( <, >, == \)) sea aplicable a los datos.

4. **Espacios continuos**:
   - La estructura debe estar almacenada de manera continua en memoria o al menos permitir índices secuenciales (como los arreglos), ya que el algoritmo se basa en dividir rangos por índices intermedios.

---

**Limitaciones a considerar**

- Si los datos no están ordenados, el costo de ordenarlos puede ser significativo y podría hacer más conveniente usar otros algoritmos como la búsqueda secuencial.
- Si la estructura no permite acceso directo por índices (e.g., listas enlazadas), la búsqueda binaria no es eficiente ni práctica.
- Es menos útil en listas pequeñas, donde la búsqueda secuencial podría ser suficiente y más sencilla de implementar.

En resumen, el principal requisito para usar búsqueda binaria es contar con una lista **ordenada** y con acceso rápido a los elementos. Es ideal para trabajar con grandes volúmenes de datos organizados.

### Describe los pasos principales del algoritmo de búsqueda binaria.

La búsqueda binaria es un algoritmo eficiente que localiza un elemento en una lista ordenada dividiendo repetidamente el rango de búsqueda en mitades. Los pasos principales del algoritmo son:

---

**Pasos del algoritmo de búsqueda binaria**

1. **Inicialización**:

   - Establece dos índices:
     - \( \text{inicio} \): Apunta al primer elemento de la lista.
     - \( \text{fin} \): Apunta al último elemento de la lista.
   - Calcula el índice del elemento **medio** usando la fórmula:
     \[
     \text{medio} = \left\lfloor \frac{\text{inicio} + \text{fin}}{2} \right\rfloor
     \]

2. **Comparación con el elemento medio**:

   - Compara el elemento en la posición \( \text{medio} \) con el valor buscado:
     - Si el elemento medio es igual al valor buscado, el algoritmo termina y retorna la posición de este elemento.
     - Si el valor buscado es menor que el elemento medio, ajusta el índice \( \text{fin} \) para que apunte a \( \text{medio} - 1 \), descartando la mitad superior de la lista.
     - Si el valor buscado es mayor que el elemento medio, ajusta el índice \( \text{inicio} \) para que apunte a \( \text{medio} + 1 \), descartando la mitad inferior de la lista.

3. **Repetición**:

   - Repite el paso 2 mientras \( \text{inicio} \leq \text{fin} \). Cada iteración reduce el rango de búsqueda a la mitad.

4. **Finalización**:
   - Si el rango de búsqueda se reduce a cero (\( \text{inicio} > \text{fin} \)), el algoritmo concluye que el valor no está presente en la lista y retorna un indicador de fallo (por ejemplo, \( -1 \)).

---

**Ejemplo paso a paso**
Supongamos que buscamos el número **7** en la lista ordenada \([3, 5, 7, 9, 11, 13]\).

1. **Inicialización**:

   - \( \text{inicio} = 0 \), \( \text{fin} = 5 \) (índices de la lista).
   - Calculamos \( \text{medio} = \lfloor (0 + 5) / 2 \rfloor = 2 \).

2. **Primera comparación**:

   - Elemento en \( \text{medio} = 7 \).
   - \( 7 \) es igual al valor buscado. **¡Encontrado!**

   **Resultado:** El valor 7 está en la posición \( 2 \).

---

**Visualización general**

1. **Estado inicial**: Rango completo de búsqueda.
2. **Comparar con el medio**:
   - Si coincide: Éxito.
   - Si no, descartar la mitad superior o inferior.
3. **Actualizar límites**:
   - Ajustar \( \text{inicio} \) o \( \text{fin} \).
4. **Repetir hasta encontrar o agotar el rango**.

---

**Ejemplo en Python:**

```python
def busqueda_binaria(lista, valor_buscado):
    inicio = 0
    fin = len(lista) - 1

    while inicio <= fin:
        medio = (inicio + fin) // 2
        if lista[medio] == valor_buscado:
            return medio  # Retorna la posición del valor encontrado
        elif lista[medio] < valor_buscado:
            inicio = medio + 1
        else:
            fin = medio - 1

    return -1  # Retorna -1 si no encuentra el valor

# Lista ordenada
numeros = [3, 5, 7, 9, 11, 13]
posicion = busqueda_binaria(numeros, 7)
print(f"El número 7 está en la posición: {posicion}")  # Salida: 2
```

---

**Complejidad**

- **Tiempo**: \( O(\log n) \), ya que el rango de búsqueda se reduce a la mitad en cada iteración.
- **Espacio**: \( O(1) \), ya que no requiere memoria adicional significativa.

### ¿Qué ventajas y desventajas tiene en comparación con la búsqueda binaria?

Comparar la **búsqueda secuencial** con la **búsqueda binaria** nos ayuda a entender en qué casos cada algoritmo es más adecuado.

---

**Ventajas de la búsqueda secuencial frente a la búsqueda binaria**

1. **No requiere lista ordenada**:

   - La búsqueda secuencial puede aplicarse directamente a listas desordenadas, mientras que la búsqueda binaria necesita que los datos estén ordenados previamente, lo cual puede requerir un costo adicional de \( O(n \log n) \) si se debe ordenar la lista.

2. **Implementación más sencilla**:

   - La búsqueda secuencial es fácil de implementar, ya que no necesita cálculos de índices intermedios ni ajustes de rangos.

3. **Ideal para listas pequeñas**:

   - En listas de pocos elementos, la búsqueda secuencial puede ser más práctica y rápida, ya que el sobrecosto computacional de la búsqueda binaria no es significativo.

4. **Útil para estructuras sin acceso aleatorio**:

   - La búsqueda secuencial funciona bien con listas enlazadas u otras estructuras que no permiten acceso directo por índices.

5. **Búsquedas no específicas**:
   - Si necesitas encontrar todos los elementos que cumplen cierta condición, la búsqueda secuencial es más adecuada, ya que examina cada elemento de la lista.

---

**Desventajas de la búsqueda secuencial frente a la búsqueda binaria**

1. **Ineficiencia en listas grandes**:

   - La búsqueda secuencial tiene una complejidad de \( O(n) \), ya que puede requerir recorrer toda la lista en el peor caso. Por otro lado, la búsqueda binaria tiene una complejidad de \( O(\log n) \), lo que la hace mucho más eficiente para listas grandes.

2. **No aprovecha listas ordenadas**:

   - Aunque la búsqueda secuencial puede aplicarse a listas ordenadas, no se beneficia de ello para reducir el número de comparaciones, a diferencia de la búsqueda binaria.

3. **Rendimiento predecible**:
   - En la búsqueda secuencial, el tiempo promedio para encontrar un elemento es proporcional al tamaño de la lista, mientras que la búsqueda binaria reduce drásticamente el número de comparaciones al dividir el rango de búsqueda a la mitad en cada paso.

---

**Ventajas de la búsqueda binaria frente a la búsqueda secuencial**

1. **Mayor eficiencia en listas grandes**:

   - La búsqueda binaria descarta la mitad de los elementos en cada iteración, haciendo que sea mucho más rápida que la búsqueda secuencial en listas extensas.

2. **Ejecución rápida con listas ordenadas**:

   - Si la lista ya está ordenada, no hay sobrecosto adicional, y la búsqueda binaria encuentra el elemento mucho más rápido que una búsqueda secuencial.

3. **Rendimiento óptimo para datos estáticos**:
   - En aplicaciones donde los datos no cambian con frecuencia y están ordenados, la búsqueda binaria es altamente eficiente.

---

**Desventajas de la búsqueda binaria frente a la búsqueda secuencial**

1. **Requisito de ordenación**:

   - La búsqueda binaria no funciona en listas desordenadas, por lo que si la lista no está ordenada, se debe ordenar primero, lo cual implica un costo adicional de tiempo y espacio.

2. **Mayor complejidad de implementación**:

   - La búsqueda binaria es más difícil de implementar correctamente, ya que requiere cálculos precisos de índices intermedios y manejo cuidadoso de los límites.

3. **No apta para ciertas estructuras de datos**:
   - La búsqueda binaria no es eficiente en estructuras como listas enlazadas, donde acceder a un elemento en una posición específica no es directo.

---

**Cuadro comparativo**

| **Criterio**                | **Búsqueda Secuencial**             | **Búsqueda Binaria**        |
| --------------------------- | ----------------------------------- | --------------------------- |
| **Orden de la lista**       | No es necesario                     | Necesaria                   |
| **Eficiencia**              | \( O(n) \)                          | \( O(\log n) \)             |
| **Implementación**          | Simple                              | Moderadamente compleja      |
| **Listas pequeñas**         | Más eficiente                       | Menos eficiente             |
| **Listas grandes**          | Ineficiente                         | Muy eficiente               |
| **Estructuras compatibles** | Cualquier lista o estructura lineal | Listas con acceso aleatorio |

---

**Resumen**

- **Usa búsqueda secuencial** si:
  - La lista es pequeña o desordenada.
  - Trabajas con estructuras que no permiten acceso directo por índices.
  - Necesitas una implementación simple o realizar búsquedas generales.
- **Usa búsqueda binaria** si:
  - La lista está ordenada o el costo de ordenarla es asumible.
  - Trabajas con listas grandes.
  - Buscas optimizar el tiempo de búsqueda al máximo.

**Ordenamiento por Burbuja (Bubble Sort)**

### Explica cómo funciona el algoritmo de ordenamiento por burbuja.

El **algoritmo de ordenamiento por burbuja** (o _bubble sort_) es un método sencillo para ordenar una lista comparando repetidamente elementos adyacentes y permutándolos si están en el orden incorrecto. Este proceso se repite hasta que la lista está completamente ordenada.

---

**Pasos principales del algoritmo**

1. **Comparación de elementos adyacentes**:

   - Comienza desde el principio de la lista y compara dos elementos adyacentes:
     - Si el elemento de la izquierda es mayor que el de la derecha (para orden ascendente), se intercambian.
     - Si no, permanecen en su lugar.

2. **Burbujear el mayor elemento**:

   - Al final de cada pasada (o iteración), el elemento más grande de la lista no ordenada "flota" hacia su posición final al final de la lista.

3. **Reducir el rango de comparación**:

   - En cada iteración, se reduce el rango de elementos a comparar, ya que los últimos elementos ya están ordenados.

4. **Repetir hasta que no haya intercambios**:
   - El algoritmo continúa realizando pasadas hasta que no haya más intercambios, lo que indica que la lista está ordenada.

---

**Visualización paso a paso**

Supongamos que tenemos la lista \([5, 3, 8, 6, 2]\) y queremos ordenarla de manera ascendente:

1. **Primera iteración**:

   - Compara \(5\) y \(3\): intercambia. Lista: \([3, 5, 8, 6, 2]\).
   - Compara \(5\) y \(8\): no intercambia. Lista: \([3, 5, 8, 6, 2]\).
   - Compara \(8\) y \(6\): intercambia. Lista: \([3, 5, 6, 8, 2]\).
   - Compara \(8\) y \(2\): intercambia. Lista: \([3, 5, 6, 2, 8]\).

2. **Segunda iteración**:

   - Compara \(3\) y \(5\): no intercambia. Lista: \([3, 5, 6, 2, 8]\).
   - Compara \(5\) y \(6\): no intercambia. Lista: \([3, 5, 6, 2, 8]\).
   - Compara \(6\) y \(2\): intercambia. Lista: \([3, 5, 2, 6, 8]\).

3. **Tercera iteración**:

   - Compara \(3\) y \(5\): no intercambia. Lista: \([3, 5, 2, 6, 8]\).
   - Compara \(5\) y \(2\): intercambia. Lista: \([3, 2, 5, 6, 8]\).

4. **Cuarta iteración**:
   - Compara \(3\) y \(2\): intercambia. Lista: \([2, 3, 5, 6, 8]\).

La lista ya está ordenada después de cuatro pasadas.

---

**Pseudocódigo del algoritmo**

```plaintext
Para i desde 0 hasta n-1:
    Para j desde 0 hasta n-i-2:
        Si lista[j] > lista[j+1]:
            Intercambiar lista[j] y lista[j+1]
```

---

**Implementaciones**

**Python**

```python
def burbuja(lista):
    n = len(lista)
    for i in range(n):
        for j in range(0, n - i - 1):
            if lista[j] > lista[j + 1]:
                # Intercambia los elementos
                lista[j], lista[j + 1] = lista[j + 1], lista[j]

# Ejemplo
numeros = [5, 3, 8, 6, 2]
burbuja(numeros)
print(numeros)  # Salida: [2, 3, 5, 6, 8]
```

**Java**

```java
public class Burbuja {
    public static void burbuja(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    // Intercambia los elementos
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 6, 2};
        burbuja(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");  // Salida: 2 3 5 6 8
        }
    }
}
```

**JavaScript**

```javascript
function burbuja(lista) {
  let n = lista.length;
  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n - i - 1; j++) {
      if (lista[j] > lista[j + 1]) {
        // Intercambia los elementos
        [lista[j], lista[j + 1]] = [lista[j + 1], lista[j]];
      }
    }
  }
}

// Ejemplo
const numeros = [5, 3, 8, 6, 2];
burbuja(numeros);
console.log(numeros); // Salida: [2, 3, 5, 6, 8]
```

---

**Complejidad del algoritmo**

1. **Tiempo**:

   - Peor caso (lista desordenada): \( O(n^2) \)
   - Mejor caso (lista ya ordenada): \( O(n) \) si se optimiza para detectar la ausencia de intercambios.
   - Caso promedio: \( O(n^2) \).

2. **Espacio**:
   - \( O(1) \), ya que el algoritmo no requiere espacio adicional significativo (es _in-place_).

---

**Ventajas y desventajas**

**Ventajas**:

- Sencillo de implementar y entender.
- Adecuado para listas pequeñas.

**Desventajas**:

- Muy ineficiente para listas grandes debido a su complejidad \( O(n^2) \).
- Realiza intercambios innecesarios incluso si la lista ya está casi ordenada.

---

**Conclusión**

El ordenamiento por burbuja es un algoritmo educativo, ideal para aprender sobre ordenamiento. Sin embargo, en aplicaciones prácticas, algoritmos más eficientes como **quicksort** o **mergesort** son preferibles.

### ¿Qué características lo hacen menos eficiente en comparación con otros algoritmos de ordenamiento? ¿En qué casos podría ser útil este algoritmo?

**Características que hacen menos eficiente al ordenamiento por burbuja**

1. **Alta cantidad de comparaciones e intercambios**:

   - En cada iteración, el algoritmo compara todos los pares adyacentes en el rango restante de la lista, lo que implica muchas operaciones innecesarias, incluso cuando la lista ya está casi ordenada.

2. **Complejidad de tiempo \( O(n^2) \)**:

   - En el peor caso (lista completamente desordenada), el número de comparaciones e intercambios crece cuadráticamente con el tamaño de la lista (\( n \times (n-1) / 2 \)).

3. **No aprovecha listas parcialmente ordenadas**:

   - Aunque hay optimizaciones (como detener el algoritmo si no hay intercambios en una pasada), sigue siendo mucho menos eficiente que otros algoritmos como **insertion sort**, que puede ordenar listas parcialmente ordenadas más rápidamente.

4. **Falta de división y conquista**:

   - Algoritmos como **quicksort** o **mergesort** dividen el problema en subproblemas más pequeños, lo que permite alcanzar una complejidad \( O(n \log n) \), mientras que el ordenamiento por burbuja procesa siempre la lista completa.

5. **Uso excesivo de intercambios**:
   - Los intercambios implican varias operaciones (lectura y escritura de memoria), lo que puede ser más costoso que simples asignaciones, afectando el rendimiento en comparación con algoritmos más eficientes.

---

**Casos en los que el ordenamiento por burbuja podría ser útil**

1. **Listas pequeñas**:

   - Para listas con pocos elementos, el impacto de la ineficiencia es despreciable, y la simplicidad del algoritmo puede hacerlo atractivo.

2. **Introducción a algoritmos de ordenamiento**:

   - Por su lógica simple y su fácil visualización paso a paso, el ordenamiento por burbuja es ideal para enseñar los conceptos básicos de algoritmos de ordenamiento.

3. **Cuando no importa el rendimiento**:

   - Si el tamaño de los datos es reducido y el tiempo de ejecución no es crítico, se puede usar por simplicidad.

4. **Listas casi ordenadas**:

   - Con la optimización que detiene el algoritmo si no hay intercambios en una pasada, el ordenamiento por burbuja puede ser razonable para listas que están mayormente ordenadas.

5. **Ambientes con restricciones específicas**:
   - Si se trabaja en un entorno donde la implementación debe ser extremadamente simple y no hay recursos para implementar algoritmos más avanzados.

---

**Comparación con algoritmos más eficientes**

| **Criterio**            | **Burbuja**             | **Insertion Sort**               | **Merge Sort**                | **Quick Sort**                |
| ----------------------- | ----------------------- | -------------------------------- | ----------------------------- | ----------------------------- |
| **Complejidad (peor)**  | \( O(n^2) \)            | \( O(n^2) \)                     | \( O(n \log n) \)             | \( O(n^2) \)                  |
| **Complejidad (mejor)** | \( O(n) \) (optimizado) | \( O(n) \)                       | \( O(n \log n) \)             | \( O(n \log n) \)             |
| **Estrategia**          | Comparación directa     | Comparación e inserción          | División y conquista          | División y conquista          |
| **Uso típico**          | Enseñanza básica        | Listas pequeñas o casi ordenadas | Listas grandes y desordenadas | Listas grandes y desordenadas |

---

**Conclusión**

El ordenamiento por burbuja es un algoritmo **simple pero ineficiente** en comparación con alternativas modernas. Es útil en escenarios limitados (listas pequeñas o para aprendizaje), pero generalmente no es la mejor opción para problemas de ordenamiento en el mundo real. Algoritmos como **quicksort**, **mergesort** o **heapsort** son preferibles para datos más grandes o en aplicaciones prácticas.

**Ordenamiento por Selección (Selection Sort)**

### ¿Cómo se selecciona el elemento más pequeño en cada iteración del algoritmo de selección?

El **algoritmo de ordenamiento por selección** funciona seleccionando el elemento más pequeño (o el más grande, dependiendo del orden deseado) de la lista no ordenada en cada iteración y colocándolo en su posición final en la lista ordenada. Aquí te detallo cómo se realiza esta selección:

---

**Pasos para seleccionar el elemento más pequeño en una iteración**

1. **Iniciar desde el primer elemento no ordenado**:

   - Establece el primer elemento del segmento no ordenado como el "mínimo" actual.
   - Este elemento será comparado con los demás para encontrar el valor más pequeño.

2. **Recorrer el resto de la lista**:

   - Itera a través de los elementos restantes en la lista no ordenada.
   - Compara cada elemento con el valor del "mínimo" actual:
     - Si el elemento actual es menor que el "mínimo", actualiza el índice del "mínimo" con la posición del elemento actual.

3. **Identificar el índice del menor elemento**:

   - Al finalizar la iteración, tendrás el índice del menor elemento en el segmento no ordenado.

4. **Intercambiar elementos**:
   - Intercambia el elemento más pequeño encontrado con el primer elemento del segmento no ordenado.

---

**Ejemplo paso a paso**

Supongamos que queremos ordenar la lista \([5, 3, 8, 6, 2]\) en orden ascendente:

**Iteración 1**:

- Lista no ordenada: \([5, 3, 8, 6, 2]\).
- Inicialmente, \(5\) es el "mínimo".
- Comparaciones:
  - \(5 > 3\), actualiza el "mínimo" a \(3\).
  - \(3 < 8\), el "mínimo" sigue siendo \(3\).
  - \(3 < 6\), el "mínimo" sigue siendo \(3\).
  - \(3 > 2\), actualiza el "mínimo" a \(2\).
- El índice del menor elemento es \(4\).
- Intercambia \(2\) con el primer elemento (\(5\)).
- Lista después del intercambio: \([2, 3, 8, 6, 5]\).

**Iteración 2**:

- Lista no ordenada: \([3, 8, 6, 5]\).
- Inicialmente, \(3\) es el "mínimo".
- Comparaciones:
  - \(3 < 8\), el "mínimo" sigue siendo \(3\).
  - \(3 < 6\), el "mínimo" sigue siendo \(3\).
  - \(3 < 5\), el "mínimo" sigue siendo \(3\).
- No hay necesidad de intercambiar, la lista sigue igual: \([2, 3, 8, 6, 5]\).

**Iteración 3**:

- Lista no ordenada: \([8, 6, 5]\).
- Inicialmente, \(8\) es el "mínimo".
- Comparaciones:
  - \(8 > 6\), actualiza el "mínimo" a \(6\).
  - \(6 > 5\), actualiza el "mínimo" a \(5\).
- El índice del menor elemento es \(4\).
- Intercambia \(5\) con el primer elemento del segmento (\(8\)).
- Lista después del intercambio: \([2, 3, 5, 6, 8]\).

**Iteraciones 4 y 5**:

- Los elementos restantes (\(6, 8\)) ya están ordenados.

---

**Pseudocódigo del algoritmo**

```plaintext
Para i desde 0 hasta n-1:
    índice_mínimo = i
    Para j desde i+1 hasta n:
        Si lista[j] < lista[índice_mínimo]:
            índice_mínimo = j
    Intercambiar lista[i] con lista[índice_mínimo]
```

---

**Implementaciones**

**Python**

```python
def seleccion(lista):
    n = len(lista)
    for i in range(n):
        # Encontrar el índice del menor elemento
        indice_min = i
        for j in range(i + 1, n):
            if lista[j] < lista[indice_min]:
                indice_min = j
        # Intercambiar el menor elemento con el actual
        lista[i], lista[indice_min] = lista[indice_min], lista[i]

# Ejemplo
numeros = [5, 3, 8, 6, 2]
seleccion(numeros)
print(numeros)  # Salida: [2, 3, 5, 6, 8]
```

**Java**

```java
public class Seleccion {
    public static void seleccion(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del menor elemento
            int indiceMin = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[indiceMin]) {
                    indiceMin = j;
                }
            }
            // Intercambiar el menor elemento con el actual
            int temp = lista[i];
            lista[i] = lista[indiceMin];
            lista[indiceMin] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 6, 2};
        seleccion(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");  // Salida: 2 3 5 6 8
        }
    }
}
```

**JavaScript**

```javascript
function seleccion(lista) {
  let n = lista.length;
  for (let i = 0; i < n - 1; i++) {
    // Encontrar el índice del menor elemento
    let indiceMin = i;
    for (let j = i + 1; j < n; j++) {
      if (lista[j] < lista[indiceMin]) {
        indiceMin = j;
      }
    }
    // Intercambiar el menor elemento con el actual
    [lista[i], lista[indiceMin]] = [lista[indiceMin], lista[i]];
  }
}

// Ejemplo
const numeros = [5, 3, 8, 6, 2];
seleccion(numeros);
console.log(numeros); // Salida: [2, 3, 5, 6, 8]
```

---

**Conclusión**

El proceso para seleccionar el elemento más pequeño en el algoritmo de selección es **buscar linealmente dentro del segmento no ordenado** y registrar su índice. Aunque el algoritmo tiene una complejidad \( O(n^2) \), su simplicidad lo hace adecuado para listas pequeñas o aplicaciones donde el tiempo de ejecución no es crítico. Sin embargo, para listas más grandes, se prefieren algoritmos más eficientes como **quicksort** o **mergesort**.

### Explica las diferencias entre el ordenamiento por selección y el ordenamiento por burbuja.

El **ordenamiento por selección** y el **ordenamiento por burbuja** son dos algoritmos básicos de ordenamiento. Ambos tienen una complejidad de tiempo \( O(n^2) \) en el peor y promedio de los casos, pero difieren en cómo realizan el proceso de ordenamiento:

---

**Diferencias principales**

| **Característica**               | **Ordenamiento por selección**                                                                    | **Ordenamiento por burbuja**                                                                                           |
| -------------------------------- | ------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| **Estrategia**                   | Encuentra el elemento más pequeño (o grande) y lo coloca en su posición final en cada iteración.  | Recorre la lista repetidamente y va intercambiando elementos adyacentes si están en el orden incorrecto.               |
| **Número de intercambios**       | Mínimo: \( n-1 \). Solo intercambia cuando encuentra el menor elemento de la sección no ordenada. | Potencialmente alto: puede realizar múltiples intercambios en cada pasada.                                             |
| **Comparaciones por iteración**  | Compara todos los elementos restantes de la lista no ordenada para encontrar el mínimo/máximo.    | Compara cada par de elementos adyacentes en cada pasada, incluso si ya están ordenados.                                |
| **Eficiencia general**           | Menos intercambios lo hacen más eficiente en términos de escritura/movimientos de memoria.        | Más intercambios pueden hacerlo más lento, especialmente en estructuras de datos que penalizan movimientos frecuentes. |
| **Óptimo para listas ordenadas** | No se beneficia significativamente de listas parcialmente ordenadas.                              | Puede optimizarse para detenerse si no hay intercambios en una pasada, siendo más eficiente en listas casi ordenadas.  |
| **Facilidad de implementación**  | Ligeramente más complejo debido a la necesidad de encontrar y manejar el índice mínimo/máximo.    | Muy simple de implementar, especialmente sin optimizaciones.                                                           |
| **Ordenación estable**           | No es estable (puede alterar el orden relativo de elementos iguales).                             | Puede ser estable si se implementa cuidadosamente.                                                                     |

---

**Ejemplo de diferencias en comportamiento**

**Lista inicial:** \([5, 3, 8, 6, 2]\)

**Ordenamiento por selección:**

1. Encuentra el menor elemento (\(2\)) y lo intercambia con el primer elemento.
   - Resultado: \([2, 3, 8, 6, 5]\).
2. Encuentra el siguiente menor (\(3\)) y lo deja en su posición.
   - Resultado: \([2, 3, 8, 6, 5]\).
3. Encuentra el siguiente menor (\(5\)) y lo intercambia.
   - Resultado: \([2, 3, 5, 6, 8]\).
4. Finaliza después de colocar el resto en su lugar.

**Ordenamiento por burbuja:**

1. Recorre toda la lista, intercambiando pares adyacentes si están desordenados:
   - Resultado tras la primera pasada: \([3, 5, 6, 2, 8]\).
2. En la segunda pasada, repite el proceso, desplazando el segundo elemento más grande al final:
   - Resultado: \([3, 5, 2, 6, 8]\).
3. Continúa hasta que toda la lista esté ordenada:
   - Resultado final: \([2, 3, 5, 6, 8]\).

---

**Ventajas y desventajas**

| **Ordenamiento por selección**                                          | **Ordenamiento por burbuja**                                 |
| ----------------------------------------------------------------------- | ------------------------------------------------------------ |
| **Ventajas:**                                                           | **Ventajas:**                                                |
| - Menos movimientos de elementos.                                       | - Simple y fácil de implementar.                             |
| - Predecible en el número de pasos.                                     | - Puede optimizarse para listas ordenadas.                   |
| **Desventajas:**                                                        | **Desventajas:**                                             |
| - Comparaciones innecesarias incluso con listas parcialmente ordenadas. | - Realiza muchos intercambios, lo que puede ser ineficiente. |
| - No es estable sin modificaciones.                                     | - Menos eficiente en listas largas.                          |

---

**Cuándo usar uno u otro**

- **Ordenamiento por selección**:

  - Es más adecuado cuando los intercambios de elementos son costosos (por ejemplo, en sistemas con restricciones de memoria o dispositivos de almacenamiento lento).
  - Es útil para listas pequeñas donde la estabilidad no es un requisito.

- **Ordenamiento por burbuja**:
  - Es útil para enseñar conceptos básicos de ordenamiento debido a su simplicidad.
  - Puede ser una opción si se optimiza para listas que ya están parcialmente ordenadas.

---

**Conclusión**
El **ordenamiento por selección** tiende a ser más eficiente en términos de movimientos de datos, mientras que el **ordenamiento por burbuja** puede ser más comprensible y optimizable en escenarios específicos. Sin embargo, ambos algoritmos son menos eficientes que algoritmos más avanzados como **quicksort**, **mergesort** o **heapsort**, y se utilizan principalmente para propósitos educativos o listas pequeñas.

### ¿Qué complejidad temporal tiene este algoritmo (Selection Sort)?

El algoritmo de **ordenamiento por selección (Selection Sort)** tiene una complejidad temporal de \(O(n^2)\) en todos los casos (mejor, peor y promedio). Esto se debe a su estructura y forma de funcionamiento, que involucra dos bucles anidados:

---

**1. Desglose de la complejidad temporal**

El algoritmo realiza dos tareas principales:

1. **Comparaciones**:

   - Para cada elemento de la lista, el algoritmo busca el mínimo elemento en la sección no ordenada.
   - Esto implica recorrer los elementos restantes de la lista.
   - El número de comparaciones disminuye con cada iteración:
     - Primera iteración: \(n - 1\) comparaciones.
     - Segunda iteración: \(n - 2\) comparaciones.
     - ...
     - Última iteración: \(1\) comparación.
   - Total de comparaciones:  
     \[
     (n-1) + (n-2) + \dots + 1 = \frac{n(n-1)}{2}
     \]
     Esto equivale a \(O(n^2)\) para grandes valores de \(n\).

2. **Intercambios**:
   - Se realiza **un intercambio por cada iteración del bucle externo**, independientemente de la posición del mínimo.
   - En total, se ejecutan \(n-1\) intercambios, lo que es lineal: \(O(n)\).

Aunque el número de intercambios es más bajo en comparación con otros algoritmos como el **ordenamiento por burbuja**, las comparaciones dominan la complejidad temporal global.

---

**2. Complejidad en distintos casos**

| **Caso**          | **Complejidad temporal** | **Explicación**                                                                        |
| ----------------- | ------------------------ | -------------------------------------------------------------------------------------- |
| **Mejor caso**    | \(O(n^2)\)               | Aunque la lista ya esté ordenada, el algoritmo aún busca el mínimo en cada iteración.  |
| **Caso promedio** | \(O(n^2)\)               | El algoritmo realiza la misma cantidad de comparaciones sin importar el orden inicial. |
| **Peor caso**     | \(O(n^2)\)               | Incluso si la lista está en el orden inverso, el algoritmo sigue buscando el mínimo.   |

---

**3. Comparación con otros algoritmos**

| **Algoritmo**      | **Complejidad (Mejor caso)**   | **Complejidad (Promedio)** | **Complejidad (Peor caso)** |
| ------------------ | ------------------------------ | -------------------------- | --------------------------- |
| **Selection Sort** | \(O(n^2)\)                     | \(O(n^2)\)                 | \(O(n^2)\)                  |
| **Bubble Sort**    | \(O(n)\) (optimizado)          | \(O(n^2)\)                 | \(O(n^2)\)                  |
| **Insertion Sort** | \(O(n)\) (lista casi ordenada) | \(O(n^2)\)                 | \(O(n^2)\)                  |
| **Merge Sort**     | \(O(n \log n)\)                | \(O(n \log n)\)            | \(O(n \log n)\)             |
| **Quick Sort**     | \(O(n \log n)\)                | \(O(n \log n)\)            | \(O(n^2)\) (desbalanceado)  |
| **Heap Sort**      | \(O(n \log n)\)                | \(O(n \log n)\)            | \(O(n \log n)\)             |

---

**4. Conclusión**

El **Selection Sort** tiene una complejidad temporal constante de \(O(n^2)\) en todos los casos porque realiza siempre el mismo número de comparaciones, independientemente del estado inicial de la lista. Esto lo hace menos eficiente que otros algoritmos avanzados, como **Merge Sort** o **Quick Sort**, pero su simplicidad y bajo número de intercambios lo convierten en una opción viable para listas pequeñas o cuando el costo de mover datos es un factor determinante.

**Ordenamiento por Inserción (Insertion Sort)**

### ¿Cómo funciona el algoritmo de ordenamiento por inserción?

El **algoritmo de ordenamiento por inserción (Insertion Sort)** es un algoritmo de ordenamiento simple y eficiente para listas pequeñas o casi ordenadas. Su funcionamiento es similar a la manera en que muchas personas ordenan una baraja de cartas: van tomando una carta y la colocan en su lugar correcto entre las cartas que ya tienen ordenadas.

**Funcionamiento del algoritmo**

1. **Inicio**:

   - El algoritmo empieza considerando que el primer elemento de la lista ya está ordenado. Luego, va tomando los elementos sucesivos y los inserta en su lugar correcto dentro de la parte ordenada de la lista.

2. **Iteración**:

   - En cada iteración, el algoritmo toma un **elemento no ordenado** (el siguiente elemento en la lista) y lo compara con los elementos ya ordenados, uno a uno, desde la derecha hacia la izquierda.
   - **Desplazamiento**: Si el elemento es menor que el elemento a la izquierda, el elemento a la izquierda se desplaza una posición a la derecha.
   - Este proceso se repite hasta que encontramos el lugar correcto para el elemento.

3. **Inserción**:

   - Cuando se encuentra la posición adecuada (donde el elemento no es menor que el de la izquierda), el **elemento se inserta** en esa posición.

4. **Repetición**:
   - El algoritmo repite este proceso con el siguiente elemento no ordenado hasta que toda la lista esté ordenada.

**Ejemplo**

Supongamos que queremos ordenar la lista: \([5, 3, 8, 6, 2]\).

**Paso a paso**:

1. **Inicio**: El primer elemento (\(5\)) ya está ordenado.

   - Lista: \([5, 3, 8, 6, 2]\)

2. **Iteración 1**: Toma el siguiente elemento (\(3\)).

   - Compara con \(5\): \(3 < 5\), desplaza \(5\) a la derecha.
   - Inserta \(3\) en la primera posición.
   - Lista: \([3, 5, 8, 6, 2]\)

3. **Iteración 2**: Toma el siguiente elemento (\(8\)).

   - Compara con \(5\): \(8 > 5\), no se hace nada.
   - Lista sigue igual: \([3, 5, 8, 6, 2]\)

4. **Iteración 3**: Toma el siguiente elemento (\(6\)).

   - Compara con \(8\): \(6 < 8\), desplaza \(8\) a la derecha.
   - Compara con \(5\): \(6 > 5\), inserta \(6\) en la posición de \(8\).
   - Lista: \([3, 5, 6, 8, 2]\)

5. **Iteración 4**: Toma el siguiente elemento (\(2\)).
   - Compara con \(8\): \(2 < 8\), desplaza \(8\) a la derecha.
   - Compara con \(6\): \(2 < 6\), desplaza \(6\) a la derecha.
   - Compara con \(5\): \(2 < 5\), desplaza \(5\) a la derecha.
   - Compara con \(3\): \(2 < 3\), desplaza \(3\) a la derecha.
   - Inserta \(2\) en la primera posición.
   - Lista: \([2, 3, 5, 6, 8]\)

Ahora, la lista está completamente ordenada.

---

**Pseudocódigo**

```plaintext
Para i desde 1 hasta n-1:
    clave = lista[i]
    j = i - 1
    Mientras j >= 0 y lista[j] > clave:
        lista[j + 1] = lista[j]
        j = j - 1
    lista[j + 1] = clave
```

**Análisis de la complejidad temporal**

| **Caso**          | **Complejidad temporal** | **Explicación**                                                                                                                |
| ----------------- | ------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| **Mejor caso**    | \(O(n)\)                 | Ocurre cuando la lista ya está ordenada, solo se realizan comparaciones.                                                       |
| **Caso promedio** | \(O(n^2)\)               | El algoritmo realiza comparaciones y desplazamientos, con un número creciente de operaciones a medida que se recorre la lista. |
| **Peor caso**     | \(O(n^2)\)               | Ocurre cuando la lista está ordenada en orden inverso, lo que lleva a la mayor cantidad de desplazamientos.                    |

---

**Ventajas del ordenamiento por inserción**

- **Simplicidad**: Es fácil de entender y de implementar.
- **Eficiencia en listas pequeñas**: Es muy eficiente cuando la lista está casi ordenada o es pequeña.
- **Ordenamiento en el lugar**: No requiere memoria adicional, ya que ordena la lista directamente.
- **Estabilidad**: Es un algoritmo estable, lo que significa que no cambia el orden relativo de los elementos iguales.

**Desventajas**

- **Ineficiencia en listas grandes**: Para listas grandes, el algoritmo es muy ineficiente porque tiene una complejidad cuadrática (\(O(n^2)\)).
- **Desplazamientos frecuentes**: Requiere varios desplazamientos de elementos en cada iteración, lo que puede ser costoso en términos de tiempo.

---

**Conclusión**
El **ordenamiento por inserción** es un algoritmo eficiente para listas pequeñas o casi ordenadas, y es fácil de implementar. Sin embargo, para listas grandes y desordenadas, su rendimiento es deficiente en comparación con algoritmos más avanzados como **merge sort** o **quick sort**.

### ¿Qué lo hace eficiente para conjuntos de datos pequeños o casi ordenados?

El **ordenamiento por inserción** es eficiente para conjuntos de datos pequeños o casi ordenados porque realiza pocas comparaciones y desplazamientos. En el caso de listas pequeñas, el costo de las iteraciones es bajo, lo que lo hace rápido. Además, si la lista ya está casi ordenada, el algoritmo apenas realiza movimientos, ya que solo desplaza elementos cuando son más grandes que el siguiente, lo que mejora significativamente su rendimiento. Su complejidad en el mejor caso es \(O(n)\), ya que solo realiza comparaciones sin desplazamientos, lo que lo hace muy eficiente en estos escenarios.

### ¿Qué diferencia principal tiene (el ordenamiento por inserción) con el ordenamiento por selección?

La **diferencia principal** entre el **ordenamiento por inserción** y el **ordenamiento por selección** radica en la forma en que manejan los elementos durante el proceso de ordenamiento y en el número de intercambios que realizan:

**1. Estrategia de ordenamiento**

- **Ordenamiento por inserción**:

  - Toma un **elemento no ordenado** en cada iteración y lo inserta en su **posición correcta** dentro de la sección ya ordenada de la lista.
  - **Desplaza** los elementos mayores hacia la derecha hasta encontrar la posición correcta para el nuevo elemento.
  - Es como ir construyendo gradualmente una lista ordenada desde el principio, al ir insertando elementos uno por uno en su lugar adecuado.

- **Ordenamiento por selección**:
  - En cada iteración, **busca el elemento más pequeño** (o más grande) en la parte no ordenada de la lista y lo **intercambia** con el primer elemento no ordenado.
  - El proceso es similar a seleccionar el "mínimo" o "máximo" y colocarlo en su posición final en la lista de manera directa.

**2. Número de intercambios**

- **Ordenamiento por inserción**:

  - **Mínimo número de intercambios**: solo realiza un intercambio (si es necesario) para insertar el elemento en la posición correcta.
  - El número de intercambios depende de cuántos desplazamientos se necesiten para colocar el elemento en su lugar.

- **Ordenamiento por selección**:
  - Realiza **exactamente un intercambio por iteración**, incluso si el elemento ya está en la posición correcta (esto es menos eficiente cuando los elementos ya están ordenados o casi ordenados).

**3. Comparaciones**

- **Ordenamiento por inserción**:

  - Compara el nuevo elemento con los elementos ya ordenados, desplazando aquellos que son mayores. La cantidad de comparaciones depende de cuán ordenada esté la lista.
  - Si la lista está casi ordenada, las comparaciones y desplazamientos son menores, lo que lo hace más eficiente en listas parcialmente ordenadas.

- **Ordenamiento por selección**:
  - Siempre realiza \(n-1\), \(n-2\), ..., comparaciones en cada iteración, sin importar si la lista ya está parcialmente ordenada. Es decir, siempre realiza el mismo número de comparaciones, incluso si los elementos ya están cerca de estar ordenados.

**4. Estabilidad**

- **Ordenamiento por inserción**: Es **estable**, es decir, no cambia el orden relativo de los elementos iguales.
- **Ordenamiento por selección**: **No es estable**, ya que puede cambiar el orden relativo de los elementos iguales al hacer el intercambio entre elementos.

**5. Complejidad temporal**
Ambos algoritmos tienen una complejidad de \(O(n^2)\) en el peor caso, pero el **ordenamiento por inserción** tiende a ser más eficiente en listas parcialmente ordenadas, ya que realiza menos comparaciones y desplazamientos.

| **Características**                     | **Ordenamiento por inserción**                                                    | **Ordenamiento por selección**                     |
| --------------------------------------- | --------------------------------------------------------------------------------- | -------------------------------------------------- |
| **Estrategia**                          | Inserta el elemento en su posición correcta.                                      | Selecciona el mínimo y lo coloca en su lugar.      |
| **Intercambios**                        | Realiza pocos intercambios, solo uno por elemento.                                | Siempre realiza un intercambio por iteración.      |
| **Comparaciones**                       | Depende del orden de la lista. Menos comparaciones si está parcialmente ordenada. | Siempre realiza \(n-1, n-2, \dots\) comparaciones. |
| **Estabilidad**                         | Es estable.                                                                       | No es estable.                                     |
| **Complejidad temporal (peor caso)**    | \(O(n^2)\)                                                                        | \(O(n^2)\)                                         |
| **Eficiencia en listas casi ordenadas** | Más eficiente.                                                                    | Menos eficiente.                                   |

---

### **Resumen**

- **Ordenamiento por inserción** es más eficiente para listas pequeñas o casi ordenadas, ya que realiza menos intercambios y su número de comparaciones es menor en listas parcialmente ordenadas.
- **Ordenamiento por selección** siempre realiza el mismo número de comparaciones y hace un intercambio por iteración, lo que lo hace menos eficiente que el de inserción en muchas situaciones. Además, no es un algoritmo estable.

**Quicksort**

### Explica los pasos básicos del algoritmo Quicksort.

El algoritmo **Quicksort** es un algoritmo de ordenamiento eficiente basado en la técnica de **divide y vencerás**. Su idea principal es dividir la lista en sublistas más pequeñas y ordenarlas recursivamente.

**1. Selección de un pivote**

- Se selecciona un **elemento llamado pivote** de la lista. Este pivote puede ser elegido de diferentes maneras (por ejemplo, el primer elemento, el último, el elemento central, o un valor aleatorio).
- La elección del pivote es crucial para el rendimiento del algoritmo. Si el pivote divide la lista de manera balanceada, el algoritmo será más eficiente.

**2. Partición (División)**

- El objetivo de la partición es reorganizar la lista para que todos los elementos **menores que el pivote** estén a su izquierda, y todos los elementos **mayores que el pivote** estén a su derecha.
- Después de este paso, el pivote estará en su **posición final** en la lista ordenada.
- Este proceso se realiza de manera eficiente con dos punteros (índices) que recorren la lista. Un puntero avanza hacia la derecha buscando un elemento mayor que el pivote, y el otro avanza hacia la izquierda buscando un elemento menor. Luego, intercambian los elementos si es necesario.

**3. Recursión**

- Después de la partición, el algoritmo aplica el mismo proceso recursivamente a las dos sublistas: la parte izquierda del pivote y la parte derecha.
- Cada sublista se ordena de manera independiente de la misma forma (seleccionando un nuevo pivote, particionando y luego recursivamente ordenando las sublistas).
- Este proceso continúa hasta que todas las sublistas tengan un solo elemento o estén vacías, lo que significa que la lista está completamente ordenada.

**4. Finalización**

- El algoritmo termina cuando las sublistas son lo suficientemente pequeñas como para ser consideradas ordenadas, lo que generalmente ocurre cuando cada sublista tiene un solo elemento.

---

**Pseudocódigo de Quicksort**

```plaintext
función Quicksort(lista):
    si longitud(lista) <= 1:
        devolver lista
    pivote = lista[longitud(lista) // 2]
    izquierda = [x para x en lista si x < pivote]
    derecha = [x para x en lista si x > pivote]
    devolver Quicksort(izquierda) + [pivote] + Quicksort(derecha)
```

**Ejemplo de funcionamiento**

Supongamos que tenemos la lista \([3, 6, 8, 10, 1, 2, 1]\).

1. **Seleccionamos un pivote**. Supongamos que elegimos el último elemento, \(1\).
2. **Partición**:
   - Reorganizamos la lista de modo que todos los elementos menores que \(1\) estén a su izquierda y los mayores a su derecha.
   - Resultado de la partición: \([0, 2, 1, 10, 3, 6, 8, 5]\).
   - El \(1\) se coloca en su posición final.
3. **Recursión**:
   - Aplicamos Quicksort de manera recursiva a la parte izquierda y derecha de la lista.

### **Análisis de complejidad temporal**

La **complejidad temporal** de Quicksort depende de cómo se seleccionen los pivotes.

- **Caso promedio**: \(O(n \log n)\), lo que ocurre cuando los pivotes dividen la lista de manera balanceada en cada paso.
- **Peor caso**: \(O(n^2)\), lo que ocurre cuando el pivote seleccionado es el menor o el mayor elemento en cada partición, es decir, la lista se divide de manera desequilibrada. Este caso es raro, pero puede ocurrir si el pivote se selecciona mal.
- **Mejor caso**: \(O(n \log n)\), cuando la lista se divide de manera balanceada.

En la práctica, Quicksort es muy eficiente, especialmente con buenas estrategias para elegir el pivote, como el **pivote aleatorio** o el **pivote de mediana**.

---

**Ventajas de Quicksort**

- **Eficiencia**: Es generalmente más rápido que otros algoritmos de ordenamiento como **Selection Sort** o **Bubble Sort**, con una complejidad temporal promedio de \(O(n \log n)\).
- **Divide y vencerás**: La recursividad permite dividir y resolver problemas más pequeños.
- **In-place**: Quicksort es un algoritmo de ordenamiento **in-place**, lo que significa que no requiere memoria adicional para realizar el ordenamiento (solo se necesita espacio para las llamadas recursivas).

**Desventajas de Quicksort**

- **Peor caso**: Si los pivotes se eligen mal, puede caer en el peor caso \(O(n^2)\). Sin embargo, este caso se puede minimizar con una selección adecuada del pivote.
- **Recursión**: Al ser recursivo, Quicksort puede consumir más memoria si la lista es muy grande, aunque esto se puede manejar con optimizaciones.

### **Conclusión**

Quicksort es uno de los algoritmos más eficientes y populares para el ordenamiento de listas debido a su velocidad en la mayoría de los casos y su bajo consumo de memoria. Sin embargo, requiere una buena selección de pivote para evitar el peor caso.

### ¿Por qué se considera uno de los algoritmos más eficientes para grandes conjuntos de datos?

Quicksort se considera uno de los algoritmos más eficientes para grandes conjuntos de datos debido a su **complejidad temporal promedio de \(O(n \log n)\)**, lo que lo hace mucho más rápido que algoritmos como **Selection Sort** o **Bubble Sort**, que tienen una complejidad de \(O(n^2)\). Además, Quicksort es un algoritmo **in-place**, lo que significa que no requiere memoria adicional significativa. Su eficiencia se debe a la técnica de **divide y vencerás**, que divide el problema en subproblemas más pequeños, resolviendo cada uno de manera independiente y recursiva. Aunque el peor caso es \(O(n^2)\), se pueden aplicar estrategias como la **elección aleatoria de pivote** para minimizar esta posibilidad, lo que hace que, en la práctica, Quicksort sea muy rápido para listas grandes.

**Mergesort**

### ¿Cómo se divide y combina un conjunto de datos en Mergesort?

El algoritmo de **Mergesort** es un algoritmo de ordenamiento basado en la técnica de **divide y vencerás**. Su enfoque consiste en dividir un conjunto de datos en partes más pequeñas, ordenarlas de manera recursiva y luego combinarlas (fusionarlas) para obtener el resultado final ordenado.

**1. División (Divide)**

La fase de **división** consiste en dividir el conjunto de datos en dos mitades aproximadamente iguales. Este proceso se repite recursivamente en cada mitad hasta que se obtienen sublistas de tamaño 1.

- **Paso inicial**: Se toma el conjunto completo de datos.
- **Recursión**: Se divide el conjunto de datos en dos sublistas, la mitad izquierda y la mitad derecha.
- **Subdivisión**: Cada una de esas sublistas se divide a su vez en dos, repitiendo el proceso hasta que cada sublista tenga solo un elemento (que se considera ordenada por sí misma).

**2. Combinación (Merge)**

Una vez que el conjunto de datos está completamente dividido en sublistas de un solo elemento, se procede a la fase de **combinación**, que consiste en fusionar las sublistas ordenadas en una lista más grande y ordenada.

- **Paso inicial**: Se fusionan dos sublistas ordenadas en una nueva lista ordenada.
- **Fusión**: Para fusionar dos sublistas, se comparan los elementos de ambas sublistas. El elemento más pequeño de las dos sublistas se coloca primero en la nueva lista ordenada, y luego se repite el proceso hasta que todas las sublistas se hayan combinado en una lista completamente ordenada.

**Visualización del proceso**

Supongamos que tenemos la lista \([38, 27, 43, 3, 9, 82, 10]\) que queremos ordenar con **Mergesort**.

#### **División**:

1. Divide la lista en dos sublistas:
   \[
   [38, 27, 43, 3] \quad \text{y} \quad [9, 82, 10]
   \]
2. Divide cada sublista en dos:
   \[
   [38, 27] \quad [43, 3] \quad [9, 82] \quad [10]
   \]
3. Divide las sublistas aún más:
   \[
   [38] \quad [27] \quad [43] \quad [3] \quad [9] \quad [82] \quad [10]
   \]

En este punto, cada sublista tiene un solo elemento, que está considerado como ordenado.

**Combinación**:

1. **Fusionamos las sublistas de un solo elemento**:
   - Fusionamos \([38]\) y \([27]\) en \([27, 38]\).
   - Fusionamos \([43]\) y \([3]\) en \([3, 43]\).
   - \([9]\), \([82]\) y \([10]\) permanecen como están, pero se fusionarán en el siguiente paso.
2. **Fusionamos las sublistas ordenadas**:
   - Fusionamos \([27, 38]\) y \([3, 43]\) en \([3, 27, 38, 43]\).
   - Fusionamos \([9]\), \([82]\) y \([10]\) en \([9, 10, 82]\).
3. **Finalmente, fusionamos las sublistas más grandes**:
   - Fusionamos \([3, 27, 38, 43]\) y \([9, 10, 82]\) en \([3, 9, 10, 27, 38, 43, 82]\).

La lista final ordenada es \([3, 9, 10, 27, 38, 43, 82]\).

---

**Pseudocódigo de Mergesort**

```plaintext
función Mergesort(lista):
    si longitud(lista) <= 1:
        devolver lista
    mitad = longitud(lista) // 2
    izquierda = Mergesort(lista[0:mitad])
    derecha = Mergesort(lista[mitad:])
    devolver fusionar(izquierda, derecha)

función fusionar(izquierda, derecha):
    resultado = lista vacía
    mientras izquierda y derecha no estén vacías:
        si izquierda[0] < derecha[0]:
            agregar izquierda[0] a resultado
            eliminar el primer elemento de izquierda
        sino:
            agregar derecha[0] a resultado
            eliminar el primer elemento de derecha
    agregar los elementos restantes de izquierda o derecha a resultado
    devolver resultado
```

**Análisis de complejidad temporal**

La **complejidad temporal** de Mergesort es:

- **Peor caso**: \(O(n \log n)\)
- **Mejor caso**: \(O(n \log n)\)
- **Caso promedio**: \(O(n \log n)\)

Esto se debe a que el algoritmo siempre divide el conjunto de datos en dos mitades (lo que toma \(O(\log n)\)) y luego fusiona esas mitades (lo que toma \(O(n)\) en cada nivel de recursión).

**Ventajas de Mergesort**

- **Estabilidad**: Mergesort es un algoritmo estable, es decir, no cambia el orden relativo de los elementos iguales.
- **Rendimiento consistente**: Mergesort siempre tiene un rendimiento de \(O(n \log n)\), incluso en el peor caso.
- **Divide y vencerás**: El algoritmo divide el problema en partes más pequeñas y las resuelve recursivamente.

**Desventajas**

- **Requiere espacio adicional**: Mergesort no es un algoritmo in-place, lo que significa que requiere memoria adicional para almacenar las sublistas durante el proceso de fusión.

---

**Resumen**

- **División**: Mergesort divide repetidamente el conjunto de datos en dos mitades hasta que cada sublista tiene un solo elemento.
- **Combinación**: Luego, fusiona las sublistas de manera ordenada, asegurando que cada sublista fusionada esté ordenada.
- Mergesort tiene una **complejidad temporal de \(O(n \log n)\)**, lo que lo hace eficiente, pero requiere **espacio adicional** para la fusión.

### ¿Qué ventajas tiene Mergesort sobre Quicksort en ciertos casos?

**Mergesort** tiene algunas ventajas sobre **Quicksort** en ciertos casos:

1. **Estabilidad**: Mergesort es un algoritmo **estable**, lo que significa que no cambia el orden relativo de los elementos con valores iguales. Quicksort, por otro lado, no es estable en su versión básica.

2. **Rendimiento consistente**: Mergesort tiene una complejidad temporal de \(O(n \log n)\) en el **peor caso**, mientras que Quicksort puede llegar a \(O(n^2)\) en el peor caso, aunque esto puede mitigarse con una buena elección del pivote.

3. **Comportamiento predecible**: Mergesort no depende de la distribución de los datos y siempre divide las listas de manera equilibrada. Quicksort, si se elige mal el pivote, puede ser menos eficiente con listas desbalanceadas o casi ordenadas.

4. **Paralelización**: Mergesort se puede **paralelizar fácilmente**, ya que las fusiones de sublistas son independientes, lo que lo hace adecuado para implementaciones en sistemas con múltiples núcleos.

**Resumen**: Mergesort es preferible cuando se necesita estabilidad, rendimiento predecible o en casos donde los datos son grandes y no se puede permitir un peor caso como en Quicksort.

### Explica por qué la complejidad de Mergesort es siempre `O(n log n)`.

La complejidad de **Mergesort** es siempre \(O(n \log n)\) debido a su estructura de **divide y vencerás**:

1. **División**: En cada paso, el algoritmo divide la lista en dos mitades, lo que reduce el problema a la mitad en cada nivel. Esto ocurre **logarítmicamente**. Si la lista tiene \(n\) elementos, se requieren \(\log n\) divisiones para llegar a sublistas de tamaño 1.

2. **Fusión**: Después de dividir, el algoritmo fusiona las sublistas. En cada nivel de recursión, se deben comparar y fusionar todos los elementos de la lista. Esto requiere \(O(n)\) tiempo por nivel de recursión, ya que se recorren todos los elementos.

Por lo tanto, la complejidad total es la cantidad de niveles (\(\log n\)) multiplicada por el trabajo realizado en cada nivel (\(O(n)\)), lo que da como resultado \(O(n \log n)\). Esta complejidad se mantiene constante en el peor, mejor y promedio caso, ya que la cantidad de divisiones y fusiones no depende del orden de los datos.

---

## Recorrido de Datos (map, filter, reduce)

**General**

### ¿Qué diferencia hay entre `map`, `filter` y `reduce`?

Las funciones `map`, `filter` y `reduce` son métodos fundamentales en programación funcional, utilizados para procesar y transformar colecciones (como listas, arrays, etc.). Aunque tienen similitudes en cuanto a que operan sobre colecciones, tienen propósitos específicos y se utilizan de manera distinta.

---

**1. `map`**

**Propósito:** Aplica una función a cada elemento de una colección y devuelve una nueva colección con los resultados.

- **Entrada:** Una colección y una función.
- **Salida:** Una nueva colección transformada.

**Ejemplo en Python:**

```python
numeros = [1, 2, 3, 4]
cuadrados = list(map(lambda x: x**2, numeros))
print(cuadrados)  # Salida: [1, 4, 9, 16]
```

**Ejemplo en JavaScript:**

```javascript
const numeros = [1, 2, 3, 4];
const cuadrados = numeros.map((x) => x ** 2);
console.log(cuadrados); // Salida: [1, 4, 9, 16]
```

**Ejemplo en Java:**

```java
import java.util.*;
import java.util.stream.*;

List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
List<Integer> cuadrados = numeros.stream().map(x -> x * x).collect(Collectors.toList());
System.out.println(cuadrados); // Salida: [1, 4, 9, 16]
```

---

**2. `filter`**

**Propósito:** Filtra los elementos de una colección que cumplen una condición dada y devuelve una nueva colección con los elementos que pasan el filtro.

- **Entrada:** Una colección y una función que devuelve un booleano.
- **Salida:** Una nueva colección con los elementos que cumplen la condición.

**Ejemplo en Python:**

```python
numeros = [1, 2, 3, 4, 5, 6]
pares = list(filter(lambda x: x % 2 == 0, numeros))
print(pares)  # Salida: [2, 4, 6]
```

**Ejemplo en JavaScript:**

```javascript
const numeros = [1, 2, 3, 4, 5, 6];
const pares = numeros.filter((x) => x % 2 === 0);
console.log(pares); // Salida: [2, 4, 6]
```

**Ejemplo en Java:**

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
List<Integer> pares = numeros.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
System.out.println(pares); // Salida: [2, 4, 6]
```

---

**3. `reduce`**

**Propósito:** Combina los elementos de una colección en un único valor, aplicando una función acumulativa.

- **Entrada:** Una colección y una función acumulativa.
- **Salida:** Un único valor.

**Ejemplo en Python:**

```python
from functools import reduce

numeros = [1, 2, 3, 4]
suma = reduce(lambda x, y: x + y, numeros)
print(suma)  # Salida: 10
```

**Ejemplo en JavaScript:**

```javascript
const numeros = [1, 2, 3, 4];
const suma = numeros.reduce((acumulador, actual) => acumulador + actual, 0);
console.log(suma); // Salida: 10
```

**Ejemplo en Java:**

```java
int suma = Arrays.asList(1, 2, 3, 4).stream().reduce(0, Integer::sum);
System.out.println(suma); // Salida: 10
```

---

**Diferencias clave**

| Método   | ¿Qué hace?                            | ¿Qué devuelve?                    | Ejemplo típico                   |
| -------- | ------------------------------------- | --------------------------------- | -------------------------------- |
| `map`    | Transforma cada elemento.             | Una nueva colección transformada. | Calcular el cuadrado de números. |
| `filter` | Selecciona elementos según condición. | Una nueva colección filtrada.     | Obtener números pares.           |
| `reduce` | Combina elementos en un solo valor.   | Un único valor.                   | Sumar todos los números.         |

### ¿Cuáles son los principales beneficios de utilizar estas funciones en lugar de bucles tradicionales?

Utilizar funciones como `map`, `filter` y `reduce` en lugar de bucles tradicionales (`for` o `while`) tiene varios beneficios, especialmente cuando buscamos un código más limpio, expresivo y eficiente.

---

**1. Código más limpio y conciso**

Las funciones como `map`, `filter` y `reduce` eliminan la necesidad de escribir bucles explícitos, lo que resulta en menos líneas de código y una mayor claridad.

**Ejemplo con un bucle tradicional:**

```python
# Elevar al cuadrado los números
numeros = [1, 2, 3, 4]
cuadrados = []
for num in numeros:
    cuadrados.append(num**2)
print(cuadrados)
```

**Con `map`:**

```python
cuadrados = list(map(lambda x: x**2, numeros))
print(cuadrados)
```

El segundo enfoque es más directo y fácil de entender, especialmente para operaciones simples.

---

**2. Enfoque funcional y declarativo**

Estas funciones permiten describir **qué** queremos hacer en lugar de **cómo** hacerlo. Esto hace que el código sea más intuitivo y legible.

- **Bucle tradicional:** Describe paso a paso cómo iterar y qué hacer.
- **Funciones funcionales:** Declaran la intención directamente (transformar, filtrar, combinar).

---

**3. Inmutabilidad y menos efectos secundarios**

Cuando usamos `map`, `filter` y `reduce`, no modificamos las colecciones originales; en cambio, se crean nuevas colecciones, lo que ayuda a evitar errores relacionados con el estado mutable.

**Ejemplo (bucles pueden modificar el estado):**

```python
numeros = [1, 2, 3, 4]
for i in range(len(numeros)):
    numeros[i] = numeros[i]**2
print(numeros)  # Modificó la lista original
```

**Con `map` (sin modificar el original):**

```python
numeros = [1, 2, 3, 4]
cuadrados = list(map(lambda x: x**2, numeros))
print(numeros)   # La lista original permanece igual
print(cuadrados) # Resultado transformado
```

---

**4. Más fácil de paralelizar**

Las funciones funcionales son más fáciles de paralelizar en comparación con los bucles tradicionales. Por ejemplo, en bibliotecas como Java Streams, las operaciones con `map`, `filter` y `reduce` pueden ejecutarse en paralelo automáticamente.

**Ejemplo en Java:**

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
List<Integer> pares = numeros.parallelStream()
                             .filter(x -> x % 2 == 0)
                             .collect(Collectors.toList());
System.out.println(pares); // Paralelizado automáticamente
```

---

**5. Menor riesgo de errores**

Los bucles tradicionales suelen ser más propensos a errores como:

- Índices fuera de rango.
- Modificación accidental de la colección mientras se itera.
- Lógica confusa al combinar múltiples operaciones.

Las funciones funcionales abstraen estos detalles y reducen las posibilidades de cometer errores.

---

**6. Composición de operaciones**

Las funciones funcionales son fáciles de combinar para realizar operaciones complejas sin necesidad de múltiples bucles anidados.

**Ejemplo: Filtrar números pares y calcular sus cuadrados (sin anidaciones):**

```python
numeros = [1, 2, 3, 4, 5, 6]
resultado = list(map(lambda x: x**2, filter(lambda x: x % 2 == 0, numeros)))
print(resultado)  # Salida: [4, 16, 36]
```

En un bucle tradicional, sería necesario anidar o realizar operaciones más detalladas.

---

**7. Mayor expresividad y consistencia**

Estas funciones son estándar en muchos lenguajes de programación (Python, JavaScript, Java, etc.), lo que las hace familiares para desarrolladores con experiencia en distintos lenguajes.

---

**Cuándo elegir funciones funcionales sobre bucles**

Es recomendable usar `map`, `filter` y `reduce` cuando:

- La operación puede expresarse claramente con estas funciones.
- Buscamos un código más legible y declarativo.
- Trabajamos con colecciones inmutables.
- Queremos facilitar la paralelización.

Por otro lado, en operaciones muy específicas o cuando la lógica es demasiado compleja, un bucle tradicional podría ser más adecuado.

**Python**

### Explica cómo funcionan las funciones `map`, `filter` y `reduce` en Python.

En Python, estas funciones son herramientas de programación funcional que trabajan con iterables (listas, tuplas, conjuntos, etc.) y permiten aplicar transformaciones, filtros o reducir los datos a un único valor.

---

**1. `map(function, iterable)`**

La función `map` aplica una función a cada elemento de un iterable y devuelve un objeto `map` (que puede ser convertido a una lista u otro iterable).

**Parámetros:**

- `function`: La función que se aplicará a cada elemento.
- `iterable`: La colección de elementos sobre la cual se aplicará la función.

**Resultado:**

Devuelve un nuevo iterable con los elementos transformados.

---

**Ejemplo básico:**

Elevar al cuadrado cada número de una lista.

```python
numeros = [1, 2, 3, 4]
cuadrados = map(lambda x: x**2, numeros)
print(list(cuadrados))  # Salida: [1, 4, 9, 16]
```

**Ejemplo con función definida:**

```python
def convertir_a_mayusculas(palabra):
    return palabra.upper()

palabras = ["hola", "mundo", "python"]
mayusculas = map(convertir_a_mayusculas, palabras)
print(list(mayusculas))  # Salida: ['HOLA', 'MUNDO', 'PYTHON']
```

---

**2. `filter(function, iterable)`**

La función `filter` selecciona los elementos de un iterable que cumplen con una condición (definida en la función).

**Parámetros:**

- `function`: Una función que devuelve `True` o `False` para cada elemento.
- `iterable`: La colección de elementos a filtrar.

**Resultado:**

Devuelve un nuevo iterable con los elementos que pasaron el filtro.

---

**Ejemplo básico:**

Filtrar los números pares de una lista.

```python
numeros = [1, 2, 3, 4, 5, 6]
pares = filter(lambda x: x % 2 == 0, numeros)
print(list(pares))  # Salida: [2, 4, 6]
```

**Ejemplo con función definida:**

```python
def es_palabra_corta(palabra):
    return len(palabra) <= 4

palabras = ["sol", "lluvia", "mar", "playa"]
cortas = filter(es_palabra_corta, palabras)
print(list(cortas))  # Salida: ['sol', 'mar']
```

---

**3. `reduce(function, iterable[, initial])`**

La función `reduce` aplica una función acumulativa a los elementos de un iterable, reduciéndolos a un único valor. Es parte del módulo `functools`.

**Parámetros:**

- `function`: Una función con dos argumentos que combina dos elementos.
- `iterable`: La colección de elementos a reducir.
- `initial` (opcional): Un valor inicial para el acumulador.

**Resultado:**

Devuelve un único valor, resultado de combinar todos los elementos.

---

**Ejemplo básico:**

Sumar todos los números de una lista.

```python
from functools import reduce

numeros = [1, 2, 3, 4]
suma = reduce(lambda x, y: x + y, numeros)
print(suma)  # Salida: 10
```

**Ejemplo con valor inicial:**

Multiplicar todos los números, comenzando con un valor inicial de 2.

```python
producto = reduce(lambda x, y: x * y, numeros, 2)
print(producto)  # Salida: 48 (2 * 1 * 2 * 3 * 4)
```

**Ejemplo con función definida:**

```python
def concatenar(cadena1, cadena2):
    return cadena1 + cadena2

palabras = ["Hola", " ", "Mundo", "!"]
frase = reduce(concatenar, palabras)
print(frase)  # Salida: "Hola Mundo!"
```

---

**Diferencias principales**

| Función  | Propósito                                        | Entrada                               | Salida             |
| -------- | ------------------------------------------------ | ------------------------------------- | ------------------ |
| `map`    | Transformar cada elemento.                       | Función y un iterable.                | Un nuevo iterable. |
| `filter` | Seleccionar elementos que cumplan una condición. | Función y un iterable.                | Un nuevo iterable. |
| `reduce` | Combinar todos los elementos en uno.             | Función, iterable y opcional inicial. | Un único valor.    |

---

**Combinando las funciones**

Se pueden usar juntas para realizar operaciones más complejas. Por ejemplo:

**Filtrar números pares y calcular su cuadrado:**

```python
numeros = [1, 2, 3, 4, 5, 6]
resultado = map(lambda x: x**2, filter(lambda x: x % 2 == 0, numeros))
print(list(resultado))  # Salida: [4, 16, 36]
```

**Sumar los cuadrados de números pares:**

```python
suma_cuadrados = reduce(lambda x, y: x + y, map(lambda x: x**2, filter(lambda x: x % 2 == 0, numeros)))
print(suma_cuadrados)  # Salida: 56
```

---

### ¿Qué tipo de función necesita cada una (como lambdas o definidas)?

Cada una de las funciones (`map`, `filter`, y `reduce`) necesita que se le pase una función como argumento principal, pero el tipo de función puede variar según la implementación y lo que quieras hacer.

---

**1. `map`: Función para transformar elementos**

- **Tipo de función requerida:**
  Una función que tome **un único argumento** y devuelva el valor transformado.
- **Opciones de función:**
  - **Funciones lambda:** Común para transformaciones simples.
  - **Funciones definidas:** Útil si la transformación es compleja o reutilizable.

**Ejemplo con lambda:**

```python
numeros = [1, 2, 3, 4]
cuadrados = list(map(lambda x: x**2, numeros))
print(cuadrados)  # Salida: [1, 4, 9, 16]
```

**Ejemplo con función definida:**

```python
def cuadrado(x):
    return x**2

numeros = [1, 2, 3, 4]
cuadrados = list(map(cuadrado, numeros))
print(cuadrados)  # Salida: [1, 4, 9, 16]
```

---

**2. `filter`: Función para condiciones (booleanas)**

- **Tipo de función requerida:**
  Una función que tome **un único argumento** y devuelva `True` o `False` según si el elemento cumple la condición.
- **Opciones de función:**
  - **Funciones lambda:** Común para condiciones simples.
  - **Funciones definidas:** Útil si la condición es más compleja o reutilizable.

**Ejemplo con lambda:**

```python
numeros = [1, 2, 3, 4, 5, 6]
pares = list(filter(lambda x: x % 2 == 0, numeros))
print(pares)  # Salida: [2, 4, 6]
```

**Ejemplo con función definida:**

```python
def es_par(x):
    return x % 2 == 0

numeros = [1, 2, 3, 4, 5, 6]
pares = list(filter(es_par, numeros))
print(pares)  # Salida: [2, 4, 6]
```

---

**3. `reduce`: Función acumulativa**

- **Tipo de función requerida:**
  Una función que tome **dos argumentos**:
  - El primer argumento es el acumulador (valor que se va construyendo).
  - El segundo argumento es el siguiente elemento del iterable.
  - Debe devolver el valor actualizado del acumulador.
- **Opciones de función:**
  - **Funciones lambda:** Común para operaciones simples como suma, producto, etc.
  - **Funciones definidas:** Recomendable para operaciones más complejas.

**Ejemplo con lambda:**

Suma de todos los números.

```python
from functools import reduce

numeros = [1, 2, 3, 4]
suma = reduce(lambda x, y: x + y, numeros)
print(suma)  # Salida: 10
```

**Ejemplo con función definida:**

Concatenar cadenas.

```python
from functools import reduce

def concatenar(cadena1, cadena2):
    return cadena1 + cadena2

palabras = ["Hola", " ", "Mundo", "!"]
frase = reduce(concatenar, palabras)
print(frase)  # Salida: "Hola Mundo!"
```

---

**Resumen de los tipos de funciones**

| Función  | Argumentos que acepta la función requerida   | Tipo de función preferida                                               | Ejemplo común                            |
| -------- | -------------------------------------------- | ----------------------------------------------------------------------- | ---------------------------------------- |
| `map`    | 1 argumento (el elemento del iterable).      | Lambda para transformaciones simples, definida para complejas.          | Transformar números o strings.           |
| `filter` | 1 argumento (el elemento del iterable).      | Lambda para condiciones simples, definida para condiciones complejas.   | Filtrar números pares.                   |
| `reduce` | 2 argumentos (acumulador y elemento actual). | Lambda para acumulaciones simples, definida para operaciones complejas. | Sumar o multiplicar todos los elementos. |

---

**¿Cuándo usar lambdas y cuándo funciones definidas?**

- Usa **lambdas** si:
  - La lógica es simple y puede escribirse en una línea.
  - No necesitas reutilizar la función en otros contextos.
- Usa **funciones definidas** si:
  - La lógica es compleja o requiere varias líneas.
  - Planeas reutilizar la función en diferentes partes de tu código.
  - Quieres un nombre descriptivo que haga más legible tu código.

**JavaScript**

### ¿Cómo se utilizan `map`, `filter` y `reduce` en JavaScript?

## En JavaScript, las funciones `map`, `filter` y `reduce` son métodos disponibles en los objetos tipo array (`Array.prototype`) y son ampliamente utilizadas en programación funcional para trabajar con datos de manera limpia y declarativa.

**1. `map`: Transformar elementos**

El método `map` crea un nuevo array aplicando una función a cada elemento del array original.

**Sintaxis:**

```javascript
array.map(callback(currentValue, index, array), thisArg);
```

- **`callback`**: Una función que se ejecuta en cada elemento del array.
  - **`currentValue`**: El elemento actual.
  - **`index`** (opcional): Índice del elemento actual.
  - **`array`** (opcional): El array original.
- **`thisArg`** (opcional): Un valor para usar como `this` en el callback.

---

**Ejemplo básico:**

Elevar al cuadrado cada número de un array.

```javascript
const numeros = [1, 2, 3, 4];
const cuadrados = numeros.map((num) => num ** 2);
console.log(cuadrados); // Salida: [1, 4, 9, 16]
```

**Ejemplo con objeto:**

Convertir un array de objetos en otro con una transformación.

```javascript
const usuarios = [
  { nombre: "Anto", edad: 20 },
  { nombre: "Juan", edad: 25 },
];
const nombres = usuarios.map((usuario) => usuario.nombre);
console.log(nombres); // Salida: ["Anto", "Juan"]
```

---

**2. `filter`: Filtrar elementos**

El método `filter` crea un nuevo array con los elementos que cumplen con una condición específica.

**Sintaxis:**

```javascript
array.filter(callback(currentValue, index, array), thisArg);
```

- **`callback`**: Una función que devuelve `true` para incluir el elemento en el nuevo array.
  - **`currentValue`**, **`index`**, **`array`**: Igual que en `map`.
- **`thisArg`** (opcional): Un valor para usar como `this` en el callback.

---

**Ejemplo básico:**

Filtrar números pares de un array.

```javascript
const numeros = [1, 2, 3, 4, 5, 6];
const pares = numeros.filter((num) => num % 2 === 0);
console.log(pares); // Salida: [2, 4, 6]
```

**Ejemplo con objetos:**

Filtrar usuarios mayores de 21 años.

```javascript
const usuarios = [
  { nombre: "Anto", edad: 20 },
  { nombre: "Juan", edad: 25 },
];
const mayores = usuarios.filter((usuario) => usuario.edad > 21);
console.log(mayores); // Salida: [{ nombre: "Juan", edad: 25 }]
```

---

**3. `reduce`: Reducir a un solo valor**

El método `reduce` aplica una función acumulativa a los elementos de un array, reduciéndolos a un único valor (suma, concatenación, etc.).

**Sintaxis:**

```javascript
array.reduce(callback(accumulator, currentValue, index, array), initialValue);
```

- **`callback`**: Una función que se ejecuta en cada elemento.
  - **`accumulator`**: El valor acumulado hasta el momento.
  - **`currentValue`**: El elemento actual.
  - **`index`** (opcional): Índice del elemento actual.
  - **`array`** (opcional): El array original.
- **`initialValue`** (opcional): Un valor inicial para el acumulador.

---

**Ejemplo básico:**

Sumar todos los números de un array.

```javascript
const numeros = [1, 2, 3, 4];
const suma = numeros.reduce((acc, num) => acc + num, 0);
console.log(suma); // Salida: 10
```

**Ejemplo con objetos:**

Calcular la suma total de las edades de los usuarios.

```javascript
const usuarios = [
  { nombre: "Anto", edad: 20 },
  { nombre: "Juan", edad: 25 },
];
const sumaEdades = usuarios.reduce((acc, usuario) => acc + usuario.edad, 0);
console.log(sumaEdades); // Salida: 45
```

---

**4. Combinando `map`, `filter` y `reduce`**

Estas funciones se pueden encadenar para realizar operaciones complejas de manera limpia.

**Ejemplo:**

Filtrar números mayores a 2, elevarlos al cuadrado y sumarlos.

```javascript
const numeros = [1, 2, 3, 4, 5];
const resultado = numeros
  .filter((num) => num > 2) // Filtrar mayores a 2: [3, 4, 5]
  .map((num) => num ** 2) // Elevar al cuadrado: [9, 16, 25]
  .reduce((acc, num) => acc + num, 0); // Sumar: 50

console.log(resultado); // Salida: 50
```

---

**Diferencias principales**

| Método   | Propósito                                    | Resultado                            |
| -------- | -------------------------------------------- | ------------------------------------ |
| `map`    | Transformar elementos.                       | Nuevo array transformado.            |
| `filter` | Filtrar elementos que cumplan una condición. | Nuevo array con elementos filtrados. |
| `reduce` | Combinar elementos en un único valor.        | Valor reducido.                      |

---

**Cuándo usar cada uno**

- Usa **`map`** cuando quieras transformar cada elemento del array.
- Usa **`filter`** cuando quieras seleccionar elementos basándote en una condición.
- Usa **`reduce`** cuando quieras combinar todos los elementos en un único valor.

**Java**

### ¿Qué son los Streams en Java, y cómo permiten aplicar `map`, `filter` y `reduce`?

En Java, los **Streams** son una abstracción que representa una secuencia de datos que se pueden procesar de manera funcional y declarativa. Fueron introducidos en **Java 8** y permiten trabajar con colecciones (como listas, conjuntos, etc.) de manera eficiente, aplicando operaciones como `map`, `filter` y `reduce`.

---

**Características principales de los Streams:**

1. **Declarativos:** Permiten expresar el "qué" se quiere hacer, no el "cómo".
2. **Procesamiento perezoso (lazy):** Las operaciones intermedias (`map`, `filter`, etc.) no se ejecutan hasta que una operación terminal (`reduce`, `collect`, etc.) las desencadena.
3. **Inmutables:** No modifican las colecciones originales, sino que producen nuevas.
4. **Encadenables:** Se pueden combinar múltiples operaciones en una sola línea.

---

**Flujo de trabajo básico con Streams**

1. **Fuente de datos:** Crear un `Stream` desde una colección, arreglo o generador.
2. **Operaciones intermedias:** Transforman o filtran datos (e.g., `map`, `filter`).
3. **Operación terminal:** Produce un resultado (e.g., `reduce`, `collect`).

```java
import java.util.*;
import java.util.stream.*;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int resultado = numeros.stream()       // Crear un Stream
            .filter(n -> n % 2 == 0)          // Filtrar números pares
            .map(n -> n * n)                  // Elevar al cuadrado
            .reduce(0, Integer::sum);         // Sumar los cuadrados

        System.out.println(resultado);        // Salida: 20 (2² + 4²)
    }
}
```

---

**Operaciones clave en Streams**

**1. `map`: Transformación**

Aplica una función a cada elemento y genera un nuevo `Stream` con los elementos transformados.

```java
List<String> nombres = Arrays.asList("Anto", "Juan", "Sofía");
List<String> nombresMayusculas = nombres.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList()); // Convertir el Stream en una lista

System.out.println(nombresMayusculas); // Salida: [ANTO, JUAN, SOFÍA]
```

---

**2. `filter`: Filtrado**

Retiene solo los elementos que cumplen con una condición.

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> pares = numeros.stream()
    .filter(n -> n % 2 == 0)              // Filtrar números pares
    .collect(Collectors.toList());

System.out.println(pares); // Salida: [2, 4]
```

---

**3. `reduce`: Reducción**

Combina los elementos de un `Stream` en un único valor usando una función acumulativa.

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

// Sumar todos los números
int suma = numeros.stream()
    .reduce(0, Integer::sum);             // 0 es el valor inicial

System.out.println(suma); // Salida: 15
```

**Ejemplo con multiplicación:**

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

// Multiplicar todos los números
int producto = numeros.stream()
    .reduce(1, (a, b) -> a * b);          // 1 es el valor inicial

System.out.println(producto); // Salida: 120
```

---

**Combinación de `map`, `filter` y `reduce`**

Los Streams son potentes porque permiten encadenar operaciones. Esto facilita realizar múltiples transformaciones y cálculos en una sola línea.

**Ejemplo práctico:**

Dado un conjunto de números, filtrar los números pares, elevarlos al cuadrado y sumar los resultados.

```java
import java.util.*;
import java.util.stream.*;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int resultado = numeros.stream()
            .filter(n -> n % 2 == 0)      // Filtrar números pares
            .map(n -> n * n)              // Elevar al cuadrado
            .reduce(0, Integer::sum);     // Sumar los cuadrados

        System.out.println(resultado);    // Salida: 20 (2² + 4²)
    }
}
```

---

**Operaciones intermedias vs terminales**

- **Intermedias:** Devuelven un nuevo `Stream` y se ejecutan de forma perezosa.
  - Ejemplos: `map`, `filter`, `sorted`, `distinct`.
- **Terminales:** Generan un resultado y cierran el `Stream`.
  - Ejemplos: `reduce`, `collect`, `forEach`.

---

**Ventajas de los Streams**

1. **Código más limpio y conciso.**
2. **Eficiencia:** Las operaciones son perezosas, procesando solo lo necesario.
3. **Inmutabilidad:** No alteran la colección original.
4. **Paralelismo:** Los Streams pueden ejecutarse en paralelo (`parallelStream()`).

---

**Limitaciones de los Streams**

1. No son reutilizables: Una vez que se consume un `Stream`, no puede usarse nuevamente.
2. A veces menos intuitivo para principiantes.
3. Puede ser más lento en escenarios simples debido a la sobrecarga de procesamiento funcional.

---

**Conclusión**

Los Streams en Java son una herramienta poderosa para procesar colecciones de manera declarativa, aprovechando las operaciones funcionales como `map`, `filter` y `reduce`. Son ideales para transformar datos de forma limpia, legible y eficiente.

### ¿Cuáles son las limitaciones del uso de estas funciones en comparación con otros enfoques?

Las funciones como `map`, `filter` y `reduce` son herramientas poderosas, pero presentan ciertas limitaciones y desventajas en comparación con otros enfoques como los bucles tradicionales (`for`, `while`) o métodos personalizados.

---

**1. Legibilidad en tareas complejas**

- **Limitación:** Cuando se combinan múltiples operaciones de transformación o reducción en un solo flujo, el código puede volverse difícil de entender para otros desarrolladores (o incluso para uno mismo después de un tiempo).
- **Ejemplo:**

  ```javascript
  const resultado = datos
    .filter((x) => x.activo)
    .map((x) => x.valor * 2)
    .reduce((acc, x) => acc + x, 0);
  ```

  - Aunque es conciso, entender el flujo completo puede ser complicado si la lógica es más compleja o si hay muchas transformaciones.

- **Alternativa:** Un bucle tradicional permite separar cada paso en bloques explícitos:
  ```javascript
  let suma = 0;
  for (let x of datos) {
    if (x.activo) {
      suma += x.valor * 2;
    }
  }
  ```

---

**2. Reutilización limitada**

- **Limitación:** Las funciones pasadas a `map`, `filter` o `reduce` suelen ser anónimas (`lambda` en Python, `arrow functions` en JavaScript). Esto puede dificultar la reutilización del código en otros contextos.

- **Alternativa:** Definir funciones explícitas y usarlas en un bucle tradicional puede favorecer la reutilización:

  ```javascript
  const esActivo = (x) => x.activo;
  const duplicar = (x) => x.valor * 2;

  const activosDuplicados = datos.filter(esActivo).map(duplicar);
  ```

---

**3. Rendimiento subóptimo en grandes volúmenes de datos**

- **Limitación:** Aunque son eficientes en muchas situaciones, las operaciones de `map`, `filter` y `reduce` pueden generar iteraciones adicionales. Esto ocurre porque cada método crea un nuevo array o realiza múltiples pasos, lo cual puede ser costoso en términos de memoria y tiempo.

- **Alternativa:** En algunos casos, un bucle tradicional puede ser más eficiente porque evita la creación de estructuras intermedias:
  ```javascript
  let suma = 0;
  for (let x of datos) {
    if (x.activo) {
      suma += x.valor * 2;
    }
  }
  ```

---

**4. Dificultad para depurar**

- **Limitación:** Depurar cadenas largas de `map`, `filter` y `reduce` puede ser complicado porque todo ocurre dentro de funciones anónimas y puede no haber puntos de interrupción (`breakpoints`) claros.

- **Alternativa:** Los bucles tradicionales permiten agregar fácilmente instrucciones como `console.log` o `breakpoints` en puntos específicos del código.

---

**5. No apto para flujos condicionales complejos**

- **Limitación:** Estas funciones están diseñadas para operaciones lineales. Si hay una lógica condicional compleja dentro de las transformaciones, usar estas funciones puede hacer el código menos claro.

- **Ejemplo problemático:**

  ```javascript
  const resultado = datos
    .map((x) => {
      if (x.valor > 10) return x.valor * 2;
      else if (x.valor > 5) return x.valor + 1;
      return x.valor;
    })
    .filter((x) => x > 15);
  ```

- **Alternativa:** Un enfoque más claro con un bucle:

  ```javascript
  const resultado = [];
  for (let x of datos) {
    let nuevoValor;
    if (x.valor > 10) nuevoValor = x.valor * 2;
    else if (x.valor > 5) nuevoValor = x.valor + 1;
    else nuevoValor = x.valor;

    if (nuevoValor > 15) resultado.push(nuevoValor);
  }
  ```

---

**6. Complejidad al manejar efectos secundarios**

- **Limitación:** Estas funciones están diseñadas para ser puras y no alterar el estado global. Manejar efectos secundarios (como actualizar variables fuera del flujo) no es intuitivo ni recomendado.

- **Alternativa:** Los bucles permiten manejar efectos secundarios de manera más explícita:
  ```javascript
  let contador = 0;
  datos.forEach((x) => {
    if (x.activo) contador++;
  });
  ```

---

**7. Menos flexibilidad para estructuras no lineales**

- **Limitación:** `map`, `filter` y `reduce` están diseñadas para procesar datos lineales como arrays. Trabajar con estructuras no lineales (árboles, grafos, etc.) requiere adaptaciones adicionales.

- **Alternativa:** Los bucles tradicionales pueden manejar estructuras no lineales de manera más directa, como en un recorrido recursivo de un árbol.

---

**8. Curva de aprendizaje**

- **Limitación:** Para programadores principiantes o sin experiencia en programación funcional, estas funciones pueden parecer menos intuitivas que los bucles, especialmente `reduce`.

- **Ejemplo de confusión con `reduce`:**

  ```javascript
  const suma = [1, 2, 3, 4].reduce((acc, num) => acc + num, 0);
  ```

  - La lógica de acumulación puede no ser evidente para alguien que no está familiarizado.

- **Alternativa:** Un bucle como este es más fácil de entender inicialmente:
  ```javascript
  let suma = 0;
  for (let num of [1, 2, 3, 4]) {
    suma += num;
  }
  ```

---

**Cuadro comparativo**

| Aspecto                  | `map`, `filter`, `reduce`       | Bucles tradicionales                          |
| ------------------------ | ------------------------------- | --------------------------------------------- |
| **Legibilidad**          | Mejor para operaciones simples. | Mejor para lógica compleja o condicional.     |
| **Reutilización**        | Limitada (funciones anónimas).  | Fácil de reutilizar con funciones explícitas. |
| **Rendimiento**          | Costoso en datos grandes.       | Puede ser más eficiente (menos pasos).        |
| **Depuración**           | Más difícil.                    | Más fácil con herramientas estándar.          |
| **Curva de aprendizaje** | Más compleja.                   | Más intuitiva para principiantes.             |

---

**Conclusión**

`map`, `filter` y `reduce` son herramientas excelentes para operaciones funcionales y declarativas, pero no siempre son la mejor opción. Los bucles tradicionales son preferibles cuando:

1. La lógica es compleja o incluye condiciones no lineales.
2. Se necesita rendimiento óptimo en datos muy grandes.
3. Es necesario manejar efectos secundarios o estructuras no lineales.

---

## Ejercicios Prácticos

---

## Búsqueda

**Python**

1. Implementa una búsqueda secuencial para encontrar un número en una lista y devuelve su posición.
2. Crea una función que implemente la búsqueda binaria en una lista ordenada.

**JavaScript**

1. Escribe una función que realice una búsqueda secuencial en un arreglo y devuelva el índice del elemento encontrado.
2. Implementa la búsqueda binaria en un arreglo ordenado de números.

**Java**

1. Crea un programa que realice una búsqueda secuencial en un array y devuelva si el elemento está presente.
2. Escribe un método que implemente la búsqueda binaria en un array ordenado.

---

## Algoritmos de Ordenamiento

**Python**

1. Escribe un programa que ordene una lista usando el algoritmo de burbuja.
2. Implementa el algoritmo Quicksort para ordenar una lista.

**JavaScript**

1. Implementa el algoritmo de selección para ordenar un arreglo de números.
2. Escribe una función que ordene un arreglo usando el algoritmo Mergesort.

**Java**

1. Implementa el ordenamiento por inserción para un array de enteros.
2. Crea un programa que ordene un array de enteros usando Quicksort.

---

## Recorrido de Datos

**Python**

1. Usa `map` para duplicar los elementos de una lista.
2. Aplica `filter` para extraer los números pares de una lista.
3. Utiliza `reduce` para calcular el producto de todos los elementos de una lista.

**JavaScript**

1. Usa `map` para convertir un arreglo de grados Celsius a Fahrenheit.
2. Aplica `filter` para filtrar los nombres con más de 5 caracteres en un arreglo de strings.
3. Utiliza `reduce` para sumar todos los números en un arreglo.

**Java**

1. Usa Streams y `map` para convertir un ArrayList de enteros en una lista de sus cuadrados.
2. Aplica `filter` para seleccionar los strings que comienzan con una letra específica en una lista.
3. Usa `reduce` para calcular el valor acumulado de un ArrayList de números.

---
