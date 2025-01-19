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

...
