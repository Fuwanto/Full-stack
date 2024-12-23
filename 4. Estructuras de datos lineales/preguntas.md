# Preguntas Teóricas Integradoras

## Arrays

### ¿Qué características definen a los arrays o listas en Python, JavaScript y Java?

**Python**: Listas

- **Mutabilidad**: Son **mutables**, es decir, puedes modificar sus elementos después de haberlas creado.
- **Tamaño dinámico**: El tamaño de una lista puede aumentar o disminuir dinámicamente.
- **Elementos heterogéneos**: Pueden contener elementos de diferentes tipos (enteros, cadenas, listas anidadas, etc.).
- **Índices**: Los elementos se acceden mediante índices **basados en 0**.
- **Métodos útiles**:
  - `append()`: Agrega un elemento al final.
  - `pop()`: Elimina y retorna el último elemento (o un índice específico).
  - `extend()`: Agrega múltiples elementos al final.
  - `sort()`: Ordena la lista en su lugar.
- **Iterables**: Se pueden recorrer fácilmente con bucles como `for`.
- **Declaración**: Se declaran usando corchetes (`[]`).
  ```python
  lista = [1, "texto", 3.14, [1, 2, 3]]
  print(lista[1])  # texto
  ```

---

**JavaScript**: Arrays

- **Mutabilidad**: Los arrays son mutables, permitiendo modificar su contenido.
- **Tamaño dinámico**: Se pueden agregar o eliminar elementos sin necesidad de especificar el tamaño inicial.
- **Elementos heterogéneos**: Pueden contener cualquier tipo de datos (números, cadenas, objetos, etc.).
- **Índices**: También tienen índices **basados en 0**.
- **Métodos útiles**:
  - `push()`: Agrega un elemento al final.
  - `pop()`: Elimina y retorna el último elemento.
  - `splice()`: Inserta, elimina o reemplaza elementos.
  - `map()`, `filter()`, `reduce()`: Métodos funcionales para operar sobre arrays.
- **Declaración**: Se pueden crear con corchetes (`[]`) o con el constructor `Array`.
  ```javascript
  let array = [1, "texto", 3.14, [1, 2, 3]];
  console.log(array[1]); // texto
  ```

---

**Java**: Arrays

- **Inmutabilidad de tamaño**: Una vez creado, el tamaño del array no puede cambiar (aunque sus elementos sí son mutables si son objetos).
- **Elementos homogéneos**: Todos los elementos deben ser del mismo tipo (aunque puedes usar clases como `Object` para almacenar tipos variados).
- **Índices**: Los arrays en Java también usan índices **basados en 0**.
- **Métodos útiles**: No tienen métodos integrados avanzados como en Python o JavaScript. Para operaciones como agregar o eliminar, se suele usar estructuras como `ArrayList`.
- **Declaración**: Necesitan ser declarados con un tipo específico.
  ```java
  int[] numeros = {1, 2, 3};
  String[] palabras = {"hola", "mundo"};
  System.out.println(palabras[1]);  // mundo
  ```

---

**Comparativa rápida**

| Característica             | **Python**   | **JavaScript** | **Java**                        |
| -------------------------- | ------------ | -------------- | ------------------------------- |
| **Mutabilidad**            | Mutable      | Mutable        | Elementos mutables, tamaño fijo |
| **Tamaño dinámico**        | Sí           | Sí             | No                              |
| **Elementos heterogéneos** | Sí           | Sí             | No                              |
| **Índices**                | Basados en 0 | Basados en 0   | Basados en 0                    |
| **Estructuras anidadas**   | Sí           | Sí             | Sí                              |

### ¿Qué ventajas e inconvenientes presentan los arrays en comparación con las listas enlazadas?

**Arrays**

Un array es una estructura de datos que almacena elementos en **ubicaciones contiguas de memoria** y permite el acceso mediante un índice.

**Ventajas:**

1. **Acceso aleatorio eficiente**:
   - Puedes acceder a cualquier elemento en tiempo constante **O(1)** gracias a los índices.
2. **Uso eficiente de memoria**:
   - La memoria para los elementos es contigua, lo que aprovecha mejor la memoria caché.
3. **Simplicidad**:
   - Son fáciles de implementar y utilizar en la mayoría de los lenguajes.
4. **Compatibilidad con hardware**:
   - Su diseño contiguo está optimizado para arquitecturas de memoria modernas.

**Inconvenientes:**

1. **Tamaño fijo** (en lenguajes como Java y C):
   - El tamaño debe definirse al crear el array y no puede cambiar.
2. **Costosa inserción y eliminación**:
   - Agregar o quitar elementos (excepto al final) implica mover los elementos posteriores. Esto tiene un costo de **O(n)**.
3. **Desperdicio de memoria**:
   - Si se reserva más espacio del necesario, puede haber fragmentación interna.
4. **No flexibles**:
   - En algunos lenguajes, todos los elementos deben ser del mismo tipo.

---

**Listas enlazadas**

Una lista enlazada es una estructura donde cada elemento (nodo) almacena un valor y una referencia al siguiente nodo (y a veces al anterior, en listas doblemente enlazadas).

**Ventajas:**

1. **Tamaño dinámico**:
   - El tamaño de la lista puede crecer o reducirse sin necesidad de redimensionar.
2. **Inserción y eliminación eficientes**:
   - En listas simplemente enlazadas o doblemente enlazadas, insertar o eliminar elementos en cualquier posición es rápido (**O(1)** si se tiene el nodo previo).
3. **Uso flexible de memoria**:
   - No necesitas reservar grandes bloques de memoria contiguos.

**Inconvenientes:**

1. **Acceso secuencial**:
   - Para acceder a un elemento, debes recorrer la lista desde el inicio o desde algún nodo conocido, lo que implica un costo de **O(n)**.
2. **Mayor uso de memoria**:
   - Cada nodo requiere almacenamiento adicional para la referencia (puntero o enlace) al siguiente nodo.
3. **Complejidad de implementación**:
   - Comparadas con los arrays, las listas enlazadas son más complejas de implementar y manejar.
4. **Fragmentación de memoria**:
   - Los nodos no están almacenados de forma contigua, lo que puede impactar el rendimiento debido a fallos de caché.

---

**Comparación rápida**

| **Aspecto**                | **Arrays**                         | **Listas enlazadas**                                 |
| -------------------------- | ---------------------------------- | ---------------------------------------------------- |
| **Acceso a elementos**     | Rápido (**O(1)**)                  | Lento (**O(n)**)                                     |
| **Inserción/Eliminación**  | Lento (**O(n)**)                   | Rápido (**O(1)**) en nodos conocidos                 |
| **Tamaño**                 | Fijo (o redimensionable con costo) | Dinámico                                             |
| **Uso de memoria**         | Contiguo, eficiente                | Fragmentado, requiere espacio extra para referencias |
| **Complejidad**            | Simple                             | Más complejo                                         |
| **Estructuras anidadadas** | Menos flexible                     | Más flexible                                         |

---

**¿Cuándo usar uno u otro?**

- **Usa arrays** si necesitas:

  - Acceso rápido a elementos por índice.
  - Almacenar un número fijo de elementos conocidos.
  - Aprovechar estructuras simples y mayor eficiencia de memoria.

- **Usa listas enlazadas** si necesitas:
  - Insertar o eliminar elementos frecuentemente.
  - Almacenar datos cuyo tamaño puede cambiar dinámicamente.
  - Priorizar flexibilidad sobre velocidad de acceso.

### ¿Cómo se accede y modifica un elemento en un array en cada lenguaje?

**Python**

En Python, el equivalente de un array es una **lista**, que permite el acceso y modificación mediante índices.

**Acceso**

Los índices comienzan en `0`. Puedes usar índices positivos o negativos (donde `-1` se refiere al último elemento).

```python
# Declaración de una lista
lista = [10, 20, 30, 40]

# Acceder al segundo elemento
print(lista[1])  # Salida: 20

# Acceso al último elemento
print(lista[-1])  # Salida: 40
```

**Modificación**

Para modificar un elemento, asigna un nuevo valor al índice deseado.

```python
# Cambiar el valor del segundo elemento
lista[1] = 25
print(lista)  # Salida: [10, 25, 30, 40]
```

---

**JavaScript**

En JavaScript, los arrays también permiten el acceso y modificación mediante índices.

**Acceso**

Los índices también comienzan en `0`.

```javascript
// Declaración de un array
let array = [10, 20, 30, 40];

// Acceder al segundo elemento
console.log(array[1]); // Salida: 20

// Acceso al último elemento
console.log(array[array.length - 1]); // Salida: 40
```

**Modificación**

Puedes cambiar el valor de cualquier índice existente.

```javascript
// Cambiar el valor del segundo elemento
array[1] = 25;
console.log(array); // Salida: [10, 25, 30, 40]
```

---

**Java**

En Java, los arrays tienen un tamaño fijo y solo pueden almacenar elementos del mismo tipo. Accedes y modificas sus elementos usando índices.

**Acceso**

Los índices también comienzan en `0`.

```java
// Declaración de un array
int[] numeros = {10, 20, 30, 40};

// Acceder al segundo elemento
System.out.println(numeros[1]);  // Salida: 20

// Acceso al último elemento
System.out.println(numeros[numeros.length - 1]);  // Salida: 40
```

**Modificación**

Se puede asignar un nuevo valor a un índice existente.

```java
// Cambiar el valor del segundo elemento
numeros[1] = 25;
System.out.println(java.util.Arrays.toString(numeros));  // Salida: [10, 25, 30, 40]
```

---

**Resumen Comparativo**

| **Lenguaje**   | **Acceso**   | **Modificación**           |
| -------------- | ------------ | -------------------------- |
| **Python**     | `lista[1]`   | `lista[1] = nuevo_valor`   |
| **JavaScript** | `array[1]`   | `array[1] = nuevo_valor`   |
| **Java**       | `numeros[1]` | `numeros[1] = nuevo_valor` |

## Listas Enlazadas Simples

### Explica la diferencia entre un array y una lista enlazada simple.

La **diferencia principal** entre un **array** y una **lista enlazada simple** radica en cómo almacenan y manejan los datos.

**1. Organización en Memoria**

**Array**

- Los elementos están almacenados en **ubicaciones contiguas de memoria**.
- El acceso a un elemento se realiza mediante un índice que apunta directamente a su posición en memoria.
- Esto permite un acceso rápido, pero la necesidad de espacio contiguo puede limitar la flexibilidad.

**Lista Enlazada Simple**

- Los elementos (nodos) no están en ubicaciones contiguas de memoria.
- Cada nodo contiene:
  - **Un valor** (los datos).
  - **Un puntero** o referencia al siguiente nodo en la lista.
- Esto permite una estructura más flexible, pero el acceso es más lento porque hay que recorrer la lista nodo por nodo.

---

**2. Acceso a Elementos**

**Array**

- El acceso es **directo** mediante el índice (tiempo constante, **O(1)**).
  - Ejemplo: En un array `arr`, acceder al tercer elemento es tan sencillo como `arr[2]`.

**Lista Enlazada Simple**

- El acceso es **secuencial** (tiempo lineal, **O(n)**).
  - Ejemplo: Para llegar al tercer elemento, debes comenzar desde el primero y recorrer la lista hasta llegar al nodo deseado.

---

**3. Tamaño**

**Array**

- Su tamaño es **fijo** (en lenguajes como Java o C) o requiere redimensionamiento costoso.
- En lenguajes dinámicos como Python o JavaScript, el tamaño puede ajustarse automáticamente, pero internamente implica copiar elementos a una nueva ubicación en memoria.

**Lista Enlazada Simple**

- Su tamaño es **dinámico**: puedes agregar o eliminar nodos sin preocuparte por un tamaño máximo predefinido.

---

**4. Inserción y Eliminación**

**Array**

- La inserción y eliminación de elementos en posiciones específicas es **costosa**:
  - Implica mover los elementos posteriores para mantener el orden (costo **O(n)** en el peor caso).
  - La inserción al final (en arrays dinámicos) es más eficiente.

**Lista Enlazada Simple**

- La inserción y eliminación son **eficientes** si se tiene acceso al nodo anterior (costo **O(1)**).
- Sin embargo, encontrar el nodo correcto para insertar o eliminar puede tomar tiempo lineal **O(n)**.

---

**5. Uso de Memoria**

**Array**

- Usa **menos memoria** porque almacena solo los datos.
- Sin embargo, puede desperdiciar memoria si el array tiene más capacidad que elementos.

**Lista Enlazada Simple**

- Usa **más memoria** porque cada nodo requiere almacenamiento adicional para el puntero (o referencia) al siguiente nodo.
- La memoria puede estar fragmentada, lo que afecta la eficiencia de caché.

---

**6. Casos de Uso**

**Array**

- Ideal cuando:
  - Sabes el número de elementos de antemano.
  - Necesitas acceso rápido por índice.
  - Las operaciones frecuentes son lectura o modificación de datos.

**Lista Enlazada Simple**

- Ideal cuando:
  - El tamaño de los datos cambia frecuentemente.
  - Necesitas insertar o eliminar elementos con frecuencia.
  - No necesitas acceso rápido a elementos específicos.

---

**Comparación Resumida**

| **Aspecto**               | **Array**              | **Lista Enlazada Simple**               |
| ------------------------- | ---------------------- | --------------------------------------- |
| **Organización**          | Contigua en memoria    | No contigua; nodos enlazados            |
| **Acceso**                | Rápido (**O(1)**)      | Lento, secuencial (**O(n)**)            |
| **Tamaño**                | Fijo o redimensionable | Dinámico                                |
| **Inserción/Eliminación** | Lento (**O(n)**)       | Rápido (**O(1)** con nodo previo)       |
| **Uso de Memoria**        | Más eficiente          | Menos eficiente (espacio para punteros) |

### ¿Qué estructuras básicas componen una lista enlazada simple?

Una **lista enlazada simple** está formada por una serie de **nodos** que están conectados entre sí a través de **referencias** (punteros o enlaces).

**1. Nodo**

Un **nodo** es la unidad básica de una lista enlazada. Cada nodo consta de dos partes principales:

- **Dato**: El valor o información que el nodo almacena. Puede ser un número, una cadena, un objeto, etc.
- **Referencia al siguiente nodo**: Un puntero o enlace que apunta al siguiente nodo en la lista. Si es el último nodo, esta referencia es `null` o `None` (dependiendo del lenguaje).

**Ejemplo de representación gráfica:**

```
[ Dato | Referencia ] → [ Dato | Referencia ] → [ Dato | None ]
```

---

**2. Cabeza (Head)**

La **cabeza** es el punto de entrada de la lista enlazada. Es un puntero que apunta al primer nodo de la lista. Si la lista está vacía, la cabeza apunta a `null` o `None`.

---

**3. Último nodo (Tail)**

En una lista enlazada simple, el **último nodo** es aquel cuya referencia al siguiente nodo es `null` o `None`. Este nodo marca el final de la lista.

---

**4. Longitud (Opcional)**

Aunque no es obligatorio, muchas implementaciones mantienen un **contador de longitud** para saber cuántos nodos contiene la lista. Esto facilita ciertas operaciones, como comprobar el tamaño sin necesidad de recorrer toda la lista.

---

**Estructura General**

Una lista enlazada simple puede representarse de la siguiente manera:

1. La **cabeza** apunta al primer nodo.
2. Cada nodo apunta al siguiente nodo.
3. El último nodo apunta a `null` o `None`.

**Ejemplo gráfico:**

```
Head → [ 1 | ● ] → [ 2 | ● ] → [ 3 | None ]
```

---

**Características Clave**

- **Acceso secuencial**: Para acceder a un nodo, debes recorrer la lista desde la cabeza.
- **Crecimiento dinámico**: No tiene un tamaño fijo, por lo que puedes agregar o eliminar nodos según sea necesario.
- **Operaciones comunes**:
  - **Inserción**: Agregar un nodo al inicio, en el medio o al final.
  - **Eliminación**: Quitar un nodo en cualquier posición.
  - **Búsqueda**: Encontrar un nodo que contenga un valor específico.

---

**Ejemplo en Código**

**Python**

```python
class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None

class ListaEnlazadaSimple:
    def __init__(self):
        self.cabeza = None

# Crear nodos
nodo1 = Nodo(1)
nodo2 = Nodo(2)
nodo3 = Nodo(3)

# Enlazar nodos
nodo1.siguiente = nodo2
nodo2.siguiente = nodo3

# Asignar cabeza
lista = ListaEnlazadaSimple()
lista.cabeza = nodo1
```

**JavaScript**

```javascript
class Nodo {
  constructor(dato) {
    this.dato = dato;
    this.siguiente = null;
  }
}

class ListaEnlazadaSimple {
  constructor() {
    this.cabeza = null;
  }
}

// Crear nodos
let nodo1 = new Nodo(1);
let nodo2 = new Nodo(2);
let nodo3 = new Nodo(3);

// Enlazar nodos
nodo1.siguiente = nodo2;
nodo2.siguiente = nodo3;

// Asignar cabeza
let lista = new ListaEnlazadaSimple();
lista.cabeza = nodo1;
```

**Java**

```java
class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaEnlazadaSimple {
    Nodo cabeza;

    public ListaEnlazadaSimple() {
        this.cabeza = null;
    }
}

// Crear nodos y enlazarlos
Nodo nodo1 = new Nodo(1);
Nodo nodo2 = new Nodo(2);
Nodo nodo3 = new Nodo(3);

nodo1.siguiente = nodo2;
nodo2.siguiente = nodo3;

// Asignar cabeza
ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
lista.cabeza = nodo1;
```

### ¿Cuáles son las operaciones más comunes en una lista enlazada simple (agregar, eliminar, buscar)?

**1. Agregar (Insertar)**

**Casos comunes de inserción**:

1. **Al inicio**:

   - Cambias la referencia de la **cabeza** para que apunte al nuevo nodo.
   - El nuevo nodo apunta al nodo que antes era la cabeza.
   - Es una operación rápida, **O(1)**.

2. **Al final**:

   - Recorres la lista hasta el último nodo.
   - Haces que el último nodo apunte al nuevo nodo.
   - El nuevo nodo apunta a `null`.
   - El costo es **O(n)** debido al recorrido.

3. **En una posición específica**:
   - Recorres la lista hasta la posición deseada.
   - Ajustas los punteros para insertar el nuevo nodo.
   - El costo es **O(n)**.

**Ejemplo en Python (Insertar al inicio)**:

```python
def insertar_inicio(self, dato):
    nuevo_nodo = Nodo(dato)
    nuevo_nodo.siguiente = self.cabeza  # El nuevo nodo apunta al actual cabeza
    self.cabeza = nuevo_nodo           # La cabeza ahora es el nuevo nodo
```

---

**2. Eliminar**

**Casos comunes de eliminación**:

1. **Eliminar al inicio**:

   - Simplemente cambias la referencia de la **cabeza** al segundo nodo.
   - Si la lista tiene un solo nodo, la cabeza se vuelve `null`.
   - Es rápido, **O(1)**.

2. **Eliminar al final**:

   - Recorres la lista para encontrar el penúltimo nodo.
   - Cambias la referencia del penúltimo nodo a `null`.
   - El costo es **O(n)**.

3. **Eliminar en una posición específica o por valor**:
   - Recorres la lista hasta encontrar el nodo previo al que deseas eliminar.
   - Cambias su referencia para que apunte al nodo siguiente.
   - El costo es **O(n)**.

**Ejemplo en Python (Eliminar al inicio)**:

```python
def eliminar_inicio(self):
    if self.cabeza is not None:
        self.cabeza = self.cabeza.siguiente  # La cabeza ahora apunta al segundo nodo
```

---

**3. Buscar**

**Cómo funciona**:

- Recorres la lista desde la **cabeza** nodo por nodo.
- Comparas el valor de cada nodo con el valor buscado.
- Si encuentras el valor, devuelves el nodo o su posición.
- Si no lo encuentras, devuelves `null` o un indicador de que no está presente.
- El costo es **O(n)** en el peor caso.

**Ejemplo en Python (Buscar un valor)**:

```python
def buscar(self, valor):
    actual = self.cabeza
    while actual is not None:
        if actual.dato == valor:  # Comparar el dato del nodo
            return actual
        actual = actual.siguiente
    return None  # No encontrado
```

---

**Código Completo Ejemplo (Python)**

```python
class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None

class ListaEnlazadaSimple:
    def __init__(self):
        self.cabeza = None

    def insertar_inicio(self, dato):
        nuevo_nodo = Nodo(dato)
        nuevo_nodo.siguiente = self.cabeza
        self.cabeza = nuevo_nodo

    def eliminar_inicio(self):
        if self.cabeza is not None:
            self.cabeza = self.cabeza.siguiente

    def buscar(self, valor):
        actual = self.cabeza
        while actual is not None:
            if actual.dato == valor:
                return actual
            actual = actual.siguiente
        return None
```

---

**Resumen de Costos de Operaciones**

| **Operación**          | **Mejor caso** | **Peor caso** |
| ---------------------- | -------------- | ------------- |
| **Agregar al inicio**  | O(1)           | O(1)          |
| **Agregar al final**   | O(n)           | O(n)          |
| **Eliminar al inicio** | O(1)           | O(1)          |
| **Eliminar al final**  | O(n)           | O(n)          |
| **Buscar**             | O(1)           | O(n)          |

## Listas Enlazadas Dobles

### ¿Qué ventaja ofrece una lista enlazada doble frente a una lista enlazada simple?

Una **lista enlazada doble** ofrece varias ventajas frente a una **lista enlazada simple** debido a la presencia de punteros bidireccionales (cada nodo tiene referencias al siguiente y al anterior).

**1. Navegación Bidireccional**

- En una lista enlazada doble, puedes moverte hacia adelante y hacia atrás, lo cual es muy útil en ciertas aplicaciones como editores de texto o navegadores web.
- En una lista enlazada simple, solo puedes avanzar en una dirección, desde la cabeza hasta el final.

---

**2. Eliminación de Nodos Más Eficiente**

- En una lista enlazada doble, puedes eliminar un nodo directamente si tienes una referencia a él, porque también tienes acceso al nodo anterior.
- En una lista enlazada simple, eliminar un nodo requiere recorrer la lista para encontrar el nodo anterior al que deseas eliminar.

---

**3. Inserción Más Flexible**

- Es más fácil insertar nodos antes o después de un nodo específico en una lista doble, ya que puedes ajustar las referencias de ambos lados.
- En una lista simple, insertar antes de un nodo requiere encontrar el nodo anterior, lo cual puede ser costoso.

---

**4. Mayor Eficiencia en Operaciones que Requieren Retroceso**

- Operaciones que requieren moverse hacia atrás (por ejemplo, en estructuras tipo **Deque**, donde se eliminan elementos de ambos extremos) son más eficientes con una lista doble.
- En una lista simple, para retroceder necesitas volver al inicio y recorrer toda la lista hasta el nodo deseado.

---

**5. Soporte Natural para Listas Circulares Dobles**

- Convertir una lista enlazada doble en una lista circular es sencillo, al hacer que el primer nodo apunte al último y viceversa. Esto es útil para implementar estructuras como colas circulares.

---

**Desventajas de la Lista Enlazada Doble**

1. **Mayor uso de memoria**:
   - Cada nodo tiene dos referencias (al siguiente y al anterior), lo que aumenta el consumo de memoria.
2. **Mayor complejidad en la implementación**:
   - Las operaciones de inserción y eliminación son más complejas porque hay que mantener ambas referencias actualizadas.

---

**Ejemplo Comparativo**

**Lista Enlazada Simple**

```python
class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None
```

**Lista Enlazada Doble**

```python
class NodoDoble:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None
        self.anterior = None
```

---

**Resumen Comparativo**

| **Característica**                | **Lista Simple**                     | **Lista Doble**                |
| --------------------------------- | ------------------------------------ | ------------------------------ |
| **Navegación**                    | Solo hacia adelante                  | Hacia adelante y atrás         |
| **Inserción antes de un nodo**    | Requiere recorrer la lista           | Más fácil con acceso directo   |
| **Eliminación de un nodo**        | Requiere referencia al nodo anterior | Directa si se tiene el nodo    |
| **Uso de memoria**                | Menor                                | Mayor (doble puntero por nodo) |
| **Complejidad de implementación** | Más simple                           | Más compleja                   |

---

**Conclusión**

Una lista enlazada doble es más poderosa y flexible, especialmente cuando necesitas navegar en ambas direcciones, insertar/eliminar en posiciones arbitrarias, o implementar estructuras avanzadas. Sin embargo, su mayor consumo de memoria y complejidad pueden ser desventajas en escenarios donde no se requieren estas funcionalidades adicionales.

### ¿Qué operaciones adicionales permite una lista enlazada doble?

Una **lista enlazada doble** permite realizar varias operaciones adicionales o más eficientes en comparación con una lista enlazada simple debido a la presencia de referencias tanto al nodo anterior como al siguiente.

**1. Navegación hacia atrás**

- **Qué permite**: Moverte hacia el nodo anterior desde cualquier nodo.
- **Ventaja**: En una lista enlazada simple, solo puedes avanzar hacia adelante. Esto hace que las listas dobles sean ideales para estructuras que requieren navegación bidireccional, como listas circulares o iteradores.

---

**2. Inserción antes de un nodo**

- **Qué permite**: Insertar un nuevo nodo antes de un nodo existente sin necesidad de recorrer la lista completa.
- **Cómo funciona**:
  - Ajustas el puntero `anterior` del nodo actual para que apunte al nuevo nodo.
  - Ajustas los punteros del nuevo nodo (`siguiente` al nodo actual y `anterior` al nodo previo).
- **Ventaja**: En una lista enlazada simple, necesitas conocer el nodo anterior recorriendo la lista.

---

**3. Eliminación de un nodo sin recorrer la lista**

- **Qué permite**: Eliminar un nodo directamente si ya tienes una referencia a él.
- **Cómo funciona**:
  - Actualizas el puntero `siguiente` del nodo anterior para que salte al nodo siguiente.
  - Actualizas el puntero `anterior` del nodo siguiente para que apunte al nodo anterior.
- **Ventaja**: En una lista simple, necesitas recorrer la lista para encontrar el nodo anterior al que deseas eliminar.

---

**4. Inserción al final de la lista (eficiente)**

- **Qué permite**: Insertar un nodo al final sin recorrer toda la lista, si mantienes una referencia al último nodo (**tail**).
- **Cómo funciona**:
  - Ajustas el puntero `siguiente` del último nodo para apuntar al nuevo nodo.
  - El puntero `anterior` del nuevo nodo apunta al último nodo.
  - Actualizas la referencia de **tail** al nuevo nodo.
- **Ventaja**: En una lista simple, debes recorrer toda la lista para insertar al final.

---

**5. Implementación de listas circulares dobles**

- **Qué permite**: Crear estructuras circulares donde el último nodo apunta al primero y viceversa.
- **Ventaja**: Las listas circulares dobles permiten recorrer la lista en ambas direcciones sin un final explícito.

**Ejemplo gráfico de una lista circular doble:**

```
Head → [ 1 | ●● ] ↔ [ 2 | ●● ] ↔ [ 3 | ●● ] ↔ (de vuelta a Head)
```

---

**6. Reversión de la lista**

- **Qué permite**: Invertir el orden de los nodos cambiando las referencias `siguiente` y `anterior` de cada nodo.
- **Ventaja**: Esto es más directo en una lista doble porque ya tienes referencias bidireccionales.

---

**7. Implementación eficiente de estructuras tipo Deque**

- **Qué permite**: Implementar un **Deque** (cola doblemente terminada) con eficiencia.
- **Operaciones soportadas**:
  - **Agregar al inicio**: Usas la referencia al nodo **head**.
  - **Agregar al final**: Usas la referencia al nodo **tail**.
  - **Eliminar del inicio** y **eliminar del final** también son rápidas.

---

**Ejemplo de Operaciones Adicionales en Python**

```python
class NodoDoble:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None
        self.anterior = None

class ListaDoble:
    def __init__(self):
        self.head = None
        self.tail = None

    def insertar_al_inicio(self, dato):
        nuevo_nodo = NodoDoble(dato)
        if self.head is None:
            self.head = self.tail = nuevo_nodo
        else:
            nuevo_nodo.siguiente = self.head
            self.head.anterior = nuevo_nodo
            self.head = nuevo_nodo

    def insertar_al_final(self, dato):
        nuevo_nodo = NodoDoble(dato)
        if self.tail is None:
            self.head = self.tail = nuevo_nodo
        else:
            nuevo_nodo.anterior = self.tail
            self.tail.siguiente = nuevo_nodo
            self.tail = nuevo_nodo

    def eliminar_del_final(self):
        if self.tail is not None:
            if self.tail == self.head:  # Un solo nodo
                self.head = self.tail = None
            else:
                self.tail = self.tail.anterior
                self.tail.siguiente = None

    def invertir_lista(self):
        actual = self.head
        while actual is not None:
            actual.siguiente, actual.anterior = actual.anterior, actual.siguiente
            if actual.anterior is None:  # Nueva cabeza
                self.tail = self.head
                self.head = actual
            actual = actual.anterior
```

---

**Resumen de Operaciones Adicionales**

| **Operación**                    | **Descripción**                                       | **Ventaja**                                            |
| -------------------------------- | ----------------------------------------------------- | ------------------------------------------------------ |
| Navegación hacia atrás           | Moverse al nodo anterior desde cualquier nodo         | Navegación más flexible                                |
| Inserción antes de un nodo       | Agregar un nodo antes de otro                         | No necesita recorrer toda la lista                     |
| Eliminación sin recorrer         | Eliminar un nodo directamente si tienes su referencia | Más eficiente que en listas simples                    |
| Inserción al final eficiente     | Insertar al final con referencia a `tail`             | No requiere recorrer la lista                          |
| Implementación de lista circular | Crear listas circulares bidireccionales               | Más fácil que con listas simples                       |
| Reversión de la lista            | Cambiar el orden de los nodos                         | Simplificado gracias a las referencias bidireccionales |
| Eficiencia en estructuras Deque  | Operaciones rápidas al inicio y al final              | Ideal para colas y pilas con doble acceso              |

## Pilas (Stacks)

### ¿Qué es una pila y cómo funciona su principio de LIFO (Last In, First Out)?

Una **pila** es una estructura de datos **lineal** que opera bajo el principio de **LIFO (Last In, First Out)**, que significa que el último elemento en ser agregado (o apilado) es el primero en ser removido (o desapilado).

---

**Concepto de LIFO**

- **Último en entrar, primero en salir**:
  - Imagina una pila de platos: el último plato que colocaste en la pila es el primero que tomarás.
  - Así, el acceso a los elementos está **restringido** a un solo extremo, llamado la **cima** de la pila (**top**).

---

**Operaciones principales de una pila**

1. **`push(elemento)` (apilar/agregar)**:

   - Agrega un elemento a la cima de la pila.
   - El elemento se convierte en el último elemento de la pila.

2. **`pop()` (desapilar/remover)**:

   - Elimina y devuelve el elemento en la cima de la pila.
   - En una pila vacía, esta operación puede generar un error o excepción.

3. **`peek()` o `top()` (ver la cima)**:

   - Devuelve el elemento en la cima sin eliminarlo.
   - Permite saber qué elemento será desapilado si haces un `pop()`.

4. **`isEmpty()` (verificar si está vacía)**:

   - Retorna `true` si la pila no contiene elementos, y `false` de lo contrario.

5. **`size()` (tamaño de la pila)**:
   - Devuelve el número de elementos en la pila.

---

**Representación visual de una pila**

Supongamos que hacemos estas operaciones en una pila vacía:

1. `push(10)`
2. `push(20)`
3. `push(30)`
4. `pop()`

Estado de la pila en cada paso:

```
Inicialmente:       []
Después de push(10): [10]
Después de push(20): [10, 20]
Después de push(30): [10, 20, 30]
Después de pop():    [10, 20] (se elimina el 30)
```

---

**Ejemplo de implementación**

**En Python**

```python
class Pila:
    def __init__(self):
        self.elementos = []

    def push(self, elemento):
        self.elementos.append(elemento)  # Agregar al final de la lista

    def pop(self):
        if not self.is_empty():
            return self.elementos.pop()  # Remover y retornar el último elemento
        else:
            raise IndexError("La pila está vacía")

    def peek(self):
        if not self.is_empty():
            return self.elementos[-1]  # Retornar el último elemento sin eliminarlo
        else:
            raise IndexError("La pila está vacía")

    def is_empty(self):
        return len(self.elementos) == 0

    def size(self):
        return len(self.elementos)

# Uso
pila = Pila()
pila.push(10)
pila.push(20)
pila.push(30)
print(pila.pop())   # Salida: 30
print(pila.peek())  # Salida: 20
```

**En JavaScript**

```javascript
class Pila {
  constructor() {
    this.elementos = [];
  }

  push(elemento) {
    this.elementos.push(elemento); // Agregar al final
  }

  pop() {
    if (!this.isEmpty()) {
      return this.elementos.pop(); // Remover y retornar el último
    }
    throw new Error("La pila está vacía");
  }

  peek() {
    if (!this.isEmpty()) {
      return this.elementos[this.elementos.length - 1]; // Último elemento
    }
    throw new Error("La pila está vacía");
  }

  isEmpty() {
    return this.elementos.length === 0;
  }

  size() {
    return this.elementos.length;
  }
}

// Uso
const pila = new Pila();
pila.push(10);
pila.push(20);
pila.push(30);
console.log(pila.pop()); // Salida: 30
console.log(pila.peek()); // Salida: 20
```

**En Java**

```java
import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println(pila.pop());  // Salida: 30
        System.out.println(pila.peek()); // Salida: 20
    }
}
```

---

**Ventajas de las Pilas**

1. **Simplicidad**: Implementación fácil.
2. **Control en el flujo**: Útil para aplicaciones como evaluación de expresiones, manejo de llamadas recursivas, y **deshacer/rehacer** en aplicaciones.
3. **Almacenamiento temporal**: Ideal para resolver problemas que requieren almacenamiento temporal (como navegadores web para historial).

---

**Desventajas de las Pilas**

1. **Acceso restringido**: No puedes acceder a elementos intermedios directamente; solo puedes trabajar con la cima.
2. **Capacidad limitada**: Si la pila está implementada con un tamaño fijo, puede llenarse rápidamente.

---

**Aplicaciones comunes**

1. **Recursión**: Las pilas son fundamentales para implementar llamadas recursivas.
2. **Evaluación de expresiones**: Uso en notación postfija y prefija.
3. **Control de historial**: Deshacer/rehacer en editores o navegadores.
4. **Resolución de problemas**: Algoritmos como el recorrido en profundidad (DFS) en grafos.

### Compara el uso de una pila implementada con arrays frente a una implementada con listas enlazadas.

Cuando implementamos una **pila** (estructura LIFO) en diferentes tipos de estructuras de datos, como **arrays** y **listas enlazadas**, la elección de la implementación afecta tanto la eficiencia de las operaciones como el uso de memoria.

**Pila Implementada con Arrays**

**Ventajas**

1. **Acceso rápido al final (O(1))**:

   - En un array, agregar o quitar elementos al final (push y pop) es una operación **constante** (O(1)) si el array tiene espacio suficiente.
   - No se necesita recorrer la estructura, ya que el array se maneja como una secuencia contigua de memoria.

2. **Simplicidad en la implementación**:

   - Implementar una pila con arrays es muy sencillo, ya que los arrays proporcionan un acceso rápido a cualquier índice.
   - Solo necesitas mantener un índice para la cima de la pila.

3. **Menor sobrecarga**:
   - Un array no requiere la creación de objetos adicionales (como en las listas enlazadas), lo que puede ser más eficiente en términos de memoria si no se usan demasiados elementos.

**Desventajas**

1. **Tamaño fijo (en algunos lenguajes)**:

   - En lenguajes como **C o C++**, los arrays tienen un tamaño fijo, por lo que, si la pila crece más allá del tamaño inicial, puede ser necesario redimensionar el array, lo que es una operación costosa (O(n)).
   - En lenguajes como **Python o JavaScript**, el tamaño del array es dinámico, pero la **redimensión** interna (como la duplicación de espacio) puede generar **desempeño ineficiente** si se realizan muchas operaciones.

2. **Desperdicio de memoria**:
   - Si usas un array con un tamaño fijo y no llenas completamente la pila, puedes tener mucho **espacio desperdiciado**.

---

**Pila Implementada con Listas Enlazadas**

**Ventajas**

1. **Tamaño dinámico (sin necesidad de redimensionar)**:

   - Las listas enlazadas son estructuras de **tamaño dinámico**. No es necesario redimensionar la estructura, ya que los nodos se agregan y eliminan de manera flexible.
   - Puedes seguir apilando elementos sin necesidad de preocuparte por el límite de tamaño o la realineación de memoria.

2. **Memoria eficiente (sin desperdicio de espacio)**:

   - No hay desperdicio de memoria, ya que cada nodo solo ocupa lo necesario para almacenar el dato y los punteros (anterior y siguiente en una lista doble).
   - Si solo tienes unos pocos elementos, no estás comprometido a reservar un espacio innecesario como con un array de tamaño fijo.

3. **Eliminación de nodos eficiente**:
   - La operación `pop` en una lista enlazada es rápida, ya que solo implica ajustar los punteros (por ejemplo, mover la referencia de la cima de la pila). No es necesario mover ni desplazar elementos como en un array.

**Desventajas**

1. **Sobrecarga de memoria por nodo**:

   - Cada nodo en una lista enlazada necesita almacenamiento para los punteros `anterior` y `siguiente`, lo que agrega sobrecarga en memoria.
   - En una lista doblemente enlazada, cada nodo tiene dos punteros adicionales (uno al siguiente nodo y otro al anterior), lo que aumenta aún más el consumo de memoria.

2. **Acceso menos eficiente (O(n) en algunos casos)**:
   - Aunque las operaciones `push` y `pop` en la **cima** de la pila son eficientes, acceder a elementos intermedios en la pila (por ejemplo, si se requiere inspeccionar el nodo anterior) es menos eficiente que en un array, ya que en una lista enlazada debes recorrer los nodos desde el principio o la cima, lo que podría tomar O(n) tiempo.

---

**Comparación en Operaciones Clave**

| **Operación**      | **Pila con Array**                                        | **Pila con Lista Enlazada**                          |
| ------------------ | --------------------------------------------------------- | ---------------------------------------------------- |
| **Push**           | O(1) (si el array tiene espacio)                          | O(1) (en la cima de la lista)                        |
| **Pop**            | O(1) (si no se necesita redimensionar)                    | O(1) (en la cima de la lista)                        |
| **Peek**           | O(1)                                                      | O(1)                                                 |
| **Redimensionar**  | O(n) (si el array se llena y se redimensiona)             | No es necesario, tamaño dinámico                     |
| **Uso de memoria** | Potencial desperdicio de espacio si se usa un tamaño fijo | Mayor sobrecarga por los punteros (en listas dobles) |

---

**Resumen de Elección**

- **Pila con array**: Es una opción más eficiente cuando se sabe que el tamaño de la pila no cambiará drásticamente o si se usa una implementación dinámica de arrays (como en Python o JavaScript). Es más adecuada cuando las operaciones de redimensión no afectan demasiado el rendimiento.
- **Pila con lista enlazada**: Es más adecuada cuando la pila tiene un tamaño que puede cambiar considerablemente y no quieres preocuparte por la gestión del tamaño (por ejemplo, en aplicaciones de largo plazo o con alta variabilidad en el tamaño de la pila). Es preferible si se busca flexibilidad a costa de un mayor uso de memoria.

## Colas (Queues)

### ¿Qué es una cola y cómo funciona su principio de FIFO (First In, First Out)?

Una **cola** es una estructura de datos **lineal** que opera bajo el principio de **FIFO (First In, First Out)**, lo que significa que el primer elemento en entrar es el primero en salir. Este principio es similar al funcionamiento de una fila en una tienda o en una caja de un supermercado: las personas (elementos) se agregan al final de la fila (cola) y se atienden o sirven desde el frente (inicio) de la fila.

**Principio de FIFO**

- **First In, First Out**: El **primer elemento que entra** (en el extremo trasero) será el **primer elemento en salir** (por el frente).
- Esto se asegura mediante dos operaciones clave: **enqueue** (agregar un elemento) y **dequeue** (eliminar un elemento).

---

**Operaciones principales de una cola**

1. **`enqueue(elemento)` (agregar/insertar)**:

   - Agrega un elemento al final de la cola (extremo trasero).
   - La operación es **O(1)**, es decir, se realiza en tiempo constante.

2. **`dequeue()` (eliminar/remover)**:

   - Elimina y retorna el elemento en el frente de la cola (el primer elemento agregado).
   - Esta operación también es **O(1)**.

3. **`peek()` o `front()` (ver el frente)**:

   - Devuelve el primer elemento de la cola sin eliminarlo, es decir, muestra el elemento que se atendería en el próximo `dequeue()`.
   - También es **O(1)**.

4. **`isEmpty()` (verificar si está vacía)**:

   - Verifica si la cola contiene elementos. Retorna `true` si está vacía, y `false` de lo contrario.
   - Esta operación es **O(1)**.

5. **`size()` (tamaño de la cola)**:
   - Retorna el número de elementos en la cola.
   - Generalmente es **O(1)** si se mantiene un contador de elementos.

---

**Representación visual de una cola**

Supongamos que realizamos las siguientes operaciones en una cola vacía:

1. `enqueue(10)`
2. `enqueue(20)`
3. `enqueue(30)`
4. `dequeue()`

**Estado de la cola en cada paso:**

```
Inicialmente:       []
Después de enqueue(10): [10]
Después de enqueue(20): [10, 20]
Después de enqueue(30): [10, 20, 30]
Después de dequeue():   [20, 30] (se elimina el 10)
```

---

**Ejemplo de implementación**

**En Python**

```python
class Cola:
    def __init__(self):
        self.elementos = []

    def enqueue(self, elemento):
        self.elementos.append(elemento)  # Agregar al final

    def dequeue(self):
        if not self.is_empty():
            return self.elementos.pop(0)  # Remover y retornar el primer elemento
        else:
            raise IndexError("La cola está vacía")

    def peek(self):
        if not self.is_empty():
            return self.elementos[0]  # Retornar el primer elemento sin eliminarlo
        else:
            raise IndexError("La cola está vacía")

    def is_empty(self):
        return len(self.elementos) == 0

    def size(self):
        return len(self.elementos)

# Uso
cola = Cola()
cola.enqueue(10)
cola.enqueue(20)
cola.enqueue(30)
print(cola.dequeue())  # Salida: 10
print(cola.peek())     # Salida: 20
```

**En JavaScript**

```javascript
class Cola {
  constructor() {
    this.elementos = [];
  }

  enqueue(elemento) {
    this.elementos.push(elemento); // Agregar al final
  }

  dequeue() {
    if (!this.isEmpty()) {
      return this.elementos.shift(); // Remover y retornar el primer elemento
    }
    throw new Error("La cola está vacía");
  }

  peek() {
    if (!this.isEmpty()) {
      return this.elementos[0]; // Primer elemento
    }
    throw new Error("La cola está vacía");
  }

  isEmpty() {
    return this.elementos.length === 0;
  }

  size() {
    return this.elementos.length;
  }
}

// Uso
const cola = new Cola();
cola.enqueue(10);
cola.enqueue(20);
cola.enqueue(30);
console.log(cola.dequeue()); // Salida: 10
console.log(cola.peek()); // Salida: 20
```

**En Java**

```java
import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        cola.add(10);
        cola.add(20);
        cola.add(30);

        System.out.println(cola.poll());  // Salida: 10
        System.out.println(cola.peek());  // Salida: 20
    }
}
```

---

**Ventajas de las Colas**

1. **Simplicidad**: Al igual que las pilas, las colas tienen una implementación simple con pocas operaciones.
2. **Orden de procesamiento**: Se garantiza que los elementos se procesarán en el mismo orden en que llegaron (FIFO).
3. **Aplicaciones en tiempo real**: Son ideales para implementar sistemas de **procesamiento en tiempo real**, como la programación de tareas o la gestión de solicitudes en servidores.
4. **Uso en algoritmos de búsqueda**: Se utiliza en algoritmos como **Breadth-First Search (BFS)** en grafos.

---

**Desventajas de las Colas**

1. **Acceso restringido**: Al igual que las pilas, el acceso a los elementos está restringido. Solo puedes acceder al primer elemento; no puedes acceder a los elementos intermedios directamente.
2. **Uso de memoria adicional**: Las colas implementadas con arreglos pueden tener problemas de redimensionamiento si no se gestionan correctamente. Las colas implementadas con listas enlazadas requieren memoria adicional para almacenar los punteros.

---

**Aplicaciones comunes**

1. **Procesamiento de tareas en sistemas operativos**: Las colas se usan para gestionar procesos en espera de ejecución, como en los algoritmos de planificación de CPU.
2. **Simulación de líneas de espera**: Modelar situaciones de espera en sistemas, como un cajero automático o una línea telefónica.
3. **Algoritmos de búsqueda**: En algoritmos como **BFS (Breadth-First Search)**, las colas se utilizan para explorar nodos nivel por nivel.
4. **Buffers**: Se utilizan en buffers de datos en comunicación, como los que gestionan el tráfico de red o los mensajes entre procesos.

---

### ¿Qué diferencias hay entre una cola y una cola circular?

Una **cola** y una **cola circular** son ambas estructuras de datos basadas en el principio FIFO (First In, First Out), pero difieren en cómo manejan el espacio disponible y las operaciones cuando la cola alcanza su capacidad máxima.

**Cola (FIFO normal)**

En una cola normal, los elementos se agregan al final (a la "cima" de la cola) y se eliminan desde el frente (el "inicio" de la cola). Si la cola está implementada con un arreglo, se utiliza un índice para seguir la posición de la cima (frente) y el final de la cola. Cuando se alcanza el final del arreglo, **no se reutiliza el espacio vacío** que queda por los elementos eliminados.

**Características de una Cola Normal**

1. **Operación estándar de enqueue** (agregar un elemento): Los elementos se agregan al final de la cola.
2. **Operación estándar de dequeue** (eliminar un elemento): Los elementos se eliminan desde el frente de la cola.
3. **Espacio estático**: Si la cola está implementada con un arreglo, el tamaño de la cola está limitado a la capacidad del arreglo, y cuando este se llena, no puede agregar más elementos sin redimensionar el arreglo.
4. **Desperdicio de espacio**: Si se eliminan muchos elementos de la cola, pueden quedar huecos en el arreglo que no se reutilizan, incluso si hay espacio disponible al principio del arreglo.
5. **Desplazamiento de elementos**: Si la cola está implementada con un arreglo, al hacer un `dequeue`, los elementos restantes deben ser desplazados, lo que puede ser costoso en términos de rendimiento si la cola es grande.

**Cola Circular**

Una **cola circular** es una mejora de la cola normal que utiliza un arreglo de tamaño fijo para simular una estructura circular, es decir, los elementos eliminados de la cola pueden hacer que se "reutilice" el espacio que queda disponible al principio del arreglo, evitando el desperdicio de memoria.

**Características de una Cola Circular**

1. **Reutilización de espacio**: Cuando un elemento se elimina de la cola, el espacio que deja vacío puede ser reutilizado por nuevos elementos, sin la necesidad de desplazar todos los elementos restantes.
2. **Índices circulares**: Se utilizan dos índices, uno para el **frente** y otro para el **final** de la cola. Los índices se mueven de forma circular a través del arreglo:
   - Cuando el índice llega al final del arreglo, se **"envuelve"** de nuevo al principio.
3. **Manejo eficiente del espacio**: La cola circular es más eficiente en términos de **memoria** porque no hay espacios desperdiciados en el arreglo, y se maximiza la utilización del espacio disponible.
4. **Condición de "lleno" y "vacío"**: El reto de las colas circulares es diferenciar entre una cola "vacía" y una cola "llena", ya que el final de la cola podría estar en la misma posición que el frente, lo que podría causar confusión. Por eso, algunas implementaciones de colas circulares mantienen un **contador** o usan una estrategia especial para evitar esta confusión.

---

**Diferencias Principales**

| **Característica**              | **Cola Normal**                                                              | **Cola Circular**                                                        |
| ------------------------------- | ---------------------------------------------------------------------------- | ------------------------------------------------------------------------ |
| **Espacio**                     | Puede desperdiciar espacio si se eliminan elementos y no se desplazan        | Reutiliza espacio eliminando elementos, sin desperdicio                  |
| **Desplazamiento de elementos** | Se deben mover los elementos al hacer un `dequeue`                           | No se requiere mover elementos, solo se ajustan los índices              |
| **Capacidad**                   | Limitada al tamaño del arreglo, con posibilidad de redimensionar             | Tamaño fijo, pero se aprovecha mejor el espacio disponible               |
| **Índices**                     | El índice de frente avanza, y al llegar al final, no se reutiliza el espacio | Los índices del frente y del final se envuelven al principio del arreglo |
| **Condición de vacío**          | Fácil de identificar (cuando no hay elementos)                               | Requiere una estrategia para diferenciar entre vacío y lleno             |
| **Eficiencia**                  | Puede ser menos eficiente al mover elementos o redimensionar                 | Más eficiente, especialmente para implementaciones de tamaño fijo        |

---

**Ejemplo Visual de Cola Circular**

Imagina que tenemos una cola circular de tamaño 4, inicialmente vacía:

```
[_, _, _, _] (frente = 0, final = 0)
```

1. **Agregar 10 (enqueue 10)**:

```
[10, _, _, _] (frente = 0, final = 1)
```

2. **Agregar 20 (enqueue 20)**:

```
[10, 20, _, _] (frente = 0, final = 2)
```

3. **Eliminar (dequeue)** (se elimina 10):

```
[_, 20, _, _] (frente = 1, final = 2)
```

4. **Agregar 30 (enqueue 30)**:

```
[_, 20, 30, _] (frente = 1, final = 3)
```

5. **Agregar 40 (enqueue 40)**:

```
[_, 20, 30, 40] (frente = 1, final = 0)
```

6. **Eliminar (dequeue)** (se elimina 20):

```
[_, _, 30, 40] (frente = 2, final = 0)
```

Aquí, el espacio para el **10** se reutiliza. La cola funciona de manera eficiente sin perder memoria y manteniendo el tamaño fijo.

---

**Aplicaciones**

- **Colas circulares** son útiles cuando se necesita un **buffer circular**, como en el caso de la **gestión de recursos limitados** (ej., memoria caché, manejo de buffers en redes, transmisión de datos).
- Son más eficientes en situaciones donde la **capacitación fija** y la **reutilización del espacio** son importantes, como en sistemas embebidos o en redes donde el tamaño de los buffers es crítico.

---

# Ejercicios Prácticos

## Arrays

**Python**

1. Crea un programa que inicialice una lista con números del 1 al 10 y calcule su suma.
2. Escribe una función que busque un elemento específico en una lista y devuelva su índice o un mensaje indicando que no se encontró.

**JavaScript**

1. Crea un arreglo con los nombres de tus amigos y muestra el nombre más largo.
2. Escribe una función que duplique cada número en un arreglo de enteros.

**Java**

1. Escribe un programa que inicialice un array con números aleatorios y ordene sus elementos en orden ascendente.
2. Implementa una función que encuentre el número más grande y su posición en un array.

---

## Listas Enlazadas Simples

**Python**

1. Implementa una lista enlazada simple que permita agregar un nodo al final y mostrar todos los nodos.
2. Crea una función para eliminar un nodo específico por valor en la lista enlazada.

**JavaScript**

1. Implementa una lista enlazada simple con funciones para agregar, eliminar y buscar nodos.
2. Escribe un método que cuente el número de nodos en la lista enlazada.

**Java**

1. Define una clase para una lista enlazada simple con métodos para insertar, eliminar y recorrer los nodos.
2. Implementa un método que invierta el orden de los nodos en la lista enlazada.

---

## Listas Enlazadas Dobles

**Python**

1. Implementa una lista enlazada doble con métodos para agregar nodos al inicio y al final.
2. Escribe una función que recorra la lista en ambos sentidos (adelante y atrás).

**JavaScript**

1. Implementa una lista enlazada doble con funciones para agregar y eliminar nodos en posiciones específicas.
2. Escribe una función que devuelva el valor del nodo central en una lista enlazada doble.

**Java**

1. Crea una clase para una lista enlazada doble con métodos para agregar y eliminar nodos en los extremos.
2. Implementa un método que cuente los nodos de una lista enlazada doble.

---

## Pilas

**Python**

1. Implementa una pila con funciones para apilar, desapilar y mostrar el elemento superior.
2. Escribe un programa que invierta el contenido de una cadena usando una pila.

**JavaScript**

1. Implementa una pila que permita verificar si una cadena tiene paréntesis balanceados.
2. Escribe una función que convierta un número decimal a binario usando una pila.

**Java**

1. Escribe un programa que utilice una pila para evaluar una expresión matemática en notación postfija.

---

## Colas

**Python**

1. Implementa una cola que permita agregar y eliminar elementos, mostrando siempre el frente.
2. Escribe un programa que simule la atención de clientes en una fila utilizando una cola.

**JavaScript**

1. Implementa una cola con funciones básicas y úsala para gestionar un sistema de tareas pendientes.
2. Escribe una función que ordene las palabras de una frase en una cola y las devuelva en orden inverso.

**Java**

1. Define una clase para una cola simple con métodos para agregar, eliminar y mostrar el frente de la cola.
2. Implementa un programa que utilice una cola para simular un sistema de impresión de documentos.

---
