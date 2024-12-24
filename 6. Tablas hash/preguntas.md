# Preguntas Teóricas Integradoras

## Tabla Hash

### ¿Qué es una tabla hash y cuál es su principal ventaja sobre otras estructuras de datos?

Una **tabla hash** (o hash table) es una estructura de datos que asocia **claves** (keys) con **valores** mediante una función hash. La función hash transforma la clave en un índice dentro de un array, donde se almacena el valor correspondiente.

**Principales características:**

1. **Clave-valor:** Cada elemento se almacena como un par clave-valor.
2. **Función hash:** Determina la ubicación del par clave-valor en la tabla, convirtiendo la clave en un índice.
3. **Colisiones:** Cuando dos claves producen el mismo índice, se gestionan mediante técnicas como:
   - **Encadenamiento:** Usar una lista enlazada en cada índice para almacenar múltiples elementos.
   - **Dirección abierta:** Buscar otro índice disponible en el array.

---

**Ventajas principales:**

1. **Búsqueda rápida:** En promedio, las operaciones de búsqueda, inserción y eliminación tienen una **complejidad O(1)** debido a que el acceso al índice del array es constante.
2. **Flexibilidad en el manejo de datos:** Las tablas hash pueden almacenar y recuperar datos rápidamente sin importar el tamaño o la naturaleza de las claves (pueden ser números, strings, etc.).

---

**Comparación con otras estructuras de datos:**

| Estructura de datos  | Búsqueda           | Inserción     | Ventajas frente a la tabla hash                                    |
| -------------------- | ------------------ | ------------- | ------------------------------------------------------------------ |
| **Lista enlazada**   | O(n)               | O(1) al final | Más eficiente para inserciones secuenciales o acceso ordenado.     |
| **Árbol binario**    | O(log n)           | O(log n)      | Mejores para datos que requieren ordenación o recorridos en orden. |
| **Arreglo ordenado** | O(log n) (binaria) | O(n)          | Ideal para datos que necesitan mantener el orden constantemente.   |

---

**Principal desventaja de las tablas hash:**

- **Colisiones:** Aunque bien diseñadas, las colisiones pueden degradar el rendimiento a **O(n)** en el peor caso.
- **No tienen orden:** No es útil si se necesita recorrer los datos en un orden específico.

Por estas razones, las tablas hash son ideales cuando la rapidez es crucial y el orden de los datos no es importante.

### Explica cómo se utiliza una función hash para determinar la posición de un dato en una tabla hash.

La **función hash** es el mecanismo clave que permite a una tabla hash ubicar un dato (o par clave-valor) en una posición específica dentro de su estructura. Su objetivo es tomar una **clave** (key) y transformarla en un **índice** dentro del array que representa la tabla hash.

**Proceso de ubicación en la tabla hash usando una función hash**

1. **Definición de la clave:**

   - El usuario proporciona una clave, que puede ser de cualquier tipo (número, cadena, etc.).
   - Ejemplo: La clave es `"gato"`.

2. **Aplicación de la función hash:**

   - La clave pasa por una **función hash**. Esta función toma la clave como entrada y produce un número entero, que sirve como índice en el array subyacente.
   - Por ejemplo:
     ```python
     hash("gato") -> 123456789
     ```

3. **Cálculo del índice:**

   - Dado que la tabla hash tiene un tamaño fijo (por ejemplo, 10 posiciones), el número resultante de la función hash se reduce a un rango válido mediante el operador **módulo** (`%`):
     ```python
     índice = hash("gato") % tamaño_tabla
     ```
   - Supongamos que:
     ```python
     123456789 % 10 -> 9
     ```
   - Esto significa que el par clave-valor asociado con `"gato"` se almacena en la posición **9** del array.

4. **Almacenamiento del dato:**

   - El valor correspondiente a la clave se guarda en la posición calculada:
     ```python
     tabla_hash[9] = ("gato", valor)
     ```

5. **Acceso posterior:**
   - Para recuperar el valor asociado con una clave, se aplica nuevamente la función hash para determinar su índice:
     ```python
     índice = hash("gato") % tamaño_tabla
     ```
   - Luego, se accede directamente a la posición correspondiente del array.

---

**Ejemplo en Python:**

Supongamos que tienes una tabla hash de tamaño 5 y quieres almacenar el par clave-valor `"gato": "animal"`:

```python
# Función hash simple:
def funcion_hash(clave):
    return sum(ord(c) for c in clave) % 5  # Suma ASCII de caracteres, módulo tamaño

# Cálculo del índice:
clave = "gato"
indice = funcion_hash(clave)  # Calcula índice -> 4

# Almacena en la tabla:
tabla_hash = [None] * 5
tabla_hash[indice] = ("gato", "animal")

# Resultado:
print(tabla_hash)  # [None, None, None, None, ('gato', 'animal')]

# Para acceder al valor:
indice = funcion_hash("gato")
print(tabla_hash[indice][1])  # "animal"
```

---

**Ventajas del uso de una función hash:**

- **Acceso rápido:** Transforma claves complejas en índices, permitiendo acceso directo al array.
- **Flexibilidad:** Admite claves de diferentes tipos.
- **Eficiencia:** Reduce el tiempo de búsqueda en comparación con recorrer estructuras como listas o árboles.

Sin embargo, si dos claves generan el mismo índice (colisión), se deben implementar estrategias de resolución de colisiones como encadenamiento o direccionamiento abierto.

### ¿En qué escenarios sería ideal utilizar una tabla hash?

Una tabla hash es ideal en escenarios donde se requieren operaciones rápidas de búsqueda, inserción y eliminación, especialmente cuando no es necesario preservar un orden específico de los datos.

1. **Almacenamiento y recuperación rápida de datos**

   - **Ejemplo:** Crear un sistema de autenticación que relacione usuarios (clave) con sus contraseñas cifradas (valor).
     - Con una tabla hash, se puede verificar la existencia de un usuario en **O(1)**.
   - **Ideal para:** Bases de datos en memoria, cachés y sistemas de autenticación.

---

2. **Sistemas de caché**

   - En aplicaciones donde ciertos resultados o datos se reutilizan frecuentemente, una tabla hash puede actuar como caché.
   - **Ejemplo:** Almacenar resultados de cálculos complejos o respuestas de consultas frecuentes en una API.
   - **Ventaja:** Permite acceder al dato en tiempo constante.

---

3. **Indexación por claves**

   - **Ejemplo:** En un diccionario de palabras, almacenar la palabra como clave y su definición como valor.
   - **Ideal para:** Implementar diccionarios, mapas o sistemas de indexación rápida.

---

4. **Conteo de frecuencia**

   - Determinar la frecuencia de aparición de elementos en un conjunto.
   - **Ejemplo:** Contar palabras en un texto.
     - Usar cada palabra como clave y su frecuencia como valor.
   - **Ventaja:** Realiza el conteo en tiempo lineal respecto al número de palabras.

---

5. **Sistemas de búsqueda inversa**

   - Relacionar valores con claves, pero con acceso rápido desde las claves.
   - **Ejemplo:** En un servidor DNS, asociar nombres de dominio (clave) con direcciones IP (valor).
   - **Ventaja:** Resolución de nombres rápida y eficiente.

---

6. **Almacenamiento de configuraciones o parámetros**

   - Para aplicaciones que necesitan manejar configuraciones o pares clave-valor dinámicos.
   - **Ejemplo:** Almacenar las preferencias del usuario en una aplicación web.
   - **Ventaja:** Fácil acceso y actualización de valores.

---

7. **Detección rápida de duplicados**

   - Almacenar elementos únicos en una colección.
   - **Ejemplo:** En una lista de nombres, detectar si un nombre ya está presente.
     - Las claves serían los nombres y los valores podrían ser un indicador booleano.

---

8. **Implementación de conjuntos (sets)**

   - Una tabla hash puede usarse para implementar conjuntos, donde las claves representan los elementos y los valores son irrelevantes (o simplemente un indicador de existencia).
   - **Ejemplo:** Comprobar la membresía en un conjunto grande, como números únicos en un sistema.

---

9. **Juegos y simulaciones**

   - Asociar identificadores únicos con estados, datos o configuraciones.
   - **Ejemplo:** En un videojuego, relacionar identificadores de jugadores con sus estadísticas.

---

10. **Sistemas de almacenamiento distribuido**

- Las tablas hash son la base de técnicas como el **hashing consistente**, utilizadas para distribuir datos entre servidores en sistemas escalables.
- **Ejemplo:** Sistemas de bases de datos distribuidas como DynamoDB.

---

**Escenarios donde **no** es ideal:**

1. **Cuando los datos necesitan estar ordenados:** Una tabla hash no preserva el orden, por lo que estructuras como árboles binarios o listas enlazadas ordenadas serían mejores.
2. **Si las claves tienen una distribución desigual:** Una mala función hash puede generar muchas colisiones, afectando el rendimiento.
3. **Cuando se necesita recorrer todos los elementos en orden:** Estructuras como árboles o listas son más adecuadas para esto.

## Función de Hash

### ¿Qué propiedades debe cumplir una buena función de hash?

Una buena función de hash debe cumplir ciertas propiedades clave para garantizar el rendimiento y la confiabilidad de la tabla hash. Estas propiedades minimizan las colisiones, maximizan la distribución uniforme y aseguran que el acceso sea eficiente.

**Propiedades principales de una buena función de hash:**

1. **Distribución uniforme:**
   - Los valores hash generados deben estar distribuidos de manera uniforme a lo largo del rango permitido (tamaño de la tabla).
   - **Por qué es importante:** Una distribución uniforme minimiza las colisiones (cuando dos claves generan el mismo índice) y mejora el rendimiento de las operaciones.

---

2. **Determinismo:**
   - Para una misma clave de entrada, la función hash siempre debe producir el mismo resultado.
   - **Por qué es importante:** Esto garantiza que se pueda recuperar un dato específico en el futuro utilizando la misma clave.

---

3. **Rapidez:**
   - La función hash debe ser eficiente de calcular, incluso para claves grandes.
   - **Por qué es importante:** El tiempo de cómputo de la función hash no debe convertirse en un cuello de botella, especialmente en sistemas que realizan muchas inserciones o búsquedas.

---

4. **Resistencia a colisiones:**
   - Aunque es inevitable que existan colisiones (dado que el espacio de claves es más grande que el rango del índice), una buena función hash debe minimizar su frecuencia.
   - **Por qué es importante:** Las colisiones afectan el rendimiento, especialmente si la tabla hash no maneja bien su resolución.

---

5. **Sensibilidad a los cambios en la clave:**
   - Un cambio pequeño en la clave debe producir un cambio significativo e impredecible en el valor hash.
   - **Por qué es importante:** Esto mejora la distribución y reduce el riesgo de patrones que concentren claves similares en los mismos índices.

---

6. **Compatibilidad con el rango de la tabla:**
   - La función hash debe generar valores dentro del rango permitido por el tamaño de la tabla, generalmente logrando esto con el operador módulo (`%`).
   - **Por qué es importante:** Los índices fuera del rango de la tabla hash son inútiles.

---

7. **Adaptabilidad a diferentes tipos de claves:**
   - La función debe funcionar bien con distintos tipos de claves (números, cadenas, objetos, etc.) y ser capaz de procesarlas de manera consistente.
   - **Por qué es importante:** Esto aumenta la flexibilidad de la tabla hash.

---

**Ejemplo: Evaluación de una función hash**

Supongamos que usamos la siguiente función hash para cadenas en Python:

```python
def hash_simple(clave, tamaño_tabla):
    return sum(ord(c) for c in clave) % tamaño_tabla
```

- **Determinismo:** La misma cadena siempre produce el mismo valor hash.
- **Rapidez:** La suma de valores ASCII es rápida de calcular.
- **Distribución uniforme:** Puede ser buena para muchas cadenas, pero claves similares (`"abc"` y `"cab"`) podrían generar valores hash iguales, causando colisiones.
- **Sensibilidad:** No es muy sensible a cambios menores en las claves; por ejemplo, `"ab"` y `"ba"` tienen el mismo valor hash en tablas pequeñas.

---

**Propiedades adicionales en sistemas específicos:**

1. **Resistencia a ataques (hashing criptográfico):**

   - En sistemas donde la seguridad es importante (como contraseñas o aplicaciones web), la función hash debe ser resistente a ataques como colisiones deliberadas o preimágenes inversas.
   - **Ejemplo:** Usar funciones como SHA-256 para aplicaciones de seguridad.

2. **Compatibilidad con tablas dinámicas:**
   - En tablas hash que cambian de tamaño (rehashing), la función debe ser eficiente incluso si se recalculan muchos índices.

---

**En resumen:**

Una buena función hash combina eficiencia, distribución uniforme y resistencia a colisiones para asegurar un rendimiento óptimo de la tabla hash, independientemente del tamaño de los datos o las claves utilizadas.

## Colisiones

### ¿Qué es una colisión en una tabla hash y por qué ocurre?

Una **colisión** en una tabla hash ocurre cuando dos o más claves diferentes generan el mismo **índice** al pasar por la función hash. Esto significa que estas claves se "asignan" a la misma posición en el array subyacente de la tabla hash.

---

**¿Por qué ocurren las colisiones?**

1. **Espacio limitado en la tabla hash:**

   - La tabla hash tiene un tamaño fijo (generalmente un array de tamaño `N`).
   - La función hash produce un rango limitado de índices dentro de `[0, N-1]`. Sin embargo, el número de posibles claves es mucho mayor que el número de índices disponibles.
   - **Ejemplo:** Si la tabla tiene 10 posiciones, pero hay 20 claves, al menos dos claves compartirán índice (por el principio del casillero).

2. **Mala distribución de la función hash:**

   - Si la función hash no distribuye las claves uniformemente en el rango permitido, es más probable que las claves se concentren en unos pocos índices, aumentando las colisiones.
   - **Ejemplo:** Una función hash que siempre devuelve 0 para cualquier clave causará colisiones en todos los casos.

3. **Claves similares:**

   - Si las claves tienen características comunes (por ejemplo, prefijos o patrones repetidos), y la función hash no las distingue bien, puede generar el mismo índice.
   - **Ejemplo:** Las claves `"abc"` y `"cab"` pueden colisionar si la función hash no es sensible al orden de los caracteres.

4. **Tamaño insuficiente de la tabla:**

   - Si la tabla es pequeña en relación con el número de claves, habrá más probabilidades de que dos claves compartan el mismo índice.

5. **Uso del operador módulo (`%`):**
   - Aunque el operador módulo es eficiente para limitar el rango de valores hash, también puede causar más colisiones si el tamaño de la tabla no es adecuado.
   - **Ejemplo:** Si el tamaño de la tabla es un número pequeño y no primo, patrones comunes en los valores hash pueden concentrarse en ciertos índices.

---

**Ejemplo de colisión**

Supongamos que tenemos una tabla hash de tamaño `5` y una función hash simple:

```python
def funcion_hash(clave):
    return sum(ord(c) for c in clave) % 5
```

Claves: `"gato"` y `"pato"`.

1. Calcular el hash para `"gato"`:

   - Suma ASCII: `ord('g') + ord('a') + ord('t') + ord('o') = 103 + 97 + 116 + 111 = 427`
   - Índice: `427 % 5 = 2`

2. Calcular el hash para `"pato"`:
   - Suma ASCII: `ord('p') + ord('a') + ord('t') + ord('o') = 112 + 97 + 116 + 111 = 436`
   - Índice: `436 % 5 = 2`

Ambas claves generan el índice `2`, causando una colisión.

### Describe dos métodos comunes para resolver colisiones: encadenamiento y direccionamiento abierto.

Las colisiones en una tabla hash son inevitables, pero existen métodos para manejarlas eficazmente. Dos de los métodos más comunes son el **encadenamiento** y el **direccionamiento abierto**:

**1. Encadenamiento (Chaining)**

**Cómo funciona:**

En el encadenamiento, cada posición de la tabla hash (índice) contiene una estructura de datos adicional (como una lista enlazada) para almacenar múltiples pares clave-valor que comparten el mismo índice.

- Cuando ocurre una colisión, los elementos se agregan a la lista del índice correspondiente.
- Durante la búsqueda, se recorre la lista para encontrar la clave deseada.

**Ventajas:**

- No hay límite en el número de elementos que pueden almacenarse en un índice (más allá de la memoria disponible).
- Funciona bien incluso si la tabla está llena, ya que las claves se almacenan en listas.

**Desventajas:**

- Si muchas claves colisionan en un mismo índice, la lista se hace larga y el tiempo de búsqueda pasa de \(O(1)\) a \(O(n)\) en el peor caso.
- Requiere memoria adicional para las listas.

**Ejemplo en Python:**

```python
class TablaHash:
    def __init__(self, tamaño):
        self.tamaño = tamaño
        self.tabla = [[] for _ in range(tamaño)]  # Lista de listas

    def hash_func(self, clave):
        return hash(clave) % self.tamaño

    def insertar(self, clave, valor):
        índice = self.hash_func(clave)
        # Buscar si la clave ya existe en la lista
        for par in self.tabla[índice]:
            if par[0] == clave:
                par[1] = valor  # Actualizar valor si la clave existe
                return
        self.tabla[índice].append([clave, valor])  # Agregar nuevo par clave-valor

    def buscar(self, clave):
        índice = self.hash_func(clave)
        for par in self.tabla[índice]:
            if par[0] == clave:
                return par[1]
        return None  # Clave no encontrada

# Uso
tabla = TablaHash(5)
tabla.insertar("gato", "animal")
tabla.insertar("pato", "ave")
tabla.insertar("tigre", "mamífero")
print(tabla.tabla)  # Ver la tabla hash
```

---

**2. Direccionamiento Abierto (Open Addressing)**

**Cómo funciona:**

En el direccionamiento abierto, las colisiones se resuelven buscando otro índice disponible dentro de la tabla para almacenar el par clave-valor.

- Cuando ocurre una colisión, se usa una **estrategia de sondeo** (probing) para encontrar el próximo índice vacío.
- Métodos comunes de sondeo:
  1. **Sondeo lineal:** Probar índices consecutivos (\(i + 1, i + 2, \dots\)).
  2. **Sondeo cuadrático:** Probar índices siguiendo un patrón cuadrático (\(i + 1^2, i + 2^2, \dots\)).
  3. **Hashing doble:** Usar una segunda función hash para determinar el salto entre índices.

**Ventajas:**

- Utiliza únicamente el array principal, sin estructuras adicionales.
- Es más eficiente en memoria que el encadenamiento.

**Desventajas:**

- Si la tabla está casi llena, las búsquedas y las inserciones pueden volverse lentas.
- Es necesario implementar una política de redimensionamiento para evitar el deterioro del rendimiento.

**Ejemplo en Python:**

```python
class TablaHash:
    def __init__(self, tamaño):
        self.tamaño = tamaño
        self.tabla = [None] * tamaño  # Array fijo
        self.ocupados = 0

    def hash_func(self, clave):
        return hash(clave) % self.tamaño

    def insertar(self, clave, valor):
        índice = self.hash_func(clave)
        original = índice
        while self.tabla[índice] is not None:
            if self.tabla[índice][0] == clave:  # Actualizar si la clave ya existe
                self.tabla[índice] = (clave, valor)
                return
            índice = (índice + 1) % self.tamaño  # Sondeo lineal
            if índice == original:
                raise Exception("Tabla llena")
        self.tabla[índice] = (clave, valor)
        self.ocupados += 1

    def buscar(self, clave):
        índice = self.hash_func(clave)
        original = índice
        while self.tabla[índice] is not None:
            if self.tabla[índice][0] == clave:
                return self.tabla[índice][1]
            índice = (índice + 1) % self.tamaño
            if índice == original:
                return None  # Clave no encontrada
        return None

# Uso
tabla = TablaHash(5)
tabla.insertar("gato", "animal")
tabla.insertar("pato", "ave")
tabla.insertar("tigre", "mamífero")
print(tabla.tabla)  # Ver la tabla hash
```

---

**Comparación entre encadenamiento y direccionamiento abierto**

| **Aspecto**                      | **Encadenamiento**                               | **Direccionamiento Abierto**                  |
| -------------------------------- | ------------------------------------------------ | --------------------------------------------- |
| **Uso de memoria**               | Requiere memoria adicional para las listas.      | Usa solo el array principal.                  |
| **Eficiencia con colisiones**    | Rendimiento aceptable si las listas son cortas.  | Se degrada si la tabla está casi llena.       |
| **Facilidad de implementación**  | Relativamente más sencillo.                      | Requiere lógica adicional para el sondeo.     |
| **Rehashing/redimensionamiento** | Más fácil, ya que las listas son independientes. | Complejo, ya que las claves deben reubicarse. |

Ambos métodos son útiles dependiendo del caso, pero **encadenamiento** suele ser preferido cuando las claves son altamente variables o impredecibles, mientras que el **direccionamiento abierto** es más eficiente en sistemas con espacio limitado y una tabla bien dimensionada.

### ¿Qué es el "factor de carga" en una tabla hash y cómo afecta su rendimiento?

El **factor de carga** (\(\alpha\)) de una tabla hash es una medida que indica qué tan llena está la tabla. Es la relación entre el número de elementos almacenados y el tamaño total de la tabla. Matemáticamente, se define como:

\[
\alpha = \frac{\text{Número de elementos almacenados}}{\text{Tamaño de la tabla}}
\]

---

**Impacto del factor de carga en el rendimiento**

El factor de carga afecta significativamente el rendimiento de las operaciones de una tabla hash (\(O(1)\) en el mejor caso, pero puede degradarse con colisiones). Su influencia depende del método que se utilice para manejar las colisiones.

---

**1. Encadenamiento:**

- **Rendimiento:**
  - Las operaciones (búsqueda, inserción, eliminación) tienen una **complejidad promedio de \(O(1 + \alpha)\)**.
  - A medida que \(\alpha\) aumenta (la tabla se llena), las listas en cada índice se alargan, lo que incrementa el tiempo de búsqueda y manipulación.
- **Consejo práctico:**
  - Mantener el factor de carga bajo (\(\alpha \leq 1\)) suele ser ideal para evitar largas listas.

---

**2. Direccionamiento abierto:**

- **Rendimiento:**
  - Las operaciones de búsqueda e inserción dependen de encontrar un índice vacío o la clave deseada.
  - Cuando el factor de carga aumenta (\(\alpha \to 1\)), la probabilidad de encontrar espacios disponibles disminuye, lo que hace que el tiempo promedio de inserción y búsqueda crezca considerablemente.
  - En el peor caso (\(\alpha = 1\)), la tabla está completamente llena, y no se pueden insertar nuevos elementos.
- **Consejo práctico:**
  - Mantener el factor de carga bajo (\(\alpha \leq 0.7\)) garantiza un buen rendimiento y reduce el número de colisiones.

---

**Rendimiento según el factor de carga**

| **Factor de carga (\(\alpha\))** | **Efecto en el rendimiento**                                   |
| -------------------------------- | -------------------------------------------------------------- |
| **\(\alpha \ll 1\)**             | Bajo número de colisiones, operaciones muy rápidas (\(O(1)\)). |
| **\(\alpha \approx 0.5\)**       | Balance entre espacio desperdiciado y rendimiento óptimo.      |
| **\(\alpha > 0.7\)**             | Aumento notable en colisiones y tiempo de búsqueda/inserción.  |
| **\(\alpha \to 1\)**             | Muy alto número de colisiones, rendimiento degrada (\(O(n)\)). |

---

**Control del factor de carga: Rehashing**

Cuando el factor de carga excede un umbral crítico (como \(0.7\) o \(1\), dependiendo del diseño), se realiza una operación conocida como **rehashing**:

1. **Incrementar el tamaño de la tabla:** Generalmente, el tamaño se duplica y se elige un número primo para minimizar colisiones.
2. **Recalcular índices:** Todas las claves se reinsertan utilizando la función hash, recalculando sus posiciones en la nueva tabla.

**Ejemplo en Python:**

```python
class TablaHash:
    def __init__(self, tamaño):
        self.tamaño = tamaño
        self.tabla = [None] * tamaño
        self.ocupados = 0

    def hash_func(self, clave):
        return hash(clave) % self.tamaño

    def insertar(self, clave, valor):
        if self.ocupados / self.tamaño > 0.7:  # Verificar el factor de carga
            self.rehash()
        índice = self.hash_func(clave)
        while self.tabla[índice] is not None:
            if self.tabla[índice][0] == clave:  # Actualizar si ya existe
                self.tabla[índice] = (clave, valor)
                return
            índice = (índice + 1) % self.tamaño
        self.tabla[índice] = (clave, valor)
        self.ocupados += 1

    def rehash(self):
        print("Rehashing...")
        elementos_antiguos = self.tabla
        self.tamaño *= 2
        self.tabla = [None] * self.tamaño
        self.ocupados = 0
        for elemento in elementos_antiguos:
            if elemento:
                self.insertar(*elemento)

# Uso
tabla = TablaHash(5)
for i in range(8):  # Insertar más de 7 elementos para forzar rehashing
    tabla.insertar(f"clave_{i}", f"valor_{i}")
print(tabla.tabla)  # Ver la tabla tras el rehashing
```

---

**Resumen:**

- El **factor de carga** mide qué tan llena está la tabla hash.
- Un \(\alpha\) alto puede causar más colisiones, ralentizando las operaciones.
- Se controla mediante un diseño adecuado:
  - **Encadenamiento:** Funciona mejor con \(\alpha \leq 1\).
  - **Direccionamiento abierto:** Requiere mantener \(\alpha \leq 0.7\).
- Para evitar problemas de rendimiento, se usa **rehashing** cuando \(\alpha\) supera un umbral predefinido.

---

# Ejercicios Prácticos

## Python

1. Implementa una tabla hash utilizando encadenamiento para resolver colisiones. Define operaciones básicas como insertar, buscar y eliminar elementos.
2. Escribe una función que calcule el índice hash para una clave dada y explica cómo minimiza las colisiones.
3. Simula el rehashing de una tabla hash cuando el factor de carga excede un valor determinado.

## JavaScript

1. Implementa una clase para una tabla hash básica con funciones para agregar, buscar y eliminar elementos.
2. Crea una función hash simple y analiza su rendimiento utilizando distintas claves.
3. Implementa una solución para colisiones usando direccionamiento abierto con la técnica de sondeo lineal (linear probing).

## Java

1. Implementa una tabla hash utilizando una lista de encadenamiento para manejar colisiones.
2. Escribe una función para calcular el índice hash utilizando el método de multiplicación.
3. Implementa el redimensionamiento de una tabla hash cuando su factor de carga supere un límite.
