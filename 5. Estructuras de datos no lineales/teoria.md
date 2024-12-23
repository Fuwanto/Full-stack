# Estructuras de datos no lineales

## 1. Árboles Binarios

Un **Árbol Binario** es una estructura de datos en la que cada nodo tiene como máximo dos hijos: un hijo izquierdo y un hijo derecho. Los árboles binarios se utilizan para representar jerarquías o para búsquedas rápidas.

#### Propiedades de los Árboles Binarios:

- Cada nodo tiene hasta dos hijos (izquierdo y derecho).
- El nodo raíz es el primer nodo del árbol.
- Los nodos hojas son aquellos que no tienen hijos.

En un **Árbol Binario de Búsqueda (BST)**, los nodos están organizados de manera que:

- Los valores en el subárbol izquierdo de un nodo son menores que el valor del nodo.
- Los valores en el subárbol derecho son mayores.

---

### Python

Primero, vamos a crear una clase para un **Árbol Binario de Búsqueda** básico:

```python
class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.izquierdo = None
        self.derecho = None

class ArbolBinarioBusqueda:
    def __init__(self):
        self.raiz = None

    def insertar(self, valor):
        if not self.raiz:
            self.raiz = Nodo(valor)
        else:
            self._insertar(self.raiz, valor)

    def _insertar(self, nodo, valor):
        if valor < nodo.valor:
            if nodo.izquierdo:
                self._insertar(nodo.izquierdo, valor)
            else:
                nodo.izquierdo = Nodo(valor)
        else:
            if nodo.derecho:
                self._insertar(nodo.derecho, valor)
            else:
                nodo.derecho = Nodo(valor)

    def buscar(self, valor):
        return self._buscar(self.raiz, valor)

    def _buscar(self, nodo, valor):
        if nodo is None:
            return False
        if nodo.valor == valor:
            return True
        elif valor < nodo.valor:
            return self._buscar(nodo.izquierdo, valor)
        else:
            return self._buscar(nodo.derecho, valor)

    def inorden(self):
        return self._inorden(self.raiz)

    def _inorden(self, nodo):
        if nodo:
            return self._inorden(nodo.izquierdo) + [nodo.valor] + self._inorden(nodo.derecho)
        return []

# Ejemplo de uso
arbol = ArbolBinarioBusqueda()
arbol.insertar(50)
arbol.insertar(30)
arbol.insertar(70)
arbol.insertar(20)
arbol.insertar(40)
arbol.insertar(60)
arbol.insertar(80)

print("Recorrido en orden:", arbol.inorden())  # Output: [20, 30, 40, 50, 60, 70, 80]
print("Buscar 40:", arbol.buscar(40))  # Output: True
print("Buscar 100:", arbol.buscar(100))  # Output: False
```

---

### Explicación del código:

- La clase `Nodo` representa un nodo del árbol binario, con un valor y referencias a los hijos izquierdo y derecho.
- La clase `ArbolBinarioBusqueda` tiene métodos para insertar elementos, buscar un valor, y realizar un recorrido en orden.
- El recorrido en orden (`inorden`) nos da los elementos del árbol en orden ascendente.

---

### JavaScript

Vamos a crear las funciones necesarias para insertar elementos y recorrer el árbol (en orden, preorden y postorden).

#### 1. Definir la clase para el Nodo

Cada nodo tendrá:

- Un **valor**.
- Referencias a los **hijos izquierdo** y **derecho**.

#### 2. Definir la clase para el Árbol Binario

En esta clase, implementamos métodos para insertar valores y recorrer el árbol de diferentes maneras.

#### Implementación:

```javascript
class Nodo {
  constructor(valor) {
    this.valor = valor;
    this.izquierdo = null;
    this.derecho = null;
  }
}

class ArbolBinario {
  constructor() {
    this.raiz = null;
  }

  // Insertar un valor en el árbol binario
  insertar(valor) {
    const nuevoNodo = new Nodo(valor);
    if (this.raiz === null) {
      this.raiz = nuevoNodo;
    } else {
      this.insertarRecursivo(this.raiz, nuevoNodo);
    }
  }

  insertarRecursivo(nodo, nuevoNodo) {
    if (nuevoNodo.valor < nodo.valor) {
      if (nodo.izquierdo === null) {
        nodo.izquierdo = nuevoNodo;
      } else {
        this.insertarRecursivo(nodo.izquierdo, nuevoNodo);
      }
    } else {
      if (nodo.derecho === null) {
        nodo.derecho = nuevoNodo;
      } else {
        this.insertarRecursivo(nodo.derecho, nuevoNodo);
      }
    }
  }

  // Recorrido en orden (Inorden)
  inorden(nodo) {
    if (nodo === null) return;
    this.inorden(nodo.izquierdo);
    console.log(nodo.valor);
    this.inorden(nodo.derecho);
  }

  // Recorrido en preorden
  preorden(nodo) {
    if (nodo === null) return;
    console.log(nodo.valor);
    this.preorden(nodo.izquierdo);
    this.preorden(nodo.derecho);
  }

  // Recorrido en postorden
  postorden(nodo) {
    if (nodo === null) return;
    this.postorden(nodo.izquierdo);
    this.postorden(nodo.derecho);
    console.log(nodo.valor);
  }

  // Método para mostrar el árbol
  imprimirEnOrden() {
    this.inorden(this.raiz);
  }

  imprimirPreOrden() {
    this.preorden(this.raiz);
  }

  imprimirPostOrden() {
    this.postorden(this.raiz);
  }
}

// Ejemplo de uso
const arbol = new ArbolBinario();
arbol.insertar(10);
arbol.insertar(5);
arbol.insertar(15);
arbol.insertar(3);
arbol.insertar(7);
arbol.insertar(13);
arbol.insertar(17);

console.log("Recorrido en orden (inorden):");
arbol.imprimirEnOrden(); // Output: 3 5 7 10 13 15 17

console.log("Recorrido en preorden:");
arbol.imprimirPreOrden(); // Output: 10 5 3 7 15 13 17

console.log("Recorrido en postorden:");
arbol.imprimirPostOrden(); // Output: 3 7 5 13 17 15 10
```

### Explicación:

1. **Clase Nodo**: Cada nodo tiene un valor, y referencias a los hijos izquierdo y derecho. Estos se inicializan como `null`.

2. **Clase ArbolBinario**:

   - El árbol tiene una propiedad `raiz`, que apunta al primer nodo (el nodo raíz).

   - El método `insertar` coloca un nuevo valor en el árbol, asegurándose de que el árbol se mantenga en orden. Utiliza un método recursivo para comparar y colocar el nodo en el lugar adecuado.

   - Los métodos

     ```
     inorden
     ```

     ,

     ```
     preorden
     ```

     y

     ```
     postorden
     ```

     son tres tipos de recorridos del árbol:

     - **Inorden (Orden Ascendente)**: Se recorre primero el subárbol izquierdo, luego el nodo, y finalmente el subárbol derecho.
     - **Preorden**: Se visita primero el nodo, luego el subárbol izquierdo y después el subárbol derecho.
     - **Postorden**: Se recorre primero el subárbol izquierdo, luego el subárbol derecho y finalmente el nodo.

3. **Recorridos**: Para cada tipo de recorrido, hemos definido un método que imprime los valores de los nodos en el orden respectivo.

### Conclusión:

Este es un **Árbol Binario** básico en **JavaScript**, donde puedes insertar valores y recorrer el árbol de tres maneras diferentes. Si deseas agregar más funcionalidades, como eliminar nodos o encontrar un valor específico, también es posible implementarlo fácilmente.

---

### Java

Crearemos una clase para el **Nodo** y una clase para el **Árbol Binario**. En este árbol binario, cada nodo tendrá como máximo dos hijos: izquierdo y derecho.

#### 1. Definir la clase Nodo

Cada nodo tendrá:

- Un **valor**.
- Referencias al **hijo izquierdo** y **hijo derecho**.

#### 2. Clase para el Árbol Binario

En esta clase implementaremos métodos para insertar elementos y recorrer el árbol en diferentes órdenes (inorden, preorden, postorden).

#### Implementación:

```java
class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

class ArbolBinario {
    private Nodo raiz;

    // Constructor
    public ArbolBinario() {
        this.raiz = null;
    }

    // Insertar un valor en el árbol binario
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);  // Si el nodo es nulo, creamos uno nuevo
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, valor);  // Insertamos en el subárbol izquierdo
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRecursivo(nodo.derecho, valor);  // Insertamos en el subárbol derecho
        }

        return nodo;  // Retornamos el nodo actualizado
    }

    // Recorrido en orden (Inorden)
    public void inorden() {
        inordenRecursivo(raiz);
    }

    private void inordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inordenRecursivo(nodo.izquierdo);  // Recorrer el subárbol izquierdo
            System.out.print(nodo.valor + " ");
            inordenRecursivo(nodo.derecho);  // Recorrer el subárbol derecho
        }
    }

    // Recorrido en preorden
    public void preorden() {
        preordenRecursivo(raiz);
    }

    private void preordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preordenRecursivo(nodo.izquierdo);  // Recorrer el subárbol izquierdo
            preordenRecursivo(nodo.derecho);  // Recorrer el subárbol derecho
        }
    }

    // Recorrido en postorden
    public void postorden() {
        postordenRecursivo(raiz);
    }

    private void postordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            postordenRecursivo(nodo.izquierdo);  // Recorrer el subárbol izquierdo
            postordenRecursivo(nodo.derecho);  // Recorrer el subárbol derecho
            System.out.print(nodo.valor + " ");
        }
    }
}

// Clase principal para probar el árbol
public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(13);
        arbol.insertar(17);

        System.out.println("Recorrido en orden (inorden):");
        arbol.inorden();  // Output: 3 5 7 10 13 15 17
        System.out.println();

        System.out.println("Recorrido en preorden:");
        arbol.preorden();  // Output: 10 5 3 7 15 13 17
        System.out.println();

        System.out.println("Recorrido en postorden:");
        arbol.postorden();  // Output: 3 7 5 13 17 15 10
        System.out.println();
    }
}
```

### Explicación:

1. **Clase Nodo**: Cada nodo tiene un valor, y referencias a los hijos izquierdo y derecho. Si no hay hijos, las referencias se establecen como `null`.

2. **Clase ArbolBinario**:

   - El árbol tiene una propiedad `raiz`, que es el primer nodo del árbol.

   - El método `insertar` inserta un nuevo valor en el árbol binario, manteniendo el orden. Si el valor es menor que el nodo actual, se inserta en el subárbol izquierdo; si es mayor, en el subárbol derecho.

   - Los métodos

     ```
     inorden
     ```

     ,

     ```
     preorden
     ```

     y

     ```
     postorden
     ```

     son tres tipos de recorridos del árbol:

     - **Inorden (Orden Ascendente)**: Se recorre primero el subárbol izquierdo, luego el nodo y después el subárbol derecho.
     - **Preorden**: Se visita primero el nodo, luego el subárbol izquierdo y después el subárbol derecho.
     - **Postorden**: Se recorre primero el subárbol izquierdo, luego el subárbol derecho y finalmente el nodo.

3. **Recorridos**: Cada uno de los recorridos (`inorden`, `preorden`, `postorden`) tiene un método recursivo que imprime los valores de los nodos en el orden especificado.

### Conclusión:

Este es un **Árbol Binario** básico en **Java** que permite insertar valores y recorrer el árbol de tres maneras diferentes. Los valores son insertados de acuerdo con las reglas de un árbol binario de búsqueda, y los métodos de recorrido permiten ver cómo están organizados.

---

## 2. Árbol AVL (Adelson-Velsky y Landis)

Un **Árbol AVL** es un tipo de **Árbol Binario de Búsqueda** que está balanceado, lo que significa que la diferencia de altura entre los subárboles izquierdo y derecho de cualquier nodo no puede ser mayor a 1. Si la diferencia de altura de cualquier nodo supera 1, se debe realizar una rotación para equilibrarlo.

#### Operaciones clave en un Árbol AVL:

1. **Rotación simple a la derecha (Right Rotation)**: Se utiliza cuando un subárbol izquierdo está demasiado alto.
2. **Rotación simple a la izquierda (Left Rotation)**: Se utiliza cuando un subárbol derecho está demasiado alto.
3. **Rotación doble a la derecha (Right-Left Rotation)**: Combinación de rotación a la derecha y luego a la izquierda.
4. **Rotación doble a la izquierda (Left-Right Rotation)**: Combinación de rotación a la izquierda y luego a la derecha.

La **altura** de un nodo es la distancia máxima desde el nodo hasta una hoja.

---

### Python

#### 1. Definimos el Nodo AVL

Cada nodo tendrá:

- Un valor.
- Un puntero al hijo izquierdo y al hijo derecho.
- La altura del nodo, que se usará para verificar el equilibrio.

#### 2. Clase para Árbol AVL

Aquí está la implementación básica del Árbol AVL con las rotaciones y la inserción balanceada:

```python
class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.izquierdo = None
        self.derecho = None
        self.altura = 1  # Altura del nodo

class ArbolAVL:
    def __init__(self):
        self.raiz = None

    # Función para obtener la altura de un nodo
    def altura(self, nodo):
        if not nodo:
            return 0
        return nodo.altura

    # Función para obtener el balance de un nodo
    def balance(self, nodo):
        if not nodo:
            return 0
        return self.altura(nodo.izquierdo) - self.altura(nodo.derecho)

    # Rotación simple a la derecha
    def rotacion_derecha(self, y):
        x = y.izquierdo
        T2 = x.derecho

        # Realizamos la rotación
        x.derecho = y
        y.izquierdo = T2

        # Actualizamos las alturas
        y.altura = max(self.altura(y.izquierdo), self.altura(y.derecho)) + 1
        x.altura = max(self.altura(x.izquierdo), self.altura(x.derecho)) + 1

        return x  # Nueva raíz

    # Rotación simple a la izquierda
    def rotacion_izquierda(self, x):
        y = x.derecho
        T2 = y.izquierdo

        # Realizamos la rotación
        y.izquierdo = x
        x.derecho = T2

        # Actualizamos las alturas
        x.altura = max(self.altura(x.izquierdo), self.altura(x.derecho)) + 1
        y.altura = max(self.altura(y.izquierdo), self.altura(y.derecho)) + 1

        return y  # Nueva raíz

    # Inserción en el árbol AVL
    def insertar(self, nodo, valor):
        # 1. Realizamos la inserción normal en el árbol binario de búsqueda
        if not nodo:
            return Nodo(valor)

        if valor < nodo.valor:
            nodo.izquierdo = self.insertar(nodo.izquierdo, valor)
        else:
            nodo.derecho = self.insertar(nodo.derecho, valor)

        # 2. Actualizamos la altura del nodo
        nodo.altura = 1 + max(self.altura(nodo.izquierdo), self.altura(nodo.derecho))

        # 3. Verificamos el balance
        balance = self.balance(nodo)

        # Si el nodo se desbalancea, realizamos las rotaciones correspondientes

        # Rotación a la derecha
        if balance > 1 and valor < nodo.izquierdo.valor:
            return self.rotacion_derecha(nodo)

        # Rotación a la izquierda
        if balance < -1 and valor > nodo.derecho.valor:
            return self.rotacion_izquierda(nodo)

        # Rotación izquierda-derecha
        if balance > 1 and valor > nodo.izquierdo.valor:
            nodo.izquierdo = self.rotacion_izquierda(nodo.izquierdo)
            return self.rotacion_derecha(nodo)

        # Rotación derecha-izquierda
        if balance < -1 and valor < nodo.derecho.valor:
            nodo.derecho = self.rotacion_derecha(nodo.derecho)
            return self.rotacion_izquierda(nodo)

        return nodo  # Retornamos el nodo balanceado

    # Método para insertar un valor
    def insertar_valor(self, valor):
        self.raiz = self.insertar(self.raiz, valor)

    # Recorrido en orden (inorden)
    def inorden(self, nodo):
        if nodo:
            return self.inorden(nodo.izquierdo) + [nodo.valor] + self.inorden(nodo.derecho)
        return []

# Ejemplo de uso
arbol = ArbolAVL()
arbol.insertar_valor(30)
arbol.insertar_valor(20)
arbol.insertar_valor(10)
arbol.insertar_valor(40)
arbol.insertar_valor(50)
arbol.insertar_valor(60)

print("Recorrido en orden del árbol AVL:", arbol.inorden(arbol.raiz))  # Output: [10, 20, 30, 40, 50, 60]
```

### Explicación:

- **Insertar**: Al insertar un nuevo valor, primero se realiza la inserción en un árbol binario normal. Después, se ajusta la altura del nodo y se verifica el balance.

- Rotaciones

  : Se aplican rotaciones simples o dobles dependiendo del tipo de desbalance.

  - **Rotación derecha**: Usada cuando el subárbol izquierdo es más alto.
  - **Rotación izquierda**: Usada cuando el subárbol derecho es más alto.
  - **Rotación doble**: Es una combinación de una rotación simple izquierda y una derecha o viceversa.

- **Inorden**: Realizamos un recorrido en orden para ver los valores del árbol de menor a mayor.

---

### JavaScript

La estructura será similar a la de Python, con la diferencia de que utilizaremos JavaScript para gestionar las rotaciones y el balanceo.

En este caso, definimos un nodo que contiene:

- **Valor**.
- **Referencias a los hijos izquierdo y derecho**.
- **Altura del nodo**, que se utiliza para evaluar el balance.

Luego, implementamos las funciones de **rotación** y **balanceo** al insertar nuevos valores.

#### 1. Definir la clase para el Nodo

El nodo contendrá:

- Un valor.
- Referencias a los hijos izquierdo y derecho.
- La altura del nodo.

#### 2. Implementar las rotaciones y balanceo

Aquí tienes el código para implementar un **Árbol AVL** en **JavaScript**:

```javascript
class Nodo {
  constructor(valor) {
    this.valor = valor;
    this.izquierdo = null;
    this.derecho = null;
    this.altura = 1; // Altura inicial del nodo
  }
}

class ArbolAVL {
  constructor() {
    this.raiz = null;
  }

  // Obtener la altura de un nodo
  altura(nodo) {
    if (!nodo) return 0;
    return nodo.altura;
  }

  // Obtener el balance de un nodo
  balance(nodo) {
    if (!nodo) return 0;
    return this.altura(nodo.izquierdo) - this.altura(nodo.derecho);
  }

  // Rotación simple a la derecha
  rotacionDerecha(y) {
    const x = y.izquierdo;
    const T2 = x.derecho;

    // Realizar la rotación
    x.derecho = y;
    y.izquierdo = T2;

    // Actualizar las alturas
    y.altura = Math.max(this.altura(y.izquierdo), this.altura(y.derecho)) + 1;
    x.altura = Math.max(this.altura(x.izquierdo), this.altura(x.derecho)) + 1;

    return x; // Nueva raíz
  }

  // Rotación simple a la izquierda
  rotacionIzquierda(x) {
    const y = x.derecho;
    const T2 = y.izquierdo;

    // Realizar la rotación
    y.izquierdo = x;
    x.derecho = T2;

    // Actualizar las alturas
    x.altura = Math.max(this.altura(x.izquierdo), this.altura(x.derecho)) + 1;
    y.altura = Math.max(this.altura(y.izquierdo), this.altura(y.derecho)) + 1;

    return y; // Nueva raíz
  }

  // Insertar un valor en el árbol
  insertar(nodo, valor) {
    // 1. Realizar la inserción en el árbol binario de búsqueda
    if (!nodo) return new Nodo(valor);

    if (valor < nodo.valor) {
      nodo.izquierdo = this.insertar(nodo.izquierdo, valor);
    } else if (valor > nodo.valor) {
      nodo.derecho = this.insertar(nodo.derecho, valor);
    } else {
      return nodo; // Los valores duplicados no están permitidos
    }

    // 2. Actualizar la altura del nodo
    nodo.altura =
      Math.max(this.altura(nodo.izquierdo), this.altura(nodo.derecho)) + 1;

    // 3. Verificar el balance y aplicar rotaciones si es necesario
    const balanceFactor = this.balance(nodo);

    // Si el nodo se desbalancea, realizamos las rotaciones adecuadas

    // Rotación a la derecha (Left-Left)
    if (balanceFactor > 1 && valor < nodo.izquierdo.valor) {
      return this.rotacionDerecha(nodo);
    }

    // Rotación a la izquierda (Right-Right)
    if (balanceFactor < -1 && valor > nodo.derecho.valor) {
      return this.rotacionIzquierda(nodo);
    }

    // Rotación izquierda-derecha (Left-Right)
    if (balanceFactor > 1 && valor > nodo.izquierdo.valor) {
      nodo.izquierdo = this.rotacionIzquierda(nodo.izquierdo);
      return this.rotacionDerecha(nodo);
    }

    // Rotación derecha-izquierda (Right-Left)
    if (balanceFactor < -1 && valor < nodo.derecho.valor) {
      nodo.derecho = this.rotacionDerecha(nodo.derecho);
      return this.rotacionIzquierda(nodo);
    }

    return nodo; // Retornamos el nodo balanceado
  }

  // Método para insertar un valor
  insertarValor(valor) {
    this.raiz = this.insertar(this.raiz, valor);
  }

  // Recorrido en orden (inorden)
  inorden(nodo) {
    if (!nodo) return [];
    return [
      ...this.inorden(nodo.izquierdo),
      nodo.valor,
      ...this.inorden(nodo.derecho),
    ];
  }
}

// Ejemplo de uso
const arbol = new ArbolAVL();
arbol.insertarValor(30);
arbol.insertarValor(20);
arbol.insertarValor(10);
arbol.insertarValor(40);
arbol.insertarValor(50);
arbol.insertarValor(60);

console.log("Recorrido en orden del árbol AVL:", arbol.inorden(arbol.raiz)); // Output: [10, 20, 30, 40, 50, 60]
```

### Explicación:

1. **Insertar**: El valor se inserta como en un árbol binario de búsqueda. Luego, se actualiza la altura del nodo y se verifica si el árbol está balanceado. Si el balance de un nodo excede 1, se aplica una rotación para restaurar el equilibrio.

2. Rotaciones

   : Las rotaciones son cruciales para mantener el balance:

   - **Rotación a la derecha**: Usada cuando el subárbol izquierdo es más alto.
   - **Rotación a la izquierda**: Usada cuando el subárbol derecho es más alto.
   - **Rotación izquierda-derecha y derecha-izquierda**: Combinaciones de las rotaciones anteriores.

3. **Recorrido en orden (Inorden)**: Permite obtener los valores del árbol en orden ascendente.

### Conclusión:

En este ejemplo, hemos implementado un **Árbol AVL** en **JavaScript**. Este árbol mantiene su equilibrio automáticamente utilizando rotaciones, lo que garantiza operaciones eficientes de búsqueda, inserción y eliminación.

---

### Java

El objetivo es crear una estructura de árbol binario balanceado mediante **rotaciones**. Primero definimos el **Nodo**, luego implementamos las **rotaciones**, el **balanceo** y la **inserción** de valores.

#### 1. Definir la clase Nodo

Cada **Nodo** tiene:

- Un valor.
- Referencias a los hijos izquierdo y derecho.
- La altura del nodo, que se utiliza para calcular el balance.

#### 2. Clase para Árbol AVL

A continuación, implementamos las funciones de rotación y balanceo:

```java
class Nodo {
    int valor;
    Nodo izquierdo, derecho;
    int altura;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
        this.altura = 1;  // Altura inicial del nodo
    }
}

class ArbolAVL {
    private Nodo raiz;

    // Obtener la altura de un nodo
    private int altura(Nodo nodo) {
        if (nodo == null) return 0;
        return nodo.altura;
    }

    // Obtener el balance de un nodo
    private int balance(Nodo nodo) {
        if (nodo == null) return 0;
        return altura(nodo.izquierdo) - altura(nodo.derecho);
    }

    // Rotación simple a la derecha
    private Nodo rotacionDerecha(Nodo y) {
        Nodo x = y.izquierdo;
        Nodo T2 = x.derecho;

        // Realizar la rotación
        x.derecho = y;
        y.izquierdo = T2;

        // Actualizar las alturas
        y.altura = Math.max(altura(y.izquierdo), altura(y.derecho)) + 1;
        x.altura = Math.max(altura(x.izquierdo), altura(x.derecho)) + 1;

        return x;  // Nueva raíz
    }

    // Rotación simple a la izquierda
    private Nodo rotacionIzquierda(Nodo x) {
        Nodo y = x.derecho;
        Nodo T2 = y.izquierdo;

        // Realizar la rotación
        y.izquierdo = x;
        x.derecho = T2;

        // Actualizar las alturas
        x.altura = Math.max(altura(x.izquierdo), altura(x.derecho)) + 1;
        y.altura = Math.max(altura(y.izquierdo), altura(y.derecho)) + 1;

        return y;  // Nueva raíz
    }

    // Insertar un valor en el árbol
    private Nodo insertar(Nodo nodo, int valor) {
        // 1. Realizar la inserción en el árbol binario de búsqueda
        if (nodo == null) return new Nodo(valor);

        if (valor < nodo.valor) {
            nodo.izquierdo = insertar(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertar(nodo.derecho, valor);
        } else {
            return nodo; // Los valores duplicados no están permitidos
        }

        // 2. Actualizar la altura del nodo
        nodo.altura = Math.max(altura(nodo.izquierdo), altura(nodo.derecho)) + 1;

        // 3. Verificar el balance y aplicar rotaciones si es necesario
        int balanceFactor = balance(nodo);

        // Si el nodo se desbalancea, realizamos las rotaciones adecuadas

        // Rotación a la derecha (Left-Left)
        if (balanceFactor > 1 && valor < nodo.izquierdo.valor) {
            return rotacionDerecha(nodo);
        }

        // Rotación a la izquierda (Right-Right)
        if (balanceFactor < -1 && valor > nodo.derecho.valor) {
            return rotacionIzquierda(nodo);
        }

        // Rotación izquierda-derecha (Left-Right)
        if (balanceFactor > 1 && valor > nodo.izquierdo.valor) {
            nodo.izquierdo = rotacionIzquierda(nodo.izquierdo);
            return rotacionDerecha(nodo);
        }

        // Rotación derecha-izquierda (Right-Left)
        if (balanceFactor < -1 && valor < nodo.derecho.valor) {
            nodo.derecho = rotacionDerecha(nodo.derecho);
            return rotacionIzquierda(nodo);
        }

        return nodo; // Retornamos el nodo balanceado
    }

    // Método para insertar un valor
    public void insertarValor(int valor) {
        raiz = insertar(raiz, valor);
    }

    // Recorrido en orden (inorden)
    public void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorden(nodo.derecho);
        }
    }

    // Método para imprimir el árbol en orden
    public void imprimirInorden() {
        inorden(raiz);
        System.out.println();
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();
        arbol.insertarValor(30);
        arbol.insertarValor(20);
        arbol.insertarValor(10);
        arbol.insertarValor(40);
        arbol.insertarValor(50);
        arbol.insertarValor(60);

        System.out.println("Recorrido en orden del árbol AVL:");
        arbol.imprimirInorden();  // Output: 10 20 30 40 50 60
    }
}
```

### Explicación:

1. **Insertar**: Al igual que en los otros lenguajes, se inserta un valor en el árbol binario de búsqueda. Luego, se ajusta la altura del nodo y se verifica el balance. Si el balance es incorrecto, se aplican las rotaciones necesarias.

2. Rotaciones

   : Existen cuatro tipos de rotaciones:

   - **Rotación derecha**: Se aplica cuando el subárbol izquierdo es más alto.
   - **Rotación izquierda**: Se aplica cuando el subárbol derecho es más alto.
   - **Rotación izquierda-derecha y derecha-izquierda**: Son combinaciones de las rotaciones anteriores.

3. **Recorrido en orden (Inorden)**: Imprime los valores del árbol de menor a mayor, gracias a la propiedad del árbol de búsqueda binaria.

### Conclusión:

Este es un **Árbol AVL** en **Java** que mantiene su balance automáticamente con rotaciones. Las operaciones de inserción y balanceo están optimizadas para mantener la eficiencia en todo momento.

---

## 3. Grafos (adyacencia, recorrido BFS y DFS)

### 1. Grafo mediante Matriz de Adyacencia

En este enfoque, utilizaremos una matriz para representar un grafo dirigido o no dirigido. Cada celda de la matriz indica si existe una arista entre dos nodos. Por ejemplo, si la celda `matriz[i][j]` es `1`, significa que hay una arista del nodo `i` al nodo `j`.

### 2. Recorridos del Grafo

- **BFS (Breadth-First Search)**: Es un recorrido en anchura, que explora todos los vecinos de un nodo antes de pasar a los nodos de nivel más profundo.
- **DFS (Depth-First Search)**: Es un recorrido en profundidad, que explora un camino completamente antes de retroceder.

### Python

Empezamos con la implementación en **Python** de un grafo representado por una matriz de adyacencia, y luego implementamos los recorridos **BFS** y **DFS**.

#### Grafo y Recorridos en Python

```python
from collections import deque

class Grafo:
    def __init__(self, vertices):
        self.vertices = vertices  # Número de vértices
        self.matriz_adyacencia = [[0] * vertices for _ in range(vertices)]  # Matriz de adyacencia

    # Método para agregar una arista entre dos vértices
    def agregar_arista(self, origen, destino):
        self.matriz_adyacencia[origen][destino] = 1
        self.matriz_adyacencia[destino][origen] = 1  # Para un grafo no dirigido

    # Recorrido BFS
    def bfs(self, inicio):
        visitado = [False] * self.vertices
        cola = deque([inicio])
        visitado[inicio] = True

        while cola:
            nodo = cola.popleft()
            print(nodo, end=" ")

            for i in range(self.vertices):
                if self.matriz_adyacencia[nodo][i] == 1 and not visitado[i]:
                    cola.append(i)
                    visitado[i] = True

    # Recorrido DFS
    def dfs(self, inicio):
        visitado = [False] * self.vertices
        self.dfs_recursivo(inicio, visitado)

    def dfs_recursivo(self, nodo, visitado):
        visitado[nodo] = True
        print(nodo, end=" ")

        for i in range(self.vertices):
            if self.matriz_adyacencia[nodo][i] == 1 and not visitado[i]:
                self.dfs_recursivo(i, visitado)

# Ejemplo de uso
grafo = Grafo(5)
grafo.agregar_arista(0, 1)
grafo.agregar_arista(0, 4)
grafo.agregar_arista(1, 2)
grafo.agregar_arista(1, 3)
grafo.agregar_arista(3, 4)

print("Recorrido BFS desde el vértice 0:")
grafo.bfs(0)  # Output esperado: 0 1 4 2 3

print("\nRecorrido DFS desde el vértice 0:")
grafo.dfs(0)  # Output esperado: 0 1 2 3 4
```

### Explicación:

1. Clase Grafo:
   - `self.matriz_adyacencia`: Es una matriz que representa las conexiones entre los nodos del grafo.
   - `agregar_arista`: Este método agrega una arista entre dos nodos. Para un grafo no dirigido, agregamos la arista en ambas direcciones.
2. Recorrido BFS:
   - Utiliza una **cola** (implementada con `deque` en Python).
   - El algoritmo explora los nodos nivel por nivel, comenzando desde el nodo de inicio y explorando primero todos los vecinos antes de pasar a nodos más lejanos.
3. Recorrido DFS:
   - Utiliza recursión.
   - El algoritmo explora los nodos de manera profunda, visitando un camino completo antes de retroceder y explorar otros caminos.

---

### JavaScript

1. **Grafo usando Matriz de Adyacencia**
2. **Recorridos BFS y DFS**

#### Implementación en JavaScript:

```javascript
class Grafo {
  constructor(vertices) {
    this.vertices = vertices; // Número de vértices
    this.matrizAdyacencia = Array.from({ length: vertices }, () =>
      Array(vertices).fill(0)
    ); // Matriz de adyacencia
  }

  // Método para agregar una arista entre dos vértices
  agregarArista(origen, destino) {
    this.matrizAdyacencia[origen][destino] = 1;
    this.matrizAdyacencia[destino][origen] = 1; // Para un grafo no dirigido
  }

  // Recorrido BFS
  bfs(inicio) {
    let visitado = new Array(this.vertices).fill(false);
    let cola = [inicio];
    visitado[inicio] = true;

    while (cola.length > 0) {
      let nodo = cola.shift();
      console.log(nodo, (end = " "));

      for (let i = 0; i < this.vertices; i++) {
        if (this.matrizAdyacencia[nodo][i] === 1 && !visitado[i]) {
          cola.push(i);
          visitado[i] = true;
        }
      }
    }
  }

  // Recorrido DFS
  dfs(inicio) {
    let visitado = new Array(this.vertices).fill(false);
    this.dfsRecursivo(inicio, visitado);
  }

  dfsRecursivo(nodo, visitado) {
    visitado[nodo] = true;
    console.log(nodo, (end = " "));

    for (let i = 0; i < this.vertices; i++) {
      if (this.matrizAdyacencia[nodo][i] === 1 && !visitado[i]) {
        this.dfsRecursivo(i, visitado);
      }
    }
  }
}

// Ejemplo de uso
const grafo = new Grafo(5);
grafo.agregarArista(0, 1);
grafo.agregarArista(0, 4);
grafo.agregarArista(1, 2);
grafo.agregarArista(1, 3);
grafo.agregarArista(3, 4);

console.log("Recorrido BFS desde el vértice 0:");
grafo.bfs(0); // Output esperado: 0 1 4 2 3

console.log("\nRecorrido DFS desde el vértice 0:");
grafo.dfs(0); // Output esperado: 0 1 2 3 4
```

### Explicación:

1. **Clase Grafo**:
   - `this.matrizAdyacencia`: Es la matriz que representa las conexiones entre los nodos. Es una matriz de tamaño `vertices x vertices`, con valores `1` si hay una arista entre los nodos, y `0` si no la hay.
   - `agregarArista`: Método para agregar una arista entre dos nodos. Para un grafo no dirigido, agregamos la arista en ambas direcciones (de `origen` a `destino` y de `destino` a `origen`).
2. **Recorrido BFS (Breadth-First Search)**:
   - Utiliza una **cola** para almacenar los nodos a visitar.
   - Primero visita el nodo de inicio y luego explora todos los nodos vecinos antes de pasar a los nodos de niveles más profundos.
3. **Recorrido DFS (Depth-First Search)**:
   - Utiliza recursión para explorar profundamente cada nodo antes de retroceder.
   - Visita el nodo de inicio, luego recorre un camino completo hacia los nodos vecinos, retrocediendo si es necesario.

---

### Java

1. **Grafo con Matriz de Adyacencia**
2. **Recorridos BFS y DFS**

#### Implementación en Java:

```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Grafo {
    private int vertices;  // Número de vértices
    private int[][] matrizAdyacencia;  // Matriz de adyacencia

    public Grafo(int vertices) {
        this.vertices = vertices;
        matrizAdyacencia = new int[vertices][vertices];  // Inicializamos la matriz de adyacencia
    }

    // Método para agregar una arista entre dos vértices
    public void agregarArista(int origen, int destino) {
        matrizAdyacencia[origen][destino] = 1;
        matrizAdyacencia[destino][origen] = 1;  // Para un grafo no dirigido
    }

    // Recorrido BFS
    public void bfs(int inicio) {
        boolean[] visitado = new boolean[vertices];
        Queue<Integer> cola = new LinkedList<>();
        cola.add(inicio);
        visitado[inicio] = true;

        while (!cola.isEmpty()) {
            int nodo = cola.poll();
            System.out.print(nodo + " ");

            for (int i = 0; i < vertices; i++) {
                if (matrizAdyacencia[nodo][i] == 1 && !visitado[i]) {
                    cola.add(i);
                    visitado[i] = true;
                }
            }
        }
    }

    // Recorrido DFS
    public void dfs(int inicio) {
        boolean[] visitado = new boolean[vertices];
        dfsRecursivo(inicio, visitado);
    }

    private void dfsRecursivo(int nodo, boolean[] visitado) {
        visitado[nodo] = true;
        System.out.print(nodo + " ");

        for (int i = 0; i < vertices; i++) {
            if (matrizAdyacencia[nodo][i] == 1 && !visitado[i]) {
                dfsRecursivo(i, visitado);
            }
        }
    }
}

// Clase principal para probar el grafo
public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(5);
        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 4);
        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(3, 4);

        System.out.println("Recorrido BFS desde el vértice 0:");
        grafo.bfs(0);  // Output esperado: 0 1 4 2 3
        System.out.println();

        System.out.println("Recorrido DFS desde el vértice 0:");
        grafo.dfs(0);  // Output esperado: 0 1 2 3 4
    }
}
```

### Explicación:

1. **Clase Grafo**:
   - `matrizAdyacencia`: Es la matriz de adyacencia que representa las conexiones entre los nodos del grafo. Cada celda `matrizAdyacencia[i][j]` será `1` si hay una arista entre los nodos `i` y `j`, y `0` si no la hay.
   - `agregarArista`: Método para agregar una arista entre dos nodos en un grafo no dirigido. Se establece la arista en ambas direcciones (de `origen` a `destino` y de `destino` a `origen`).
2. **Recorrido BFS (Breadth-First Search)**:
   - Utilizamos una **cola** (implementada con `Queue` de Java) para realizar el recorrido.
   - Empezamos en el nodo inicial y visitamos todos sus vecinos primero, antes de continuar hacia los nodos de nivel más profundo.
3. **Recorrido DFS (Depth-First Search)**:
   - Utilizamos recursión para explorar profundamente cada nodo.
   - Empezamos en el nodo inicial y exploramos todo un camino hasta el final antes de retroceder.

### Salida esperada:

- **BFS (Anchura)**: `0 1 4 2 3`
- **DFS (Profundidad)**: `0 1 2 3 4`
