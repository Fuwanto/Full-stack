### Preguntas Teóricas Integradoras

---

## 1. Decoradores

**Python**

### ¿Qué es un decorador en Python y para qué se utiliza?

Un **decorador** en Python es una función que permite modificar o extender el comportamiento de otra función o método sin cambiar su código directamente. Es una herramienta poderosa para escribir código más limpio, reutilizable y modular.

**¿Cómo funcionan los decoradores?**
Un decorador toma una función como entrada, la envuelve en otra función que añade funcionalidad adicional, y devuelve la nueva función mejorada. En términos simples, es como "adornar" o "modificar" la funcionalidad de una función existente.

**¿Para qué se utilizan?**
Los decoradores tienen múltiples usos, entre los más comunes están:

1. **Control de acceso**: Verificar permisos antes de ejecutar una función.
2. **Registro (logging)**: Registrar eventos o datos cuando una función es llamada.
3. **Medición de tiempo**: Calcular cuánto tiempo tarda en ejecutarse una función.
4. **Memorización**: Guardar los resultados de funciones para evitar cálculos repetidos.
5. **Validaciones**: Comprobar o modificar los argumentos que se pasan a una función.

**Ejemplo básico de un decorador**

```python
# Definir el decorador
def mi_decorador(funcion_original):
    def funcion_decorada():
        print("Se ejecutará la función original...")
        funcion_original()
        print("La función original ha terminado.")
    return funcion_decorada

# Decorar una función
@mi_decorador
def saludar():
    print("¡Hola, mundo!")

# Llamar a la función decorada
saludar()
```

**Salida:**

```
Se ejecutará la función original...
¡Hola, mundo!
La función original ha terminado.
```

**Detalles clave:**

1. **El símbolo `@`**: Es una forma sintáctica para aplicar un decorador a una función.
   - Es equivalente a: `saludar = mi_decorador(saludar)`.
2. **Decoradores con argumentos**: Puedes crear decoradores que acepten argumentos, lo que los hace aún más flexibles.

**Decorador con argumentos**

```python
def decorador_con_parametro(mensaje):
    def mi_decorador(funcion_original):
        def funcion_decorada():
            print(f"{mensaje}")
            funcion_original()
        return funcion_decorada
    return mi_decorador

@decorador_con_parametro("Ejecutando la función:")
def despedirse():
    print("¡Adiós!")

despedirse()
```

**Salida:**

```
Ejecutando la función:
¡Adiós!
```

**Decoradores en la práctica**

1. **Medir tiempo de ejecución**:

```python
import time

def medir_tiempo(func):
    def envoltura(*args, **kwargs):
        inicio = time.time()
        resultado = func(*args, **kwargs)
        fin = time.time()
        print(f"Tiempo de ejecución: {fin - inicio:.4f} segundos")
        return resultado
    return envoltura

@medir_tiempo
def tarea_pesada():
    time.sleep(2)
    print("Tarea completada.")

tarea_pesada()
```

2. **Autenticación (Control de acceso)**:

```python
def requiere_autenticacion(func):
    def envoltura(usuario):
        if usuario.get("autenticado", False):
            return func(usuario)
        else:
            print("Acceso denegado. Usuario no autenticado.")
    return envoltura

@requiere_autenticacion
def ver_datos(usuario):
    print(f"Datos del usuario: {usuario['nombre']}")

usuario = {"nombre": "Anto", "autenticado": True}
ver_datos(usuario)
```

En resumen, los decoradores son una manera elegante de añadir funcionalidades a las funciones o métodos en Python sin alterar su implementación original.

### Menciona y explica al menos dos decoradores comunes en Python, como `@staticmethod` o `@property`.

En Python, algunos decoradores comunes son parte de su estándar y se utilizan para modificar el comportamiento de métodos en clases o gestionar propiedades. Explico dos de los más utilizados: `@staticmethod` y `@property`.

---

1. **`@staticmethod`**

**¿Qué hace?**

Define un método estático dentro de una clase. Este tipo de método no requiere acceso a la instancia (a través de `self`) ni a la clase (a través de `cls`). En esencia, es un método que pertenece a la clase, pero no opera sobre una instancia específica.

**Uso común**

Se usa cuando necesitas un método dentro de una clase que no dependa de la instancia ni de los atributos de la clase, pero que tenga sentido semántico que esté dentro de la clase.

**Ejemplo:**

```python
class Utilidades:
    @staticmethod
    def sumar(a, b):
        return a + b

# Llamada directa desde la clase, sin crear una instancia
resultado = Utilidades.sumar(5, 7)
print(resultado)  # Salida: 12
```

**Notas:**

- No recibe automáticamente `self` ni `cls`.
- Puede ser llamado directamente desde la clase o desde una instancia.

---

2. **`@property`**

**¿Qué hace?**

Convierte un método en un **atributo calculado** o **propiedad**. Esto permite acceder a un método como si fuera un atributo, lo que facilita la encapsulación y el control sobre cómo se obtiene o establece el valor de un atributo.

**Uso común**

Se usa cuando necesitas agregar lógica al obtener o establecer un atributo, sin exponer directamente la implementación interna.

**Ejemplo básico:**

```python
class Circulo:
    def __init__(self, radio):
        self._radio = radio

    @property
    def radio(self):
        return self._radio

    @radio.setter
    def radio(self, valor):
        if valor < 0:
            raise ValueError("El radio no puede ser negativo")
        self._radio = valor

# Uso de la clase
c = Circulo(5)
print(c.radio)  # Salida: 5

c.radio = 10  # Cambia el valor del radio
print(c.radio)  # Salida: 10

# c.radio = -3  # Descomentar esto lanzará un ValueError
```

**Ventajas:**

1. **Encapsulación**: Puedes ocultar detalles internos del atributo.
2. **Compatibilidad**: Permite cambiar un atributo a una propiedad sin romper el código que ya usa el atributo.

**Notas técnicas:**

- Usa `@property` para la lectura (getter).
- Usa `@propiedad.setter` para definir el comportamiento al escribir (setter).
- También puedes usar `@propiedad.deleter` para eliminar el atributo si es necesario.

---

**Otros decoradores comunes**

- **`@classmethod`**: Define un método que recibe la clase como primer argumento (`cls`) en lugar de la instancia (`self`). Se usa para métodos que necesitan acceso a la clase.
- **`@abstractmethod`**: Indica que un método debe ser implementado por las subclases, útil en clases abstractas.

Estos decoradores facilitan el diseño de clases y mejoran la claridad del código al añadir semántica clara sobre cómo deben comportarse los métodos y atributos.

**JavaScript**

### ¿Cuál es el propósito de los decoradores en JavaScript, y cómo se definen según la propuesta actual?

Los decoradores en JavaScript son una característica propuesta (actualmente en etapa avanzada según el estándar TC39) que permite **modificar, extender o configurar el comportamiento de clases, métodos, propiedades o accesores** de una manera declarativa y reutilizable.

---

**Propósito de los decoradores**

1. **Reutilización de código**: Permiten añadir lógica reutilizable a las clases o sus elementos sin modificar su código directamente.
2. **Organización**: Ayudan a mantener el código más limpio y modular.
3. **Configuración declarativa**: Facilitan agregar metadatos o comportamiento adicional a las clases o sus miembros.
4. **Mejor integración con frameworks**: Son ampliamente utilizados en frameworks modernos como Angular (que ya implementa una versión específica de decoradores).

---

**Cómo funcionan**

Los decoradores son básicamente **funciones** que se aplican a una clase, método, propiedad o accesor. Se escriben con el símbolo `@` seguido del nombre del decorador.

**Ejemplo básico de un decorador de clase**

```javascript
function decoradorClase(target) {
  console.log(`Decorador aplicado a la clase: ${target.name}`);
}

@decoradorClase
class MiClase {}
```

**Salida en consola:**

```
Decorador aplicado a la clase: MiClase
```

**¿Qué ocurre aquí?**

- `@decoradorClase` se aplica a `MiClase`.
- La función `decoradorClase` recibe la clase como argumento (`target`).

---

**Definición según la propuesta actual**

La propuesta TC39 para decoradores en JavaScript introduce un enfoque más estructurado que afecta clases y sus elementos (propiedades, métodos, etc.):

1. **Decoradores de clase**

Un decorador de clase recibe como argumento el constructor de la clase y puede devolver una nueva versión modificada de la clase.

```javascript
function decoradorClase(constructor) {
  return class extends constructor {
    constructor(...args) {
      super(...args);
      this.nuevoAtributo = "Valor agregado por el decorador";
    }
  };
}

@decoradorClase
class Ejemplo {
  constructor(nombre) {
    this.nombre = nombre;
  }
}

const instancia = new Ejemplo("Anto");
console.log(instancia.nuevoAtributo); // Salida: Valor agregado por el decorador
```

2. **Decoradores de métodos**

Modifican el comportamiento de un método o añaden lógica adicional.

```javascript
function loguearLlamadas(target, propertyKey, descriptor) {
  const metodoOriginal = descriptor.value;
  descriptor.value = function (...args) {
    console.log(`Método ${propertyKey} llamado con argumentos:`, args);
    return metodoOriginal.apply(this, args);
  };
}

class Calculadora {
  @loguearLlamadas
  sumar(a, b) {
    return a + b;
  }
}

const calc = new Calculadora();
console.log(calc.sumar(5, 3));
// Salida en consola:
// Método sumar llamado con argumentos: [5, 3]
// 8
```

**¿Qué ocurre aquí?**

- `target`: Es el prototipo del objeto (en métodos de instancia) o la clase (en métodos estáticos).
- `propertyKey`: Nombre del método decorado.
- `descriptor`: Es el descriptor del método (objeto que contiene `value`, `writable`, `configurable` y `enumerable`).

---

3. **Decoradores de propiedades**

Permiten modificar cómo se manejan las propiedades en una clase.

```javascript
function propiedadPorDefecto(valorDefecto) {
  return function (target, propertyKey) {
    let valor = valorDefecto;

    Object.defineProperty(target, propertyKey, {
      get() {
        return valor;
      },
      set(nuevoValor) {
        console.log(`Asignando valor a ${propertyKey}:`, nuevoValor);
        valor = nuevoValor;
      },
      configurable: true,
      enumerable: true,
    });
  };
}

class Usuario {
  @propiedadPorDefecto("Desconocido")
  nombre;
}

const user = new Usuario();
console.log(user.nombre); // Salida: Desconocido
user.nombre = "Anto"; // Salida en consola: Asignando valor a nombre: Anto
```

---

**Estado actual**

- Los decoradores están en **etapa 3 (Stage 3)** del estándar TC39, lo que significa que su diseño es estable y podrían ser incluidos oficialmente en una versión futura de JavaScript.
- Actualmente, puedes probar decoradores usando transpiladores como Babel o TypeScript, que ya soportan decoradores con un diseño cercano al propuesto.

---

**Ventajas clave**

- Ofrecen una sintaxis declarativa para modificar clases y elementos.
- Facilitan el uso de metaprogramación.
- Son esenciales para frameworks modernos como Angular o NestJS, que utilizan decoradores extensivamente para configurar componentes, servicios y controladores.

---

**Java**

### ¿Qué son las anotaciones en Java y en qué se diferencian de los decoradores de otros lenguajes?

Las **anotaciones** en Java son una forma de agregar metadatos al código fuente, que pueden ser utilizados por el compilador, herramientas de desarrollo o incluso en tiempo de ejecución mediante reflexión. Están presentes desde Java 5 y permiten enriquecer el código con información adicional sin modificar directamente su comportamiento.

---

**Propósito de las anotaciones**

1. **Documentación**: Indican intenciones del desarrollador, como `@Override`, que señala que un método sobrescribe uno de la clase padre.
2. **Configuración**: Sustituyen o complementan archivos de configuración externos (por ejemplo, en frameworks como Spring o Hibernate).
3. **Procesamiento**: Pueden ser procesadas en tiempo de compilación o en tiempo de ejecución para generar código, validaciones, o realizar inyecciones de dependencias.

---

**Ejemplo básico de anotaciones en Java**

```java
public class Ejemplo {
    @Override
    public String toString() {
        return "Esto es un ejemplo.";
    }

    @Deprecated
    public void metodoAntiguo() {
        System.out.println("Este método está obsoleto.");
    }
}
```

**Explicación:**

- `@Override`: Verifica que el método sobrescribe correctamente uno de la clase padre. Si no es así, genera un error en tiempo de compilación.
- `@Deprecated`: Marca un método como obsoleto, indicando que no debería usarse y posiblemente será eliminado en futuras versiones.

---

**Creación de anotaciones personalizadas**
Puedes definir tus propias anotaciones para personalizar su uso según tus necesidades.

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Definir la anotación personalizada
@Retention(RetentionPolicy.RUNTIME) // Disponible en tiempo de ejecución
@Target(ElementType.METHOD)         // Solo puede aplicarse a métodos
public @interface MiAnotacion {
    String valor() default "Por defecto";
}

// Usar la anotación personalizada
class EjemploPersonalizado {
    @MiAnotacion(valor = "Ejemplo")
    public void metodo() {
        System.out.println("Método anotado.");
    }
}
```

**Notas clave:**

- `@Retention`: Especifica si la anotación estará disponible solo en el código fuente, en el bytecode, o en tiempo de ejecución.
- `@Target`: Define los elementos donde se puede aplicar la anotación (métodos, clases, campos, etc.).

---

### **Diferencias entre anotaciones en Java y decoradores en otros lenguajes**

| **Aspecto**                | **Anotaciones en Java**                                                                 | **Decoradores (Python/JavaScript)**                                             |
| -------------------------- | --------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| **Propósito principal**    | Agregar metadatos al código fuente.                                                     | Modificar o extender el comportamiento de clases, métodos o propiedades.        |
| **Tiempo de aplicación**   | Generalmente procesadas en tiempo de compilación o ejecución mediante reflexión.        | Se aplican en tiempo de definición o carga (antes de la ejecución).             |
| **Modificación de código** | No cambian directamente el comportamiento del código (requieren herramientas externas). | Pueden alterar directamente el comportamiento del código al envolver funciones. |
| **Sintaxis**               | Usan el símbolo `@` seguido del nombre de la anotación.                                 | Usan el símbolo `@` seguido del decorador, que es una función o clase.          |
| **Ejemplo**                | `@Override`, `@Deprecated`, `@CustomAnnotation`.                                        | `@miDecorador`, `@loguearLlamadas`.                                             |
| **Flexibilidad**           | Menos flexible, más orientado a metadatos.                                              | Más flexible, se utiliza tanto para lógica como para metadatos.                 |

---

**¿Qué no pueden hacer las anotaciones?**

1. **Modificar directamente el comportamiento del código**: En Java, las anotaciones por sí solas no alteran el comportamiento. Para hacerlo, se deben usar herramientas como procesadores de anotaciones (en tiempo de compilación) o frameworks que usen reflexión (en tiempo de ejecución).
2. **Ejecutarse como funciones**: A diferencia de los decoradores en Python o JavaScript, las anotaciones no son funciones que envuelvan métodos o clases.

### Da ejemplos de anotaciones comunes en Java y explica su funcionalidad.

1. **`@Override`**

**Funcionalidad:**

Se utiliza para indicar que un método sobrescribe (override) un método de una clase padre. Ayuda al compilador a verificar que realmente existe un método en la clase base con la misma firma.

**Ejemplo:**

```java
class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}
```

**¿Qué pasa si omites `@Override` y hay un error?**
Si cambias accidentalmente la firma del método en la clase derivada, el compilador no detectará el error sin `@Override`.

---

2. **`@Deprecated`**

**Funcionalidad:**

Marca un método, clase o campo como obsoleto, indicando que no se recomienda su uso porque puede eliminarse en futuras versiones. El compilador genera una advertencia si alguien lo usa.

**Ejemplo:**

```java
class Ejemplo {
    @Deprecated
    public void metodoAntiguo() {
        System.out.println("Este método está obsoleto.");
    }

    public void metodoNuevo() {
        System.out.println("Este método es recomendado.");
    }
}

public class Main {
    public static void main(String[] args) {
        Ejemplo e = new Ejemplo();
        e.metodoAntiguo();  // Genera una advertencia de deprecación
    }
}
```

---

3. **`@SuppressWarnings`**

**Funcionalidad:**

Suprime advertencias específicas del compilador. Es útil para ignorar alertas que sabes que no afectan al comportamiento del programa.

**Ejemplo:**

```java
import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("Elemento");
        System.out.println(lista);
    }
}
```

**Nota**: Sin `@SuppressWarnings`, el compilador mostraría una advertencia sobre el uso de una lista sin tipo genérico.

---

4. **`@FunctionalInterface`**

**Funcionalidad:**

Se utiliza para marcar una interfaz como funcional, es decir, una interfaz que tiene exactamente un método abstracto. Esto es obligatorio para que una interfaz sea usada como una expresión lambda.

**Ejemplo:**

```java
@FunctionalInterface
interface Operacion {
    int calcular(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Operacion suma = (a, b) -> a + b;
        System.out.println(suma.calcular(5, 3));  // Salida: 8
    }
}
```

**Nota**: Si intentas agregar más de un método abstracto a `Operacion`, el compilador generará un error.

---

5. **`@SafeVarargs`**

**Funcionalidad:**

Evita advertencias en métodos con argumentos genéricos variables (varargs) cuando el método no realiza operaciones inseguras con esos argumentos.

**Ejemplo:**

```java
public class Ejemplo {
    @SafeVarargs
    public static <T> void imprimir(T... elementos) {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        imprimir("Uno", "Dos", "Tres");
    }
}
```

---

6. **`@Retention`**

**Funcionalidad:**

Indica cuánto tiempo estará disponible una anotación:

- `SOURCE`: Solo en el código fuente (no se incluye en el bytecode).
- `CLASS`: En el bytecode, pero no en tiempo de ejecución.
- `RUNTIME`: Disponible en tiempo de ejecución.

**Ejemplo:**

```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MiAnotacion {
    String valor();
}

@MiAnotacion(valor = "Ejemplo de Retention")
class Ejemplo {}
```

---

7. **`@Target`**

**Funcionalidad:**

Especifica los elementos del código a los que se puede aplicar una anotación (métodos, campos, clases, etc.).

**Ejemplo:**

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@interface MiAnotacion {}
```

---

8. **`@Entity`** (Hibernate)

**Funcionalidad:**

Marca una clase como una entidad de base de datos para frameworks como Hibernate.

**Ejemplo:**

```java
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    private int id;
    private String nombre;
}
```

---

9. **`@SpringBootApplication`** (Spring Boot)

**Funcionalidad:**

Combina varias anotaciones relacionadas con la configuración de una aplicación Spring Boot, como `@Configuration`, `@EnableAutoConfiguration`, y `@ComponentScan`.

**Ejemplo:**

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiAplicacion {
    public static void main(String[] args) {
        SpringApplication.run(MiAplicacion.class, args);
    }
}
```

---

## 2. Clases

**Python**

### ¿Cuál es la estructura básica de una clase en Python?

La estructura básica de una clase en Python se define utilizando la palabra clave `class`, seguida del nombre de la clase y dos puntos. Dentro de la clase, puedes definir atributos (variables) y métodos (funciones) que operan sobre esos atributos. También es común definir un método especial llamado `__init__`, que es el inicializador de la clase (similar al constructor en otros lenguajes).

**Ejemplo básico:**

```python
class MiClase:
    # Constructor (__init__) que inicializa los atributos de la clase
    def __init__(self, valor):
        self.valor = valor  # Atributo de instancia

    # Método de instancia
    def mostrar_valor(self):
        print(f"El valor es: {self.valor}")

# Crear una instancia de la clase
objeto = MiClase(10)

# Llamar al método
objeto.mostrar_valor()
```

**Explicación:**

1. **`class MiClase:`**: Define la clase llamada `MiClase`.
2. **`def __init__(self, valor):`**: El método `__init__` es el constructor de la clase. El primer parámetro (`self`) es obligatorio en todos los métodos de instancia y hace referencia a la propia instancia de la clase.
3. **`self.valor = valor`**: Aquí estamos asignando el valor pasado al constructor como un atributo de la instancia.
4. **`def mostrar_valor(self):`**: Este es un método de instancia que puede acceder y manipular los atributos de la clase.

### Explica las diferencias entre métodos estáticos y de clase en Python, incluyendo su sintaxis y uso.

En Python, los **métodos estáticos** y los **métodos de clase** son dos tipos especiales de métodos que pertenecen a la clase, pero se comportan de manera diferente en relación con las instancias de la clase.

1. **Métodos Estáticos (Static Methods)**

Un **método estático** es un método que no recibe ni acceso al objeto (`self`) ni a la clase (`cls`). Este tipo de método se define con el decorador `@staticmethod`. Se utiliza cuando no se necesita interactuar con atributos o métodos de la clase, pero es conveniente agrupar la funcionalidad dentro de la clase para organización o estructura.

**Sintaxis de un método estático:**

```python
class MiClase:
    @staticmethod
    def mi_metodo_estatico():
        print("Este es un método estático")

# Llamar al método estático sin crear una instancia
MiClase.mi_metodo_estatico()
```

**Características:**

- No recibe `self` ni `cls` como parámetros.
- No puede acceder a atributos o métodos de la instancia ni de la clase.
- Se utiliza cuando el comportamiento del método no depende de la clase ni de las instancias.

**Ejemplo de uso:**

```python
class Calculadora:
    @staticmethod
    def sumar(a, b):
        return a + b

# Llamar al método estático directamente desde la clase
resultado = Calculadora.sumar(3, 5)
print(resultado)  # Imprime 8
```

2. **Métodos de Clase (Class Methods)**

Un **método de clase** es un método que tiene acceso a la clase en sí (a través del parámetro `cls`) pero no a las instancias de la clase. Se define con el decorador `@classmethod` y es útil cuando necesitas modificar o interactuar con la clase misma, como acceder a sus atributos de clase o crear instancias de la clase.

**Sintaxis de un método de clase:**

```python
class MiClase:
    @classmethod
    def mi_metodo_de_clase(cls):
        print("Este es un método de clase")
        print(f"Clase: {cls}")

# Llamar al método de clase sin crear una instancia
MiClase.mi_metodo_de_clase()
```

**Características:**

- Recibe `cls` como primer parámetro, lo que le da acceso a la clase y sus atributos estáticos.
- No tiene acceso a los atributos de instancia (a través de `self`).
- Se utiliza para trabajar con la clase misma (por ejemplo, para modificar atributos de clase o crear nuevas instancias).

**Ejemplo de uso:**

```python
class Persona:
    contador = 0  # Atributo de clase

    def __init__(self, nombre):
        self.nombre = nombre
        Persona.contador += 1

    @classmethod
    def contar_personas(cls):
        print(f"Total de personas: {cls.contador}")

# Crear instancias
persona1 = Persona("Juan")
persona2 = Persona("Ana")

# Llamar al método de clase
Persona.contar_personas()  # Imprime: Total de personas: 2
```

**Resumen de Diferencias:**

| **Característica**                  | **Método Estático**                                           | **Método de Clase**                                               |
| ----------------------------------- | ------------------------------------------------------------- | ----------------------------------------------------------------- |
| **Decorador**                       | `@staticmethod`                                               | `@classmethod`                                                    |
| **Primer parámetro**                | Ninguno (no recibe `self` ni `cls`)                           | `cls` (representa la clase)                                       |
| **Acceso a atributos de instancia** | No puede acceder a atributos de instancia (`self`)            | No puede acceder a atributos de instancia, pero sí a los de clase |
| **Acceso a atributos de clase**     | No tiene acceso a la clase ni sus atributos                   | Puede acceder a los atributos de clase                            |
| **Uso común**                       | Funcionalidad que no depende de la clase ni de las instancias | Métodos que modifican o interactúan con la clase                  |

Ambos métodos son útiles dependiendo del contexto en el que necesites organizar tu código. Los métodos estáticos se usan cuando no necesitas acceder a nada relacionado con la clase o las instancias, mientras que los métodos de clase son útiles para interactuar con la clase misma, pero no con las instancias específicas.

**JavaScript**

### Describe la sintaxis básica para definir una clase en JavaScript (ES6).

En JavaScript (ES6), las clases se definen utilizando la palabra clave `class`, seguida del nombre de la clase, y luego un bloque de código que contiene el constructor y los métodos.

**Sintaxis básica de una clase en JavaScript (ES6):**

```javascript
class MiClase {
  // Constructor (método especial para inicializar la clase)
  constructor(valor) {
    this.valor = valor; // Atributo de instancia
  }

  // Método de instancia
  mostrarValor() {
    console.log(`El valor es: ${this.valor}`);
  }
}

// Crear una instancia de la clase
const objeto = new MiClase(10);

// Llamar al método
objeto.mostrarValor(); // Imprime: El valor es: 10
```

**Explicación:**

1. **`class MiClase {}`**: Define una clase llamada `MiClase`.
2. **`constructor(valor)`**: El constructor es un método especial que se llama automáticamente cuando se crea una nueva instancia de la clase. En este caso, recibe un parámetro `valor` que se asigna a un atributo de la clase (`this.valor`).
3. **`mostrarValor()`**: Este es un método de instancia que puede acceder y manipular los atributos de la clase, como `this.valor`. Este método imprime el valor de la propiedad `valor` en la consola.
4. **`const objeto = new MiClase(10)`**: Aquí se crea una instancia de la clase `MiClase`, pasando el valor `10` al constructor.
5. **`objeto.mostrarValor()`**: Llama al método `mostrarValor` de la instancia, que imprime el valor de la propiedad.

**Métodos estáticos:**

Si deseas definir un **método estático** en una clase (similar a lo que harías en Python), puedes usar el prefijo `static` antes del nombre del método. Los métodos estáticos no tienen acceso a las instancias de la clase, solo a los elementos estáticos de la clase.

```javascript
class MiClase {
  static mostrarMensaje() {
    console.log("Este es un método estático");
  }
}

// Llamar al método estático sin crear una instancia
MiClase.mostrarMensaje(); // Imprime: Este es un método estático
```

**Resumen:**

- **`class`**: Palabra clave para definir una clase.
- **`constructor`**: Método especial para inicializar una instancia de la clase.
- **Métodos de instancia**: Métodos que operan sobre los datos de las instancias.
- **Métodos estáticos**: Métodos que no operan sobre las instancias, pero se definen en la clase.

**Java**

### ¿Qué elementos básicos componen una clase en Java?

En Java, una clase se compone de varios elementos básicos que permiten definir la estructura y el comportamiento de los objetos que se crean a partir de ella. Estos elementos incluyen atributos, métodos, el constructor, entre otros.

1. **Definición de la Clase**

La clase se define utilizando la palabra clave `class`, seguida del nombre de la clase (que debe comenzar con una letra mayúscula por convención).

```java
public class MiClase {
    // Definición de atributos y métodos
}
```

2. **Atributos (Campos)**

Los **atributos** (o campos) son las variables que contienen los datos de la clase. Se definen dentro de la clase, pero fuera de cualquier método. Los atributos pueden ser de cualquier tipo de datos, como enteros, cadenas de texto, objetos, etc.

```java
public class MiClase {
    int valor; // Atributo de tipo entero
    String nombre; // Atributo de tipo cadena
}
```

3. **Constructor**

El **constructor** es un método especial que se utiliza para inicializar los objetos de la clase. Tiene el mismo nombre que la clase y no tiene tipo de retorno (ni `void`). Si no se define un constructor explícitamente, Java proporciona uno por defecto.

```java
public class MiClase {
    int valor;
    String nombre;

    // Constructor
    public MiClase(int valor, String nombre) {
        this.valor = valor;  // Inicialización del atributo 'valor'
        this.nombre = nombre; // Inicialización del atributo 'nombre'
    }
}
```

4. **Métodos**

Los **métodos** son funciones que definen el comportamiento de la clase. Pueden acceder a los atributos de la clase y realizar operaciones sobre ellos. Los métodos pueden tener un tipo de retorno (como `void`, `int`, `String`, etc.) y pueden recibir parámetros.

```java
public class MiClase {
    int valor;
    String nombre;

    public MiClase(int valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    // Método para mostrar el valor
    public void mostrarValor() {
        System.out.println("El valor es: " + valor);
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }
}
```

5. **Modificadores de Acceso**

Los **modificadores de acceso** determinan la visibilidad y el acceso a los miembros de la clase (atributos y métodos). Los más comunes son:

- `public`: La clase, atributo o método es accesible desde cualquier parte del programa.
- `private`: La clase, atributo o método es accesible solo dentro de la propia clase.
- `protected`: Acceso dentro de la clase, sus subclases y el mismo paquete.
- `default` (sin modificador): Acceso solo dentro del mismo paquete.

```java
public class MiClase {
    private int valor; // Solo accesible dentro de esta clase
    public String nombre; // Accesible desde cualquier parte

    public MiClase(int valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }
}
```

6. **Métodos Estáticos**

Los **métodos estáticos** son métodos que pertenecen a la clase en lugar de a las instancias. Se definen con la palabra clave `static`. No pueden acceder a los atributos de instancia, pero sí a los atributos estáticos.

```java
public class MiClase {
    static int contador = 0; // Atributo estático

    public MiClase() {
        contador++; // Incrementar contador cada vez que se crea una nueva instancia
    }

    // Método estático
    public static void mostrarContador() {
        System.out.println("Contador: " + contador);
    }
}
```

7. **Métodos de Instancia y Sobrecarga de Métodos**

Los **métodos de instancia** son aquellos que operan sobre objetos específicos (instancias) de la clase. Además, Java permite **sobrecargar métodos**, lo que significa definir múltiples métodos con el mismo nombre pero con diferentes parámetros.

```java
public class MiClase {
    public void mostrar(int a) {
        System.out.println("Valor: " + a);
    }

    // Sobrecarga del método 'mostrar'
    public void mostrar(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }
}
```

8. **Clases Internas**

Las **clases internas** son clases definidas dentro de otra clase. Pueden ser de dos tipos:

- **Clases internas no estáticas**: Tienen acceso a los miembros de la clase externa, incluidas las variables de instancia.
- **Clases internas estáticas**: Son más autónomas y solo pueden acceder a los miembros estáticos de la clase externa.

```java
public class Externa {
    private int valor = 10;

    // Clase interna no estática
    public class Interna {
        public void mostrarValor() {
            System.out.println("Valor desde clase interna: " + valor);
        }
    }
}
```

**Ejemplo Completo de una Clase en Java:**

```java
public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método de instancia
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    // Método estático
    public static void saludar() {
        System.out.println("¡Hola desde la clase Persona!");
    }

    // Método getter
    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        // Crear instancia de Persona
        Persona persona1 = new Persona("Juan", 30);
        persona1.mostrarInfo();  // Imprime: Nombre: Juan, Edad: 30

        // Llamar al método estático sin crear instancia
        Persona.saludar();  // Imprime: ¡Hola desde la clase Persona!
    }
}
```

**Resumen de Elementos Básicos de una Clase en Java:**

1. **Atributos (Campos)**: Variables que definen el estado de la clase.
2. **Constructor**: Método especial que inicializa la clase.
3. **Métodos**: Funciones que definen el comportamiento de la clase.
4. **Modificadores de Acceso**: Controlan la visibilidad de los miembros de la clase.
5. **Métodos Estáticos**: Métodos que pertenecen a la clase y no a las instancias.
6. **Clases Internas**: Clases definidas dentro de otras clases.

---

## 3. Clases Abstractas y Métodos Abstractos

**Java**

### ¿Qué son las clases abstractas en Java, y para qué se utilizan?

Las **clases abstractas** en Java son clases que no pueden ser instanciadas directamente, es decir, no se pueden crear objetos de ellas. Se utilizan como base para otras clases, proporcionando una estructura común que otras clases concretas pueden extender y definir. Las clases abstractas pueden contener:

- **Métodos abstractos**: Métodos sin implementación, que las clases derivadas deben implementar. Esto obliga a las clases hijas a proporcionar una implementación concreta de esos métodos.
- **Métodos concretos**: Métodos con implementación que las clases derivadas pueden heredar tal cual o sobrescribir (override) si es necesario.
- **Campos (atributos)**: Al igual que las clases normales, las clases abstractas pueden tener campos y estos pueden ser heredados por las clases hijas.

**Sintaxis básica:**

```java
abstract class Animal {
    abstract void sound();  // Método abstracto

    void eat() {  // Método concreto
        System.out.println("Este animal está comiendo.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {  // Implementación del método abstracto
        System.out.println("El perro hace guau.");
    }
}
```

**Usos principales:**

1. **Reutilización de código**: Puedes colocar métodos comunes en la clase abstracta y permitir que las clases hijas reutilicen esos métodos.
2. **Polimorfismo**: Las clases abstractas permiten trabajar con referencias de tipo abstracto, lo que facilita la implementación de polimorfismo, ya que las subclases pueden tener diferentes implementaciones para los métodos abstractos.
3. **Estructuración de jerarquías**: Se utilizan para crear una jerarquía de clases donde las subclases implementan detalles específicos, pero comparten una estructura común.

**Ejemplo de uso:**

Imagina que estás creando una jerarquía para un sistema de vehículos:

```java
abstract class Vehiculo {
    abstract void mover();  // Método abstracto

    void frenar() {  // Método concreto
        System.out.println("El vehículo está frenando.");
    }
}

class Coche extends Vehiculo {
    @Override
    void mover() {
        System.out.println("El coche está moviéndose.");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    void mover() {
        System.out.println("La bicicleta está pedaleando.");
    }
}
```

En este ejemplo, la clase `Vehiculo` es abstracta, y las clases `Coche` y `Bicicleta` la extienden e implementan el método `mover`.

### ¿Por qué no se pueden instanciar clases abstractas directamente?

Las clases abstractas no se pueden instanciar directamente porque están diseñadas para ser utilizadas como plantillas o estructuras base para otras clases. La idea detrás de las clases abstractas es que proporcionan una base común, pero no tienen sentido por sí solas, ya que no tienen una implementación completa de sus métodos (si tienen métodos abstractos)

### Describe la relación entre interfaces y clases abstractas, señalando las diferencias clave.

Las **interfaces** y las **clases abstractas** son ambos mecanismos en Java que permiten la creación de tipos abstractos, pero tienen diferencias clave en su diseño, propósito y uso.

**Relación entre Interfaces y Clases Abstractas:**

1. **Ambas son tipos abstractos**: Tanto las interfaces como las clases abstractas definen un conjunto de métodos que pueden ser implementados o completados por las clases que las extienden (en el caso de clases abstractas) o implementan (en el caso de interfaces).
2. **No se pueden instanciar directamente**: Al igual que las clases abstractas, las interfaces no pueden ser instanciadas. Solo las clases concretas (que extienden o implementan) pueden crear instancias.

**Diferencias clave:**

1. **Métodos Abstractos**:

   - **Clases abstractas**: Pueden tener tanto **métodos abstractos** (sin implementación) como **métodos concretos** (con implementación).

     ```java
     abstract class Animal {
         abstract void makeSound();  // Método abstracto

         void breathe() {  // Método concreto
             System.out.println("El animal respira");
         }
     }
     ```

   - **Interfaces**: En versiones anteriores a Java 8, solo podían tener métodos abstractos (sin implementación). Sin embargo, desde **Java 8**, las interfaces pueden tener métodos concretos (con implementación) mediante el uso de la palabra clave `default` y `static`. A pesar de esto, el propósito de las interfaces sigue siendo proporcionar una **especificación de contrato** que las clases deben implementar.

     ```java
     interface Animal {
         void makeSound();  // Método abstracto

         default void breathe() {  // Método con implementación
             System.out.println("El animal respira");
         }
     }
     ```

2. **Herencia y Implementación**:

   - **Clases abstractas**: Una clase abstracta se extiende utilizando la palabra clave `extends`. Una clase puede **heredar solo de una clase abstracta**, ya que Java no permite la herencia múltiple de clases.
     ```java
     class Perro extends Animal {
         @Override
         void makeSound() {
             System.out.println("El perro hace guau");
         }
     }
     ```
   - **Interfaces**: Una clase puede **implementar múltiples interfaces** utilizando la palabra clave `implements`. Esto permite una forma de herencia múltiple, donde una clase puede adoptar el comportamiento de varias interfaces.
     ```java
     class Perro implements Animal, Mamifero {
         @Override
         public void makeSound() {
             System.out.println("El perro hace guau");
         }
     }
     ```

3. **Campos (Atributos)**:

   - **Clases abstractas**: Pueden tener campos (atributos) con valores específicos, que pueden ser heredados por las clases hijas.

     ```java
     abstract class Animal {
         String color;  // Campo heredado

         abstract void makeSound();
     }
     ```

   - **Interfaces**: Los campos en las interfaces son **implícitamente `public`, `static` y `final`**, es decir, son constantes. No se pueden asignar valores a esos campos en una clase que implemente la interfaz.
     ```java
     interface Animal {
         String especie = "Desconocida";  // Implicitamente public static final
     }
     ```

4. **Propósito**:

   - **Clases abstractas**: Se utilizan cuando se necesita proporcionar una base común para las clases derivadas. Una clase abstracta puede contener una implementación común y dejar algunos métodos para que las subclases los completen.
   - **Interfaces**: Se utilizan para definir un contrato que las clases deben cumplir. No proporcionan implementación, sino que especifican un conjunto de métodos que las clases implementadoras deben ofrecer. Son ideales para situaciones donde se quiere garantizar que una clase siga un contrato común, pero no es necesario compartir implementación.

5. **Acceso a miembros**:
   - **Clases abstractas**: Pueden tener modificadores de acceso como `private`, `protected` o `public` para sus métodos y atributos.
   - **Interfaces**: Los miembros de una interfaz (métodos y campos) son implícitamente `public`, y los métodos son **siempre abstractos**, a menos que se especifiquen como `default` o `static`.

**Resumen de diferencias clave:**

| Característica         | **Clases Abstractas**                                               | **Interfaces**                                                                       |
| ---------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------------------------ |
| **Métodos abstractos** | Sí, pero también pueden tener métodos concretos.                    | Solo métodos abstractos, aunque pueden tener métodos `default` o `static` (Java 8+). |
| **Herencia**           | Se extiende solo una clase abstracta.                               | Se pueden implementar múltiples interfaces.                                          |
| **Campos**             | Pueden tener atributos con valores específicos.                     | Los campos son `public static final` (constantes).                                   |
| **Acceso a miembros**  | Pueden tener modificadores de acceso (privado, protegido, público). | Los métodos y atributos son `public` por defecto.                                    |
| **Propósito**          | Para proporcionar una base común y parcialmente implementada.       | Para definir un contrato de comportamiento sin implementación.                       |

**Cuándo usar una clase abstracta o una interfaz:**

- **Clase abstracta**: Cuando quieres compartir una implementación común entre clases y también deseas definir métodos abstractos que las subclases deberán implementar.
- **Interfaz**: Cuando deseas definir un contrato que debe ser seguido por las clases, sin imponer ninguna implementación específica. Ideal para la herencia múltiple de comportamientos.

**Python**

### ¿Cómo se implementan clases abstractas y métodos abstractos en Python usando el módulo `abc`?

En Python, las clases abstractas y los métodos abstractos se implementan utilizando el módulo `abc` (Abstract Base Class). Este módulo permite definir clases y métodos abstractos de manera que las clases hijas deben implementar esos métodos para ser instanciadas.

**Pasos para implementar clases abstractas y métodos abstractos:**

1. **Importar el módulo `abc`**: Debes importar `ABC` y `abstractmethod` del módulo `abc`.
2. **Definir la clase abstracta**: La clase debe heredar de `ABC` para ser considerada una clase abstracta.
3. **Definir métodos abstractos**: Los métodos que quieres que sean abstractos deben ser decorados con `@abstractmethod`. Esto indica que las clases hijas deben implementar esos métodos.

**Ejemplo básico:**

```python
from abc import ABC, abstractmethod

class Animal(ABC):
    # Método abstracto
    @abstractmethod
    def make_sound(self):
        pass

    # Método concreto
    def breathe(self):
        print("El animal está respirando.")

# Clase hija que implementa el método abstracto
class Perro(Animal):
    def make_sound(self):
        print("El perro hace guau.")

# Intentar instanciar la clase abstracta causará un error
# animal = Animal()  # Esto generará un TypeError

# Instanciar la clase hija que implementa el método abstracto
perro = Perro()
perro.make_sound()  # Output: El perro hace guau.
perro.breathe()     # Output: El animal está respirando.
```

**Detalles clave:**

1. **`ABC`**: La clase base de todas las clases abstractas. Es necesario heredar de ella para que Python reconozca la clase como abstracta.
2. **`@abstractmethod`**: Este decorador marca un método como abstracto, lo que significa que debe ser implementado por cualquier clase que herede de la clase abstracta.

3. **No se puede instanciar una clase abstracta**: Si intentas crear una instancia de la clase `Animal` directamente, Python lanzará un `TypeError` porque tiene métodos abstractos que no tienen implementación.

**Métodos abstractos y concretos:**

- **Métodos abstractos**: Son métodos que **no tienen implementación** en la clase abstracta y **deben ser implementados** por las clases hijas. Se definen con `@abstractmethod`.
- **Métodos concretos**: Son métodos con implementación en la clase abstracta. Pueden ser heredados directamente por las clases hijas o sobrescritos (como en el caso de `breathe` en el ejemplo anterior).

**Otro ejemplo con múltiples clases:**

```python
from abc import ABC, abstractmethod

class Vehiculo(ABC):
    @abstractmethod
    def arrancar(self):
        pass

    @abstractmethod
    def detener(self):
        pass

class Coche(Vehiculo):
    def arrancar(self):
        print("El coche está arrancando.")

    def detener(self):
        print("El coche se ha detenido.")

class Bicicleta(Vehiculo):
    def arrancar(self):
        print("La bicicleta está comenzando a moverse.")

    def detener(self):
        print("La bicicleta se ha detenido.")

# Instanciando las clases hijas
coche = Coche()
coche.arrancar()  # Output: El coche está arrancando.
coche.detener()   # Output: El coche se ha detenido.

bicicleta = Bicicleta()
bicicleta.arrancar()  # Output: La bicicleta está comenzando a moverse.
bicicleta.detener()   # Output: La bicicleta se ha detenido.
```

**Beneficios de usar clases abstractas y métodos abstractos:**

- **Imponer un contrato**: Asegura que las clases hijas implementen ciertos métodos, lo que es útil cuando deseas que todas las clases derivadas tengan una interfaz común.
- **Reutilización de código**: Puedes poner métodos concretos en la clase abstracta que serán heredados por las clases hijas, evitando duplicación de código.

### ¿Qué limitaciones tienen las clases abstractas en Python en comparación con Java?

Las clases abstractas en Python tienen varias diferencias y limitaciones en comparación con Java, aunque ambas permiten la creación de clases base con métodos que deben ser implementados por las subclases.

1. **Métodos Abstractos con Implementación**

- **Python**: En Python, puedes tener **métodos abstractos con implementación** usando el decorador `@abstractmethod` junto con un método con un cuerpo concreto. Esto permite tener **métodos parcialmente implementados** en una clase abstracta, y las subclases pueden optar por usar la implementación predeterminada o sobrescribirla.

  ```python
  from abc import ABC, abstractmethod

  class Animal(ABC):
      @abstractmethod
      def make_sound(self):
          pass

      def breathe(self):  # Método concreto
          print("El animal está respirando.")
  ```

- **Java**: En Java, **los métodos abstractos no pueden tener implementación**. Solo se definen con su firma y las subclases deben proporcionar la implementación concreta. Si se desea una implementación predeterminada, se tiene que usar un **método concreto** dentro de la clase abstracta.

  ```java
  abstract class Animal {
      abstract void makeSound();  // Método abstracto, sin implementación.

      void breathe() {  // Método concreto con implementación.
          System.out.println("El animal está respirando.");
      }
  }
  ```

2. **Herencia Múltiple**

- **Python**: Las clases abstractas en Python permiten **herencia múltiple**. Esto significa que una clase puede heredar de varias clases abstractas, lo cual es útil cuando deseas combinar comportamientos de diferentes clases base abstractas.

  ```python
  from abc import ABC, abstractmethod

  class Animal(ABC):
      @abstractmethod
      def make_sound(self):
          pass

  class Mamifero(ABC):
      @abstractmethod
      def alimentar(self):
          pass

  class Perro(Animal, Mamifero):
      def make_sound(self):
          print("Guau")

      def alimentar(self):
          print("Alimentando al perro")
  ```

- **Java**: En Java, **no existe herencia múltiple** de clases. Una clase solo puede extender de una clase abstracta, pero puede implementar múltiples interfaces. Esto significa que las clases abstractas en Java no permiten combinar comportamientos de varias clases base abstractas como en Python.

  ```java
  abstract class Animal {
      abstract void makeSound();
  }

  interface Mamifero {
      void alimentar();
  }

  class Perro extends Animal implements Mamifero {
      void makeSound() {
          System.out.println("Guau");
      }

      public void alimentar() {
          System.out.println("Alimentando al perro");
      }
  }
  ```

3. **Campos (Atributos) en las Clases Abstractas**

- **Python**: En Python, las clases abstractas pueden tener atributos y métodos concretos, pero no tienen restricciones estrictas sobre los **modificadores de acceso**. Los atributos pueden ser definidos de manera directa sin especificar si son públicos, privados o protegidos, ya que Python es más flexible en cuanto a la visibilidad de los miembros (se basa en la convención de nombres, como un guion bajo para "protegido").

- **Java**: En Java, los atributos en las clases abstractas deben tener **modificadores de acceso explícitos** (`private`, `protected`, `public`). Además, las clases abstractas en Java suelen usar más estrictamente los **modificadores de acceso** para controlar cómo los atributos y métodos son heredados y accedidos.

  ```java
  abstract class Animal {
      protected String especie;  // Atributo protegido
      private int edad;          // Atributo privado

      abstract void makeSound();
  }
  ```

4. **Manejo de Instanciación de la Clase Abstracta**

- **Python**: En Python, **no hay una restricción explícita** para evitar la instanciación de una clase abstracta. Si intentas instanciar directamente una clase abstracta que tiene métodos abstractos no implementados, Python lanzará un `TypeError`, pero no se bloquea de manera tan estricta como en Java. Esto es más flexible y depende de la correcta implementación por parte del desarrollador.

  ```python
  from abc import ABC, abstractmethod

  class Animal(ABC):
      @abstractmethod
      def make_sound(self):
          pass

  # Esto causará un error en tiempo de ejecución:
  animal = Animal()  # TypeError: Can't instantiate abstract class Animal with abstract methods make_sound
  ```

- **Java**: En Java, la instancia de una clase abstracta es **prohibida de manera estricta** por el compilador, no se permite la instanciación directa de clases abstractas. El compilador evitará incluso la creación de una instancia si la clase tiene métodos abstractos no implementados.

  ```java
  abstract class Animal {
      abstract void makeSound();
  }

  // Esto causará un error de compilación:
  Animal animal = new Animal();  // Error: Animal is abstract; cannot be instantiated
  ```

5. **Interfaces y Clases Abstractas en Python**

- **Python**: No hay una distinción tan fuerte entre clases abstractas e interfaces en Python. Si una clase tiene solo métodos abstractos (sin implementación), se puede considerar como una **interface**. La diferencia principal radica en el uso de la clase `ABC` y el decorador `@abstractmethod`.

- **Java**: En Java, las **interfaces** y las **clases abstractas** son conceptos distintos. Las interfaces en Java solo pueden tener métodos abstractos (a excepción de métodos `default` y `static` desde Java 8), y una clase puede implementar múltiples interfaces. Las interfaces están diseñadas para representar un contrato que las clases deben seguir, mientras que las clases abstractas pueden incluir tanto **comportamientos comunes** como métodos abstractos.

  ```java
  interface Animal {
      void makeSound();  // Solo un contrato
  }

  abstract class Mamifero {
      abstract void alimentar();  // Método abstracto

      void dormir() {  // Método concreto
          System.out.println("El mamífero está durmiendo");
      }
  }
  ```

**Resumen de las limitaciones de clases abstractas en Python en comparación con Java:**

| Característica                            | **Python**                                                                                                                                  | **Java**                                                                   |
| ----------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| **Métodos abstractos con implementación** | Sí, se pueden definir métodos abstractos con implementación concreta.                                                                       | No, los métodos abstractos no pueden tener implementación.                 |
| **Herencia múltiple**                     | Permite herencia múltiple de clases abstractas.                                                                                             | No permite herencia múltiple de clases, solo interfaces.                   |
| **Modificadores de acceso**               | No se requiere especificar modificadores de acceso, se basa en convenciones.                                                                | Requiere especificar modificadores de acceso (private, protected, public). |
| **Instanciación**                         | Permite instanciar una clase abstracta que tiene implementación concreta, pero lanzará un error si hay métodos abstractos no implementados. | No permite la instanciación de clases abstractas.                          |
| **Interfaces**                            | No hay una distinción clara entre clases abstractas e interfaces.                                                                           | Las interfaces son un tipo distinto de clase que solo define un contrato.  |

En resumen, **Python es más flexible** en cuanto a las clases abstractas, permitiendo métodos concretos, herencia múltiple y menos restricciones en cuanto a los modificadores de acceso. En cambio, **Java es más rígido** y tiene una distinción más clara entre clases abstractas e interfaces, con reglas más estrictas sobre la implementación y la herencia.

---

## 4. Herencia

**Python**

### Explica cómo se define la herencia básica en Python, incluyendo el uso de `super()`.

La herencia en Python permite que una clase (subclase) herede atributos y métodos de otra clase (superclase). Esto facilita la reutilización del código y la extensión de funcionalidades. A continuación.

**Definición básica de herencia**

Supongamos que tenemos una clase base (superclase) llamada `Animal` y una clase derivada (subclase) llamada `Perro`. La subclase puede heredar los atributos y métodos de la clase base.

```python
class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

    def hablar(self):
        print(f"{self.nombre} hace un sonido")

class Perro(Animal):  # Perro hereda de Animal
    def __init__(self, nombre, raza):
        # Llamamos al constructor de la superclase (Animal) para inicializar nombre
        super().__init__(nombre)
        self.raza = raza

    def hablar(self):
        print(f"{self.nombre} dice guau!")
```

En este ejemplo:

- La clase `Perro` hereda de la clase `Animal`.
- El constructor `__init__` de `Perro` llama al constructor de `Animal` utilizando `super().__init__(nombre)` para inicializar el atributo `nombre` en la clase base.
- El método `hablar` se sobrescribe en la clase `Perro` para proporcionar una implementación específica para los perros.

**Uso de `super()`**

El uso de `super()` es clave en la herencia porque permite acceder a métodos y atributos de la superclase sin necesidad de hacer referencia explícita a la superclase por su nombre. Es especialmente útil para extender funcionalidades sin sobrescribir completamente los métodos de la superclase.

En el ejemplo anterior:

- `super().__init__(nombre)` llama al constructor de la clase `Animal`, lo que inicializa el atributo `nombre` en la instancia de `Perro`.
- `super()` puede ser útil también para llamar a métodos de la clase base dentro de un método sobrescrito en la subclase, lo que permite mantener el comportamiento original de la clase base mientras se extiende.

**Ejemplo de uso**

```python
perro = Perro("Rex", "Labrador")
perro.hablar()  # Salida: Rex dice guau!
```

En este caso, la salida de `perro.hablar()` muestra el mensaje sobrescrito en la clase `Perro`, pero el atributo `nombre` sigue siendo heredado de la clase `Animal`.

**Resumen de los puntos clave:**

1. **Herencia básica**: Una subclase puede heredar métodos y atributos de una superclase.
2. **`super()`**: Permite llamar a métodos de la superclase desde la subclase, facilitando la reutilización del código y evitando la referencia explícita al nombre de la clase base. Es útil especialmente en constructores y métodos sobrescritos.

### ¿Qué es la herencia múltiple, y cuáles son sus ventajas y desventajas en Python?

La **herencia múltiple** en Python se refiere a un mecanismo que permite que una clase derive de más de una clase base, es decir, que una subclase herede atributos y métodos de varias superclases. Esto contrasta con la herencia simple, donde una clase hereda solo de una clase base.

**Ejemplo de herencia múltiple**

Imagina que tienes dos clases base: `Volador` y `Nadador`. Ahora, puedes crear una clase `Pato` que herede de ambas.

```python
class Volador:
    def __init__(self, altura_vuelo):
        self.altura_vuelo = altura_vuelo

    def volar(self):
        print(f"Volando a una altura de {self.altura_vuelo} metros")

class Nadador:
    def __init__(self, velocidad_nado):
        self.velocidad_nado = velocidad_nado

    def nadar(self):
        print(f"Nadando a una velocidad de {self.velocidad_nado} km/h")

class Pato(Volador, Nadador):  # Herencia múltiple
    def __init__(self, altura_vuelo, velocidad_nado):
        Volador.__init__(self, altura_vuelo)  # Llamada al constructor de Volador
        Nadador.__init__(self, velocidad_nado)  # Llamada al constructor de Nadador

# Creando una instancia de Pato
mi_pato = Pato(10, 5)
mi_pato.volar()    # Salida: Volando a una altura de 10 metros
mi_pato.nadar()    # Salida: Nadando a una velocidad de 5 km/h
```

**En este ejemplo:**

- La clase `Pato` hereda tanto de `Volador` como de `Nadador`.
- Llamamos explícitamente a los constructores de ambas clases base en el constructor de `Pato`.

**Ventajas de la herencia múltiple**

1. **Reutilización de código**: Permite combinar características de varias clases en una sola clase derivada. Esto puede ser útil cuando necesitas combinar funcionalidades de diferentes clases base sin duplicar código.
2. **Flexibilidad**: Ofrece mayor flexibilidad en la creación de clases que necesitan comportamientos de múltiples clases base. Por ejemplo, un coche puede ser tanto un "animal" (en términos metafóricos) como un "vehículo".

3. **Modularidad**: Las clases base pueden ser diseñadas de manera modular, cada una con responsabilidades específicas. Esto permite crear jerarquías de clases más complejas pero organizadas.

**Desventajas de la herencia múltiple**

1. **Complejidad**: La herencia múltiple puede hacer que el código sea más difícil de entender y mantener. Puede resultar complicado seguir qué atributos y métodos provienen de qué clase base, especialmente si hay muchas clases involucradas.

2. **Problemas con el orden de resolución de métodos (MRO, Method Resolution Order)**: En Python, el orden en que se buscan los métodos en la jerarquía de clases se establece según el algoritmo **C3 Linearization**, que resuelve el orden de las clases base de forma compleja. Esto puede generar conflictos si dos clases base tienen un método con el mismo nombre.

**Ejemplo de conflicto con MRO**:

```python
class A:
    def saludar(self):
        print("Hola desde A")

class B:
    def saludar(self):
        print("Hola desde B")

class C(A, B):
    pass

obj = C()
obj.saludar()  # ¿Debería llamar al método de A o al de B?
```

En este caso, Python sigue el **MRO** para decidir cuál método ejecutar. Para ver el MRO, puedes utilizar `C.__mro__`, que muestra el orden de resolución.

```python
print(C.__mro__)
```

Esto te dará un resultado como:

```
(<class '__main__.C'>, <class '__main__.A'>, <class '__main__.B'>, <class 'object'>)
```

Según este orden, el método `saludar()` de la clase `A` será ejecutado, ya que `A` aparece antes que `B` en el MRO.

3. **Confusión y errores difíciles de depurar**: Cuando dos clases base tienen métodos o atributos con el mismo nombre, se pueden producir resultados inesperados o errores difíciles de identificar debido a la confusión en el MRO o en la inicialización de los atributos.

4. **Mantenimiento**: A medida que las clases base cambian, las subclases pueden verse afectadas de formas inesperadas, ya que heredan de varias clases. Esto puede hacer que el mantenimiento del código sea más difícil.

**Resumen de ventajas y desventajas:**

**Ventajas**:

- Reutilización de código.
- Flexibilidad para combinar comportamientos de varias clases.
- Modularidad y organización de código.

**Desventajas**:

- Complejidad y mayor dificultad de comprensión.
- Conflictos en el MRO.
- Errores difíciles de depurar.
- Mayor dificultad de mantenimiento.

### Recomendaciones

Si bien la herencia múltiple es poderosa, es importante usarla con precaución. Si tienes dudas sobre su uso, podrías considerar **composición** en lugar de herencia múltiple, lo que implica incluir objetos de otras clases dentro de una clase sin que una clase herede de varias. Esto puede ser una solución más limpia y menos propensa a errores.

**JavaScript**

### Describe la sintaxis para implementar herencia en JavaScript usando la palabra clave `extends`.

En JavaScript, la herencia se implementa utilizando la palabra clave `extends`, que permite que una clase herede de otra. A través de esta sintaxis, una clase derivada (subclase) puede heredar métodos y propiedades de una clase base (superclase).

**Sintaxis básica de herencia con `extends`**

La clase hija (subclase) se define con la palabra clave `extends` seguida del nombre de la clase padre (superclase). La subclase puede sobrescribir métodos de la clase base, y puede llamar al constructor de la clase base usando `super()`.

**Ejemplo:**

```javascript
// Definimos la clase base (superclase)
class Animal {
  constructor(nombre) {
    this.nombre = nombre;
  }

  hablar() {
    console.log(`${this.nombre} hace un sonido`);
  }
}

// Definimos la clase derivada (subclase) que extiende a Animal
class Perro extends Animal {
  constructor(nombre, raza) {
    // Llamamos al constructor de la superclase
    super(nombre);
    this.raza = raza;
  }

  // Sobrescribimos el método hablar de la clase base
  hablar() {
    console.log(`${this.nombre} dice guau!`);
  }
}

// Creando una instancia de la subclase
const miPerro = new Perro("Rex", "Labrador");
miPerro.hablar(); // Salida: Rex dice guau!
```

**Descripción de la sintaxis:**

1. **Clase base (superclase)**:
   - Usamos `class` para definir la clase base `Animal`.
   - El constructor de `Animal` inicializa el atributo `nombre` y tiene un método `hablar` que imprime un mensaje.
2. **Clase derivada (subclase)**:

   - La subclase `Perro` se define con `extends Animal`, lo que indica que `Perro` hereda de la clase `Animal`.
   - Dentro del constructor de `Perro`, utilizamos `super(nombre)` para llamar al constructor de la clase base `Animal` y así inicializar el atributo `nombre`.
   - La subclase también sobrescribe el método `hablar` para proporcionar una implementación específica para los perros.

3. **Uso de `super()`**:
   - `super(nombre)` se utiliza para invocar el constructor de la clase base. Sin esta llamada, el constructor de la clase base no se ejecutaría correctamente.
   - `super` también se puede usar para llamar a métodos de la clase base desde la subclase, como se muestra en el siguiente ejemplo:

```javascript
class Gato extends Animal {
  constructor(nombre, color) {
    super(nombre); // Llamada al constructor de la clase base
    this.color = color;
  }

  hablar() {
    super.hablar(); // Llama al método 'hablar' de la clase base
    console.log(`${this.nombre} dice miau!`);
  }
}

const miGato = new Gato("Luna", "Negra");
miGato.hablar();
// Salida:
// Luna hace un sonido
// Luna dice miau!
```

En este caso, `super.hablar()` llama al método `hablar` de la clase `Animal` antes de ejecutar la versión sobrescrita en `Gato`.

### ¿JavaScript soporta herencia múltiple?

JavaScript **no** soporta la herencia múltiple directamente, es decir, no permite que una clase herede de múltiples clases usando `extends`. Esto se debe a que la herencia múltiple puede generar conflictos complejos, como el [**problema del diamante**](https://es.linkedin.com/pulse/oop-el-problema-del-diamante-nicol%C3%A1s-cereijo-ranchal-1f)., donde un método o propiedad heredada de múltiples clases puede ser ambiguo.

En lugar de herencia múltiple, JavaScript favorece la [**composición**](https://hackernoon.com/inheritance-vs-composition-in-javascript) de objetos. Esto significa que, en lugar de hacer que una clase herede de varias otras, puedes crear instancias de otras clases dentro de una clase y delegar comportamientos, lo que resulta en un diseño más flexible y menos propenso a errores.

Para simular la herencia múltiple en JavaScript, se pueden usar técnicas como la mezcla (mixin), que combina propiedades y métodos de varios objetos en una clase, sin las complicaciones que presenta la herencia múltiple directa.

**Java**

### ¿Qué significa herencia en Java, y cómo se define?

En Java, la **herencia** es un principio de la programación orientada a objetos que permite a una clase (subclase) heredar atributos y métodos de otra clase (superclase). Esto facilita la reutilización de código, ya que las subclases pueden extender o modificar el comportamiento de las clases base.

**Definición de herencia en Java**

En Java, la herencia se define utilizando la palabra clave `extends`. Esto indica que una clase hija (subclase) hereda de una clase base (superclase). La subclase puede acceder a los métodos y atributos públicos y protegidos de la superclase y puede sobrescribir los métodos para proporcionar su propia implementación.

**Sintaxis básica:**

```java
// Clase base (superclase)
class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hablar() {
        System.out.println("El animal hace un sonido");
    }
}

// Clase derivada (subclase)
class Perro extends Animal {
    String raza;

    public Perro(String nombre, String raza) {
        super(nombre);  // Llamada al constructor de la superclase
        this.raza = raza;
    }

    @Override
    public void hablar() {
        System.out.println(this.nombre + " dice guau!");
    }
}

// Usando la herencia
public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Rex", "Labrador");
        miPerro.hablar();  // Salida: Rex dice guau!
    }
}
```

**Explicación:**

1. **Superclase (`Animal`)**: La clase `Animal` tiene un atributo `nombre` y un método `hablar`.
2. **Subclase (`Perro`)**: La clase `Perro` extiende a `Animal`, lo que significa que hereda el atributo `nombre` y el método `hablar`. En el constructor de `Perro`, usamos `super(nombre)` para llamar al constructor de la superclase y asignar el valor de `nombre`. También sobrescribimos el método `hablar` con una versión específica para `Perro`.
3. **Llamada al constructor de la superclase**: El uso de `super(nombre)` dentro del constructor de `Perro` asegura que el constructor de la superclase `Animal` se ejecute y se inicialice el atributo `nombre`.

**Resumen:**

- **Herencia** en Java permite que una clase derive de otra, heredando métodos y atributos.
- Se define con la palabra clave `extends`.
- La subclase puede sobrescribir métodos de la superclase para adaptarlos a sus necesidades, y puede acceder a los métodos y atributos públicos/protegidos de la superclase.

### ¿Por qué Java no soporta herencia múltiple directamente, y cómo se pueden usar interfaces como alternativa?

Java no soporta herencia múltiple directamente para evitar los problemas de ambigüedad y complejidad asociados a ella, como el [**problema del diamante**](https://es.linkedin.com/pulse/oop-el-problema-del-diamante-nicol%C3%A1s-cereijo-ranchal-1f). Este problema ocurre cuando una clase hereda de múltiples clases base que tienen métodos o atributos con el mismo nombre, generando conflictos sobre qué implementación debería prevalecer.

**Razones por las que Java no permite herencia múltiple directa:**

1. **Ambigüedad**: Si dos clases base tienen un método con el mismo nombre, Java no podría decidir cuál usar, lo que puede conducir a errores difíciles de manejar.
2. **Simplicidad y claridad**: Limitar la herencia a una sola clase base hace que la jerarquía de clases sea más sencilla y fácil de mantener.
3. **Compatibilidad y diseño**: Java promueve la composición y el uso de interfaces para manejar la reutilización de código y evitar problemas derivados de la herencia múltiple.

**Alternativa: Uso de interfaces**

Java permite que una clase implemente múltiples **interfaces**. Una interfaz es un contrato que define métodos que una clase debe implementar, sin proporcionar implementación (aunque desde Java 8, las interfaces pueden tener métodos predeterminados con implementación).

**Ejemplo:**

```java
// Definimos dos interfaces
interface Volador {
    void volar();  // Método abstracto
}

interface Nadador {
    void nadar();  // Método abstracto
}

// Una clase que implementa ambas interfaces
class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato está volando");
    }

    @Override
    public void nadar() {
        System.out.println("El pato está nadando");
    }
}

public class Main {
    public static void main(String[] args) {
        Pato miPato = new Pato();
        miPato.volar();  // Salida: El pato está volando
        miPato.nadar();  // Salida: El pato está nadando
    }
}
```

**Por qué usar interfaces como alternativa:**

1. **Evitan conflictos**: Las interfaces no tienen estado (atributos) y solo definen métodos abstractos (o predeterminados), eliminando problemas de ambigüedad.
2. **Flexibilidad**: Una clase puede implementar múltiples interfaces, combinando funcionalidades de diferentes fuentes.
3. **Compatibilidad**: Las interfaces permiten definir relaciones entre clases de diferentes jerarquías sin imponer una estructura rígida.

**Diferencia clave entre herencia y uso de interfaces:**

- La herencia con `extends` implica que una subclase hereda la implementación y los atributos de una superclase.
- La implementación de interfaces con `implements` obliga a la clase a proporcionar su propia implementación de los métodos definidos en la interfaz.

**Resumen:**

Java no soporta herencia múltiple para evitar ambigüedades y complejidad. Como alternativa, las **interfaces** permiten combinar comportamientos de múltiples fuentes de manera flexible y sin conflictos. Esto hace que el diseño sea más modular y limpio.

---

## 5. Sobrecarga y Polimorfismo

**Python**

### ¿Qué es la sobrecarga de funciones en Python, y cómo se puede lograr dado que el lenguaje no la soporta directamente?

En Python, **la sobrecarga de funciones** se refiere a la capacidad de definir varias funciones con el mismo nombre pero diferentes parámetros. Sin embargo, Python **no soporta sobrecarga de funciones directamente**, ya que las funciones en este lenguaje no distinguen por la cantidad o tipo de parámetros. Si se define una función con el mismo nombre más de una vez, solo la última definición será válida, sobrescribiendo las anteriores.

**Cómo lograr sobrecarga de funciones en Python**

Aunque Python no tiene soporte nativo para la sobrecarga, hay formas de imitar este comportamiento utilizando técnicas como:

1. **Parámetros por defecto**:
   Se pueden usar parámetros opcionales con valores por defecto para manejar diferentes casos dentro de una misma función.

   ```python
   def saludar(nombre, mensaje="Hola"):
       print(f"{mensaje}, {nombre}!")

   saludar("Anto")  # Salida: Hola, Anto!
   saludar("Anto", "Buen día")  # Salida: Buen día, Anto!
   ```

2. **Uso de `*args` y `**kwargs`**:
Con `\*args`(para una cantidad variable de argumentos posicionales) y`\*\*kwargs` (para argumentos con clave), una función puede aceptar múltiples configuraciones de parámetros.

   ```python
   def operar(*args):
       if len(args) == 2:
           return args[0] + args[1]  # Suma
       elif len(args) == 3:
           return args[0] * args[1] * args[2]  # Multiplicación
       else:
           return "Número de argumentos no soportado"

   print(operar(3, 4))  # Salida: 7 (Suma)
   print(operar(2, 3, 4))  # Salida: 24 (Multiplicación)
   print(operar(1))  # Salida: Número de argumentos no soportado
   ```

3. **Sobrecarga con el módulo `functools` y decoradores**:
   Usar decoradores como `singledispatch` del módulo `functools` permite definir sobrecarga basada en el tipo del primer argumento.

   ```python
   from functools import singledispatch

   @singledispatch
   def procesar(dato):
       print("Tipo no soportado")

   @procesar.register(int)
   def _(dato):
       print(f"Procesando un entero: {dato}")

   @procesar.register(str)
   def _(dato):
       print(f"Procesando una cadena: {dato}")

   procesar(10)  # Salida: Procesando un entero: 10
   procesar("Hola")  # Salida: Procesando una cadena: Hola
   procesar(3.14)  # Salida: Tipo no soportado
   ```

4. **Chequeos manuales de tipo o cantidad de parámetros**:
   Puedes implementar lógica en la función para verificar los argumentos y comportarse de forma diferente según el caso.

   ```python
   def operar(a, b=None):
       if b is None:
           return a ** 2  # Si solo hay un argumento, calcula el cuadrado
       return a + b  # Si hay dos argumentos, realiza una suma

   print(operar(3))  # Salida: 9 (Cuadrado)
   print(operar(3, 4))  # Salida: 7 (Suma)
   ```

### Explica el concepto de polimorfismo en Python con ejemplos.

El **polimorfismo** es un principio fundamental de la programación orientada a objetos que significa "muchas formas". En Python, el polimorfismo permite que el mismo método o función pueda comportarse de manera diferente según el objeto o tipo con el que se utilice. Este concepto se basa en la capacidad de diferentes clases para implementar métodos con el mismo nombre pero con comportamientos específicos.

**Tipos de polimorfismo en Python**

1. **Polimorfismo con métodos en clases derivadas**:
   Ocurre cuando diferentes clases tienen métodos con el mismo nombre, pero implementaciones diferentes. Python llama al método correspondiente según el tipo del objeto.

   ```python
   class Perro:
       def hablar(self):
           return "Guau!"

   class Gato:
       def hablar(self):
           return "Miau!"

   # Uso polimórfico
   def hacer_hablar(animal):
       print(animal.hablar())

   perro = Perro()
   gato = Gato()

   hacer_hablar(perro)  # Salida: Guau!
   hacer_hablar(gato)   # Salida: Miau!
   ```

   Aquí, el método `hablar` es polimórfico porque tiene implementaciones diferentes en `Perro` y `Gato`, pero se llama de la misma forma.

2. **Polimorfismo con funciones integradas (built-in functions)**:
   Algunas funciones integradas como `len()` o `sorted()` son polimórficas, ya que funcionan con diferentes tipos de datos.

   ```python
   print(len("Hola"))         # Salida: 4 (longitud de una cadena)
   print(len([1, 2, 3, 4]))   # Salida: 4 (longitud de una lista)
   print(len({"a": 1, "b": 2}))  # Salida: 2 (número de claves en un diccionario)
   ```

   Aunque `len()` se utiliza de la misma forma, su comportamiento varía según el tipo del objeto.

3. **Polimorfismo con herencia**:
   En una jerarquía de clases, las subclases pueden sobrescribir los métodos de la superclase, permitiendo comportamientos específicos al contexto.

   ```python
   class Animal:
       def hablar(self):
           return "El animal hace un sonido"

   class Perro(Animal):
       def hablar(self):
           return "Guau!"

   class Gato(Animal):
       def hablar(self):
           return "Miau!"

   # Uso polimórfico con herencia
   animales = [Perro(), Gato(), Animal()]

   for animal in animales:
       print(animal.hablar())
   # Salida:
   # Guau!
   # Miau!
   # El animal hace un sonido
   ```

   Aquí, el método `hablar` es polimórfico porque la llamada al método depende del tipo del objeto en tiempo de ejecución.

4. **Polimorfismo con duck typing**:
   Python aplica un enfoque conocido como **duck typing**, donde el comportamiento se basa en la presencia de métodos específicos en lugar de la clase del objeto. Es decir, "si algo camina como un pato y grazna como un pato, probablemente sea un pato".

   ```python
   class Pato:
       def volar(self):
           print("El pato está volando")

   class Avion:
       def volar(self):
           print("El avión está volando")

   # Uso polimórfico
   def hacer_volar(objeto):
       objeto.volar()

   pato = Pato()
   avion = Avion()

   hacer_volar(pato)  # Salida: El pato está volando
   hacer_volar(avion)  # Salida: El avión está volando
   ```

   Aquí, no importa si el objeto es de tipo `Pato` o `Avion`. Lo importante es que ambos tienen el método `volar`.

**Resumen**

- **Polimorfismo** en Python permite que una misma interfaz o método se utilice para diferentes tipos de datos o clases.
- Tipos clave: polimorfismo con métodos sobrescritos, funciones integradas, herencia, y duck typing.
- **Ventaja**: Facilita la reutilización y extensibilidad del código, permitiendo manejar diferentes tipos de objetos de manera uniforme.

**Java**

### ¿Qué es la sobrecarga de métodos en Java, y cómo se define?

En **Java**, la **sobrecarga de métodos** es una característica que permite definir múltiples métodos con el mismo nombre dentro de una clase, pero con diferentes listas de parámetros (cantidad, tipo o ambos). Esto proporciona flexibilidad para llamar al mismo método en diferentes contextos, dependiendo de los argumentos proporcionados.

**Cómo se define la sobrecarga de métodos**

1. **Mismo nombre de método**: Todos los métodos sobrecargados deben tener el mismo nombre.
2. **Diferentes parámetros**: Cada versión del método debe diferir en el número o tipo de parámetros.
3. **Misma clase o subclase**: La sobrecarga ocurre dentro de la misma clase o en una clase que herede de otra.
4. **No depende del tipo de retorno**: Cambiar solo el tipo de retorno no constituye una sobrecarga válida.

**Ejemplo básico de sobrecarga:**

```java
class Calculadora {
    // Método para sumar dos números enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para sumar tres números enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método para sumar dos números de punto flotante
    public double sumar(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.sumar(3, 4));         // Salida: 7
        System.out.println(calc.sumar(3, 4, 5));     // Salida: 12
        System.out.println(calc.sumar(3.5, 4.2));    // Salida: 7.7
    }
}
```

**Reglas importantes sobre la sobrecarga:**

1. **Distinción por parámetros**:

   - **Cantidad de parámetros**: Dos métodos con diferente número de parámetros pueden coexistir.
   - **Tipo de parámetros**: Métodos con el mismo número de parámetros pero de tipos diferentes también son válidos.

2. **Sobrecarga y herencia**:
   La sobrecarga no está relacionada con la herencia; ocurre dentro de la misma clase. Sin embargo, una subclase puede agregar más métodos sobrecargados.

3. **No es lo mismo que sobreescritura**:
   - **Sobrecarga**: Misma clase, diferentes parámetros.
   - **Sobreescritura**: Métodos en una subclase redefinen el comportamiento de un método en la superclase.

**Ventajas de la sobrecarga:**

1. **Claridad del código**: Facilita la legibilidad al usar un único nombre para métodos relacionados.
2. **Flexibilidad**: Permite manejar múltiples escenarios con una misma interfaz (nombre del método).
3. **Eficiencia**: Mejora la organización del código y evita duplicación de nombres.

### ¿Cómo se logra el polimorfismo en Java, y qué rol juegan las clases abstractas y las interfaces en este concepto?

El **polimorfismo** en Java permite que un mismo método o referencia de clase tenga comportamientos diferentes dependiendo del objeto asociado en tiempo de ejecución. Esto se logra a través de la **sobreescritura de métodos**, el uso de **clases abstractas** y **interfaces**.

**Tipos de polimorfismo en Java**

1. **Polimorfismo en tiempo de compilación** (también conocido como polimorfismo estático):

   - Ocurre mediante la **sobrecarga de métodos**.
   - Ejemplo: Definir múltiples métodos con el mismo nombre pero con diferentes parámetros.

2. **Polimorfismo en tiempo de ejecución** (también conocido como polimorfismo dinámico):
   - Se logra mediante la **sobreescritura de métodos** en una jerarquía de clases (herencia).
   - El método llamado se decide en tiempo de ejecución según el tipo real del objeto.

---

**Rol de las clases abstractas e interfaces en el polimorfismo**

1. **Clases abstractas**:

   - Una **clase abstracta** puede contener métodos abstractos (sin implementación) y métodos concretos (con implementación).
   - Permiten definir un comportamiento común (como métodos concretos) y dejar otros métodos para que las subclases lo implementen.
   - Se utiliza cuando las subclases comparten una relación "es-un".

   **Ejemplo con clase abstracta:**

   ```java
   abstract class Animal {
       abstract void hacerSonido();  // Método abstracto
   }

   class Perro extends Animal {
       @Override
       void hacerSonido() {
           System.out.println("Guau!");
       }
   }

   class Gato extends Animal {
       @Override
       void hacerSonido() {
           System.out.println("Miau!");
       }
   }

   public class Main {
       public static void main(String[] args) {
           Animal miAnimal;

           miAnimal = new Perro();
           miAnimal.hacerSonido();  // Salida: Guau!

           miAnimal = new Gato();
           miAnimal.hacerSonido();  // Salida: Miau!
       }
   }
   ```

   - Aquí, la referencia `miAnimal` puede apuntar a diferentes objetos (Perro o Gato) y ejecutar el método correspondiente en tiempo de ejecución.

2. **Interfaces**:

   - Las **interfaces** son contratos que definen métodos que las clases deben implementar.
   - A diferencia de las clases abstractas, una clase puede implementar múltiples interfaces, lo que permite un enfoque más flexible para lograr polimorfismo.

   **Ejemplo con interfaces:**

   ```java
   interface Volador {
       void volar();
   }

   class Pato implements Volador {
       @Override
       public void volar() {
           System.out.println("El pato vuela bajo");
       }
   }

   class Avion implements Volador {
       @Override
       public void volar() {
           System.out.println("El avión vuela alto");
       }
   }

   public class Main {
       public static void main(String[] args) {
           Volador objeto;

           objeto = new Pato();
           objeto.volar();  // Salida: El pato vuela bajo

           objeto = new Avion();
           objeto.volar();  // Salida: El avión vuela alto
       }
   }
   ```

   - Aquí, la referencia `objeto` (de tipo `Volador`) se comporta de manera diferente según el objeto que implemente la interfaz.

---

**Ventajas del polimorfismo con clases abstractas e interfaces**

1. **Flexibilidad**:

   - Permite cambiar el comportamiento de un programa sin modificar el código principal, solo cambiando el objeto asociado a una referencia.

2. **Reutilización**:

   - Facilita la reutilización del código mediante métodos generales que funcionan para cualquier tipo de objeto relacionado.

3. **Extensibilidad**:
   - Es fácil agregar nuevos tipos de clases o comportamientos sin afectar el código existente.

---

**Diferencias clave entre clases abstractas e interfaces en polimorfismo**

| Característica        | Clases Abstractas                      | Interfaces                                       |
| --------------------- | -------------------------------------- | ------------------------------------------------ |
| **Herencia múltiple** | No es posible                          | Es posible implementar múltiples                 |
| **Métodos concretos** | Puede tener métodos con implementación | Solo desde Java 8 (métodos `default` y `static`) |
| **Constructores**     | Puede tener constructores              | No puede tener constructores                     |
| **Relación**          | Representa una relación "es-un"        | Representa una relación "puede hacer"            |

---

**Resumen**

El polimorfismo en Java se logra principalmente a través de:

- **Sobreescritura de métodos** en una jerarquía de herencia.
- **Clases abstractas**, que proporcionan una plantilla común para las subclases.
- **Interfaces**, que permiten implementar múltiples comportamientos en clases no relacionadas.

---

## Ejercicios Prácticos

---

### 1. Decoradores

**Python**

1. Escribe un decorador que registre el tiempo que toma ejecutar una función.
2. Implementa un decorador que agregue un mensaje antes y después de ejecutar una función.

**Java**

1. Usa anotaciones para documentar un método como "obsoleto" (`@Deprecated`).
2. Crea una anotación personalizada para marcar métodos que necesitan ser optimizados.

---

### 2. Clases

**Python**

1. Define una clase `Persona` con atributos `nombre` y `edad`, y un método para mostrar la información.
2. Implementa un método estático que cuente la cantidad de instancias creadas de la clase.

**JavaScript**

1. Define una clase `Persona` con atributos `nombre` y `edad`, y un método para mostrar la información.
2. Implementa un método estático que cuente la cantidad de instancias creadas de la clase.

**Java**

1. Define una clase `Persona` con atributos `nombre` y `edad`, y un método para mostrar la información.
2. Implementa un método estático que cuente la cantidad de instancias creadas de la clase.

---

### 3. Clases Abstractas y Métodos Abstractos

**Python**

1. Implementa una clase abstracta `Figura` con un método abstracto `calcular_area` y crea dos clases que hereden de ella: `Cuadrado` y `Circulo`.
2. Agrega una restricción adicional en las clases derivadas para manejar casos de error.

**Java**

1. Define una clase abstracta `Empleado` con un método abstracto `calcular_sueldo` y extiéndela en clases concretas `EmpleadoFijo` y `EmpleadoTemporal`.
2. Agrega un constructor en la clase abstracta y úsalo en las clases derivadas.

---

### 4. Herencia

**Python**

1. Define una clase `Persona` y una clase derivada `Estudiante` que agregue un atributo `nota`.
2. Muestra cómo funciona la herencia múltiple combinando dos clases base en una clase hija.

**JavaScript**

1. Implementa una clase `Vehiculo` y una clase `Bicicleta` que herede de ella. Agrega métodos únicos a cada una.
2. Simula herencia múltiple usando objetos o prototipos.

**Java**

1. Define una clase `Animal` y herédala en una clase `Gato`. Sobrescribe un método en la clase hija.
2. Usa interfaces para simular herencia múltiple y combina varias interfaces en una clase.

---

### 5. Sobrecarga y Polimorfismo

**Python**

1. Implementa una función que soporte diferentes cantidades de parámetros para sumar números.
2. Crea un programa que utilice polimorfismo para calcular áreas de figuras geométricas.

**JavaScript**

1. Usa polimorfismo para que diferentes clases respondan de manera distinta al método `hablar`.

**Java**

1. Implementa la sobrecarga de métodos en una clase `Calculadora` para realizar operaciones con diferentes tipos de parámetros.
2. Usa polimorfismo en un programa que maneje diferentes tipos de empleados y calcule sus sueldos de manera específica.
