# Preguntas Teóricas Integradoras

## Árboles Binarios

### ¿Qué características definen a un árbol binario?

Un **árbol binario** es una estructura de datos jerárquica ampliamente utilizada en informática y matemáticas. Sus características principales son:

1. **Nodos**:

   - Cada nodo puede contener un valor o dato.
   - Puede tener un máximo de dos hijos: el hijo izquierdo y el hijo derecho.

2. **Raíz**:

   - Es el nodo superior del árbol, el punto de inicio.

3. **Hijos**:

   - Cada nodo puede tener 0, 1 o 2 hijos.
   - Los hijos están etiquetados como "hijo izquierdo" y "hijo derecho".

4. **Hojas**:

   - Son nodos que no tienen hijos. Están en el nivel más bajo del árbol.

5. **Subárboles**:

   - Cada nodo, junto con sus descendientes, forma un subárbol.

6. **Altura del árbol**:

   - Es la longitud del camino más largo desde la raíz hasta una hoja.

7. **Profundidad**:

   - Es la distancia desde la raíz hasta un nodo particular.

8. **Propiedades únicas**:

   - Cada nodo tiene un único padre, excepto la raíz que no tiene padre.
   - Puede estar vacío (sin nodos) o contener múltiples nodos conectados por aristas.

9. **Orden**:
   - Especifica la relación entre los nodos hijos (hijo izquierdo antes que el derecho).

### Explica las diferencias entre un árbol completo, perfecto y equilibrado.

Las diferencias entre un **árbol binario completo**, **perfecto** y **equilibrado** radican en cómo se distribuyen los nodos en el árbol y en su estructura.

---

**Árbol Binario Completo**

- **Definición**:
  - Todos los niveles del árbol están completamente llenos, excepto posiblemente el último.
  - En el último nivel, los nodos están alineados lo más a la izquierda posible.
- **Características**:
  - Puede tener "huecos" en el último nivel, pero solo hacia la derecha.
  - Es más flexible que un árbol perfecto.
- **Ejemplo**:
  ```
       1
     /   \
    2     3
   / \
  4   5
  ```
  > Este árbol es completo, porque todos los niveles excepto el último están llenos, y los nodos del último nivel están lo más a la izquierda posible.

---

**Árbol Binario Perfecto**

- **Definición**:
  - Todos los niveles del árbol están completamente llenos.
  - Cada nodo interno tiene exactamente dos hijos, y todas las hojas están al mismo nivel.
- **Características**:
  - Es el tipo más rígido y simétrico de árbol binario.
  - Si la altura del árbol es \(h\), el número total de nodos será \(2^{h+1} - 1\).
- **Ejemplo**:
  ```
       1
     /   \
    2     3
   / \   / \
  4   5 6   7
  ```
  > Este árbol es perfecto porque todos los niveles están llenos y las hojas están al mismo nivel.

---

**Árbol Binario Balanceado (Balanced)**

- **Definición**:
  - La diferencia de altura entre los subárboles izquierdo y derecho de cualquier nodo es como máximo 1.
  - Puede estar completo o no, pero mantiene un balance razonable para optimizar operaciones.
- **Características**:
  - Se centra en mantener la eficiencia en las operaciones (búsqueda, inserción, eliminación).
  - No necesariamente todos los niveles están llenos.
- **Ejemplo**:
  ```
       1
     /   \
    2     3
   / \
  4   5
  ```
  > Este árbol es balanceado porque la diferencia de altura entre los subárboles izquierdo y derecho en cada nodo no supera 1.

---

**Comparación**

| Característica     | Árbol Completo                               | Árbol Perfecto          | Árbol Balanceado          |
| ------------------ | -------------------------------------------- | ----------------------- | ------------------------- |
| **Niveles llenos** | Todos excepto el último                      | Todos                   | No necesariamente         |
| **Hojas**          | En el último nivel, alineadas a la izquierda | Todas en el mismo nivel | Pueden estar distribuidas |
| **Simetría**       | Parcial                                      | Total                   | Parcial                   |
| **Aplicaciones**   | Modelado general                             | Estructuras matemáticas | Operaciones optimizadas   |

### ¿Cuáles son los métodos más comunes para recorrer un árbol binario? Explica cada uno.

Los métodos más comunes para recorrer un árbol binario son el **recorrido en profundidad (DFS)** y el **recorrido en amplitud (BFS)**.

**1. Recorridos en Profundidad (DFS - Depth First Search)**

En el recorrido DFS, se explora lo más profundo posible en un subárbol antes de retroceder y explorar otro subárbol. Hay tres tipos principales:

a) **Recorrido en Preorden (Preorder)**

**Orden de visita:** Raíz → Izquierda → Derecha

- Se visita el nodo actual antes de explorar los subárboles izquierdo y derecho.
- Ideal para copiar o exportar la estructura de un árbol.
- Ejemplo:  
  Para el árbol:
  ```
       1
     /   \
    2     3
   / \   / \
  4   5 6   7
  ```
  Resultado del recorrido en preorden: **1, 2, 4, 5, 3, 6, 7**

b) **Recorrido en Inorden (Inorder)**

**Orden de visita:** Izquierda → Raíz → Derecha

- Se visita primero el subárbol izquierdo, luego el nodo actual, y por último el subárbol derecho.
- Muy utilizado en árboles binarios de búsqueda (BST) para obtener los valores en orden ascendente.
- Ejemplo:  
  Para el mismo árbol, el recorrido en inorden es: **4, 2, 5, 1, 6, 3, 7**

c) **Recorrido en Postorden (Postorder)**

**Orden de visita:** Izquierda → Derecha → Raíz

- Se visitan primero los subárboles y luego el nodo actual.
- Útil para borrar o liberar memoria de un árbol.
- Ejemplo:  
  Para el mismo árbol, el recorrido en postorden es: **4, 5, 2, 6, 7, 3, 1**

---

**2. Recorrido en Amplitud (BFS - Breadth First Search)**

En el recorrido BFS, se visitan los nodos nivel por nivel, de izquierda a derecha en cada nivel.

a) **Recorrido por Niveles (Level Order Traversal)**

**Orden de visita:** Nivel 1 → Nivel 2 → ... → Nivel n

- Se empieza en la raíz y se visitan los nodos del mismo nivel antes de pasar al siguiente.
- Generalmente se implementa usando una cola.
- Ejemplo:  
  Para el mismo árbol, el recorrido por niveles es: **1, 2, 3, 4, 5, 6, 7**

---

**Comparación de los Métodos**

| Método          | Ventajas                         | Usos típicos                                                     |
| --------------- | -------------------------------- | ---------------------------------------------------------------- |
| **Preorden**    | Visita primero la raíz.          | Serialización de árboles, copias de estructuras.                 |
| **Inorden**     | Ordena datos en BST.             | Búsqueda, operaciones matemáticas ordenadas.                     |
| **Postorden**   | Procesa hijos antes que la raíz. | Liberación de memoria, evaluación de expresiones.                |
| **Por Niveles** | Explora nodos cercanos primero.  | Ideal para encontrar la distancia más corta o el nivel de nodos. |

---

## Árbol AVL

### ¿Qué diferencia a un árbol AVL de un árbol binario normal?

Un **árbol AVL** es un tipo especial de **árbol binario de búsqueda (BST)** que incluye una característica adicional: **autobalanceo**. Esto lo diferencia significativamente de un árbol binario normal, donde no necesariamente se mantiene el balance:

**1. Balanceo**

- **Árbol Binario Normal**:

  - No garantiza que los subárboles izquierdo y derecho de un nodo tengan alturas similares.
  - Esto puede generar árboles muy desbalanceados, donde la altura del árbol puede crecer excesivamente, afectando la eficiencia de las operaciones (búsqueda, inserción, eliminación).
  - Ejemplo de árbol desbalanceado:
    ```
        1
         \
          2
           \
            3
    ```
    Aquí, la búsqueda tiene un costo similar a una lista enlazada: \(O(n)\).

- **Árbol AVL**:
  - Garantiza que la **diferencia de alturas (factor de balance)** entre los subárboles izquierdo y derecho de cualquier nodo sea como máximo **1**.
  - Esto asegura que las operaciones mantengan una complejidad de tiempo **logarítmica (\(O(\log n\))**).
  - Después de cada operación (inserción o eliminación), el árbol se reequilibra automáticamente mediante **rotaciones**.

---

**2. Factor de Balance**

- **Árbol Binario Normal**:
  - No tiene restricciones sobre el balance.
- **Árbol AVL**:
  - El **factor de balance** (FB) de un nodo se calcula como:  
    \[
    FB = \text{altura(subárbol izquierdo)} - \text{altura(subárbol derecho)}
    \]
  - Para un árbol AVL, \(FB \in \{-1, 0, 1\}\). Si el factor de balance de algún nodo excede este rango tras una operación, el árbol se reequilibra.

---

**3. Rotaciones**

- **Árbol Binario Normal**:
  - No realiza rotaciones para mantener el balance.
- **Árbol AVL**:
  - Utiliza **rotaciones simples** y **dobles** para reequilibrarse:
    - **Rotación simple a la izquierda**: Corrige un desbalance hacia la derecha.
    - **Rotación simple a la derecha**: Corrige un desbalance hacia la izquierda.
    - **Rotación doble izquierda-derecha** o **derecha-izquierda**: Corrige desbalances más complejos.

---

**4. Eficiencia**

- **Árbol Binario Normal**:
  - En el peor caso, las operaciones tienen una complejidad de tiempo de \(O(n)\), como en una lista enlazada.
- **Árbol AVL**:
  - Las operaciones (búsqueda, inserción y eliminación) siempre tienen una complejidad de tiempo de \(O(\log n)\) debido al balance garantizado.

---

**5. Aplicaciones**

- **Árbol Binario Normal**:
  - Se utiliza cuando el balance no es crítico o el conjunto de datos es pequeño.
- **Árbol AVL**:
  - Ideal para aplicaciones donde es importante mantener un rendimiento óptimo en operaciones de búsqueda, como en bases de datos o sistemas de archivos.

---

**Ejemplo Visual**

**Árbol Binario Normal:**

```
       10
      /  \
     5    15
           \
            20
```

> Aquí el subárbol derecho está desbalanceado.

**Árbol AVL:**

```
       10
      /  \
     5    15
          / \
         12  20
```

> Tras reequilibrarse, el árbol AVL mantiene un balance adecuado.

---

### ¿Qué significa que un árbol AVL esté balanceado y cómo se logra este balance?

En un **árbol AVL**, el término **balanceado** significa que la diferencia de alturas entre los subárboles izquierdo y derecho de cualquier nodo (llamada **factor de balance**) es como máximo \(1\). Esto garantiza que el árbol permanezca "equilibrado" en términos de profundidad, lo que asegura una búsqueda eficiente con una complejidad de tiempo de \(O(\log n)\).

---

**1. ¿Qué es el factor de balance (FB)?**

El **factor de balance** de un nodo en un árbol AVL se define como:  
\[
FB = \text{altura(subárbol izquierdo)} - \text{altura(subárbol derecho)}
\]

- Un árbol AVL está balanceado si para cada nodo:
  \[
  FB \in \{-1, 0, 1\}
  \]
- Si el FB de algún nodo está fuera de este rango tras una inserción o eliminación, el árbol ya no está balanceado y se requiere un **reequilibrio**.

---

**2. ¿Cómo se mide la altura de un subárbol?**

La **altura** de un nodo en un árbol es la longitud del camino más largo desde ese nodo hasta una hoja.  
Por ejemplo:

```
       10
      /  \
     5    15
    / \
   3   7
```

- Altura del nodo `5`: 2 (camino más largo hasta `3` o `7`).
- Altura del nodo `15`: 0 (es una hoja).

---

**3. ¿Cómo se logra el balance en un árbol AVL?**

Cuando se inserta o elimina un nodo, el factor de balance de algunos nodos puede salirse del rango permitido (\(-1\), \(0\), \(1\)). En estos casos, se utilizan **rotaciones** para restaurar el balance.

**Tipos de Rotaciones en un Árbol AVL**

1. **Rotación Simple a la Derecha (Right Rotation):**

   - Se aplica cuando el subárbol izquierdo de un nodo está desbalanceado (FB > 1) y la inserción ocurrió en el subárbol izquierdo del hijo izquierdo.
   - Resultado: El subárbol izquierdo se eleva y el nodo desbalanceado se convierte en el hijo derecho.

2. **Rotación Simple a la Izquierda (Left Rotation):**

   - Se aplica cuando el subárbol derecho de un nodo está desbalanceado (FB < -1) y la inserción ocurrió en el subárbol derecho del hijo derecho.
   - Resultado: El subárbol derecho se eleva y el nodo desbalanceado se convierte en el hijo izquierdo.

3. **Rotación Doble Izquierda-Derecha (Left-Right Rotation):**

   - Se aplica cuando el subárbol izquierdo de un nodo está desbalanceado (FB > 1) y la inserción ocurrió en el subárbol derecho del hijo izquierdo.
   - Resultado: Primero se realiza una rotación simple a la izquierda, seguida de una rotación simple a la derecha.

4. **Rotación Doble Derecha-Izquierda (Right-Left Rotation):**
   - Se aplica cuando el subárbol derecho de un nodo está desbalanceado (FB < -1) y la inserción ocurrió en el subárbol izquierdo del hijo derecho.
   - Resultado: Primero se realiza una rotación simple a la derecha, seguida de una rotación simple a la izquierda.

---

**4. Ejemplo de Balanceo**

**Inserción en un árbol AVL:**
Antes de la inserción:

```
       30
      /
     20
    /
   10
```

- Aquí el nodo `30` tiene un factor de balance de \(FB = 2\), lo que significa que está desbalanceado.

**Solución (Rotación Simple a la Derecha):**

```
       20
      /  \
     10   30
```

Ahora el árbol está balanceado, con un FB de \(0\) en todos los nodos.

---

**5. Ventajas del Balance**

- **Complejidad Garantizada:** El balance asegura que las operaciones de búsqueda, inserción y eliminación se realicen en tiempo \(O(\log n)\), incluso en el peor caso.
- **Estructura Eficiente:** Mantiene una distribución uniforme de los nodos, evitando problemas de rendimiento como los de un árbol binario desbalanceado.

## Grafos

### Define qué es un grafo y cuáles son sus componentes principales.

Un **grafo** es una estructura matemática que se utiliza para modelar relaciones o conexiones entre un conjunto de elementos. Es ampliamente utilizado en ciencias de la computación, matemáticas y otras disciplinas para representar sistemas de redes, caminos, interacciones, entre otros.

---

**1. Componentes Principales de un Grafo**

a) **Vértices (Nodos):**

- Representan los elementos fundamentales del grafo.
- Se denotan normalmente como \(V\) o \(N\), y cada vértice se representa por un símbolo único (como \(v_1, v_2, v_3\), etc.).
- Ejemplo: En una red social, cada persona puede representarse como un vértice.

b) **Aristas (Enlaces):**

- Representan las conexiones o relaciones entre los vértices.
- Se denotan como \(E\) y suelen escribirse como pares de vértices: \((v_i, v_j)\).
- Las aristas pueden ser de dos tipos:
  - **No dirigidas:** Las conexiones no tienen dirección. \((v_i, v_j)\) es equivalente a \((v_j, v_i)\).
  - **Dirigidas:** Las conexiones tienen dirección. \((v_i, v_j)\) implica una conexión de \(v_i\) hacia \(v_j\), pero no necesariamente de \(v_j\) hacia \(v_i\).

c) **Peso (Opcional):**

- A las aristas se les puede asignar un valor numérico llamado **peso**, que representa alguna propiedad como distancia, costo o capacidad.
- Ejemplo: En un mapa, el peso podría ser la distancia entre dos ciudades.

d) **Grado de un vértice:**

- Es la cantidad de aristas conectadas a un vértice.
  - En un grafo dirigido, se distingue entre:
    - **Grado de entrada:** Número de aristas que llegan al vértice.
    - **Grado de salida:** Número de aristas que parten del vértice.

e) **Caminos:**

- Secuencia de vértices conectados por aristas. Puede ser:
  - **Simple:** No se repiten vértices ni aristas.
  - **Ciclo:** Es un camino que comienza y termina en el mismo vértice.

---

**2. Clasificación de Grafos**
Según sus características, los grafos pueden clasificarse en:

a) **Dirigidos vs. No Dirigidos:**

- **Dirigido:** Las aristas tienen una dirección (se representan con flechas).
- **No dirigido:** Las aristas no tienen dirección.

b) **Ponderados vs. No Ponderados:**

- **Ponderado:** Las aristas tienen un peso asociado.
- **No ponderado:** Todas las aristas tienen el mismo peso (o ninguno).

c) **Conexos vs. Desconexos:**

- **Conexo:** Existe al menos un camino entre cualquier par de vértices.
- **Desconexo:** Hay vértices que no están conectados entre sí.

d) **Cíclicos vs. Acíclicos:**

- **Cíclico:** Contiene al menos un ciclo.
- **Acíclico:** No contiene ciclos.

e) **Multigrafos:**

- Permiten múltiples aristas entre el mismo par de vértices.

f) **Grafos completos:**

- Cada vértice está conectado con todos los demás vértices.

---

**3. Representación de Grafos**

Los grafos pueden representarse de varias formas en programación:

a) **Lista de Adyacencia:**

- Cada vértice tiene una lista de sus vértices vecinos.
- Ejemplo (grafo no dirigido):  
  \[
  \{1: [2, 3], 2: [1, 4], 3: [1, 4], 4: [2, 3]\}
  \]

b) **Matriz de Adyacencia:**

- Una matriz donde las filas y columnas representan vértices, y las entradas indican si hay una arista entre ellos (1 si hay conexión, 0 si no).
- Ejemplo:
  \[
  \begin{bmatrix}
  0 & 1 & 1 & 0 \\
  1 & 0 & 0 & 1 \\
  1 & 0 & 0 & 1 \\
  0 & 1 & 1 & 0
  \end{bmatrix}
  \]

---

**4. Aplicaciones de los Grafos**

- **Redes sociales:** Modelan las conexiones entre personas.
- **Rutas y mapas:** Representan caminos entre ciudades.
- **Optimización:** Resuelven problemas como el camino más corto (Dijkstra) o el flujo máximo.
- **Ciencias de datos:** Modelan relaciones en datos complejos.
- **Computación:** Representan dependencias en sistemas, como el orden de tareas en un compilador.

---

### ¿Qué es una matriz de adyacencia y en qué se diferencia de una lista de adyacencia?

**1. Matriz de Adyacencia**

Una **matriz de adyacencia** es una representación bidimensional (usualmente una matriz cuadrada) que indica si existe una arista entre un par de vértices.

**Características:**

- Es una matriz \(n \times n\), donde \(n\) es el número de vértices en el grafo.
- Cada celda \(M[i][j]\) tiene un valor:
  - \(1\) (o el peso de la arista) si existe una arista entre los vértices \(i\) y \(j\).
  - \(0\) si no existe conexión entre ellos.

**Ejemplo (grafo no dirigido):**
Para el siguiente grafo:

```
   1 --- 2
    \   /
     \ /
      3
```

La matriz de adyacencia sería:
\[
\begin{bmatrix}
0 & 1 & 1 \\
1 & 0 & 1 \\
1 & 1 & 0
\end{bmatrix}
\]

**Ventajas:**

1. **Acceso rápido:** Puedes verificar en \(O(1)\) si existe una arista entre dos vértices (\(M[i][j]\)).
2. **Sencilla de implementar:** Es fácil de construir y entender.

**Desventajas:**

1. **Uso de memoria:** Siempre ocupa \(O(n^2)\), incluso si el grafo tiene pocas aristas (es decir, si es un grafo disperso o "sparse").
2. **Iteración menos eficiente:** Al recorrer los vecinos de un vértice, necesitas examinar toda la fila correspondiente, lo cual toma \(O(n)\).

---

**2. Lista de Adyacencia**

Una **lista de adyacencia** utiliza una estructura donde cada vértice tiene una lista (o conjunto) de vértices con los que está conectado.

**Características:**

- Representa el grafo como un diccionario o arreglo de listas:
  - La clave (o índice) representa un vértice.
  - Los valores en la lista representan los vértices vecinos conectados por aristas.

**Ejemplo (grafo no dirigido):**
Para el mismo grafo anterior:

```
   1 --- 2
    \   /
     \ /
      3
```

La lista de adyacencia sería:
\[
\{ 1: [2, 3], 2: [1, 3], 3: [1, 2] \}
\]

**Ventajas:**

1. **Uso eficiente de memoria:** Solo almacena las aristas existentes. Ideal para grafos dispersos.
2. **Iteración eficiente:** Al recorrer los vecinos de un vértice, solo examinas la lista de adyacencia de ese vértice.

**Desventajas:**

1. **Acceso más lento:** Verificar si hay una arista entre dos vértices puede tomar \(O(k)\), donde \(k\) es el número de vecinos del vértice.
2. **Complejidad adicional:** Es un poco más compleja de implementar que la matriz.

---

**3. Diferencias Clave**

| **Aspecto**               | **Matriz de Adyacencia**       | **Lista de Adyacencia**                           |
| ------------------------- | ------------------------------ | ------------------------------------------------- |
| **Estructura**            | Matriz \(n \times n\)          | Diccionario o arreglo de listas                   |
| **Uso de memoria**        | \(O(n^2)\)                     | \(O(n + e)\), donde \(e\) es el número de aristas |
| **Acceso a aristas**      | \(O(1)\)                       | \(O(k)\), donde \(k\) es el número de vecinos     |
| **Iteración por vecinos** | \(O(n)\)                       | \(O(k)\)                                          |
| **Mejor para**            | Grafos densos (muchas aristas) | Grafos dispersos (pocas aristas)                  |

---

**4. Elección según el caso**

- **Matriz de Adyacencia:**  
  Útil para grafos **densos** (cuando el número de aristas es cercano al número máximo posible, \(n^2\)), o si necesitas acceso rápido para verificar si hay una conexión entre dos vértices.

- **Lista de Adyacencia:**  
  Ideal para grafos **dispersos** (cuando el número de aristas es mucho menor que \(n^2\)), o si necesitas recorrer rápidamente los vecinos de un vértice.

### Explica las diferencias entre los algoritmos de recorrido BFS (Breadth-First Search) y DFS (Depth-First Search).

**1. BFS (Breadth-First Search - Búsqueda en Anchura)**

**Estrategia:**
El BFS explora un grafo nivel por nivel, comenzando desde un vértice inicial. Primero visita todos los vecinos directos (nivel más cercano) antes de avanzar al siguiente nivel.

**Funcionamiento:**

1. Utiliza una **cola (queue)** para almacenar los vértices a explorar.
2. Empieza desde un vértice inicial y lo marca como visitado.
3. Visita los vecinos no explorados del vértice actual y los agrega a la cola.
4. Repite el proceso hasta que la cola esté vacía.

**Características:**

- Explora **todas las aristas posibles en un nivel** antes de pasar al siguiente.
- **Orden de recorrido:** Similar a ondas que se expanden desde el vértice inicial.

**Ventajas:**

1. Encuentra el **camino más corto** en un grafo no ponderado.
2. Es ideal para búsquedas de nivel o por capas.

**Complejidad:**

- **Tiempo:** \(O(V + E)\), donde \(V\) es el número de vértices y \(E\) el número de aristas.
- **Espacio:** \(O(V)\) debido a la cola.

**Ejemplo de recorrido BFS:**

Para el siguiente grafo:

```
   1 -- 2
   |    |
   3 -- 4
```

Si comenzamos en el vértice `1`, el orden de recorrido será:

```
1 → 2 → 3 → 4
```

---

**2. DFS (Depth-First Search - Búsqueda en Profundidad)**

**Estrategia:**
El DFS explora un camino lo más profundamente posible antes de retroceder y explorar otros caminos.

**Funcionamiento:**

1. Utiliza una **pila (stack)** (o recursión, que usa la pila del sistema) para rastrear los vértices a explorar.
2. Empieza desde un vértice inicial y lo marca como visitado.
3. Explora un vecino no visitado y repite el proceso hasta que no haya más vecinos no visitados.
4. Retrocede al vértice anterior y explora otros caminos posibles.

**Características:**

- Sigue un camino hasta que no puede avanzar más, luego retrocede.
- Puede ser **recursivo** o **iterativo**.

**Ventajas:**

1. Consume menos espacio en grafos densos.
2. Es útil para problemas como detección de ciclos, componentes conectados, y topología en grafos dirigidos.

**Complejidad:**

- **Tiempo:** \(O(V + E)\), donde \(V\) es el número de vértices y \(E\) el número de aristas.
- **Espacio:** \(O(V)\) debido a la pila.

**Ejemplo de recorrido DFS:**

Para el mismo grafo:

```
   1 -- 2
   |    |
   3 -- 4
```

Si comenzamos en el vértice `1`, un posible orden de recorrido será:

```
1 → 2 → 4 → 3
```

---

**3. Diferencias Clave**

| **Aspecto**               | **BFS**                               | **DFS**                                |
| ------------------------- | ------------------------------------- | -------------------------------------- |
| **Estrategia**            | Explora nivel por nivel               | Explora un camino hasta el final       |
| **Estructura utilizada**  | Cola (FIFO)                           | Pila (LIFO) o recursión                |
| **Uso típico**            | Encontrar caminos más cortos          | Detección de ciclos, topología         |
| **Orden de recorrido**    | Por niveles                           | Por caminos                            |
| **Eficiencia en memoria** | Requiere más memoria en grafos densos | Consume menos memoria en grafos densos |
| **Ideal para**            | Grafos anchos                         | Grafos profundos                       |

---

**4. Aplicaciones**

**BFS:**

- Búsqueda del camino más corto en grafos no ponderados.
- Búsqueda por niveles en sistemas jerárquicos (e.g., organigramas).
- Resolución de problemas como laberintos (nivel más cercano).

**DFS:**

- Detección de ciclos en grafos.
- Clasificación topológica de grafos dirigidos acíclicos (DAGs).
- Encontrar componentes conectados.
- Resolver problemas como el del "caballo en el tablero de ajedrez" (backtracking).

---

# Ejercicios Prácticos

## Árboles Binarios

**Python**

1. Implementa una clase para un árbol binario que permita agregar nodos y realizar un recorrido en orden.
2. Escribe una función para calcular la altura de un árbol binario.

**JavaScript**

1. Crea un árbol binario e implementa un método para recorrerlo en preorden, inorden y postorden.
2. Escribe una función para buscar un elemento específico en un árbol binario.

**Java**

1. Implementa un árbol binario con métodos para insertar, buscar y recorrer nodos en postorden.
2. Escribe un método para contar el número de hojas en un árbol binario.

---

## Árbol AVL

**Python**

1. Implementa un árbol AVL que permita insertar nodos y mantenga el balance automáticamente.
2. Escribe una función para imprimir los nodos del árbol AVL por niveles.

**JavaScript**

1. Implementa las rotaciones necesarias para un árbol AVL y realiza pruebas de inserción de nodos.
2. Escribe una función para calcular el factor de balance de cada nodo en un árbol AVL.

**Java**

1. Implementa un árbol AVL con métodos para insertar y eliminar nodos balanceando el árbol.
2. Escribe un programa que demuestre el funcionamiento de las rotaciones simples y dobles en un árbol AVL.

---

## Grafos

**Python**

1. Implementa un grafo usando una matriz de adyacencia y realiza un recorrido BFS.
2. Escribe un programa que encuentre todos los caminos posibles entre dos nodos en un grafo dirigido.

**JavaScript**

1. Crea un grafo utilizando una lista de adyacencia e implementa el recorrido DFS.
2. Escribe una función para determinar si un grafo es conexo o no.

**Java**

1. Implementa un grafo con una matriz de adyacencia y realiza el recorrido BFS y DFS.
2. Escribe un programa que calcule el grado de entrada y salida de cada nodo en un grafo dirigido.
