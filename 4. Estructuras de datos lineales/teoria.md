# Estructuras de datos lineales

## 1. Arrays

### Python

En Python, los arreglos (arrays) son implementados comúnmente mediante listas. Las listas son estructuras dinámicas que pueden contener elementos de diferentes tipos y su tamaño es flexible. Sin embargo, para operaciones más eficientes en cuanto a espacio y velocidad (como la manipulación de datos numéricos), se pueden usar arrays del módulo `array` o bibliotecas como `NumPy`.

#### Características de las listas en Python:

- Pueden almacenar elementos de tipos mixtos.
- Son dinámicas, lo que significa que puedes agregar o eliminar elementos fácilmente.
- El acceso a los elementos es O(1), es decir, constante.

#### Operaciones básicas con listas en Python:

1. **Acceso** a elementos: Se realiza mediante el índice, empezando desde 0.
2. **Añadir** elementos: Se puede usar el método `.append()` o `.insert()`.
3. **Eliminar** elementos: Se puede usar `.remove()`, `del`, o `.pop()`.
4. **Recorrer**: Usamos un bucle `for` para recorrer los elementos.

---

### Ejemplos de operaciones con listas en Python

1. **Creación de un array/lista**:

```python
# Lista de enteros
array = [1, 2, 3, 4, 5]
print(array)
```

1. **Acceso a elementos**:

```python
# Acceso al primer elemento
print(array[0])  # Output: 1
# Acceso al último elemento
print(array[-1])  # Output: 5
```

1. **Añadir elementos**:

```python
# Añadir al final
array.append(6)
print(array)  # Output: [1, 2, 3, 4, 5, 6]

# Insertar en una posición específica
array.insert(2, 7)
print(array)  # Output: [1, 2, 7, 3, 4, 5, 6]
```

1. **Eliminar elementos**:

```python
# Eliminar por valor
array.remove(7)
print(array)  # Output: [1, 2, 3, 4, 5, 6]

# Eliminar por índice
del array[1]
print(array)  # Output: [1, 3, 4, 5, 6]

# Eliminar y obtener el último elemento
ultimo = array.pop()
print(ultimo)  # Output: 6
print(array)   # Output: [1, 3, 4, 5]
```

1. **Recorrer la lista**:

```python
for elemento in array:
    print(elemento)
```

1. **Buscar un elemento**:

```python
if 3 in array:
    print("Elemento encontrado")
```

1. **Longitud del array**:

```python
print(len(array))  # Output: 4
```

---

### JavaScript

#### Características de los Arrays en JavaScript:

- Los arrays pueden contener elementos de diferentes tipos (números, cadenas, objetos, etc.).
- Son dinámicos, por lo que no necesitas especificar el tamaño al crearlos.
- Se accede a los elementos mediante índices, comenzando desde 0.

#### Operaciones básicas con Arrays en JavaScript:

1. **Acceso** a elementos: Se usa el índice.
2. **Añadir** elementos: Se usa `.push()`, `.unshift()`, o `.splice()`.
3. **Eliminar** elementos: Se usa `.pop()`, `.shift()`, o `.splice()`.
4. **Recorrer**: Se puede usar un bucle `for`, `.forEach()`, o métodos como `.map()`.

---

### Ejemplos de operaciones con Arrays en JavaScript

1. **Creación de un array**:

```javascript
// Array de enteros
let array = [1, 2, 3, 4, 5];
console.log(array); // Output: [1, 2, 3, 4, 5]
```

1. **Acceso a elementos**:

```javascript
// Acceso al primer elemento
console.log(array[0]); // Output: 1

// Acceso al último elemento
console.log(array[array.length - 1]); // Output: 5
```

1. **Añadir elementos**:

```javascript
// Añadir al final
array.push(6);
console.log(array); // Output: [1, 2, 3, 4, 5, 6]

// Insertar en la primera posición
array.unshift(0);
console.log(array); // Output: [0, 1, 2, 3, 4, 5, 6]

// Insertar en una posición específica
array.splice(2, 0, 7);
console.log(array); // Output: [0, 1, 7, 2, 3, 4, 5, 6]
```

1. **Eliminar elementos**:

```javascript
// Eliminar el último elemento
let ultimo = array.pop();
console.log(ultimo); // Output: 6
console.log(array); // Output: [0, 1, 7, 2, 3, 4, 5]

// Eliminar el primer elemento
let primero = array.shift();
console.log(primero); // Output: 0
console.log(array); // Output: [1, 7, 2, 3, 4, 5]

// Eliminar en una posición específica
array.splice(2, 1);
console.log(array); // Output: [1, 7, 3, 4, 5]
```

1. **Recorrer el array**:

```javascript
array.forEach(function (elemento) {
  console.log(elemento);
});

// O utilizando una función de flecha
array.forEach((elemento) => console.log(elemento));
```

1. **Buscar un elemento**:

```javascript
if (array.includes(3)) {
  console.log("Elemento encontrado");
} else {
  console.log("Elemento no encontrado");
}
```

1. **Longitud del array**:

```javascript
console.log(array.length); // Output: 5
```

---

### Java

#### Características de los Arrays en Java:

- Los arrays en Java tienen un tamaño fijo después de su creación.
- Todos los elementos en un array deben ser del mismo tipo.
- Se accede a los elementos usando índices, empezando desde 0.
- Pueden ser unidimensionales (como una lista simple) o multidimensionales (matrices).

#### Operaciones básicas con Arrays en Java:

1. **Acceso** a elementos: Se hace mediante el índice.
2. **Añadir elementos**: En Java, los arrays tienen un tamaño fijo, por lo que no puedes agregar elementos una vez creado el array (a menos que uses una estructura dinámica como `ArrayList`).
3. **Eliminar elementos**: Al igual que la adición, no puedes eliminar elementos directamente de un array; tendrías que crear un nuevo array.
4. **Recorrer**: Usamos un bucle `for` o `for-each`.

---

### Ejemplos de operaciones con Arrays en Java

1. **Creación de un array**:

```java
public class ArraysEjemplo {
    public static void main(String[] args) {
        // Array de enteros
        int[] array = {1, 2, 3, 4, 5};

        // Imprimir el array completo
        for (int i : array) {
            System.out.print(i + " ");  // Output: 1 2 3 4 5
        }
    }
}
```

1. **Acceso a elementos**:

```java
public class ArraysEjemplo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Acceso al primer elemento
        System.out.println(array[0]);  // Output: 1

        // Acceso al último elemento
        System.out.println(array[array.length - 1]);  // Output: 5
    }
}
```

1. **Modificar elementos**:

```java
public class ArraysEjemplo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Modificar el segundo elemento
        array[1] = 10;
        System.out.println(array[1]);  // Output: 10
    }
}
```

1. **Recorrer el array**:

```java
public class ArraysEjemplo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Usando un bucle for tradicional
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        // Output: 1 2 3 4 5

        // Usando un bucle for-each
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Output: 1 2 3 4 5
    }
}
```

1. **Buscar un elemento**:

```java
public class ArraysEjemplo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Buscar si el número 3 está en el array
        boolean encontrado = false;
        for (int i : array) {
            if (i == 3) {
                encontrado = true;
                break;
            }
        }
        System.out.println("Elemento encontrado: " + encontrado);  // Output: Elemento encontrado: true
    }
}
```

1. **Longitud del array**:

```java
public class ArraysEjemplo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(array.length);  // Output: 5
    }
}
```

---

En Java, los arrays son de tamaño fijo, lo que significa que no se pueden agregar ni eliminar elementos una vez creado el array. Si necesitas una estructura más flexible, puedes considerar usar una **`ArrayList`**, que permite agregar y eliminar elementos dinámicamente.

---

## 2. Listas Enlazadas Simples

### Python

Una lista enlazada es una estructura de datos en la que cada elemento (nodo) contiene dos partes:

1. **Valor de los datos**.
2. **Referencia (enlace)** al siguiente nodo en la lista.

La ventaja de las listas enlazadas sobre los arrays es que no requieren un tamaño fijo y pueden crecer dinámicamente.

#### Características:

- Los nodos son objetos con dos partes: valor y enlace al siguiente nodo.
- El último nodo tiene un enlace `None`, indicando el final de la lista.

#### Operaciones básicas:

1. **Inserción**: Insertar elementos al principio, al final o en una posición específica.
2. **Eliminación**: Eliminar el primer nodo, el último nodo o un nodo en particular.
3. **Recorrido**: Recorrer la lista desde el principio hasta el final.

---

### Implementación de una lista enlazada simple en Python

1. **Definir un nodo**:

```python
class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None  # Enlace al siguiente nodo

class ListaEnlazada:
    def __init__(self):
        self.primero = None  # La lista empieza vacía

    def insertar_inicio(self, dato):
        nuevo_nodo = Nodo(dato)
        nuevo_nodo.siguiente = self.primero
        self.primero = nuevo_nodo

    def eliminar_inicio(self):
        if self.primero:
            self.primero = self.primero.siguiente  # Eliminar el primer nodo

    def mostrar(self):
        actual = self.primero
        while actual:
            print(actual.dato, end=" -> ")
            actual = actual.siguiente
        print("None")

# Ejemplo
lista = ListaEnlazada()
lista.insertar_inicio(10)
lista.insertar_inicio(20)
lista.insertar_inicio(30)
lista.mostrar()  # Output: 30 -> 20 -> 10 -> None

lista.eliminar_inicio()
lista.mostrar()  # Output: 20 -> 10 -> None
```

---

### Explicación:

- **Nodo**: Cada nodo tiene un dato y una referencia al siguiente nodo.
- **ListaEnlazada**: La clase que gestiona los nodos. El primer nodo (`primero`) es el punto de entrada a la lista.
- **insertar_inicio**: Inserta un nuevo nodo al principio de la lista.
- **eliminar_inicio**: Elimina el primer nodo de la lista.
- **mostrar**: Recorrer y mostrar todos los nodos de la lista.

---

### JavaScript

#### Definición de un Nodo y la Lista Enlazada

1. **Nodo**: Es el elemento básico de la lista, que contiene un valor y una referencia al siguiente nodo.
2. **Lista Enlazada**: Es la estructura que gestiona la lista de nodos. Mantiene un puntero al primer nodo.

---

### Implementación de una lista enlazada simple en JavaScript

1. **Definir el Nodo**:

```javascript
class Nodo {
  constructor(dato) {
    this.dato = dato;
    this.siguiente = null; // Enlace al siguiente nodo
  }
}

class ListaEnlazada {
  constructor() {
    this.primero = null; // La lista empieza vacía
  }

  // Insertar un nodo al principio de la lista
  insertarInicio(dato) {
    const nuevoNodo = new Nodo(dato);
    nuevoNodo.siguiente = this.primero;
    this.primero = nuevoNodo;
  }

  // Eliminar el primer nodo
  eliminarInicio() {
    if (this.primero !== null) {
      this.primero = this.primero.siguiente; // Eliminar el primer nodo
    }
  }

  // Mostrar todos los elementos de la lista
  mostrar() {
    let actual = this.primero;
    while (actual) {
      console.log(actual.dato);
      actual = actual.siguiente;
    }
  }
}

// Ejemplo de uso
const lista = new ListaEnlazada();
lista.insertarInicio(10);
lista.insertarInicio(20);
lista.insertarInicio(30);
lista.mostrar(); // Output: 30 20 10

lista.eliminarInicio();
lista.mostrar(); // Output: 20 10
```

---

### Explicación:

- **Nodo**: La clase `Nodo` tiene dos propiedades: `dato` (el valor del nodo) y `siguiente` (la referencia al siguiente nodo, que empieza en `null`).
- **ListaEnlazada**: La clase `ListaEnlazada` gestiona la lista. Tiene un puntero `primero`, que es el primer nodo de la lista.
- **insertarInicio**: Inserta un nodo al principio de la lista, actualizando el puntero `siguiente` del nuevo nodo para que apunte al nodo anterior.
- **eliminarInicio**: Elimina el primer nodo de la lista.
- **mostrar**: Recorre la lista desde el primer nodo e imprime cada dato.

---

### Java

#### Definición de Nodo y Lista Enlazada

1. **Nodo**: Contiene el dato y una referencia al siguiente nodo.
2. **Lista Enlazada**: La clase que maneja la lista enlazada, con un puntero al primer nodo.

---

### Implementación de una lista enlazada simple en Java

1. **Definir el Nodo**:

```java
public class Nodo {
    int dato;
    Nodo siguiente;  // Referencia al siguiente nodo

    // Constructor
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class ListaEnlazada {
    Nodo primero;  // Primer nodo de la lista

    // Constructor
    public ListaEnlazada() {
        this.primero = null;
    }

    // Insertar un nodo al principio de la lista
    public void insertarInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
    }

    // Eliminar el primer nodo
    public void eliminarInicio() {
        if (primero != null) {
            primero = primero.siguiente;  // Eliminar el primer nodo
        }
    }

    // Mostrar todos los elementos de la lista
    public void mostrar() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Método principal para probar la lista
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarInicio(10);
        lista.insertarInicio(20);
        lista.insertarInicio(30);
        lista.mostrar();  // Output: 30 20 10

        lista.eliminarInicio();
        lista.mostrar();  // Output: 20 10
    }
}
```

---

### Explicación:

- **Nodo**: La clase `Nodo` tiene dos propiedades: `dato` (el valor del nodo) y `siguiente` (una referencia al siguiente nodo, que inicialmente es `null`).
- **ListaEnlazada**: Esta clase tiene un puntero `primero`, que apunta al primer nodo de la lista.
- **insertarInicio**: Crea un nuevo nodo y lo inserta al principio de la lista. El nuevo nodo apunta al nodo anterior que estaba al inicio.
- **eliminarInicio**: Elimina el primer nodo de la lista, actualizando `primero` para que apunte al siguiente nodo.
- **mostrar**: Recorre la lista y muestra el valor de cada nodo.

---

## 3. Listas Enlazadas Dobles

Una **lista enlazada doble** es una estructura de datos en la que cada nodo tiene dos referencias:

1. **Referencia al siguiente nodo** (como en una lista enlazada simple).
2. **Referencia al nodo anterior**, lo que permite recorrer la lista en ambas direcciones (de principio a fin y viceversa).

Este tipo de lista es útil cuando se necesitan operaciones de inserción y eliminación eficientes tanto al principio como al final de la lista.

---

### Python

Empezaremos con la implementación de listas enlazadas dobles en Python. Cada nodo tendrá tres propiedades:

1. `dato` (el valor del nodo).
2. `siguiente` (referencia al siguiente nodo).
3. `anterior` (referencia al nodo anterior).

#### Operaciones básicas:

1. **Inserción**: Insertar elementos al principio, al final o en una posición específica.
2. **Eliminación**: Eliminar nodos al principio, al final o en una posición específica.
3. **Recorrido**: Recorrer la lista desde el principio hasta el final y viceversa.

---

### Implementación de una lista enlazada doble en Python

```python
class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None  # Referencia al siguiente nodo
        self.anterior = None   # Referencia al nodo anterior

class ListaEnlazadaDoble:
    def __init__(self):
        self.primero = None  # La lista empieza vacía
        self.ultimo = None   # El último nodo también empieza siendo None

    # Insertar un nodo al principio
    def insertar_inicio(self, dato):
        nuevo_nodo = Nodo(dato)
        if self.primero is None:  # Si la lista está vacía
            self.primero = self.ultimo = nuevo_nodo
        else:
            nuevo_nodo.siguiente = self.primero
            self.primero.anterior = nuevo_nodo
            self.primero = nuevo_nodo

    # Insertar un nodo al final
    def insertar_final(self, dato):
        nuevo_nodo = Nodo(dato)
        if self.ultimo is None:  # Si la lista está vacía
            self.primero = self.ultimo = nuevo_nodo
        else:
            self.ultimo.siguiente = nuevo_nodo
            nuevo_nodo.anterior = self.ultimo
            self.ultimo = nuevo_nodo

    # Eliminar el primer nodo
    def eliminar_inicio(self):
        if self.primero:
            if self.primero.siguiente is None:  # Si hay solo un nodo
                self.primero = self.ultimo = None
            else:
                self.primero = self.primero.siguiente
                self.primero.anterior = None

    # Eliminar el último nodo
    def eliminar_final(self):
        if self.ultimo:
            if self.ultimo.anterior is None:  # Si hay solo un nodo
                self.primero = self.ultimo = None
            else:
                self.ultimo = self.ultimo.anterior
                self.ultimo.siguiente = None

    # Mostrar la lista desde el principio
    def mostrar_inicio(self):
        actual = self.primero
        while actual:
            print(actual.dato, end=" <-> ")
            actual = actual.siguiente
        print("None")

    # Mostrar la lista desde el final
    def mostrar_final(self):
        actual = self.ultimo
        while actual:
            print(actual.dato, end=" <-> ")
            actual = actual.anterior
        print("None")

# Ejemplo de uso
lista = ListaEnlazadaDoble()
lista.insertar_inicio(10)
lista.insertar_inicio(20)
lista.insertar_final(30)
lista.mostrar_inicio()  # Output: 20 <-> 10 <-> 30 <-> None

lista.eliminar_inicio()
lista.mostrar_inicio()  # Output: 10 <-> 30 <-> None

lista.eliminar_final()
lista.mostrar_inicio()  # Output: 10 <-> None
```

---

### Explicación:

- **Nodo**: Cada nodo tiene tres propiedades: `dato`, `siguiente` (referencia al siguiente nodo) y `anterior` (referencia al nodo anterior).
- **ListaEnlazadaDoble**: La clase que gestiona la lista enlazada doble. Mantiene punteros tanto al primer nodo (`primero`) como al último nodo (`ultimo`).
- **insertar_inicio**: Inserta un nuevo nodo al principio de la lista, ajustando las referencias `siguiente` y `anterior` de los nodos involucrados.
- **insertar_final**: Inserta un nuevo nodo al final de la lista.
- **eliminar_inicio**: Elimina el primer nodo de la lista.
- **eliminar_final**: Elimina el último nodo de la lista.
- **mostrar_inicio**: Muestra los elementos de la lista desde el principio hasta el final.
- **mostrar_final**: Muestra los elementos de la lista desde el final hasta el principio.

---

### JavaScript

1. **Definir el Nodo**:

```javascript
class Nodo {
  constructor(dato) {
    this.dato = dato;
    this.siguiente = null; // Referencia al siguiente nodo
    this.anterior = null; // Referencia al nodo anterior
  }
}

class ListaEnlazadaDoble {
  constructor() {
    this.primero = null; // Primer nodo de la lista
    this.ultimo = null; // Último nodo de la lista
  }

  // Insertar un nodo al principio
  insertarInicio(dato) {
    const nuevoNodo = new Nodo(dato);
    if (this.primero === null) {
      // Si la lista está vacía
      this.primero = this.ultimo = nuevoNodo;
    } else {
      nuevoNodo.siguiente = this.primero;
      this.primero.anterior = nuevoNodo;
      this.primero = nuevoNodo;
    }
  }

  // Insertar un nodo al final
  insertarFinal(dato) {
    const nuevoNodo = new Nodo(dato);
    if (this.ultimo === null) {
      // Si la lista está vacía
      this.primero = this.ultimo = nuevoNodo;
    } else {
      this.ultimo.siguiente = nuevoNodo;
      nuevoNodo.anterior = this.ultimo;
      this.ultimo = nuevoNodo;
    }
  }

  // Eliminar el primer nodo
  eliminarInicio() {
    if (this.primero !== null) {
      if (this.primero.siguiente === null) {
        // Si hay solo un nodo
        this.primero = this.ultimo = null;
      } else {
        this.primero = this.primero.siguiente;
        this.primero.anterior = null;
      }
    }
  }

  // Eliminar el último nodo
  eliminarFinal() {
    if (this.ultimo !== null) {
      if (this.ultimo.anterior === null) {
        // Si hay solo un nodo
        this.primero = this.ultimo = null;
      } else {
        this.ultimo = this.ultimo.anterior;
        this.ultimo.siguiente = null;
      }
    }
  }

  // Mostrar la lista desde el principio
  mostrarInicio() {
    let actual = this.primero;
    while (actual !== null) {
      console.log(actual.dato, "<->");
      actual = actual.siguiente;
    }
    console.log("null");
  }

  // Mostrar la lista desde el final
  mostrarFinal() {
    let actual = this.ultimo;
    while (actual !== null) {
      console.log(actual.dato, "<->");
      actual = actual.anterior;
    }
    console.log("null");
  }
}

// Ejemplo de uso
const lista = new ListaEnlazadaDoble();
lista.insertarInicio(10);
lista.insertarInicio(20);
lista.insertarFinal(30);
lista.mostrarInicio(); // Output: 20 <-> 10 <-> 30 <-> null

lista.eliminarInicio();
lista.mostrarInicio(); // Output: 10 <-> 30 <-> null

lista.eliminarFinal();
lista.mostrarInicio(); // Output: 10 <-> null
```

---

### Explicación:

- **Nodo**: La clase `Nodo` tiene tres propiedades: `dato` (el valor del nodo), `siguiente` (referencia al siguiente nodo) y `anterior` (referencia al nodo anterior).
- **ListaEnlazadaDoble**: La clase que gestiona la lista. Tiene dos punteros: `primero` (para el primer nodo) y `ultimo` (para el último nodo).
- **insertarInicio**: Inserta un nodo al principio de la lista. Si la lista está vacía, el nuevo nodo es tanto el primer como el último nodo.
- **insertarFinal**: Inserta un nodo al final de la lista. Si la lista está vacía, el nuevo nodo es el primero y el último.
- **eliminarInicio**: Elimina el primer nodo de la lista, actualizando el puntero `primero`.
- **eliminarFinal**: Elimina el último nodo de la lista, actualizando el puntero `ultimo`.
- **mostrarInicio**: Recorre la lista desde el principio y muestra cada valor.
- **mostrarFinal**: Recorre la lista desde el final y muestra cada valor.

---

### Java

1. **Definir el Nodo**:

```java
public class Nodo {
    int dato;
    Nodo siguiente;  // Referencia al siguiente nodo
    Nodo anterior;   // Referencia al nodo anterior

    // Constructor
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}

public class ListaEnlazadaDoble {
    Nodo primero;  // Primer nodo de la lista
    Nodo ultimo;   // Último nodo de la lista

    // Constructor
    public ListaEnlazadaDoble() {
        this.primero = null;
        this.ultimo = null;
    }

    // Insertar un nodo al principio
    public void insertarInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (this.primero == null) {  // Si la lista está vacía
            this.primero = this.ultimo = nuevoNodo;
        } else {
            nuevoNodo.siguiente = this.primero;
            this.primero.anterior = nuevoNodo;
            this.primero = nuevoNodo;
        }
    }

    // Insertar un nodo al final
    public void insertarFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (this.ultimo == null) {  // Si la lista está vacía
            this.primero = this.ultimo = nuevoNodo;
        } else {
            this.ultimo.siguiente = nuevoNodo;
            nuevoNodo.anterior = this.ultimo;
            this.ultimo = nuevoNodo;
        }
    }

    // Eliminar el primer nodo
    public void eliminarInicio() {
        if (this.primero != null) {
            if (this.primero.siguiente == null) {  // Si hay solo un nodo
                this.primero = this.ultimo = null;
            } else {
                this.primero = this.primero.siguiente;
                this.primero.anterior = null;
            }
        }
    }

    // Eliminar el último nodo
    public void eliminarFinal() {
        if (this.ultimo != null) {
            if (this.ultimo.anterior == null) {  // Si hay solo un nodo
                this.primero = this.ultimo = null;
            } else {
                this.ultimo = this.ultimo.anterior;
                this.ultimo.siguiente = null;
            }
        }
    }

    // Mostrar la lista desde el principio
    public void mostrarInicio() {
        Nodo actual = this.primero;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Mostrar la lista desde el final
    public void mostrarFinal() {
        Nodo actual = this.ultimo;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        }
        System.out.println("null");
    }

    // Método principal para probar la lista
    public static void main(String[] args) {
        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();

        lista.insertarInicio(10);
        lista.insertarInicio(20);
        lista.insertarFinal(30);
        lista.mostrarInicio();  // Output: 20 <-> 10 <-> 30 <-> null

        lista.eliminarInicio();
        lista.mostrarInicio();  // Output: 10 <-> 30 <-> null

        lista.eliminarFinal();
        lista.mostrarInicio();  // Output: 10 <-> null
    }
}
```

---

### Explicación:

- **Nodo**: La clase `Nodo` tiene tres propiedades: `dato` (el valor del nodo), `siguiente` (referencia al siguiente nodo) y `anterior` (referencia al nodo anterior).
- **ListaEnlazadaDoble**: La clase que gestiona la lista. Mantiene punteros a los nodos `primero` y `ultimo`.
- **insertarInicio**: Inserta un nodo al principio de la lista. Si la lista está vacía, el nuevo nodo será tanto el primero como el último.
- **insertarFinal**: Inserta un nodo al final de la lista. Si la lista está vacía, el nuevo nodo será el primero y el último.
- **eliminarInicio**: Elimina el primer nodo de la lista, actualizando el puntero `primero`.
- **eliminarFinal**: Elimina el último nodo de la lista, actualizando el puntero `ultimo`.
- **mostrarInicio**: Muestra los valores de la lista desde el principio hasta el final.
- **mostrarFinal**: Muestra los valores de la lista desde el final hasta el principio.

---

## 4. Pilas (Stacks)

- **Push**: Añadir un elemento a la pila.
- **Pop**: Eliminar el elemento superior de la pila y devolverlo.
- **Peek**: Obtener el elemento superior de la pila sin eliminarlo.

Una **pila** es una estructura de datos en la que el último elemento añadido es el primero en ser removido (LIFO: Last In, First Out).

---

### Python

En Python, podemos usar una lista (`list`) para implementar una pila, ya que tiene métodos como `append()` para añadir elementos y `pop()` para eliminar elementos.

#### Implementación de una pila en Python

```python
class Pila:
    def __init__(self):
        self.elementos = []  # Usamos una lista para almacenar los elementos

    # Push: Añadir un elemento a la pila
    def push(self, dato):
        self.elementos.append(dato)

    # Pop: Eliminar el elemento superior de la pila y devolverlo
    def pop(self):
        if self.esta_vacia():
            return "La pila está vacía"
        return self.elementos.pop()

    # Peek: Obtener el elemento superior de la pila sin eliminarlo
    def peek(self):
        if self.esta_vacia():
            return "La pila está vacía"
        return self.elementos[-1]

    # Verificar si la pila está vacía
    def esta_vacia(self):
        return len(self.elementos) == 0

    # Mostrar el contenido de la pila
    def mostrar(self):
        print(self.elementos)

# Ejemplo de uso
pila = Pila()
pila.push(10)
pila.push(20)
pila.push(30)

print("Elemento superior (peek):", pila.peek())  # Output: 30
pila.mostrar()  # Output: [10, 20, 30]

print("Elemento eliminado (pop):", pila.pop())  # Output: 30
pila.mostrar()  # Output: [10, 20]
```

---

### Explicación:

- **Push**: Se usa el método `append()` de la lista para agregar elementos al final, que es el tope de la pila.
- **Pop**: Usamos el método `pop()` de la lista para eliminar el último elemento y devolverlo. Si la pila está vacía, devolvemos un mensaje de error.
- **Peek**: Accedemos al último elemento de la lista sin eliminarlo usando `[-1]`.
- **esta_vacia**: Verifica si la lista está vacía.
- **mostrar**: Muestra todos los elementos de la pila.

---

### JavaScript

En JavaScript, una forma sencilla de implementar una pila es utilizando un array. Los arrays en JavaScript tienen métodos como `push()` para agregar elementos y `pop()` para eliminar el último elemento, lo que hace que los arrays sean ideales para implementar pilas.

#### Implementación de una pila en JavaScript

```javascript
class Pila {
  constructor() {
    this.elementos = []; // Usamos un array para almacenar los elementos
  }

  // Push: Añadir un elemento a la pila
  push(dato) {
    this.elementos.push(dato);
  }

  // Pop: Eliminar el elemento superior de la pila y devolverlo
  pop() {
    if (this.estaVacia()) {
      return "La pila está vacía";
    }
    return this.elementos.pop();
  }

  // Peek: Obtener el elemento superior de la pila sin eliminarlo
  peek() {
    if (this.estaVacia()) {
      return "La pila está vacía";
    }
    return this.elementos[this.elementos.length - 1];
  }

  // Verificar si la pila está vacía
  estaVacia() {
    return this.elementos.length === 0;
  }

  // Mostrar el contenido de la pila
  mostrar() {
    console.log(this.elementos);
  }
}

// Ejemplo de uso
const pila = new Pila();
pila.push(10);
pila.push(20);
pila.push(30);

console.log("Elemento superior (peek):", pila.peek()); // Output: 30
pila.mostrar(); // Output: [10, 20, 30]

console.log("Elemento eliminado (pop):", pila.pop()); // Output: 30
pila.mostrar(); // Output: [10, 20]
```

---

### Explicación:

- **Push**: Usamos el método `push()` del array para agregar un elemento al final (tope de la pila).
- **Pop**: Usamos el método `pop()` del array para eliminar y devolver el último elemento. Si la pila está vacía, devolvemos un mensaje de error.
- **Peek**: Accedemos al último elemento del array usando `this.elementos[this.elementos.length - 1]` sin eliminarlo.
- **estaVacia**: Verifica si el array está vacío comprobando su longitud.
- **mostrar**: Muestra los elementos actuales de la pila.

---

### Pilas en Java

En Java, puedes implementar una pila utilizando una clase que administre una lista de elementos. Usaremos la clase `LinkedList` o `ArrayList` para almacenarlos, pero aquí te mostraré la implementación utilizando una lista enlazada (`LinkedList`), ya que es una estructura de datos común para este tipo de implementaciones.

#### Implementación de una pila en Java

```java
import java.util.LinkedList;

public class Pila {
    private LinkedList<Integer> elementos;  // Usamos LinkedList para almacenar los elementos

    // Constructor
    public Pila() {
        this.elementos = new LinkedList<>();
    }

    // Push: Añadir un elemento a la pila
    public void push(int dato) {
        this.elementos.addFirst(dato);  // Añadimos al principio de la lista
    }

    // Pop: Eliminar el elemento superior de la pila y devolverlo
    public int pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return -1;  // Devolvemos un valor que indica que la pila está vacía
        }
        return this.elementos.removeFirst();  // Eliminamos el primer elemento
    }

    // Peek: Obtener el elemento superior de la pila sin eliminarlo
    public int peek() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return -1;  // Devolvemos un valor que indica que la pila está vacía
        }
        return this.elementos.getFirst();  // Obtenemos el primer elemento sin eliminarlo
    }

    // Verificar si la pila está vacía
    public boolean estaVacia() {
        return this.elementos.isEmpty();  // Verificamos si la lista está vacía
    }

    // Mostrar el contenido de la pila
    public void mostrar() {
        System.out.println(this.elementos);
    }

    // Método principal para probar la pila
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("Elemento superior (peek): " + pila.peek());  // Output: 30
        pila.mostrar();  // Output: [30, 20, 10]

        System.out.println("Elemento eliminado (pop): " + pila.pop());  // Output: 30
        pila.mostrar();  // Output: [20, 10]
    }
}
```

---

### Explicación:

- **Push**: Utilizamos `addFirst()` de `LinkedList` para agregar el elemento al principio de la lista, que representa el tope de la pila.
- **Pop**: Usamos `removeFirst()` para eliminar y devolver el primer elemento de la lista, que es el más reciente (el elemento superior de la pila).
- **Peek**: Usamos `getFirst()` para acceder al primer elemento sin eliminarlo.
- **estaVacia**: Comprobamos si la lista está vacía usando `isEmpty()`.
- **mostrar**: Muestra los elementos actuales de la pila.

---

## 5. Colas (Queues)

- **Enqueue**: Añadir un elemento a la cola.
- **Dequeue**: Eliminar el primer elemento de la cola y devolverlo.

Una **cola** es una estructura de datos donde los elementos se añaden por un lado (final) y se eliminan por el otro (principio), lo que sigue el principio **FIFO** (First In, First Out).

---

### Python

En Python, podemos usar una lista (`list`), pero para un rendimiento óptimo al eliminar elementos del principio de la lista, usaremos el módulo `collections.deque`, que está diseñado para operaciones de cola de manera eficiente.

#### Implementación de una cola en Python

```python
from collections import deque

class Cola:
    def __init__(self):
        self.elementos = deque()  # Usamos deque para una implementación eficiente de la cola

    # Enqueue: Añadir un elemento a la cola
    def enqueue(self, dato):
        self.elementos.append(dato)

    # Dequeue: Eliminar el primer elemento de la cola y devolverlo
    def dequeue(self):
        if self.esta_vacia():
            return "La cola está vacía"
        return self.elementos.popleft()

    # Peek: Obtener el primer elemento de la cola sin eliminarlo
    def peek(self):
        if self.esta_vacia():
            return "La cola está vacía"
        return self.elementos[0]

    # Verificar si la cola está vacía
    def esta_vacia(self):
        return len(self.elementos) == 0

    # Mostrar el contenido de la cola
    def mostrar(self):
        print(self.elementos)

# Ejemplo de uso
cola = Cola()
cola.enqueue(10)
cola.enqueue(20)
cola.enqueue(30)

print("Primer elemento (peek):", cola.peek())  # Output: 10
cola.mostrar()  # Output: deque([10, 20, 30])

print("Elemento eliminado (dequeue):", cola.dequeue())  # Output: 10
cola.mostrar()  # Output: deque([20, 30])
```

---

### Explicación:

- **Enqueue**: Usamos el método `append()` de `deque` para agregar elementos al final de la cola.
- **Dequeue**: Usamos el método `popleft()` de `deque` para eliminar y devolver el primer elemento de la cola.
- **Peek**: Accedemos al primer elemento usando `self.elementos[0]` sin eliminarlo.
- **esta_vacia**: Verifica si la cola está vacía comprobando la longitud de la deque.
- **mostrar**: Muestra todos los elementos de la cola.

---

### JavaScript

En JavaScript, como en Python, podemos usar un array para implementar una cola. Los métodos `push()` y `shift()` del array permiten añadir elementos al final de la cola y eliminar elementos desde el principio de manera eficiente.

#### Implementación de una cola en JavaScript

```javascript
class Cola {
  constructor() {
    this.elementos = []; // Usamos un array para almacenar los elementos
  }

  // Enqueue: Añadir un elemento a la cola
  enqueue(dato) {
    this.elementos.push(dato);
  }

  // Dequeue: Eliminar el primer elemento de la cola y devolverlo
  dequeue() {
    if (this.estaVacia()) {
      return "La cola está vacía";
    }
    return this.elementos.shift(); // Eliminamos el primer elemento
  }

  // Peek: Obtener el primer elemento de la cola sin eliminarlo
  peek() {
    if (this.estaVacia()) {
      return "La cola está vacía";
    }
    return this.elementos[0]; // Obtenemos el primer elemento sin eliminarlo
  }

  // Verificar si la cola está vacía
  estaVacia() {
    return this.elementos.length === 0;
  }

  // Mostrar el contenido de la cola
  mostrar() {
    console.log(this.elementos);
  }
}

// Ejemplo de uso
const cola = new Cola();
cola.enqueue(10);
cola.enqueue(20);
cola.enqueue(30);

console.log("Primer elemento (peek):", cola.peek()); // Output: 10
cola.mostrar(); // Output: [10, 20, 30]

console.log("Elemento eliminado (dequeue):", cola.dequeue()); // Output: 10
cola.mostrar(); // Output: [20, 30]
```

---

### Explicación:

- **Enqueue**: Usamos el método `push()` de los arrays para añadir un elemento al final de la cola.
- **Dequeue**: Usamos el método `shift()` de los arrays para eliminar el primer elemento y devolverlo. Este método es eficiente para las operaciones de cola.
- **Peek**: Accedemos al primer elemento del array sin eliminarlo con `this.elementos[0]`.
- **estaVacia**: Comprobamos si el array está vacío verificando su longitud.
- **mostrar**: Mostramos todos los elementos de la cola.

---

### Java

En Java, la clase `LinkedList` también puede ser utilizada para implementar una cola, ya que implementa la interfaz `Queue`, que proporciona métodos como `offer()`, `poll()`, y `peek()` para manejar elementos en una cola de forma eficiente.

#### Implementación de una cola en Java

```java
import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<Integer> elementos;  // Usamos LinkedList que implementa la interfaz Queue

    // Constructor
    public Cola() {
        this.elementos = new LinkedList<>();
    }

    // Enqueue: Añadir un elemento a la cola
    public void enqueue(int dato) {
        this.elementos.offer(dato);  // Añadimos al final de la cola
    }

    // Dequeue: Eliminar el primer elemento de la cola y devolverlo
    public int dequeue() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;  // Devolvemos un valor que indica que la cola está vacía
        }
        return this.elementos.poll();  // Eliminamos y devolvemos el primer elemento
    }

    // Peek: Obtener el primer elemento de la cola sin eliminarlo
    public int peek() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;  // Devolvemos un valor que indica que la cola está vacía
        }
        return this.elementos.peek();  // Obtenemos el primer elemento sin eliminarlo
    }

    // Verificar si la cola está vacía
    public boolean estaVacia() {
        return this.elementos.isEmpty();  // Verificamos si la cola está vacía
    }

    // Mostrar el contenido de la cola
    public void mostrar() {
        System.out.println(this.elementos);
    }

    // Método principal para probar la cola
    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        System.out.println("Primer elemento (peek): " + cola.peek());  // Output: 10
        cola.mostrar();  // Output: [10, 20, 30]

        System.out.println("Elemento eliminado (dequeue): " + cola.dequeue());  // Output: 10
        cola.mostrar();  // Output: [20, 30]
    }
}
```

---

### Explicación:

- **Enqueue**: Usamos `offer()` para agregar un elemento al final de la cola.
- **Dequeue**: Usamos `poll()` para eliminar y devolver el primer elemento de la cola.
- **Peek**: Usamos `peek()` para obtener el primer elemento de la cola sin eliminarlo.
- **estaVacia**: Comprobamos si la cola está vacía utilizando `isEmpty()`.
- **mostrar**: Mostramos todos los elementos de la cola con la `LinkedList`.

---
