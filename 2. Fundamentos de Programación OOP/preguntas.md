### Preguntas Teóricas Integradoras

---

#### 1. Decoradores

**Python**

- ¿Qué es un decorador en Python y para qué se utiliza?
- Explica la sintaxis básica de un decorador con un ejemplo sencillo.
- Menciona y explica al menos dos decoradores comunes en Python, como `@staticmethod` o `@property`.

**JavaScript**

- ¿Cuál es el propósito de los decoradores en JavaScript, y cómo se definen según la propuesta actual?
- Explica cómo se pueden aplicar decoradores en clases o métodos de JavaScript.

**Java**

- ¿Qué son las anotaciones en Java y en qué se diferencian de los decoradores de otros lenguajes?
- Da ejemplos de anotaciones comunes en Java y explica su funcionalidad.
- Compara los decoradores de Python, las anotaciones de Java, y los decoradores propuestos en JavaScript.

---

#### 2. Clases

**Python**

- ¿Cuál es la estructura básica de una clase en Python?
- Explica las diferencias entre métodos estáticos y de clase en Python, incluyendo su sintaxis y uso.

**JavaScript**

- Describe la sintaxis básica para definir una clase en JavaScript (ES6).
- ¿Qué son los métodos estáticos en JavaScript, y cómo se usan en una clase?
- Explica cómo funciona la herencia en clases en JavaScript, incluyendo el uso de `super`.

**Java**

- ¿Qué elementos básicos componen una clase en Java?
- Describe cómo funcionan los métodos estáticos en Java.
- ¿Cómo se implementa la herencia en Java, y qué restricciones existen al heredar de una clase?

---

#### 3. Clases Abstractas y Métodos Abstractos

**Java**

- ¿Qué son las clases abstractas en Java, y para qué se utilizan?
- Explica qué es un método abstracto y cómo se define.
- ¿Por qué no se pueden instanciar clases abstractas directamente?
- Describe la relación entre interfaces y clases abstractas, señalando las diferencias clave.

**Python**

- ¿Cómo se implementan clases abstractas y métodos abstractos en Python usando el módulo `abc`?
- ¿Qué limitaciones tienen las clases abstractas en Python en comparación con Java?

**JavaScript**

- ¿Cómo se pueden simular clases y métodos abstractos en JavaScript, dado que el lenguaje no los soporta nativamente?
- Explica las ventajas y desventajas de simular clases abstractas en JavaScript.

---

#### 4. Herencia

**Python**

- Explica cómo se define la herencia básica en Python, incluyendo el uso de `super()`.
- ¿Qué es la herencia múltiple, y cuáles son sus ventajas y desventajas en Python?

**JavaScript**

- Describe la sintaxis para implementar herencia en JavaScript usando la palabra clave `extends`.
- ¿Qué desafíos presenta la herencia múltiple en JavaScript, y cómo se puede manejar?

**Java**

- ¿Qué significa herencia en Java, y cómo se define?
- ¿Por qué Java no soporta herencia múltiple directamente, y cómo se pueden usar interfaces como alternativa?

---

#### 5. Sobrecarga y Polimorfismo

**Python**

- ¿Qué es la sobrecarga de funciones en Python, y cómo se puede lograr dado que el lenguaje no la soporta directamente?
- Explica el concepto de polimorfismo en Python con ejemplos.

**JavaScript**

- ¿Cómo se implementa la sobrecarga de funciones en JavaScript, dado que el lenguaje no la soporta de forma nativa?
- Explica cómo se puede lograr polimorfismo en JavaScript utilizando herencia.

**Java**

- ¿Qué es la sobrecarga de métodos en Java, y cómo se define?
- ¿Cómo se logra el polimorfismo en Java, y qué rol juegan las clases abstractas y las interfaces en este concepto?

---

### Ejercicios Prácticos

---

#### 1. Decoradores

**Python**

1. Escribe un decorador que registre el tiempo que toma ejecutar una función.
2. Implementa un decorador que agregue un mensaje antes y después de ejecutar una función.

**JavaScript**

1. Crea un decorador que registre cada vez que un método de clase es llamado.
2. Implementa un decorador que valide los parámetros de un método (por ejemplo, asegurarse de que sean números).

**Java**

1. Usa anotaciones para documentar un método como "obsoleto" (`@Deprecated`) y explica su propósito.
2. Crea una anotación personalizada para marcar métodos que necesitan ser optimizados.

---

#### 2. Clases

**Python**

1. Define una clase `Persona` con atributos `nombre` y `edad`, y un método para mostrar la información.
2. Implementa un método estático que cuente la cantidad de instancias creadas de la clase.

**JavaScript**

1. Crea una clase `Animal` con métodos para mostrar el sonido de cada animal. Luego, crea una clase `Perro` que herede de `Animal`.
2. Implementa un método estático en una clase `MathUtils` para calcular la suma de dos números.

**Java**

1. Crea una clase `Vehiculo` con atributos básicos y herédala en una clase `Auto` que agregue atributos adicionales.
2. Implementa un método estático en una clase `Utilidades` que convierta temperaturas de Celsius a Fahrenheit.

---

#### 3. Clases Abstractas y Métodos Abstractos

**Python**

1. Implementa una clase abstracta `Figura` con un método abstracto `calcular_area` y crea dos clases que hereden de ella: `Cuadrado` y `Circulo`.
2. Agrega una restricción adicional en las clases derivadas para manejar casos de error.

**JavaScript**

1. Simula una clase abstracta `Vehiculo` con métodos abstractos `acelerar` y `frenar`. Luego, crea una clase concreta `Coche`.
2. Implementa validaciones en la clase base para asegurar que los métodos sean sobreescritos.

**Java**

1. Define una clase abstracta `Empleado` con un método abstracto `calcular_sueldo` y extiéndela en clases concretas `EmpleadoFijo` y `EmpleadoTemporal`.
2. Agrega un constructor en la clase abstracta y úsalo en las clases derivadas.

---

#### 4. Herencia

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

#### 5. Sobrecarga y Polimorfismo

**Python**

1. Implementa una función que soporte diferentes cantidades de parámetros para sumar números.
2. Crea un programa que utilice polimorfismo para calcular áreas de figuras geométricas.

**JavaScript**

1. Simula sobrecarga creando una función que se comporte diferente según el número de argumentos.
2. Usa polimorfismo para que diferentes clases respondan de manera distinta al método `hablar`.

**Java**

1. Implementa la sobrecarga de métodos en una clase `Calculadora` para realizar operaciones con diferentes tipos de parámetros.
2. Usa polimorfismo en un programa que maneje diferentes tipos de empleados y calcule sus sueldos de manera específica.
