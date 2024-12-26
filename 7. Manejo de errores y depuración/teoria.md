# Manejo de errores y depuración

## 1. Tipos de errores

Existen tres tipos principales de errores en programación: sintácticos, de ejecución y lógicos.

- **Errores sintácticos**: Son aquellos que ocurren cuando no se sigue la sintaxis del lenguaje. Es como si estuvieras escribiendo una frase en un idioma, pero cometieras errores en la gramática. En este caso, el compilador o el intérprete no puede entender tu código.
- **Errores de ejecución**: Son los errores que ocurren cuando el programa ya está corriendo, pero algo sale mal en el proceso, como intentar dividir por cero o acceder a un índice fuera de los límites de una lista. Estos errores detienen la ejecución del programa.
- **Errores lógicos**: Estos errores no detienen la ejecución del programa, pero el resultado no es el esperado. Ocurre cuando el código es sintácticamente correcto y no lanza errores de ejecución, pero la lógica detrás del código no es correcta. Un ejemplo clásico es un cálculo incorrecto.

---

### Python:

1. **Error sintáctico**: Un error en la sintaxis del código.

   ```python
   print("Hola mundo'
   ```

   Esto causará un error porque las comillas no están cerradas correctamente. El mensaje de error sería algo como:

   ```
   SyntaxError: EOL while scanning string literal
   ```

2. **Error de ejecución**: Ocurre durante la ejecución del programa, cuando se trata de hacer algo que el lenguaje no permite.

   ```python
   x = 5 / 0
   ```

   Esto causará un error de ejecución porque la división por cero no está permitida. El mensaje sería:

   ```
   ZeroDivisionError: division by zero
   ```

3. **Error lógico**: No detiene el programa, pero el resultado es incorrecto.

   ```python
   def suma(a, b):
       return a - b  # Error lógico: debería ser suma, no resta

   print(suma(5, 3))  # Imprime 2 en lugar de 8
   ```

   En este caso, el programa no lanza errores, pero el resultado es incorrecto porque se utilizó el operador incorrecto.

---

### JavaScript:

1. **Error sintáctico**: Ocurre cuando hay un problema con la estructura del código, como no cerrar adecuadamente una expresión o usar palabras reservadas de manera incorrecta.

   ```javascript
   console.log("Hola mundo)
   ```

   En este caso, el error se debe a que falta cerrar las comillas. El mensaje de error sería algo como:

   ```
   Uncaught SyntaxError: Unexpected end of input
   ```

2. **Error de ejecución**: Sucede cuando el código se está ejecutando y se encuentra con algo que no puede resolver, como intentar acceder a una variable no definida o realizar operaciones no permitidas.

   ```javascript
   let x = 5 / 0;
   console.log(x); // Resultado: Infinity, pero no lanza un error explícito.
   ```

   Aunque en JavaScript la división por cero no lanza un error, el resultado es especial (`Infinity`). Sin embargo, si intentamos hacer algo como acceder a una propiedad de un objeto que no existe, lanzará un error:

   ```javascript
   let obj = {};
   console.log(obj.propiedadNoExistente); // Undefined, sin error de ejecución
   ```

   Pero si intentamos usar el valor `undefined` de una manera inapropiada:

   ```javascript
   let obj = {};
   console.log(obj.propiedadNoExistente.toUpperCase()); // TypeError: Cannot read property 'toUpperCase' of undefined
   ```

3. **Error lógico**: Este tipo de error no lanza un mensaje de error, pero los resultados no son los esperados, como en el siguiente ejemplo:

   ```javascript
   function suma(a, b) {
     return a - b; // Error lógico: se esperaba una suma, pero hay una resta
   }

   console.log(suma(5, 3)); // Imprime 2, cuando debería ser 8
   ```

Aquí también, el programa no lanza errores, pero el resultado de la operación es incorrecto.

---

### Java:

1. **Error sintáctico**: Al igual que en Python y JavaScript, un error sintáctico ocurre cuando el código no sigue las reglas del lenguaje.

   ```java
   public class Main {
       public static void main(String[] args) {
           System.out.println("Hola mundo);
       }
   }
   ```

   En este caso, el error se debe a las comillas no cerradas. El mensaje de error sería algo como:

   ```
   error: unclosed string literal
   ```

2. **Error de ejecución**: Este error ocurre mientras se ejecuta el programa. Un ejemplo común es la división por cero:

   ```java
   public class Main {
       public static void main(String[] args) {
           int x = 5 / 0;
       }
   }
   ```

   Esto lanzará una excepción de tipo `ArithmeticException`, y el programa se detendrá con el siguiente mensaje:

   ```
   Exception in thread "main" java.lang.ArithmeticException: / by zero
   ```

3. **Error lógico**: En este caso, el código se ejecuta correctamente, pero el resultado es incorrecto debido a un error en la lógica del programa.

   ```java
   public class Main {
       public static void main(String[] args) {
           int a = 5;
           int b = 3;
           int resultado = a - b;  // Error lógico: se esperaba una suma, no una resta
           System.out.println(resultado);  // Imprime 2 en lugar de 8
       }
   }
   ```

   Aquí, el programa se ejecuta sin errores, pero el resultado es incorrecto porque la lógica de la operación es incorrecta.

---

## 2. Excepciones

Las excepciones son eventos que interrumpen el flujo normal de ejecución del programa, generalmente debido a errores en tiempo de ejecución. Estas excepciones pueden ser **capturadas** y **lanzadas** utilizando estructuras específicas, como `try`, `catch` y `finally`.

#### Lanzar y capturar excepciones (`try`, `catch`, `finally`):

- **`try`**: Se usa para envolver el código que puede generar una excepción.
- **`catch`**: Se usa para manejar la excepción cuando ocurre.
- **`finally`**: Este bloque se ejecuta siempre, ocurra o no una excepción, útil para liberar recursos o cerrar conexiones.

---

### Python:

En Python, se utilizan las palabras clave `try`, `except`, y `finally` para manejar excepciones.

1. **Ejemplo básico de captura de excepciones**:

   ```python
   try:
       x = 5 / 0  # Esto lanza un error de división por cero
   except ZeroDivisionError as e:
       print(f"Error: {e}")  # Captura y maneja la excepción
   finally:
       print("Esto siempre se ejecuta.")
   ```

   - En este caso, el bloque `except` captura la excepción de tipo `ZeroDivisionError`, y el bloque `finally` se ejecuta siempre, independientemente de si ocurre una excepción o no.

2. **Lanzar excepciones personalizadas**: En Python también podemos lanzar nuestras propias excepciones usando `raise`:

   ```python
   def dividir(a, b):
       if b == 0:
           raise ValueError("No se puede dividir por cero")  # Lanzar una excepción personalizada
       return a / b

   try:
       print(dividir(5, 0))
   except ValueError as e:
       print(f"Error: {e}")
   ```

   - Aquí, lanzamos una excepción personalizada (`ValueError`) cuando se intenta dividir por cero.

---

### JavaScript:

En JavaScript, el manejo de excepciones se realiza con las palabras clave `try`, `catch` y `finally`, al igual que en Python.

1. **Ejemplo básico de captura de excepciones**:

   ```javascript
   try {
     let x = 5 / 0; // En JavaScript, esto no lanza una excepción, pero si hicieras algo que lo cause, como una referencia incorrecta...
     throw new Error("Esto es un error de ejemplo");
   } catch (e) {
     console.log(`Error: ${e.message}`);
   } finally {
     console.log("Esto siempre se ejecuta.");
   }
   ```

   - En este caso, la operación `5 / 0` no lanza un error, pero usamos `throw` para generar un error manualmente. El bloque `catch` captura el error y `finally` siempre se ejecuta.

2. **Lanzar excepciones personalizadas**: En JavaScript, puedes lanzar tus propias excepciones usando `throw`:

   ```javascript
   function dividir(a, b) {
     if (b === 0) {
       throw new Error("No se puede dividir por cero");
     }
     return a / b;
   }

   try {
     console.log(dividir(5, 0));
   } catch (e) {
     console.log(`Error: ${e.message}`);
   }
   ```

   - Aquí, estamos lanzando un error personalizado con `throw` cuando se intenta dividir por cero.

Como ves, el flujo de control y la forma de manejar excepciones en JavaScript es bastante similar a Python, pero el mecanismo de lanzamiento de excepciones en JavaScript se hace mediante el uso de `throw` para lanzar y `catch` para capturar.

---

### Java:

En Java, el manejo de excepciones también se realiza utilizando `try`, `catch` y `finally`, pero con algunas diferencias en la sintaxis y la estructura. Java también tiene una jerarquía de excepciones más compleja, donde las excepciones pueden ser **comprobadas** (checked) o **no comprobadas** (unchecked).

1. **Ejemplo básico de captura de excepciones**:

   ```java
   public class Main {
       public static void main(String[] args) {
           try {
               int x = 5 / 0;  // Esto lanza una excepción ArithmeticException
           } catch (ArithmeticException e) {
               System.out.println("Error: " + e.getMessage());
           } finally {
               System.out.println("Esto siempre se ejecuta.");
           }
       }
   }
   ```

   - En este caso, cuando intentamos dividir por cero, el bloque `catch` captura la excepción `ArithmeticException`, y el bloque `finally` se ejecuta siempre, incluso si ocurre una excepción.

2. **Lanzar excepciones personalizadas**: En Java, las excepciones personalizadas se lanzan utilizando `throw`, y se puede crear una nueva clase de excepción si se desea.

   ```java
   class DivisionPorCeroException extends Exception {
       public DivisionPorCeroException(String mensaje) {
           super(mensaje);
       }
   }

   public class Main {
       public static void main(String[] args) {
           try {
               int resultado = dividir(5, 0);
               System.out.println(resultado);
           } catch (DivisionPorCeroException e) {
               System.out.println("Error: " + e.getMessage());
           }
       }

       public static int dividir(int a, int b) throws DivisionPorCeroException {
           if (b == 0) {
               throw new DivisionPorCeroException("No se puede dividir por cero");
           }
           return a / b;
       }
   }
   ```

   - En este caso, hemos creado una clase personalizada `DivisionPorCeroException` que extiende `Exception`. Luego, la función `dividir` lanza esta excepción personalizada cuando se intenta dividir por cero.

### Diferencias en Java:

- **Excepciones comprobadas (checked exceptions)**: Son aquellas que el compilador obliga a manejar (como `IOException`, `SQLException`). Estas deben ser capturadas o declaradas en el método con `throws`.
- **Excepciones no comprobadas (unchecked exceptions)**: Son aquellas que no es necesario declarar ni capturar (como `ArithmeticException`, `NullPointerException`).

Java tiene una estructura de manejo de excepciones más formal y estricta que Python y JavaScript debido a su sistema de excepciones comprobadas.

---

## 3. Debugging (Depuración)

La depuración es el proceso de identificar, aislar y corregir errores en el código. Esto se puede hacer de diferentes maneras, y los lenguajes y entornos de desarrollo ofrecen herramientas para facilitar este proceso.

#### Puntos de interrupción (breakpoints)

Un **punto de interrupción** es una marca en el código que detiene la ejecución del programa en ese punto, permitiendo examinar el estado de las variables y la lógica del programa. Es útil para detectar problemas específicos.

#### Análisis de pila de llamadas (call stack)

El **call stack** es una estructura de datos que almacena la secuencia de llamadas a funciones o métodos. Cuando ocurre un error, el análisis de la pila de llamadas ayuda a rastrear el flujo del programa hasta el lugar donde ocurrió el error.

#### Consola de depuración

La **consola de depuración** es una herramienta que muestra información detallada sobre el estado del programa, como valores de variables, excepciones y mensajes de error. A menudo se utiliza para imprimir datos y seguir el flujo del programa mientras se depura.

---

### Python:

1. **Puntos de interrupción (breakpoints)**: En Python, puedes usar el módulo `pdb` (Python Debugger) para agregar puntos de interrupción.

   ```python
   import pdb

   def calcular_suma(a, b):
       pdb.set_trace()  # Punto de interrupción
       return a + b

   print(calcular_suma(5, 3))
   ```

   - Al ejecutar este código, el programa se detendrá en `pdb.set_trace()`, y podrás inspeccionar las variables y continuar la ejecución paso a paso.

2. **Análisis de la pila de llamadas (call stack)**: En Python, el análisis de la pila de llamadas se puede hacer mediante la función `traceback`, que muestra el seguimiento de errores cuando ocurre una excepción:

   ```python
   import traceback

   def funcion_a():
       funcion_b()

   def funcion_b():
       raise ValueError("Error en la función B")

   try:
       funcion_a()
   except Exception as e:
       traceback.print_exc()  # Imprime la pila de llamadas cuando ocurre el error
   ```

   - Aquí, cuando se lanza una excepción, `traceback.print_exc()` imprimirá el flujo de llamadas de las funciones.

3. **Consola de depuración**: En Python, también puedes imprimir mensajes a la consola para seguir el flujo del programa:

   ```python
   def calcular_suma(a, b):
       print(f"a: {a}, b: {b}")  # Imprime valores antes de la operación
       return a + b

   print(calcular_suma(5, 3))
   ```

---

### JavaScript:

1. **Puntos de interrupción (breakpoints)**: En JavaScript, los puntos de interrupción se pueden establecer utilizando las herramientas de desarrollo del navegador (como en Chrome, con la pestaña "Sources"). Sin embargo, también puedes utilizar el método `debugger` directamente en el código para crear un punto de interrupción.

   ```javascript
   function calcularSuma(a, b) {
     debugger; // Punto de interrupción
     return a + b;
   }

   console.log(calcularSuma(5, 3));
   ```

   - Al ejecutar este código en el navegador con las herramientas de desarrollo abiertas, el flujo se detendrá en `debugger`, y podrás inspeccionar las variables y continuar la ejecución paso a paso.

2. **Análisis de la pila de llamadas (call stack)**: En JavaScript, cuando ocurre un error, la pila de llamadas se puede ver en la consola de desarrollo del navegador, que muestra el flujo de ejecución hasta el error. Aquí hay un ejemplo:

   ```javascript
   function funcionA() {
     funcionB();
   }

   function funcionB() {
     throw new Error("Error en la función B");
   }

   try {
     funcionA();
   } catch (e) {
     console.error(e); // Imprime el error y la pila de llamadas
   }
   ```

   - Al lanzar la excepción, en la consola del navegador podrás ver la pila de llamadas que te ayudará a entender cómo llegaste al error.

3. **Consola de depuración**: En JavaScript, la consola se usa ampliamente para depuración. Puedes imprimir mensajes en la consola para ver el estado de las variables o el flujo del programa:

   ```javascript
   function calcularSuma(a, b) {
     console.log(`a: ${a}, b: ${b}`); // Imprime los valores antes de la operación
     return a + b;
   }

   console.log(calcularSuma(5, 3));
   ```

Además, el navegador ofrece una **consola interactiva** que permite ejecutar y probar fragmentos de código directamente en tiempo de ejecución, lo cual es muy útil para la depuración.

---

### Java:

1. **Puntos de interrupción (breakpoints)**: En Java, los puntos de interrupción se utilizan principalmente en entornos de desarrollo integrados (IDE), como **Eclipse**, **IntelliJ IDEA** o **NetBeans**. Estos IDEs permiten establecer breakpoints en el código, de manera que el programa se detenga en un punto específico y puedas inspeccionar el valor de las variables, ver el flujo de ejecución, y avanzar paso a paso.

   **Ejemplo**:

   - Para usar un breakpoint en **IntelliJ IDEA** o **Eclipse**, solo necesitas hacer clic en el margen izquierdo de la línea de código donde deseas detener el flujo. Luego, cuando ejecutes el programa en modo de depuración, se detendrá allí y podrás inspeccionar el estado del programa.

   En código, no hay una forma de poner un breakpoint de manera explícita como en otros lenguajes, pero puedes usar `System.out.println` para obtener información sobre el flujo de ejecución.

2. **Análisis de la pila de llamadas (call stack)**: En Java, cuando se lanza una excepción, la pila de llamadas se muestra automáticamente en la consola de depuración. Esto es útil para ver la secuencia de métodos que llevaron al error.

   **Ejemplo**:

   ```java
   public class Main {
       public static void main(String[] args) {
           try {
               funcionA();
           } catch (Exception e) {
               e.printStackTrace();  // Imprime la pila de llamadas cuando ocurre el error
           }
       }

       public static void funcionA() {
           funcionB();
       }

       public static void funcionB() {
           throw new RuntimeException("Error en la función B");
       }
   }
   ```

   - Cuando se lanza la excepción en `funcionB()`, el `e.printStackTrace()` imprimirá la pila de llamadas en la consola, mostrándote cómo se llegó a ese error.

3. **Consola de depuración**: En Java, puedes utilizar `System.out.println()` para imprimir información sobre el estado de las variables y seguir el flujo del programa.

   **Ejemplo**:

   ```java
   public class Main {
       public static void main(String[] args) {
           int a = 5, b = 3;
           System.out.println("a: " + a + ", b: " + b);  // Imprime los valores antes de la operación
           int resultado = a + b;
           System.out.println("Resultado: " + resultado);
       }
   }
   ```

   - Aquí, los valores de las variables `a` y `b` se imprimen antes de realizar la operación, lo que puede ayudarte a verificar que el programa está funcionando correctamente.

En resumen, la depuración en Java generalmente se realiza a través de un IDE utilizando puntos de interrupción, y la pila de llamadas se muestra automáticamente cuando ocurre una excepción. Además, puedes imprimir valores en la consola para ver cómo se está ejecutando tu código.
