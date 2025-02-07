# React

## 1. **Introducción a React**

### **¿Qué es React?**

React es una biblioteca de JavaScript de código abierto para construir interfaces de usuario, principalmente para aplicaciones web de una sola página (SPA, por sus siglas en inglés). Fue desarrollada por **Facebook** y ahora tiene una gran comunidad de soporte. React facilita la creación de aplicaciones dinámicas y reactivas, donde los cambios en los datos de la aplicación se reflejan de manera eficiente en la interfaz de usuario.

**Principales características de React**:

- **Componentes**: React está basado en componentes. Un componente es una pieza de código que define una parte de la interfaz de usuario. Los componentes pueden ser reutilizados y anidados unos dentro de otros.
- **Declarativo**: En lugar de manipular el DOM directamente, como se hacía en JavaScript puro, React permite describir cómo debería lucir la interfaz en función del estado de la aplicación, y se encarga de actualizarla automáticamente cuando ese estado cambia.

- **JSX**: React utiliza **JSX** (JavaScript XML), una sintaxis que permite escribir componentes en una mezcla de HTML y JavaScript. Esto facilita la creación de componentes de manera declarativa y legible.

- **Unidireccionalidad de datos**: Los datos fluyen de arriba hacia abajo en los componentes, lo que hace más fácil rastrear cómo cambian los datos y cómo se afectan las vistas.

- **Virtual DOM**: React mantiene una copia en memoria del DOM real, llamada **Virtual DOM**. Cuando los datos cambian, React actualiza primero el Virtual DOM, y luego compara la diferencia con el DOM real (esto se llama "reconciliación"). Solo las partes del DOM que realmente cambian son actualizadas, lo que mejora el rendimiento.

### **¿Por qué usar React?**

1. **Reactividad y rendimiento**: React actualiza la interfaz de manera eficiente gracias al Virtual DOM, lo que optimiza el rendimiento, especialmente en aplicaciones grandes con cambios frecuentes de estado.

2. **Reutilización de componentes**: Al usar componentes, puedes crear interfaces modulares, lo que facilita la reutilización y el mantenimiento del código.

3. **Fácil integración**: React se puede integrar en aplicaciones existentes sin problemas, lo que lo hace ideal para mejorar aplicaciones previas o agregar funcionalidades sin reescribir todo desde cero.

4. **Gran comunidad y ecosistema**: Al ser tan popular, React tiene una gran comunidad, lo que implica una abundante cantidad de recursos, librerías y herramientas que pueden facilitar el desarrollo.

5. **Soporte para aplicaciones móviles**: A través de **React Native**, puedes desarrollar aplicaciones móviles nativas para Android e iOS utilizando la misma sintaxis y principios de React.

6. **Desarrollo basado en componentes**: React promueve la creación de interfaces basadas en componentes autónomos, lo que facilita la construcción de aplicaciones modulares y escalables.

En resumen, **React** es una excelente opción cuando se desea construir interfaces de usuario interactivas, modulares y de alto rendimiento. Su enfoque basado en componentes y su capacidad para manejar actualizaciones de interfaz de manera eficiente lo hacen ideal para aplicaciones modernas.

### Creación de una aplicación básica en React\*\*: Uso de `create-react-app`.

La herramienta `create-react-app` fue durante mucho tiempo la opción predeterminada para iniciar proyectos de React. Sin embargo, en la documentación oficial de React, ya no se recomienda su uso debido a problemas de rendimiento y falta de actualizaciones. En su lugar, se sugieren frameworks como Next.js, Remix, Gatsby y Expo para crear aplicaciones de React. citeturn0search3

Una alternativa popular y eficiente es Vite, que ofrece una configuración más rápida y un mejor rendimiento en comparación con `create-react-app`. Para iniciar un proyecto de React con Vite, puedes seguir estos pasos:

1. **Instalar Vite**: Ejecuta el siguiente comando en tu terminal:

   ```bash
   npm create vite@latest
   ```

2. **Configurar el proyecto**: Sigue las indicaciones para nombrar tu proyecto y selecciona "React" como el framework deseado.

3. **Instalar dependencias**: Navega al directorio de tu proyecto y ejecuta:

   ```bash
   npm install
   ```

4. **Iniciar el servidor de desarrollo**: Finalmente, inicia el servidor con:

   ```bash
   npm run dev
   ```

Este proceso te permitirá comenzar con una aplicación de React utilizando Vite, beneficiándote de tiempos de carga más rápidos y una configuración más sencilla.

Para profundizar en este tema, te recomiendo ver el siguiente video que explica detalladamente por qué `create-react-app` ha quedado obsoleto y cómo puedes utilizar Vite como alternativa: [video](https://youtu.be/h1WLN9Gzbwc)

### **Estructura de una Aplicación React**

Una aplicación en **React** se basa en la construcción de interfaces mediante **componentes**, los cuales utilizan una sintaxis llamada **JSX** (JavaScript XML).

## **1. Componentes en React**

Un componente en React es una función o clase que retorna elementos de la interfaz de usuario. Se pueden clasificar en dos tipos principales:

### **1.1 Componentes Funcionales (Function Components)**

Son los más utilizados actualmente debido a su simplicidad y mejor integración con **React Hooks**. Se definen como funciones de JavaScript que retornan JSX.

📌 **Ejemplo de un componente funcional:**

```jsx
function Saludo() {
  return <h1>¡Hola, mundo!</h1>;
}

export default Saludo;
```

📌 **Uso en otro componente (ejemplo `App.js`):**

```jsx
import Saludo from "./Saludo";

function App() {
  return (
    <div>
      <Saludo />
    </div>
  );
}

export default App;
```

### **1.2 Componentes de Clase (Class Components) [Obsoletos]**

Antes de React 16.8, se usaban clases para manejar el estado y el ciclo de vida. Hoy en día, **se prefieren los componentes funcionales con Hooks**.

Ejemplo de un **componente de clase** (ya no recomendado):

```jsx
import React, { Component } from "react";

class Saludo extends Component {
  render() {
    return <h1>¡Hola, mundo!</h1>;
  }
}

export default Saludo;
```

---

## **2. JSX (JavaScript XML)**

JSX es una extensión de JavaScript que permite escribir código similar a HTML dentro de archivos `.jsx`. Este código es transformado en JavaScript puro mediante **Babel**.

📌 **Ejemplo de JSX en React**:

```jsx
const mensaje = "Bienvenido a React";
const elemento = <h1>{mensaje}</h1>;
```

**Características importantes de JSX:**

1. **Debe tener un solo elemento raíz:**  
   ❌ Incorrecto:

   ```jsx
   return <h1>Hola</h1> <p>Bienvenido</p>;
   ```

   ✅ Correcto:

   ```jsx
   return (
     <>
       <h1>Hola</h1>
       <p>Bienvenido</p>
     </>
   );
   ```

   También se puede envolver en un `<div>` o usar `<React.Fragment>`.

2. **Expresiones en JSX con `{}`**  
   JSX permite incluir expresiones de JavaScript dentro de llaves `{}`.

   ```jsx
   const nombre = "Anto";
   return <h1>¡Hola, {nombre}!</h1>;
   ```

3. **Atributos en JSX (camelCase)**  
   En JSX, los atributos HTML deben escribirse en **camelCase**.

   ```jsx
   <button onClick={handleClick}>Click</button> // Correcto
   ```

4. **Clases CSS en JSX**  
   Como `class` es una palabra reservada en JavaScript, en JSX se usa `className`.
   ```jsx
   <h1 className="titulo">Hola</h1>
   ```

---

## **Conclusión**

React está basado en componentes, que pueden ser funcionales o de clase (estos últimos en desuso). Para escribir su estructura usamos JSX, que permite escribir código similar a HTML dentro de JavaScript. Es fundamental comprender estos conceptos para construir aplicaciones en React. 🚀

### **Renderizado de Elementos en React**

El renderizado en React es el proceso de convertir elementos de React en código HTML real que el navegador puede interpretar. Para esto, antes se utilizaba `ReactDOM.render()`, pero en las versiones más recientes de React (18 en adelante) **se recomienda usar `createRoot()` en su lugar**.

## **1. Método Antiguo (React 17 y versiones anteriores)**

Antes de React 18, el punto de entrada principal de una aplicación React era `ReactDOM.render()`.

📌 **Ejemplo de uso:**

```jsx
import React from "react";
import ReactDOM from "react-dom";

const elemento = <h1>¡Hola, mundo!</h1>;

ReactDOM.render(elemento, document.getElementById("root"));
```

Este código:

1. Crea un elemento `<h1>¡Hola, mundo!</h1>`.
2. Usa `ReactDOM.render()` para insertar ese elemento dentro del `div` con `id="root"` en el `index.html`.

---

## **2. Método Actual (React 18 y en adelante)**

Desde React 18, se recomienda usar `createRoot()` en lugar de `ReactDOM.render()`. Esto es porque `createRoot()` habilita el **modo concurrente**, mejorando la eficiencia del renderizado.

📌 **Ejemplo de uso en React 18:**

```jsx
import React from "react";
import ReactDOM from "react-dom/client";

const elemento = <h1>¡Hola, mundo!</h1>;
const root = ReactDOM.createRoot(document.getElementById("root"));

root.render(elemento);
```

🚀 **Ventajas de `createRoot()` sobre `ReactDOM.render()`:**
✔ Permite el modo concurrente para mejor rendimiento.  
✔ Mejora el manejo de actualizaciones.  
✔ Facilita la transición a nuevas funcionalidades de React.

---

## **3. Renderizando Componentes en React**

En lugar de renderizar solo un elemento, generalmente se renderiza un **componente principal** (como `App`).

📌 **Ejemplo completo:**
📁 `index.js`

```jsx
import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<App />);
```

📁 `App.js`

```jsx
function App() {
  return <h1>Bienvenido a mi aplicación React</h1>;
}

export default App;
```

Esto hace que `App.js` sea el punto central de la interfaz.

---

## **Conclusión**

- **ReactDOM.render()** se usaba en versiones anteriores a React 18.
- **ReactDOM.createRoot().render()** es la nueva forma recomendada.
- El renderizado en React es eficiente y solo actualiza los cambios necesarios en el DOM.

### **Elementos y Componentes en React**

En React, la interfaz de usuario se construye con **elementos y componentes**. Un **elemento** es la unidad más básica (como un `<h1>` o un botón), mientras que un **componente** es un conjunto de elementos que pueden recibir datos y manejar estados.

---

## **1. Componentes en React**

Un **componente** es una función o clase que retorna JSX. Hay dos tipos principales:

### **1.1 Componentes Funcionales (Recomendados)**

Un **componente funcional** es una función de JavaScript que retorna JSX.

📌 **Ejemplo de un componente funcional:**

```jsx
function Saludo() {
  return <h1>¡Hola, Anto!</h1>;
}

export default Saludo;
```

✅ **Ventajas de los componentes funcionales**:

- Más simples y fáciles de escribir.
- Mejor rendimiento.
- Pueden usar Hooks (`useState`, `useEffect`, etc.) para manejar estados y efectos.

---

### **1.2 Componentes de Clase (Obsoletos)**

Antes de React 16.8, los componentes de clase eran necesarios para manejar estados. Ahora, **se prefieren los funcionales con Hooks**.

📌 **Ejemplo de un componente de clase (obsoleto):**

```jsx
import React, { Component } from "react";

class Saludo extends Component {
  render() {
    return <h1>¡Hola, Anto!</h1>;
  }
}

export default Saludo;
```

🚨 **Desventajas de los componentes de clase**:

- Más código y más verboso.
- Más difícil de leer y mantener.
- No son compatibles con el nuevo sistema de renderizado concurrente.

---

## **2. Propiedades (`props`): Pasar Datos entre Componentes**

Los **props** permiten que los componentes reciban datos desde sus padres y sean reutilizables.

📌 **Ejemplo de uso de `props`:**

```jsx
function Saludo(props) {
  return <h1>¡Hola, {props.nombre}!</h1>;
}
```

📌 **Uso en otro componente (`App.js`):**

```jsx
function App() {
  return <Saludo nombre="Anto" />;
}
```

📝 **Características de `props`:**

- Son **de solo lectura** (no se pueden modificar dentro del componente).
- Se pueden pasar como atributos en los componentes (`<Saludo nombre="Anto" />`).
- Se pueden usar para personalizar la UI.

---

## **3. Estado (`state`): Manejo de Datos dentro de un Componente**

El **estado (`state`)** permite que un componente administre y actualice datos internamente.

### **3.1 Estado en Componentes de Clase (Obsoleto)**

Antes, el estado solo podía manejarse en componentes de clase.

📌 **Ejemplo de `state` en una clase:**

```jsx
import React, { Component } from "react";

class Contador extends Component {
  constructor() {
    super();
    this.state = { contador: 0 };
  }

  incrementar = () => {
    this.setState({ contador: this.state.contador + 1 });
  };

  render() {
    return (
      <div>
        <p>Contador: {this.state.contador}</p>
        <button onClick={this.incrementar}>Incrementar</button>
      </div>
    );
  }
}

export default Contador;
```

---

### **3.2 Estado en Componentes Funcionales (Con `useState`)**

Con los **Hooks** (`useState`), los componentes funcionales pueden manejar estado fácilmente.

📌 **Ejemplo de `useState` en un componente funcional:**

```jsx
import { useState } from "react";

function Contador() {
  const [contador, setContador] = useState(0);

  return (
    <div>
      <p>Contador: {contador}</p>
      <button onClick={() => setContador(contador + 1)}>Incrementar</button>
    </div>
  );
}

export default Contador;
```

🚀 **Ventajas de `useState` sobre el estado en clases**:
✔ Más simple y fácil de entender.  
✔ Menos código.  
✔ Compatible con el renderizado concurrente de React 18.

---

## **Conclusión**

- React usa **componentes** para construir la UI.
- Se prefieren los **componentes funcionales** en lugar de las clases.
- **`props`** permite pasar datos entre componentes.
- **`state`** permite manejar datos internos y actualizar la UI dinámicamente.

# **Hooks en React** 🏗️⚛️

Los **Hooks** fueron introducidos en React 16.8 y permiten usar el **estado** y otras funcionalidades de React en **componentes funcionales**.

## **1. Hook `useState`: Manejo de Estado**

📌 **¿Qué hace `useState`?**  
Permite agregar **estado local** a un componente funcional, reemplazando el `this.state` de los componentes de clase.

### **Ejemplo básico: Contador con `useState`**

```jsx
import { useState } from "react";

function Contador() {
  const [contador, setContador] = useState(0);

  return (
    <div>
      <p>Contador: {contador}</p>
      <button onClick={() => setContador(contador + 1)}>Incrementar</button>
    </div>
  );
}

export default Contador;
```

### **Explicación:**

1. `useState(0)` inicializa el estado con **0**.
2. `contador` es la **variable de estado**.
3. `setContador` es la **función para actualizar el estado**.
4. Cuando se hace click en el botón, se actualiza el estado con `setContador(contador + 1)`, lo que **re-renderiza** el componente.

---

## **2. Hook `useEffect`: Manejo de Efectos Secundarios**

📌 **¿Qué hace `useEffect`?**  
Permite ejecutar código después del renderizado, reemplazando métodos de clase como `componentDidMount`, `componentDidUpdate` y `componentWillUnmount`.

### **Ejemplo básico: Mostrar un mensaje en la consola**

```jsx
import { useState, useEffect } from "react";

function Mensaje() {
  const [mensaje, setMensaje] = useState("Hola, React!");

  useEffect(() => {
    console.log("El componente se montó o actualizó");
  });

  return <h1>{mensaje}</h1>;
}

export default Mensaje;
```

### **Explicación:**

1. `useEffect(() => {...})` se ejecuta **después de cada renderizado**.
2. Cada vez que el componente se renderiza, el `console.log` se ejecuta.

---

### **Ejemplo con Dependencias (`[]` como segundo parámetro)**

Si queremos que `useEffect` se ejecute **solo una vez**, pasamos un **array vacío `[]`** como segundo parámetro.

```jsx
useEffect(() => {
  console.log("El componente se montó");
}, []); // Solo se ejecuta al montar el componente
```

📌 **Ejemplo práctico: Contador con `useEffect`**

```jsx
import { useState, useEffect } from "react";

function Contador() {
  const [contador, setContador] = useState(0);

  useEffect(() => {
    console.log(`El contador cambió a: ${contador}`);
  }, [contador]); // Se ejecuta solo cuando cambia "contador"

  return (
    <div>
      <p>Contador: {contador}</p>
      <button onClick={() => setContador(contador + 1)}>Incrementar</button>
    </div>
  );
}

export default Contador;
```

✅ **`useEffect` con dependencias (`[contador]`)**  
✔ Se ejecuta solo cuando cambia `contador`, evitando re-renderizados innecesarios.

---

## **Resumen** 📝

📌 `useState` → Maneja el estado dentro de un componente funcional.  
📌 `useEffect` → Ejecuta código después del renderizado (similar a `componentDidMount` y `componentDidUpdate`).  
📌 `useEffect(() => {...}, [])` → Se ejecuta solo una vez cuando el componente se monta.  
📌 `useEffect(() => {...}, [variable])` → Se ejecuta cada vez que `variable` cambia.

# **Hooks Avanzados en React** ⚛️🚀

Los Hooks avanzados permiten manejar estados globales, optimizar el rendimiento y simplificar la lógica en componentes complejos.

## **1. `useContext`: Estado Global sin Props**

📌 **¿Qué hace `useContext`?**  
Permite **compartir estado entre componentes** sin necesidad de pasar `props` manualmente en cada nivel de la jerarquía de componentes.

### **Ejemplo: Tema Oscuro/Claro con `useContext`**

📁 **`ThemeContext.js`** (Crear un **contexto** para compartir el tema)

```jsx
import { createContext, useState } from "react";

const ThemeContext = createContext();

export function ThemeProvider({ children }) {
  const [tema, setTema] = useState("claro");

  const toggleTema = () => {
    setTema(tema === "claro" ? "oscuro" : "claro");
  };

  return (
    <ThemeContext.Provider value={{ tema, toggleTema }}>
      {children}
    </ThemeContext.Provider>
  );
}

export default ThemeContext;
```

📁 **`App.js`** (Usar el contexto en la aplicación)

```jsx
import { useContext } from "react";
import ThemeContext from "./ThemeContext";

function BotonTema() {
  const { tema, toggleTema } = useContext(ThemeContext);

  return (
    <button
      onClick={toggleTema}
      style={{
        background: tema === "oscuro" ? "#333" : "#fff",
        color: tema === "oscuro" ? "#fff" : "#000",
      }}
    >
      Cambiar a {tema === "oscuro" ? "claro" : "oscuro"}
    </button>
  );
}

function App() {
  return (
    <ThemeProvider>
      <BotonTema />
    </ThemeProvider>
  );
}

export default App;
```

📝 **¿Por qué usar `useContext`?**
✔ Evita **prop drilling** (pasar `props` manualmente en cada nivel).  
✔ Facilita el manejo de estados globales (tema, autenticación, idioma).

---

## **2. `useReducer`: Manejo de Estado Complejo**

📌 **¿Qué hace `useReducer`?**  
Es una alternativa avanzada a `useState` para manejar **lógica de estado más compleja** con acciones y un `reducer`.

### **Ejemplo: Contador con `useReducer`**

```jsx
import { useReducer } from "react";

const initialState = { contador: 0 };

function reducer(state, action) {
  switch (action.type) {
    case "incrementar":
      return { contador: state.contador + 1 };
    case "decrementar":
      return { contador: state.contador - 1 };
    case "reset":
      return { contador: 0 };
    default:
      return state;
  }
}

function Contador() {
  const [state, dispatch] = useReducer(reducer, initialState);

  return (
    <div>
      <p>Contador: {state.contador}</p>
      <button onClick={() => dispatch({ type: "incrementar" })}>+</button>
      <button onClick={() => dispatch({ type: "decrementar" })}>-</button>
      <button onClick={() => dispatch({ type: "reset" })}>Reset</button>
    </div>
  );
}

export default Contador;
```

📝 **¿Cuándo usar `useReducer` en lugar de `useState`?**
✔ Cuando hay **múltiples estados relacionados**.  
✔ Si la lógica de actualización es **compleja** (ejemplo: carrito de compras).  
✔ Facilita la separación de lógica en una función `reducer` reutilizable.

---

## **3. `useMemo` y `useCallback`: Optimización de Renderizados**

📌 **¿Para qué sirven?**

- `useMemo` **memoriza cálculos** costosos para evitar recalcular en cada renderizado.
- `useCallback` **memoriza funciones** para evitar que se generen nuevas instancias en cada render.

### **Ejemplo de `useMemo`: Evitar Cálculos Innecesarios**

```jsx
import { useState, useMemo } from "react";

function CalculoPesado(num) {
  console.log("Calculando...");
  return num * 2; // Simulamos un cálculo pesado
}

function App() {
  const [contador, setContador] = useState(0);
  const [numero, setNumero] = useState(5);

  const resultado = useMemo(() => CalculoPesado(numero), [numero]);

  return (
    <div>
      <p>Resultado: {resultado}</p>
      <button onClick={() => setNumero(numero + 1)}>Aumentar Número</button>
      <button onClick={() => setContador(contador + 1)}>
        Contador: {contador}
      </button>
    </div>
  );
}

export default App;
```

📌 **Sin `useMemo`**, cada vez que cambiamos el contador, `CalculoPesado()` se ejecutaría de nuevo.  
📌 **Con `useMemo`**, solo se recalcula si `numero` cambia.

---

### **Ejemplo de `useCallback`: Evitar Recrear Funciones**

```jsx
import { useState, useCallback } from "react";

function Hijo({ incrementar }) {
  console.log("Render del hijo");
  return <button onClick={incrementar}>Incrementar</button>;
}

function App() {
  const [contador, setContador] = useState(0);

  const incrementar = useCallback(() => {
    setContador((c) => c + 1);
  }, []);

  return (
    <div>
      <p>Contador: {contador}</p>
      <Hijo incrementar={incrementar} />
    </div>
  );
}

export default App;
```

📌 **Sin `useCallback`**, cada render crea una nueva función `incrementar()`, causando render innecesario del hijo.  
📌 **Con `useCallback`**, React **memoriza la función** y evita re-renderes innecesarios.

---

## **📌 Resumen**

| Hook          | ¿Para qué sirve?                                          |
| ------------- | --------------------------------------------------------- |
| `useContext`  | Comparte estado global sin pasar `props` manualmente.     |
| `useReducer`  | Maneja estados complejos con un `reducer`.                |
| `useMemo`     | Memoriza valores para evitar cálculos innecesarios.       |
| `useCallback` | Memoriza funciones para evitar renderizados innecesarios. |

🔹 **Si tu estado es simple** → `useState`  
🔹 **Si necesitas estado global** → `useContext`  
🔹 **Si tu lógica de actualización es compleja** → `useReducer`  
🔹 **Si quieres optimizar cálculos** → `useMemo`  
🔹 **Si quieres optimizar funciones** → `useCallback`

# **Ciclo de Vida en React** 🔄⚛️

El **ciclo de vida** de un componente en React se refiere a las diferentes etapas por las que pasa un componente desde su **creación**, **actualización** y **desmontaje**.

## **1. Antes de los Hooks: Ciclo de Vida en Componentes de Clase** 🏛️

Antes de los Hooks, los componentes de clase tenían métodos específicos para manejar su ciclo de vida:

| Método                 | ¿Cuándo se ejecuta?                                                                                    |
| ---------------------- | ------------------------------------------------------------------------------------------------------ |
| `componentDidMount`    | Después del primer render (equivalente a `useEffect(() => {...}, [])`).                                |
| `componentDidUpdate`   | Cuando el componente se actualiza (equivalente a `useEffect(() => {...}, [dependencias])`).            |
| `componentWillUnmount` | Antes de que el componente se elimine (equivalente a `useEffect(() => {... return () => {...}}, [])`). |

### **Ejemplo en un Componente de Clase**

```jsx
import React, { Component } from "react";

class CicloDeVida extends Component {
  constructor() {
    super();
    this.state = { contador: 0 };
  }

  componentDidMount() {
    console.log("El componente se montó ✅");
  }

  componentDidUpdate(prevProps, prevState) {
    console.log(`El componente se actualizó. Contador: ${this.state.contador}`);
  }

  componentWillUnmount() {
    console.log("El componente se desmontó ❌");
  }

  render() {
    return (
      <div>
        <p>Contador: {this.state.contador}</p>
        <button
          onClick={() => this.setState({ contador: this.state.contador + 1 })}
        >
          Incrementar
        </button>
      </div>
    );
  }
}

export default CicloDeVida;
```

---

## **2. Después de los Hooks: `useEffect` en Componentes Funcionales** 🏗️

Con la llegada de los Hooks en React 16.8, **`useEffect` reemplaza los métodos del ciclo de vida** en componentes funcionales.

📌 **`useEffect` se ejecuta después de que React actualiza el DOM.**  
📌 **El segundo parámetro (`[]` o `[dependencias]`) controla cuándo se ejecuta.**

### **Ejemplo: Equivalente a `componentDidMount`**

```jsx
import { useEffect } from "react";

function App() {
  useEffect(() => {
    console.log("El componente se montó ✅");
  }, []); // Se ejecuta solo una vez

  return <h1>Hola, React!</h1>;
}

export default App;
```

✅ **Se ejecuta solo una vez, cuando el componente se monta.**

---

### **Ejemplo: Equivalente a `componentDidUpdate`**

```jsx
import { useState, useEffect } from "react";

function Contador() {
  const [contador, setContador] = useState(0);

  useEffect(() => {
    console.log(`El contador cambió a: ${contador}`);
  }, [contador]); // Se ejecuta cuando "contador" cambia

  return (
    <div>
      <p>Contador: {contador}</p>
      <button onClick={() => setContador(contador + 1)}>Incrementar</button>
    </div>
  );
}

export default Contador;
```

✅ **Se ejecuta cada vez que `contador` cambia.**

---

## **3. Limpieza de efectos con `useEffect`: Equivalente a `componentWillUnmount`** 🗑️

Cuando un componente se desmonta, podemos **limpiar efectos secundarios** como:

- **Eliminar event listeners**
- **Detener intervalos o timeouts**
- **Cancelar suscripciones a APIs**

📌 Para esto, **`useEffect` retorna una función de limpieza.**

### **Ejemplo: Intervalo de tiempo con limpieza**

```jsx
import { useState, useEffect } from "react";

function Temporizador() {
  const [segundos, setSegundos] = useState(0);

  useEffect(() => {
    const intervalo = setInterval(() => {
      setSegundos((s) => s + 1);
    }, 1000);

    return () => {
      clearInterval(intervalo);
      console.log("Temporizador detenido ❌");
    };
  }, []);

  return <p>Tiempo: {segundos} segundos</p>;
}

export default Temporizador;
```

✅ **Cada vez que el componente se desmonta, `clearInterval(intervalo)` se ejecuta y detiene el temporizador.**

---

## **📌 Resumen**

| Método de Clase        | `useEffect` Equivalente                         |
| ---------------------- | ----------------------------------------------- |
| `componentDidMount`    | `useEffect(() => {...}, [])`                    |
| `componentDidUpdate`   | `useEffect(() => {...}, [dependencias])`        |
| `componentWillUnmount` | `useEffect(() => {... return () => {...}}, [])` |

📌 **Antes (Clase)**: Usábamos métodos como `componentDidMount`.  
📌 **Ahora (Funcional)**: Usamos `useEffect` con dependencias para controlar cuándo se ejecuta.  
📌 **Para limpiar efectos secundarios**, `useEffect` retorna una función que se ejecuta cuando el componente se desmonta.

# **React Router: Navegación en una Aplicación React** 🌐⚛️

React Router es la **biblioteca estándar** para manejar la navegación en aplicaciones React de una sola página (**SPA**, _Single Page Application_). Permite cambiar de vista sin recargar la página, mejorando la experiencia de usuario.

## **1. Instalación de React Router**

Si aún no tenés instalado React Router, podés hacerlo con:

```sh
npm install react-router-dom
```

o con Yarn:

```sh
yarn add react-router-dom
```

---

## **2. Configuración Básica de Rutas** 🛤️

Para definir rutas en React usamos `<BrowserRouter>` junto con `<Routes>` y `<Route>`.  
📌 **Estructura básica de rutas en React Router 6:**

```jsx
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./Home";
import About from "./About";
import NotFound from "./NotFound";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
```

🔹 **`<BrowserRouter>`**: Envuelve toda la aplicación y habilita la navegación.  
🔹 **`<Routes>`**: Contenedor de todas las rutas definidas.  
🔹 **`<Route>`**: Define una ruta con `path` y el componente a renderizar (`element`).  
🔹 **`path="*"`**: Ruta de **404 Not Found** para manejar rutas inexistentes.

---

## **3. Enlaces de Navegación con `<Link>`** 🔗

Para navegar entre páginas sin recargar la web, usamos `<Link>` en lugar de `<a>`.

📌 **Ejemplo: Barra de navegación con `<Link>`**

```jsx
import { Link } from "react-router-dom";

function Navbar() {
  return (
    <nav>
      <ul>
        <li>
          <Link to="/">Inicio</Link>
        </li>
        <li>
          <Link to="/about">Acerca de</Link>
        </li>
      </ul>
    </nav>
  );
}

export default Navbar;
```

🔹 **Ventaja de `<Link>`**: No recarga la página, mejorando la experiencia del usuario.

---

## **4. Parámetros en las Rutas (`useParams`)** 🆔

Podemos capturar valores dinámicos en la URL, como un ID de producto o usuario.

📌 **Ejemplo: Ruta dinámica con `useParams`**

```jsx
import { useParams } from "react-router-dom";

function Perfil() {
  const { usuarioId } = useParams();

  return <h2>Perfil del usuario con ID: {usuarioId}</h2>;
}
```

📌 **Definimos la ruta con `:usuarioId` en `App.js`**

```jsx
<Route path="/perfil/:usuarioId" element={<Perfil />} />
```

🔹 Si visitamos **`/perfil/123`**, `usuarioId` será `"123"`.

---

## **5. Redirecciones con `useNavigate`** 🔄

📌 **Ejemplo: Botón que redirige al usuario a otra página**

```jsx
import { useNavigate } from "react-router-dom";

function Inicio() {
  const navigate = useNavigate();

  return (
    <div>
      <h2>Bienvenido</h2>
      <button onClick={() => navigate("/about")}>Ir a Acerca de</button>
    </div>
  );
}
```

🔹 `navigate("/about")` **redirecciona al usuario** a la página `/about`.

---

## **📌 Resumen**

| Concepto          | Descripción                                      |
| ----------------- | ------------------------------------------------ |
| `<BrowserRouter>` | Componente que habilita la navegación en la app. |
| `<Routes>`        | Contenedor de rutas.                             |
| `<Route>`         | Define una ruta con su componente asociado.      |
| `<Link>`          | Enlace interno sin recargar la página.           |
| `useParams()`     | Obtiene parámetros dinámicos de la URL.          |
| `useNavigate()`   | Permite redirigir programáticamente.             |

# **Rutas Protegidas y Anidadas en React Router** 🔒🌍

En aplicaciones React más complejas, muchas veces necesitamos **proteger ciertas rutas** (por ejemplo, rutas de usuario autenticado) o **crear rutas dentro de otras** para una mejor organización. React Router facilita ambas funcionalidades.

## **1. Rutas Protegidas** 🔐

Las **rutas protegidas** son aquellas que solo pueden ser accesibles si el usuario está autenticado o autorizado. Para implementar esto, podemos usar un **componente de "guardia"** que valide si el usuario tiene acceso antes de permitirle ver la ruta.

### **Pasos para crear rutas protegidas:**

1. Crear un estado de autenticación (por ejemplo, en el contexto o en el estado local).
2. Usar un **componente `PrivateRoute`** que valide si el usuario está autenticado.
3. Redirigir a una página de **login** o **acceso denegado** si no está autenticado.

### **Ejemplo: Implementación de Rutas Protegidas**

#### 1. **Crear un contexto de autenticación** (opcional)

Primero, creamos un **contexto** para almacenar el estado de autenticación del usuario.

```jsx
import { createContext, useState, useContext } from "react";

const AuthContext = createContext();

export function AuthProvider({ children }) {
  const [isAuthenticated, setIsAuthenticated] = useState(false);

  const login = () => setIsAuthenticated(true);
  const logout = () => setIsAuthenticated(false);

  return (
    <AuthContext.Provider value={{ isAuthenticated, login, logout }}>
      {children}
    </AuthContext.Provider>
  );
}

export const useAuth = () => useContext(AuthContext);
```

#### 2. **Componente `PrivateRoute`**

Este componente redirige a la página de login si el usuario no está autenticado.

```jsx
import { Navigate } from "react-router-dom";
import { useAuth } from "./AuthContext";

function PrivateRoute({ children }) {
  const { isAuthenticated } = useAuth();
  return isAuthenticated ? children : <Navigate to="/login" />;
}
```

#### 3. **Uso de `PrivateRoute` en las rutas**

Ahora envolvemos las rutas protegidas con `PrivateRoute` en la configuración de las rutas.

```jsx
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { AuthProvider } from "./AuthContext";
import Home from "./Home";
import About from "./About";
import Dashboard from "./Dashboard";
import Login from "./Login";
import PrivateRoute from "./PrivateRoute";

function App() {
  return (
    <AuthProvider>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/login" element={<Login />} />
          <Route
            path="/dashboard"
            element={
              <PrivateRoute>
                <Dashboard />
              </PrivateRoute>
            }
          />
        </Routes>
      </BrowserRouter>
    </AuthProvider>
  );
}

export default App;
```

#### 4. **Simular el login**

En el componente `Login`, vamos a permitir al usuario autenticarse.

```jsx
import { useAuth } from "./AuthContext";

function Login() {
  const { login } = useAuth();

  return (
    <div>
      <h2>Login</h2>
      <button onClick={login}>Iniciar sesión</button>
    </div>
  );
}

export default Login;
```

---

## **2. Rutas Anidadas** 🏠🔽

Las **rutas anidadas** permiten que una ruta tenga otras rutas dentro de ella. Esto es útil para crear interfaces más complejas, como un panel de usuario con varias secciones.

### **Pasos para crear rutas anidadas:**

1. Definir una **ruta principal** (padre) que tendrá sus propias rutas secundarias (hijas).
2. Usar el componente `<Outlet>` para renderizar las rutas hijas dentro del componente padre.

### **Ejemplo: Rutas Anidadas con un Panel de Usuario**

#### 1. **Estructura del componente principal (Panel)**

```jsx
import { Link, Outlet } from "react-router-dom";

function Panel() {
  return (
    <div>
      <h2>Panel de Usuario</h2>
      <nav>
        <ul>
          <li>
            <Link to="profile">Perfil</Link>
          </li>
          <li>
            <Link to="settings">Configuración</Link>
          </li>
        </ul>
      </nav>
      <Outlet /> {/* Aquí se renderizarán las rutas hijas */}
    </div>
  );
}

export default Panel;
```

#### 2. **Definir las rutas hijas en `App.js`**

```jsx
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Panel from "./Panel";
import Profile from "./Profile";
import Settings from "./Settings";
import Home from "./Home";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/panel" element={<Panel />}>
          <Route path="profile" element={<Profile />} />
          <Route path="settings" element={<Settings />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
```

#### 3. **Definir los componentes hijos (`Profile` y `Settings`)**

```jsx
function Profile() {
  return <h3>Perfil del Usuario</h3>;
}

function Settings() {
  return <h3>Configuración del Usuario</h3>;
}
```

---

## **📌 Resumen**

| Concepto             | Descripción                                                                         |
| -------------------- | ----------------------------------------------------------------------------------- |
| **Rutas Protegidas** | Componente que restringe acceso a rutas dependiendo del estado de autenticación.    |
| **`PrivateRoute`**   | Componente que redirige a otra página si el usuario no está autenticado.            |
| **`Outlet`**         | Se usa en rutas anidadas para renderizar rutas hijas dentro de un componente padre. |

---

...
