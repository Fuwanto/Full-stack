# 1. Lógica de programación

## 1. Declaración e inicialización de variables.

Una **declaración** de variable es cuando le decimos al programa que queremos reservar espacio en la memoria para un valor, mientras que la **inicialización** es asignar un valor inicial a esa variable.

------

### Python

En Python, no necesitas declarar explícitamente el tipo de la variable; el lenguaje lo detecta automáticamente cuando le asignás un valor.

```python
# Declaración e inicialización en una sola línea:
edad = 25  # Entero
nombre = "Marta"  # Cadena de texto (string)
es_estudiante = True  # Booleano
altura = 1.68  # Flotante (float)
```

- Podés cambiar el tipo de dato de una variable en cualquier momento:

```python
edad = "veinticinco"  # Ahora es un string
```

------

### JavaScript

En JavaScript, podés declarar variables usando `var`, `let`, o `const`:

- **`var`**: Modo antiguo, tiene alcance global o de función.
- **`let`**: Modo moderno, tiene alcance de bloque.
- **`const`**: Para variables que no cambian.

```javascript
// Declaración e inicialización
let edad = 25; // Entero
const nombre = "Marta"; // Cadena de texto (string)
let esEstudiante = true; // Booleano
let altura = 1.68; // Flotante

// Cambiar el valor de una variable declarada con let:
edad = 26; 
// Con const no se puede:
nombre = "Juan"; // Error
```

------

### Java

En Java, siempre debés declarar el tipo de la variable antes de usarla. Es un lenguaje fuertemente tipado.

```java
// Declaración e inicialización
int edad = 25; // Entero
String nombre = "Marta"; // Cadena de texto
boolean esEstudiante = true; // Booleano
float altura = 1.68f; // Flotante (notar la 'f' al final)

// Las variables deben coincidir con su tipo:
edad = "veinticinco"; // Error: no se puede asignar un string a un entero
```

------

## 2. Tipos de Datos

### Python

#### Primitivos

1. **`int`**: Números enteros.
   Ejemplo: `5`, `-100`, `0`.

   ```python
   edad = 25
   ```

2. **`float`**: Números con decimales.
   Ejemplo: `3.14`, `-0.5`, `2.0`.

   ```python
   precio = 19.99
   ```

3. **`str`**: Cadena de texto (string).
   Ejemplo: `"Hola"`, `'Mundo'`.

   ```python
   nombre = "Marta"
   ```

4. **`bool`**: Valores booleanos (verdadero o falso).
   Ejemplo: `True`, `False`.

   ```python
   es_estudiante = True
   ```

------

#### Compuestos

1. **Listas (`list`)**: Colección ordenada de elementos que pueden ser de distintos tipos.
   Ejemplo: `[1, 2, 3]`, `["a", "b", "c"]`.

   ```python
   numeros = [1, 2, 3]
   palabras = ["hola", "mundo"]
   ```

2. **Tuplas (`tuple`)**: Similar a las listas, pero son inmutables (no se pueden modificar).
   Ejemplo: `(1, 2, 3)`, `("a", "b", "c")`.

   ```python
   coordenadas = (10, 20)
   ```

3. **Conjuntos (`set`)**: Colección no ordenada de elementos únicos.
   Ejemplo: `{1, 2, 3}`, `{"a", "b", "c"}`.

   ```python
   letras = {"a", "b", "c"}
   ```

4. **Diccionarios (`dict`)**: Colección de pares clave-valor.
   Ejemplo: `{"nombre": "Marta", "edad": 25}`.

   ```python
   persona = {"nombre": "Marta", "edad": 25}
   ```

------

### JavaScript

#### **Primitivos**

1. **`Number`**: Para números enteros y decimales.
   Ejemplo: `5`, `3.14`.

   ```javascript
   let edad = 25; // Entero
   let precio = 19.99; // Decimal
   ```

2. **`String`**: Cadena de texto.
   Ejemplo: `"Hola"`, `'Mundo'`.

   ```javascript
   let nombre = "Marta";
   ```

3. **`Boolean`**: Valores lógicos: verdadero o falso.
   Ejemplo: `true`, `false`.

   ```javascript
   let esEstudiante = true;
   ```

4. **`undefined`**: Cuando una variable está declarada pero no inicializada.

   ```javascript
   let sinValor; // undefined
   ```

5. **`null`**: Representa un valor vacío intencionalmente.

   ```javascript
   let valorNulo = null;
   ```

6. **`Symbol`**: Representa valores únicos. Poco común en principiantes.

7. **`BigInt`**: Para números más grandes que el límite de `Number`.

   ```javascript
   let numeroGrande = 123456789012345678901234567890n;
   ```

------

#### Compuestos

1. **Arrays**: Lista ordenada de elementos.
   Ejemplo: `[1, 2, 3]`, `["a", "b", "c"]`.

   ```javascript
   let numeros = [1, 2, 3];
   ```

2. **Objects**: Colección de pares clave-valor.
   Ejemplo: `{ clave: "valor" }`.

   ```javascript
   let persona = { nombre: "Marta", edad: 25 };
   ```

3. **Map**: Similar a los objetos, pero permite cualquier tipo de clave.

   ```javascript
   let mapa = new Map();
   mapa.set("clave", "valor");
   ```

4. **Set**: Colección de valores únicos.

   ```javascript
   let conjunto = new Set([1, 2, 3]);
   ```

------

### Java

En Java, todos los tipos de datos se deben declarar explícitamente. Se dividen en **primitivos** y **referenciados** (objetos).

------

#### Primitivos

1. **`int`**: Enteros.
   Ejemplo: `-2147483648` a `2147483647`.

   ```java
   int edad = 25;
   ```

2. **`float`**: Números decimales de precisión simple.
   Ejemplo: `1.5f`.

   ```java
   float altura = 1.68f; // La 'f' es obligatoria.
   ```

3. **`double`**: Números decimales de precisión doble.
   Ejemplo: `1.23456789`.

   ```java
   double precio = 19.99;
   ```

4. **`char`**: Un solo carácter (entre comillas simples).
   Ejemplo: `'a'`.

   ```java
   char inicial = 'M';
   ```

5. **`boolean`**: Valores lógicos.
   Ejemplo: `true`, `false`.

   ```java
   boolean esEstudiante = true;
   ```

6. **`long`**: Enteros grandes.
   Ejemplo: `123456789012345`.

   ```java
   long poblacion = 7800000000L; // La 'L' es obligatoria.
   ```

7. **`byte`** y **`short`**: Para números más pequeños, útiles si querés ahorrar memoria.

   ```java
   byte edadCorta = 100; // -128 a 127
   short salario = 32000; // -32,768 a 32,767
   ```

------

#### Referenciados (Objetos)

1. **`String`**: Cadena de texto.
   Ejemplo: `"Hola"`.

   ```java
   String nombre = "Marta";
   ```

2. **Arrays**: Colección ordenada de elementos del mismo tipo.
   Ejemplo:

   ```java
   int[] numeros = {1, 2, 3};
   String[] palabras = {"Hola", "Mundo"};
   ```

3. **Clases y Objetos**: Java permite definir tipos de datos personalizados a través de clases.
   Ejemplo:

   ```java
   class Persona {
       String nombre;
       int edad;
   }
   
   Persona persona = new Persona();
   persona.nombre = "Marta";
   persona.edad = 25;
   ```

------

## 3. Operadores

### Python

Los operadores son símbolos o palabras clave que permiten realizar operaciones en datos. Se dividen en varias categorías:

#### A. Operadores aritméticos

Realizan cálculos matemáticos básicos.

```python
a = 10
b = 3

print(a + b)  # Suma: 13
print(a - b)  # Resta: 7
print(a * b)  # Multiplicación: 30
print(a / b)  # División: 3.333...
print(a // b)  # División entera: 3
print(a % b)  # Módulo (resto): 1
print(a ** b)  # Potencia: 1000
```

------

#### B. Operadores relacionales (de comparación)

Compara dos valores y devuelve un resultado booleano (`True` o `False`).

```python
print(a == b)  # Igual a: False
print(a != b)  # Distinto de: True
print(a > b)   # Mayor que: True
print(a < b)   # Menor que: False
print(a >= b)  # Mayor o igual que: True
print(a <= b)  # Menor o igual que: False
```

------

#### C. Operadores lógicos

Trabajan con valores booleanos.

```python
x = True
y = False

print(x and y)  # AND lógico: False
print(x or y)   # OR lógico: True
print(not x)    # Negación lógica: False
```

------

#### D. Operadores de asignación

Asigna valores a variables.

```python
c = 5        # Asignación simple
c += 3       # Suma y asigna: c = c + 3 (8)
c -= 2       # Resta y asigna: c = c - 2 (6)
c *= 2       # Multiplica y asigna: c = c * 2 (12)
c /= 4       # Divide y asigna: c = c / 4 (3.0)
c %= 2       # Módulo y asigna: c = c % 2 (1.0)
```

------

#### E. Operadores bit a bit

Trabajan directamente a nivel binario.

```python
a = 5  # 0b0101
b = 3  # 0b0011

print(a & b)  # AND bit a bit: 1 (0b0001)
print(a | b)  # OR bit a bit: 7 (0b0111)
print(a ^ b)  # XOR bit a bit: 6 (0b0110)
print(~a)     # NOT bit a bit: -6 (complemento a dos)
print(a << 1) # Desplazamiento a la izquierda: 10 (0b1010)
print(a >> 1) # Desplazamiento a la derecha: 2 (0b0010)
```

------

### JavaScript

En JavaScript, los operadores tienen funciones similares a las de otros lenguajes, pero hay particularidades a destacar. Vamos por categorías.

------

#### A. Operadores aritméticos

Permiten realizar operaciones matemáticas básicas.

```javascript
let a = 10;
let b = 3;

console.log(a + b);  // Suma: 13
console.log(a - b);  // Resta: 7
console.log(a * b);  // Multiplicación: 30
console.log(a / b);  // División: 3.333...
console.log(a % b);  // Módulo (resto): 1
console.log(a ** b); // Potencia: 1000
```

------

#### B. Operadores relacionales (de comparación)

Compara dos valores y devuelve un booleano (`true` o `false`).

- Diferencias importantes entre `==` y `===`:
  - `==`: Compara los valores, haciendo conversión implícita si es necesario.
  - `===`: Compara valores y tipos estrictamente.

```javascript
console.log(a == "10");  // true (compara valores)
console.log(a === "10"); // false (compara valores y tipos)
console.log(a != b);     // true
console.log(a !== b);    // true
console.log(a > b);      // true
console.log(a < b);      // false
console.log(a >= b);     // true
console.log(a <= b);     // false
```

------

#### C. Operadores lógicos

Trabajan con valores booleanos. Soportan *short-circuit evaluation*.

```javascript
let x = true;
let y = false;

console.log(x && y);  // AND lógico: false
console.log(x || y);  // OR lógico: true
console.log(!x);      // NOT lógico: false
```

------

#### D. Operadores de asignación

Asignan valores a variables, permitiendo combinarlos con operaciones.

```javascript
let c = 5;

c += 3;  // c = c + 3 (8)
c -= 2;  // c = c - 2 (6)
c *= 2;  // c = c * 2 (12)
c /= 4;  // c = c / 4 (3)
c %= 2;  // c = c % 2 (1)
c **= 2; // c = c ** 2 (1)
```

------

#### **E. **Operadores bit a bit

Manipulan números a nivel binario.

```javascript
let a = 5;  // 0b0101
let b = 3;  // 0b0011

console.log(a & b);  // AND bit a bit: 1 (0b0001)
console.log(a | b);  // OR bit a bit: 7 (0b0111)
console.log(a ^ b);  // XOR bit a bit: 6 (0b0110)
console.log(~a);     // NOT bit a bit: -6
console.log(a << 1); // Desplazamiento a la izquierda: 10 (0b1010)
console.log(a >> 1); // Desplazamiento a la derecha: 2 (0b0010)
```

------

#### F. Operadores especiales en JavaScript

1. **`typeof`**: Para determinar el tipo de un valor.

   ```javascript
   console.log(typeof a); // "number"
   console.log(typeof "hello"); // "string"
   ```

2. **Operador ternario**: Para decisiones cortas.

   ```javascript
   let resultado = a > b ? "a es mayor" : "b es mayor";
   console.log(resultado); // "a es mayor"
   ```

------

### Java

En Java, los operadores están bien definidos y trabajan de manera estricta según los tipos de datos. Aquí está la explicación por categorías:

------

#### A. Operadores aritméticos

Permiten realizar operaciones matemáticas básicas.

```java
int a = 10;
int b = 3;

System.out.println(a + b);  // Suma: 13
System.out.println(a - b);  // Resta: 7
System.out.println(a * b);  // Multiplicación: 30
System.out.println(a / b);  // División entera: 3
System.out.println(a % b);  // Módulo (resto): 1

// Para trabajar con decimales:
double x = 10.0;
double y = 3.0;

System.out.println(x / y);  // División con decimales: 3.333...
```

------

#### B. Operadores relacionales (de comparación)

Comparan dos valores y devuelven un booleano (`true` o `false`).

```java
System.out.println(a == b);  // Igual a: false
System.out.println(a != b);  // Distinto de: true
System.out.println(a > b);   // Mayor que: true
System.out.println(a < b);   // Menor que: false
System.out.println(a >= b);  // Mayor o igual que: true
System.out.println(a <= b);  // Menor o igual que: false
```

------

#### C. Operadores lógicos

Trabajan con valores booleanos.

```java
boolean x = true;
boolean y = false;

System.out.println(x && y);  // AND lógico: false
System.out.println(x || y);  // OR lógico: true
System.out.println(!x);      // NOT lógico: false
```

------

#### D. Operadores de asignación

Asignan valores a variables y permiten combinar operaciones.

```java
int c = 5;

c += 3;  // c = c + 3 (8)
c -= 2;  // c = c - 2 (6)
c *= 2;  // c = c * 2 (12)
c /= 4;  // c = c / 4 (3)
c %= 2;  // c = c % 2 (1)
```

------

#### E. Operadores bit a bit

Operan directamente sobre los bits de los valores enteros.

```java
int a = 5;  // 0b0101
int b = 3;  // 0b0011

System.out.println(a & b);  // AND bit a bit: 1 (0b0001)
System.out.println(a | b);  // OR bit a bit: 7 (0b0111)
System.out.println(a ^ b);  // XOR bit a bit: 6 (0b0110)
System.out.println(~a);     // NOT bit a bit: -6
System.out.println(a << 1); // Desplazamiento a la izquierda: 10 (0b1010)
System.out.println(a >> 1); // Desplazamiento a la derecha: 2 (0b0010)
```

------

#### F. Operadores ternarios

Simplifican decisiones con un operador compacto.

```java
int resultado = (a > b) ? a : b;
System.out.println(resultado); // Devuelve el mayor de a y b.
```

------

## 4. Estructuras de control

### Python

Las estructuras de control permiten dirigir el flujo de ejecución del programa dependiendo de condiciones o repeticiones.

------

#### A. Condicionales

1. **`if`**: Ejecuta un bloque de código si la condición es verdadera.

   ```python
   edad = 20
   if edad >= 18:
       print("Eres mayor de edad.")
   ```

2. **`else`**: Ejecuta un bloque de código si la condición del `if` es falsa.

   ```python
   if edad < 18:
       print("Eres menor de edad.")
   else:
       print("Eres mayor de edad.")
   ```

3. **`elif`**: Permite verificar múltiples condiciones. Es una combinación de `else` y `if`.

   ```python
   if edad < 18:
       print("Eres menor de edad.")
   elif edad == 18:
       print("Acabas de cumplir la mayoría de edad.")
   else:
       print("Eres mayor de edad.")
   ```

4. **`match`** (a partir de Python 3.10): Similar a un `switch` en otros lenguajes.

   ```python
   color = "rojo"
   match color:
       case "rojo":
           print("El color es rojo")
       case "verde":
           print("El color es verde")
       case _:
           print("Color desconocido")
   ```

------

#### B. Bucles

1. **`for`**: Itera sobre una secuencia (como una lista, rango, etc.).

   ```python
   for i in range(5):  # Itera del 0 al 4
       print(i)
   ```

2. **`while`**: Ejecuta un bloque de código mientras una condición sea verdadera.

   ```python
   contador = 0
   while contador < 5:
       print(contador)
       contador += 1
   ```

3. **`break`**: Sale de un bucle inmediatamente.

   ```python
   for i in range(10):
       if i == 5:
           break
       print(i)
   ```

4. **`continue`**: Salta a la siguiente iteración del bucle.

   ```python
   for i in range(5):
       if i == 2:
           continue
       print(i)
   ```

------

### JavaScript

En JavaScript, las estructuras de control permiten modificar el flujo de ejecución del programa de manera similar a Python. Vamos a verlas.

------

#### A. Condicionales

1. **`if`**: Ejecuta un bloque de código si la condición es verdadera.

   ```javascript
   let edad = 20;
   if (edad >= 18) {
       console.log("Eres mayor de edad.");
   }
   ```

2. **`else`**: Ejecuta un bloque de código si la condición del `if` es falsa.

   ```javascript
   if (edad < 18) {
       console.log("Eres menor de edad.");
   } else {
       console.log("Eres mayor de edad.");
   }
   ```

3. **`else if`**: Permite evaluar múltiples condiciones.

   ```javascript
   if (edad < 18) {
       console.log("Eres menor de edad.");
   } else if (edad === 18) {
       console.log("Acabas de cumplir la mayoría de edad.");
   } else {
       console.log("Eres mayor de edad.");
   }
   ```

4. **`switch`**: Permite realizar múltiples comparaciones en un bloque de código de manera más legible (similar a un `match` de Python).

   ```javascript
   let color = "rojo";
   switch (color) {
       case "rojo":
           console.log("El color es rojo.");
           break;
       case "verde":
           console.log("El color es verde.");
           break;
       default:
           console.log("Color desconocido.");
           break;
   }
   ```

------

#### B. Bucles

1. **`for`**: Se usa para iterar sobre una secuencia (como un array o rango).

   ```javascript
   for (let i = 0; i < 5; i++) {
       console.log(i);
   }
   ```

2. **`while`**: Ejecuta un bloque de código mientras la condición sea verdadera.

   ```javascript
   let contador = 0;
   while (contador < 5) {
       console.log(contador);
       contador++;
   }
   ```

3. **`do...while`**: Ejecuta un bloque de código al menos una vez, y luego repite mientras la condición sea verdadera.

   ```javascript
   let contador = 0;
   do {
       console.log(contador);
       contador++;
   } while (contador < 5);
   ```

4. **`break`**: Sale de un bucle inmediatamente.

   ```javascript
   for (let i = 0; i < 10; i++) {
       if (i === 5) {
           break;
       }
       console.log(i);
   }
   ```

5. **`continue`**: Salta a la siguiente iteración del bucle.

   ```javascript
   for (let i = 0; i < 5; i++) {
       if (i === 2) {
           continue;  // Salta cuando i es igual a 2
       }
       console.log(i);
   }
   ```

------

### Java

En Java, las estructuras de control funcionan de manera similar a otros lenguajes, pero con una sintaxis más estricta. Vamos a repasarlas.

------

#### A. Condicionales

1. **`if`**: Ejecuta un bloque de código si la condición es verdadera.

   ```java
   int edad = 20;
   if (edad >= 18) {
       System.out.println("Eres mayor de edad.");
   }
   ```

2. **`else`**: Ejecuta un bloque de código si la condición del `if` es falsa.

   ```java
   if (edad < 18) {
       System.out.println("Eres menor de edad.");
   } else {
       System.out.println("Eres mayor de edad.");
   }
   ```

3. **`else if`**: Permite evaluar múltiples condiciones.

   ```java
   if (edad < 18) {
       System.out.println("Eres menor de edad.");
   } else if (edad == 18) {
       System.out.println("Acabas de cumplir la mayoría de edad.");
   } else {
       System.out.println("Eres mayor de edad.");
   }
   ```

4. **`switch`**: Se usa para realizar múltiples comparaciones sobre una misma variable, similar a un `match` o `case` en otros lenguajes.

   ```java
   String color = "rojo";
   switch (color) {
       case "rojo":
           System.out.println("El color es rojo.");
           break;
       case "verde":
           System.out.println("El color es verde.");
           break;
       default:
           System.out.println("Color desconocido.");
           break;
   }
   ```

------

#### B. Bucles

1. **`for`**: Se usa para iterar sobre una secuencia (como un array o rango).

   ```java
   for (int i = 0; i < 5; i++) {
       System.out.println(i);
   }
   ```

2. **`while`**: Ejecuta un bloque de código mientras la condición sea verdadera.

   ```java
   int contador = 0;
   while (contador < 5) {
       System.out.println(contador);
       contador++;
   }
   ```

3. **`do...while`**: Ejecuta un bloque de código al menos una vez, y luego repite mientras la condición sea verdadera.

   ```java
   int contador = 0;
   do {
       System.out.println(contador);
       contador++;
   } while (contador < 5);
   ```

4. **`break`**: Sale de un bucle inmediatamente.

   ```java
   for (int i = 0; i < 10; i++) {
       if (i == 5) {
           break; // Sale del bucle cuando i es 5
       }
       System.out.println(i);
   }
   ```

5. **`continue`**: Salta a la siguiente iteración del bucle.

   ```java
   for (int i = 0; i < 5; i++) {
       if (i == 2) {
           continue; // Salta la iteración cuando i es 2
       }
       System.out.println(i);
   }
   ```

---

## 5. Entrada y salida de datos

En los tres lenguajes, podemos realizar entrada y salida de datos para interactuar con el usuario o con el sistema.

------

#### A. Entrada por teclado

1. **Python** En Python, usamos la función `input()` para recibir datos desde el teclado. Si esperamos un número, necesitamos convertir el valor recibido.

   ```python
   nombre = input("¿Cuál es tu nombre? ")
   edad = int(input("¿Cuántos años tienes? "))  # Convertir a entero
   print(f"Hola, {nombre}. Tienes {edad} años.")
   ```

2. **JavaScript** En JavaScript, utilizamos `prompt()` para recibir datos en el navegador (usualmente con un cuadro de diálogo).

   ```javascript
   let nombre = prompt("¿Cuál es tu nombre?");
   let edad = parseInt(prompt("¿Cuántos años tienes?"));  // Convertir a número entero
   console.log("Hola, " + nombre + ". Tienes " + edad + " años.");
   ```

   **Nota:** `prompt()` funciona en entornos de navegador. Para entornos de Node.js, usaremos otras herramientas como `readline` o `prompt-sync`.

3. **Java** En Java, utilizamos la clase `Scanner` para leer datos desde la consola.

   ```java
   import java.util.Scanner;
   
   public class Main {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
   
           System.out.print("¿Cuál es tu nombre? ");
           String nombre = scanner.nextLine();
   
           System.out.print("¿Cuántos años tienes? ");
           int edad = scanner.nextInt();
   
           System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
       }
   }
   ```

------

#### B. Salida por consola

1. **Python** En Python, usamos la función `print()` para mostrar información en la consola.

   ```python
   nombre = "Juan"
   print("Hola, " + nombre + ". Bienvenido.")
   ```

   También podemos usar f-strings para formatear mejor las cadenas:

   ```python
   edad = 25
   print(f"Tienes {edad} años.")
   ```

2. **JavaScript** En JavaScript, usamos `console.log()` para imprimir mensajes en la consola del navegador o en Node.js.

   ```javascript
   let nombre = "Juan";
   console.log("Hola, " + nombre + ". Bienvenido.");
   ```

3. **Java** En Java, usamos `System.out.println()` para imprimir en la consola.

   ```java
   String nombre = "Juan";
   System.out.println("Hola, " + nombre + ". Bienvenido.");
   ```

------

## 6. Conversiones de datos (Casting)

### Python

En Python, la conversión de tipos de datos se puede hacer explícitamente usando las funciones `int()`, `float()`, `str()`, entre otras. Además, algunas conversiones son implícitas, es decir, Python las realiza automáticamente cuando es necesario.

#### A. Conversión explícita

1. **De `str` a `int` o `float`**

   ```python
   numero_str = "10"
   numero_int = int(numero_str)  # Convierte de string a entero
   print(numero_int)  # 10
   
   numero_str_float = "10.5"
   numero_float = float(numero_str_float)  # Convierte de string a flotante
   print(numero_float)  # 10.5
   ```

2. **De `int` o `float` a `str`**

   ```python
   numero_int = 10
   numero_str = str(numero_int)  # Convierte de entero a string
   print(numero_str)  # "10"
   
   numero_float = 10.5
   numero_str_float = str(numero_float)  # Convierte de flotante a string
   print(numero_str_float)  # "10.5"
   ```

3. **De `int` a `float`**

   ```python
   numero_int = 10
   numero_float = float(numero_int)  # Convierte de entero a flotante
   print(numero_float)  # 10.0
   ```

#### B. Conversión implícita

Python realiza conversiones automáticas cuando se requiere sin necesidad de especificarlo:

1. **De `int` a `float`**

   ```python
   a = 5
   b = 2.0
   resultado = a + b  # Python convierte automáticamente a float
   print(resultado)  # 7.0
   ```

2. **De `int` a `str` al concatenar**

   ```python
   edad = 25
   mensaje = "Mi edad es " + str(edad)  # Conversión implícita al concatenar
   print(mensaje)  # "Mi edad es 25"
   ```

------

### JavaScript

En JavaScript, las conversiones de datos pueden ser explícitas (usando funciones de conversión) o implícitas (cuando el motor de JavaScript lo hace automáticamente). Vamos a ver cómo funciona cada tipo.

#### A. Conversión explícita

1. **De `string` a `number`** Podemos usar `parseInt()`, `parseFloat()` o `Number()` para convertir una cadena a un número.

   ```javascript
   let numeroStr = "10";
   let numeroInt = parseInt(numeroStr);  // Convierte a entero
   console.log(numeroInt);  // 10
   
   let numeroStrFloat = "10.5";
   let numeroFloat = parseFloat(numeroStrFloat);  // Convierte a flotante
   console.log(numeroFloat);  // 10.5
   
   let numero = Number("15");  // Convierte a número
   console.log(numero);  // 15
   ```

2. **De `number` a `string`** Usamos `String()` o `toString()` para convertir números a cadenas de texto.

   ```javascript
   let numero = 10;
   let numeroStr = String(numero);  // Convierte a string
   console.log(numeroStr);  // "10"
   
   let numeroStr2 = numero.toString();  // Otra forma de convertir
   console.log(numeroStr2);  // "10"
   ```

#### B. Conversión implícita

JavaScript también realiza conversiones automáticas entre tipos cuando es necesario.

1. **De `number` a `string` al concatenar** Si intentamos concatenar un número con un string, JavaScript convierte automáticamente el número a string.

   ```javascript
   let numero = 10;
   let mensaje = "El número es " + numero;  // Implicitamente convierte numero a string
   console.log(mensaje);  // "El número es 10"
   ```

2. **De `string` a `number` al realizar operaciones matemáticas** Si una cadena representa un número y se usa en una operación matemática, JavaScript la convierte a número automáticamente.

   ```javascript
   let numeroStr = "5";
   let resultado = numeroStr * 2;  // JavaScript convierte la cadena a número
   console.log(resultado);  // 10
   ```

------

### Java

En Java, la conversión de tipos de datos puede ser explícita (usando casting) o implícita, dependiendo de la situación. Aquí vamos a ver cómo funciona en ambos casos.

#### A. Conversión explícita (Casting)

1. **De `String` a `int` o `double`** Para convertir una cadena a un número, se usan las funciones `Integer.parseInt()` para enteros y `Double.parseDouble()` para números decimales.

   ```java
   String numeroStr = "10";
   int numeroInt = Integer.parseInt(numeroStr);  // Convierte a entero
   System.out.println(numeroInt);  // 10
   
   String numeroStrFloat = "10.5";
   double numeroDouble = Double.parseDouble(numeroStrFloat);  // Convierte a flotante
   System.out.println(numeroDouble);  // 10.5
   ```

2. **De `int` o `double` a `String`** Para convertir un número a cadena, se usa `String.valueOf()` o `String.format()`. También se puede usar la concatenación.

   ```java
   int numeroInt = 10;
   String numeroStr = String.valueOf(numeroInt);  // Convierte a String
   System.out.println(numeroStr);  // "10"
   
   double numeroDouble = 10.5;
   String numeroStrDouble = String.valueOf(numeroDouble);  // Convierte a String
   System.out.println(numeroStrDouble);  // "10.5"
   ```

3. **De `int` a `double`** Java permite la conversión implícita de `int` a `double` porque el tipo `double` puede almacenar más precisión.

   ```java
   int numeroInt = 10;
   double numeroDouble = numeroInt;  // Conversión implícita
   System.out.println(numeroDouble);  // 10.0
   ```

#### B. Conversión implícita (Auto-casting)

1. **De `int` a `double`** Java realiza automáticamente una conversión de `int` a `double` sin necesidad de especificarlo explícitamente.

   ```java
   int numeroInt = 10;
   double numeroDouble = numeroInt;  // Conversión implícita de int a double
   System.out.println(numeroDouble);  // 10.0
   ```

2. **De `float` a `double`** El tipo `double` tiene más capacidad que `float`, por lo que Java realiza esta conversión sin necesidad de casting explícito.

   ```java
   float numeroFloat = 10.5f;
   double numeroDouble = numeroFloat;  // Conversión implícita de float a double
   System.out.println(numeroDouble);  // 10.5
   ```

---

# 2. Funciones y modularidad

## 1. Creación y definición de funciones

### Python

En Python, las funciones se definen con la palabra clave `def`, seguida del nombre de la función y paréntesis con los parámetros (si los hay). Luego, el bloque de código de la función debe ir indentado.

#### Sintaxis básica

```python
def mi_funcion():
    print("Hola desde la función")

mi_funcion()  # Llamada a la función
```

#### Funciones con parámetros

Las funciones también pueden recibir parámetros para trabajar con datos dinámicos.

```python
def saludar(nombre):
    print(f"Hola, {nombre}!")

saludar("Juan")  # Llamada con argumento
```

#### Funciones con valores de retorno

Una función puede devolver un valor usando la palabra clave `return`.

```python
def suma(a, b):
    return a + b

resultado = suma(5, 3)
print(resultado)  # 8
```

#### Funciones sin valores de retorno

Si no se usa `return`, la función retorna `None` por defecto.

```python
def saludar(nombre):
    print(f"Hola, {nombre}!")

saludo = saludar("Ana")  # Salida: Hola, Ana!
print(saludo)  # Salida: None
```

---

### JavaScript

En JavaScript, las funciones se pueden definir de varias maneras, pero las más comunes son usando la palabra clave `function` o la sintaxis de funciones flecha (arrow functions).

#### A. Funciones tradicionales

Se definen con la palabra clave `function`, seguida del nombre de la función y los parámetros entre paréntesis.

```javascript
function saludar() {
    console.log("Hola desde la función");
}

saludar();  // Llamada a la función
```

#### B. Funciones con parámetros

Las funciones pueden aceptar parámetros, que son valores que se pasan cuando se llama a la función.

```javascript
function saludar(nombre) {
    console.log(`Hola, ${nombre}!`);
}

saludar("Juan");  // Llamada con argumento
```

#### C. Funciones con valores de retorno

Al igual que en Python, las funciones en JavaScript pueden devolver valores usando la palabra clave `return`.

```javascript
function suma(a, b) {
    return a + b;
}

let resultado = suma(5, 3);
console.log(resultado);  // 8
```

#### D. Funciones sin valores de retorno

Si no se usa `return`, la función devuelve `undefined` por defecto.

```javascript
function saludar(nombre) {
    console.log(`Hola, ${nombre}!`);
}

let saludo = saludar("Ana");  // Salida: Hola, Ana!
console.log(saludo);  // Salida: undefined
```

#### E. Funciones flecha (Arrow Functions)

Una alternativa moderna para definir funciones son las funciones flecha, que permiten una sintaxis más corta. Son especialmente útiles para funciones pequeñas y en expresiones.

```javascript
const saludar = (nombre) => {
    console.log(`Hola, ${nombre}!`);
};

saludar("Juan");  // Llamada con argumento
```

Si la función tiene solo una línea y retorna un valor, podemos omitir las llaves y el `return`.

```javascript
const suma = (a, b) => a + b;
console.log(suma(5, 3));  // 8
```

------

### Java

En Java, las funciones (o métodos, como se les llama en este lenguaje) se definen dentro de una clase. El formato básico incluye un tipo de retorno, el nombre del método y, si es necesario, parámetros.

#### A. Sintaxis básica

En Java, un método debe estar dentro de una clase. La sintaxis básica de una función es la siguiente:

```java
public class Main {
    public static void main(String[] args) {
        miFuncion();  // Llamada al método
    }

    public static void miFuncion() {
        System.out.println("Hola desde el método");
    }
}
```

#### B. Métodos con parámetros

Un método puede recibir parámetros entre los paréntesis, que son utilizados dentro del bloque de código del método.

```java
public class Main {
    public static void main(String[] args) {
        saludar("Juan");  // Llamada con argumento
    }

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }
}
```

#### C. Métodos con valores de retorno

Un método puede devolver un valor utilizando la palabra clave `return`. El tipo de valor que devuelve debe coincidir con el tipo especificado al inicio del método.

```java
public class Main {
    public static void main(String[] args) {
        int resultado = suma(5, 3);
        System.out.println(resultado);  // 8
    }

    public static int suma(int a, int b) {
        return a + b;  // Retorna la suma
    }
}
```

#### D. Métodos sin valores de retorno

Si un método no retorna nada, se usa `void` en lugar de un tipo de dato.

```java
public class Main {
    public static void main(String[] args) {
        saludar("Ana");  // Llamada al método
    }

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }
}
```

En este caso, `void` indica que el método no tiene un valor de retorno.

------

## 2. Parámetros: por valor y por referencia

### Python

En Python, todos los parámetros se pasan **por referencia** a las funciones, pero el comportamiento puede variar dependiendo de si el objeto es **mutable** o **inmutable**.

#### A. Parámetros inmutables (como `int`, `float`, `str`)

Si pasamos un tipo de dato inmutable (como un número o una cadena) a una función, cualquier cambio en el parámetro dentro de la función no afectará al valor original fuera de ella. Esto se asemeja al paso por valor.

```python
def cambiar_valor(a):
    a = 10  # Modifica localmente
    print(f"Valor dentro de la función: {a}")

x = 5
cambiar_valor(x)
print(f"Valor fuera de la función: {x}")
```

**Salida:**

```
Valor dentro de la función: 10
Valor fuera de la función: 5
```

#### B. Parámetros mutables (como `list`, `dict`)

Si pasamos un objeto mutable (como una lista o un diccionario), los cambios realizados dentro de la función afectarán al objeto original fuera de ella. Esto es un comportamiento que se asemeja al paso por referencia.

```python
def agregar_elemento(lista):
    lista.append(4)  # Modifica directamente el objeto
    print(f"Lista dentro de la función: {lista}")

mi_lista = [1, 2, 3]
agregar_elemento(mi_lista)
print(f"Lista fuera de la función: {mi_lista}")
```

**Salida:**

```
Lista dentro de la función: [1, 2, 3, 4]
Lista fuera de la función: [1, 2, 3, 4]
```

------

### JavaScript

En JavaScript, el paso de parámetros funciona de manera similar a otros lenguajes. Los tipos de datos se pueden dividir en **tipos primitivos** (que se pasan por valor) y **tipos de referencia** (que se pasan por referencia).

#### A. Parámetros por valor (tipos primitivos)

Los **tipos primitivos** en JavaScript incluyen `number`, `string`, `boolean`, `undefined` y `null`. Cuando se pasan como parámetros, se pasa una **copia del valor**. Esto significa que los cambios en el parámetro dentro de la función no afectan al valor original fuera de la función.

```javascript
function cambiarValor(a) {
    a = 10;  // Modifica el valor localmente
    console.log("Valor dentro de la función:", a);
}

let x = 5;
cambiarValor(x);
console.log("Valor fuera de la función:", x);
```

**Salida:**

```
Valor dentro de la función: 10
Valor fuera de la función: 5
```

#### B. Parámetros por referencia (objetos y arrays)

Los **objetos** y **arrays** son tipos de datos por referencia en JavaScript. Cuando se pasan como parámetros, se pasa la **referencia al objeto** o **array original**, por lo que los cambios dentro de la función afectarán directamente al objeto o array fuera de ella.

```javascript
function agregarElemento(array) {
    array.push(4);  // Modifica el objeto (array) original
    console.log("Array dentro de la función:", array);
}

let miArray = [1, 2, 3];
agregarElemento(miArray);
console.log("Array fuera de la función:", miArray);
```

**Salida:**

```
Array dentro de la función: [1, 2, 3, 4]
Array fuera de la función: [1, 2, 3, 4]
```

En este caso, **el array se pasa por referencia**, por lo que cualquier modificación dentro de la función afecta al array original fuera de la función.

------

### Java

En Java, los parámetros se pasan de dos formas: **por valor** o **por referencia**, dependiendo del tipo de dato. Sin embargo, en Java, siempre se pasa una copia de la referencia (en lugar de la referencia misma), lo que se traduce en un comportamiento de paso **por valor** para ambos tipos de datos: primitivos y objetos.

#### A. Parámetros por valor (tipos primitivos)

Cuando se pasa un tipo de dato primitivo (como `int`, `float`, `char`, etc.) a un método, se pasa una **copia del valor**. Si modificas el valor dentro del método, no afectará al valor original fuera del método.

```java
public class Main {
    public static void main(String[] args) {
        int x = 5;
        cambiarValor(x);
        System.out.println("Valor fuera de la función: " + x);  // 5
    }

    public static void cambiarValor(int a) {
        a = 10;  // Modifica el valor localmente
        System.out.println("Valor dentro de la función: " + a);  // 10
    }
}
```

**Salida:**

```
Valor dentro de la función: 10
Valor fuera de la función: 5
```

#### B. Parámetros por referencia (objetos)

Cuando se pasa un objeto a un método, lo que se pasa es una **copia de la referencia al objeto**, lo que permite que las modificaciones realizadas dentro del método afecten al objeto original fuera de él.

```java
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hola");
        modificarTexto(sb);
        System.out.println("Texto fuera de la función: " + sb);  // "Hola Mundo"
    }

    public static void modificarTexto(StringBuilder texto) {
        texto.append(" Mundo");  // Modifica el objeto original
        System.out.println("Texto dentro de la función: " + texto);  // "Hola Mundo"
    }
}
```

**Salida:**

```
Texto dentro de la función: Hola Mundo
Texto fuera de la función: Hola Mundo
```

En este caso, el `StringBuilder` es un objeto mutable, por lo que cualquier cambio realizado dentro del método se refleja fuera de él.

#### Resumen de comportamiento en Java

- **Tipos primitivos**: Se pasan por valor (la modificación dentro de la función no afecta al valor fuera).
- **Objetos**: Se pasa una copia de la referencia (lo que permite modificar el objeto original dentro de la función).

------

## 3. Valores de retorno

### Python

En Python, las funciones pueden devolver un valor utilizando la palabra clave `return`. Si no se especifica un valor de retorno, la función retorna `None` por defecto.

#### A. Función con un valor de retorno

Una función puede devolver cualquier tipo de dato: un número, una cadena, un objeto, etc.

```python
def suma(a, b):
    return a + b

resultado = suma(5, 3)
print(resultado)  # 8
```

#### B. Función sin valor de retorno

Si no se usa `return`, la función no devolverá ningún valor, lo que implicará que el retorno es `None`.

```python
def imprimir_saludo(nombre):
    print(f"Hola, {nombre}!")

saludo = imprimir_saludo("Juan")
print(saludo)  # None
```

#### C. Devolver múltiples valores

Python permite devolver varios valores desde una función usando tuplas.

```python
def operaciones(a, b):
    suma = a + b
    resta = a - b
    return suma, resta  # Devuelve una tupla

resultados = operaciones(5, 3)
print(resultados)  # (8, 2)
```

------

### JavaScript

En JavaScript, las funciones pueden devolver un valor usando la palabra clave `return`. Si no se especifica un valor de retorno, la función devolverá `undefined` por defecto.

#### A. Función con un valor de retorno

Una función puede devolver cualquier tipo de dato: un número, una cadena, un objeto, etc.

```javascript
function suma(a, b) {
    return a + b;
}

let resultado = suma(5, 3);
console.log(resultado);  // 8
```

#### B. Función sin valor de retorno

Si una función no tiene un `return`, se asume que el valor de retorno es `undefined`.

```javascript
function imprimirSaludo(nombre) {
    console.log(`Hola, ${nombre}!`);
}

let saludo = imprimirSaludo("Juan"); 
console.log(saludo);  // undefined
```

#### C. Devolver múltiples valores

Aunque JavaScript no permite devolver múltiples valores directamente, podemos hacerlo utilizando un objeto o un array.

```javascript
function operaciones(a, b) {
    let suma = a + b;
    let resta = a - b;
    return { suma: suma, resta: resta };  // Devuelve un objeto con múltiples valores
}

let resultados = operaciones(5, 3);
console.log(resultados);  // { suma: 8, resta: 2 }
```

O utilizando un array:

```javascript
function operaciones(a, b) {
    return [a + b, a - b];  // Devuelve un array
}

let resultados = operaciones(5, 3);
console.log(resultados);  // [8, 2]
```

------

### Java

En Java, las funciones (métodos) pueden devolver un valor usando la palabra clave `return`. Al igual que en otros lenguajes, si un método no tiene un valor de retorno, debe declararse como `void`, lo que indica que no devuelve nada.

#### A. Método con un valor de retorno

En Java, puedes devolver cualquier tipo de dato: primitivos, objetos, arrays, etc. El tipo de valor que devuelves debe coincidir con el tipo de retorno declarado en el método.

```java
public class Main {
    public static void main(String[] args) {
        int resultado = suma(5, 3);
        System.out.println(resultado);  // 8
    }

    public static int suma(int a, int b) {
        return a + b;  // Retorna la suma
    }
}
```

#### B. Método sin valor de retorno

Si un método no devuelve nada, se declara como `void`, lo que significa que no utilizará la palabra clave `return`.

```java
public class Main {
    public static void main(String[] args) {
        imprimirSaludo("Juan");  // Llamada al método
    }

    public static void imprimirSaludo(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }
}
```

En este caso, `void` indica que el método no devolverá ningún valor.

#### C. Devolver múltiples valores

En Java, un método puede devolver solo un valor. Sin embargo, puedes devolver múltiples valores empaquetándolos en un objeto, una clase, o utilizando arrays.

```java
public class Main {
    public static void main(String[] args) {
        int[] resultados = operaciones(5, 3);
        System.out.println("Suma: " + resultados[0]);
        System.out.println("Resta: " + resultados[1]);
    }

    public static int[] operaciones(int a, int b) {
        int[] resultados = {a + b, a - b};
        return resultados;  // Devuelve un array
    }
}
```

También puedes crear una clase que almacene múltiples valores:

```java
class Resultados {
    int suma;
    int resta;

    Resultados(int suma, int resta) {
        this.suma = suma;
        this.resta = resta;
    }
}

public class Main {
    public static void main(String[] args) {
        Resultados resultados = operaciones(5, 3);
        System.out.println("Suma: " + resultados.suma);
        System.out.println("Resta: " + resultados.resta);
    }

    public static Resultados operaciones(int a, int b) {
        return new Resultados(a + b, a - b);
    }
}
```

------

## 4. Ámbito y alcance de variables

### Python

En Python, el **ámbito** (o alcance) de una variable se refiere a la parte del programa donde se puede acceder a esa variable. Hay dos tipos principales de ámbito:

#### A. Ámbito local

Una **variable local** es aquella que se declara dentro de una función. Solo se puede acceder a ella dentro de esa función.

```python
def mi_funcion():
    x = 5  # variable local
    print(x)

mi_funcion()  # Salida: 5
print(x)  # Error: NameError, x no está definida fuera de la función
```

En este ejemplo, `x` es una variable local, y no podemos acceder a ella fuera de la función `mi_funcion()`.

#### B. Ámbito global

Una **variable global** es aquella que se declara fuera de cualquier función, en el espacio global del programa. Se puede acceder a ella desde cualquier parte del programa, incluso dentro de las funciones.

```python
x = 10  # variable global

def mi_funcion():
    print(x)  # Accede a la variable global

mi_funcion()  # Salida: 10
print(x)  # Salida: 10
```

#### C. Modificar una variable global dentro de una función

Para modificar una variable global desde dentro de una función, debemos usar la palabra clave `global`.

```python
x = 10  # variable global

def mi_funcion():
    global x
    x = 20  # Modifica la variable global

mi_funcion()
print(x)  # Salida: 20
```

------

### JavaScript

En JavaScript, el **ámbito** de una variable se refiere al contexto en el que está definida, y determina dónde podemos acceder o modificar esa variable. Hay varios tipos de ámbito:

#### A. Ámbito local

Una **variable local** se declara dentro de una función, y solo puede ser accedida dentro de esa función.

```javascript
function miFuncion() {
    let x = 5;  // variable local
    console.log(x);  // 5
}

miFuncion();
console.log(x);  // Error: x is not defined
```

En este ejemplo, `x` es una variable local a la función `miFuncion()`. No se puede acceder fuera de la función.

#### B. Ámbito global

Una **variable global** se declara fuera de cualquier función. Se puede acceder y modificar desde cualquier parte del código, incluso dentro de las funciones.

```javascript
let x = 10;  // variable global

function miFuncion() {
    console.log(x);  // Accede a la variable global
}

miFuncion();  // 10
console.log(x);  // 10
```

#### C. Ámbito de bloque (ES6+ con `let` y `const`)

Con las palabras clave `let` y `const` (introducidas en ES6), las variables tienen un ámbito de bloque, lo que significa que solo son accesibles dentro del bloque donde fueron declaradas (como dentro de un `if`, `for`, etc.).

```javascript
if (true) {
    let x = 5;  // variable con ámbito de bloque
    console.log(x);  // 5
}

console.log(x);  // Error: x is not defined
```

Si hubieras usado `var` en lugar de `let`, la variable `x` sería accesible fuera del bloque, ya que `var` tiene un ámbito de función.

```javascript
if (true) {
    var y = 10;  // variable con ámbito de función
}

console.log(y);  // 10
```

#### D. Modificar una variable global dentro de una función

Si quieres modificar una variable global dentro de una función, simplemente puedes acceder a ella directamente, sin necesidad de palabras clave especiales (como `global` en Python).

```javascript
let x = 10;  // variable global

function miFuncion() {
    x = 20;  // Modifica la variable global
}

miFuncion();
console.log(x);  // 20
```

Si declaras una variable dentro de una función usando `let`, `const`, o `var`, crearás una nueva variable local en lugar de modificar la global, lo que puede causar errores si no se tiene cuidado.

------

### Java

En Java, el **ámbito** de una variable se refiere a la zona del código donde es accesible. Las variables pueden tener un ámbito **local** o **global**, y también pueden estar asociadas con un **ámbito de clase**.

#### A. Ámbito local

Una **variable local** en Java es aquella que se declara dentro de un método o bloque de código (como un `if` o un `for`). Estas variables solo son accesibles dentro de ese método o bloque y no fuera de él.

```java
public class Main {
    public static void main(String[] args) {
        int x = 5;  // variable local

        System.out.println(x);  // 5
    }
}
```

Si intentas acceder a `x` fuera del método `main()`, se generaría un error porque `x` solo está definida dentro de ese método.

#### B. Ámbito global (ámbito de clase)

En Java, las variables globales no existen como en otros lenguajes. Sin embargo, podemos definir **variables de clase** (también llamadas **variables miembro** o **atributos**), que son accesibles desde cualquier método dentro de la clase. Estas variables son declaradas fuera de los métodos, pero dentro de la clase.

```java
public class Main {
    static int x = 10;  // variable de clase (global dentro de la clase)

    public static void main(String[] args) {
        System.out.println(x);  // 10
        modificarValor();
        System.out.println(x);  // 20
    }

    public static void modificarValor() {
        x = 20;  // Modifica la variable de clase
    }
}
```

En este ejemplo, `x` es una **variable de clase** y se puede acceder y modificar dentro de cualquier método dentro de la clase `Main`.

#### C. Ámbito de bloque

En Java, también puedes definir variables dentro de bloques de código (como dentro de un `if`, `for`, o `while`). Estas variables solo son accesibles dentro de ese bloque.

```java
public class Main {
    public static void main(String[] args) {
        if (true) {
            int x = 5;  // variable de bloque
            System.out.println(x);  // 5
        }
        // System.out.println(x);  // Error: x no está definida fuera del bloque
    }
}
```

Las variables definidas dentro de un bloque de código son **locales a ese bloque** y no se pueden usar fuera de él.

#### D. Modificar variables globales dentro de un método

Si tienes una **variable de clase** y deseas modificarla dentro de un método, puedes hacerlo directamente.

```java
public class Main {
    static int x = 10;  // variable global (de clase)

    public static void main(String[] args) {
        System.out.println(x);  // 10
        cambiarValor();
        System.out.println(x);  // 30
    }

    public static void cambiarValor() {
        x = 30;  // Modifica la variable global
    }
}
```

En este caso, la variable `x` se modifica dentro del método `cambiarValor()`, y el cambio se refleja en el método `main()`.

------

## 5. Funciones recursivas

### Python

Una **función recursiva** es aquella que se llama a sí misma para resolver un problema. Se utiliza principalmente cuando un problema puede dividirse en subproblemas más pequeños que tienen una estructura similar al problema original. Las funciones recursivas deben tener un **caso base**, que es la condición en la que la función dejará de llamarse a sí misma.

#### A. Ejemplo básico de recursión

Vamos a ver un ejemplo clásico de recursión: el cálculo del **factorial** de un número.

El factorial de un número `n` se define como el producto de todos los números enteros positivos desde 1 hasta `n`. Matemáticamente:
 `factorial(n) = n * factorial(n-1)`
 Con un caso base:
 `factorial(0) = 1`

```python
def factorial(n):
    if n == 0:  # Caso base
        return 1
    else:
        return n * factorial(n - 1)  # Llamada recursiva

print(factorial(5))  # Salida: 120
```

**Explicación:**

- Cuando `n` es 0, la función devuelve 1 (caso base).
- Si `n` es mayor que 0, la función se llama a sí misma con `n - 1` hasta llegar al caso base.

#### B. Recursión con más de un argumento

La recursión también puede involucrar más de un argumento. Aquí tenemos un ejemplo de una función que calcula la potencia de un número de manera recursiva.

```python
def potencia(base, exponente):
    if exponente == 0:  # Caso base
        return 1
    else:
        return base * potencia(base, exponente - 1)  # Llamada recursiva

print(potencia(2, 3))  # Salida: 8
```

En este caso, la función `potencia()` calcula `base^exponente` usando recursión.

------

### JavaScript

Las funciones recursivas en JavaScript funcionan de manera similar a como lo hacen en otros lenguajes: una función se llama a sí misma para resolver un problema, y debe tener un **caso base** que detenga la recursión.

#### A. Ejemplo básico de recursión

Un ejemplo clásico es calcular el **factorial** de un número. El factorial de `n` se define como:

```javascript
factorial(n) = n * factorial(n-1)`
 Y el caso base es:
 `factorial(0) = 1
function factorial(n) {
    if (n === 0) {  // Caso base
        return 1;
    } else {
        return n * factorial(n - 1);  // Llamada recursiva
    }
}

console.log(factorial(5));  // Salida: 120
```

**Explicación:**

- Si `n` es 0, la función devuelve 1 (caso base).
- Si `n` es mayor que 0, la función se llama a sí misma con `n - 1`.

#### B. Recursión con más de un argumento

También puedes usar recursión con varios parámetros. A continuación, un ejemplo de cómo calcular la potencia de un número de manera recursiva:

```javascript
function potencia(base, exponente) {
    if (exponente === 0) {  // Caso base
        return 1;
    } else {
        return base * potencia(base, exponente - 1);  // Llamada recursiva
    }
}

console.log(potencia(2, 3));  // Salida: 8
```

Aquí, la función `potencia()` calcula `base^exponente` de manera recursiva.

------

### Java

En Java, las funciones recursivas se comportan de manera similar a otros lenguajes: una función se llama a sí misma hasta que se alcanza un caso base, que detiene la recursión.

#### A. Ejemplo básico de recursión

Un ejemplo clásico es el cálculo del **factorial** de un número.

El factorial de un número `n` se define como:
 `factorial(n) = n * factorial(n - 1)`
 Y el caso base es:
 `factorial(0) = 1`

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));  // Salida: 120
    }

    public static int factorial(int n) {
        if (n == 0) {  // Caso base
            return 1;
        } else {
            return n * factorial(n - 1);  // Llamada recursiva
        }
    }
}
```

**Explicación:**

- Si `n` es 0, la función devuelve 1 (caso base).
- Si `n` es mayor que 0, la función se llama a sí misma con `n - 1`.

#### B. Recursión con más de un argumento

También puedes hacer funciones recursivas con más de un argumento. A continuación, un ejemplo para calcular la potencia de un número:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(potencia(2, 3));  // Salida: 8
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {  // Caso base
            return 1;
        } else {
            return base * potencia(base, exponente - 1);  // Llamada recursiva
        }
    }
}
```

En este caso, la función `potencia()` calcula `base^exponente` de manera recursiva.

---

## 