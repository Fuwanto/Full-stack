---

## 1. Decoradores

Los decoradores son una característica poderosa en Python que te permiten modificar o extender el comportamiento de funciones, métodos o clases sin cambiarlos directamente. El `@` es simplemente la sintaxis para aplicar un decorador a una función o método.

Veamos con más detalle cómo funcionan los decoradores en Python, y también cómo se comparan con sus equivalentes o enfoques en **Java** y **JavaScript**.

------

### Python

#### Qué es un Decorador

Un **decorador** en Python es una función que toma otra función y la extiende o la modifica. Puedes usarlo para añadir funcionalidades adicionales, como logging, validación, o incluso controlar el acceso a los métodos.

#### Sintaxis Básica de un Decorador

```python
def mi_decorador(func):
    def wrapper():
        print("Antes de llamar a la función")
        func()
        print("Después de llamar a la función")
    return wrapper

@mi_decorador
def saludo():
    print("¡Hola!")

saludo()
```

**Explicación:**

- `@mi_decorador` es la forma en que se aplica un decorador a la función `saludo()`.
- El decorador `mi_decorador` toma la función `saludo` y la envuelve en la función `wrapper`, añadiendo código antes y después de su ejecución.
- El resultado de ejecutar `saludo()` será:

```bash
Antes de llamar a la función
¡Hola!
Después de llamar a la función
```

#### Decoradores Comunes en Python

- **`@staticmethod`**: Define un método estático en una clase.
- **`@classmethod`**: Define un método de clase que recibe como primer argumento `cls` en lugar de `self`.
- **`@property`**: Convierte un método en una propiedad de una clase.
- **`@abstractmethod`**: Utilizado para declarar métodos abstractos en una clase abstracta.

------

### JavaScript

En **JavaScript**, los decoradores son una característica que **actualmente está en fase de propuesta** (en el estándar ECMAScript), y no está nativamente soportada en la mayoría de los entornos de ejecución. Sin embargo, algunos frameworks como **TypeScript** y **Babel** permiten usar decoradores mediante una sintaxis similar a la de Python, pero en JavaScript puro, esta característica no está disponible aún de manera oficial.

#### Sintaxis de Decoradores en JavaScript (Propuesta)

```javascript
function miDecorador(target, key, descriptor) {
    console.log("Decorador aplicado");
    descriptor.value = function() {
        console.log("Antes de ejecutar");
        return descriptor.value.apply(this, arguments);
    };
    return descriptor;
}

class Persona {
    @miDecorador
    saludar() {
        console.log("Hola");
    }
}

const persona = new Persona();
persona.saludar();
```

**Explicación:**

- En este ejemplo, el decorador `@miDecorador` envuelve el método `saludar()` de la clase `Persona` y modifica su comportamiento.
- **`target`**, **`key`** y **`descriptor`** son argumentos que el decorador recibe. El `descriptor` contiene información sobre el método, y es el que permite modificar el comportamiento del método decorado.

Aunque los decoradores en JavaScript aún no son parte oficial del lenguaje, se pueden usar en entornos como **TypeScript**.

------

### Java

En **Java**, los decoradores no existen como una característica nativa del lenguaje. Sin embargo, se pueden lograr resultados similares mediante el uso de **anotaciones** (annotations) en Java, que funcionan de una manera algo parecida a los decoradores en Python, pero son mucho más estructuradas y requieren procesamiento adicional en tiempo de compilación o en tiempo de ejecución.

#### Anotaciones en Java

Las **anotaciones** en Java no modifican directamente el comportamiento de los métodos, pero proporcionan metadatos adicionales sobre clases, métodos o variables. Estas anotaciones se procesan mediante herramientas o bibliotecas que pueden modificar el comportamiento de un programa en función de estas etiquetas.

**Ejemplo de anotación en Java:**

```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MiAnotacion {
    String valor() default "Valor por defecto";
}

class MiClase {

    @MiAnotacion(valor = "Valor personalizado")
    public void miMetodo() {
        System.out.println("Método con anotación");
    }
}
```

**Explicación:**

- La anotación `@MiAnotacion` se aplica al método `miMetodo()`.
- La anotación se puede utilizar para proporcionar metadatos que luego pueden ser procesados, por ejemplo, mediante **reflexión** (reflection) o herramientas de procesamiento de anotaciones en Java.

**Diferencia clave:**

- A diferencia de los decoradores en Python, que modifican directamente el comportamiento de las funciones o métodos, las anotaciones en Java simplemente proporcionan metadatos que son procesados por otras herramientas.

------

### Comparación de Decoradores, Anotaciones y Similitudes en los Lenguajes

| Característica                     | **Python (Decoradores)**                                     | **JavaScript (Decoradores - Propuesta)**                     | **Java (Anotaciones)**                                       |
| ---------------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Qué hacen**                      | Modifican directamente el comportamiento de funciones/métodos. | Modifican métodos y clases, pero aún no están estandarizados. | Proporcionan metadatos que son procesados por otras herramientas. |
| **Sintaxis**                       | `@decorador` antes de la función o método.                   | `@decorador` antes de la función o método (propuesta).       | `@anotación` antes de la clase, método o variable.           |
| **Soporte nativo**                 | Totalmente soportado en Python.                              | En propuesta (no nativo en JS puro).                         | Soportado en Java (requiere procesamiento de metadatos).     |
| **Modificación de comportamiento** | Sí, modifican directamente el comportamiento.                | Sí, pero está en fase de propuesta y depende de frameworks como TypeScript. | No, solo proporcionan metadatos.                             |

------

### Conclusión

- **Python** tiene un soporte nativo para **decoradores**, los cuales permiten modificar funciones y métodos fácilmente.
- **JavaScript** no tiene soporte nativo para decoradores (en su estándar actual), pero se pueden usar mediante herramientas como **TypeScript** y **Babel**, o mediante una sintaxis similar a la de Python en su propuesta de ECMAScript.
- **Java** no tiene decoradores, pero tiene **anotaciones**, que permiten añadir metadatos a clases, métodos y variables, los cuales son procesados por herramientas externas o en tiempo de ejecución.

------

## 2. Clases 

### Python

En **Python**, una **clase** es una plantilla para crear objetos, y los objetos creados a partir de la clase son instancias de esa clase. Las clases en Python se definen usando la palabra clave `class`.

#### A. Sintaxis básica de clases

```python
class Persona:
    # Constructor de la clase
    def __init__(self, nombre, edad):
        self.nombre = nombre  # Atributo de instancia
        self.edad = edad      # Atributo de instancia

    # Método de la clase
    def saludar(self):
        print(f"Hola, mi nombre es {self.nombre} y tengo {self.edad} años.")

# Crear una instancia de la clase Persona
persona1 = Persona("Juan", 25)

# Acceder a los atributos y métodos de la instancia
print(persona1.nombre)  # Salida: Juan
persona1.saludar()      # Salida: Hola, mi nombre es Juan y tengo 25 años.
```

**Explicación:**

- `class Persona` define la clase.
- `__init__(self, nombre, edad)` es el **constructor** de la clase. Este método especial se llama automáticamente cuando se crea una nueva instancia de la clase.
- `self` se refiere a la instancia actual de la clase.
- Los atributos `nombre` y `edad` se asignan a `self`, lo que los hace atributos de la instancia.
- El método `saludar()` es un **método de instancia**, y puede acceder a los atributos de la clase.

#### B. Métodos estáticos y de clase

En Python, también podemos definir métodos **estáticos** y **de clase**. Los métodos estáticos no necesitan acceso a la instancia (`self`), y los métodos de clase acceden a la clase (`cls`) en lugar de a la instancia.

```python
class Persona:
    # Constructor de la clase
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    # Método estático
    @staticmethod
    def es_mayor_de_edad(edad):
        return edad >= 18

    # Método de clase
    @classmethod
    def crear_joven(cls, nombre):
        return cls(nombre, 18)

# Usar el método estático
print(Persona.es_mayor_de_edad(20))  # Salida: True

# Usar el método de clase
persona2 = Persona.crear_joven("Ana")
persona2.saludar()  # Salida: Hola, mi nombre es Ana y tengo 18 años.
```

**Explicación:**

- `@staticmethod` define un método que no depende de la instancia ni de la clase.
- `@classmethod` define un método que toma `cls` (la clase) como primer argumento, en lugar de `self`.

------

### JavaScript

En **JavaScript**, las clases fueron introducidas en **ES6** (ECMAScript 2015) y permiten una forma más estructurada de trabajar con objetos y la programación orientada a objetos (OOP). Las clases en JavaScript son una manera de definir objetos y sus métodos.

#### A. Sintaxis básica de clases en JavaScript (ES6)

```javascript
class Persona {
    // Constructor de la clase
    constructor(nombre, edad) {
        this.nombre = nombre;  // Atributo de instancia
        this.edad = edad;      // Atributo de instancia
    }

    // Método de la clase
    saludar() {
        console.log(`Hola, mi nombre es ${this.nombre} y tengo ${this.edad} años.`);
    }
}

// Crear una instancia de la clase Persona
let persona1 = new Persona("Juan", 25);

// Acceder a los atributos y métodos de la instancia
console.log(persona1.nombre);  // Salida: Juan
persona1.saludar();            // Salida: Hola, mi nombre es Juan y tengo 25 años.
```

**Explicación:**

- `class Persona` define la clase.
- El método `constructor(nombre, edad)` es el constructor de la clase y se ejecuta automáticamente cuando se crea una nueva instancia.
- `this` se refiere a la instancia actual de la clase, permitiendo acceder a sus atributos y métodos.

#### B. Métodos estáticos

En JavaScript, los métodos estáticos se definen utilizando la palabra clave `static`. Los métodos estáticos pertenecen a la **clase** y no a las instancias de la clase.

```javascript
class Persona {
    // Constructor de la clase
    constructor(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método de instancia
    saludar() {
        console.log(`Hola, mi nombre es ${this.nombre} y tengo ${this.edad} años.`);
    }

    // Método estático
    static esMayorDeEdad(edad) {
        return edad >= 18;
    }
}

// Crear una instancia de la clase
let persona2 = new Persona("Ana", 17);
persona2.saludar();  // Salida: Hola, mi nombre es Ana y tengo 17 años.

// Usar el método estático sin crear una instancia
console.log(Persona.esMayorDeEdad(20));  // Salida: true
```

**Explicación:**

- `static esMayorDeEdad(edad)` es un método estático. Se llama directamente desde la clase (`Persona.esMayorDeEdad`), sin necesidad de crear una instancia.

#### C. Herencia en Clases

Las clases en JavaScript también soportan la **herencia** usando la palabra clave `extends`.

```javascript
class Animal {
    constructor(nombre) {
        this.nombre = nombre;
    }

    hablar() {
        console.log(`${this.nombre} hace un sonido.`);
    }
}

class Perro extends Animal {
    constructor(nombre, raza) {
        super(nombre);  // Llama al constructor de la clase base (Animal)
        this.raza = raza;
    }

    hablar() {
        console.log(`${this.nombre} ladra.`);
    }
}

// Crear una instancia de la clase Perro
let perro = new Perro("Max", "Labrador");
perro.hablar();  // Salida: Max ladra.
```

**Explicación:**

- `Perro` hereda de `Animal` utilizando la palabra clave `extends`.
- `super(nombre)` llama al constructor de la clase `Animal` para inicializar el atributo `nombre`.
- `Perro` sobrescribe el método `hablar()` para que tenga un comportamiento específico.

------

### Clases en Java

En **Java**, las **clases** son un componente fundamental de la programación orientada a objetos (OOP). Una clase es una plantilla o modelo para crear objetos (instancias), definir sus atributos y comportamientos (métodos). En Java, una clase se define con la palabra clave `class`.

#### A. Sintaxis básica de clases en Java

```java
class Persona {
    // Atributos de la clase
    String nombre;
    int edad;

    // Constructor de la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método de la clase
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Persona
        Persona persona1 = new Persona("Juan", 25);

        // Acceder a los atributos y métodos de la instancia
        System.out.println(persona1.nombre);  // Salida: Juan
        persona1.saludar();                   // Salida: Hola, mi nombre es Juan y tengo 25 años.
    }
}
```

**Explicación:**

- `class Persona` define la clase `Persona`.
- El **constructor** `Persona(String nombre, int edad)` se llama automáticamente al crear un nuevo objeto de la clase.
- Los atributos `nombre` y `edad` están definidos dentro de la clase, y los métodos pueden acceder a estos atributos.
- El método `saludar()` muestra un mensaje utilizando los atributos de la clase.

#### B. Métodos estáticos

En Java, los **métodos estáticos** pertenecen a la clase y no a las instancias de la clase. Se definen con la palabra clave `static`.

```java
class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método estático
    public static void saludarEstatico() {
        System.out.println("Hola, soy un saludo estático.");
    }

    // Método de instancia
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}

public class Main {
    public static void main(String[] args) {
        // Llamar a un método estático sin crear una instancia
        Persona.saludarEstatico();  // Salida: Hola, soy un saludo estático.

        // Crear una instancia de Persona
        Persona persona2 = new Persona("Ana");
        persona2.saludar();  // Salida: Hola, mi nombre es Ana
    }
}
```

**Explicación:**

- `saludarEstatico()` es un **método estático**. Se puede llamar directamente desde la clase, sin necesidad de crear una instancia.
- `saludar()` es un **método de instancia**. Necesita una instancia de la clase para ser invocado.

#### C. Herencia en Clases

En **Java**, las clases pueden **heredar** de otras clases utilizando la palabra clave `extends`. La subclase hereda los atributos y métodos de la superclase.

```java
class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hablar() {
        System.out.println(nombre + " hace un sonido.");
    }
}

class Perro extends Animal {
    String raza;

    public Perro(String nombre, String raza) {
        super(nombre);  // Llama al constructor de la clase base (Animal)
        this.raza = raza;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " ladra.");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Max", "Labrador");
        perro.hablar();  // Salida: Max ladra.
    }
}
```

**Explicación:**

- `Perro` hereda de `Animal` utilizando la palabra clave `extends`.
- `super(nombre)` llama al constructor de la superclase (`Animal`), para inicializar el atributo `nombre`.
- `Perro` sobrescribe el método `hablar()` para proporcionar un comportamiento específico.

------

## 3. Clases abstractas y los métodos abstractos

### Java

En **Java**, las clases abstractas y los métodos abstractos son conceptos esenciales en la programación orientada a objetos. Se utilizan para definir clases y métodos que deben ser implementados por las subclases, pero que no pueden ser instanciados directamente.

#### A. Clases Abstractas

Una **clase abstracta** es una clase que no se puede instanciar directamente. Su propósito es ser extendida por otras clases para proporcionar una base común. Una clase abstracta puede tener métodos abstractos (sin implementación), métodos concretos (con implementación), atributos y constructores.

**Sintaxis básica de una clase abstracta:**

```java
abstract class Animal {
    String nombre;

    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto (sin implementación)
    public abstract void hacerSonido();

    // Método concreto (con implementación)
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }
}
```

**Explicación:**

- La palabra clave `abstract` antes de `class` indica que la clase es abstracta.
- La clase **Animal** tiene un método abstracto `hacerSonido()` que debe ser implementado por las subclases.
- También tiene un método concreto `dormir()`, que sí tiene implementación.

#### B. Métodos Abstractos

Un **método abstracto** es un método que no tiene cuerpo (implementación) en la clase abstracta. Las subclases **deben** proporcionar la implementación de este método.

**Sintaxis básica de un método abstracto:**

```java
abstract class Animal {
    public abstract void hacerSonido();
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}
```

**Explicación:**

- El método `hacerSonido()` en `Animal` es abstracto y no tiene implementación.
- Las clases `Perro` y `Gato` implementan el método `hacerSonido()`, proporcionando su propia versión de este comportamiento.

#### C. Instanciar Clases Abstractas

No se puede crear una instancia directa de una clase abstracta. Para usar una clase abstracta, **se debe crear una subclase** que la implemente completamente.

```java
abstract class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra.");
    }
}

public class Main {
    public static void main(String[] args) {
        // No se puede crear una instancia de Animal
        // Animal a = new Animal("Genérico"); // Error

        // Se crea una instancia de la subclase Perro
        Perro perro = new Perro("Max");
        perro.hacerSonido();  // Salida: Max ladra.
    }
}
```

**Explicación:**

- Intentar crear una instancia de la clase abstracta `Animal` resultará en error.
- Solo se pueden instanciar clases concretas que implementen todos los métodos abstractos de la clase base.

#### D. Herencia y Sobrescritura de Métodos Abstractos

Las subclases **heredan** los métodos abstractos y deben **sobrescribir** (con `@Override`) esos métodos para proporcionar una implementación concreta.

```java
abstract class Animal {
    public abstract void hacerSonido();
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        perro.hacerSonido();  // Salida: El perro ladra.

        Animal gato = new Gato();
        gato.hacerSonido();    // Salida: El gato maulla.
    }
}
```

**Explicación:**

- La clase `Perro` y la clase `Gato` sobrescriben el método `hacerSonido()` de `Animal`.
- **Polimorfismo:** Aunque se usa una referencia de tipo `Animal`, el comportamiento específico de la subclase se invoca en tiempo de ejecución.

#### E. Constructores en Clases Abstractas

Las clases abstractas pueden tener constructores, y esos constructores se pueden invocar mediante la palabra clave `super()` desde las subclases.

```java
abstract class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);  // Llama al constructor de la clase abstracta
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra.");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Max");
        perro.hacerSonido();  // Salida: Max ladra.
    }
}
```

**Explicación:**

- El constructor de la clase `Animal` es invocado usando `super(nombre)` en la subclase `Perro`.

#### F. Interfaces vs Clases Abstractas

Aunque tanto las **clases abstractas** como las **interfaces** pueden ser utilizadas para definir métodos que deben ser implementados por las subclases, existen diferencias importantes:

- **Clases abstractas:** Pueden tener tanto métodos abstractos como concretos (con implementación).
- **Interfaces:** Solo pueden tener métodos abstractos (hasta Java 8, luego se pueden tener métodos con implementación por defecto).

### Resumen de Clases y Métodos Abstractos en Java:

1. **Clases abstractas**: No pueden ser instanciadas directamente y pueden tener métodos abstractos y concretos.
2. **Métodos abstractos**: Son métodos sin implementación en la clase base que deben ser implementados por las subclases.
3. **Instanciación**: Las clases abstractas no se pueden instanciar directamente; deben ser extendidas por clases concretas.
4. **Herencia y Polimorfismo**: Las subclases heredan métodos abstractos y los sobrescriben para proporcionar una implementación específica.

------

### Python

En **Python**, las **clases abstractas** y los **métodos abstractos** se manejan a través del módulo `abc` (Abstract Base Classes). Puedes definir una clase abstracta usando el decorador `@abstractmethod`, que marcará los métodos que deben ser implementados por las subclases.

#### A. Clases Abstractas y Métodos Abstractos en Python

```python
from abc import ABC, abstractmethod

class Animal(ABC):
    def __init__(self, nombre):
        self.nombre = nombre

    @abstractmethod
    def hacer_sonido(self):
        pass

class Perro(Animal):
    def hacer_sonido(self):
        print(f"{self.nombre} ladra.")

class Gato(Animal):
    def hacer_sonido(self):
        print(f"{self.nombre} maulla.")

# Instanciamos objetos de las subclases
perro = Perro("Max")
perro.hacer_sonido()  # Salida: Max ladra.

gato = Gato("Luna")
gato.hacer_sonido()   # Salida: Luna maulla.
```

**Explicación:**

- `Animal` es una **clase abstracta**, definida como una subclase de `ABC` (Abstract Base Class).
- El método `hacer_sonido` es marcado como abstracto mediante el decorador `@abstractmethod`. Esto obliga a que las subclases implementen ese método.
- Las subclases `Perro` y `Gato` implementan el método `hacer_sonido`, y entonces se pueden instanciar.

#### B. Restricciones en Python

Al igual que en Java, no se puede crear una instancia directamente de una clase abstracta. Intentar hacerlo daría un error:

```python
animal = Animal("Genérico")  # Error: TypeError: Can't instantiate abstract class Animal with abstract method hacer_sonido
```

------

### JavaScript

En **JavaScript**, **no existe soporte nativo para clases abstractas** o métodos abstractos, como en Java o Python. Sin embargo, puedes simular este comportamiento utilizando algunas técnicas. Por ejemplo, puedes lanzar un error en los métodos para indicar que deben ser implementados en las subclases.

#### A. Simulando Clases Abstractas y Métodos Abstractos en JavaScript

```javascript
class Animal {
    constructor(nombre) {
        if (new.target === Animal) {
            throw new TypeError("No se puede instanciar una clase abstracta");
        }
        this.nombre = nombre;
    }

    // Método "abstracto"
    hacerSonido() {
        throw new Error("Método 'hacerSonido' debe ser implementado");
    }
}

class Perro extends Animal {
    hacerSonido() {
        console.log(`${this.nombre} ladra.`);
    }
}

class Gato extends Animal {
    hacerSonido() {
        console.log(`${this.nombre} maulla.`);
    }
}

let perro = new Perro("Max");
perro.hacerSonido();  // Salida: Max ladra.

let gato = new Gato("Luna");
gato.hacerSonido();  // Salida: Luna maulla.

let animal = new Animal("Genérico");  // Error: No se puede instanciar una clase abstracta
```

**Explicación:**

- **Simulación de clases abstractas**: El constructor de la clase `Animal` verifica si se está intentando instanciar directamente la clase abstracta utilizando `new.target`. Si se intenta, se lanza un error.
- **Métodos "abstractos"**: En lugar de usar un decorador como en Python o Java, lanzamos un error en el método `hacerSonido` para indicar que debe ser implementado en las subclases.
- Las subclases `Perro` y `Gato` implementan el método `hacerSonido` para que sean funcionales.

------

### Resumen Comparativo

| Característica                       | **Java**                            | **Python**                                         | **JavaScript**                                       |
| ------------------------------------ | ----------------------------------- | -------------------------------------------------- | ---------------------------------------------------- |
| **Clases abstractas**                | Se definen con `abstract class`     | Se definen con `class` + `ABC` y `@abstractmethod` | No hay soporte nativo, pero se puede simular.        |
| **Métodos abstractos**               | Se definen con `abstract`           | Se definen con `@abstractmethod`                   | Se simulan lanzando errores en los métodos.          |
| **Instanciación de clase abstracta** | No se puede instanciar directamente | No se puede instanciar directamente                | Se puede simular lanzando errores en el constructor. |
| **Sobrescritura de métodos**         | Se realiza con `@Override`          | Se realiza sobrescribiendo el método               | Se realiza sobrescribiendo el método.                |

------

### Conclusión

- En **Python**, las clases abstractas y los métodos abstractos son implementados de manera directa a través del módulo `abc`.
- En **JavaScript**, no hay soporte nativo para clases abstractas o métodos abstractos, pero se pueden simular mediante excepciones y validaciones en el código.
- En **Java**, las clases abstractas y los métodos abstractos son una característica fundamental de la programación orientada a objetos y permiten una estructura muy organizada.

------

## 4. Herencia

### Python

La **herencia** es un principio de la programación orientada a objetos (OOP) que permite que una clase derive características (métodos y atributos) de otra. La clase que hereda se llama **subclase** (o clase hija) y la clase de la que hereda es la **superclase** (o clase madre).

#### A. Sintaxis básica de herencia en Python

```python
class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

    def hablar(self):
        print(f"{self.nombre} hace un sonido.")

class Perro(Animal):  # Perro hereda de Animal
    def __init__(self, nombre, raza):
        super().__init__(nombre)  # Llamada al constructor de la clase base
        self.raza = raza

    def hablar(self):  # Sobrescribir el método hablar
        print(f"{self.nombre} ladra.")

# Crear un objeto de la clase Perro
perro = Perro("Max", "Labrador")
perro.hablar()  # Salida: Max ladra.
```

**Explicación:**

- `Perro` hereda de `Animal`.
- `super().__init__(nombre)` se usa para llamar al constructor de la superclase (`Animal`), lo que permite que `Perro` también tenga el atributo `nombre`.
- El método `hablar` se sobrescribe en la subclase `Perro`.

#### B. Herencia múltiple en Python

En Python, una clase puede heredar de más de una clase. Esto es conocido como **herencia múltiple**.

```python
class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

class Mascota:
    def __init__(self, dueño):
        self.dueño = dueño

class Perro(Animal, Mascota):
    def __init__(self, nombre, dueño, raza):
        Animal.__init__(self, nombre)
        Mascota.__init__(self, dueño)
        self.raza = raza

# Crear un objeto de la clase Perro
perro = Perro("Max", "Juan", "Labrador")
print(perro.nombre)  # Salida: Max
print(perro.dueño)   # Salida: Juan
```

En este caso, `Perro` hereda de dos clases: `Animal` y `Mascota`.

------

### JavaScript

La **herencia** en JavaScript se implementa a través de prototipos. A partir de **ES6**, también se puede utilizar la sintaxis de clases (`class`), que facilita la creación de clases y la herencia.

#### A. Sintaxis básica de herencia en JavaScript (ES6)

En JavaScript, una clase puede heredar de otra utilizando la palabra clave `extends`. Para acceder a los métodos de la clase base, se usa `super()`.

```javascript
class Animal {
    constructor(nombre) {
        this.nombre = nombre;
    }

    hablar() {
        console.log(`${this.nombre} hace un sonido.`);
    }
}

class Perro extends Animal {
    constructor(nombre, raza) {
        super(nombre);  // Llama al constructor de la clase base (Animal)
        this.raza = raza;
    }

    hablar() {
        console.log(`${this.nombre} ladra.`);
    }
}

// Crear un objeto de la clase Perro
const perro = new Perro("Max", "Labrador");
perro.hablar();  // Salida: Max ladra.
```

**Explicación:**

- La clase `Perro` hereda de `Animal` usando la palabra clave `extends`.
- El método `super(nombre)` llama al constructor de la clase `Animal` para inicializar la propiedad `nombre`.
- La clase `Perro` sobrescribe el método `hablar` para proporcionar un comportamiento específico.

#### B. Herencia múltiple en JavaScript

JavaScript no soporta **herencia múltiple** directamente como Python o C++. Sin embargo, es posible simularla utilizando mixins (composición de objetos).

**Ejemplo de herencia múltiple con mixins:**

```javascript
let Animal = {
    hablar: function() {
        console.log(`${this.nombre} hace un sonido.`);
    }
};

let Mascota = {
    cuidar: function() {
        console.log(`${this.nombre} es cuidado por su dueño.`);
    }
};

class Perro {
    constructor(nombre, raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
}

// Usar mixins para agregar métodos a Perro
Object.assign(Perro.prototype, Animal, Mascota);

const perro = new Perro("Max", "Labrador");
perro.hablar();  // Salida: Max hace un sonido.
perro.cuidar();  // Salida: Max es cuidado por su dueño.
```

En este caso, usamos `Object.assign()` para copiar los métodos de los objetos `Animal` y `Mascota` al prototipo de la clase `Perro`, logrando una forma de **herencia múltiple**.

------

### Java

En **Java**, la **herencia** es un concepto fundamental de la programación orientada a objetos. Permite que una clase **herede** atributos y métodos de otra clase. La clase que hereda se llama **subclase** (o clase hija), y la clase de la que hereda se llama **superclase** (o clase madre).

#### A. Sintaxis básica de herencia en Java

En Java, se usa la palabra clave `extends` para indicar que una clase hereda de otra. La subclase puede acceder a los métodos y atributos de la superclase, y puede sobrescribir (override) métodos según sea necesario.

```java
class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hablar() {
        System.out.println(nombre + " hace un sonido.");
    }
}

class Perro extends Animal {
    String raza;

    public Perro(String nombre, String raza) {
        super(nombre);  // Llama al constructor de la clase base (Animal)
        this.raza = raza;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " ladra.");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Max", "Labrador");
        perro.hablar();  // Salida: Max ladra.
    }
}
```

**Explicación:**

- La clase `Perro` hereda de `Animal` usando `extends`.
- `super(nombre)` llama al constructor de la clase `Animal`, inicializando el atributo `nombre`.
- La clase `Perro` sobrescribe el método `hablar` para que tenga un comportamiento específico.

#### B. Herencia múltiple en Java

Java **no soporta herencia múltiple** de clases, es decir, no se puede heredar directamente de más de una clase. Sin embargo, Java permite **herencia múltiple a través de interfaces**.

**Ejemplo de herencia múltiple mediante interfaces:**

```java
interface Animal {
    void hablar();
}

interface Mascota {
    void cuidar();
}

class Perro implements Animal, Mascota {
    String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " ladra.");
    }

    @Override
    public void cuidar() {
        System.out.println(nombre + " es cuidado por su dueño.");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Max");
        perro.hablar();  // Salida: Max ladra.
        perro.cuidar();  // Salida: Max es cuidado por su dueño.
    }
}
```

En este ejemplo:

- **Perro** implementa las interfaces `Animal` y `Mascota`, lo que simula una forma de herencia múltiple.
- `Perro` proporciona implementaciones para los métodos `hablar()` y `cuidar()` definidos en las interfaces.

---

## 5. Sobrecarga y Polimorfismo

La **sobrecarga de funciones** (o _function overloading_) es un concepto en programación que permite definir múltiples funciones con el mismo nombre, pero con diferentes listas de parámetros (ya sea por tipo o cantidad). Esto significa que una misma función puede realizar diferentes tareas dependiendo de los argumentos que se le pasen.

En otros lenguajes como C++ o Java, la sobrecarga se utiliza para que una función pueda trabajar con distintos tipos de datos o recibir diferentes números de parámetros, manteniendo la misma firma (nombre).

### Python

#### A. Sobrecarga de funciones (o métodos)

En Python, la **sobrecarga de funciones** no es soportada directamente como en otros lenguajes como Java o C++. Sin embargo, podemos simular la sobrecarga de funciones mediante el uso de argumentos opcionales o por cantidad variable de argumentos.

**Ejemplo usando parámetros opcionales**:

```python
def saludar(nombre="Mundo"):
    print(f"Hola, {nombre}!")

saludar()         # Salida: Hola, Mundo!
saludar("Juan")   # Salida: Hola, Juan!
```

En este caso, `nombre` tiene un valor por defecto de `"Mundo"`, lo que permite que la función `saludar` actúe de manera similar a si estuviera sobrecargada.

**Ejemplo usando `\*args`** (número variable de argumentos):

```python
def sumar(*args):
    return sum(args)

print(sumar(1, 2))          # Salida: 3
print(sumar(1, 2, 3, 4))    # Salida: 10
```

Aquí, `*args` permite que la función `sumar` reciba cualquier cantidad de parámetros.

#### B. Polimorfismo en Python

El **polimorfismo** es un concepto en programación orientada a objetos que permite que diferentes clases utilicen métodos con el mismo nombre, pero con comportamientos diferentes.

En Python, el polimorfismo se puede lograr a través de la herencia y el **"override"** (sobrescritura de métodos).

**Ejemplo de polimorfismo**:

```python
class Animal:
    def hablar(self):
        print("El animal hace un sonido.")

class Perro(Animal):
    def hablar(self):
        print("El perro ladra.")

class Gato(Animal):
    def hablar(self):
        print("El gato maúlla.")

def hacer_hablar(animal):
    animal.hablar()

# Uso del polimorfismo
perro = Perro()
gato = Gato()

hacer_hablar(perro)  # Salida: El perro ladra.
hacer_hablar(gato)   # Salida: El gato maúlla.
```

En este ejemplo, el método `hablar()` es sobrescrito en las clases `Perro` y `Gato`, pero el nombre del método es el mismo. La función `hacer_hablar` acepta cualquier objeto de tipo `Animal`, y dependiendo de si es un `Perro` o un `Gato`, se ejecuta la versión correcta del método.

---

### JavaScript

#### A. Sobrecarga de funciones en JavaScript

A diferencia de otros lenguajes como Java o C++, **JavaScript no soporta la sobrecarga de funciones** de manera explícita. Sin embargo, se pueden simular comportamientos similares utilizando parámetros opcionales o un número variable de argumentos.

**Ejemplo usando parámetros opcionales**:

```javascript
function saludar(nombre = "Mundo") {
  console.log(`Hola, ${nombre}!`);
}

saludar(); // Salida: Hola, Mundo!
saludar("Juan"); // Salida: Hola, Juan!
```

Aquí, `nombre` tiene un valor por defecto de `"Mundo"`, lo que simula la sobrecarga permitiendo diferentes cantidades de parámetros.

**Ejemplo usando `arguments`** (número variable de argumentos):

```javascript
function sumar() {
  let total = 0;
  for (let i = 0; i < arguments.length; i++) {
    total += arguments[i];
  }
  return total;
}

console.log(sumar(1, 2)); // Salida: 3
console.log(sumar(1, 2, 3, 4)); // Salida: 10
```

En este caso, usamos el objeto especial `arguments` para acceder a un número variable de argumentos.

#### B. Polimorfismo en JavaScript

El **polimorfismo** en JavaScript se refiere a la capacidad de usar una misma interfaz (nombre de función) en diferentes clases o contextos. Esto se logra mediante la **herencia** y **sobrescritura de métodos**.

**Ejemplo de polimorfismo**:

```javascript
class Animal {
  hablar() {
    console.log("El animal hace un sonido.");
  }
}

class Perro extends Animal {
  hablar() {
    console.log("El perro ladra.");
  }
}

class Gato extends Animal {
  hablar() {
    console.log("El gato maúlla.");
  }
}

function hacerHablar(animal) {
  animal.hablar();
}

let perro = new Perro();
let gato = new Gato();

hacerHablar(perro); // Salida: El perro ladra.
hacerHablar(gato); // Salida: El gato maúlla.
```

En este caso, las clases `Perro` y `Gato` sobrescriben el método `hablar()` de la clase `Animal`. Cuando llamamos a `hacerHablar(animal)`, se ejecuta la versión adecuada del método dependiendo del tipo de objeto (`Perro` o `Gato`).

---

### Java

#### A. Sobrecarga de funciones (métodos)

En **Java**, la sobrecarga de métodos es un concepto que permite tener múltiples métodos con el mismo nombre, pero con diferentes parámetros (número de parámetros, tipo de parámetros, o ambos). Java se encarga de seleccionar el método adecuado en función de la firma del método (es decir, el nombre y los parámetros).

**Ejemplo de sobrecarga de métodos:**

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(sumar(2, 3));        // Salida: 5
        System.out.println(sumar(2, 3, 4));     // Salida: 9
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
```

En este ejemplo, el método `sumar` está sobrecargado, ya que existe una versión con dos parámetros (`int a, int b`) y otra con tres parámetros (`int a, int b, int c`). Java elige cuál usar en función de la cantidad de argumentos al llamar al método.

#### B. Polimorfismo en Java

El **polimorfismo** en Java se refiere a la capacidad de una clase de usar métodos con el mismo nombre pero con comportamientos diferentes. Hay dos tipos principales de polimorfismo en Java:

1. **Polimorfismo de sobrecarga**: cuando un método está sobrecargado con diferentes firmas (como vimos en el ejemplo anterior).
2. **Polimorfismo de herencia**: cuando una clase hija sobrescribe un método de la clase padre.

**Ejemplo de polimorfismo de herencia:**

```java
class Animal {
    public void hablar() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    @Override
    public void hablar() {
        System.out.println("El perro ladra.");
    }
}

class Gato extends Animal {
    @Override
    public void hablar() {
        System.out.println("El gato maúlla.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();

        animal1.hablar();  // Salida: El perro ladra.
        animal2.hablar();  // Salida: El gato maúlla.
    }
}
```

En este ejemplo, el método `hablar()` es sobrescrito en las clases `Perro` y `Gato`. El tipo de objeto (`Perro` o `Gato`) determina qué versión del método `hablar()` se ejecutará, incluso si ambos objetos son referenciados como `Animal`. Esto es un ejemplo de **polimorfismo de herencia**.
