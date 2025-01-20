# CSS

## 1. **Introducción a CSS**

### **¿Qué es CSS y para qué se usa?**

**CSS (Cascading Style Sheets)** es un lenguaje utilizado para describir la presentación y el diseño de un documento web escrito en HTML o XML. Su principal función es controlar cómo los elementos del documento se ven en diferentes dispositivos o pantallas.

Con CSS podés:

- Estilizar elementos (como texto, colores, márgenes, bordes, tamaños, etc.).
- Crear diseños responsivos (que se adapten a distintos tamaños de pantalla).
- Separar el contenido (HTML) de su presentación, facilitando el mantenimiento y la reutilización del código.

Por ejemplo, podés hacer que un título sea rojo y esté centrado, o diseñar un botón que cambie de color al pasar el mouse por encima.

---

### **Tipos de CSS**

CSS puede incluirse en un documento HTML de tres maneras principales:

#### **1. CSS Inline** (`style=""`)

Se escribe directamente en la etiqueta HTML utilizando el atributo `style`. Es útil para aplicar estilos a elementos individuales, pero no se recomienda para proyectos grandes, ya que dificulta el mantenimiento y la limpieza del código.

**Ejemplo:**

```html
<h1 style="color: red; text-align: center;">Este es un título rojo centrado</h1>
```

**Ventajas:**

- Fácil de usar en casos específicos.
- Ideal para pruebas rápidas.

**Desventajas:**

- Difícil de mantener en documentos grandes.
- Mezcla contenido y estilos, rompiendo el principio de separación.

---

#### **2. CSS Interno** (`<style>`)

Se escribe dentro de la etiqueta `<style>` que se incluye en la sección `<head>` del documento HTML. Este método es útil si los estilos son específicos para una sola página.

**Ejemplo:**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <title>Ejemplo CSS Interno</title>
    <style>
      h1 {
        color: blue;
        text-align: left;
      }
      p {
        font-size: 18px;
        line-height: 1.5;
      }
    </style>
  </head>
  <body>
    <h1>Este es un título azul</h1>
    <p>
      Este es un párrafo con tamaño de fuente ajustado y espaciado entre líneas.
    </p>
  </body>
</html>
```

**Ventajas:**

- Ideal para páginas individuales.
- Mantiene los estilos separados del contenido HTML.

**Desventajas:**

- No se puede reutilizar el código en múltiples páginas.

---

#### **3. CSS Externo** (`<link>`)

Se escribe en un archivo separado con extensión `.css`, que luego se vincula al archivo HTML mediante la etiqueta `<link>` en el `<head>`. Este es el enfoque más recomendado para proyectos grandes.

**Ejemplo del archivo CSS (`estilos.css`):**

```css
h1 {
  color: green;
  text-align: center;
}

p {
  font-size: 16px;
  line-height: 1.8;
  color: gray;
}
```

**Ejemplo del archivo HTML que lo enlaza:**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <title>Ejemplo CSS Externo</title>
    <link rel="stylesheet" href="estilos.css" />
  </head>
  <body>
    <h1>Este es un título verde</h1>
    <p>Este es un párrafo con estilo aplicado desde un archivo externo.</p>
  </body>
</html>
```

**Ventajas:**

- Los estilos pueden reutilizarse en varias páginas.
- Facilita el mantenimiento y la organización del proyecto.
- La carga de las páginas es más rápida, ya que el navegador puede guardar el archivo CSS en caché.

**Desventajas:**

- No es útil para pruebas rápidas o estilos muy específicos de una sola página.

---

### **Cuándo usar cada tipo de CSS**

- **Inline:** Para ajustes rápidos o pruebas específicas, aunque no se recomienda su uso en producción.
- **Interno:** Cuando los estilos son exclusivos de una sola página y no se planea reutilizarlos.
- **Externo:** Para proyectos completos o cualquier caso en el que se necesite mantener consistencia en múltiples páginas.

### **Sintaxis básica de CSS**

La estructura básica de CSS consiste en **selectores**, **propiedades** y **valores**. A continuación, te explico cada parte:

---

### **Selectores**

Un **selector** es lo que identifica los elementos HTML a los que se aplicará el estilo. Hay varios tipos:

#### **Selectores básicos**

- **Universal (`*`)**: Aplica estilos a todos los elementos.
  ```css
  * {
    margin: 0;
    padding: 0;
  }
  ```
- **Por etiqueta**: Aplica estilos a todas las etiquetas de un tipo específico.
  ```css
  p {
    color: blue;
  }
  ```
- **Por clase (`.`)**: Aplica estilos a los elementos con una clase específica.
  ```css
  .titulo {
    font-size: 24px;
  }
  ```
  HTML asociado:
  ```html
  <h1 class="titulo">Hola</h1>
  ```
- **Por ID (`#`)**: Aplica estilos a un elemento con un ID único.
  ```css
  #banner {
    background-color: yellow;
  }
  ```
  HTML asociado:
  ```html
  <div id="banner">Este es el banner</div>
  ```

---

#### **Selectores avanzados**

- **Descendiente (hijo dentro de un contenedor):**

  ```css
  div p {
    color: red;
  }
  ```

  Afecta solo a los párrafos dentro de `div`.

- **Selector de grupo (varios elementos):**
  ```css
  h1,
  h2,
  h3 {
    font-family: Arial, sans-serif;
  }
  ```
  Aplica el mismo estilo a los tres elementos.

---

### **2. Propiedades**

Las **propiedades** definen qué aspecto del elemento estás modificando, como el color, tamaño, márgenes, etc.

Algunas de las propiedades más comunes:

- **`color`**: Cambia el color del texto.
- **`background-color`**: Cambia el color de fondo.
- **`font-size`**: Cambia el tamaño de la fuente.
- **`margin`**: Define el espacio exterior del elemento.
- **`padding`**: Define el espacio interior del elemento.
- **`border`**: Añade bordes alrededor del elemento.

---

### **3. Valores**

Los **valores** son los datos asignados a las propiedades y definen cómo se aplicará el estilo.

Ejemplos:

- Colores:
  ```css
  color: red; /* Por nombre */
  background-color: #ff0000; /* Por código hexadecimal */
  ```
- Tamaños:
  ```css
  font-size: 16px; /* Tamaño absoluto en píxeles */
  width: 50%; /* Tamaño relativo en porcentaje */
  ```
- Otros:
  ```css
  text-align: center; /* Centra el texto */
  display: flex; /* Activa el modelo flexbox */
  ```

---

### **Ejemplo completo**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Sintaxis CSS</title>
    <style>
      /* Selector universal */
      * {
        margin: 0;
        padding: 0;
      }

      /* Selector por etiqueta */
      body {
        font-family: Arial, sans-serif;
        line-height: 1.6;
      }

      /* Selector por clase */
      .titulo {
        color: darkblue;
        font-size: 28px;
        text-align: center;
      }

      /* Selector por ID */
      #contenido {
        padding: 20px;
        background-color: #f4f4f4;
      }

      /* Selector avanzado: descendiente */
      #contenido p {
        color: gray;
      }
    </style>
  </head>
  <body>
    <h1 class="titulo">Ejemplo de CSS</h1>
    <div id="contenido">
      <p>Este es un párrafo dentro de un contenedor.</p>
      <p>Otro párrafo más.</p>
    </div>
  </body>
</html>
```

---

### **Resumen**

1. Los **selectores** indican qué elementos estilizar.
2. Las **propiedades** determinan qué aspecto estilizar.
3. Los **valores** aplican el estilo deseado.

## 2. **Selectores Básicos**

### **1. Selectores simples**

Estos selectores se utilizan para seleccionar elementos directamente en función de su nombre, clase o ID.

1. **Selector de elemento (`element`)**  
   Selecciona todos los elementos de un tipo específico.

   ```css
   h1 {
     color: blue;
   }
   ```

   Aplica el color azul a todos los elementos `<h1>` del documento.

2. **Selector de clase (`.class`)**  
   Selecciona elementos que tienen una clase específica.

   ```css
   .destacado {
     background-color: yellow;
   }
   ```

   HTML asociado:

   ```html
   <p class="destacado">Este párrafo tiene un fondo amarillo.</p>
   ```

3. **Selector de ID (`#id`)**  
   Selecciona un elemento único con un ID específico.
   ```css
   #principal {
     font-size: 20px;
   }
   ```
   HTML asociado:
   ```html
   <div id="principal">Este texto tiene un tamaño de fuente de 20px.</div>
   ```

---

### **2. Combinadores**

Los combinadores permiten seleccionar elementos basándose en su relación con otros elementos en el DOM.

##### **A. Combinador descendiente (`element1 element2`)**

Selecciona todos los elementos `element2` que estén dentro de `element1`, sin importar cuántos niveles de anidación haya.

```css
div p {
  color: red;
}
```

HTML asociado:

```html
<div>
  <p>Este párrafo está dentro de un div y será rojo.</p>
  <section>
    <p>Este también porque está dentro del div.</p>
  </section>
</div>
```

#### **B. Combinador de hijo directo (`element1 > element2`)**

Selecciona solo los elementos `element2` que sean hijos directos de `element1`.

```css
div > p {
  color: green;
}
```

HTML asociado:

```html
<div>
  <p>Este párrafo será verde porque es hijo directo de div.</p>
  <section>
    <p>Este no será afectado porque no es hijo directo de div.</p>
  </section>
</div>
```

#### **C. Combinador de hermanos adyacentes (`element1 + element2`)**

Selecciona el primer elemento `element2` que sea inmediatamente después de `element1` (hermano directo).

```css
h1 + p {
  font-style: italic;
}
```

HTML asociado:

```html
<h1>Título</h1>
<p>Este párrafo será cursiva porque sigue inmediatamente al h1.</p>
<p>Este no será afectado.</p>
```

#### **D. Combinador de hermanos generales (`element1 ~ element2`)**

Selecciona todos los elementos `element2` que sean hermanos de `element1` (pero no necesariamente adyacentes).

```css
h1 ~ p {
  color: purple;
}
```

HTML asociado:

```html
<h1>Título</h1>
<p>Este párrafo será morado porque es hermano de h1.</p>
<p>Este también será morado.</p>
```

---

### **Ejemplo completo**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Ejemplo de Selectores</title>
    <style>
      /* Selectores simples */
      h1 {
        color: blue; /* Selecciona todos los h1 */
      }
      .destacado {
        background-color: yellow; /* Selecciona elementos con clase "destacado" */
      }
      #principal {
        font-size: 20px; /* Selecciona el elemento con ID "principal" */
      }

      /* Combinadores */
      div p {
        color: red; /* Párrafos dentro de un div */
      }
      div > p {
        font-weight: bold; /* Párrafos hijos directos de un div */
      }
      h2 + p {
        font-style: italic; /* Primer párrafo después de un h2 */
      }
      h2 ~ p {
        text-decoration: underline; /* Todos los párrafos hermanos de un h2 */
      }
    </style>
  </head>
  <body>
    <h1>Título principal</h1>
    <div id="principal">
      <p>Este párrafo es hijo directo de un div y será rojo y negrita.</p>
      <section>
        <p>Este párrafo no será afectado por el selector de hijo directo.</p>
      </section>
    </div>
    <h2>Título secundario</h2>
    <p>Párrafo inmediatamente después de h2, será cursiva y subrayado.</p>
    <p>Otro párrafo, solo subrayado.</p>
  </body>
</html>
```

### **Selectores de atributos en CSS**

Los **selectores de atributos** permiten seleccionar elementos HTML basados en la presencia de un atributo o en el valor de ese atributo. Son útiles para aplicar estilos de manera específica sin necesidad de clases o IDs adicionales.

---

### **Tipos de selectores de atributos**

#### **1. `[attr]`**

Selecciona elementos que contienen el atributo especificado, sin importar su valor.

**Ejemplo:**

```css
[required] {
  border: 2px solid orange;
}
```

HTML asociado:

```html
<input type="text" required />
<textarea required></textarea>
<button>Enviar</button>
```

- El estilo se aplica a los elementos `<input>` y `<textarea>` porque tienen el atributo `required`.
- No afecta al `<button>` porque no tiene el atributo `required`.

---

#### **2. `[attr=value]`**

Selecciona elementos cuyo atributo tiene un valor específico.

**Ejemplo:**

```css
[type="text"] {
  background-color: lightgray;
}
```

HTML asociado:

```html
<input type="text" /> <input type="password" />
```

- Solo el `<input type="text">` tendrá un fondo gris, ya que coincide exactamente con el valor.

---

#### **3. `[attr^=value]`**

Selecciona elementos cuyo atributo comienza con un valor específico (**`^` significa "empieza con"**).

**Ejemplo:**

```css
[src^="media"] {
  color: green;
}
```

HTML asociado:

```html
<img src="media1.jpg" alt="Imagen 1" />
<img src="media2.jpg" alt="Imagen 2" />
<img src="other.jpg" alt="Otra imagen" />
```

- Solo los elementos `<img>` cuyo atributo `src` comienza con `"media"` se verán afectados.

---

#### **4. `[attr$=value]`**

Selecciona elementos cuyo atributo termina con un valor específico (**`$` significa "termina con"**).

**Ejemplo:**

```css
[src$=".jpg"] {
  border: 1px solid red;
}
```

HTML asociado:

```html
<img src="photo.jpg" alt="Foto" /> <img src="graphic.png" alt="Gráfico" />
```

- Solo `<img src="photo.jpg">` será afectado, ya que su atributo `src` termina con `.jpg`.

---

### **Otros selectores útiles (opcional para ampliar)**

- **`[attr*=value]`**: Selecciona elementos cuyo atributo contiene el valor especificado en cualquier parte.
  ```css
  [href*="example"] {
    text-decoration: underline;
  }
  ```
  HTML asociado:
  ```html
  <a href="https://example.com">Enlace 1</a>
  <a href="https://otherexample.com">Enlace 2</a>
  ```
  - Subrayará los enlaces que contienen `"example"` en el atributo `href`.

---

### **Ejemplo completo de uso práctico**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Ejemplo de selectores de atributos</title>
    <style>
      /* [attr]: Elementos con un atributo específico */
      [required] {
        border: 2px solid orange;
      }

      /* [attr=value]: Elementos con un atributo igual a cierto valor */
      [type="password"] {
        background-color: lightyellow;
      }

      /* [attr^=value]: Elementos cuyo atributo empieza con un valor */
      [href^="https"] {
        color: green;
      }

      /* [attr$=value]: Elementos cuyo atributo termina con un valor */
      [href$=".pdf"] {
        font-weight: bold;
        color: red;
      }
    </style>
  </head>
  <body>
    <form>
      <input type="text" placeholder="Nombre" required />
      <input type="password" placeholder="Contraseña" />
      <button type="submit">Enviar</button>
    </form>

    <a href="https://example.com">Enlace seguro</a>
    <a href="http://example.com">Enlace inseguro</a>
    <a href="manual.pdf">Descargar manual</a>
  </body>
</html>
```

---

### **Resumen rápido**

1. **`[attr]`**: Selecciona elementos con un atributo específico.
2. **`[attr=value]`**: Selecciona elementos con un atributo que tiene un valor exacto.
3. **`[attr^=value]`**: Selecciona elementos cuyo atributo comienza con el valor.
4. **`[attr$=value]`**: Selecciona elementos cuyo atributo termina con el valor.

## 3. **Box Model**

### **Box Model (Modelo de Caja)**

El **Box Model** es un concepto fundamental en CSS que describe cómo se calculan el tamaño y el espacio ocupado por un elemento en una página web. Cada elemento en HTML se representa como una caja rectangular compuesta de varias capas.

![alt text](https://www.simplilearn.com/ice9/free_resources_article_thumb/CSS-Box-Model.png)

### **Componentes del Box Model**

1. **Contenido (`content`)**

   - Es el área donde se muestra el contenido del elemento (texto, imágenes, etc.).
   - Las propiedades `width` y `height` definen su tamaño, pero no incluyen `padding`, `border` ni `margin`.

2. **Relleno (`padding`)**

   - Es el espacio entre el contenido y el borde del elemento.
   - Aumenta el tamaño total del elemento sin separar el elemento de otros elementos.

3. **Borde (`border`)**

   - Es el contorno que rodea el contenido y el padding.
   - Su grosor se define con la propiedad `border-width`.

4. **Margen (`margin`)**
   - Es el espacio entre el borde del elemento y los elementos circundantes.
   - Sirve para separar visualmente un elemento de otros.

---

### **Relación entre las propiedades**

El tamaño total de una caja se calcula como:

```text
Ancho total = margin izquierdo + border izquierdo + padding izquierdo + width + padding derecho + border derecho + margin derecho
Altura total = margin superior + border superior + padding superior + height + padding inferior + border inferior + margin inferior
```

---

### **Propiedades importantes del Box Model**

#### **1. `margin`**

Espacio exterior entre la caja y otros elementos. Puede definirse para cada lado individualmente o como un valor general.

Ejemplo:

```css
div {
  margin: 10px; /* Aplica 10px a todos los lados */
  margin-top: 5px;
  margin-right: 15px;
  margin-bottom: 10px;
  margin-left: 20px;
}
```

#### **2. `padding`**

Espacio interno entre el contenido y el borde.

Ejemplo:

```css
div {
  padding: 10px; /* Aplica 10px a todos los lados */
  padding-top: 5px;
  padding-right: 15px;
  padding-bottom: 10px;
  padding-left: 20px;
}
```

#### **3. `border`**

Define el grosor, estilo y color del borde.

Ejemplo:

```css
div {
  border: 2px solid black; /* Grosor de 2px, borde sólido, color negro */
}
```

#### **4. `width` y `height`**

Definen el ancho y alto del contenido del elemento (sin incluir `padding`, `border` ni `margin`, a menos que uses la propiedad `box-sizing`).

Ejemplo:

```css
div {
  width: 200px; /* Ancho del contenido */
  height: 100px; /* Altura del contenido */
}
```

---

### **Propiedad `box-sizing`**

La propiedad `box-sizing` controla cómo se calculan el ancho (`width`) y la altura (`height`) de un elemento:

1. **`content-box`** (valor predeterminado):

   - Solo se consideran `width` y `height` para el contenido.
   - El `padding` y el `border` **se suman** al tamaño total de la caja.

   ```css
   div {
     box-sizing: content-box; /* Por defecto */
   }
   ```

   Ejemplo:

   ```html
   <div style="width: 200px; padding: 20px; border: 10px solid;">Contenido</div>
   ```

   - Ancho total: `200px (contenido) + 20px (padding izquierdo) + 20px (padding derecho) + 10px (borde izquierdo) + 10px (borde derecho) = 260px`.

2. **`border-box`**:

   - El `width` y el `height` incluyen el contenido, el `padding` y el `border`.
   - Hace que el tamaño total de la caja sea más fácil de manejar.

   ```css
   div {
     box-sizing: border-box;
   }
   ```

   Ejemplo:

   ```html
   <div style="width: 200px; padding: 20px; border: 10px solid;">Contenido</div>
   ```

   - Ancho total: `200px (contenido + padding + borde)`.

---

### **Ejemplo práctico**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Box Model</title>
    <style>
      .content-box {
        width: 200px;
        padding: 20px;
        border: 10px solid black;
        margin: 10px;
        box-sizing: content-box;
        background-color: lightblue;
      }

      .border-box {
        width: 200px;
        padding: 20px;
        border: 10px solid black;
        margin: 10px;
        box-sizing: border-box;
        background-color: lightgreen;
      }
    </style>
  </head>
  <body>
    <h1>Ejemplo de Box Model</h1>
    <div class="content-box">Content-box</div>
    <div class="border-box">Border-box</div>
  </body>
</html>
```

---

### **Diferencias clave entre `content-box` y `border-box`**

| Propiedad    | `content-box`                           | `border-box`                       |
| ------------ | --------------------------------------- | ---------------------------------- |
| Tamaño total | Incluye `width` + `padding` + `border`. | `width` incluye todo.              |
| Gestión      | Más complicado calcular el tamaño real. | Más simple para diseños complejos. |

![alt text](https://global.discourse-cdn.com/freecodecamp/original/3X/3/a/3a400a6d29bd5475c376bb7585d1a29a7030ea39.png)

## 4. **Colores y Fondos**

### **Colores en CSS**

Los colores en CSS se pueden especificar de varias formas, cada una con su propio formato.

### **1. Nombres de colores**

CSS soporta varios **nombres predefinidos** de colores. Estos son simples de usar, pero están limitados a un conjunto reducido.

Ejemplo:

```css
div {
  color: red; /* Texto en color rojo */
  background-color: blue; /* Fondo azul */
}
```

Algunos ejemplos de nombres de colores:

- `red`, `blue`, `green`, `black`, `white`, `gray`, `yellow`, `pink`, `purple`, entre otros.

---

### **2. Hexadecimales (`#RRGGBB`)**

El formato **hexadecimal** es una forma más precisa de definir colores. El código tiene 6 dígitos (2 para cada componente de color: rojo, verde y azul).

- El formato es `#RRGGBB`, donde `RR`, `GG` y `BB` son valores hexadecimales que van de `00` a `FF` (en base 16). Cada par de dígitos representa un color (rojo, verde o azul).

Ejemplo:

```css
div {
  color: #ff0000; /* Rojo */
  background-color: #00ff00; /* Verde */
}
```

Explicación del color:

- `#ff0000` = rojo puro (rojo = `FF`, verde = `00`, azul = `00`).
- `#00ff00` = verde puro (rojo = `00`, verde = `FF`, azul = `00`).

---

### **3. RGB (Red, Green, Blue)**

**RGB** es un modelo de color basado en tres componentes: rojo, verde y azul. Cada componente puede tener un valor de 0 a 255, lo que da un total de 16.777.216 combinaciones posibles.

El formato es: `rgb(red, green, blue)`, donde cada valor se define entre `0` y `255`.

Ejemplo:

```css
div {
  color: rgb(255, 0, 0); /* Rojo */
  background-color: rgb(0, 255, 0); /* Verde */
}
```

Explicación del color:

- `rgb(255, 0, 0)` = rojo puro (rojo = `255`, verde = `0`, azul = `0`).
- `rgb(0, 255, 0)` = verde puro (rojo = `0`, verde = `255`, azul = `0`).

---

### **4. HSL (Hue, Saturation, Lightness)**

**HSL** describe el color mediante tres propiedades:

- **Hue** (matiz): un valor entre `0` y `360` grados, que representa el ángulo del color en el círculo cromático.
- **Saturation** (saturación): un valor entre `0%` y `100%` que define la intensidad del color.
- **Lightness** (luminosidad): un valor entre `0%` y `100%` que indica cuán claro o oscuro es el color.

El formato es: `hsl(hue, saturation%, lightness%)`.

Ejemplo:

```css
div {
  color: hsl(0, 100%, 50%); /* Rojo */
  background-color: hsl(120, 100%, 50%); /* Verde */
}
```

Explicación del color:

- `hsl(0, 100%, 50%)` = rojo puro (matiz = `0°`, saturación = `100%`, luminosidad = `50%`).
- `hsl(120, 100%, 50%)` = verde puro (matiz = `120°`, saturación = `100%`, luminosidad = `50%`).

---

### **5. Transparencia**

#### **RGBA (Red, Green, Blue, Alpha)**

La diferencia entre **RGB** y **RGBA** es el componente **Alpha** que controla la **opacidad** del color. Este valor puede ir de `0` (totalmente transparente) a `1` (totalmente opaco).

El formato es: `rgba(red, green, blue, alpha)`.

Ejemplo:

```css
div {
  color: rgba(255, 0, 0, 0.5); /* Rojo semitransparente */
  background-color: rgba(0, 255, 0, 0.3); /* Verde muy transparente */
}
```

Explicación del color:

- `rgba(255, 0, 0, 0.5)` = rojo semi-transparente (rojo = `255`, verde = `0`, azul = `0`, opacidad = `0.5`).
- `rgba(0, 255, 0, 0.3)` = verde semi-transparente (rojo = `0`, verde = `255`, azul = `0`, opacidad = `0.3`).

---

#### **HSLA (Hue, Saturation, Lightness, Alpha)**

**HSLA** es similar al **HSL**, pero con un componente adicional **Alpha** para controlar la transparencia.

El formato es: `hsla(hue, saturation%, lightness%, alpha)`.

Ejemplo:

```css
div {
  color: hsla(0, 100%, 50%, 0.5); /* Rojo semitransparente */
  background-color: hsla(120, 100%, 50%, 0.3); /* Verde muy transparente */
}
```

Explicación del color:

- `hsla(0, 100%, 50%, 0.5)` = rojo semi-transparente (matiz = `0°`, saturación = `100%`, luminosidad = `50%`, opacidad = `0.5`).
- `hsla(120, 100%, 50%, 0.3)` = verde semi-transparente (matiz = `120°`, saturación = `100%`, luminosidad = `50%`, opacidad = `0.3`).

---

#### **6. Propiedad `opacity`**

La propiedad `opacity` establece la opacidad de un elemento entero, no solo del color. El valor va de `0` (totalmente transparente) a `1` (totalmente opaco).

Ejemplo:

```css
div {
  opacity: 0.5; /* 50% de opacidad */
}
```

**Nota**: A diferencia de `rgba` y `hsla`, donde solo el color es transparente, `opacity` afecta la transparencia de todo el contenido del elemento (texto, imágenes, etc.).

---

### **Resumen:**

- **Colores simples**: Nombres (`red`), hexadecimales (`#ff0000`), RGB (`rgb(255, 0, 0)`), HSL (`hsl(0, 100%, 50%)`).
- **Colores con transparencia**: `rgba` y `hsla` añaden un valor adicional de opacidad.
- **`opacity`** afecta la opacidad de todo el elemento.

### **Fondos en CSS**

Las propiedades de fondo en CSS se usan para darle estilo al fondo de los elementos, ya sea con colores sólidos, imágenes, o gradientes.

### **1. `background-color`**

La propiedad **`background-color`** define el color de fondo de un elemento.

Ejemplo:

```css
div {
  background-color: #f0f0f0; /* Color de fondo gris claro */
}
```

También puedes usar nombres de colores, valores RGB, RGBA, hexadecimales, etc.

---

### **2. `background-image`**

La propiedad **`background-image`** establece una o más imágenes de fondo para un elemento. Puedes especificar imágenes en formato URL.

Ejemplo:

```css
div {
  background-image: url("imagen.jpg"); /* Establece una imagen de fondo */
}
```

Si quieres usar múltiples imágenes, puedes separarlas con comas:

```css
div {
  background-image: url("imagen1.jpg"), url("imagen2.jpg");
}
```

---

### **3. `background-size`**

La propiedad **`background-size`** especifica el tamaño de la imagen de fondo. Acepta varios valores:

- **`cover`**: La imagen de fondo cubre toda el área del elemento, pero puede recortarse para mantener su proporción.
- **`contain`**: La imagen se escala para que sea completamente visible dentro del área del elemento.
- Tamaños específicos en píxeles o porcentajes.

Ejemplo:

```css
div {
  background-image: url("imagen.jpg");
  background-size: cover; /* La imagen cubre todo el fondo */
}
```

---

### **4. `background-position`**

La propiedad **`background-position`** especifica la posición inicial de la imagen de fondo dentro del elemento. Se puede usar con valores de desplazamiento, como `left`, `right`, `top`, `bottom`, o usar valores numéricos (porcentaje o píxeles).

Ejemplo:

```css
div {
  background-image: url("imagen.jpg");
  background-position: center; /* Centra la imagen de fondo */
}
```

O también puedes usar valores específicos:

```css
div {
  background-image: url("imagen.jpg");
  background-position: 50% 50%; /* 50% desde la izquierda, 50% desde arriba */
}
```

---

### **5. `background-repeat`**

La propiedad **`background-repeat`** controla si una imagen de fondo se repite o no. Los valores posibles son:

- **`repeat`**: Repite la imagen tanto horizontal como verticalmente (valor predeterminado).
- **`no-repeat`**: No repite la imagen.
- **`repeat-x`**: Repite la imagen solo en el eje horizontal.
- **`repeat-y`**: Repite la imagen solo en el eje vertical.

Ejemplo:

```css
div {
  background-image: url("imagen.jpg");
  background-repeat: no-repeat; /* No repite la imagen */
}
```

---

### **Gradientes en CSS**

Los **gradientes** son transiciones suaves entre dos o más colores. En lugar de usar imágenes de fondo, los gradientes permiten crear efectos visuales dinámicos.

---

### **6. `linear-gradient`**

El gradiente **`linear-gradient`** crea una transición de colores en línea recta, desde un punto de inicio hasta un punto final. Se puede especificar la dirección del gradiente, como `to right`, `to bottom`, o con ángulos como `45deg`.

El formato es:

```css
background: linear-gradient(dirección, color1, color2, ...);
```

Ejemplo:

```css
div {
  background: linear-gradient(
    to right,
    red,
    yellow
  ); /* De rojo a amarillo de izquierda a derecha */
}
```

También se puede usar más de dos colores:

```css
div {
  background: linear-gradient(
    to bottom,
    red,
    yellow,
    green
  ); /* De rojo a amarillo a verde de arriba a abajo */
}
```

---

### **7. `radial-gradient`**

El gradiente **`radial-gradient`** crea una transición de colores desde el centro hacia fuera, de manera circular o elíptica.

El formato es:

```css
background: radial-gradient(shape size at position, color1, color2, ...);
```

Ejemplo:

```css
div {
  background: radial-gradient(
    circle,
    red,
    yellow,
    green
  ); /* De rojo a amarillo a verde en forma circular */
}
```

Puedes cambiar la forma del gradiente (por defecto es circular) y su tamaño:

```css
div {
  background: radial-gradient(ellipse farthest-corner, red, yellow);
}
```

---

### **Propiedades Combinadas para Fondos**

Es común usar varias propiedades de fondo juntas para crear efectos complejos. Puedes combinarlas en una sola declaración:

```css
div {
  background-color: #f0f0f0;
  background-image: url("imagen.jpg");
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;
}
```

---

### **Ejemplo práctico con gradientes y fondos**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Fondos y Gradientes</title>
    <style>
      .fondo-color {
        background-color: #add8e6; /* Fondo color azul claro */
        height: 200px;
      }

      .fondo-imagen {
        background-image: url("https://img.freepik.com/vector-gratis/fondo-acuarela-abstracta-acuarela-pintada-mano_361591-2658.jpg");
        background-size: cover;
        height: 200px;
      }

      .fondo-gradiente {
        background: linear-gradient(to right, red, yellow);
        height: 200px;
      }

      .fondo-radial {
        background: radial-gradient(circle, red, yellow, green);
        height: 200px;
      }
    </style>
  </head>
  <body>
    <div class="fondo-color">Fondo de color</div>
    <div class="fondo-imagen">Fondo de imagen</div>
    <div class="fondo-gradiente">Fondo con gradiente lineal</div>
    <div class="fondo-radial">Fondo con gradiente radial</div>
  </body>
</html>
```

---

### **Resumen:**

- **`background-color`**: Define un color de fondo sólido.
- **`background-image`**: Establece una o más imágenes de fondo.
- **`background-size`**: Controla el tamaño de la imagen de fondo.
- **`background-position`**: Define la posición de la imagen de fondo.
- **`background-repeat`**: Controla si la imagen de fondo se repite o no.
- **Gradientes**: Se crean con `linear-gradient` y `radial-gradient` para transiciones de colores dinámicas.

## 5. **Texto y Tipografía**

### **Propiedades de texto en CSS**

Las propiedades de texto en CSS se utilizan para controlar el estilo y la apariencia del texto en los elementos HTML.

### **1. `color`**

La propiedad **`color`** define el color del texto. Puedes usar colores predefinidos, valores hexadecimales, RGB, RGBA, HSL, etc.

Ejemplo:

```css
div {
  color: red; /* Color del texto rojo */
}
```

También puedes usar otros formatos como `#ff0000`, `rgb(255, 0, 0)`, `rgba(255, 0, 0, 0.5)`, entre otros.

---

### **2. `font-size`**

La propiedad **`font-size`** establece el tamaño de la fuente del texto. Puedes usar valores en píxeles (px), ems (em), porcentajes (%), etc.

Ejemplo:

```css
div {
  font-size: 20px; /* Tamaño de fuente de 20 píxeles */
}
```

O usando otras unidades:

```css
div {
  font-size: 2em; /* Tamaño de fuente relativo a la fuente de su elemento contenedor */
}
```

---

### **3. `font-weight`**

La propiedad **`font-weight`** define el grosor del texto. Los valores más comunes son:

- **`normal`** (por defecto, generalmente un grosor de 400).
- **`bold`** (negrita).
- Valores numéricos, donde `100` es el peso más delgado y `900` el más grueso.

Ejemplo:

```css
div {
  font-weight: bold; /* Texto en negrita */
}
```

O usando valores numéricos:

```css
div {
  font-weight: 700; /* Peso de fuente de 700 (negrita) */
}
```

---

### **4. `font-style`**

La propiedad **`font-style`** define el estilo de la fuente. Los valores posibles son:

- **`normal`** (por defecto, texto sin estilo especial).
- **`italic`** (texto en cursiva).
- **`oblique`** (similar a `italic`, pero puede ser un poco más inclinado dependiendo del navegador).

Ejemplo:

```css
div {
  font-style: italic; /* Texto en cursiva */
}
```

---

### **5. `line-height`**

La propiedad **`line-height`** establece la altura de la línea (espaciado vertical entre las líneas de texto). Es útil para mejorar la legibilidad.

Ejemplo:

```css
div {
  line-height: 1.5; /* Altura de línea 1.5 veces el tamaño de la fuente */
}
```

Puedes usar diferentes unidades como `px`, `%`, o simplemente un número (que se multiplicará por el tamaño de la fuente).

---

### **6. `text-align`**

La propiedad **`text-align`** define la alineación horizontal del texto dentro de un contenedor. Los valores posibles son:

- **`left`**: Alineación a la izquierda.
- **`right`**: Alineación a la derecha.
- **`center`**: Alineación centrada.
- **`justify`**: Alineación justificada (ajusta las palabras a lo largo de toda la línea, agregando espacios extra entre ellas).

Ejemplo:

```css
div {
  text-align: center; /* Alineación del texto centrada */
}
```

---

### **Espaciado en el texto**

---

### **7. `letter-spacing`**

La propiedad **`letter-spacing`** controla el espacio entre los caracteres del texto. Se puede usar valores en **px**, **em**, o **rem**.

Ejemplo:

```css
div {
  letter-spacing: 2px; /* Aumenta el espacio entre los caracteres */
}
```

Esto es útil cuando deseas modificar la separación entre letras para mejorar la legibilidad o para efectos visuales.

---

### **8. `word-spacing`**

La propiedad **`word-spacing`** controla el espacio entre las palabras. Al igual que con `letter-spacing`, se usa en valores como **px**, **em**, **rem**, etc.

Ejemplo:

```css
div {
  word-spacing: 5px; /* Aumenta el espacio entre las palabras */
}
```

Esto es útil para controlar la distancia entre las palabras, especialmente en bloques de texto grandes.

---

### **Ejemplo práctico:**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Propiedades de Texto</title>
    <style>
      .texto1 {
        color: red;
        font-size: 20px;
        font-weight: bold;
        font-style: italic;
        line-height: 1.5;
        text-align: center;
      }

      .texto2 {
        letter-spacing: 3px;
        word-spacing: 10px;
        font-size: 18px;
      }
    </style>
  </head>
  <body>
    <div class="texto1">Este es un texto con varias propiedades aplicadas.</div>
    <div class="texto2">
      Este es otro texto con espaciado entre letras y palabras.
    </div>
  </body>
</html>
```

---

### **Resumen:**

- **`color`**: Define el color del texto.
- **`font-size`**: Establece el tamaño de la fuente.
- **`font-weight`**: Define el grosor del texto (normal, bold, o un valor numérico).
- **`font-style`**: Controla el estilo del texto (normal, italic, oblique).
- **`line-height`**: Controla la altura de la línea (espaciado vertical entre líneas de texto).
- **`text-align`**: Define la alineación del texto (izquierda, derecha, centrado, justificado).
- **`letter-spacing`**: Controla el espacio entre caracteres.
- **`word-spacing`**: Controla el espacio entre palabras.

### **Familias Tipográficas en CSS**

La propiedad **`font-family`** se utiliza para definir qué fuente se utilizará en el texto de un elemento HTML. En CSS, puedes especificar una lista de fuentes, de manera que si la primera fuente no está disponible en el sistema del usuario, se pruebe con la siguiente, y así sucesivamente. Esto se denomina **cascada**.

### **1. `font-family`**

La propiedad **`font-family`** acepta varios valores:

- **Nombre de la fuente**: Puedes especificar una fuente en particular, como `"Arial"`, `"Times New Roman"`, etc.
- **Grupo genérico de fuentes**: Son categorías generales de fuentes, como `serif`, `sans-serif`, `monospace`, `cursive`, y `fantasy`.
- **Lista de fuentes**: Puedes proporcionar una lista de fuentes, separadas por comas, para que el navegador utilice la primera fuente disponible.

#### Sintaxis:

```css
font-family: "Nombre de la fuente", "Familia genérica";
```

#### Ejemplo:

```css
div {
  font-family: "Arial", sans-serif; /* Si "Arial" no está disponible, usa cualquier fuente sans-serif */
}
```

En este caso, si el navegador no encuentra la fuente `"Arial"`, usará cualquier fuente del tipo **sans-serif**.

---

### **2. Uso de fuentes externas con `@font-face`**

La regla **`@font-face`** permite definir una fuente personalizada que puede ser cargada desde un archivo externo. Es útil cuando quieres usar una fuente que no está instalada en el dispositivo del usuario. Puedes incluir fuentes en formatos como `.woff`, `.woff2`, `.ttf`, entre otros.

#### Sintaxis básica:

```css
@font-face {
  font-family: "Nombre de la fuente";
  src: url("ruta/a/la/fuente.woff2") format("woff2"), url("ruta/a/la/fuente.woff")
      format("woff");
}
```

#### Ejemplo:

```css
@font-face {
  font-family: "MiFuentePersonalizada";
  src: url("fuente.ttf") format("truetype");
}

div {
  font-family: "MiFuentePersonalizada", sans-serif;
}
```

En este caso, cuando el navegador carga la página, buscará el archivo de la fuente `fuente.ttf` y, si está disponible, la aplicará al texto dentro del elemento `div`.

---

### **3. Uso de Google Fonts**

Google Fonts es una biblioteca gratuita de fuentes web que puedes utilizar fácilmente en tu proyecto. Puedes integrarlas directamente desde la web mediante un enlace `link`, o importarlas en tu CSS mediante la regla **`@import`**.

#### Uso mediante `<link>` en el `<head>` de tu HTML:

```html
<head>
  <link
    href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap"
    rel="stylesheet"
  />
</head>
```

#### Luego, en tu CSS:

```css
body {
  font-family: "Roboto", sans-serif; /* Usamos la fuente Roboto */
}
```

#### Uso mediante `@import` directamente en el CSS:

```css
@import url("https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap");

body {
  font-family: "Roboto", sans-serif; /* Usamos la fuente Roboto */
}
```

En este caso, estamos importando la fuente **Roboto** desde Google Fonts y la aplicamos al cuerpo de la página.

---

### **Ejemplo completo de uso de fuentes externas:**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Fuentes Externas</title>
    <!-- Usando Google Fonts -->
    <link
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap"
      rel="stylesheet"
    />
    <style>
      body {
        font-family: "Roboto", sans-serif; /* Usando la fuente importada */
      }

      h1 {
        font-family: "Arial", sans-serif; /* Usando una fuente instalada localmente */
      }
    </style>
  </head>
  <body>
    <h1>Este es un título con Arial</h1>
    <p>Este es un párrafo con la fuente Roboto importada desde Google Fonts.</p>
  </body>
</html>
```

En este ejemplo:

- Se carga la fuente **Roboto** desde Google Fonts y se aplica al contenido del `body`.
- El título `h1` usa la fuente **Arial** que está instalada localmente en el sistema del usuario.

---

### **Resumen de las propiedades:**

- **`font-family`**: Se utiliza para definir la fuente del texto. Se pueden especificar varias fuentes en una lista de prioridad.
- **`@font-face`**: Permite cargar fuentes externas en tu sitio web, proporcionando una ruta a los archivos de la fuente.
- **Google Fonts**: Biblioteca gratuita para integrar fuentes personalizadas a través de un enlace `link` o la regla `@import` en CSS.

## 6. **Posicionamiento**

### **Posicionamiento en CSS**

El posicionamiento en CSS permite controlar la ubicación de un elemento dentro de un contenedor, afectando su comportamiento en el flujo de la página. Esto se logra con la propiedad **`position`** y sus valores, junto con otras propiedades complementarias como **`top`**, **`right`**, **`bottom`**, **`left`**, y **`z-index`**.

### **1. `position`** y sus valores

La propiedad **`position`** define cómo se posiciona un elemento en la página. Los valores más comunes son:

#### **a. `static`** (Valor predeterminado)

El valor predeterminado para la mayoría de los elementos es **`static`**. Esto significa que el elemento se posiciona de acuerdo con el flujo normal del documento (es decir, en el lugar donde aparece en el código HTML). No se puede mover con las propiedades `top`, `right`, `bottom`, o `left`.

**Ejemplo:**

```css
div {
  position: static; /* El comportamiento predeterminado, sigue el flujo normal */
}
```

#### **b. `relative`**

Un elemento con **`position: relative;`** se posiciona relativo a su posición original en el flujo del documento. Es decir, puedes moverlo con las propiedades `top`, `right`, `bottom`, y `left`, pero su espacio en el flujo de la página sigue intacto.

**Ejemplo:**

```css
div {
  position: relative;
  top: 10px; /* Mueve el elemento 10 píxeles hacia abajo */
  left: 20px; /* Mueve el elemento 20 píxeles hacia la derecha */
}
```

#### **c. `absolute`**

Un elemento con **`position: absolute;`** se posiciona de manera absoluta con respecto a su contenedor más cercano que tenga **`position`** distinto de `static` (es decir, con `relative`, `absolute`, `fixed`, o `sticky`). Si no encuentra tal contenedor, se posiciona respecto al elemento `<html>` (la raíz).

**Ejemplo:**

```css
div {
  position: absolute;
  top: 50px; /* Mueve el elemento 50 píxeles desde el borde superior de su contenedor */
  right: 10px; /* Mueve el elemento 10 píxeles desde el borde derecho */
}
```

#### **d. `fixed`**

Un elemento con **`position: fixed;`** se posiciona de manera fija con respecto a la ventana del navegador, lo que significa que el elemento se quedará en su posición incluso si el usuario hace scroll en la página.

**Ejemplo:**

```css
div {
  position: fixed;
  bottom: 0; /* Coloca el elemento en la parte inferior de la ventana */
  left: 0; /* Coloca el elemento en la parte izquierda de la ventana */
}
```

#### **e. `sticky`**

El valor **`sticky`** permite que un elemento se comporte como **`relative`** hasta que se desplace más allá de su posición inicial, momento en el que se comporta como **`fixed`**. Este comportamiento es útil, por ejemplo, para encabezados que se quedan fijos cuando el usuario hace scroll.

**Ejemplo:**

```css
div {
  position: sticky;
  top: 0; /* El elemento se queda pegado a la parte superior cuando el usuario hace scroll */
}
```

---

### **2. Propiedades relacionadas**

Las siguientes propiedades permiten ajustar la posición del elemento una vez que has establecido su propiedad **`position`**.

#### **a. `top`**, **`right`**, **`bottom`**, **`left`**

Estas propiedades se utilizan para mover un elemento de acuerdo con su posición especificada (es decir, **`relative`**, **`absolute`**, **`fixed`**, o **`sticky`**).

- **`top`**: Establece la distancia desde el borde superior del contenedor o de la ventana del navegador.
- **`right`**: Establece la distancia desde el borde derecho del contenedor o de la ventana del navegador.
- **`bottom`**: Establece la distancia desde el borde inferior del contenedor o de la ventana del navegador.
- **`left`**: Establece la distancia desde el borde izquierdo del contenedor o de la ventana del navegador.

#### Ejemplo:

```css
div {
  position: absolute;
  top: 50px; /* 50 píxeles desde el borde superior */
  left: 20px; /* 20 píxeles desde el borde izquierdo */
}
```

#### **b. `z-index`**

La propiedad **`z-index`** controla el apilamiento de los elementos. Es decir, define qué elemento se muestra por encima de otro cuando se superponen. Los elementos con valores más altos de **`z-index`** se colocan encima de aquellos con valores más bajos.

**Nota**: Para que **`z-index`** funcione, el elemento debe tener una propiedad **`position`** distinta de `static` (normalmente `relative`, `absolute`, `fixed`, o `sticky`).

**Ejemplo:**

```css
div {
  position: relative;
  z-index: 10; /* El elemento tendrá un índice de apilamiento de 10 */
}

div.superior {
  position: relative;
  z-index: 20; /* Este elemento estará encima del anterior */
}
```

---

### **Ejemplo completo:**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Posicionamiento</title>
    <style>
      .relativo {
        position: relative;
        top: 10px;
        left: 20px;
        background-color: lightblue;
        width: 100px;
        height: 100px;
      }

      .absoluto {
        position: absolute;
        top: 50px;
        right: 10px;
        background-color: lightcoral;
        width: 100px;
        height: 100px;
      }

      .fijo {
        position: fixed;
        bottom: 0;
        left: 0;
        background-color: lightgreen;
        width: 100px;
        height: 100px;
      }

      .pegajoso {
        position: sticky;
        top: 0;
        background-color: lightyellow;
        width: 100px;
        height: 100px;
      }
    </style>
  </head>
  <body>
    <div class="relativo">Relativo</div>
    <div class="absoluto">Absoluto</div>
    <div class="fijo">Fijo</div>
    <div class="pegajoso">Pegajoso</div>
  </body>
</html>
```

En este ejemplo:

- **El div `relativo`** se mueve 10 píxeles hacia abajo y 20 píxeles hacia la derecha de su posición original.
- **El div `absoluto`** se posiciona 50 píxeles desde el borde superior y 10 píxeles desde el borde derecho de su contenedor.
- **El div `fijo`** se posiciona en la parte inferior izquierda de la ventana del navegador y permanece allí incluso cuando se hace scroll.
- **El div `pegajoso`** se queda pegado en la parte superior de la ventana al hacer scroll.

---

### **Resumen de propiedades:**

- **`position`**: Controla el tipo de posicionamiento (static, relative, absolute, fixed, sticky).
- **`top`, `right`, `bottom`, `left`**: Mueven un elemento en relación con su contenedor o la ventana del navegador (cuando se utiliza un `position` distinto de static).
- **`z-index`**: Define el apilamiento de los elementos cuando se superponen.

## 7. **Diseño con Flexbox**

### **Diseño con Flexbox**

**Flexbox** es un modelo de diseño en CSS que permite distribuir y alinear elementos dentro de un contenedor de manera más eficiente y predecible, incluso cuando su tamaño es dinámico o desconocido. Uno de los aspectos clave de Flexbox es el concepto de **ejes**:

1. **Eje principal (Main Axis)**: Es el eje a lo largo del cual los elementos dentro de un contenedor flex se alinean. El eje principal se define por la propiedad **`flex-direction`**.
2. **Eje cruzado (Cross Axis)**: Es el eje perpendicular al eje principal. Si el eje principal es horizontal, el eje cruzado será vertical, y viceversa.

![alt text](https://img.uxcel.com/practices/flexbox-1665382286109/a-1665382286109-2x.jpg)

---

### **1. Eje Principal (Main Axis)**

El eje principal es la dirección en la que los elementos dentro de un contenedor flex se alinean. Su orientación depende del valor de la propiedad **`flex-direction`**.

#### **Valores de `flex-direction`:**

- **`row`**: Los elementos se alinean de izquierda a derecha (por defecto). Este es el eje principal horizontal.
- **`row-reverse`**: Los elementos se alinean de derecha a izquierda.
- **`column`**: Los elementos se alinean de arriba hacia abajo (eje principal vertical).
- **`column-reverse`**: Los elementos se alinean de abajo hacia arriba.

#### Ejemplo:

```css
.container {
  display: flex;
  flex-direction: row; /* Los elementos se alinean horizontalmente (de izquierda a derecha) */
}
```

En este caso, el eje principal es **horizontal** (de izquierda a derecha).

---

### **2. Eje Cruzado (Cross Axis)**

El eje cruzado es el eje perpendicular al eje principal. Si el eje principal es horizontal (por ejemplo, con **`flex-direction: row`**), el eje cruzado será vertical. Si el eje principal es vertical (por ejemplo, con **`flex-direction: column`**), el eje cruzado será horizontal.

El eje cruzado se usa principalmente para alinear los elementos en relación con la altura o el ancho, dependiendo de la orientación del eje principal.

---

### **Ejemplo Visual de Ejes Principal y Cruzado**

Supongamos que tenemos un contenedor con elementos internos y queremos entender cómo se alinean en los ejes principal y cruzado.

#### Caso 1: **`flex-direction: row`** (horizontal)

```html
<div class="container">
  <div class="item">Item 1</div>
  <div class="item">Item 2</div>
  <div class="item">Item 3</div>
</div>
```

```css
.container {
  display: flex;
  flex-direction: row; /* Eje principal horizontal */
  background-color: lightgray;
  width: 400px;
  height: 100px;
}

.item {
  background-color: lightblue;
  padding: 10px;
  margin: 5px;
}
```

En este caso:

- **Eje principal**: Es **horizontal** (de izquierda a derecha).
- **Eje cruzado**: Es **vertical** (de arriba hacia abajo).

---

#### Caso 2: **`flex-direction: column`** (vertical)

```html
<div class="container">
  <div class="item">Item 1</div>
  <div class="item">Item 2</div>
  <div class="item">Item 3</div>
</div>
```

```css
.container {
  display: flex;
  flex-direction: column; /* Eje principal vertical */
  background-color: lightgray;
  width: 100px;
  height: 400px;
}

.item {
  background-color: lightblue;
  padding: 10px;
  margin: 5px;
}
```

En este caso:

- **Eje principal**: Es **vertical** (de arriba hacia abajo).
- **Eje cruzado**: Es **horizontal** (de izquierda a derecha).

---

### **Resumen:**

- **Eje principal (Main Axis)**: La dirección principal en la que los elementos se alinean, definida por **`flex-direction`**.
  - Si **`flex-direction: row`**, el eje principal es **horizontal**.
  - Si **`flex-direction: column`**, el eje principal es **vertical**.
- **Eje cruzado (Cross Axis)**: El eje perpendicular al eje principal.
  - Si el eje principal es **horizontal**, el eje cruzado es **vertical**.
  - Si el eje principal es **vertical**, el eje cruzado es **horizontal**.

### **Propiedades de Flexbox**

Flexbox ofrece varias propiedades tanto para el contenedor como para los ítems dentro del contenedor. Estas propiedades permiten controlar la disposición, alineación, y tamaño de los elementos de manera flexible y eficiente.

### **1. Propiedades del Contenedor (Contenedor Flex)**

#### **a. `display: flex`**

Esta propiedad establece un contenedor como un contenedor **flex**. Esto convierte al contenedor en un contexto flexbox, donde sus elementos hijos se comportan como ítems flexibles.

**Ejemplo:**

```css
.container {
  display: flex; /* Convierte el contenedor en un contenedor flex */
}
```

#### **b. `justify-content`**

Controla la alineación de los ítems flex en el eje principal (el que se define con **`flex-direction`**). Puede tomar varios valores:

- **`flex-start`**: Alinea los elementos al inicio del contenedor (valor por defecto).
- **`flex-end`**: Alinea los elementos al final del contenedor.
- **`center`**: Centra los elementos en el contenedor.
- **`space-between`**: Distribuye los elementos con espacio igual entre ellos, sin espacio en los extremos.
- **`space-around`**: Distribuye los elementos con espacio igual alrededor de ellos.
- **`space-evenly`**: Distribuye los elementos con espacio igual entre ellos, incluyendo los extremos.

**Ejemplo:**

```css
.container {
  display: flex;
  justify-content: space-between; /* Distribuye los elementos con espacio igual entre ellos */
}
```

#### **c. `align-items`**

Alinea los ítems flex en el eje cruzado (perpendicular al eje principal). Toma los siguientes valores:

- **`flex-start`**: Alinea los ítems al inicio del eje cruzado.
- **`flex-end`**: Alinea los ítems al final del eje cruzado.
- **`center`**: Centra los ítems en el eje cruzado.
- **`baseline`**: Alinea los ítems según su línea base.
- **`stretch`**: Estira los ítems para llenar el contenedor (valor por defecto).

**Ejemplo:**

```css
.container {
  display: flex;
  align-items: center; /* Centra los ítems en el eje cruzado */
}
```

#### **d. `align-content`**

Alinea las filas de ítems (en caso de que haya múltiples filas) en el eje cruzado. Esta propiedad solo afecta cuando **`flex-wrap`** está habilitado (cuando los ítems pueden envolver).

- **`flex-start`**: Alinea las filas al inicio del eje cruzado.
- **`flex-end`**: Alinea las filas al final del eje cruzado.
- **`center`**: Centra las filas en el eje cruzado.
- **`space-between`**: Distribuye las filas con espacio igual entre ellas.
- **`space-around`**: Distribuye las filas con espacio igual alrededor de ellas.
- **`stretch`**: Estira las filas para llenar el contenedor.

**Ejemplo:**

```css
.container {
  display: flex;
  flex-wrap: wrap; /* Habilita el ajuste de ítems */
  align-content: space-between; /* Distribuye las filas con espacio igual entre ellas */
}
```

#### **e. `flex-wrap`**

Esta propiedad controla si los ítems deben envolver en varias filas o no. Sus valores son:

- **`nowrap`** (valor por defecto): Los ítems no se envuelven y permanecen en una sola fila.
- **`wrap`**: Los ítems se envuelven en múltiples filas si es necesario.
- **`wrap-reverse`**: Los ítems se envuelven en múltiples filas, pero en orden inverso.

**Ejemplo:**

```css
.container {
  display: flex;
  flex-wrap: wrap; /* Los ítems se envuelven si es necesario */
}
```

#### **f. `gap`**

Especifica el espacio entre los ítems flex (anteriormente llamado `grid-gap` en CSS Grid). Esta propiedad es especialmente útil para mantener un espacio uniforme entre los ítems.

**Ejemplo:**

```css
.container {
  display: flex;
  gap: 20px; /* Establece un espacio de 20 píxeles entre los ítems */
}
```

---

### **2. Propiedades de los Ítems Flex**

#### **a. `order`**

Controla el orden de los ítems flex en el contenedor. El valor por defecto es **`0`**, pero se puede cambiar a cualquier número entero (positivo o negativo). Los ítems se ordenarán de acuerdo con el valor de **`order`** (los valores más bajos se colocan antes).

**Ejemplo:**

```css
.item {
  order: 2; /* Este ítem aparecerá después de los demás que tienen un valor menor */
}
```

#### **b. `flex-grow`**

Define cómo un ítem debe crecer en relación con los demás ítems dentro del contenedor. Si todos los ítems tienen un valor de **`flex-grow`** igual a 1, todos crecerán igualmente para llenar el espacio disponible.

- **`flex-grow: 1`** significa que el ítem puede crecer para llenar el espacio disponible.
- **`flex-grow: 0`** (valor por defecto) significa que el ítem no crecerá.

**Ejemplo:**

```css
.item {
  flex-grow: 1; /* El ítem crecerá para llenar el espacio disponible */
}
```

#### **c. `flex-shrink`**

Define cómo un ítem debe reducir su tamaño cuando el espacio disponible en el contenedor es menor que el tamaño de los ítems. Por defecto, **`flex-shrink`** es **`1`**, lo que significa que los ítems pueden reducir su tamaño.

- **`flex-shrink: 0`** significa que el ítem no se reducirá.
- **`flex-shrink: 1`** (valor por defecto) significa que el ítem puede reducirse si es necesario.

**Ejemplo:**

```css
.item {
  flex-shrink: 0; /* El ítem no se reducirá si el espacio es pequeño */
}
```

#### **d. `align-self`**

Permite anular la propiedad **`align-items`** para un ítem específico. Alinea ese ítem de manera diferente en el eje cruzado.

- **`auto`** (valor por defecto): El ítem sigue la alineación definida por **`align-items`** del contenedor.
- **`flex-start`**: Alinea el ítem al inicio del eje cruzado.
- **`flex-end`**: Alinea el ítem al final del eje cruzado.
- **`center`**: Centra el ítem en el eje cruzado.
- **`baseline`**: Alinea el ítem según su línea base.
- **`stretch`**: Estira el ítem para llenar el contenedor.

**Ejemplo:**

```css
.item {
  align-self: center; /* Este ítem se alineará en el centro en el eje cruzado */
}
```

---

### **Ejemplo Completo:**

```html
<div class="container">
  <div class="item">Item 1</div>
  <div class="item">Item 2</div>
  <div class="item">Item 3</div>
</div>
```

```css
.container {
  display: flex;
  justify-content: space-around; /* Distribuye los ítems con espacio alrededor */
  align-items: center; /* Centra los ítems en el eje cruzado */
  gap: 10px; /* Espacio entre los ítems */
  height: 100px;
  background-color: lightgray;
}

.item {
  flex-grow: 1; /* Los ítems crecerán para llenar el espacio disponible */
  background-color: lightblue;
  padding: 10px;
}
```

---

### **Resumen de Propiedades:**

#### **Contenedor:**

- **`display: flex`**: Convierte el contenedor en un contenedor flex.
- **`justify-content`**: Alinea los ítems en el eje principal.
- **`align-items`**: Alinea los ítems en el eje cruzado.
- **`align-content`**: Alinea las filas de ítems (si hay múltiples filas).
- **`flex-wrap`**: Controla si los ítems se envuelven en varias filas.
- **`gap`**: Define el espacio entre los ítems.

#### **Ítems:**

- **`order`**: Controla el orden de los ítems en el contenedor.
- **`flex-grow`**: Define cómo un ítem debe crecer en relación con los demás.
- **`flex-shrink`**: Define cómo un ítem debe reducir su tamaño.
- **`align-self`**: Anula el **`align-items`** para un ítem específico.

## 8. **Diseño con Grid**

CSS Grid Layout es un sistema de diseño bidimensional que permite crear diseños complejos en filas y columnas de manera más sencilla y flexible. Con Grid, puedes alinear y distribuir los elementos tanto en el eje horizontal (filas) como en el vertical (columnas).

![alt text](https://samuellawrentz.com/static/07d7a0fa60c21d2ce47c19eb4967be16/db955/css-grid.png)

### **1. Líneas (Grid Lines)**

En el sistema de diseño con Grid, las **líneas** son las líneas imaginarias que separan las filas y columnas dentro del contenedor. Estas líneas permiten ubicar y alinear los elementos en el grid.

- Las **líneas horizontales** separan las filas.
- Las **líneas verticales** separan las columnas.

Cada línea tiene un índice, y los ítems pueden alinearse a ellas. Los índices comienzan desde **1** para el primer eje, y los índices negativos se usan para contar desde el final del grid.

#### Ejemplo:

Si tenemos un grid con 3 columnas y 2 filas, las líneas del grid serán:

- Columnas: **1, 2, 3, 4**.
- Filas: **1, 2, 3**.

```css
.container {
  display: grid;
  grid-template-columns: 100px 100px 100px;
  grid-template-rows: 100px 100px;
}
```

Las líneas se ven como sigue:

```
|  1  |  2  |  3  |  4  |
----------------------------
|  1  |  2  |      |     |
----------------------------
|  3  |  4  |      |     |
----------------------------
```

---

### **2. Áreas (Grid Areas)**

Las **áreas** son secciones dentro del grid que pueden abarcar una o más celdas. Usar áreas es una forma de nombrar y colocar elementos de manera más visual en un grid.

Puedes definir un área con la propiedad **`grid-template-areas`**, que asigna un nombre a un conjunto de celdas dentro del grid. Las áreas facilitan la colocación de los ítems.

#### Ejemplo:

```css
.container {
  display: grid;
  grid-template-columns: 100px 100px 100px;
  grid-template-rows: 100px 100px;
  grid-template-areas:
    "header header header"
    "sidebar content content";
}
```

En este ejemplo:

- **`header`** ocupa toda la primera fila.
- **`sidebar`** ocupa la primera celda de la segunda fila.
- **`content`** ocupa las dos últimas celdas de la segunda fila.

Visualmente, se vería algo como esto:

```
| header | header | header |
----------------------------
| sidebar | content | content |
```

---

### **3. Celdas (Grid Cells)**

Las **celdas** son las unidades básicas dentro del grid, y se definen por la intersección de una fila y una columna. Puedes colocar los ítems dentro de las celdas de un grid.

Por ejemplo, si tienes un grid de 3 columnas y 2 filas, las celdas se numeran de la siguiente manera:

```
| (1,1) | (1,2) | (1,3) |
------------------------
| (2,1) | (2,2) | (2,3) |
```

Aquí, **(1,1)** se refiere a la celda en la primera fila y la primera columna, **(2,3)** se refiere a la segunda fila y la tercera columna, y así sucesivamente.

#### Ejemplo de colocación en celdas:

```css
.item {
  grid-column: 1 / 3; /* El ítem ocupará desde la columna 1 hasta la 3 (columnas 1 y 2) */
  grid-row: 1 / 2; /* El ítem ocupará la fila 1 */
}
```

Este ítem ocupará las dos primeras columnas de la primera fila, cubriendo las celdas **(1,1)** y **(1,2)**.

---

### **Resumen de Conceptos Básicos:**

1. **Líneas (Grid Lines)**: Son las líneas que dividen las filas y columnas. Los ítems pueden alinearse a estas líneas.
2. **Áreas (Grid Areas)**: Son secciones que abarcan uno o más ítems dentro del grid y se definen con **`grid-template-areas`**.
3. **Celdas (Grid Cells)**: Son la intersección de filas y columnas donde los ítems se colocan.

---

### **Ejemplo Completo:**

Supongamos que queremos crear una estructura básica de página con un encabezado, una barra lateral y un área de contenido. Usamos el concepto de **áreas** para hacer que sea más fácil y visual de entender.

```html
<div class="container">
  <div class="header">Header</div>
  <div class="sidebar">Sidebar</div>
  <div class="content">Content</div>
</div>
```

```css
.container {
  display: grid;
  grid-template-columns: 200px 1fr; /* 1ra columna fija, 2da columna flexible */
  grid-template-rows: 100px 1fr; /* Fila superior fija, fila inferior flexible */
  grid-template-areas:
    "header header"
    "sidebar content";
  gap: 10px; /* Espacio entre los elementos */
}

.header {
  grid-area: header; /* Asigna el área 'header' */
  background-color: lightblue;
}

.sidebar {
  grid-area: sidebar; /* Asigna el área 'sidebar' */
  background-color: lightgreen;
}

.content {
  grid-area: content; /* Asigna el área 'content' */
  background-color: lightcoral;
}
```

El diseño resultante será algo como esto:

```
| header | header |
--------------------
| sidebar | content |
```

En este caso:

- El **`header`** ocupa toda la primera fila.
- El **`sidebar`** ocupa la primera columna de la segunda fila.
- El **`content`** ocupa la segunda columna de la segunda fila.

### **Propiedades del Contenedor en Grid**

Al utilizar CSS Grid, el contenedor tiene varias propiedades clave que controlan la estructura del grid, cómo se dividen las filas y columnas, y cómo se distribuyen los elementos dentro del contenedor.

#### **1. `display: grid`**

Esta propiedad convierte a un contenedor en un grid. Es esencial para aplicar el modelo de diseño Grid y permite definir las filas y columnas que componen la estructura.

**Ejemplo:**

```css
.container {
  display: grid; /* Activa el modelo de grid */
}
```

---

#### **2. `grid-template-rows`**

Define la altura de las filas dentro del grid. Esta propiedad puede aceptar valores fijos (como píxeles) o relativos (como fracciones o porcentajes).

**Sintaxis:**

```css
grid-template-rows: <value> <value> <value>;
```

- **`<value>`** puede ser cualquier valor de longitud, como `px`, `em`, `fr`, etc.

**Ejemplo:**

```css
.container {
  grid-template-rows: 100px 200px auto;
}
```

Esto define:

- Una fila de **100px** de altura.
- Una fila de **200px** de altura.
- Una fila que ocupa el espacio restante (**auto**).

---

#### **3. `grid-template-columns`**

Define el ancho de las columnas dentro del grid. Al igual que con `grid-template-rows`, se pueden usar valores fijos o relativos.

**Sintaxis:**

```css
grid-template-columns: <value> <value> <value>;
```

**Ejemplo:**

```css
.container {
  grid-template-columns: 1fr 2fr 1fr;
}
```

Esto crea 3 columnas:

- La primera columna ocupa 1 fracción del espacio disponible.
- La segunda columna ocupa 2 fracciones.
- La tercera columna ocupa 1 fracción.

---

#### **4. `gap`**

La propiedad `gap` define el espacio entre las filas y las columnas del grid. Es una forma abreviada de usar las propiedades `grid-row-gap` y `grid-column-gap`, que antes eran necesarias para definir los espacios de fila y columna por separado.

**Sintaxis:**

```css
gap: <row-gap> <column-gap>;
```

- **`<row-gap>`** es el espacio entre las filas.
- **`<column-gap>`** es el espacio entre las columnas.

**Ejemplo:**

```css
.container {
  display: grid;
  grid-template-columns: 1fr 1fr;
  gap: 20px; /* Espacio de 20px entre filas y columnas */
}
```

Si deseas especificar diferentes espacios para filas y columnas:

```css
.container {
  display: grid;
  grid-template-columns: 1fr 1fr;
  gap: 10px 20px; /* 10px entre filas y 20px entre columnas */
}
```

---

#### **5. `grid-area`**

La propiedad `grid-area` permite definir un área del grid y colocar elementos en posiciones específicas. Esta propiedad se puede usar en el contenedor o en los ítems.

Cuando se usa en el contenedor, define cómo se distribuyen las áreas (regiones) del grid. Si se usa en los ítems, especifica en qué área debe ir el ítem.

**Sintaxis para definir áreas en el contenedor:**

```css
grid-template-areas:
  "header header header"
  "sidebar content content"
  "footer footer footer";
```

**Ejemplo:**

```css
.container {
  display: grid;
  grid-template-columns: 1fr 2fr;
  grid-template-areas:
    "header header"
    "sidebar content"
    "footer footer";
}
```

En este caso, el contenedor tiene:

- Un área de **header** que ocupa toda la primera fila.
- Un área de **sidebar** en la primera columna de la segunda fila.
- Un área de **content** en la segunda columna de la segunda fila.
- Un área de **footer** que ocupa toda la tercera fila.

---

### **Colocación de Ítems**

Una de las características más poderosas de CSS Grid es la capacidad de colocar los elementos en el grid usando las propiedades **`grid-column`** y **`grid-row`**, que te permiten especificar en qué columna y fila deben empezar y terminar los ítems.

---

#### **1. `grid-column`**

La propiedad `grid-column` se usa para definir en qué columna de inicio y columna final debe ubicarse un ítem dentro del grid.

**Sintaxis:**

```css
grid-column: <start> / <end>;
```

- **`<start>`** es la columna donde comienza el ítem.
- **`<end>`** es la columna donde termina el ítem.

**Ejemplo:**

```css
.item {
  grid-column: 1 / 3; /* El ítem ocupa la primera y segunda columna */
}
```

Esto significa que el ítem ocupará la primera y segunda columna, es decir, abarcando el espacio entre la columna 1 y la columna 3 (sin incluirla).

---

#### **2. `grid-row`**

La propiedad `grid-row` funciona igual que `grid-column`, pero en el eje vertical, es decir, define en qué fila debe empezar y terminar el ítem.

**Sintaxis:**

```css
grid-row: <start> / <end>;
```

- **`<start>`** es la fila donde comienza el ítem.
- **`<end>`** es la fila donde termina el ítem.

**Ejemplo:**

```css
.item {
  grid-row: 1 / 3; /* El ítem ocupa la primera y segunda fila */
}
```

Esto significa que el ítem ocupará las dos primeras filas.

---

### **Ejemplo Completo:**

Imagina que queremos hacer una estructura básica de página con un encabezado, una barra lateral, un área de contenido y un pie de página, usando `grid-template-areas` y la colocación de ítems:

```html
<div class="container">
  <div class="header">Header</div>
  <div class="sidebar">Sidebar</div>
  <div class="content">Content</div>
  <div class="footer">Footer</div>
</div>
```

```css
.container {
  display: grid;
  grid-template-columns: 1fr 3fr; /* 1 columna pequeña, 1 columna grande */
  grid-template-rows: auto 1fr auto; /* Fila automática para el header, flexible para el contenido, auto para el pie */
  grid-template-areas:
    "header header"
    "sidebar content"
    "footer footer";
  gap: 20px;
}

.header {
  grid-area: header;
  background-color: lightblue;
}

.sidebar {
  grid-area: sidebar;
  background-color: lightgreen;
}

.content {
  grid-area: content;
  background-color: lightcoral;
}

.footer {
  grid-area: footer;
  background-color: lightgoldenrodyellow;
}
```

Este diseño produce:

```
| header | header |
--------------------
| sidebar | content |
--------------------
| footer | footer |
```

## 9. **Diseño Responsivo**

### **Diseño Responsivo con CSS**

El diseño responsivo (responsive design) se refiere a la capacidad de una página web de adaptarse a diferentes tamaños y resoluciones de pantalla, garantizando una experiencia óptima para el usuario en dispositivos móviles, tabletas y escritorios.

### **1. Media Queries**

Las media queries son una herramienta en CSS para aplicar estilos específicos según ciertas condiciones, como el ancho de la pantalla, la orientación del dispositivo, o la resolución.

#### **Sintaxis Básica de `@media`**

```css
@media (condición) {
  /* Reglas CSS específicas para cumplir la condición */
}
```

- **Condición:** define el criterio para aplicar los estilos (por ejemplo, ancho mínimo o máximo de pantalla).
- **Reglas CSS:** son los estilos que se aplican si la condición se cumple.

---

#### **Ejemplo:**

**Estilos básicos:**

```css
body {
  font-size: 16px;
  background-color: white;
}
```

**Estilos específicos para pantallas pequeñas:**

```css
@media (max-width: 600px) {
  body {
    font-size: 14px;
    background-color: lightgray;
  }
}
```

En este ejemplo:

- Si el ancho de la pantalla es de **600px o menos**, el tamaño de fuente será más pequeño y el fondo será gris claro.

---

### **2. Breakpoints Comunes**

Un **breakpoint** es un punto específico de tamaño de pantalla donde se cambian los estilos para adaptarse mejor al dispositivo.

Algunos breakpoints típicos:

| Dispositivo            | Ancho de Pantalla (px) |
| ---------------------- | ---------------------- |
| **Móvil pequeño**      | 0 - 600px              |
| **Tablet vertical**    | 600px - 768px          |
| **Tablet horizontal**  | 768px - 1024px         |
| **Escritorio pequeño** | 1024px - 1200px        |
| **Escritorio grande**  | 1200px o más           |

#### **Ejemplo con Breakpoints:**

```css
/* Estilos generales (para todos los dispositivos) */
body {
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
  font-size: 16px;
}

/* Pantallas pequeñas: Móviles */
@media (max-width: 600px) {
  body {
    font-size: 14px;
    background-color: lightblue;
  }
}

/* Pantallas medianas: Tablets */
@media (min-width: 601px) and (max-width: 1024px) {
  body {
    font-size: 15px;
    background-color: lightgreen;
  }
}

/* Pantallas grandes: Escritorio */
@media (min-width: 1025px) {
  body {
    font-size: 18px;
    background-color: white;
  }
}
```

---

### **3. Ejemplo Práctico Completo**

Imagina un layout que se adapta según el tamaño del dispositivo:

**HTML:**

```html
<div class="container">
  <header>Header</header>
  <nav>Navigation</nav>
  <main>Main Content</main>
  <footer>Footer</footer>
</div>
```

**CSS:**

```css
.container {
  display: grid;
  grid-template-areas:
    "header"
    "nav"
    "main"
    "footer";
  gap: 10px;
}

header {
  grid-area: header;
  background-color: lightblue;
}

nav {
  grid-area: nav;
  background-color: lightcoral;
}

main {
  grid-area: main;
  background-color: lightgreen;
}

footer {
  grid-area: footer;
  background-color: lightgoldenrodyellow;
}

/* Estilo para pantallas grandes */
@media (min-width: 768px) {
  .container {
    grid-template-areas:
      "header header"
      "nav main"
      "footer footer";
    grid-template-columns: 1fr 2fr;
  }
}
```

#### **Efecto:**

- En dispositivos pequeños, el layout es vertical.
- En dispositivos más grandes (ancho mayor a 768px), el layout cambia a un diseño de dos columnas con el **navegador** al lado del **contenido principal**.

---

### **¿Cómo elegir los Breakpoints?**

En lugar de usar breakpoints predefinidos, es mejor analizar tu diseño y encontrar puntos donde la apariencia del contenido se rompa o necesite ajuste. Por ejemplo:

1. Comienza con un diseño móvil primero (mobile-first).
2. Ajusta el diseño según sea necesario usando `@media (min-width: ...)`.

### **Unidades en CSS: Relativas y Absolutas**

En CSS, las unidades determinan cómo se miden las propiedades como anchos, alturas, márgenes, fuentes, etc. Pueden ser **relativas** (dependen de otro valor) o **absolutas** (tienen un valor fijo, independiente del entorno).

### **1. Unidades Absolutas**

Las unidades absolutas no cambian según el contexto. Son útiles cuando se necesita un tamaño fijo.

| **Unidad** | **Descripción**                               | **Ejemplo**     |
| ---------- | --------------------------------------------- | --------------- |
| `px`       | Píxeles. Basado en la resolución de pantalla. | `width: 100px;` |

Ejemplo con `px`:

```css
p {
  font-size: 16px; /* Tamaño fijo de fuente */
  margin: 10px; /* Margen fijo */
}
```

---

### **2. Unidades Relativas**

Las unidades relativas dependen de otros valores, como el tamaño de la fuente o el tamaño de la ventana.

#### **Unidades Comunes:**

| **Unidad** | **Descripción**                                            | **Ejemplo**                       |
| ---------- | ---------------------------------------------------------- | --------------------------------- |
| `%`        | Porcentaje relativo al elemento contenedor.                | `width: 50%;`                     |
| `em`       | Relativo al tamaño de fuente del elemento padre.           | `font-size: 2em;`                 |
| `rem`      | Relativo al tamaño de fuente raíz (`<html>`).              | `font-size: 1.5rem;`              |
| `vh`       | 1% del alto de la ventana del navegador (viewport height). | `height: 50vh;`                   |
| `vw`       | 1% del ancho de la ventana del navegador (viewport width). | `width: 80vw;`                    |
| `fr`       | Fracción del espacio disponible en un contenedor Grid.     | `grid-template-columns: 1fr 2fr;` |

---

### **Ejemplo con Unidades Relativas**

```css
body {
  font-size: 16px; /* Tamaño base */
}

h1 {
  font-size: 2em; /* 2 veces el tamaño de fuente del padre (32px) */
}

.container {
  width: 80%; /* 80% del ancho del contenedor */
  height: 50vh; /* 50% del alto del viewport */
}

.grid {
  display: grid;
  grid-template-columns: 1fr 2fr; /* Columnas proporcionales: 1/3 y 2/3 del espacio disponible */
}
```

---

### **3. Diseño Fluido**

Un diseño fluido se adapta automáticamente al tamaño del contenedor o ventana del navegador. Esto se logra usando propiedades y unidades dinámicas.

#### **Propiedades Comunes para Diseño Fluido**

| **Propiedad** | **Descripción**                                                 |
| ------------- | --------------------------------------------------------------- |
| `max-width`   | Define el ancho máximo del elemento.                            |
| `min-width`   | Define el ancho mínimo del elemento.                            |
| `clamp()`     | Combina un tamaño mínimo, preferido y máximo en una sola regla. |

---

#### **Ejemplo: Uso de `max-width` y `min-width`**

```css
.container {
  width: 100%;
  max-width: 1200px; /* El ancho no superará 1200px */
  min-width: 300px; /* El ancho no será menor a 300px */
  margin: 0 auto; /* Centrado */
}
```

- **Efecto:** La `container` ocupa todo el ancho disponible, pero no supera los 1200px ni es menor a 300px.

---

#### **Uso de `clamp()`**

La función `clamp()` permite definir un tamaño fluido con límites mínimos y máximos.

**Sintaxis:**

```css
clamp(valor_min, valor_preferido, valor_max)
```

**Ejemplo:**

```css
p {
  font-size: clamp(
    14px,
    2vw,
    24px
  ); /* Mínimo 14px, preferido 2% del ancho del viewport, máximo 24px */
}
```

- En pantallas pequeñas, el tamaño de fuente será **14px**.
- En pantallas grandes, será como máximo **24px**.
- En tamaños intermedios, será proporcional al ancho del viewport (`2vw`).

---

### **4. Ejemplo Práctico Completo**

**HTML:**

```html
<div class="container">
  <header>Header</header>
  <main>Main Content</main>
  <footer>Footer</footer>
</div>
```

**CSS:**

```css
body {
  font-size: 16px; /* Tamaño base */
}

.container {
  width: 100%;
  max-width: 1200px; /* Diseño fluido con límites */
  margin: 0 auto;
  padding: 1em;
}

header {
  font-size: clamp(20px, 4vw, 40px); /* Tamaño fluido para texto */
  background-color: lightblue;
  padding: 1em;
}

main {
  font-size: 1rem; /* Relativo al tamaño base */
  background-color: lightgreen;
  height: 50vh; /* Relativo al viewport */
}

footer {
  background-color: lightgray;
  text-align: center;
  padding: 10px;
  font-size: 0.8em; /* Relativo al padre */
}
```

#### **Efecto:**

1. **Cabecera:** Texto fluido según el tamaño de la ventana.
2. **Contenido principal:** Ocupa el 50% de la altura del viewport.
3. **Pie de página:** Tamaño de texto relativo al contenido.

## 10. **Animaciones y Transiciones**

### **Transiciones en CSS**

Las **transiciones** en CSS permiten animar cambios graduales entre dos estados de estilo. Esto mejora la experiencia visual, haciendo que los cambios en los elementos sean más suaves y atractivos.

### **1. Propiedades de Transición**

#### **`transition`**

Define qué propiedades del elemento se animarán, junto con la duración, el tipo de animación, y un posible retraso.

**Sintaxis:**

```css
transition: propiedad duración función-temporización retraso;
```

#### **`transition-duration`**

Especifica el tiempo que dura la transición.

**Ejemplo:**

```css
transition-duration: 0.5s; /* 0.5 segundos */
```

#### **`transition-timing-function`**

Controla cómo evoluciona la transición en el tiempo. Define la aceleración o desaceleración del cambio.

Valores comunes:

- `ease`: Transición suave, acelerando y desacelerando (por defecto).
- `linear`: Cambio constante.
- `ease-in`: Acelera al inicio.
- `ease-out`: Desacelera al final.
- `ease-in-out`: Acelera y luego desacelera.
- `cubic-bezier(n, n, n, n)`: Define una curva personalizada.

**Ejemplo:**

```css
transition-timing-function: ease-in-out;
```

#### **Propiedades adicionales:**

- **`transition-property`:** Especifica qué propiedad(s) se animarán.
  ```css
  transition-property: background-color, transform;
  ```
- **`transition-delay`:** Define cuánto tiempo esperar antes de comenzar la transición.
  ```css
  transition-delay: 0.2s;
  ```

---

### **2. Ejemplo Básico**

**HTML:**

```html
<div class="box"></div>
```

**CSS:**

```css
.box {
  width: 100px;
  height: 100px;
  background-color: lightblue;
  transition: background-color 0.5s ease, transform 0.5s ease;
}

.box:hover {
  background-color: lightcoral;
  transform: scale(1.2); /* Aumenta su tamaño al pasar el mouse */
}
```

#### **Efecto:**

1. Al pasar el mouse sobre `.box`, el color de fondo cambia gradualmente de azul claro a coral en 0.5 segundos.
2. Simultáneamente, el tamaño de la caja aumenta.

La razón por la cual la transición definida con `transition: background-color 0.5s ease, transform 0.5s ease;` se activa **al hacer hover** es porque el estado `:hover` modifica los valores de las propiedades `background-color` y `transform`. La transición ocurre porque estas propiedades están **especificadas explícitamente** en la regla `transition`.

### **Cómo funciona CSS con las transiciones:**

1. **Propiedades de transición activas:** Cuando definís `transition`, estás diciendo al navegador:

   > "Si estas propiedades cambian (en cualquier circunstancia), realizá una animación suave en lugar de cambiar bruscamente."

   En el ejemplo:

   ```css
   transition: background-color 0.5s ease, transform 0.5s ease;
   ```

   Esto indica que las transiciones se aplicarán **solo a `background-color` y `transform`**.

2. **Cambio de valores en `:hover`:**  
   Cuando el elemento cambia a un estado donde los valores de `background-color` o `transform` son diferentes, como ocurre en `:hover`, la transición definida entra en acción.

   **Ejemplo:**

   ```css
   .box {
     background-color: lightblue;
     transform: scale(1);
   }

   .box:hover {
     background-color: lightcoral; /* Cambia el color */
     transform: scale(1.2); /* Cambia el tamaño */
   }
   ```

   - Cuando pasás el mouse (`:hover`), el navegador detecta que los valores de `background-color` y `transform` son diferentes de los valores iniciales.
   - Como estas propiedades están definidas en `transition`, el navegador realiza el cambio **de forma gradual** según la duración (`0.5s`) y la curva (`ease`) especificadas.

3. **Sin hover, no pasa nada:**  
   Si el estado `:hover` no cambiara las propiedades `background-color` o `transform`, no habría animación porque no se modificarían los valores.

---

### **Otros eventos que podrían activar las transiciones**

Las transiciones no están limitadas al estado `:hover`. También se activan si las propiedades cambian por otras razones, como:

- **Cambios dinámicos en el DOM:** Por ejemplo, al agregar o quitar clases con JavaScript.
- **Estados interactivos:** Como `:focus`, `:active`, etc.
- **Cambios en propiedades inline:** Si una propiedad definida por `transition` cambia mediante JavaScript.

---

### **Ejemplo: Transiciones activadas por JavaScript**

**HTML:**

```html
<div class="box"></div>
<button onclick="changeBox()">Cambiar</button>
```

**CSS:**

```css
.box {
  width: 100px;
  height: 100px;
  background-color: lightblue;
  transform: scale(1);
  transition: background-color 0.5s ease, transform 0.5s ease;
}
```

**JavaScript:**

```javascript
function changeBox() {
  const box = document.querySelector(".box");
  box.style.backgroundColor = "lightcoral";
  box.style.transform = "scale(1.2)";
}
```

- Cuando se hace clic en el botón, las propiedades `background-color` y `transform` cambian mediante JavaScript.
- La transición definida en CSS asegura que los cambios sean suaves.

- **Las transiciones no "saben" que estás usando `hover`**. Solo actúan cuando las propiedades especificadas cambian.
- En este ejemplo, el estado `:hover` cambia `background-color` y `transform`. Eso activa las transiciones definidas.
- Podrías usar otros eventos o manipulaciones dinámicas para disparar las transiciones.

---

### **3. Transición con Retraso**

**HTML:**

```html
<button class="btn">Hover me!</button>
```

**CSS:**

```css
.btn {
  padding: 10px 20px;
  background-color: royalblue;
  color: white;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s ease-in, transform 0.3s ease 0.2s; /* Retraso en transform */
}

.btn:hover {
  background-color: darkblue;
  transform: translateY(-5px); /* Se eleva después de cambiar el color */
}
```

#### **Efecto:**

1. Al pasar el mouse, el color cambia inmediatamente.
2. **0.2 segundos después**, el botón se eleva.

---

### **4. Transiciones con Múltiples Propiedades**

Puedes animar varias propiedades simultáneamente.

**HTML:**

```html
<div class="card"></div>
```

**CSS:**

```css
.card {
  width: 150px;
  height: 150px;
  background-color: #f3f3f3;
  border-radius: 10px;
  transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.card:hover {
  transform: scale(1.1) rotate(5deg); /* Escala y rota */
  box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.2); /* Agrega sombra */
}
```

#### **Efecto:**

- Al pasar el mouse, la tarjeta crece, rota ligeramente y agrega una sombra, todo de manera suave.

---

### **5. Mejorando con `cubic-bezier`**

Para personalizar las transiciones, usa la función `cubic-bezier`. Esta función define una curva con cuatro puntos de control. Puede ser un poco abstracto al principio porque utiliza una curva matemática para definir cómo evoluciona la transición. Vamos a desglosarlo paso a paso.

### **¿Qué es `cubic-bezier`?**

- `cubic-bezier` es una función que permite personalizar cómo una animación o transición avanza en el tiempo.
- Define una curva que controla la aceleración y desaceleración durante la animación.
- Los números dentro de `cubic-bezier(p1x, p1y, p2x, p2y)` son las **coordenadas de control** de la curva en un sistema de coordenadas que va de (0, 0) a (1, 1).

---

### **Coordenadas de la curva:**

- `(0, 0)` siempre representa el inicio (0% del tiempo, 0% del cambio).
- `(1, 1)` siempre representa el final (100% del tiempo, 100% del cambio).
- Las coordenadas de control (`p1x`, `p1y`, `p2x`, `p2y`) determinan cómo se deforma la curva:
  - **`p1x` y `p2x`:** Definen en qué punto del tiempo ocurre un cambio.
  - **`p1y` y `p2y`:** Definen cuánta aceleración o desaceleración hay en ese punto.

#### Ejemplo: `cubic-bezier(0.68, -0.55, 0.27, 1.55)`

- `p1x = 0.68`, `p1y = -0.55`: La curva acelera rápido al principio, incluso más rápido de lo normal porque `-0.55` está fuera del rango (por encima del punto inicial).
- `p2x = 0.27`, `p2y = 1.55`: La curva desacelera hacia el final, pero con un rebote extra porque `1.55` está por encima del rango de cambio completo.

Esto crea un efecto visual donde el elemento parece "sobrepasar" su posición final y luego volver.

---

### **Ejemplo:**

**CSS:**

```css
.box {
  width: 100px;
  height: 100px;
  background-color: teal;
  transition: transform 0.5s cubic-bezier(0.68, -0.55, 0.27, 1.55);
}

.box:hover {
  transform: scale(1.2); /* Aumenta el tamaño */
}
```

1. **Sin hover:** La caja está en su tamaño original (`scale(1)`).
2. **Con hover:**
   - La propiedad `transform` cambia a `scale(1.2)`, lo que significa que la caja crece.
   - La transición utiliza `cubic-bezier` para animar este cambio de tamaño.
   - Debido a la curva:
     - Primero, la caja crece rápidamente.
     - Luego, sobrepasa ligeramente su tamaño final (`1.2`) debido al "rebote".
     - Finalmente, vuelve a su tamaño definido (`1.2`).

---

### **¿Por qué rebota?**

El "rebote" ocurre porque los valores de `cubic-bezier` (`-0.55` y `1.55`) están **fuera del rango estándar** (0 a 1):

- **`-0.55`:** Provoca que el inicio de la animación sea más rápido de lo normal.
- **`1.55`:** Hace que la animación sobrepase el estado final (más grande que `1.2`) antes de volver a su tamaño definitivo.

Esto da la sensación de que el elemento rebota antes de detenerse.

---

### **Visualización**

Para entender mejor cómo afecta una curva `cubic-bezier`, te recomiendo probar herramientas como [cubic-bezier.com](https://cubic-bezier.com/). Con esta herramienta podés mover los puntos de control y observar cómo cambia la curva y el efecto visual.

### **Animaciones en CSS**

Las animaciones en CSS permiten definir cambios en las propiedades de un elemento a lo largo del tiempo. A diferencia de las transiciones, las animaciones se configuran con mayor flexibilidad y pueden incluir múltiples pasos.

### **1. Uso de `@keyframes`**

El bloque `@keyframes` define los estados clave (keyframes) de una animación. Dentro de este bloque, especificás cómo deben cambiar las propiedades del elemento en diferentes etapas del tiempo.

**Sintaxis:**

```css
@keyframes nombre-animacion {
  0% {
    propiedad: valor-inicial;
  }
  50% {
    propiedad: valor-intermedio;
  }
  100% {
    propiedad: valor-final;
  }
}
```

- **`0%`**: Representa el inicio de la animación.
- **`100%`**: Representa el final de la animación.
- También podés usar palabras clave como `from` (equivalente a `0%`) y `to` (equivalente a `100%`).

**Ejemplo básico:**

```css
@keyframes mover {
  0% {
    transform: translateX(0);
  }
  100% {
    transform: translateX(100px);
  }
}
```

---

### **2. Propiedades de Animación**

#### **a. `animation-name`**

Define el nombre de la animación (asociada al bloque `@keyframes`).

```css
animation-name: mover;
```

#### **b. `animation-duration`**

Especifica cuánto tiempo dura la animación (por ejemplo, `2s` para 2 segundos).

```css
animation-duration: 2s;
```

#### **c. `animation-iteration-count`**

Determina cuántas veces se repite la animación:

- Un número (`1`, `3`, etc.) para repetir un número específico de veces.
- `infinite` para repetir indefinidamente.

```css
animation-iteration-count: infinite;
```

#### **d. `animation-delay`**

Establece cuánto tiempo debe esperar antes de comenzar la animación.

```css
animation-delay: 1s;
```

#### **e. Propiedades adicionales**

- **`animation-timing-function`**: Controla la aceleración (como en `transition-timing-function`).
  - Ejemplo: `ease`, `linear`, `ease-in`, `ease-out`, `cubic-bezier(...)`.
- **`animation-direction`**: Define si la animación debe ejecutarse hacia adelante, hacia atrás, o alternar.
  - Valores: `normal`, `reverse`, `alternate`, `alternate-reverse`.
- **`animation-fill-mode`**: Controla cómo debe comportarse el elemento antes y después de la animación.
  - Valores: `none`, `forwards`, `backwards`, `both`.

---

### **3. Ejemplo Práctico**

Crear una animación que haga que un cuadro cambie de color y se mueva hacia la derecha.

**CSS:**

```css
/* Definir la animación */
@keyframes mover-y-cambiar {
  0% {
    background-color: blue;
    transform: translateX(0);
  }
  50% {
    background-color: red;
    transform: translateX(50px);
  }
  100% {
    background-color: green;
    transform: translateX(100px);
  }
}

/* Aplicar la animación */
.cuadro {
  width: 100px;
  height: 100px;
  background-color: blue;
  animation-name: mover-y-cambiar;
  animation-duration: 3s;
  animation-iteration-count: infinite;
  animation-timing-function: ease-in-out;
}
```

**HTML:**

```html
<div class="cuadro"></div>
```

---

### **Efecto del Ejemplo:**

1. La animación comienza con el cuadro azul en su posición original.
2. A la mitad del tiempo (`50%`), el cuadro se vuelve rojo y se mueve 50px hacia la derecha.
3. Al final (`100%`), el cuadro es verde y está 100px más a la derecha.
4. La animación se repite indefinidamente.

---

### **4. Simplificación con la propiedad abreviada `animation`**

En lugar de definir todas las propiedades por separado, podés usar la forma abreviada `animation`:

**Sintaxis:**

```css
animation: nombre-duracion-easing-delay-iteracion-direccion-fill;
```

**Ejemplo simplificado:**

```css
.cuadro {
  animation: mover-y-cambiar 3s ease-in-out infinite;
}
```

## 11. **Selectores Avanzados y Pseudo-Clases**

### **Selectores Avanzados en CSS: `:not`, `:is`, `:where`**

Estos selectores son herramientas poderosas que te permiten seleccionar elementos de manera específica y eficiente, simplificando el código CSS y haciéndolo más legible. Vamos a ver cada uno en detalle.

---

### **1. Selector `:not`**

Selecciona elementos que **no** coincidan con el selector especificado.

**Sintaxis:**

```css
elemento: not(selector);
```

**Ejemplo:**

```css
/* Selecciona todos los párrafos excepto los que tienen la clase "excluir" */
p:not(.excluir) {
  color: red;
}
```

#### **Ventajas:**

- Permite excluir elementos específicos de una regla sin necesidad de escribir varias líneas adicionales.
- Podés usar cualquier selector dentro de `:not`.

#### **Ejemplo Práctico:**

```html
<p>Este texto será rojo.</p>
<p class="excluir">Este texto no será rojo.</p>
```

**CSS Resultante:**  
El primer `<p>` será rojo, pero el segundo no.

---

### **2. Selector `:is`**

El selector `:is` aplica estilos a los elementos que coincidan con **cualquiera** de los selectores listados dentro de él.

**Sintaxis:**

```css
elemento: is(selector1, selector2, ...);
```

**Ejemplo:**

```css
/* Aplica estilos a todos los <h1>, <h2> y <h3> */
:is(h1, h2, h3) {
  font-weight: bold;
}
```

#### **Ventajas:**

- Reduce la repetición de código cuando necesitas aplicar la misma regla a múltiples selectores.
- Mejora la legibilidad del código CSS.

#### **Ejemplo Práctico:**

```html
<h1>Título principal</h1>
<h2>Subtítulo</h2>
<h3>Título menor</h3>
<p>No se aplica este estilo.</p>
```

**CSS Resultante:**  
El texto en `<h1>`, `<h2>` y `<h3>` será negrita.

---

### **3. Selector `:where`**

` :where` funciona de manera similar a `:is`, pero tiene **peso de especificidad cero**, lo que significa que no aumenta la prioridad del selector.

**Sintaxis:**

```css
elemento: where(selector1, selector2, ...);
```

**Ejemplo:**

```css
/* Aplica estilos a los encabezados, sin aumentar la especificidad */
:where(h1, h2, h3) {
  margin-bottom: 20px;
}
```

#### **Diferencia clave con `:is`:**

- `:is` mantiene la especificidad del selector más específico dentro de su lista.
- `:where` siempre tiene una especificidad de **0**, independientemente de los selectores que contenga.

#### **Ejemplo Práctico:**

```html
<h1>Título principal</h1>
<h2>Subtítulo</h2>
<h3>Título menor</h3>
```

**CSS Resultante:**  
Todos los encabezados tendrán un margen inferior de 20px, pero si otro selector tiene más prioridad, este se sobreescribirá fácilmente.

---

### **Comparación entre `:is` y `:where`:**

| Característica    | `:is`                                       | `:where`                                         |
| ----------------- | ------------------------------------------- | ------------------------------------------------ |
| **Especificidad** | Basada en el selector más específico.       | Especificidad siempre igual a 0.                 |
| **Uso común**     | Reducir repetición en selectores complejos. | Establecer estilos base fáciles de sobrescribir. |

---

### **4. Ejemplo Combinado**

```css
/* Estilo base para todos los encabezados excepto los que tienen la clase "excluir" */
:where(h1, h2, h3):not(.excluir) {
  color: blue;
  font-size: 24px;
}

/* Los encabezados con clase "destacado" tendrán más especificidad */
h1.destacado {
  color: red;
}
```

**HTML:**

```html
<h1>Título normal</h1>
<h2 class="excluir">Subtítulo excluido</h2>
<h1 class="destacado">Título destacado</h1>
```

**Resultado:**

1. El primer `<h1>` será azul.
2. El `<h2>` será excluido del estilo.
3. El `<h1 class="destacado">` será rojo porque tiene más especificidad.

---

### **Resumen**

- **`:not`**: Excluye elementos específicos.
- **`:is`**: Selecciona elementos que coincidan con **al menos uno** de los selectores, manteniendo su especificidad.
- **`:where`**: Similar a `:is`, pero con especificidad cero.

### **Pseudo-clases y Pseudo-elementos en CSS**

Las pseudo-clases y pseudo-elementos son herramientas que permiten aplicar estilos a elementos en situaciones específicas o añadir contenido sin modificar el HTML.

### **1. Pseudo-clases**

Son palabras clave que definen un **estado** o una **característica específica** de un elemento.

#### **Sintaxis:**

```css
selector:pseudo-clase {
  propiedad: valor;
}
```

#### **Ejemplos Comunes:**

##### **`:hover`**

Se aplica cuando el usuario coloca el cursor sobre un elemento.

```css
button:hover {
  background-color: blue;
  color: white;
}
```

**Efecto:** Cambia el color del botón al pasar el mouse.

---

##### **`:focus`**

Se activa cuando un elemento, como un campo de entrada, está enfocado (por ejemplo, al hacer clic o usar la tecla TAB).

```css
input:focus {
  border: 2px solid green;
  outline: none;
}
```

**Efecto:** Aplica un borde verde al campo cuando está enfocado.

---

##### **`:nth-child`**

Selecciona elementos basados en su **posición** dentro de su contenedor.

```css
li:nth-child(odd) {
  background-color: lightgray;
}

li:nth-child(3) {
  font-weight: bold;
}
```

**Efecto:**

- Los elementos impares tienen fondo gris.
- El tercer elemento se muestra en negrita.

---

##### **`:first-of-type`**

Selecciona el **primer elemento** de su tipo dentro de su contenedor.

```css
p:first-of-type {
  font-size: 20px;
  color: teal;
}
```

**Efecto:** Solo el primer `<p>` tendrá el estilo.

---

### **2. Pseudo-elementos**

Son utilizados para **crear y estilizar contenido adicional** que no está en el HTML.

#### **Sintaxis:**

```css
selector::pseudo-elemento {
  propiedad: valor;
}
```

#### **Ejemplos Comunes:**

##### **`::before`**

Crea contenido antes del contenido del elemento seleccionado.

```css
h1::before {
  content: "⚡ ";
  color: gold;
}
```

**Efecto:** Agrega un ícono antes del título.

---

##### **`::after`**

Crea contenido después del contenido del elemento seleccionado.

```css
h1::after {
  content: " ✨";
  color: pink;
}
```

**Efecto:** Agrega un ícono al final del título.

---

##### **`::placeholder`**

Estiliza el texto de marcador de posición (placeholder) en los campos de entrada.

```css
input::placeholder {
  color: gray;
  font-style: italic;
}
```

**Efecto:** Cambia el color y el estilo del texto de marcador en los campos de entrada.

---

### **Ejemplo Práctico: Pseudo-clases y Pseudo-elementos**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <style>
      /* Pseudo-clases */
      button:hover {
        background-color: darkblue;
        color: white;
      }

      input:focus {
        border: 2px solid green;
        outline: none;
      }

      li:nth-child(odd) {
        background-color: lightgray;
      }

      p:first-of-type {
        font-weight: bold;
      }

      /* Pseudo-elementos */
      h1::before {
        content: "⚡ ";
        color: gold;
      }

      h1::after {
        content: " ✨";
        color: pink;
      }

      input::placeholder {
        color: gray;
        font-style: italic;
      }
    </style>
  </head>
  <body>
    <h1>Título con íconos</h1>
    <button>Haz clic aquí</button>
    <input type="text" placeholder="Escribe algo..." />
    <ul>
      <li>Elemento 1</li>
      <li>Elemento 2</li>
      <li>Elemento 3</li>
      <li>Elemento 4</li>
    </ul>
    <p>Primer párrafo.</p>
    <p>Segundo párrafo.</p>
  </body>
</html>
```

**Descripción del Ejemplo:**

1. Al pasar el cursor sobre el botón, cambia de color.
2. El campo de entrada cambia el borde al enfocarse y el placeholder es estilizado.
3. La lista tiene un fondo alternado para los elementos impares.
4. El primer párrafo se destaca.
5. El título tiene íconos antes y después.

---

### **Resumen**

- **Pseudo-clases:** Definen estados específicos (`:hover`, `:focus`, `:nth-child`).
- **Pseudo-elementos:** Crean contenido adicional (`::before`, `::after`, `::placeholder`).

## 12. **Variables y Funciones CSS**

### **Variables CSS: `--variable` y `var()`**

Las **variables CSS** permiten almacenar valores reutilizables dentro de tu archivo CSS, lo que hace que el código sea más flexible y fácil de mantener. Estas variables pueden ser utilizadas para almacenar colores, tamaños, fuentes y otras propiedades, lo que facilita los cambios globales en tu sitio web.

### **1. Sintaxis de las Variables CSS**

#### **Declaración de Variables**

Las variables CSS se declaran dentro de un bloque de reglas, generalmente en el selector `:root`, que representa el nivel más alto de la jerarquía y garantiza que la variable sea accesible globalmente.

```css
:root {
  --primary-color: #3498db;
  --font-size: 16px;
}
```

**Explicación:**

- `--primary-color`: una variable que almacena el color principal.
- `--font-size`: una variable que almacena el tamaño de la fuente.

#### **Uso de Variables con `var()`**

Una vez declarada la variable, se usa la función `var()` para acceder a su valor.

```css
body {
  background-color: var(--primary-color);
  font-size: var(--font-size);
}
```

**Explicación:**

- `var(--primary-color)`: se utiliza para aplicar el valor de la variable `--primary-color` al fondo del cuerpo.
- `var(--font-size)`: se usa para aplicar el tamaño de fuente.

---

### **2. Ámbito de las Variables**

Las variables CSS tienen un **ámbito de alcance**. Si las defines en `:root`, estarán disponibles globalmente en todo el documento, pero si las defines dentro de un selector, solo estarán disponibles dentro de ese selector.

#### **Ejemplo de Ámbito Global:**

```css
:root {
  --primary-color: #3498db;
}

p {
  color: var(--primary-color); /* El color será el mismo en todos los <p> */
}
```

#### **Ejemplo de Ámbito Local:**

```css
.container {
  --container-bg: #f0f0f0; /* Solo accesible dentro de .container */
}

.container {
  background-color: var(--container-bg);
}

section {
  background-color: var(
    --container-bg
  ); /* Esto no funcionará, ya que --container-bg solo está definido dentro de .container */
}
```

---

### **3. Variables con Valores Predeterminados**

Puedes proporcionar un **valor predeterminado** que se utilizará en caso de que la variable no esté definida o no se pueda acceder a ella.

```css
body {
  background-color: var(
    --primary-color,
    #e0e0e0
  ); /* Si --primary-color no está definido, usará #e0e0e0 */
}
```

**Explicación:**

- Si `--primary-color` no está definida, el color de fondo será `#e0e0e0`.

---

### **4. Ventajas del Uso de Variables CSS**

- **Mantenimiento más fácil:** Si deseas cambiar un valor en todo tu sitio (por ejemplo, un color), solo necesitas cambiarlo en un lugar, en lugar de buscar y reemplazar en todo el CSS.
- **Reutilización de valores:** Puedes utilizar las mismas variables en diferentes partes del CSS, lo que hace que tu código sea más limpio y modular.
- **Interactividad:** Las variables pueden ser modificadas dinámicamente con JavaScript, lo que permite crear temas dinámicos o cambios en tiempo real.

---

### **5. Ejemplo Completo con Variables CSS**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <style>
      :root {
        --primary-color: #3498db;
        --secondary-color: #2ecc71;
        --font-size: 16px;
        --padding: 10px;
      }

      body {
        font-size: var(--font-size);
        background-color: var(--primary-color);
        color: white;
      }

      h1 {
        color: var(--secondary-color);
      }

      .container {
        padding: var(--padding);
        background-color: #ffffff;
        color: #333;
      }
    </style>
  </head>
  <body>
    <h1>Bienvenidos a mi sitio</h1>
    <div class="container">
      <p>Este es un ejemplo utilizando variables CSS.</p>
    </div>
  </body>
</html>
```

**Explicación del Ejemplo:**

1. Las variables se definen en `:root`, lo que las hace globales.
2. Se aplican las variables a diferentes propiedades (color de fondo, tamaño de fuente, padding, etc.).
3. Si deseas cambiar el color de fondo, puedes hacerlo modificando solo el valor de `--primary-color` en un lugar.

---

### **Resumen**

- **Declaración:** `--nombre-variable: valor;`
- **Uso:** `var(--nombre-variable);`
- **Ámbito:** Global si se declara en `:root`, local si se declara dentro de un selector.
- **Valor predeterminado:** `var(--nombre-variable, valor-predeterminado);`

### **Funciones Útiles en CSS: `calc()`, `min()`, `max()`, `clamp()`**

CSS ofrece varias funciones que te permiten realizar cálculos y establecer valores dinámicos de manera flexible. Estas funciones son útiles para adaptar el diseño de tu sitio a diferentes tamaños de pantalla, necesidades de espaciado y más.

### **1. `calc()`**

La función `calc()` permite realizar **cálculos matemáticos** para determinar el valor de una propiedad. Puedes combinar unidades diferentes, como porcentajes y píxeles, lo que da flexibilidad en el diseño.

#### **Sintaxis:**

```css
propiedad: calc(expresión);
```

#### **Ejemplos:**

##### **Combinando diferentes unidades:**

```css
div {
  width: calc(
    100% - 20px
  ); /* La anchura es el 100% del contenedor menos 20 píxeles */
}
```

**Explicación:**  
Calcula un valor en el que el ancho del div es el 100% del contenedor menos 20 píxeles.

##### **Usando valores relativos y absolutos:**

```css
header {
  height: calc(
    50vh + 100px
  ); /* El 50% de la altura de la ventana más 100 píxeles */
}
```

**Explicación:**  
Calcula la altura del encabezado, combinando un porcentaje de la altura de la ventana (`50vh`) con un valor fijo de `100px`.

---

### **2. `min()`**

La función `min()` devuelve el **valor más pequeño** de los valores proporcionados. Es útil cuando deseas que una propiedad no sea mayor que cierto valor.

#### **Sintaxis:**

```css
propiedad: min(valor1, valor2);
```

#### **Ejemplo:**

```css
div {
  width: min(
    80%,
    600px
  ); /* La anchura será como máximo el 80% del contenedor, pero nunca más de 600px */
}
```

**Explicación:**  
La anchura del div será el menor valor entre `80%` y `600px`. Si el 80% es mayor que 600px, se tomará `600px`.

---

### **3. `max()`**

La función `max()` devuelve el **valor más grande** entre los valores proporcionados. Es útil para establecer valores mínimos y máximos dinámicos en función de diferentes condiciones.

#### **Sintaxis:**

```css
propiedad: max(valor1, valor2);
```

#### **Ejemplo:**

```css
div {
  font-size: max(
    16px,
    5vw
  ); /* El tamaño de fuente será como mínimo 16px, pero puede ser mayor según el tamaño de la ventana */
}
```

**Explicación:**  
El tamaño de la fuente será al menos de `16px`, pero crecerá proporcionalmente con el 5% del ancho de la ventana si es mayor.

---

### **4. `clamp()`**

La función `clamp()` permite establecer un **valor dentro de un rango**. Toma tres parámetros: el valor mínimo, el valor preferido y el valor máximo. Es útil para crear diseños responsivos.

#### **Sintaxis:**

```css
propiedad: clamp(valor-minimo, valor-preferido, valor-máximo);
```

#### **Ejemplo:**

```css
div {
  font-size: clamp(
    14px,
    5vw,
    24px
  ); /* El tamaño de fuente será mínimo 14px, preferido 5% del ancho de la ventana, y máximo 24px */
}
```

**Explicación:**  
El tamaño de la fuente nunca será menor que `14px` ni mayor que `24px`. Sin embargo, entre esos límites, se ajustará dinámicamente en función del 5% del ancho de la ventana (`5vw`).

---

### **Ejemplo Completo con todas las funciones**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <style>
      body {
        font-family: Arial, sans-serif;
      }

      .container {
        width: 100%;
        max-width: 1200px;
        margin: 0 auto;
        padding: 20px;
        background-color: #f4f4f4;
      }

      .responsive-box {
        width: calc(50% - 20px);
        margin: 10px;
        background-color: lightblue;
        padding: 20px;
        font-size: clamp(16px, 3vw, 24px);
      }

      .dynamic-width {
        width: min(80%, 500px);
        height: 200px;
        background-color: coral;
      }

      .dynamic-height {
        height: max(300px, 20vh);
        background-color: teal;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <div class="responsive-box">Caja con tamaño de fuente responsivo.</div>
      <div class="dynamic-width">
        Caja con anchura dinámica (min). No excederá 500px.
      </div>
      <div class="dynamic-height">
        Caja con altura dinámica (max). Siempre será mayor que 300px.
      </div>
    </div>
  </body>
</html>
```

**Explicación del Ejemplo:**

- La `.responsive-box` usa `clamp()` para un tamaño de fuente que cambia según el tamaño de la ventana, pero dentro de los límites especificados.
- `.dynamic-width` usa `min()` para asegurar que la anchura de la caja no exceda los 500px, pero que también responda al tamaño de la pantalla.
- `.dynamic-height` usa `max()` para garantizar que la altura de la caja siempre sea al menos `300px`, pero puede ser mayor si la ventana es lo suficientemente alta.

---

### **Resumen**

- **`calc()`**: Permite hacer cálculos con unidades diferentes (como `px` y `%`).
- **`min()`**: Devuelve el valor más pequeño entre los valores proporcionados.
- **`max()`**: Devuelve el valor más grande entre los valores proporcionados.
- **`clamp()`**: Restringe un valor a un rango específico (mínimo, preferido, máximo).

## 13. **Accesibilidad Visual**

### **Accesibilidad Visual en CSS**

La accesibilidad visual en un sitio web es crucial para garantizar que todos los usuarios, independientemente de sus capacidades visuales, puedan interactuar con el contenido de manera efectiva. Existen pautas y herramientas que permiten crear diseños que sean accesibles para personas con discapacidades visuales, como la baja visión o el daltonismo.

### **1. Contraste de Colores según WCAG (Web Content Accessibility Guidelines)**

El contraste adecuado de colores es esencial para garantizar que el texto sea legible para personas con dificultades visuales. Las **WCAG** (Web Content Accessibility Guidelines) proporcionan pautas sobre el contraste de colores entre el texto y su fondo.

#### **Normas de Contraste según WCAG:**

- **Contraste mínimo recomendado:**
  - Para texto normal: **4.5:1**
  - Para texto grande (mayor a 18px o 14px en negrita): **3:1**
- **Contraste ideal:**
  - Idealmente, se busca un contraste de **7:1** para mejorar la legibilidad.

#### **Cómo se mide el contraste:**

El contraste se mide utilizando una **relación de contraste** que compara la luminosidad de los colores. Cuanto mayor sea la relación, mejor será el contraste.

Puedes usar herramientas como el **Contrast Checker** de WebAIM o el **Color Contrast Analyzer** para evaluar si el contraste de tu combinación de colores cumple con las pautas WCAG.

#### **Ejemplo de elección de colores con buen contraste:**

```css
body {
  color: #000000; /* Texto negro */
  background-color: #ffffff; /* Fondo blanco */
}
```

El contraste entre negro y blanco es **21:1**, lo cual es un contraste ideal.

---

### **2. Propiedades como `outline` para Navegación por Teclado**

La **navegación por teclado** es crucial para personas con discapacidades motoras o visuales que no pueden usar un mouse. Una de las formas de mejorar la accesibilidad es asegurarse de que los elementos interactivos, como botones, enlaces y campos de formulario, sean claramente visibles cuando se navega con el teclado.

#### **Uso de `outline` para indicar el foco de un elemento:**

Cuando un usuario navega por un sitio utilizando el teclado (por ejemplo, con la tecla **Tab**), es esencial que el sitio resalte visualmente el **elemento enfocado**. Esto se logra mediante la propiedad `outline`.

```css
button:focus {
  outline: 3px solid #00f; /* Resalta el botón con un borde azul al estar enfocado */
}
```

#### **Consejos:**

- No elimines el `outline` por defecto sin proporcionar alguna otra indicación visual, como un cambio de color o fondo.
- Usa `:focus` y `:focus-visible` para manejar la visibilidad del foco de manera apropiada en diferentes navegadores.

```css
/* Buenas prácticas de accesibilidad para el foco */
button:focus-visible {
  outline: 3px solid #00f; /* Añadir contorno visible solo cuando el usuario navega con el teclado */
}
```

---

### **3. Diseño Adaptativo para Diferentes Capacidades**

El diseño **adaptativo** asegura que los sitios web sean funcionales y legibles para personas con diversas capacidades visuales, como baja visión, daltonismo, etc.

#### **Consideraciones para diseño accesible:**

1. **Escala de fuentes:**

   - Permite que los usuarios cambien el tamaño de la fuente sin afectar la legibilidad del contenido.
   - Usa unidades relativas como `em`, `rem` o `%` para el tamaño de las fuentes.

   ```css
   body {
     font-size: 1rem; /* Tamaño de fuente relativo */
   }
   ```

2. **Contraste y colores amigables con el daltonismo:**

   - Utiliza combinaciones de colores que sean fácilmente distinguibles para personas con diferentes tipos de daltonismo.
   - Puedes usar herramientas como **Coblis** o **Color Oracle** para simular cómo se verían los colores para personas con diferentes tipos de daltonismo.

3. **Evitar el uso de solo color para transmitir información:**

   - No relies exclusivamente en el color para transmitir información. Usa íconos o texto adicional para asegurar que la información sea accesible.

   ```css
   .error {
     color: red;
     font-weight: bold;
   }
   ```

4. **Contrastar el fondo y los colores de texto:**
   - Asegúrate de que haya un buen contraste entre el texto y el fondo. Evita usar colores brillantes o saturados como fondo con texto en blanco o negro.
5. **Evitar movimiento rápido o interrumpido:**

   - Algunos usuarios pueden tener mareos o molestias al ver animaciones rápidas. Asegúrate de proporcionar una opción para desactivar las animaciones o que estas sean suaves.

   ```css
   @media (prefers-reduced-motion: reduce) {
     .box {
       transition: none; /* Desactiva la animación si el usuario prefiere menos movimiento */
     }
   }
   ```

---

### **Resumen:**

- **Contraste de colores:** Utiliza colores con un buen contraste para asegurar la legibilidad, siguiendo las pautas de WCAG.
- **Navegación por teclado:** Usa la propiedad `outline` para asegurar que los elementos enfocados sean claramente visibles al navegar con el teclado.
- **Diseño adaptativo:** Asegúrate de que tu diseño sea accesible para personas con discapacidades visuales utilizando unidades relativas para el tamaño de las fuentes, evitando el uso exclusivo de color y considerando las preferencias de movimiento del usuario.

## 14. **Manipulación Visual**

### **Transformaciones en CSS**

La propiedad `transform` de CSS permite aplicar transformaciones 2D y 3D a los elementos de una página web. Estas transformaciones afectan la apariencia del contenido sin alterar el flujo del documento, lo que significa que el diseño de la página no se ve afectado por la transformación.

### **Propiedad `transform`**

La propiedad `transform` es utilizada para aplicar transformaciones a un elemento. Puedes combinar múltiples transformaciones dentro de la misma declaración, separadas por espacios.

#### **Valores comunes de `transform`:**

1. **`translate(x, y)`**: Mueve un elemento desde su posición original en el eje **X** (horizontal) y **Y** (vertical). La unidad puede ser **px**, **em**, **%,** etc.

   ```css
   .box {
     transform: translate(
       50px,
       100px
     ); /* Mueve 50px a la derecha y 100px hacia abajo */
   }
   ```

   **Ejemplo:**

   ```html
   <div class="box">¡Soy una caja!</div>
   ```

   ```css
   .box {
     width: 100px;
     height: 100px;
     background-color: teal;
     transition: transform 0.3s ease;
   }

   .box:hover {
     transform: translate(50px, 50px); /* Mueve la caja cuando se hace hover */
   }
   ```

2. **`rotate(deg)`**: Gira el elemento alrededor de su punto de origen. El valor es un ángulo en grados (°).

   ```css
   .box {
     transform: rotate(45deg); /* Rota 45 grados */
   }
   ```

   **Ejemplo:**

   ```html
   <div class="box">¡Estoy rotando!</div>
   ```

   ```css
   .box {
     width: 100px;
     height: 100px;
     background-color: teal;
     transition: transform 0.3s ease;
   }

   .box:hover {
     transform: rotate(45deg); /* Rota la caja cuando se hace hover */
   }
   ```

3. **`scale(x, y)`**: Escala (cambia el tamaño) del elemento, donde **x** es el factor de escala horizontal y **y** es el factor de escala vertical. Si se omite uno de los valores, el otro se ajusta automáticamente.

   ```css
   .box {
     transform: scale(
       1.5,
       1.5
     ); /* Aumenta el tamaño en un 50% tanto en X como en Y */
   }
   ```

   **Ejemplo:**

   ```html
   <div class="box">¡Estoy escalando!</div>
   ```

   ```css
   .box {
     width: 100px;
     height: 100px;
     background-color: teal;
     transition: transform 0.3s ease;
   }

   .box:hover {
     transform: scale(1.5); /* Aumenta el tamaño cuando se hace hover */
   }
   ```

---

### **Combinación de Transformaciones**

Puedes aplicar múltiples transformaciones a la vez, combinándolas dentro de la misma declaración de `transform`. El orden de las transformaciones importa, ya que algunas transformaciones afectan a las siguientes.

```css
.box {
  transform: translate(50px, 50px) rotate(45deg) scale(1.2);
}
```

En este caso, la caja será trasladada, luego rota, y finalmente escalada. La secuencia es importante porque cada transformación afecta la posición y el tamaño del elemento antes de aplicar la siguiente.

---

### **Propiedades de Transformación Relacionadas:**

1. **`transform-origin`**: Esta propiedad te permite cambiar el punto de referencia de la transformación. El valor por defecto es el centro del elemento, pero puedes establecerlo en cualquier parte del mismo (como las esquinas).

   ```css
   .box {
     transform-origin: top left; /* Establece el origen de transformación en la esquina superior izquierda */
     transform: rotate(45deg);
   }
   ```

2. **`perspective`**: En transformaciones 3D, esta propiedad define la distancia entre el plano de la pantalla y el observador, lo que afecta la intensidad del efecto de profundidad.

   ```css
   .box-container {
     perspective: 500px; /* Distancia entre el observador y la caja */
   }

   .box {
     transform: rotateY(45deg);
   }
   ```

---

### **Ejemplo Práctico:**

```html
<div class="box"></div>
```

```css
.box {
  width: 100px;
  height: 100px;
  background-color: teal;
  transition: transform 0.5s ease;
}

.box:hover {
  transform: translate(50px, 50px) rotate(45deg) scale(1.2);
}
```

En este ejemplo, al hacer hover sobre la caja, el elemento se mueve 50px a la derecha y 50px hacia abajo (`translate`), luego rota 45 grados (`rotate`), y finalmente se escala al 120% de su tamaño (`scale`).

---

### **Resumen:**

- **`translate(x, y)`**: Mueve un elemento a lo largo de los ejes X y Y.
- **`rotate(deg)`**: Rota un elemento alrededor de su punto de origen.
- **`scale(x, y)`**: Cambia el tamaño de un elemento en los ejes X y Y.

### **Filtros en CSS**

La propiedad `filter` en CSS se utiliza para aplicar efectos gráficos a los elementos, como desenfoques, cambios de brillo, contraste, entre otros. Esto permite modificar la apariencia visual de una imagen, texto o cualquier otro tipo de contenido HTML sin necesidad de manipular la imagen o el contenido en una herramienta externa.

### **Propiedad `filter`**

La propiedad `filter` acepta varios valores que alteran la visualización de un elemento. Estos valores pueden aplicarse de manera combinada, utilizando espacios entre ellos.

#### **Filtros Comunes**

1. **`blur(px)`**: Aplica un desenfoque gaussiano al contenido del elemento. El valor en **px** indica la cantidad de desenfoque.

   ```css
   .image {
     filter: blur(5px); /* Desenfoque de 5px */
   }
   ```

   **Ejemplo:**

   ```html
   <img class="image" src="image.jpg" alt="Imagen desenfocada" />
   ```

2. **`brightness(%)`**: Ajusta el brillo del elemento. Un valor de **100%** es el brillo original, valores mayores lo hacen más brillante y valores menores lo oscurecen.

   ```css
   .image {
     filter: brightness(150%); /* Aumenta el brillo un 50% */
   }
   ```

3. **`contrast(%)`**: Ajusta el contraste del elemento. Un valor de **100%** es el contraste original, valores mayores aumentan el contraste y valores menores lo disminuyen.

   ```css
   .image {
     filter: contrast(50%); /* Reduce el contraste a la mitad */
   }
   ```

4. **`grayscale(%)`**: Convierte el elemento a escala de grises. Un valor de **100%** convierte la imagen completamente en escala de grises, mientras que **0%** no aplica ningún cambio.

   ```css
   .image {
     filter: grayscale(100%); /* Convierte la imagen a blanco y negro */
   }
   ```

5. **`sepia(%)`**: Aplica un tono sepia al elemento, simulando una imagen envejecida. Un valor de **100%** aplica un efecto sepia completo.

   ```css
   .image {
     filter: sepia(80%); /* Aplica un 80% de tono sepia */
   }
   ```

6. **`hue-rotate(deg)`**: Cambia el matiz de los colores del elemento. El valor en **grados (deg)** rota el matiz en el círculo de colores.

   ```css
   .image {
     filter: hue-rotate(90deg); /* Gira el matiz 90 grados */
   }
   ```

7. **`invert(%)`**: Invierte los colores del elemento. Un valor de **100%** invierte completamente los colores, mientras que **0%** no realiza ningún cambio.

   ```css
   .image {
     filter: invert(100%); /* Invierte los colores */
   }
   ```

8. **`saturate(%)`**: Aumenta o disminuye la saturación de los colores del elemento. Un valor de **100%** es la saturación original, mientras que valores mayores intensifican los colores y valores menores los hacen más apagados.

   ```css
   .image {
     filter: saturate(200%); /* Aumenta la saturación al doble */
   }
   ```

9. **`drop-shadow(offset-x offset-y blur-radius color)`**: Aplica una sombra al contenido del elemento, similar a la propiedad `box-shadow`, pero permite trabajar con imágenes y otros elementos.

   ```css
   .image {
     filter: drop-shadow(
       10px 10px 5px rgba(0, 0, 0, 0.5)
     ); /* Sombra de 10px desplazada en X y Y */
   }
   ```

---

### **Combinación de Filtros**

Puedes combinar múltiples filtros en una sola propiedad `filter`, separándolos por espacios. El orden de los filtros también es importante, ya que algunos filtros pueden afectar a los siguientes.

```css
.image {
  filter: blur(5px) brightness(120%) contrast(80%);
}
```

En este caso, la imagen será desenfocada, luego se aumentará su brillo en un 20% y se reducirá el contraste al 80%.

---

### **Ejemplo Práctico de Filtros:**

Imagina que tienes una imagen y quieres aplicarle varios filtros para hacerla más atractiva al pasar el mouse sobre ella.

```html
<img
  class="image"
  src="https://st2.depositphotos.com/4211709/7708/i/450/depositphotos_77085751-stock-photo-flower.jpg"
  alt="Imagen con filtros"
/>
```

```css
.image {
  width: 300px;
  height: auto;
  transition: filter 0.3s ease;
}

.image:hover {
  filter: blur(3px) brightness(130%) saturate(150%);
}
```

En este ejemplo, cuando se hace hover sobre la imagen, esta se desenfoca ligeramente, se aumenta su brillo y se intensifica la saturación de los colores. Además, el filtro se aplica suavemente gracias a la transición.

---

### **Resumen de Filtros:**

- **`blur(px)`**: Aplica un desenfoque.
- **`brightness(%)`**: Ajusta el brillo.
- **`contrast(%)`**: Ajusta el contraste.
- **`grayscale(%)`**: Convierte a escala de grises.
- **`sepia(%)`**: Aplica un tono sepia.
- **`hue-rotate(deg)`**: Rota el matiz de los colores.
- **`invert(%)`**: Invierte los colores.
- **`saturate(%)`**: Aumenta o disminuye la saturación.
- **`drop-shadow(x y blur color)`**: Aplica una sombra al contenido.

### **Recortes en CSS con `clip-path`**

La propiedad `clip-path` en CSS permite definir una forma a través de la cual se recorta un elemento, creando efectos visuales donde solo se muestra una parte del contenido del elemento. Es útil para crear figuras geométricas, máscaras y otros efectos visuales.

### **Sintaxis Básica**

```css
element {
  clip-path: shape;
}
```

El valor de `clip-path` puede ser una de varias formas predefinidas, como un círculo, una elipse, un polígono o una forma personalizada. También puede utilizarse con URL a imágenes o máscaras.

---

### **Formas Básicas de `clip-path`**

1. **`circle()`**: Recorta el elemento en forma de círculo. Puedes especificar el tamaño y la posición del círculo.

   ```css
   .image {
     clip-path: circle(50% at 50% 50%);
   }
   ```

   En este caso, el recorte será un círculo con radio del 50% del tamaño del elemento y centrado en el medio (50% 50%).

2. **`ellipse()`**: Recorta el elemento en forma de elipse. Similar al círculo, pero puedes ajustar la longitud de los ejes horizontal y vertical.

   ```css
   .image {
     clip-path: ellipse(50% 30% at 50% 50%);
   }
   ```

   Aquí, se crea una elipse con el eje horizontal al 50% y el eje vertical al 30% del tamaño del elemento.

3. **`polygon()`**: Recorta el elemento en una forma de polígono, donde defines una serie de coordenadas que crean los vértices del polígono.

   ```css
   .image {
     clip-path: polygon(50% 0%, 100% 100%, 0% 100%);
   }
   ```

   Este ejemplo crea un triángulo, con vértices en el centro superior (50% 0%), la esquina inferior derecha (100% 100%) y la esquina inferior izquierda (0% 100%).

---

### **Ejemplo Práctico de `clip-path`**

Imagina que tienes una imagen y deseas recortarla con forma de estrella. Aquí te muestro cómo hacerlo:

```html
<img
  class="image"
  src="image.jpg"
  alt="Imagen recortada en forma de estrella"
/>
```

```css
.image {
  width: 300px;
  height: 300px;
  clip-path: polygon(
    50% 0%,
    61% 35%,
    98% 35%,
    68% 57%,
    79% 91%,
    50% 70%,
    21% 91%,
    32% 57%,
    2% 35%,
    39% 35%
  );
}
```

En este caso, la imagen se recorta en una forma de estrella usando el valor `polygon` con una serie de puntos que definen los vértices de la estrella.

---

### **Uso de `clip-path` con Imágenes**

`clip-path` se puede usar para aplicar recortes en imágenes o en otros elementos como divs. Es muy útil para crear máscaras y formas decorativas en interfaces de usuario.

**Ejemplo de imagen recortada con círculo:**

```html
<img class="circle-image" src="image.jpg" alt="Imagen circular" />
```

```css
.circle-image {
  width: 200px;
  height: 200px;
  clip-path: circle(50%);
}
```

Este código recorta la imagen en forma circular con un radio del 50% del tamaño de la imagen.

---

### **Usando `clip-path` con `transition`**

Puedes animar el recorte de un elemento usando `clip-path` junto con transiciones. Esto es útil para crear efectos interactivos.

**Ejemplo de animación en el recorte:**

```html
<img
  class="animated-image"
  src="image.jpg"
  alt="Imagen con animación en clip-path"
/>
```

```css
.animated-image {
  width: 300px;
  height: 300px;
  transition: clip-path 0.5s ease;
  clip-path: circle(0%);
}

.animated-image:hover {
  clip-path: circle(50%);
}
```

En este caso, al hacer hover sobre la imagen, el recorte pasa de un círculo de tamaño 0% a un círculo del 50%, creando una animación.

---

### **Recortes Complejos con `clip-path`**

También puedes utilizar imágenes o URLs con `clip-path`, para crear máscaras personalizadas. Esto puede ser útil para crear formas complejas y estilizar elementos.

```css
.element {
  clip-path: url(#myClipPath);
}
```

Aquí, `#myClipPath` sería el ID de un SVG que define la forma del recorte.

---

### **Resumen:**

La propiedad `clip-path` en CSS permite aplicar recortes a los elementos utilizando diversas formas geométricas. Algunas de las formas más comunes son:

- **`circle()`**: Recorta el elemento en forma de círculo.
- **`ellipse()`**: Recorta el elemento en forma de elipse.
- **`polygon()`**: Recorta el elemento en forma de polígono, definido por coordenadas.
- **Animaciones**: Puedes combinar `clip-path` con transiciones para crear efectos dinámicos.

## 15. **Preprocesadores CSS**

### **Introducción a SASS**

SASS (Syntactically Awesome Stylesheets) es un preprocesador de CSS que extiende las capacidades de CSS permitiendo escribir estilos de manera más eficiente y mantenible. A través de SASS, puedes usar características como variables, mixins, anidamiento (nesting), herencia, funciones y más, que no están disponibles en CSS tradicional.

### **Características Principales de SASS:**

1. **Variables**: Permiten almacenar valores (como colores, fuentes, tamaños) en una variable para reutilizarlos en todo el archivo de estilos.

2. **Nesting (Anidamiento)**: Permite anidar selectores de manera jerárquica, lo que refleja la estructura HTML y hace que el código sea más fácil de leer.

3. **Mixins**: Son bloques de código reutilizables que se pueden incluir en cualquier parte del archivo SASS. Permiten incluir propiedades y valores en diferentes selectores sin tener que escribirlos repetidamente.

4. **`@extend`**: Permite a un selector heredar las propiedades de otro selector, facilitando la reutilización del código.

5. **`@import`**: Permite importar otros archivos SASS o CSS, lo que facilita la organización y modularización del código.

---

### **1. Nesting (Anidamiento)**

El anidamiento en SASS permite escribir selectores dentro de otros, lo que refleja la jerarquía de la estructura HTML. Esto hace que el código sea más limpio y comprensible, ya que no necesitas escribir tantos selectores largos.

**Ejemplo de Nesting:**

```scss
// En SASS
nav {
  background-color: #333;

  ul {
    list-style: none;

    li {
      display: inline-block;

      a {
        color: white;
        text-decoration: none;
      }
    }
  }
}
```

En este ejemplo, los selectores están anidados de acuerdo con la estructura HTML, lo que facilita la lectura y la escritura del código. El código resultante en CSS sería:

```css
nav {
  background-color: #333;
}

nav ul {
  list-style: none;
}

nav ul li {
  display: inline-block;
}

nav ul li a {
  color: white;
  text-decoration: none;
}
```

---

### **2. Variables en SASS**

Las variables permiten almacenar valores como colores, tamaños de fuentes, márgenes, etc., para que puedas usarlos en cualquier parte del archivo. Esto hace que tu código sea más fácil de modificar y mantener.

**Ejemplo de Variables:**

```scss
// Definir variables
$primary-color: #3498db;
$secondary-color: #2ecc71;
$font-size: 16px;

// Usar variables en el código
body {
  font-size: $font-size;
  color: $primary-color;
}

button {
  background-color: $secondary-color;
  color: white;
}
```

El uso de variables facilita la actualización de colores o tamaños sin tener que buscar y reemplazar en todo el archivo.

---

### **3. Mixins**

Los **mixins** permiten crear bloques de código reutilizables que pueden incluirse en cualquier parte del archivo. Esto es útil cuando necesitas aplicar un conjunto de reglas CSS en varios lugares sin tener que escribirlas nuevamente.

**Ejemplo de Mixins:**

```scss
// Definir un mixin
@mixin border-radius($radius) {
  -webkit-border-radius: $radius;
  -moz-border-radius: $radius;
  border-radius: $radius;
}

// Usar el mixin
.box {
  @include border-radius(10px);
}
```

Este mixin crea un borde redondeado con las propiedades necesarias para diferentes navegadores. Al usar `@include border-radius(10px)`, se genera el código adecuado en CSS.

**Resultado en CSS:**

```css
.box {
  -webkit-border-radius: 10px;
  -moz-border-radius: 10px;
  border-radius: 10px;
}
```

---

### **4. `@extend`**

El **`@extend`** permite a un selector heredar las propiedades de otro. Esto es útil cuando tienes estilos comunes que se aplican a varios selectores, y no quieres repetir el código.

**Ejemplo de `@extend`:**

```scss
// Definir un conjunto de estilos
.error {
  color: red;
  font-weight: bold;
}

// Extender el selector .error en otro selector
.alert {
  @extend .error;
  background-color: yellow;
}
```

El selector `.alert` heredará las propiedades de `.error`, por lo que no necesitas escribir las reglas de color y fuente nuevamente. El código CSS resultante será:

```css
.error,
.alert {
  color: red;
  font-weight: bold;
}

.alert {
  background-color: yellow;
}
```

---

### **5. `@import`**

La directiva `@import` en SASS te permite importar otros archivos de estilo, lo que te ayuda a organizar tu código de manera modular. Esto también puede reducir la cantidad de código que se descarga en el navegador, ya que SASS combinará los archivos en uno solo cuando compile el código.

**Ejemplo de `@import`:**

```scss
// archivo _colors.scss
$primary-color: #3498db;
$secondary-color: #2ecc71;

// archivo style.scss
@import "colors";

body {
  background-color: $primary-color;
}
```

Al usar `@import`, el archivo `_colors.scss` se incluirá dentro de `style.scss`, y se compilará todo en un solo archivo CSS.

---

### **Ventajas de usar SASS:**

- **Reutilización de código**: Las variables, mixins y `@extend` ayudan a evitar la repetición de código.
- **Estructura más limpia**: El anidamiento hace que el código sea más fácil de entender.
- **Modularización**: Los archivos pueden dividirse en fragmentos más pequeños y luego importarse cuando sea necesario.
- **Mantenimiento**: Con las variables, puedes realizar cambios en un solo lugar, evitando tener que buscar y reemplazar valores repetidos.

---

### **Resumen**

- **Nesting**: Permite organizar el código de forma jerárquica, reflejando la estructura HTML.
- **Variables**: Almacenan valores reutilizables como colores y tamaños.
- **Mixins**: Bloques de código reutilizables.
- **`@extend`**: Herencia de propiedades de un selector a otro.
- **`@import`**: Importa archivos SASS para modularizar el código.

### **Introducción a LESS**

**LESS** es otro preprocesador de CSS similar a SASS. Ofrece características avanzadas para escribir hojas de estilo de manera más eficiente, como variables, mixins, y funciones. LESS permite crear hojas de estilo más dinámicas y modulares, mejorando la mantenibilidad del código.

### **Características Principales de LESS:**

1. **Variables**: Al igual que SASS, LESS permite definir variables para almacenar valores reutilizables, como colores, tamaños, márgenes, etc.

2. **Mixins**: Los **mixins** en LESS funcionan de manera similar a los de SASS. Son bloques de código reutilizables que puedes incluir en cualquier parte del archivo LESS.

3. **Funciones**: LESS también permite definir funciones personalizadas, lo que te da más control sobre los estilos, permitiendo realizar cálculos o manipular valores de forma más avanzada.

---

### **1. Variables en LESS**

Las variables en LESS se definen con el signo (`@`), y se pueden reutilizar en todo el archivo de estilos.

**Ejemplo de Variables en LESS:**

```less
// Definir variables
@primary-color: #3498db;
@secondary-color: #2ecc71;
@font-size: 16px;

// Usar variables en el código
body {
  font-size: @font-size;
  color: @primary-color;
}

button {
  background-color: @secondary-color;
  color: white;
}
```

En este ejemplo, las variables como `@primary-color` y `@font-size` se definen al principio y luego se utilizan en las reglas CSS, lo que facilita la actualización y mantenimiento de los estilos.

---

### **2. Mixins en LESS**

Los **mixins** en LESS son bloques de código que puedes reutilizar en cualquier parte del archivo. Para definir un mixin, utilizas la palabra clave **mixin** y, si es necesario, puedes pasarle parámetros.

**Ejemplo de Mixins en LESS:**

```less
// Definir un mixin
.border-radius(@radius) {
  -webkit-border-radius: @radius;
  -moz-border-radius: @radius;
  border-radius: @radius;
}

// Usar el mixin
.box {
  .border-radius(10px);
}
```

El mixin `.border-radius()` define las reglas para aplicar un borde redondeado y acepta un parámetro `@radius`. Cuando usas el mixin en el selector `.box`, puedes pasarle el valor de `10px` como parámetro, lo que genera el código CSS correspondiente.

**Resultado en CSS:**

```css
.box {
  -webkit-border-radius: 10px;
  -moz-border-radius: 10px;
  border-radius: 10px;
}
```

---

### **3. Funciones en LESS**

LESS también permite la creación de **funciones** personalizadas. Estas funciones pueden ser útiles para realizar cálculos o manipular valores de manera dinámica. Se pueden usar funciones nativas de LESS (como `ceil()`, `floor()`, `round()`, etc.) o incluso funciones que defines tú mismo.

**Ejemplo de Funciones en LESS:**

```less
// Definir una función que calcule un tamaño dinámico
@base-size: 16px;

.calculate-size(@size) {
  @calculated-size: @size * @base-size;
  return @calculated-size;
}

// Usar la función
.element {
  font-size: .calculate-size(2);  // Resultado: 32px
}
```

En este ejemplo, la función `.calculate-size()` toma un parámetro `@size` y lo multiplica por un valor base (`@base-size`). Luego se utiliza la función para calcular un tamaño dinámico de fuente.

**Resultado en CSS:**

```css
.element {
  font-size: 32px;
}
```

---

### **Resumen de Características de LESS:**

- **Variables**: Puedes almacenar valores en variables (como colores, tamaños, etc.) para facilitar su reutilización.
- **Mixins**: Bloques de código reutilizables que pueden aceptar parámetros, haciendo el código más modular.
- **Funciones**: Permiten crear cálculos o manipular valores dinámicamente.
- **Simplicidad y Flexibilidad**: LESS es fácil de usar y similar a CSS, pero con características poderosas que mejoran la productividad y el mantenimiento del código.

---

### **Ejemplo Completo en LESS**

```less
// Definición de variables
@primary-color: #3498db;
@font-size: 16px;

// Mixin de borde redondeado
.border-radius(@radius) {
  -webkit-border-radius: @radius;
     -moz-border-radius: @radius;
         border-radius: @radius;
}

// Función para calcular el tamaño de fuente
@base-size: 16px;

.calculate-size(@size) {
  @calculated-size: @size * @base-size;
  return @calculated-size;
}

// Uso de variables, mixins y funciones
body {
  font-size: @font-size;
  color: @primary-color;
}

button {
  background-color: @primary-color;
  color: white;
  .border-radius(5px);
}

h1 {
  font-size: .calculate-size(2);
}
```

**Resultado en CSS:**

```css
body {
  font-size: 16px;
  color: #3498db;
}

button {
  background-color: #3498db;
  color: white;
  -webkit-border-radius: 5px;
  -moz-border-radius: 5px;
  border-radius: 5px;
}

h1 {
  font-size: 32px;
}
```

---

### **Ventajas de usar LESS:**

- **Código más limpio y mantenible**: Al igual que SASS, LESS te permite evitar la repetición de código mediante variables, mixins y funciones.
- **Facilidad de uso**: LESS es fácil de aprender si ya conoces CSS, ya que las estructuras son similares.
- **Modularización**: Puedes dividir tu código en archivos más pequeños y luego importarlos según sea necesario.
- **Reutilización**: Puedes reutilizar mixins, variables y funciones en cualquier parte del código, mejorando la eficiencia.

---

### **Conclusión**

LESS, al igual que SASS, es una herramienta poderosa para escribir CSS más dinámico y modular. Sus características principales incluyen **variables**, **mixins** y **funciones**, que te permiten mejorar la organización, la reutilización y el mantenimiento de tus hojas de estilo.

## 16. **Metodologías CSS**

Las metodologías CSS son enfoques estructurados para escribir código CSS, especialmente útiles cuando trabajas en proyectos grandes y colaborativos. Ayudan a organizar el código de manera más eficiente, haciendo que sea más mantenible, escalable y fácil de entender.

Las metodologías más populares incluyen **BEM**, **SMACSS**, e **ITCSS**.

### **1. BEM (Block-Element-Modifier)**

**BEM** es una metodología que organiza y nombra las clases CSS para hacer que el código sea más modular y fácil de mantener. El nombre **BEM** proviene de tres componentes principales:

- **Block**: Un bloque es una unidad independiente que tiene su propio propósito o función. Es el componente principal.
- **Element**: Un elemento es una parte de un bloque que depende de él para su existencia. No puede existir sin el bloque.
- **Modifier**: Un modificador es una variante de un bloque o un elemento que cambia su apariencia o comportamiento.

#### **Convención de Nombres en BEM**

En BEM, se utiliza una convención de nombres específica para los bloques, elementos y modificadores:

- **Block**: `.block`
- **Element**: `.block__element`
- **Modifier**: `.block__element--modifier`

#### **Ejemplo en BEM:**

```html
<!-- Estructura HTML con BEM -->
<div class="card card--highlighted">
  <h2 class="card__title">Título de la tarjeta</h2>
  <p class="card__description">Descripción de la tarjeta</p>
  <button class="card__button card__button--primary">Botón principal</button>
</div>
```

```css
/* Estilos CSS usando BEM */
.card {
  /* Estilos para el bloque "card" */
}

.card__title {
  /* Estilos para el elemento "title" dentro del bloque "card" */
}

.card__description {
  /* Estilos para el elemento "description" dentro del bloque "card" */
}

.card__button {
  /* Estilos para el elemento "button" dentro del bloque "card" */
}

.card--highlighted {
  /* Estilos para la variante "highlighted" del bloque "card" */
}

.card__button--primary {
  /* Estilos para el modificador "primary" del elemento "button" */
}
```

#### **Ventajas de BEM:**

- **Claridad**: El nombre de las clases describe de forma clara el propósito y la relación entre los bloques, elementos y modificadores.
- **Reusabilidad**: Permite reutilizar bloques y elementos en diferentes partes del proyecto sin causar conflictos de estilo.
- **Escalabilidad**: Funciona bien en proyectos grandes, ya que las clases son muy específicas y predecibles.

---

### **2. SMACSS (Scalable and Modular Architecture for CSS)**

**SMACSS** es una metodología de organización de CSS que se enfoca en la modularidad y la escalabilidad. A diferencia de BEM, SMACSS no tiene una convención estricta de nombres, pero sí propone categorías claras para organizar el código CSS.

#### **Categorías de SMACSS:**

1. **Base**: Estilos básicos para elementos comunes, como `html`, `body`, `h1`, `p`, etc. Estos estilos se aplican globalmente.

   ```css
   /* Base */
   body {
     font-family: sans-serif;
     line-height: 1.5;
   }
   ```

2. **Layout**: Estilos para la disposición de las secciones principales de la página, como contenedores, cabeceras y pies de página.

   ```css
   /* Layout */
   .container {
     width: 80%;
     margin: 0 auto;
   }
   ```

3. **Module**: Estilos para los componentes reutilizables, como botones, formularios, tarjetas, etc.

   ```css
   /* Module */
   .card {
     border: 1px solid #ccc;
     padding: 20px;
   }
   ```

4. **State**: Estilos que definen los diferentes estados de los elementos, como "activo", "deshabilitado", "visible", etc.

   ```css
   /* State */
   .is-hidden {
     display: none;
   }
   ```

5. **Theme**: Estilos que definen el tema general del sitio, como colores y tipografía.

   ```css
   /* Theme */
   .theme-dark {
     background-color: #333;
     color: white;
   }
   ```

#### **Ventajas de SMACSS:**

- **Flexibilidad**: SMACSS es menos restrictivo que BEM en cuanto a convenciones de nombres y permite más libertad a los desarrolladores.
- **Escalabilidad**: Organiza el código en categorías claras que permiten un crecimiento modular del proyecto.
- **Mantenibilidad**: Hace que los estilos sean más fáciles de modificar y mantener.

---

### **3. ITCSS (Inverted Triangle CSS)**

**ITCSS** es una metodología que organiza el CSS en una estructura jerárquica de menor a mayor especificidad. Esta metodología se basa en la idea de que los estilos deben estar organizados de la forma más general a la más específica, lo que facilita la reutilización de los estilos y evita conflictos.

#### **Niveles de ITCSS:**

1. **Settings**: Definición de variables globales, como colores, tipografía, tamaños, etc.

   ```css
   /* Settings */
   :root {
     --primary-color: #3498db;
     --font-size: 16px;
   }
   ```

2. **Tools**: Mixins y funciones que se usan en todo el proyecto.

   ```css
   /* Tools */
   @mixin border-radius($radius) {
     -webkit-border-radius: $radius;
     -moz-border-radius: $radius;
     border-radius: $radius;
   }
   ```

3. **Generic**: Estilos globales que no dependen de ninguna clase o componente, como reset de márgenes y paddings.

   ```css
   /* Generic */
   * {
     margin: 0;
     padding: 0;
   }
   ```

4. **Elements**: Estilos para los elementos HTML básicos, como `h1`, `p`, `a`, etc.

   ```css
   /* Elements */
   h1 {
     font-size: 24px;
   }
   ```

5. **Objects**: Estilos reutilizables que se utilizan para construir la estructura de la página, como contenedores, grillas, etc.

   ```css
   /* Objects */
   .container {
     width: 80%;
     margin: 0 auto;
   }
   ```

6. **Components**: Estilos específicos de componentes, como botones, tarjetas, formularios, etc.

   ```css
   /* Components */
   .card {
     border: 1px solid #ccc;
     padding: 20px;
   }
   ```

7. **Trumps**: Estilos para casos muy específicos, como clases de utilidad (por ejemplo, `.hidden` para ocultar un elemento).

   ```css
   /* Trumps */
   .hidden {
     display: none;
   }
   ```

#### **Ventajas de ITCSS:**

- **Organización**: Al estar organizado de forma jerárquica, ITCSS facilita la reutilización y extensión de estilos sin tener que sobrescribir reglas.
- **Modularidad**: Cada nivel se puede modificar de manera independiente, lo que permite una mayor modularidad.
- **Escalabilidad**: Funciona bien en proyectos grandes y equipos de desarrollo.

---

### **Resumen:**

- **BEM**: Enfocado en la modularidad, con una convención de nombres estricta que ayuda a evitar conflictos de clases.
- **SMACSS**: Un enfoque más flexible y escalable que organiza el CSS en categorías como "base", "layout", "module", etc.
- **ITCSS**: Organiza el CSS de menor a mayor especificidad, lo que permite evitar sobrescrituras y facilita la reutilización.

## 17. **Compatibilidad y Propiedades Experimentales**

### **Compatibilidad y Propiedades Experimentales en CSS**

Cuando trabajamos con CSS, uno de los retos más importantes es garantizar que nuestro código sea compatible con la mayor cantidad posible de navegadores y dispositivos. Además, con la evolución constante de CSS, existen propiedades experimentales que pueden no ser compatibles con todos los navegadores. Aquí es donde entran en juego herramientas como **Can I Use**, los **prefijos de navegador**, y la regla `@supports` para manejar las propiedades experimentales de manera efectiva.

### **1. Uso de herramientas como [Can I Use](https://caniuse.com/)**

[**Can I Use**](https://caniuse.com/) es una herramienta web que te permite verificar la compatibilidad de características de CSS (y otras tecnologías web) en diferentes navegadores. Te da información detallada sobre si una propiedad o característica es compatible con la mayoría de los navegadores actuales y versiones anteriores.

#### **Cómo usar Can I Use:**

1. **Accede a Can I Use**: Abre el sitio web [https://caniuse.com/](https://caniuse.com/).
2. **Busca una propiedad**: En la barra de búsqueda, escribe el nombre de la propiedad o característica de CSS que deseas verificar, por ejemplo, `flexbox`, `grid`, `clamp()`, `@supports`, etc.
3. **Revisa los resultados**: Can I Use te mostrará un gráfico con los navegadores y sus versiones que soportan esa característica, y te indicará si necesitas usar algún prefijo de navegador.

#### **Ejemplo de uso de Can I Use:**

Si buscas `grid` en Can I Use, verás una tabla que indica en qué versiones de navegadores como Chrome, Firefox, Safari, y Edge se ha implementado la propiedad `grid`. Si alguna versión no la soporta, Can I Use también te dará recomendaciones sobre cómo hacer que funcione en esos navegadores (por ejemplo, usando prefijos).

---

### **2. Prefijos de Navegador**

Los **prefijos de navegador** son una forma de asegurar que las propiedades experimentales o nuevas sean compatibles en versiones antiguas de navegadores que aún no las soportan completamente. Los prefijos suelen ser necesarios para ciertas propiedades que están en proceso de estandarización o no están completamente implementadas en todos los navegadores.

Los prefijos más comunes son:

- **`-webkit-`**: Para navegadores basados en WebKit (como Chrome, Safari, y versiones antiguas de Opera).
- **`-moz-`**: Para Firefox.
- **`-ms-`**: Para versiones antiguas de Internet Explorer.
- **`-o-`**: Para versiones antiguas de Opera.

#### **Ejemplo de Prefijos de Navegador:**

Supongamos que quieres usar la propiedad `border-radius` (que en sus primeras versiones de implementación requería prefijos). A continuación se muestra cómo utilizar los prefijos de navegador:

```css
/* Con prefijos */
.box {
  -webkit-border-radius: 10px; /* Safari, Chrome */
  -moz-border-radius: 10px; /* Firefox */
  border-radius: 10px; /* Propiedad estándar */
}
```

En este ejemplo:

- `-webkit-border-radius` es para navegadores basados en WebKit.
- `-moz-border-radius` es para Firefox.
- `border-radius` es la propiedad estándar que debe usarse una vez que el soporte en los navegadores esté completamente implementado.

#### **¿Cuándo usar prefijos?**

Los prefijos son más comunes cuando estás utilizando características CSS que aún no han sido completamente estandarizadas o son experimentales. Sin embargo, hoy en día, la mayoría de las propiedades modernas no requieren prefijos, ya que la compatibilidad de los navegadores ha mejorado considerablemente.

---

### **3. Propiedades Experimentales con `@supports`**

La regla **`@supports`** es una forma de hacer que tu código sea más robusto al permitirte verificar si el navegador es compatible con ciertas propiedades o características CSS antes de aplicar un estilo específico. Esta regla se utiliza para trabajar con propiedades experimentales o nuevas que pueden no estar disponibles en todos los navegadores.

#### **Sintaxis de `@supports`:**

```css
@supports (property: value) {
  /* Código CSS aquí se aplica solo si la propiedad es soportada */
}
```

Puedes usar `@supports` para envolver estilos que dependen de una propiedad que podría no ser soportada por todos los navegadores, asegurando que los navegadores que no la soportan no apliquen esos estilos y sigan utilizando el CSS estándar.

#### **Ejemplo de `@supports`:**

Supongamos que quieres usar una nueva propiedad CSS experimental como `clamp()`, pero no todos los navegadores la soportan. Puedes utilizar `@supports` para envolver su uso y proporcionar una alternativa para los navegadores más antiguos.

```css
/* Sin soporte para clamp() */
.element {
  width: 100%;
}

/* Si el navegador soporta clamp() */
@supports (--css: variables) {
  .element {
    width: clamp(200px, 50%, 500px);
  }
}
```

En este ejemplo:

- Los navegadores que no soportan `clamp()` usarán `width: 100%`.
- Los navegadores que sí soportan `clamp()` aplicarán el valor de `clamp()` a la propiedad `width`.

#### **Ventajas de `@supports`:**

- **Compatibilidad con características experimentales**: Puedes utilizar propiedades experimentales sin afectar la compatibilidad general de tu sitio web.
- **Degradación elegante**: Si una propiedad no es soportada, se aplica un estilo alternativo más básico sin romper el diseño.

---

### **Resumen:**

- **Can I Use**: Te ayuda a verificar la compatibilidad de propiedades y características CSS en diferentes navegadores y versiones.
- **Prefijos de Navegador**: Se utilizan para asegurar la compatibilidad con propiedades experimentales en versiones anteriores de navegadores. Los prefijos más comunes son `-webkit-`, `-moz-`, `-ms-`, y `-o-`.
- **`@supports`**: Permite aplicar estilos condicionalmente solo si el navegador soporta una propiedad específica, lo que es útil para trabajar con propiedades experimentales o nuevas.

## 18. **Performance en CSS**

La **optimización del rendimiento en CSS** es fundamental para garantizar que los sitios web carguen rápidamente y ofrezcan una experiencia de usuario fluida. El uso ineficiente de ciertas propiedades y técnicas en CSS puede ralentizar el sitio web, lo que afecta la interacción del usuario, especialmente en dispositivos móviles o con conexiones lentas.

### **1. Optimización de Animaciones: `transform` y `opacity` en lugar de `width`, `height`**

Cuando se crean animaciones o transiciones en CSS, el uso de propiedades como `width` y `height` puede desencadenar un proceso costoso conocido como **reflujo** (reflow) y **repintado** (repaint) en el navegador. Estas operaciones requieren que el navegador recalibre y redibuje la página, lo que puede ser lento, especialmente cuando se realizan animaciones en elementos que afectan el layout.

#### **Reflujo (Reflow)**:

Ocurre cuando se realizan cambios que afectan el layout de la página, como el cambio de tamaño de un elemento (`width`, `height`), que obliga al navegador a recalcular la posición y el tamaño de los elementos en la página.

#### **Repintado (Repaint)**:

Es el proceso en el que el navegador redibuja una parte de la página cuando se cambian las propiedades visuales, como el color o el fondo de un elemento.

**Recomendación**: Usar propiedades como `transform` y `opacity` en lugar de `width`, `height`, `top`, `left`, etc., ya que no afectan el layout y son mucho más eficientes. Estas propiedades solo afectan la **composición** (compositing), que es un proceso mucho más barato para el navegador.

#### **Ejemplo**:

```css
/* Menos eficiente */
.box {
  transition: width 0.5s, height 0.5s;
}

.box:hover {
  width: 200px;
  height: 200px;
}

/* Más eficiente */
.box {
  transition: transform 0.5s, opacity 0.5s;
}

.box:hover {
  transform: scale(1.5); /* Escalando con transform */
  opacity: 0.5; /* Cambiando opacidad */
}
```

**Explicación**:

- **Menos eficiente**: `width` y `height` requieren reflujo y repintado, lo que consume más recursos.
- **Más eficiente**: `transform` y `opacity` solo afectan la capa de composición, lo que es mucho más rápido y eficiente.

---

### **2. Minimización de Reflujo y Repintado**

El **reflujo** y el **repintado** son operaciones que afectan negativamente el rendimiento de la página web, ya que hacen que el navegador vuelva a procesar el layout y redibuje los elementos afectados. Reducir estos procesos es esencial para mejorar la experiencia del usuario.

#### **¿Cuándo ocurre el reflujo?**

- Cambios en el tamaño de un elemento: `width`, `height`, `padding`, `margin`.
- Cambios en la estructura del DOM: agregar o eliminar elementos.
- Cambios en la visibilidad de los elementos: `display`, `visibility`.

#### **¿Cuándo ocurre el repintado?**

- Cambios en el color, borde, sombra, o visibilidad de un elemento.
- Cambios en la propiedad `opacity`.

**Recomendaciones**:

- **Evitar cambios frecuentes en las propiedades de layout** como `width`, `height`, `top`, `left`, que causan reflujo.
- **Evitar manipular el DOM constantemente**. Si necesitas hacer cambios, agrúpalos en una sola operación para evitar múltiples recalculaciones.
- **Usar `requestAnimationFrame`** para animaciones más suaves.

---

### **3. Minificación de CSS**

La **minificación de CSS** es el proceso de eliminar todos los caracteres innecesarios del código CSS (como espacios en blanco, saltos de línea y comentarios) sin afectar su funcionalidad. Esto reduce el tamaño del archivo CSS y mejora los tiempos de carga de la página.

#### **Herramientas de Minificación**:

Existen varias herramientas que puedes usar para minificar tu CSS de forma automática:

- **CSSMin**: Herramienta en línea que te permite minificar tus archivos CSS.
- **PostCSS**: Una herramienta para procesar CSS con plugins, que incluye un plugin de minificación.
- **Terser**: Minificador de JavaScript que también soporta CSS.

#### **Ejemplo de CSS antes y después de la minificación**:

- **Antes**:

```css
/* Estilos para el contenedor */
.container {
  width: 100%;
  height: 100vh;
  margin: 0 auto;
  background-color: #fff;
}

/* Estilos para los elementos dentro */
.container .box {
  width: 50%;
  height: 50%;
  margin: 10px;
  background-color: #333;
}
```

- **Después (minificado)**:

```css
.container {
  width: 100%;
  height: 100vh;
  margin: 0 auto;
  background-color: #fff;
}
.container .box {
  width: 50%;
  height: 50%;
  margin: 10px;
  background-color: #333;
}
```

**Ventajas de la minificación**:

- **Reducción de tamaño**: El tamaño del archivo se reduce significativamente, lo que mejora los tiempos de carga.
- **Mejor rendimiento**: Al ser más pequeño, el navegador descarga y procesa el archivo CSS más rápidamente.

---

### **Resumen de Buenas Prácticas para Optimizar el Rendimiento en CSS**:

1. **Preferir `transform` y `opacity` para animaciones**: Evita usar propiedades que causan reflujo, como `width` o `height`.
2. **Minimizar reflujo y repintado**: Realiza cambios en el DOM de manera eficiente y agrupa las operaciones de cambio de estilo.
3. **Minificar tu CSS**: Reduce el tamaño de los archivos CSS eliminando caracteres innecesarios.

## 19. **Depuración y Testing**

### **Depuración y Testing en CSS**

La **depuración** y el **testing** son fundamentales para garantizar que los estilos CSS de una página funcionen correctamente en todos los navegadores y dispositivos, además de ser una herramienta esencial en la mejora del rendimiento y la accesibilidad.

#### **1. Uso de DevTools para Depuración**

Los **DevTools** (herramientas de desarrollo) son un conjunto de herramientas integradas en los navegadores modernos (como Google Chrome, Firefox, y Edge) que permiten depurar, inspeccionar y probar el código de una página web en tiempo real. Estas herramientas son esenciales para verificar y solucionar problemas de CSS.

##### **Principales características de DevTools para CSS**:

- **Inspector de elementos**: Permite ver y modificar el HTML y CSS de cualquier elemento en la página directamente desde el navegador.
- **Caja de propiedades CSS**: Muestra las propiedades CSS aplicadas a un elemento, incluyendo los valores calculados y los estilos heredados.
- **Vista de reglas CSS**: Te permite ver y editar las reglas CSS aplicadas a un elemento.
- **Vista de cambios en tiempo real**: Puedes modificar los estilos CSS y ver los cambios inmediatamente en el navegador sin necesidad de refrescar la página.
- **Vista de la cascada**: Puedes ver cómo se aplican las reglas CSS en la cascada y cuál tiene mayor prioridad (por ejemplo, si una regla está siendo sobrescrita por otra).

##### **Pasos para usar DevTools**:

1. Haz clic derecho sobre un elemento en la página web y selecciona **"Inspeccionar"** o **"Inspeccionar elemento"**.
2. DevTools se abrirá en la parte inferior o en un panel lateral. En la pestaña **"Elements"**, verás el HTML de la página.
3. A la derecha, en la sección **"Styles"**, puedes ver las reglas CSS aplicadas y hacer modificaciones en tiempo real.
4. Si deseas ver cómo un elemento cambia cuando se pasa el mouse sobre él (por ejemplo, en un `:hover`), puedes activar los **estados de pseudo-clases** usando la opción de **"Emular pseudoclases"** en DevTools.

**Ejemplo**:

- Modifica el tamaño de fuente de un texto usando DevTools para probar diferentes valores sin modificar el archivo CSS real.

#### **2. Validación de CSS con Herramientas Externas**

Las herramientas de validación de CSS ayudan a comprobar si tu código CSS es correcto, sigue las mejores prácticas y es compatible con los estándares web. Estas herramientas verifican errores de sintaxis, propiedades obsoletas y problemas de compatibilidad entre navegadores.

##### **Herramientas comunes de validación de CSS**:

- **[CSS Validation Service (W3C)](https://jigsaw.w3.org/css-validator/)**:

  - Ofrecido por el **W3C**, esta herramienta valida el código CSS según los estándares. Te permite verificar la validez del archivo CSS y corregir errores de sintaxis.
  - Puedes subir un archivo CSS, pegar el código o incluso validar una URL.

- **[Autoprefixer](https://autoprefixer.github.io/)**:

  - Autoprefixer es una herramienta que añade automáticamente los prefijos necesarios a las propiedades CSS para garantizar la compatibilidad con varios navegadores.
  - Esto es especialmente útil cuando usas propiedades experimentales que requieren prefijos como `-webkit`, `-moz`, etc.

- **[Stylelint](https://stylelint.io/)**:
  - Stylelint es un **linter** de CSS que verifica tu código en busca de errores y problemas de estilo. Puedes integrarlo en tu flujo de trabajo mediante herramientas como **PostCSS**.
  - Permite establecer reglas personalizadas y aplicar buenas prácticas, como el orden correcto de las propiedades y el uso de unidades consistentes.

##### **Pasos para validar CSS con el CSS Validation Service (W3C)**:

1. Accede a [CSS Validation Service](https://jigsaw.w3.org/css-validator/).
2. Puedes cargar un archivo CSS, pegar el código directamente o introducir la URL de una página web.
3. La herramienta procesará tu código CSS y te indicará si existen errores de sintaxis o problemas de validación.
4. Si se encuentran errores, puedes corregirlos según las sugerencias proporcionadas por la herramienta.

##### **Ventajas de la validación de CSS**:

- **Detectar errores de sintaxis**: Las herramientas de validación ayudan a identificar errores comunes, como propiedades mal escritas o valores no válidos.
- **Mejor compatibilidad entre navegadores**: Usar herramientas como Autoprefixer garantiza que el código CSS sea compatible con la mayoría de los navegadores sin tener que escribir prefijos manualmente.
- **Mejores prácticas y consistencia**: Herramientas como Stylelint pueden ayudar a mantener la consistencia en el estilo del código y evitar problemas futuros en proyectos grandes.

#### **3. Otras Buenas Prácticas para la Depuración y Testing de CSS**

- **Pruebas en múltiples navegadores**: Asegúrate de que tu sitio web se vea correctamente en diferentes navegadores (Chrome, Firefox, Edge, Safari) y en dispositivos móviles, ya que pueden interpretarse de manera diferente.
- **Pruebas de compatibilidad con dispositivos**: Usa herramientas como **BrowserStack** o **CrossBrowserTesting** para realizar pruebas de compatibilidad en diferentes dispositivos y resoluciones de pantalla.

- **Modo de diseño responsivo en DevTools**: Los navegadores modernos incluyen herramientas para simular cómo se ve tu página en diferentes dispositivos, permitiéndote probar y ajustar el diseño responsivo.

---

### **Resumen**

- **DevTools** es la herramienta más poderosa para depurar y modificar CSS en tiempo real directamente desde el navegador.
- **Herramientas de validación de CSS** como el **W3C CSS Validation Service**, **Autoprefixer** y **Stylelint** son fundamentales para asegurar que tu CSS sea válido, esté optimizado y sea compatible con los navegadores.
- El **testing** debe realizarse en varios navegadores y dispositivos para garantizar que el diseño y los estilos funcionen como se espera.
