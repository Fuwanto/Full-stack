# Patrones básicos de diseño de software

## 1. Principios SOLID

Perfecto, empecemos con el primer tema: **Principios SOLID**. Estos principios son fundamentales para escribir código limpio y mantenible. SOLID es un acrónimo que representa cinco principios de diseño orientado a objetos:

1. **S - Single Responsibility Principle (SRP)**: Un objeto debe tener una única razón para cambiar, es decir, debe tener una única responsabilidad.
2. **O - Open/Closed Principle (OCP)**: El software debe estar abierto para su extensión, pero cerrado para su modificación. Esto implica que deberíamos poder agregar nuevas funcionalidades sin modificar el código existente.
3. **L - Liskov Substitution Principle (LSP)**: Los objetos de una clase derivada deben poder sustituir a los objetos de la clase base sin alterar el comportamiento del programa.
4. **I - Interface Segregation Principle (ISP)**: Es mejor tener muchas interfaces específicas en lugar de una única interfaz general. Esto ayuda a que las clases implementen solo los métodos que realmente necesitan.
5. **D - Dependency Inversion Principle (DIP)**: Las clases deben depender de abstracciones (interfaces o clases abstractas), no de clases concretas. Esto promueve el desacoplamiento entre las clases.

### Python

### 1. Responsibility Principle (SRP)

Imagina que tienes una clase que maneja tanto la lógica de usuario como la lógica de persistencia (guardar y leer datos).

#### Mal diseño (violando SRP):

```python
class UserService:
    def __init__(self, user):
        self.user = user

    def save_user(self):
        # Guardamos al usuario en una base de datos
        print(f"Saving user {self.user}")

    def send_welcome_email(self):
        # Lógica para enviar un email de bienvenida
        print(f"Sending welcome email to {self.user}")

# Uso
user_service = UserService("Alice")
user_service.save_user()
user_service.send_welcome_email()
```

Aquí, la clase `UserService` está haciendo dos cosas: manejar la persistencia (guardar al usuario) y enviar un correo electrónico. Esto va contra el SRP.

#### Buen diseño (siguiendo SRP):

```python
class UserPersistence:
    def save_user(self, user):
        # Guardamos al usuario en una base de datos
        print(f"Saving user {user}")

class EmailService:
    def send_welcome_email(self, user):
        # Lógica para enviar un email de bienvenida
        print(f"Sending welcome email to {user}")

class UserService:
    def __init__(self, user, user_persistence, email_service):
        self.user = user
        self.user_persistence = user_persistence
        self.email_service = email_service

    def process_user(self):
        self.user_persistence.save_user(self.user)
        self.email_service.send_welcome_email(self.user)

# Uso
user_persistence = UserPersistence()
email_service = EmailService()
user_service = UserService("Alice", user_persistence, email_service)
user_service.process_user()
```

Ahora, cada clase tiene una única responsabilidad, y puedes modificar una sin afectar la otra. Esto hace que el código sea más fácil de mantener.

### 2. Open/Closed Principle (OCP)

El principio **Open/Closed** establece que las clases deben estar abiertas para su extensión, pero cerradas para su modificación. Esto significa que deberíamos poder agregar nuevas funcionalidades sin cambiar el código existente.

#### Mal diseño (violando OCP):

Imagina que tienes una clase `Shape` que tiene diferentes tipos de figuras y un método para calcular el área. Si agregamos nuevas figuras, tendremos que modificar la clase base.

```python
class Shape:
    def area(self):
        raise NotImplementedError("Subclasses should implement this!")

class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 3.14 * self.radius * self.radius

# Ahora, si queremos agregar otro tipo de figura, modificamos la clase Shape.
```

#### Buen diseño (siguiendo OCP):

En lugar de modificar la clase base, podemos usar un sistema que permita agregar nuevas figuras sin cambiar la clase `Shape`.

```python
from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def area(self):
        pass

class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 3.14 * self.radius * self.radius

# Ahora podemos agregar más figuras sin modificar el código existente.
class Triangle(Shape):
    def __init__(self, base, height):
        self.base = base
        self.height = height

    def area(self):
        return 0.5 * self.base * self.height

def calculate_area(shape: Shape):
    return shape.area()

# Uso
shapes = [Rectangle(2, 3), Circle(5), Triangle(3, 4)]
for shape in shapes:
    print(f"Area: {calculate_area(shape)}")
```

En este diseño, puedes agregar nuevas figuras (como el triángulo) sin modificar las clases existentes. Solo necesitas extender la clase `Shape` y agregar el método `area`.

### 3. Liskov Substitution Principle (LSP)

El principio **Liskov Substitution** establece que las clases derivadas deben ser sustituibles por sus clases base sin alterar el comportamiento del programa.

#### Mal diseño (violando LSP):

Imagina que tienes una clase base `Bird` y una subclase `Penguin` que sobrecarga un método de vuelo. Esto puede causar problemas al reemplazar un `Bird` con un `Penguin`.

```python
class Bird:
    def fly(self):
        print("Flying")

class Penguin(Bird):
    def fly(self):
        raise Exception("Penguins can't fly!")

# Uso
def make_bird_fly(bird: Bird):
    bird.fly()

bird = Bird()
penguin = Penguin()

make_bird_fly(bird)  # Funciona bien
make_bird_fly(penguin)  # Rompe el principio LSP
```

El código falla cuando tratamos de volar un `Penguin`, ya que no puede volar. En este caso, `Penguin` no cumple con las expectativas de la clase base `Bird`.

#### Buen diseño (siguiendo LSP):

Para seguir LSP, podemos crear una interfaz más específica para el comportamiento de vuelo.

```python
from abc import ABC, abstractmethod

class Bird(ABC):
    @abstractmethod
    def move(self):
        pass

class FlyingBird(Bird):
    @abstractmethod
    def fly(self):
        pass

class Penguin(Bird):
    def move(self):
        print("Penguin swims!")

class Sparrow(FlyingBird):
    def move(self):
        print("Sparrow hops!")

    def fly(self):
        print("Sparrow flies!")

# Uso
def make_bird_move(bird: Bird):
    bird.move()

def make_flying_bird_fly(bird: FlyingBird):
    bird.fly()

sparrow = Sparrow()
penguin = Penguin()

make_bird_move(sparrow)  # "Sparrow hops!"
make_bird_move(penguin)  # "Penguin swims!"
make_flying_bird_fly(sparrow)  # "Sparrow flies!"
# make_flying_bird_fly(penguin)  # Esto generaría un error
```

Aquí, `Penguin` no necesita implementar el método `fly`, ya que no lo hace, y `Sparrow` sí lo implementa como se espera.

### 4. Interface Segregation Principle (ISP)

El principio **Interface Segregation** sugiere que no debes forzar a una clase a implementar métodos que no usa. Es mejor tener varias interfaces pequeñas y específicas en lugar de una interfaz grande y genérica.

#### Mal diseño (violando ISP):

```python
class Worker:
    def work(self):
        raise NotImplementedError("Subclasses should implement this!")

    def eat(self):
        print("Eating...")

class Robot(Worker):
    def work(self):
        print("Working...")

    def eat(self):
        raise Exception("Robots don't eat!")  # Esto no tiene sentido para un robot

# Uso
robot = Robot()
robot.work()
robot.eat()  # Esto da error
```

#### Buen diseño (siguiendo ISP):

Podemos separar las interfaces para que `Robot` no tenga que implementar el método `eat`.

```python
class Workable:
    def work(self):
        raise NotImplementedError("Subclasses should implement this!")

class Eatable:
    def eat(self):
        print("Eating...")

class Robot(Workable):
    def work(self):
        print("Working...")

class Human(Workable, Eatable):
    def work(self):
        print("Working...")

    def eat(self):
        print("Eating...")

# Uso
robot = Robot()
human = Human()
human.work()
human.eat()
```

De esta forma, las clases implementan solo lo que necesitan.

### 5. Dependency Inversion Principle (DIP)

El principio **Dependency Inversion** establece que las clases deben depender de abstracciones (interfaces o clases abstractas), no de clases concretas.

#### Mal diseño (violando DIP):

```python
class LightBulb:
    def turn_on(self):
        print("Lightbulb is on")

    def turn_off(self):
        print("Lightbulb is off")

class Switch:
    def __init__(self, bulb):
        self.bulb = bulb

    def operate(self):
        self.bulb.turn_on()

# Uso
bulb = LightBulb()
switch = Switch(bulb)
switch.operate()
```

Aquí, `Switch` depende directamente de `LightBulb`, lo que hace que el código sea difícil de modificar si se desea cambiar el tipo de bombilla.

#### Buen diseño (siguiendo DIP):

```python
from abc import ABC, abstractmethod

class Switchable(ABC):
    @abstractmethod
    def turn_on(self):
        pass

    @abstractmethod
    def turn_off(self):
        pass

class LightBulb(Switchable):
    def turn_on(self):
        print("Lightbulb is on")

    def turn_off(self):
        print("Lightbulb is off")

class Fan(Switchable):
    def turn_on(self):
        print("Fan is on")

    def turn_off(self):
        print("Fan is off")

class Switch:
    def __init__(self, device: Switchable):
        self.device = device

    def operate(self):
        self.device.turn_on()

# Uso
bulb = LightBulb()
fan = Fan()

switch1 = Switch(bulb)
switch1.operate()

switch2 = Switch(fan)
switch2.operate()
```

Ahora `Switch` depende de la abstracción `Switchable`, por lo que podemos cambiar fácilmente el dispositivo sin modificar la clase `Switch`.

---

### JavaScript

### 1. Single Responsibility Principle (SRP)

En JavaScript, el principio de **Single Responsibility** sigue siendo el mismo: cada clase o módulo debe tener una única razón para cambiar.

#### Mal diseño (violando SRP):

```javascript
class UserService {
  constructor(user) {
    this.user = user;
  }

  saveUser() {
    console.log(`Saving user ${this.user}`);
  }

  sendWelcomeEmail() {
    console.log(`Sending welcome email to ${this.user}`);
  }
}

// Uso
const userService = new UserService("Alice");
userService.saveUser();
userService.sendWelcomeEmail();
```

Aquí, `UserService` está manejando tanto la persistencia como el envío del correo electrónico, lo que viola el SRP.

#### Buen diseño (siguiendo SRP):

```javascript
class UserPersistence {
  saveUser(user) {
    console.log(`Saving user ${user}`);
  }
}

class EmailService {
  sendWelcomeEmail(user) {
    console.log(`Sending welcome email to ${user}`);
  }
}

class UserService {
  constructor(user, userPersistence, emailService) {
    this.user = user;
    this.userPersistence = userPersistence;
    this.emailService = emailService;
  }

  processUser() {
    this.userPersistence.saveUser(this.user);
    this.emailService.sendWelcomeEmail(this.user);
  }
}

// Uso
const userPersistence = new UserPersistence();
const emailService = new EmailService();
const userService = new UserService("Alice", userPersistence, emailService);
userService.processUser();
```

Cada clase tiene ahora una única responsabilidad: `UserPersistence` maneja la persistencia de datos y `EmailService` el envío de correos electrónicos.

---

### 2. Open/Closed Principle (OCP)

El principio **Open/Closed** se mantiene consistente: las clases deben estar abiertas a la extensión pero cerradas a la modificación. Esto se puede lograr utilizando la herencia o la composición.

#### Mal diseño (violando OCP):

```javascript
class Shape {
  area() {
    throw new Error("This method should be overridden!");
  }
}

class Rectangle extends Shape {
  constructor(width, height) {
    super();
    this.width = width;
    this.height = height;
  }

  area() {
    return this.width * this.height;
  }
}

class Circle extends Shape {
  constructor(radius) {
    super();
    this.radius = radius;
  }

  area() {
    return Math.PI * Math.pow(this.radius, 2);
  }
}

class AreaCalculator {
  calculateArea(shape) {
    if (shape instanceof Rectangle) {
      return shape.area();
    }
    if (shape instanceof Circle) {
      return shape.area();
    }
    throw new Error("Unknown shape type");
  }
}

// Uso
const shapes = [new Rectangle(2, 3), new Circle(5)];
const calculator = new AreaCalculator();
shapes.forEach((shape) => {
  console.log(calculator.calculateArea(shape));
});
```

Cada vez que agregamos una nueva forma, tenemos que modificar la clase `AreaCalculator`. Esto viola el principio OCP.

#### Buen diseño (siguiendo OCP):

```javascript
class Shape {
  area() {
    throw new Error("This method should be overridden!");
  }
}

class Rectangle extends Shape {
  constructor(width, height) {
    super();
    this.width = width;
    this.height = height;
  }

  area() {
    return this.width * this.height;
  }
}

class Circle extends Shape {
  constructor(radius) {
    super();
    this.radius = radius;
  }

  area() {
    return Math.PI * Math.pow(this.radius, 2);
  }
}

class AreaCalculator {
  calculateArea(shape) {
    return shape.area();
  }
}

// Uso
const shapes = [new Rectangle(2, 3), new Circle(5)];
const calculator = new AreaCalculator();
shapes.forEach((shape) => {
  console.log(calculator.calculateArea(shape));
});
```

Ahora, si agregamos nuevas formas, no necesitamos modificar la clase `AreaCalculator`, solo extendemos `Shape` y agregamos la implementación de `area`.

---

### 3. Liskov Substitution Principle (LSP)

El principio **Liskov Substitution** indica que las clases derivadas deben poder reemplazar a la clase base sin cambiar el comportamiento esperado.

#### Mal diseño (violando LSP):

```javascript
class Bird {
  fly() {
    console.log("Flying");
  }
}

class Penguin extends Bird {
  fly() {
    throw new Error("Penguins can't fly!");
  }
}

// Uso
const birds = [new Bird(), new Penguin()];
birds.forEach((bird) => {
  bird.fly();
});
```

El código falla cuando tratamos de volar un `Penguin`, lo cual viola el Liskov Substitution Principle.

#### Buen diseño (siguiendo LSP):

```javascript
class Bird {
  move() {
    throw new Error("This method should be overridden!");
  }
}

class FlyingBird extends Bird {
  move() {
    console.log("Flying");
  }
}

class Penguin extends Bird {
  move() {
    console.log("Swimming");
  }
}

class Sparrow extends FlyingBird {
  move() {
    console.log("Flying");
  }
}

// Uso
const birds = [new Penguin(), new Sparrow()];
birds.forEach((bird) => {
  bird.move(); // Funciona correctamente
});
```

Ahora, cada clase tiene el comportamiento esperado, y no hay excepciones cuando tratamos de mover un `Penguin` o un `Sparrow`.

---

### 4. Interface Segregation Principle (ISP)

El principio **Interface Segregation** recomienda que las interfaces deben ser específicas, no obligando a una clase a implementar métodos que no necesita.

#### Mal diseño (violando ISP):

```javascript
class Worker {
  work() {
    console.log("Working...");
  }

  eat() {
    console.log("Eating...");
  }
}

class Robot extends Worker {
  work() {
    console.log("Working...");
  }

  eat() {
    throw new Error("Robots don't eat!"); // Esto no tiene sentido
  }
}

// Uso
const robot = new Robot();
robot.work();
robot.eat(); // Error
```

El `Robot` no debería tener que implementar el método `eat`, lo que viola el principio ISP.

#### Buen diseño (siguiendo ISP):

```javascript
class Workable {
  work() {
    throw new Error("This method should be overridden!");
  }
}

class Eatable {
  eat() {
    throw new Error("This method should be overridden!");
  }
}

class Robot extends Workable {
  work() {
    console.log("Working...");
  }
}

class Human extends Workable {
  eat() {
    console.log("Eating...");
  }

  work() {
    console.log("Working...");
  }
}

// Uso
const human = new Human();
human.work();
human.eat();
```

En este diseño, `Robot` implementa solo lo que necesita (`work`), y `Human` puede implementar tanto `work` como `eat`.

---

### 5. Dependency Inversion Principle (DIP)

El principio **Dependency Inversion** establece que las clases deben depender de abstracciones, no de implementaciones concretas.

#### Mal diseño (violando DIP):

```javascript
class LightBulb {
  turnOn() {
    console.log("Lightbulb is on");
  }

  turnOff() {
    console.log("Lightbulb is off");
  }
}

class Switch {
  constructor(bulb) {
    this.bulb = bulb;
  }

  operate() {
    this.bulb.turnOn();
  }
}

// Uso
const bulb = new LightBulb();
const switchControl = new Switch(bulb);
switchControl.operate();
```

Aquí, `Switch` depende directamente de `LightBulb`, lo que hace que el código sea rígido.

#### Buen diseño (siguiendo DIP):

```javascript
class Switchable {
  turnOn() {
    throw new Error("This method should be overridden!");
  }

  turnOff() {
    throw new Error("This method should be overridden!");
  }
}

class LightBulb extends Switchable {
  turnOn() {
    console.log("Lightbulb is on");
  }

  turnOff() {
    console.log("Lightbulb is off");
  }
}

class Fan extends Switchable {
  turnOn() {
    console.log("Fan is on");
  }

  turnOff() {
    console.log("Fan is off");
  }
}

class Switch {
  constructor(device) {
    this.device = device;
  }

  operate() {
    this.device.turnOn();
  }
}

// Uso
const bulb = new LightBulb();
const fan = new Fan();

const switch1 = new Switch(bulb);
switch1.operate();

const switch2 = new Switch(fan);
switch2.operate();
```

Ahora, `Switch` depende de la abstracción `Switchable`, lo que facilita cambiar el dispositivo sin modificar la clase `Switch`.

---

### Java

### 1. Single Responsibility Principle (SRP)

En Java, el principio de **Single Responsibility** también sugiere que cada clase debe tener una única razón para cambiar.

#### Mal diseño (violando SRP):

```java
class UserService {
    private String user;

    public UserService(String user) {
        this.user = user;
    }

    public void saveUser() {
        System.out.println("Saving user " + this.user);
    }

    public void sendWelcomeEmail() {
        System.out.println("Sending welcome email to " + this.user);
    }
}

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService("Alice");
        userService.saveUser();
        userService.sendWelcomeEmail();
    }
}
```

Aquí, `UserService` maneja tanto la persistencia como el envío de correos electrónicos, lo cual viola el SRP.

#### Buen diseño (siguiendo SRP):

```java
class UserPersistence {
    public void saveUser(String user) {
        System.out.println("Saving user " + user);
    }
}

class EmailService {
    public void sendWelcomeEmail(String user) {
        System.out.println("Sending welcome email to " + user);
    }
}

class UserService {
    private String user;
    private UserPersistence userPersistence;
    private EmailService emailService;

    public UserService(String user, UserPersistence userPersistence, EmailService emailService) {
        this.user = user;
        this.userPersistence = userPersistence;
        this.emailService = emailService;
    }

    public void processUser() {
        userPersistence.saveUser(user);
        emailService.sendWelcomeEmail(user);
    }
}

public class Main {
    public static void main(String[] args) {
        UserPersistence userPersistence = new UserPersistence();
        EmailService emailService = new EmailService();
        UserService userService = new UserService("Alice", userPersistence, emailService);
        userService.processUser();
    }
}
```

Aquí, hemos separado las responsabilidades: `UserPersistence` maneja la persistencia de datos y `EmailService` el envío de correos electrónicos.

---

### 2. Open/Closed Principle (OCP)

El principio **Open/Closed** establece que las clases deben estar abiertas para su extensión, pero cerradas para su modificación.

#### Mal diseño (violando OCP):

```java
abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        if (shape instanceof Rectangle) {
            return shape.area();
        }
        if (shape instanceof Circle) {
            return shape.area();
        }
        throw new IllegalArgumentException("Unknown shape");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(5);
        AreaCalculator calculator = new AreaCalculator();
        System.out.println(calculator.calculateArea(rectangle));
        System.out.println(calculator.calculateArea(circle));
    }
}
```

Cada vez que agregamos una nueva forma, necesitamos modificar la clase `AreaCalculator`, lo que viola el principio OCP.

#### Buen diseño (siguiendo OCP):

```java
abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.area();
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(5);
        AreaCalculator calculator = new AreaCalculator();
        System.out.println(calculator.calculateArea(rectangle));
        System.out.println(calculator.calculateArea(circle));
    }
}
```

Ahora, si agregamos una nueva forma, no necesitamos modificar la clase `AreaCalculator`, solo extendemos `Shape` y agregamos la implementación del método `area`.

---

### 3. Liskov Substitution Principle (LSP)

El principio **Liskov Substitution** establece que las clases derivadas deben poder sustituir a la clase base sin cambiar el comportamiento esperado.

#### Mal diseño (violando LSP):

```java
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird penguin = new Penguin();
        bird.fly();  // Funciona
        penguin.fly();  // Excepción
    }
}
```

Este diseño falla cuando tratamos de hacer volar un `Penguin`, lo que viola el principio LSP.

#### Buen diseño (siguiendo LSP):

```java
abstract class Bird {
    public abstract void move();
}

class FlyingBird extends Bird {
    @Override
    public void move() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Swimming");
    }
}

class Sparrow extends FlyingBird {
    @Override
    public void move() {
        System.out.println("Flying");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        Bird sparrow = new Sparrow();
        penguin.move();  // Swimming
        sparrow.move();  // Flying
    }
}
```

Ahora, cada clase tiene su propio comportamiento y no se rompen las expectativas al sustituir un objeto de tipo `Bird`.

---

### 4. Interface Segregation Principle (ISP)

El principio **Interface Segregation** recomienda que las interfaces sean específicas, de modo que las clases no se vean obligadas a implementar métodos que no necesiten.

#### Mal diseño (violando ISP):

```java
interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}

class Human implements Worker {
    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
}

public class Main {
    public static void main(String[] args) {
        Worker robot = new Robot();
        Worker human = new Human();
        robot.work();
        robot.eat();  // Excepción
        human.work();
        human.eat();
    }
}
```

El `Robot` no necesita implementar el método `eat`, lo que viola el principio ISP.

#### Buen diseño (siguiendo ISP):

```java
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Working...");
    }
}

class Human implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
}

public class Main {
    public static void main(String[] args) {
        Workable robot = new Robot();
        Workable human = new Human();
        robot.work();
        ((Eatable) human).eat();  // Casting necesario para llamar a eat
    }
}
```

Ahora, cada clase implementa solo lo que necesita: `Robot` solo implementa `Workable`, mientras que `Human` implementa tanto `Workable` como `Eatable`.

---

### 5. Dependency Inversion Principle (DIP)

El principio **Dependency Inversion** establece que las clases deben depender de abstracciones, no de implementaciones concretas.

#### Mal diseño (violando DIP):

```java
class LightBulb {
    public void turnOn() {
        System.out.println("Lightbulb is on");
    }

    public void turnOff() {
        System.out.println("Lightbulb is off");
    }
}

class Switch {
    private LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void operate() {
        bulb.turnOn();
    }
}

public class Main {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        Switch switchControl = new Switch(bulb);
        switchControl.operate();
    }
}
```

Aquí, `Switch` depende directamente de `LightBulb`, lo que hace que el código sea rígido.

#### Buen diseño

```java
interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Lightbulb is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lightbulb is off");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is off");
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}

public class Main {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb();
        Switchable fan = new Fan();
        Switch switch1 = new Switch(bulb);
        Switch switch2 = new Switch(fan);
        switch1.operate();
        switch2.operate();
    }
}
```

En este caso, `Switch` depende de la abstracción `Switchable`, lo que permite sustituir el dispositivo sin cambiar la clase `Switch`.

---

## 2. Modelo-Vista-Controlador (MVC)

El patrón MVC es una forma de estructurar aplicaciones, separando la lógica de negocio, la interfaz de usuario y la entrada del usuario. Esto facilita el mantenimiento y la escalabilidad de las aplicaciones.

- **Modelo**: Representa los datos y la lógica de negocio. No sabe nada sobre la interfaz de usuario.
- **Vista**: Es la interfaz de usuario. Se encarga de mostrar los datos y la información visual que el usuario necesita.
- **Controlador**: Actúa como un intermediario entre el Modelo y la Vista. Recibe la entrada del usuario desde la Vista y actualiza el Modelo, o viceversa.

### Separación de responsabilidades

La **separación de responsabilidades** es el principio clave del MVC. Cada componente tiene una responsabilidad bien definida:

- **Modelo**: Solo maneja los datos y las reglas de negocio.
- **Vista**: Se ocupa exclusivamente de la interfaz de usuario, sin conocer la lógica de los datos.
- **Controlador**: Gestiona la interacción entre la Vista y el Modelo.

### Python

Supongamos que estás creando una aplicación simple para gestionar una lista de tareas. Vamos a implementar un ejemplo básico de MVC en Python.

#### Modelo

En el modelo, guardamos las tareas y las operaciones básicas que se pueden hacer con ellas (como agregar una tarea).

```python
class TaskModel:
    def __init__(self):
        self.tasks = []

    def add_task(self, task):
        self.tasks.append(task)

    def get_tasks(self):
        return self.tasks
```

#### Vista

La vista es responsable de mostrar las tareas y de recibir la entrada del usuario.

```python
class TaskView:
    def display_tasks(self, tasks):
        if not tasks:
            print("No tasks available.")
        else:
            for idx, task in enumerate(tasks, 1):
                print(f"{idx}. {task}")

    def get_task_input(self):
        return input("Enter a new task: ")
```

#### Controlador

El controlador se encarga de recibir la entrada de la vista y actualizar el modelo.

```python
class TaskController:
    def __init__(self, model, view):
        self.model = model
        self.view = view

    def add_task(self):
        task = self.view.get_task_input()
        self.model.add_task(task)

    def show_tasks(self):
        tasks = self.model.get_tasks()
        self.view.display_tasks(tasks)
```

#### Aplicación

Finalmente, se conecta todo:

```python
def main():
    model = TaskModel()
    view = TaskView()
    controller = TaskController(model, view)

    while True:
        print("\n1. Show Tasks")
        print("2. Add Task")
        print("3. Exit")
        choice = input("Choose an option: ")

        if choice == '1':
            controller.show_tasks()
        elif choice == '2':
            controller.add_task()
        elif choice == '3':
            break
        else:
            print("Invalid option. Please try again.")

if __name__ == "__main__":
    main()
```

En este ejemplo, la **separación de responsabilidades** es clara:

- El **modelo** (`TaskModel`) maneja las tareas.
- La **vista** (`TaskView`) muestra las tareas y recibe la entrada del usuario.
- El **controlador** (`TaskController`) gestiona las interacciones entre el modelo y la vista.

---

### JavaScript

Vamos a implementar el patrón Modelo-Vista-Controlador (MVC) en **JavaScript** para el mismo ejemplo de la lista de tareas.

### Modelo

El **Modelo** en JavaScript se encargará de almacenar las tareas y proporcionar métodos para agregar tareas y obtenerlas.

```javascript
class TaskModel {
  constructor() {
    this.tasks = [];
  }

  addTask(task) {
    this.tasks.push(task);
  }

  getTasks() {
    return this.tasks;
  }
}
```

### Vista

La **Vista** mostrará las tareas al usuario y proporcionará una forma de ingresar nuevas tareas. Usaremos `console.log` para la salida, y `prompt` para la entrada.

```javascript
class TaskView {
  displayTasks(tasks) {
    if (tasks.length === 0) {
      console.log("No tasks available.");
    } else {
      tasks.forEach((task, index) => {
        console.log(`${index + 1}. ${task}`);
      });
    }
  }

  getTaskInput() {
    return prompt("Enter a new task:");
  }
}
```

### Controlador

El **Controlador** gestionará la interacción entre el Modelo y la Vista. Recibirá la entrada del usuario desde la Vista y actualizará el Modelo, o viceversa.

```javascript
class TaskController {
  constructor(model, view) {
    this.model = model;
    this.view = view;
  }

  addTask() {
    const task = this.view.getTaskInput();
    this.model.addTask(task);
  }

  showTasks() {
    const tasks = this.model.getTasks();
    this.view.displayTasks(tasks);
  }
}
```

### Aplicación

En la aplicación principal, vamos a gestionar las interacciones con el usuario y el ciclo de vida de la aplicación.

```javascript
function main() {
  const model = new TaskModel();
  const view = new TaskView();
  const controller = new TaskController(model, view);

  let running = true;
  while (running) {
    console.log("\n1. Show Tasks");
    console.log("2. Add Task");
    console.log("3. Exit");
    const choice = prompt("Choose an option:");

    if (choice === "1") {
      controller.showTasks();
    } else if (choice === "2") {
      controller.addTask();
    } else if (choice === "3") {
      running = false;
    } else {
      console.log("Invalid option. Please try again.");
    }
  }
}

main();
```

### Explicación:

- **Modelo (`TaskModel`)**: Almacena las tareas en un arreglo `tasks` y tiene métodos para agregar y obtener tareas.
- **Vista (`TaskView`)**: Muestra las tareas y pide la entrada del usuario para agregar una nueva tarea mediante `prompt`.
- **Controlador (`TaskController`)**: Recibe la entrada del usuario desde la Vista y actualiza el Modelo en consecuencia. Luego, se asegura de que la Vista se actualice con las tareas más recientes.

---

### Java

### Modelo

El **Modelo** en Java manejará las tareas y tendrá métodos para agregar tareas y obtenerlas.

```java
import java.util.ArrayList;
import java.util.List;

class TaskModel {
    private List<String> tasks;

    public TaskModel() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
```

### Vista

La **Vista** en Java será responsable de mostrar las tareas al usuario y de pedir nuevas tareas. Usaremos `System.out.println` para mostrar los datos y `Scanner` para recibir la entrada del usuario.

```java
import java.util.List;
import java.util.Scanner;

class TaskView {
    private Scanner scanner;

    public TaskView() {
        scanner = new Scanner(System.in);
    }

    public void displayTasks(List<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public String getTaskInput() {
        System.out.print("Enter a new task: ");
        return scanner.nextLine();
    }
}
```

### Controlador

El **Controlador** se encarga de gestionar las interacciones entre la Vista y el Modelo. Recibe la entrada de la Vista, actualiza el Modelo, y luego solicita a la Vista que se actualice con la lista de tareas.

```java
class TaskController {
    private TaskModel model;
    private TaskView view;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void addTask() {
        String task = view.getTaskInput();
        model.addTask(task);
    }

    public void showTasks() {
        List<String> tasks = model.getTasks();
        view.displayTasks(tasks);
    }
}
```

### Aplicación Principal

En la aplicación principal, controlamos el flujo de ejecución y las interacciones con el usuario.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Show Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    controller.showTasks();
                    break;
                case "2":
                    controller.addTask();
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
```

### Explicación:

1. **Modelo (`TaskModel`)**: Usa un `ArrayList` para almacenar las tareas y tiene métodos para agregarlas y obtenerlas.
2. **Vista (`TaskView`)**: Usa `System.out.println` para mostrar las tareas y `Scanner` para recibir la entrada del usuario.
3. **Controlador (`TaskController`)**: Se encarga de recibir la entrada desde la Vista y actualizar el Modelo, luego muestra la lista actualizada de tareas.

---

### Implementación en frontend y backend del patrón MVC.

En el contexto de una aplicación web, el **frontend** es la parte que interactúa con el usuario (lo que se ejecuta en el navegador), mientras que el **backend** es la parte que maneja la lógica del servidor, la base de datos y otras operaciones del lado del servidor.

Vamos a ver cómo se implementa cada parte en el caso del patrón MVC:

### 1. Frontend (JavaScript, HTML, CSS)

El frontend será el encargado de mostrar las tareas y de permitir que el usuario agregue nuevas tareas. En un entorno web, típicamente usarías **HTML** para la estructura, **CSS** para el diseño y **JavaScript** para la interacción y lógica de la vista.

#### HTML (Vista)

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Task List</title>
    <style>
      body {
        font-family: Arial, sans-serif;
      }
      .task-list {
        margin-top: 20px;
      }
      .task {
        margin: 5px 0;
      }
      input[type="text"] {
        padding: 5px;
      }
      button {
        padding: 5px 10px;
      }
    </style>
  </head>
  <body>
    <h1>Task List</h1>
    <div class="task-list" id="taskList"></div>
    <input type="text" id="taskInput" placeholder="Enter a new task" />
    <button onclick="addTask()">Add Task</button>

    <script src="app.js"></script>
  </body>
</html>
```

#### JavaScript (Controlador y Vista)

El frontend tiene un archivo `app.js`, que maneja la interacción entre el modelo, la vista y el controlador. En este caso, utilizamos JavaScript para gestionar la vista de las tareas.

```javascript
// Modelo
class TaskModel {
  constructor() {
    this.tasks = [];
  }

  addTask(task) {
    this.tasks.push(task);
  }

  getTasks() {
    return this.tasks;
  }
}

// Vista
class TaskView {
  constructor() {
    this.taskListElement = document.getElementById("taskList");
  }

  displayTasks(tasks) {
    this.taskListElement.innerHTML = "";
    tasks.forEach((task, index) => {
      const taskElement = document.createElement("div");
      taskElement.className = "task";
      taskElement.textContent = `${index + 1}. ${task}`;
      this.taskListElement.appendChild(taskElement);
    });
  }
}

// Controlador
class TaskController {
  constructor(model, view) {
    this.model = model;
    this.view = view;
  }

  addTask(task) {
    this.model.addTask(task);
    this.view.displayTasks(this.model.getTasks());
  }

  showTasks() {
    this.view.displayTasks(this.model.getTasks());
  }
}

// Inicialización
const model = new TaskModel();
const view = new TaskView();
const controller = new TaskController(model, view);

// Función para manejar la adición de tareas desde el frontend
function addTask() {
  const taskInput = document.getElementById("taskInput");
  const task = taskInput.value;
  if (task) {
    controller.addTask(task);
    taskInput.value = ""; // Limpiar el campo de entrada
  }
}

// Mostrar las tareas al cargar la página
controller.showTasks();
```

### 2. Backend (Servidor en Python con Flask, o Java con Spring Boot)

El backend manejará las solicitudes de los usuarios, gestionará la base de datos y servirá los datos a la interfaz de usuario. Vamos a crear un pequeño servidor que maneje las tareas utilizando el patrón MVC en el backend.

### Backend en Python con Flask

En el backend de Python, el **Modelo** será responsable de almacenar las tareas, la **Vista** responderá con los datos en formato JSON, y el **Controlador** manejará las rutas HTTP.

#### Instalación de Flask

Primero, asegúrate de tener Flask instalado:

```bash
pip install flask
```

#### Backend en Python

```python
from flask import Flask, jsonify, request

app = Flask(__name__)

# Modelo
class TaskModel:
    def __init__(self):
        self.tasks = []

    def add_task(self, task):
        self.tasks.append(task)

    def get_tasks(self):
        return self.tasks

# Instanciamos el modelo
model = TaskModel()

# Vista (respuesta en JSON)
@app.route('/tasks', methods=['GET'])
def get_tasks():
    return jsonify(model.get_tasks())

@app.route('/tasks', methods=['POST'])
def add_task():
    task = request.json.get('task')
    if task:
        model.add_task(task)
        return jsonify({'message': 'Task added'}), 201
    return jsonify({'message': 'Invalid task'}), 400

# Iniciar el servidor
if __name__ == '__main__':
    app.run(debug=True)
```

En este ejemplo, tenemos:

- **Modelo**: `TaskModel` maneja las tareas.
- **Vista**: La vista se maneja a través de las respuestas en formato JSON.
- **Controlador**: Se definen dos rutas HTTP (`GET /tasks` para obtener tareas y `POST /tasks` para agregar nuevas tareas).

### Backend en Java con Spring Boot

Si prefieres Java para el backend, puedes usar Spring Boot. Primero, crea un proyecto Spring Boot y añade las dependencias de `spring-boot-starter-web` para crear una API REST.

#### Estructura básica de Spring Boot:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }
}

class TaskModel {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}

@RestController
@RequestMapping("/tasks")
class TaskController {
    private TaskModel model = new TaskModel();

    @GetMapping
    public List<String> getTasks() {
        return model.getTasks();
    }

    @PostMapping
    public String addTask(@RequestBody String task) {
        model.addTask(task);
        return "Task added!";
    }
}
```

En este ejemplo de **Spring Boot**:

- **Modelo**: `TaskModel` maneja las tareas.
- **Controlador**: `TaskController` gestiona las rutas HTTP.
- **Vista**: Responde con JSON.

### Conclusión

- **Frontend (JavaScript)**: En el frontend, usamos HTML, CSS y JavaScript para interactuar con el usuario, mostrar las tareas y enviar nuevas tareas al backend.
- **Backend (Python/Flask o Java/Spring Boot)**: El backend maneja las solicitudes y respuestas en formato JSON, actualiza el modelo y devuelve los datos al frontend.

---

## 3. Inyección de dependencias

La inyección de dependencias es un patrón de diseño que permite desacoplar las clases de sus dependencias, haciendo el código más flexible y fácil de mantener. Básicamente, en lugar de que una clase cree o gestione las dependencias que necesita, estas son "inyectadas" desde fuera, normalmente a través de un constructor o un setter.

### Conceptos clave:

1. **Dependencia**: Es cualquier objeto o clase que una clase necesita para funcionar.
2. **Inyección de dependencias**: Es el proceso de proporcionar estas dependencias a la clase desde fuera, en vez de que la clase las cree por sí misma.

### Python:

Vamos a ilustrarlo con un ejemplo sencillo. Supongamos que tienes una clase `Car` que depende de una clase `Engine`.

#### Ejemplo sin inyección de dependencias:

```python
class Engine:
    def start(self):
        print("Engine starting...")

class Car:
    def __init__(self):
        self.engine = Engine()  # La clase Car crea la dependencia Engine

    def drive(self):
        self.engine.start()
        print("Car is driving...")

# Uso
car = Car()
car.drive()
```

En este ejemplo, la clase `Car` está creando directamente la instancia de `Engine`, lo cual hace que `Car` dependa fuertemente de `Engine`. Esto reduce la flexibilidad, ya que si necesitas cambiar la implementación de `Engine`, tendrías que modificar la clase `Car`.

#### Ejemplo con inyección de dependencias:

```python
class Engine:
    def start(self):
        print("Engine starting...")

class Car:
    def __init__(self, engine: Engine):  # Dependencia inyectada
        self.engine = engine

    def drive(self):
        self.engine.start()
        print("Car is driving...")

# Inyección de la dependencia
engine = Engine()
car = Car(engine)  # La dependencia es proporcionada desde afuera
car.drive()
```

En este caso, `Car` no está creando `Engine` directamente; en su lugar, `Engine` es pasado a través del constructor de `Car`. Esto hace que el código sea más flexible y fácil de probar, ya que puedes inyectar cualquier clase que implemente la interfaz esperada (en este caso, cualquier clase que tenga un método `start()`).

### Resumen en Python:

- **Antes de la inyección de dependencias**: La clase crea y gestiona sus dependencias por sí misma.
- **Después de la inyección de dependencias**: Las dependencias son proporcionadas desde fuera, lo que facilita el cambio de comportamientos sin tocar el código de la clase.

---

### JavaScript

### Conceptos clave:

Al igual que en Python, la inyección de dependencias en JavaScript se refiere a proporcionar las dependencias a una clase desde el exterior, en lugar de que la clase las cree internamente.

### Implementación en JavaScript:

Vamos a usar el mismo ejemplo que con Python: una clase `Car` que depende de una clase `Engine`.

#### Ejemplo sin inyección de dependencias:

```javascript
class Engine {
  start() {
    console.log("Engine starting...");
  }
}

class Car {
  constructor() {
    this.engine = new Engine(); // La clase Car crea la dependencia Engine
  }

  drive() {
    this.engine.start();
    console.log("Car is driving...");
  }
}

// Uso
const car = new Car();
car.drive();
```

En este ejemplo, la clase `Car` está creando directamente la instancia de `Engine`. Al igual que en Python, esto genera un acoplamiento fuerte entre ambas clases. Si alguna vez quieres cambiar la implementación de `Engine`, tendrías que modificar la clase `Car`.

#### Ejemplo con inyección de dependencias:

```javascript
class Engine {
  start() {
    console.log("Engine starting...");
  }
}

class Car {
  constructor(engine) {
    this.engine = engine; // Dependencia inyectada
  }

  drive() {
    this.engine.start();
    console.log("Car is driving...");
  }
}

// Inyección de la dependencia
const engine = new Engine();
const car = new Car(engine); // La dependencia es proporcionada desde afuera
car.drive();
```

En este caso, `Car` recibe la instancia de `Engine` a través de su constructor. Esto hace que `Car` no dependa directamente de cómo se crea o gestiona `Engine`, lo que facilita cambiar o intercambiar la implementación de `Engine`.

### Resumen en JavaScript:

- **Antes de la inyección de dependencias**: La clase crea la dependencia internamente.
- **Después de la inyección de dependencias**: La dependencia es proporcionada desde el exterior, lo que facilita la flexibilidad y la extensibilidad del código.

---

### Java

### Conceptos clave:

Como en Python y JavaScript, la inyección de dependencias en Java implica proporcionar las dependencias a una clase desde el exterior, en lugar de que la clase las cree por sí misma.

### Implementación en Java:

Usaremos el mismo ejemplo que en los otros lenguajes: una clase `Car` que depende de una clase `Engine`.

#### Ejemplo sin inyección de dependencias:

```java
class Engine {
    void start() {
        System.out.println("Engine starting...");
    }
}

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();  // La clase Car crea la dependencia Engine
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
```

En este ejemplo, la clase `Car` crea internamente una instancia de `Engine`, lo que genera un acoplamiento fuerte entre las dos clases. Si quisieras cambiar o intercambiar la implementación de `Engine`, tendrías que modificar la clase `Car`.

#### Ejemplo con inyección de dependencias:

```java
class Engine {
    void start() {
        System.out.println("Engine starting...");
    }
}

class Car {
    private Engine engine;

    // Dependencia inyectada a través del constructor
    public Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();  // Creamos la dependencia
        Car car = new Car(engine);     // La dependencia se inyecta en el constructor
        car.drive();
    }
}
```

En este caso, `Car` recibe una instancia de `Engine` a través de su constructor. Esto hace que `Car` no esté directamente acoplada a la creación de `Engine`, permitiendo una mayor flexibilidad y facilidad de prueba.

### Resumen en Java:

- **Antes de la inyección de dependencias**: La clase crea la dependencia internamente.
- **Después de la inyección de dependencias**: La dependencia es proporcionada desde el exterior, lo que facilita la flexibilidad y la extensibilidad del código.

---

## 4. Singleton

### ¿Qué es el patrón Singleton?

El patrón Singleton es un patrón de diseño que asegura que una clase tenga una única instancia a lo largo de toda la ejecución del programa y proporciona un punto de acceso global a esa instancia. Es útil cuando solo necesitas un objeto que controle el acceso a recursos compartidos o cuando deseas evitar la creación de múltiples instancias de una clase.

### Python

En Python, podemos implementar el patrón Singleton de varias maneras, pero la forma más sencilla es utilizando una clase que controle su propia instancia:

```python
class Singleton:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(Singleton, cls).__new__(cls)
        return cls._instance

# Ejemplo de uso
obj1 = Singleton()
obj2 = Singleton()

print(obj1 is obj2)  # True, ambos objetos son la misma instancia
```

#### Explicación:

- La clase `Singleton` tiene un atributo de clase `_instance` que almacena la instancia única de la clase.
- El método especial `__new__` es el que se encarga de crear la instancia. Si la instancia no existe (`_instance is None`), se crea usando `super()`. Si ya existe, se retorna la instancia previamente creada.
- Cuando creamos dos objetos (`obj1` y `obj2`), ambos hacen referencia a la misma instancia, lo que se puede comprobar con la comparación `obj1 is obj2`.

### ¿Por qué usar Singleton?

Usamos el patrón Singleton cuando queremos asegurarnos de que una clase tenga solo una instancia en toda la aplicación, por ejemplo, en el caso de gestores de configuración o manejadores de conexiones de base de datos.

---

### JavaScript

### Implementación de Singleton en JavaScript

En JavaScript, la implementación de un Singleton también se puede lograr de manera sencilla, aprovechando la flexibilidad del lenguaje para crear y mantener una única instancia de un objeto.

```javascript
class Singleton {
  constructor() {
    if (Singleton.instance) {
      return Singleton.instance; // Si la instancia ya existe, retornamos esa instancia
    }
    this.data = "Some data"; // Propiedades de la instancia
    Singleton.instance = this; // Guardamos la instancia en la propiedad estática
  }
}

// Ejemplo de uso
const obj1 = new Singleton();
const obj2 = new Singleton();

console.log(obj1 === obj2); // true, ambos objetos son la misma instancia
```

#### Explicación:

- La clase `Singleton` tiene un constructor que verifica si `Singleton.instance` ya existe. Si es así, retorna la misma instancia, asegurando que no se cree una nueva.
- La propiedad `Singleton.instance` se utiliza para almacenar la instancia única.
- Cuando se crean dos objetos `obj1` y `obj2`, ambos apuntan a la misma instancia, lo cual se confirma con `obj1 === obj2`.

### ¿Por qué usar Singleton en JavaScript?

Al igual que en Python, el patrón Singleton en JavaScript es útil cuando se necesita tener una única instancia de una clase para manejar recursos globales, como un manejador de configuración o un cliente de base de datos.

---

### Java

### Implementación de Singleton en Java

En Java, el patrón Singleton se implementa generalmente utilizando una clase con un constructor privado y un método estático que devuelve la instancia única:

```java
public class Singleton {
    private static Singleton instance;

    // Constructor privado para evitar la creación de instancias externas
    private Singleton() {
        // Inicialización del objeto
    }

    // Método estático para obtener la instancia única
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Si no existe, creamos la instancia
        }
        return instance;
    }

    // Método para demostrar el funcionamiento
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        System.out.println(obj1 == obj2); // true, ambos son la misma instancia
    }
}
```

#### Explicación:

- La clase `Singleton` tiene un atributo estático `instance` que almacenará la única instancia de la clase.
- El constructor es privado (`private Singleton()`) para evitar que otras clases creen nuevas instancias directamente.
- El método `getInstance()` es estático y controla la creación de la instancia. Si ya existe una instancia (`instance == null`), la retorna; si no, la crea.
- En el método `main()`, se crean dos objetos (`obj1` y `obj2`) a través de `getInstance()`. Ambos apuntan a la misma instancia, lo que se verifica con `obj1 == obj2`.

### ¿Por qué usar Singleton en Java?

El patrón Singleton es útil en Java cuando se necesita garantizar que una clase tenga una única instancia en toda la aplicación, como un manejador de configuración o una conexión de base de datos, especialmente en aplicaciones multihilo.

---

## 5. Observador (Observer).

### ¿Qué es el patrón Observador?

El patrón Observador es un patrón de diseño de comportamiento que se utiliza para definir una dependencia de uno a muchos entre objetos, de manera que cuando un objeto cambia de estado, todos sus dependientes son notificados automáticamente. Este patrón es muy útil cuando se tiene un sistema donde uno o más objetos necesitan ser actualizados en respuesta a cambios en otro objeto sin que estos objetos dependan directamente entre sí.

#### Componentes del patrón Observador:

1. **Sujeto (Subject)**: Es el objeto que mantiene una lista de observadores y les notifica cuando su estado cambia.
2. **Observador (Observer)**: Es el objeto que recibe las actualizaciones del sujeto. Normalmente implementa una interfaz o clase abstracta que tiene un método para recibir las actualizaciones.
3. **ConcreteSubject**: Es una implementación específica del sujeto. Mantiene el estado actual y notifica a los observadores cuando cambia.
4. **ConcreteObserver**: Es una implementación específica del observador. Recibe las actualizaciones del sujeto y puede reaccionar de acuerdo a estos cambios.

### Python:

1. **Definir la clase `Subject`** (Sujeto):
   El sujeto mantiene la lista de observadores y notifica a todos cuando su estado cambia.

2. **Definir la clase `Observer`** (Observador):
   Los observadores se suscriben al sujeto y esperan las notificaciones.

3. **Implementar la lógica de notificación**:
   Cuando el estado del sujeto cambia, se notifica a todos los observadores.

#### Ejemplo en Python:

```python
# Clase Sujeto (Subject)
class Subject:
    def __init__(self):
        self._observers = []  # Lista de observadores

    def add_observer(self, observer):
        self._observers.append(observer)  # Añadir un observador a la lista

    def remove_observer(self, observer):
        self._observers.remove(observer)  # Eliminar un observador

    def notify_observers(self):
        for observer in self._observers:
            observer.update(self)  # Notificar a cada observador

# Clase Observador (Observer)
class Observer:
    def update(self, subject):
        pass  # Método que será sobrecargado por los observadores concretos

# Implementación del Sujeto concreto
class ConcreteSubject(Subject):
    def __init__(self, state):
        super().__init__()
        self._state = state

    @property
    def state(self):
        return self._state

    @state.setter
    def state(self, value):
        self._state = value
        self.notify_observers()  # Notificar cuando el estado cambia

# Implementación del Observador concreto
class ConcreteObserver(Observer):
    def __init__(self, name):
        self._name = name

    def update(self, subject):
        print(f"Observer {self._name} notified of state change: {subject.state}")

# Ejemplo de uso
if __name__ == "__main__":
    # Crear sujeto
    subject = ConcreteSubject("Initial State")

    # Crear observadores
    observer1 = ConcreteObserver("Observer 1")
    observer2 = ConcreteObserver("Observer 2")

    # Añadir observadores al sujeto
    subject.add_observer(observer1)
    subject.add_observer(observer2)

    # Cambiar el estado del sujeto y notificar a los observadores
    subject.state = "State 1"
    subject.state = "State 2"
```

### Explicación del código:

1. **Subject**: Es la clase base que gestiona los observadores. Tiene métodos para añadir, eliminar y notificar a los observadores.
2. **Observer**: Es una clase base para los observadores que define un método `update()`, el cual debe ser implementado en las subclases concretas.
3. **ConcreteSubject**: Una clase concreta que hereda de `Subject`. Tiene un estado que puede cambiar, y cuando cambia, notifica a todos los observadores.
4. **ConcreteObserver**: Es un observador concreto que implementa el método `update()`. Este método recibe el sujeto y responde a los cambios.

En este ejemplo, cuando se cambia el estado del `ConcreteSubject`, se notifica a los observadores (como `Observer 1` y `Observer 2`) y muestran el nuevo estado.

---

### JavaScript

### Implementación en JavaScript:

En JavaScript, vamos a crear las mismas clases que en el ejemplo de Python:

- **Sujeto (Subject)**: Que gestionará los observadores y les notificará cuando su estado cambie.
- **Observador (Observer)**: Que reaccionará a los cambios de estado del sujeto.

#### Ejemplo de código en JavaScript:

```javascript
// Clase Sujeto (Subject)
class Subject {
  constructor() {
    this._observers = []; // Lista de observadores
  }

  addObserver(observer) {
    this._observers.push(observer); // Añadir un observador
  }

  removeObserver(observer) {
    const index = this._observers.indexOf(observer);
    if (index > -1) {
      this._observers.splice(index, 1); // Eliminar un observador
    }
  }

  notifyObservers() {
    this._observers.forEach((observer) => observer.update(this)); // Notificar a todos los observadores
  }
}

// Clase Observador (Observer)
class Observer {
  update(subject) {
    // Método que será sobrecargado por los observadores concretos
  }
}

// Implementación del Sujeto concreto
class ConcreteSubject extends Subject {
  constructor(state) {
    super();
    this._state = state;
  }

  get state() {
    return this._state;
  }

  set state(value) {
    this._state = value;
    this.notifyObservers(); // Notificar a los observadores cuando el estado cambia
  }
}

// Implementación del Observador concreto
class ConcreteObserver extends Observer {
  constructor(name) {
    super();
    this._name = name;
  }

  update(subject) {
    console.log(
      `Observer ${this._name} notified of state change: ${subject.state}`
    );
  }
}

// Ejemplo de uso
const subject = new ConcreteSubject("Initial State");

const observer1 = new ConcreteObserver("Observer 1");
const observer2 = new ConcreteObserver("Observer 2");

subject.addObserver(observer1);
subject.addObserver(observer2);

subject.state = "State 1"; // Los observadores serán notificados
subject.state = "State 2"; // Los observadores serán notificados
```

### Explicación del código:

1. **Subject**: Es la clase base que gestiona los observadores. Tiene métodos para añadir, eliminar y notificar a los observadores.
2. **Observer**: Es una clase base para los observadores que define el método `update()`, que debe ser implementado por las clases concretas.
3. **ConcreteSubject**: Es una clase que hereda de `Subject` y tiene un estado. Cuando el estado cambia, se notifica a los observadores.
4. **ConcreteObserver**: Es un observador concreto que implementa el método `update()`, el cual se ejecuta cuando el sujeto cambia su estado.

Cuando el estado de `ConcreteSubject` cambia, los observadores (`ConcreteObserver`) son notificados y se imprimen los cambios en la consola.

---

### Java

### Implementación en Java:

En Java, utilizamos interfaces para definir el comportamiento de los observadores y sujetos. Vamos a crear:

1. **Subject**: Una interfaz para los sujetos, que permite añadir, eliminar y notificar a los observadores.
2. **Observer**: Una interfaz para los observadores, que define el método `update()`.
3. **ConcreteSubject**: Una implementación concreta del sujeto que notifica a los observadores cuando cambia su estado.
4. **ConcreteObserver**: Una implementación concreta del observador que recibe la notificación del cambio de estado.

#### Ejemplo de código en Java:

```java
import java.util.ArrayList;
import java.util.List;

// Interface Sujeto (Subject)
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Interface Observador (Observer)
interface Observer {
    void update(Subject subject);
}

// Implementación del Sujeto concreto
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public ConcreteSubject(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers(); // Notificar a los observadores cuando el estado cambia
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

// Implementación del Observador concreto
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject) {
            System.out.println("Observer " + name + " notified of state change: " + ((ConcreteSubject) subject).getState());
        }
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject("Initial State");

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("State 1"); // Los observadores serán notificados
        subject.setState("State 2"); // Los observadores serán notificados
    }
}
```

### Explicación del código:

1. **Subject**: Es una interfaz que define los métodos `addObserver()`, `removeObserver()` y `notifyObservers()` para gestionar la lista de observadores.
2. **Observer**: Es una interfaz que define el método `update()`, que es llamado para notificar a los observadores sobre los cambios en el sujeto.
3. **ConcreteSubject**: Es la clase concreta que implementa la interfaz `Subject`. Tiene un estado que puede cambiar, y cuando cambia, notifica a todos los observadores.
4. **ConcreteObserver**: Es la clase concreta que implementa la interfaz `Observer`. El método `update()` se ejecuta cada vez que el sujeto cambia su estado.

En este ejemplo, cuando se cambia el estado de `ConcreteSubject`, los observadores (como `Observer 1` y `Observer 2`) son notificados y muestran el nuevo estado en la consola.

Este patrón es especialmente útil en aplicaciones donde varios objetos necesitan reaccionar al cambio de estado de otro objeto de forma desacoplada.

---

## 6. Fábrica (Factory) y Fábrica abstracta.

### ¿Qué es el patrón de diseño Fábrica?

El patrón **Fábrica** es un patrón creacional que proporciona una interfaz para crear objetos en una superclase, pero permite que las subclases decidan qué clase instanciar. Es útil cuando tienes una jerarquía de clases y no quieres que tu código dependa de clases concretas, sino de una interfaz común.

### ¿Cómo funciona?

Imagina que tienes una clase base y varias subclases. La Fábrica proporciona un método que, dependiendo de los parámetros o contexto, crea una instancia de una de las subclases.

### Python

Supongamos que estás creando una aplicación de vehículos, y tienes diferentes tipos de vehículos (Coche, Camión, Motocicleta). En lugar de instanciarlos directamente, usarás una Fábrica para crear el objeto adecuado.

#### 1. Definir las clases base y concretas

```python
class Vehiculo:
    def conducir(self):
        pass

class Coche(Vehiculo):
    def conducir(self):
        return "Conduciendo un coche"

class Camion(Vehiculo):
    def conducir(self):
        return "Conduciendo un camión"

class Motocicleta(Vehiculo):
    def conducir(self):
        return "Conduciendo una motocicleta"
```

#### 2. Crear la clase Fábrica

La clase **Fábrica** tendrá un método `crear_vehiculo` que decide qué tipo de vehículo crear dependiendo de la entrada.

```python
class FabricaVehiculos:
    def crear_vehiculo(self, tipo):
        if tipo == "coche":
            return Coche()
        elif tipo == "camion":
            return Camion()
        elif tipo == "motocicleta":
            return Motocicleta()
        else:
            raise ValueError(f"Vehículo {tipo} no reconocido")
```

#### 3. Usar la Fábrica

```python
# Instanciando la Fábrica
fabrica = FabricaVehiculos()

# Creando objetos de vehículos
vehiculo1 = fabrica.crear_vehiculo("coche")
vehiculo2 = fabrica.crear_vehiculo("camion")
vehiculo3 = fabrica.crear_vehiculo("motocicleta")

print(vehiculo1.conducir())  # Salida: Conduciendo un coche
print(vehiculo2.conducir())  # Salida: Conduciendo un camión
print(vehiculo3.conducir())  # Salida: Conduciendo una motocicleta
```

### ¿Por qué usar este patrón?

1. **Desacoplamiento**: No tienes que preocuparte de las clases concretas, solo de la interfaz.
2. **Flexibilidad**: Si se agregan nuevos tipos de vehículos, solo tienes que modificar la Fábrica, sin tocar el código que usa los vehículos.

---

### JavaScript

### ¿Cómo se implementa en JavaScript?

En JavaScript, también podemos crear un patrón similar al de Python, usando funciones constructores o clases, dependiendo de la versión de JavaScript que estés utilizando. Aquí utilizaremos clases para hacerlo más moderno y fácil de entender.

### Ejemplo en JavaScript

Supongamos que estamos creando una aplicación similar a la de los vehículos, con la misma idea de tener diferentes tipos de vehículos: **Coche**, **Camión**, y **Motocicleta**.

#### 1. Definir las clases base y concretas

```javascript
class Vehiculo {
  conducir() {
    throw new Error("Este método debe ser implementado");
  }
}

class Coche extends Vehiculo {
  conducir() {
    return "Conduciendo un coche";
  }
}

class Camion extends Vehiculo {
  conducir() {
    return "Conduciendo un camión";
  }
}

class Motocicleta extends Vehiculo {
  conducir() {
    return "Conduciendo una motocicleta";
  }
}
```

#### 2. Crear la clase Fábrica

La **Fábrica** será responsable de crear instancias de los vehículos según el tipo pasado como parámetro.

```javascript
class FabricaVehiculos {
  crearVehiculo(tipo) {
    if (tipo === "coche") {
      return new Coche();
    } else if (tipo === "camion") {
      return new Camion();
    } else if (tipo === "motocicleta") {
      return new Motocicleta();
    } else {
      throw new Error(`Vehículo ${tipo} no reconocido`);
    }
  }
}
```

#### 3. Usar la Fábrica

```javascript
// Instanciando la Fábrica
const fabrica = new FabricaVehiculos();

// Creando vehículos
const vehiculo1 = fabrica.crearVehiculo("coche");
const vehiculo2 = fabrica.crearVehiculo("camion");
const vehiculo3 = fabrica.crearVehiculo("motocicleta");

console.log(vehiculo1.conducir()); // Salida: Conduciendo un coche
console.log(vehiculo2.conducir()); // Salida: Conduciendo un camión
console.log(vehiculo3.conducir()); // Salida: Conduciendo una motocicleta
```

### ¿Por qué usar este patrón en JavaScript?

1. **Desacoplamiento**: No necesitas instanciar directamente las clases concretas de los vehículos. La Fábrica es la encargada de decidir qué objeto crear.
2. **Flexibilidad**: Puedes agregar nuevos tipos de vehículos sin necesidad de modificar el código que usa los vehículos, solo tendrías que modificar la Fábrica.

---

### Java

En Java, podemos utilizar clases y la palabra clave `new` para crear objetos, de forma similar a Python y JavaScript. En este caso, utilizaremos clases y la herencia para ilustrar el patrón Fábrica.

#### 1. Definir las clases base y concretas

```java
// Clase base
abstract class Vehiculo {
    public abstract String conducir();
}

// Clases concretas
class Coche extends Vehiculo {
    @Override
    public String conducir() {
        return "Conduciendo un coche";
    }
}

class Camion extends Vehiculo {
    @Override
    public String conducir() {
        return "Conduciendo un camión";
    }
}

class Motocicleta extends Vehiculo {
    @Override
    public String conducir() {
        return "Conduciendo una motocicleta";
    }
}
```

#### 2. Crear la clase Fábrica

La Fábrica será responsable de crear instancias de los vehículos según el tipo que le pasemos como parámetro.

```java
class FabricaVehiculos {
    public Vehiculo crearVehiculo(String tipo) {
        if (tipo.equalsIgnoreCase("coche")) {
            return new Coche();
        } else if (tipo.equalsIgnoreCase("camion")) {
            return new Camion();
        } else if (tipo.equalsIgnoreCase("motocicleta")) {
            return new Motocicleta();
        } else {
            throw new IllegalArgumentException("Vehículo " + tipo + " no reconocido");
        }
    }
}
```

#### 3. Usar la Fábrica

```java
public class Main {
    public static void main(String[] args) {
        // Instanciando la Fábrica
        FabricaVehiculos fabrica = new FabricaVehiculos();

        // Creando vehículos
        Vehiculo vehiculo1 = fabrica.crearVehiculo("coche");
        Vehiculo vehiculo2 = fabrica.crearVehiculo("camion");
        Vehiculo vehiculo3 = fabrica.crearVehiculo("motocicleta");

        // Mostrando lo que hace cada vehículo
        System.out.println(vehiculo1.conducir());  // Salida: Conduciendo un coche
        System.out.println(vehiculo2.conducir());  // Salida: Conduciendo un camión
        System.out.println(vehiculo3.conducir());  // Salida: Conduciendo una motocicleta
    }
}
```

### Explicación

1. **Clase `Vehiculo`**: Es una clase abstracta con el método `conducir()`, que será implementado por las clases concretas.
2. **Clases `Coche`, `Camion`, `Motocicleta`**: Son clases concretas que extienden `Vehiculo` y proporcionan la implementación específica del método `conducir()`.
3. **Clase `FabricaVehiculos`**: Esta clase tiene el método `crearVehiculo()`, que, según el tipo de vehículo solicitado, devuelve una instancia de la clase correspondiente.
4. **Clase `Main`**: Aquí es donde se instancian los objetos utilizando la Fábrica, y luego se invoca el método `conducir()` en cada uno de ellos.

### ¿Por qué usar este patrón en Java?

1. **Desacoplamiento**: El código que utiliza los vehículos no necesita saber qué tipo concreto de vehículo está creando. La Fábrica maneja la creación de objetos.
2. **Extensibilidad**: Si agregas un nuevo tipo de vehículo, solo tendrías que modificar la Fábrica sin afectar el resto del código que utiliza los vehículos.

---

## 7.Repositorios y servicios

1. **Repositorio**: Un repositorio es una capa que se encarga de la interacción con la base de datos o cualquier fuente de datos (puede ser un archivo, una API, etc.). Su propósito es encapsular el acceso a los datos para que otras partes de la aplicación no tengan que preocuparse por cómo se obtienen o se guardan esos datos.

2. **Servicio**: Un servicio contiene la lógica de negocio de la aplicación. Utiliza los repositorios para obtener o modificar los datos y puede realizar operaciones más complejas que implican la manipulación de esos datos.

### Python

Vamos a crear un ejemplo básico de una aplicación que maneja usuarios, donde tenemos un repositorio que maneja la base de datos (que en este caso será una lista de Python) y un servicio que gestiona la lógica de negocio.

#### Paso 1: Definir el Repositorio

```python
class UserRepository:
    def __init__(self):
        # Simulando una base de datos con una lista
        self.users = []

    def add_user(self, user):
        self.users.append(user)

    def get_user(self, user_id):
        for user in self.users:
            if user['id'] == user_id:
                return user
        return None

    def get_all_users(self):
        return self.users
```

El `UserRepository` maneja las operaciones básicas sobre los datos de los usuarios: agregar, obtener por ID y obtener todos los usuarios.

#### Paso 2: Definir el Servicio

```python
class UserService:
    def __init__(self, user_repository):
        self.user_repository = user_repository

    def create_user(self, id, name, email):
        # Aquí se podrían agregar validaciones, lógicas de negocio, etc.
        user = {'id': id, 'name': name, 'email': email}
        self.user_repository.add_user(user)

    def get_user_details(self, user_id):
        user = self.user_repository.get_user(user_id)
        if user:
            return f"User: {user['name']}, Email: {user['email']}"
        else:
            return "User not found"
```

El `UserService` utiliza el `UserRepository` para gestionar a los usuarios. Tiene métodos como `create_user`, que se encargan de la lógica de negocio.

#### Paso 3: Usar el Repositorio y Servicio

```python
# Crear instancia del repositorio
user_repo = UserRepository()

# Crear instancia del servicio, pasando el repositorio como parámetro
user_service = UserService(user_repo)

# Crear usuarios a través del servicio
user_service.create_user(1, "John Doe", "john@example.com")
user_service.create_user(2, "Jane Smith", "jane@example.com")

# Obtener detalles de un usuario
print(user_service.get_user_details(1))  # Debería mostrar "User: John Doe, Email: john@example.com"
print(user_service.get_user_details(3))  # Debería mostrar "User not found"
```

En este ejemplo:

- `UserRepository` se encarga de acceder a los datos de los usuarios.
- `UserService` se encarga de la lógica de negocio, como la creación de usuarios y la obtención de detalles.

### Resumen

- El **Repositorio** es responsable de las operaciones de acceso a datos.
- El **Servicio** es responsable de la lógica de negocio y usa el repositorio para acceder o modificar los datos.

---

### JavaScript

### Patrón de Repositorios y Servicios en JavaScript

1. **Repositorio**: En JavaScript, el repositorio puede ser una clase que maneja las operaciones sobre los datos (puede ser un arreglo, una base de datos, o cualquier otro tipo de almacenamiento).

2. **Servicio**: El servicio contiene la lógica de negocio y utiliza el repositorio para realizar las operaciones necesarias sobre los datos.

### Ejemplo en JavaScript

Vamos a crear un ejemplo similar al de Python, que maneja usuarios. Empezamos con el repositorio y luego el servicio.

#### Paso 1: Definir el Repositorio

```javascript
class UserRepository {
  constructor() {
    // Simulamos una base de datos con un arreglo
    this.users = [];
  }

  addUser(user) {
    this.users.push(user);
  }

  getUser(userId) {
    return this.users.find((user) => user.id === userId) || null;
  }

  getAllUsers() {
    return this.users;
  }
}
```

Aquí, `UserRepository` maneja las operaciones sobre los datos de los usuarios, al igual que en Python.

#### Paso 2: Definir el Servicio

```javascript
class UserService {
  constructor(userRepository) {
    this.userRepository = userRepository;
  }

  createUser(id, name, email) {
    // Aquí se podrían agregar validaciones, lógicas de negocio, etc.
    const user = { id, name, email };
    this.userRepository.addUser(user);
  }

  getUserDetails(userId) {
    const user = this.userRepository.getUser(userId);
    if (user) {
      return `User: ${user.name}, Email: ${user.email}`;
    } else {
      return "User not found";
    }
  }
}
```

El `UserService` recibe una instancia de `UserRepository` y proporciona la lógica de negocio relacionada con los usuarios.

#### Paso 3: Usar el Repositorio y Servicio

```javascript
// Crear instancia del repositorio
const userRepo = new UserRepository();

// Crear instancia del servicio, pasando el repositorio como parámetro
const userService = new UserService(userRepo);

// Crear usuarios a través del servicio
userService.createUser(1, "John Doe", "john@example.com");
userService.createUser(2, "Jane Smith", "jane@example.com");

// Obtener detalles de un usuario
console.log(userService.getUserDetails(1)); // Debería mostrar "User: John Doe, Email: john@example.com"
console.log(userService.getUserDetails(3)); // Debería mostrar "User not found"
```

### Resumen

En JavaScript:

- **UserRepository** es responsable de gestionar los datos (en este caso, usuarios) y tiene métodos para agregar, obtener y listar usuarios.
- **UserService** gestiona la lógica de negocio, como la creación de usuarios y la obtención de detalles de los mismos, y utiliza el `UserRepository` para acceder a los datos.

---

### Java

1. **Repositorio**: Al igual que en los otros lenguajes, el repositorio se encarga de interactuar con los datos, ya sea en memoria, en una base de datos, o en otro tipo de almacenamiento.

2. **Servicio**: El servicio se encarga de la lógica de negocio y utiliza el repositorio para realizar las operaciones necesarias.

### Ejemplo en Java

Vamos a crear un ejemplo de gestión de usuarios, con un repositorio que maneja la base de datos (usaremos una lista en memoria) y un servicio que gestiona la lógica de negocio.

#### Paso 1: Definir el Repositorio

```java
import java.util.ArrayList;
import java.util.List;

class UserRepository {
    private List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUser(int userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }
}
```

En este caso, `UserRepository` gestiona una lista de usuarios. Tiene métodos para agregar, obtener un usuario por ID y obtener todos los usuarios.

#### Paso 2: Definir la Entidad Usuario

En Java, generalmente definimos las entidades (como `User`) con clases simples. Aquí definimos la clase `User`.

```java
class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
```

#### Paso 3: Definir el Servicio

```java
class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(int id, String name, String email) {
        User user = new User(id, name, email);
        userRepository.addUser(user);
    }

    public String getUserDetails(int userId) {
        User user = userRepository.getUser(userId);
        if (user != null) {
            return "User: " + user.getName() + ", Email: " + user.getEmail();
        } else {
            return "User not found";
        }
    }
}
```

El `UserService` recibe una instancia de `UserRepository` y proporciona métodos para crear usuarios y obtener detalles de un usuario.

#### Paso 4: Usar el Repositorio y Servicio

```java
public class Main {
    public static void main(String[] args) {
        // Crear instancia del repositorio
        UserRepository userRepo = new UserRepository();

        // Crear instancia del servicio, pasando el repositorio como parámetro
        UserService userService = new UserService(userRepo);

        // Crear usuarios a través del servicio
        userService.createUser(1, "John Doe", "john@example.com");
        userService.createUser(2, "Jane Smith", "jane@example.com");

        // Obtener detalles de un usuario
        System.out.println(userService.getUserDetails(1));  // Debería mostrar "User: John Doe, Email: john@example.com"
        System.out.println(userService.getUserDetails(3));  // Debería mostrar "User not found"
    }
}
```

### Resumen

En Java:

- **UserRepository** es el encargado de manejar las operaciones sobre los datos de los usuarios (agregar, obtener por ID y listar).
- **UserService** gestiona la lógica de negocio relacionada con los usuarios y utiliza el repositorio para obtener y agregar datos.

Este es un ejemplo sencillo, pero muestra claramente cómo se separa la lógica de acceso a datos (repositorio) de la lógica de negocio (servicio).
