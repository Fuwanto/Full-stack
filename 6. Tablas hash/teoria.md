# Tablas hash: funciones de hash, colisiones.

- **Funciones de hash**: Son funciones que asignan un valor de clave única a un dato, ayudando a que se pueda encontrar de manera rápida en la tabla.
- **Colisiones**: Ocurren cuando dos claves diferentes generan el mismo valor de hash, lo que provoca que ambas intenten almacenarse en la misma posición de la tabla.

### 1. Tabla Hash:

Una tabla hash es una estructura de datos que permite almacenar pares clave-valor. La clave se usa como entrada en una función de hash para calcular una posición en la tabla donde se guarda el valor asociado a esa clave. Las tablas hash son muy eficientes para operaciones de búsqueda, inserción y eliminación.

### 2. Función de Hash:

Una función de hash toma una clave y devuelve un valor de índice dentro de un rango determinado (tamaño de la tabla). Una buena función de hash distribuye uniformemente las claves en la tabla.

### 3. Colisiones:

Las colisiones ocurren cuando dos claves diferentes generan el mismo índice. Existen varios métodos para manejar las colisiones, siendo los más comunes:

- **Encadenamiento (Chaining)**: Cada celda de la tabla contiene una lista (o lista enlazada) de elementos que tienen el mismo valor de hash.
- **Dirección Abierta (Open Addressing)**: Cuando ocurre una colisión, se busca otra posición libre en la tabla utilizando una técnica de sondeo (por ejemplo, sondeo lineal o cuadrático).

---

### 1. Implementación de Tablas Hash en Python (con Encadenamiento)

```python
class HashTable:
    def __init__(self, size):
        self.size = size
        self.table = [[] for _ in range(size)]  # Inicializamos la tabla con listas vacías para el encadenamiento

    # Función de hash simple (modulo)
    def hash_function(self, key):
        return key % self.size

    # Insertar un valor en la tabla hash
    def insert(self, key, value):
        index = self.hash_function(key)
        self.table[index].append((key, value))  # Añadimos el par (clave, valor) en la lista correspondiente

    # Buscar un valor en la tabla hash
    def search(self, key):
        index = self.hash_function(key)
        for k, v in self.table[index]:
            if k == key:
                return v
        return None  # Si no se encuentra la clave

    # Eliminar un valor de la tabla hash
    def delete(self, key):
        index = self.hash_function(key)
        for i, (k, v) in enumerate(self.table[index]):
            if k == key:
                del self.table[index][i]
                return True
        return False  # Si no se encuentra la clave

# Ejemplo de uso
ht = HashTable(10)
ht.insert(5, "Valor 5")
ht.insert(15, "Valor 15")  # Ocurre una colisión en el índice 5, se agregará a la lista
ht.insert(25, "Valor 25")  # También colisión en el índice 5

print(ht.search(5))  # Output esperado: "Valor 5"
print(ht.search(15))  # Output esperado: "Valor 15"
print(ht.search(30))  # Output esperado: None

ht.delete(15)
print(ht.search(15))  # Output esperado: None (ya fue eliminado)
```

### Explicación:

1. **hash_function**: Una función de hash simple que calcula el índice en la tabla usando el operador módulo (`key % size`).
2. **insert**: Inserta un par clave-valor en la tabla. Si ocurre una colisión (por ejemplo, varias claves tienen el mismo valor de hash), los elementos se almacenan en una lista enlazada en esa posición.
3. **search**: Busca un valor dado una clave. Si la clave está en la tabla, retorna su valor; si no, retorna `None`.
4. **delete**: Elimina un par clave-valor de la tabla. Si no encuentra la clave, retorna `False`.

### 2. Implementación en JavaScript

Ahora implementaremos la tabla hash en **JavaScript**, usando el método de encadenamiento para resolver las colisiones.

```javascript
class HashTable {
  constructor(size) {
    this.size = size;
    this.table = new Array(size).fill(null).map(() => []); // Inicializamos la tabla con listas vacías
  }

  // Función de hash simple (modulo)
  hashFunction(key) {
    return key % this.size;
  }

  // Insertar un valor en la tabla hash
  insert(key, value) {
    const index = this.hashFunction(key);
    this.table[index].push([key, value]); // Añadimos el par (clave, valor) en la lista correspondiente
  }

  // Buscar un valor en la tabla hash
  search(key) {
    const index = this.hashFunction(key);
    for (let [k, v] of this.table[index]) {
      if (k === key) {
        return v;
      }
    }
    return null; // Si no se encuentra la clave
  }

  // Eliminar un valor de la tabla hash
  delete(key) {
    const index = this.hashFunction(key);
    const list = this.table[index];
    for (let i = 0; i < list.length; i++) {
      if (list[i][0] === key) {
        list.splice(i, 1);
        return true;
      }
    }
    return false; // Si no se encuentra la clave
  }
}

// Ejemplo de uso
const ht = new HashTable(10);
ht.insert(5, "Valor 5");
ht.insert(15, "Valor 15"); // Colisión
ht.insert(25, "Valor 25"); // Colisión

console.log(ht.search(5)); // "Valor 5"
console.log(ht.search(15)); // "Valor 15"
console.log(ht.search(30)); // null

ht.delete(15);
console.log(ht.search(15)); // null
```

### 3. Implementación en Java

Finalmente, implementamos la misma estructura en **Java**, también usando encadenamiento para resolver las colisiones.

```java
import java.util.LinkedList;

class HashTable {
    private LinkedList<Entry>[] table;
    private int size;

    // Clase interna para almacenar pares (clave, valor)
    class Entry {
        int key;
        String value;
        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];  // Inicializamos la tabla con listas enlazadas vacías
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Función de hash simple (modulo)
    private int hashFunction(int key) {
        return key % size;
    }

    // Insertar un valor en la tabla hash
    public void insert(int key, String value) {
        int index = hashFunction(key);
        table[index].add(new Entry(key, value));  // Añadimos el par (clave, valor)
    }

    // Buscar un valor en la tabla hash
    public String search(int key) {
        int index = hashFunction(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;  // Si no se encuentra la clave
    }

    // Eliminar un valor de la tabla hash
    public boolean delete(int key) {
        int index = hashFunction(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                table[index].remove(entry);
                return true;
            }
        }
        return false;  // Si no se encuentra la clave
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.insert(5, "Valor 5");
        ht.insert(15, "Valor 15");  // Colisión
        ht.insert(25, "Valor 25");  // Colisión

        System.out.println(ht.search(5));  // "Valor 5"
        System.out.println(ht.search(15));  // "Valor 15"
        System.out.println(ht.search(30));  // null

        ht.delete(15);
        System.out.println(ht.search(15));  // null
    }
}
```

### Resumen:

- **Tabla Hash**: Utiliza una función de hash para asignar claves a índices en una tabla.
- **Colisiones**: Se manejan usando **encadenamiento**, donde las claves que tienen el mismo índice se almacenan en una lista enlazada.
- **Funciones de hash**: La función hash básica utilizada aquí es `key % size`.
