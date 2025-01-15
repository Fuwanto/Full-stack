# HTML

# 1. **Introducción a HTML**

HTML, que significa **HyperText Markup Language** (Lenguaje de Marcado de Hipertexto), es el estándar que se utiliza para crear y estructurar el contenido en la web. Es el **esqueleto** de las páginas web, ya que define la estructura básica de los documentos que se muestran en los navegadores.

---

### **Características principales de HTML**

1. **Lenguaje de marcado**: HTML utiliza etiquetas (_tags_) para marcar el contenido y definir su propósito. Por ejemplo:

   - `<p>` define un párrafo.
   - `<h1>` a `<h6>` define encabezados de distintos niveles.
   - `<a>` define enlaces.

2. **Hipertexto**: Permite enlazar diferentes documentos o recursos a través de hipervínculos, lo que facilita la navegación entre páginas.

3. **No es un lenguaje de programación**: HTML no puede ejecutar lógica, como condiciones o bucles. Solo organiza y presenta el contenido.

4. **Base de la web**: Trabaja en conjunto con **CSS** (para el diseño y estilo) y **JavaScript** (para la interactividad) para crear sitios web completos.

---

### **¿Para qué sirve HTML?**

1. **Estructurar el contenido**: Define cómo se organiza el texto, las imágenes, los videos y otros elementos multimedia en una página.
2. **Crear documentos web**: Toda página web comienza con un archivo HTML.
3. **Optimización para motores de búsqueda (SEO)**: Utilizar etiquetas semánticas como `<header>`, `<article>` y `<footer>` ayuda a los buscadores a entender mejor el contenido.
4. **Accesibilidad**: Facilita la navegación para personas con discapacidades al utilizar atributos y etiquetas específicas.

---

### **Ejemplo básico de HTML**

Un documento HTML básico luce así:

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Mi primera página web</title>
  </head>
  <body>
    <h1>¡Hola, mundo!</h1>
    <p>Este es un párrafo de texto en HTML.</p>
    <a href="https://www.google.com">Ir a Google</a>
  </body>
</html>
```

---

### **Estructura de un documento HTML**

1. **`<!DOCTYPE html>`**: Informa al navegador que este es un documento HTML5.
2. **`<html>`**: La raíz de todo el documento.
3. **`<head>`**: Contiene metadatos, como el título de la página o enlaces a estilos CSS.
4. **`<body>`**: Contiene todo el contenido visible al usuario, como texto, imágenes y videos.

![alt text](https://disenowebakus.net/imagenes/articulos/estructura-basica-de-una-pagina-web-en-html.jpg)

## Etiquetas esenciales

### **1. `<title>`**

- **Propósito**: Define el título de la página que aparece en la pestaña del navegador o cuando se guarda en favoritos.
- **Dónde se usa**: Dentro de la etiqueta `<head>`.
- **Ejemplo**:

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Mi página web</title>
  </head>
  <body>
    <h1>Bienvenidos a mi sitio</h1>
  </body>
</html>
```

- **Resultado**: Verás "Mi página web" en la pestaña del navegador.

---

### **2. `<p>`**

- **Propósito**: Representa un párrafo de texto.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<p>Este es un párrafo de texto que explica algo importante.</p>
<p>Otro párrafo que continúa con más información.</p>
```

- **Resultado**: El texto aparecerá como bloques separados por un espacio en la página.

---

### **3. `<h1>` a `<h6>`**

- **Propósito**: Representa encabezados, donde `<h1>` es el más importante (generalmente el título principal) y `<h6>` el menos importante.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<h1>Encabezado principal</h1>
<h2>Subtítulo</h2>
<h3>Sección importante</h3>
<h4>Detalle de la sección</h4>
<h5>Nota adicional</h5>
<h6>Información secundaria</h6>
```

- **Resultado**: Cada encabezado aparece con un tamaño diferente, siendo `<h1>` el más grande.

---

### **4. `<br>`**

- **Propósito**: Inserta un salto de línea, pero **no crea un nuevo párrafo**. Es un elemento vacío (no necesita etiqueta de cierre).
- **Dónde se usa**: Dentro de cualquier etiqueta que contenga texto.
- **Ejemplo**:

```html
<p>Hola,<br />bienvenido a mi sitio web.</p>
```

- **Resultado**: "Hola," y "bienvenido a mi sitio web." aparecerán en líneas separadas.

---

### **5. `<hr>`**

- **Propósito**: Inserta una línea horizontal para separar contenido. También es un elemento vacío.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<h1>Título de sección</h1>
<hr />
<p>Este es el contenido de la sección.</p>
```

- **Resultado**: Verás una línea horizontal bajo el título, separando el contenido.

---

# 2. **Texto y Formato**

## Etiquetas de texto

Estas etiquetas se utilizan para dar formato o resaltar el texto de diferentes maneras:

### **1. `<b>`**

- **Propósito**: Define un texto en **negrita**.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<p>Este texto está en <b>negrita</b>.</p>
```

- **Resultado**: El texto "negrita" aparecerá en negrita.

---

### **2. `<i>`**

- **Propósito**: Define un texto en **cursiva**.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<p>Este texto está en <i>cursiva</i>.</p>
```

- **Resultado**: El texto "cursiva" aparecerá en cursiva.

---

### **3. `<strong>`**

- **Propósito**: Define un texto con **énfasis importante**, normalmente se renderiza en negrita (aunque su significado es semántico, indicando que el contenido tiene mayor importancia).
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<p><strong>¡Atención!</strong> Este mensaje es muy importante.</p>
```

- **Resultado**: "¡Atención!" aparecerá en negrita, indicando su importancia.

---

### **4. `<em>`**

- **Propósito**: Define un texto con **énfasis**, que normalmente se renderiza en cursiva (al igual que `<i>`, pero con un significado semántico).
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<p>Este texto tiene <em>énfasis</em> y está en cursiva.</p>
```

- **Resultado**: "énfasis" aparecerá en cursiva, indicando énfasis en el contenido.

---

### **5. `<mark>`**

- **Propósito**: Resalta un texto, como si estuviera **marcado** con un marcador amarillo (útil para destacar partes del texto).
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<p>El resultado final es <mark>importante</mark>.</p>
```

- **Resultado**: "importante" aparecerá con un fondo amarillo resaltado.

---

### **6. `<small>`**

- **Propósito**: Define un texto con **fuente más pequeña**.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<p>Este texto es de tamaño <small>más pequeño</small>.</p>
```

- **Resultado**: "más pequeño" se mostrará en una fuente más pequeña.

---

### **7. `<del>`**

- **Propósito**: Define un texto **eliminado**, generalmente representado con una línea sobre el texto.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<p>Este texto fue <del>eliminado</del>.</p>
```

- **Resultado**: "eliminado" aparecerá con una línea atravesándolo (tachado).

---

### **8. `<ins>`**

- **Propósito**: Define un texto **insertado**, normalmente representado con un subrayado.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<p>Este texto fue <ins>insertado</ins>.</p>
```

- **Resultado**: "insertado" aparecerá con un subrayado.

## Listas

Las etiquetas de listas en HTML se utilizan para organizar elementos en un formato estructurado:

### **1. `<ul>` (Lista desordenada)**

- **Propósito**: Define una lista desordenada, donde los elementos no tienen un orden específico y se muestran con viñetas (por defecto, un círculo).
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<ul>
  <li>Manzana</li>
  <li>Banana</li>
  <li>Cereza</li>
</ul>
```

- **Resultado**: Los elementos "Manzana", "Banana" y "Cereza" aparecerán en una lista con viñetas.

---

### **2. `<ol>` (Lista ordenada)**

- **Propósito**: Define una lista ordenada, donde los elementos tienen un orden numérico o de letras.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<ol>
  <li>Primer paso</li>
  <li>Segundo paso</li>
  <li>Tercer paso</li>
</ol>
```

- **Resultado**: Los elementos se numerarán automáticamente (1, 2, 3).

---

### **3. `<li>` (Elemento de lista)**

- **Propósito**: Define un **elemento individual** dentro de una lista, ya sea en una lista ordenada (`<ol>`) o desordenada (`<ul>`).
- **Dónde se usa**: Dentro de las etiquetas `<ul>` o `<ol>`.
- **Ejemplo**:

```html
<ul>
  <li>Café</li>
  <li>Té</li>
</ul>
```

- **Resultado**: "Café" y "Té" serán elementos dentro de una lista desordenada.

---

### **4. `<dl>` (Lista de definición)**

- **Propósito**: Define una lista de definiciones, donde cada elemento tiene un **término** y su **definición**.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<dl>
  <dt>HTML</dt>
  <dd>Lenguaje de marcado para crear páginas web.</dd>
  <dt>CSS</dt>
  <dd>Lenguaje de estilo para diseñar páginas web.</dd>
</dl>
```

- **Resultado**: "HTML" y "CSS" son los términos (en `<dt>`) y sus respectivas definiciones están en `<dd>`. Los términos aparecen en negrita y las definiciones debajo.

---

### **5. `<dt>` (Término de la lista de definición)**

- **Propósito**: Define el **término** en una lista de definición, usado dentro de una etiqueta `<dl>`.
- **Dónde se usa**: Dentro de una lista `<dl>`.
- **Ejemplo**:

```html
<dl>
  <dt>JavaScript</dt>
  <dd>Lenguaje de programación usado para interactividad en páginas web.</dd>
</dl>
```

- **Resultado**: "JavaScript" es el término que se destaca, seguido de su definición.

---

### **6. `<dd>` (Definición de un término)**

- **Propósito**: Define la **definición** de un término en una lista de definición, usado dentro de la etiqueta `<dl>`.
- **Dónde se usa**: Dentro de una lista `<dl>`, luego de un `<dt>`.
- **Ejemplo**:

```html
<dl>
  <dt>API</dt>
  <dd>Interfaz de programación de aplicaciones.</dd>
</dl>
```

- **Resultado**: "API" es el término y "Interfaz de programación de aplicaciones" es la definición.

## Enlaces

Los **enlaces** son fundamentales en HTML porque permiten conectar páginas web entre sí, así como dirigir a los usuarios a diferentes recursos. La etiqueta principal que se utiliza para crear enlaces es la **`<a>`**:

### **1. `<a>` (Etiqueta de enlace)**

- **Propósito**: Define un **enlace** o hipervínculo que permite navegar a otra página o recurso.
- **Dónde se usa**: Dentro del `<body>`, generalmente con el atributo `href` que especifica el destino del enlace.
- **Ejemplo**:

```html
<a href="https://www.google.com">Ir a Google</a>
```

- **Resultado**: "Ir a Google" será un enlace. Al hacer clic en él, llevará al usuario a la página de Google.

---

### **Atributos del enlace**

#### **2. `href` (Hypertext Reference)**

- **Propósito**: Define la **URL de destino** a la que se dirige el enlace. Puede ser una URL absoluta (como "https://www.google.com") o relativa (como "pagina.html").
- **Dónde se usa**: Dentro de la etiqueta `<a>`.
- **Ejemplo**:

```html
<a href="https://www.wikipedia.org">Ir a Wikipedia</a>
```

- **Resultado**: El enlace llevará al usuario a la página de Wikipedia.

#### **3. `target`**

- **Propósito**: Especifica **dónde se debe abrir el enlace**. Tiene varios valores posibles:
  - **`_blank`**: Abre el enlace en una nueva ventana o pestaña.
  - **`_self`**: Abre el enlace en el mismo marco o ventana (este es el valor predeterminado).
  - **`_parent`**: Abre el enlace en el marco o ventana padre (si está dentro de un marco).
  - **`_top`**: Abre el enlace en la ventana completa, eliminando cualquier marco.
- **Dónde se usa**: Dentro de la etiqueta `<a>`.
- **Ejemplo**:

```html
<a href="https://www.github.com" target="_blank">Ir a GitHub</a>
```

- **Resultado**: El enlace llevará al usuario a GitHub, pero se abrirá en una **nueva pestaña** del navegador.

#### **4. `rel` (Relación entre el documento actual y el destino)**

- **Propósito**: Define la relación entre el documento actual y el documento al que se dirige el enlace. Es útil para mejorar la seguridad y optimizar la navegación.
  - **`nofollow`**: Indica a los motores de búsqueda que no sigan este enlace.
  - **`noopener`**: Previene que la nueva página tenga acceso a la página de origen a través de `window.opener`, lo que mejora la seguridad.
  - **`noreferrer`**: Evita el envío de información de referencia al sitio de destino.
- **Dónde se usa**: Dentro de la etiqueta `<a>`.
- **Ejemplo**:

```html
<a href="https://www.twitter.com" target="_blank" rel="noopener noreferrer"
  >Ir a Twitter</a
>
```

- **Resultado**: El enlace llevará al usuario a Twitter en una nueva pestaña, y con los atributos `rel` utilizados, se mejorará la seguridad y la privacidad al abrir el enlace.

---

### **Combinación de atributos**

Puedes combinar estos atributos para obtener un comportamiento más específico, como abrir enlaces en nuevas pestañas y mejorar la seguridad al mismo tiempo.

```html
<a href="https://www.example.com" target="_blank" rel="noopener noreferrer"
  >Visitar Example</a
>
```

- **Resultado**: El enlace se abre en una nueva pestaña con seguridad mejorada.

# 3. **Imágenes y Multimedia**

La etiqueta **`<img>`** en HTML se utiliza para insertar imágenes en una página web. Es una de las etiquetas más comunes, pero es un elemento vacío, lo que significa que no tiene una etiqueta de cierre.

### **1. `<img>` (Etiqueta de imagen)**

- **Propósito**: Define una imagen dentro de la página web.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<img src="imagen.jpg" alt="Descripción de la imagen" />
```

- **Resultado**: Inserta la imagen especificada en el atributo `src`.

---

### **Atributos de la etiqueta `<img>`**

#### **2. `src` (Source)**

- **Propósito**: Especifica la **ruta de la imagen** que se quiere mostrar. Puede ser una URL absoluta (como "https://www.example.com/imagen.jpg") o una ruta relativa (como "imagenes/imagen.jpg").
- **Dónde se usa**: Dentro de la etiqueta `<img>`.
- **Ejemplo**:

```html
<img src="https://www.example.com/imagen.jpg" alt="Descripción de la imagen" />
```

- **Resultado**: La imagen que se encuentra en la URL especificada se mostrará en la página web.

#### **3. `alt` (Texto alternativo)**

- **Propósito**: Proporciona un **texto alternativo** que se muestra si la imagen no puede cargarse. También es importante para la accesibilidad, ya que los lectores de pantalla utilizan este texto para describir la imagen a personas con discapacidades visuales.
- **Dónde se usa**: Dentro de la etiqueta `<img>`.
- **Ejemplo**:

```html
<img src="logo.png" alt="Logotipo de la empresa" />
```

- **Resultado**: Si la imagen no se carga por alguna razón, el texto "Logotipo de la empresa" aparecerá en su lugar.

#### **4. `width` (Ancho)**

- **Propósito**: Establece el **ancho** de la imagen. El valor se puede dar en píxeles o en porcentaje (por ejemplo, `width="500"` o `width="50%"`).
- **Dónde se usa**: Dentro de la etiqueta `<img>`.
- **Ejemplo**:

```html
<img src="imagen.jpg" alt="Imagen ejemplo" width="300" />
```

- **Resultado**: La imagen se mostrará con un ancho de 300 píxeles. Si no se especifica el ancho, la imagen se mostrará en su tamaño original.

#### **5. `height` (Altura)**

- **Propósito**: Establece la **altura** de la imagen. Al igual que el `width`, el valor puede ser en píxeles o en porcentaje.
- **Dónde se usa**: Dentro de la etiqueta `<img>`.
- **Ejemplo**:

```html
<img src="imagen.jpg" alt="Imagen ejemplo" height="200" />
```

- **Resultado**: La imagen se mostrará con una altura de 200 píxeles. Si no se especifica, la imagen conservará su altura original.

---

### **Combinación de atributos**

Puedes combinar estos atributos para controlar tanto el tamaño como la accesibilidad de la imagen. Aquí tienes un ejemplo con todos los atributos juntos:

```html
<img src="foto.jpg" alt="Foto de paisaje" width="400" height="300" />
```

- **Resultado**: La imagen de "foto.jpg" se mostrará con un tamaño de 400x300 píxeles y un texto alternativo aparecerá si no puede cargarse.

## Multimedia

Las etiquetas **`<audio>`** y **`<video>`** se utilizan para incrustar contenido multimedia en una página web, como archivos de audio y video. Estas etiquetas permiten que los usuarios reproduzcan multimedia directamente desde su navegador sin necesidad de usar un reproductor externo.

### **1. `<audio>` (Etiqueta de audio)**

- **Propósito**: Se utiliza para insertar un archivo de **audio** en la página web. Esta etiqueta permite la reproducción de música, efectos de sonido, o cualquier archivo de audio.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<audio src="audio.mp3" controls>
  Tu navegador no soporta la etiqueta de audio.
</audio>
```

- **Resultado**: Inserta un reproductor de audio con controles, que permite al usuario reproducir el archivo `audio.mp3`.

El texto **"Tu navegador no soporta la etiqueta de audio"** se incluye dentro de la etiqueta `<audio>` como **contenido alternativo** para los navegadores que no soportan esta etiqueta o si el archivo de audio no puede ser cargado por alguna razón (por ejemplo, si el archivo no está disponible en el servidor).

Este contenido alternativo se muestra solo si el navegador **no es compatible con la etiqueta `<audio>`**, lo cual era un problema en navegadores más antiguos o en navegadores que no tenían soporte para HTML5, que introdujo esta etiqueta. Aunque hoy en día la mayoría de los navegadores modernos son compatibles con las etiquetas de multimedia como `<audio>` y `<video>`, este tipo de texto sigue siendo útil para mantener la accesibilidad y una buena experiencia de usuario en navegadores más antiguos.

- **Si el navegador es compatible con la etiqueta `<audio>`**, el navegador mostrará el reproductor de audio con los controles especificados.
- **Si el navegador no es compatible** o no puede reproducir el archivo de audio, se mostrará el mensaje alternativo: **"Tu navegador no soporta la etiqueta de audio."**

Este enfoque es útil para garantizar que los usuarios reciban un mensaje claro sobre el problema, en lugar de que vean un elemento vacío o sin funcionamiento.

#### **Atributos comunes de `<audio>`**

##### **2. `controls`**

- **Propósito**: Muestra los **controles** de reproducción del audio (play, pause, volumen, etc.) en el navegador.
- **Dónde se usa**: Dentro de la etiqueta `<audio>`.
- **Ejemplo**:

```html
<audio src="audio.mp3" controls>
  Tu navegador no soporta la etiqueta de audio.
</audio>
```

- **Resultado**: Aparecerán los controles de reproducción (play, pause, volumen, etc.) en el reproductor.

##### **3. `autoplay`**

- **Propósito**: Hace que el audio se **reproduzca automáticamente** tan pronto como se cargue la página.
- **Dónde se usa**: Dentro de la etiqueta `<audio>`.
- **Ejemplo**:

```html
<audio src="audio.mp3" controls autoplay>
  Tu navegador no soporta la etiqueta de audio.
</audio>
```

- **Resultado**: El audio comenzará a reproducirse automáticamente sin necesidad de que el usuario presione el botón de "play".

##### **4. `loop`**

- **Propósito**: Hace que el audio se **reproduzca en bucle** indefinidamente.
- **Dónde se usa**: Dentro de la etiqueta `<audio>`.
- **Ejemplo**:

```html
<audio src="audio.mp3" controls loop>
  Tu navegador no soporta la etiqueta de audio.
</audio>
```

- **Resultado**: El audio se reproducirá en un bucle sin fin, empezando de nuevo cada vez que termine.

##### **5. `muted`**

- **Propósito**: **Silencia** el audio de manera predeterminada.
- **Dónde se usa**: Dentro de la etiqueta `<audio>`.
- **Ejemplo**:

```html
<audio src="audio.mp3" controls muted>
  Tu navegador no soporta la etiqueta de audio.
</audio>
```

- **Resultado**: El audio se reproducirá, pero estará silenciado al principio.

---

### **2. `<video>` (Etiqueta de video)**

- **Propósito**: Se utiliza para insertar un archivo de **video** en la página web. Similar a la etiqueta `<audio>`, permite a los usuarios ver el video directamente en el navegador.
- **Dónde se usa**: Dentro del `<body>`.
- **Ejemplo**:

```html
<video src="video.mp4" controls>
  Tu navegador no soporta la etiqueta de video.
</video>
```

- **Resultado**: Inserta un reproductor de video con controles para reproducir el archivo `video.mp4`.

El mensaje **"Tu navegador no soporta la etiqueta de video"** dentro de la etiqueta `<video>` cumple la misma función que el de audio, pero para archivos de video.

Este mensaje es contenido alternativo que aparece **si el navegador no soporta la etiqueta `<video>`** o no puede reproducir el archivo de video por alguna razón (por ejemplo, si el formato del video no es compatible o si el navegador no tiene soporte para HTML5).

- **Si el navegador es compatible con la etiqueta `<video>`**, se mostrará el reproductor de video con los controles para reproducir, pausar, ajustar volumen, etc.
- **Si el navegador no es compatible** con la etiqueta `<video>`, o si no puede reproducir el archivo de video (por ejemplo, si está en un formato que no puede manejar), el mensaje **"Tu navegador no soporta la etiqueta de video."** se mostrará al usuario.

#### **Atributos comunes de `<video>`**

##### **2. `controls`**

- **Propósito**: Muestra los **controles** de reproducción del video (play, pause, volumen, pantalla completa, etc.).
- **Dónde se usa**: Dentro de la etiqueta `<video>`.
- **Ejemplo**:

```html
<video src="video.mp4" controls>
  Tu navegador no soporta la etiqueta de video.
</video>
```

- **Resultado**: Aparecerán los controles de reproducción del video (play, pause, volumen, etc.).

##### **3. `autoplay`**

- **Propósito**: Hace que el video se **reproduzca automáticamente** tan pronto como se cargue la página.
- **Dónde se usa**: Dentro de la etiqueta `<video>`.
- **Ejemplo**:

```html
<video src="video.mp4" controls autoplay>
  Tu navegador no soporta la etiqueta de video.
</video>
```

- **Resultado**: El video comenzará a reproducirse automáticamente tan pronto como se cargue la página.

##### **4. `loop`**

- **Propósito**: Hace que el video se **reproduzca en bucle** indefinidamente.
- **Dónde se usa**: Dentro de la etiqueta `<video>`.
- **Ejemplo**:

```html
<video src="video.mp4" controls loop>
  Tu navegador no soporta la etiqueta de video.
</video>
```

- **Resultado**: El video se reproducirá en un bucle sin fin, comenzando de nuevo cada vez que termine.

##### **5. `muted`**

- **Propósito**: **Silencia** el audio del video de manera predeterminada.
- **Dónde se usa**: Dentro de la etiqueta `<video>`.
- **Ejemplo**:

```html
<video src="video.mp4" controls muted>
  Tu navegador no soporta la etiqueta de video.
</video>
```

- **Resultado**: El video se reproducirá, pero el audio estará silenciado al principio.

# 4. **Tablas**

Las **tablas** en HTML se utilizan para organizar y presentar datos de manera estructurada, usando filas y columnas. La estructura básica de una tabla en HTML está formada por las etiquetas **`<table>`**, **`<tr>`**, **`<td>`** y **`<th>`**.

### **1. `<table>` (Etiqueta de tabla)**

- **Propósito**: Define el contenedor de la tabla, donde se colocan las filas y las celdas de datos.
- **Dónde se usa**: Esta etiqueta envuelve todas las filas de la tabla (contenidas dentro de la etiqueta `<tr>`).
- **Ejemplo**:

```html
<table>
  <!-- Filas y celdas aquí -->
</table>
```

- **Resultado**: Es la estructura general que contiene toda la tabla.

---

### **2. `<tr>` (Etiqueta de fila)**

- **Propósito**: Define una **fila** dentro de la tabla. Cada fila puede contener celdas de datos (con la etiqueta `<td>`) o encabezados (con la etiqueta `<th>`).
- **Dónde se usa**: Dentro de la etiqueta `<table>`, cada fila se coloca con la etiqueta `<tr>`.
- **Ejemplo**:

```html
<table>
  <tr>
    <!-- Celdas de datos o encabezados -->
  </tr>
</table>
```

- **Resultado**: La etiqueta `<tr>` crea una fila dentro de la tabla.

---

### **3. `<td>` (Etiqueta de celda de datos)**

- **Propósito**: Define una **celda de datos** dentro de una fila de la tabla. El contenido dentro de esta celda puede ser texto, imágenes, números, etc.
- **Dónde se usa**: Dentro de una fila (`<tr>`), se coloca dentro de la etiqueta `<td>`.
- **Ejemplo**:

```html
<table>
  <tr>
    <td>Nombre</td>
    <td>Edad</td>
  </tr>
  <tr>
    <td>Alice</td>
    <td>25</td>
  </tr>
</table>
```

- **Resultado**: Crea celdas dentro de una fila, que contienen los datos "Nombre", "Edad", "Alice" y "25".

---

### **4. `<th>` (Etiqueta de celda de encabezado)**

- **Propósito**: Define una **celda de encabezado**. A diferencia de `<td>`, las celdas `<th>` se utilizan para los encabezados de las columnas o filas y se muestran en negrita y centradas por defecto.
- **Dónde se usa**: Similar a `<td>`, pero dentro de una fila que se utiliza para los encabezados de la tabla.
- **Ejemplo**:

```html
<table>
  <tr>
    <th>Nombre</th>
    <th>Edad</th>
  </tr>
  <tr>
    <td>Alice</td>
    <td>25</td>
  </tr>
</table>
```

- **Resultado**: Crea celdas de encabezado para las columnas, mostrando los títulos "Nombre" y "Edad" en negrita.

---

### **Ejemplo completo de una tabla básica**

```html
<table>
  <tr>
    <th>Nombre</th>
    <th>Edad</th>
  </tr>
  <tr>
    <td>Alice</td>
    <td>25</td>
  </tr>
  <tr>
    <td>Bob</td>
    <td>30</td>
  </tr>
</table>
```

- **Resultado**: La tabla tendrá dos columnas (Nombre y Edad) y dos filas de datos (Alice/25 y Bob/30).

---

### **Resumen**

- La etiqueta **`<table>`** es el contenedor de la tabla.
- **`<tr>`** define las filas de la tabla.
- **`<td>`** define las celdas de datos dentro de las filas.
- **`<th>`** define las celdas de encabezado que suelen estar en negrita y centradas.

En HTML, puedes usar las etiquetas **`<thead>`**, **`<tfoot>`** y **`<tbody>`** para organizar y estructurar mejor las tablas, separando la cabecera, el cuerpo y el pie de la tabla. Estas etiquetas mejoran la accesibilidad y facilitan la gestión de tablas complejas. A continuación, te explico cada una de ellas.

## Cabeceras y pies de tabla

### **1. `<thead>` (Cabecera de la tabla)**

- **Propósito**: Define el **encabezado** de la tabla, donde generalmente se colocan los títulos de las columnas.
- **Dónde se usa**: Al principio de la tabla, antes de las filas de datos.
- **Ejemplo**:

```html
<table>
  <thead>
    <tr>
      <th>Nombre</th>
      <th>Edad</th>
    </tr>
  </thead>
  <tbody>
    <!-- Filas de datos -->
  </tbody>
</table>
```

- **Resultado**: El `<thead>` contiene una fila con los encabezados "Nombre" y "Edad", y este bloque está separado visualmente del cuerpo de la tabla.

---

### **2. `<tfoot>` (Pie de la tabla)**

- **Propósito**: Define el **pie** de la tabla, que generalmente contiene resúmenes, totales o notas finales. Es útil para que el pie de la tabla se quede visible incluso cuando el cuerpo de la tabla tiene muchas filas.
- **Dónde se usa**: Al final de la tabla, después del cuerpo (`<tbody>`).
- **Ejemplo**:

```html
<table>
  <thead>
    <tr>
      <th>Nombre</th>
      <th>Edad</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Alice</td>
      <td>25</td>
    </tr>
    <tr>
      <td>Bob</td>
      <td>30</td>
    </tr>
  </tbody>
  <tfoot>
    <tr>
      <td>Total</td>
      <td>55</td>
    </tr>
  </tfoot>
</table>
```

- **Resultado**: El `<tfoot>` contiene una fila con el texto "Total" y la suma de las edades, "55", al final de la tabla.

---

### **3. `<tbody>` (Cuerpo de la tabla)**

- **Propósito**: Define el **cuerpo** de la tabla, donde se colocan los datos. Es el bloque donde están la mayoría de las filas con los datos reales que se presentan en la tabla.
- **Dónde se usa**: En el medio de la tabla, entre la cabecera (`<thead>`) y el pie (`<tfoot>`).
- **Ejemplo**:

```html
<table>
  <thead>
    <tr>
      <th>Nombre</th>
      <th>Edad</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Alice</td>
      <td>25</td>
    </tr>
    <tr>
      <td>Bob</td>
      <td>30</td>
    </tr>
  </tbody>
  <tfoot>
    <tr>
      <td>Total</td>
      <td>55</td>
    </tr>
  </tfoot>
</table>
```

- **Resultado**: El `<tbody>` contiene las filas de datos, como "Alice/25" y "Bob/30". Esta es la parte principal de la tabla.

---

### **Beneficios de usar `<thead>`, `<tfoot>`, `<tbody>`**

- **Mejora la accesibilidad**: Ayuda a los lectores de pantalla a identificar las distintas partes de la tabla.
- **Facilita la gestión de grandes tablas**: Permite que el encabezado y el pie de la tabla se mantengan visibles al hacer desplazamiento (scroll) por el cuerpo de la tabla.
- **Semántica y organización**: Mejora la claridad y estructura del código, separando claramente las distintas secciones de la tabla.

---

### **Ejemplo completo de una tabla con `<thead>`, `<tfoot>` y `<tbody>`**

```html
<table>
  <thead>
    <tr>
      <th>Nombre</th>
      <th>Edad</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Alice</td>
      <td>25</td>
    </tr>
    <tr>
      <td>Bob</td>
      <td>30</td>
    </tr>
  </tbody>
  <tfoot>
    <tr>
      <td>Total</td>
      <td>55</td>
    </tr>
  </tfoot>
</table>
```

- **Resultado**: La tabla está dividida en tres secciones:
  - **Cabecera** con los títulos de las columnas ("Nombre" y "Edad").
  - **Cuerpo** con los datos de las filas ("Alice/25" y "Bob/30").
  - **Pie** con el total de las edades ("Total" y "55").

---

### **Resumen**

- **`<thead>`**: Contiene el encabezado de la tabla (nombres de las columnas).
- **`<tbody>`**: Contiene las filas de datos de la tabla.
- **`<tfoot>`**: Contiene el pie de la tabla (resúmenes, totales, etc.).

## Atributos para tablas

En HTML, los atributos **`colspan`** y **`rowspan`** se utilizan dentro de las celdas de las tablas (**`<td>`** o **`<th>`**) para controlar cómo se extienden las celdas a lo largo de las filas y las columnas. Estos atributos son muy útiles cuando quieres combinar varias celdas de una fila o columna para mostrar un contenido más complejo.

### **1. `colspan` (Combinar celdas en columnas)**

- **Propósito**: Permite que una celda se **extienda a través de varias columnas**. Es útil cuando quieres combinar varias celdas en una sola celda horizontalmente.
- **Dónde se usa**: Dentro de las etiquetas **`<td>`** o **`<th>`** en el cuerpo de la tabla.
- **Valor**: Especifica el número de columnas que la celda debe abarcar.

#### **Ejemplo de uso de `colspan`**:

```html
<table border="1">
  <thead>
    <tr>
      <th>Nombre</th>
      <th>Edad</th>
      <th>Ciudad</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Alice</td>
      <td>25</td>
      <td>New York</td>
    </tr>
    <tr>
      <td colspan="3">Resumen de la tabla</td>
    </tr>
  </tbody>
</table>
```

- **Explicación**: En este caso, la segunda fila tiene una celda que usa `colspan="3"`, lo que significa que la celda se extiende a lo largo de las tres columnas ("Nombre", "Edad" y "Ciudad"). La celda con el texto "Resumen de la tabla" abarcará toda la fila horizontalmente.

---

### **2. `rowspan` (Combinar celdas en filas)**

- **Propósito**: Permite que una celda se **extienda a través de varias filas**. Es útil cuando quieres combinar varias celdas verticalmente.
- **Dónde se usa**: Dentro de las etiquetas **`<td>`** o **`<th>`** en el cuerpo de la tabla.
- **Valor**: Especifica el número de filas que la celda debe abarcar.

#### **Ejemplo de uso de `rowspan`**:

```html
<table border="1">
  <thead>
    <tr>
      <th>Nombre</th>
      <th>Edad</th>
      <th>Ciudad</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="2">Alice</td>
      <td>25</td>
      <td>New York</td>
    </tr>
    <tr>
      <td>30</td>
      <td>Los Angeles</td>
    </tr>
  </tbody>
</table>
```

- **Explicación**: En este caso, la celda con el nombre "Alice" usa `rowspan="2"`, lo que significa que la celda se extiende a lo largo de las dos filas. Esta celda abarca dos filas verticalmente y ocupa el espacio de la columna "Nombre".

---

### **Combinación de `colspan` y `rowspan`**

También puedes usar ambos atributos juntos en la misma celda para que se extienda tanto horizontal como verticalmente.

#### **Ejemplo combinado de `colspan` y `rowspan`**:

```html
<table border="1">
  <thead>
    <tr>
      <th>Nombre</th>
      <th>Edad</th>
      <th>Ciudad</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="2">Alice</td>
      <td colspan="2">Resumen</td>
    </tr>
    <tr>
      <td>30</td>
      <td>Los Angeles</td>
    </tr>
  </tbody>
</table>
```

- **Explicación**: La celda con el nombre "Alice" ocupa dos filas en la columna "Nombre" (gracias a `rowspan="2"`), mientras que la celda con el texto "Resumen" abarca dos columnas en la misma fila (gracias a `colspan="2"`).

---

### **Resumen**

- **`colspan`**: Extiende una celda a través de varias **columnas**.
- **`rowspan`**: Extiende una celda a través de varias **filas**.

## Uso de `<caption>` y `<colgroup>`.

En HTML, las etiquetas **`<caption>`** y **`<colgroup>`** se utilizan para mejorar la accesibilidad y la estructura de las tablas, proporcionando información adicional sobre el contenido de la tabla o agrupando columnas para aplicarles estilos de manera más eficiente.

---

### **1. `<caption>` (Título de la tabla)**

- **Propósito**: La etiqueta **`<caption>`** se usa para proporcionar un **título** o una **descripción** breve para la tabla, ayudando a identificar su propósito o el contenido que presenta.
- **Dónde se usa**: Siempre debe ir directamente después de la etiqueta `<table>`, antes de cualquier otra etiqueta como `<thead>`, `<tbody>` o `<tfoot>`.
- **Beneficios**: Mejora la accesibilidad y la comprensión, especialmente para los lectores de pantalla que interpretan el contenido de la tabla.

#### **Ejemplo de uso de `<caption>`**:

```html
<table border="1">
  <caption>
    Tabla de Ejemplo de Datos Personales
  </caption>
  <thead>
    <tr>
      <th>Nombre</th>
      <th>Edad</th>
      <th>Ciudad</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Alice</td>
      <td>25</td>
      <td>New York</td>
    </tr>
    <tr>
      <td>Bob</td>
      <td>30</td>
      <td>Los Angeles</td>
    </tr>
  </tbody>
</table>
```

- **Explicación**: La celda con el texto "Tabla de Ejemplo de Datos Personales" es el título de la tabla, proporcionado por la etiqueta `<caption>`. Esto ayuda a describir el propósito de la tabla.

---

### **2. `<colgroup>` (Agrupar columnas)**

- **Propósito**: La etiqueta **`<colgroup>`** se utiliza para agrupar las **columnas** dentro de una tabla. Se puede usar junto con la etiqueta **`<col>`** para aplicar estilos o configuraciones a un grupo de columnas en lugar de hacerlo individualmente.
- **Dónde se usa**: Generalmente, se coloca antes de la etiqueta `<thead>`, `<tbody>` o `<tfoot>`. La etiqueta **`<col>`** se usa dentro de **`<colgroup>`** para especificar las columnas a las que se aplicará el estilo o formato.
- **Beneficios**: Facilita la aplicación de estilos de forma más eficiente y clara a un conjunto de columnas en lugar de aplicarlos a cada celda de manera individual.

#### **Ejemplo de uso de `<colgroup>` y `<col>`**:

```html
<table border="1">
  <caption>
    Tabla con Agrupación de Columnas
  </caption>
  <colgroup>
    <col style="background-color: lightblue; width: 150px;" />
    <col style="background-color: lightgreen;" />
    <col style="background-color: lightyellow;" />
  </colgroup>
  <thead>
    <tr>
      <th>Nombre</th>
      <th>Edad</th>
      <th>Ciudad</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Alice</td>
      <td>25</td>
      <td>New York</td>
    </tr>
    <tr>
      <td>Bob</td>
      <td>30</td>
      <td>Los Angeles</td>
    </tr>
  </tbody>
</table>
```

- **Explicación**: El bloque **`<colgroup>`** contiene tres etiquetas **`<col>`**, cada una con un estilo diferente de color de fondo. Esto aplica un color de fondo distinto a cada una de las tres columnas de la tabla, simplificando la aplicación de los estilos.

---

### **Resumen**

- **`<caption>`**: Proporciona un **título o descripción** para la tabla, mejorando la accesibilidad y la comprensión del contenido.
- **`<colgroup>`**: Agrupa las **columnas** de una tabla y se utiliza con **`<col>`** para aplicar estilos o configuraciones a un grupo de columnas en lugar de hacerlo individualmente.

# 5. **Formularios**

La etiqueta **`<form>`** en HTML se utiliza para crear formularios en los que los usuarios pueden enviar datos a un servidor. Los formularios son fundamentales en las aplicaciones web para obtener información del usuario, como nombres, direcciones de correo electrónico, contraseñas, etc.

---

### **Estructura básica de un formulario: `<form>`**

- **Propósito**: La etiqueta **`<form>`** define un formulario que agrupa diferentes elementos como campos de texto, botones y otros controles interactivos.
- **Atributos importantes**:
  - **`action`**: Especifica la URL a la que se enviarán los datos cuando el formulario se envíe. Si no se especifica, los datos se enviarán a la misma URL de la página que contiene el formulario.
  - **`method`**: Define el método HTTP que se utilizará para enviar los datos del formulario. Los métodos más comunes son:
    - **`GET`**: Los datos se envían como parte de la URL (en la barra de direcciones del navegador). Es más adecuado para solicitudes que no alteran datos en el servidor.
    - **`POST`**: Los datos se envían en el cuerpo de la solicitud HTTP, lo que lo hace más adecuado para el envío de datos sensibles o grandes cantidades de datos.

#### **Ejemplo básico de un formulario**:

```html
<form action="/enviar-datos" method="POST">
  <label for="nombre">Nombre:</label>
  <input type="text" id="nombre" name="nombre" required />

  <label for="email">Correo electrónico:</label>
  <input type="email" id="email" name="email" required />

  <label for="comentarios">Comentarios:</label>
  <textarea id="comentarios" name="comentarios" rows="4" cols="50"></textarea>

  <button type="submit">Enviar</button>
</form>
```

- **Explicación**:
  - **`<form>`**: Es la etiqueta que envuelve todo el formulario. Su **`action`** define a dónde se enviarán los datos, y su **`method`** determina el método para enviar los datos.
  - **`<label>`**: Es la etiqueta que proporciona una descripción de lo que el usuario debe ingresar en cada campo del formulario.
  - **`<input>`**: Es un campo de entrada que puede tener diferentes tipos (por ejemplo, `text`, `email`, `password`, etc.). En este caso, se utiliza para ingresar el nombre y el correo electrónico.
  - **`<textarea>`**: Permite a los usuarios ingresar texto largo, como comentarios, en un área de texto más grande.
  - **`<button>`**: Es un botón que, al hacer clic, envía el formulario. El atributo `type="submit"` indica que el botón es para enviar el formulario.

---

### **Atributos adicionales de `<form>`**

- **`name`**: Establece un nombre para el formulario. Este atributo es útil para acceder al formulario a través de JavaScript o para procesar el formulario en un entorno de servidor.
- **`target`**: Define dónde se abrirá la respuesta del servidor después de enviar el formulario. Los valores comunes son:
  - **`_blank`**: Abre la respuesta en una nueva ventana o pestaña.
  - **`_self`**: Abre la respuesta en la misma ventana o pestaña (valor por defecto).
  - **`_parent`**: Abre la respuesta en el marco de nivel superior.
  - **`_top`**: Abre la respuesta en el área de visualización completa, reemplazando cualquier marco.

#### **Ejemplo con el atributo `target`**:

```html
<form action="/procesar-datos" method="POST" target="_blank">
  <label for="usuario">Usuario:</label>
  <input type="text" id="usuario" name="usuario" />

  <button type="submit">Enviar</button>
</form>
```

- **Explicación**: En este caso, el atributo `target="_blank"` hace que la respuesta del formulario se abra en una nueva pestaña del navegador.

---

### **Elementos comunes dentro de un formulario**

1. **Campos de texto**: Usados para ingresar información, como **`<input>`** de tipo texto o contraseñas.
2. **Botones**: Usados para enviar el formulario (**`<button>`**, **`<input type="submit">`**).
3. **Área de texto**: Para ingresar texto más largo (**`<textarea>`**).
4. **Listas de selección**: Para elegir opciones de una lista desplegable (**`<select>`**, **`<option>`**).
5. **Casillas de verificación**: Para seleccionar opciones en forma de casillas (**`<input type="checkbox">`**).
6. **Botones de radio**: Para seleccionar una opción entre varias (**`<input type="radio">`**).

---

### **Ejemplo de formulario con varios elementos**:

```html
<form action="/registrar-usuario" method="POST">
  <label for="usuario">Usuario:</label>
  <input type="text" id="usuario" name="usuario" required />

  <label for="password">Contraseña:</label>
  <input type="password" id="password" name="password" required />

  <label for="sexo">Sexo:</label>
  <input type="radio" id="masculino" name="sexo" value="masculino" /> Masculino
  <input type="radio" id="femenino" name="sexo" value="femenino" /> Femenino

  <label for="intereses">Intereses:</label>
  <input type="checkbox" id="deporte" name="intereses" value="deporte" />
  Deporte
  <input type="checkbox" id="musica" name="intereses" value="musica" /> Música

  <label for="pais">País:</label>
  <select id="pais" name="pais">
    <option value="argentina">Argentina</option>
    <option value="mexico">México</option>
    <option value="espana">España</option>
  </select>

  <button type="submit">Registrarse</button>
</form>
```

- **Explicación**: Este formulario incluye varios tipos de campos:
  - **Campos de texto** para ingresar el nombre de usuario y la contraseña.
  - **Botones de radio** para seleccionar el sexo.
  - **Casillas de verificación** para seleccionar los intereses.
  - **Lista desplegable** para elegir el país.
  - **Botón de envío** para enviar el formulario.

---

### **Resumen**

- **`<form>`** es la etiqueta que se utiliza para agrupar y enviar datos de un formulario.
- **Atributos clave**:
  - **`action`**: URL donde se enviarán los datos.
  - **`method`**: Método HTTP utilizado para enviar los datos (`GET` o `POST`).
  - **`target`**: Donde se abrirá la respuesta del servidor.

## Tipos de `<input>`

La etiqueta **`<input>`** es uno de los elementos más utilizados en los formularios HTML, y se usa para crear varios tipos de campos de entrada, cada uno con una función diferente. Los tipos de **`<input>`** permiten a los usuarios ingresar datos de diversas maneras, ya sea texto, contraseñas, números, o seleccionando opciones específicas.

---

### **1. `type="text"`** (Campo de texto)

- **Propósito**: Permite al usuario ingresar texto libre, como nombres, direcciones o cualquier otra entrada de texto.
- **Atributos comunes**:
  - **`placeholder`**: Texto que aparece dentro del campo antes de que el usuario ingrese algo.
  - **`required`**: Hace que el campo sea obligatorio.

#### **Ejemplo**:

```html
<input
  type="text"
  id="nombre"
  name="nombre"
  placeholder="Ingresa tu nombre"
  required
/>
```

---

### **2. `type="password"`** (Campo de contraseña)

- **Propósito**: Similar al tipo **`text`**, pero los caracteres ingresados se muestran como puntos o asteriscos para ocultar la contraseña.
- **Atributos comunes**:
  - **`required`**: Hace que el campo sea obligatorio.
  - **`maxlength`**: Define la longitud máxima de la contraseña.

#### **Ejemplo**:

```html
<input
  type="password"
  id="contraseña"
  name="contraseña"
  placeholder="Ingresa tu contraseña"
  required
/>
```

---

### **3. `type="email"`** (Campo de correo electrónico)

- **Propósito**: Permite al usuario ingresar una dirección de correo electrónico. Los navegadores suelen validar que el texto ingresado tenga el formato adecuado de un correo electrónico (por ejemplo, `nombre@dominio.com`).
- **Atributos comunes**:
  - **`required`**: Hace que el campo sea obligatorio.
  - **`multiple`**: Permite ingresar múltiples direcciones de correo electrónico separadas por comas.

#### **Ejemplo**:

```html
<input
  type="email"
  id="email"
  name="email"
  placeholder="Ingresa tu correo electrónico"
  required
/>
```

---

### **4. `type="number"`** (Campo numérico)

- **Propósito**: Permite al usuario ingresar solo números. Los navegadores suelen proporcionar controles para aumentar o disminuir el valor (por ejemplo, botones de flecha arriba y abajo).
- **Atributos comunes**:
  - **`min`** y **`max`**: Definen los valores mínimo y máximo permitidos.
  - **`step`**: Establece el incremento entre valores (por ejemplo, incrementos de 5).
  - **`required`**: Hace que el campo sea obligatorio.

#### **Ejemplo**:

```html
<input
  type="number"
  id="edad"
  name="edad"
  min="18"
  max="100"
  step="1"
  placeholder="Ingresa tu edad"
  required
/>
```

---

### **5. `type="radio"`** (Botón de opción o radio)

- **Propósito**: Permite que el usuario seleccione solo una opción entre varias. Generalmente, se agrupan en un mismo grupo de botones con el mismo atributo **`name`**.
- **Atributos comunes**:
  - **`checked`**: Hace que una opción esté seleccionada por defecto.
  - **`value`**: Define el valor enviado al servidor cuando se selecciona esa opción.

#### **Ejemplo**:

```html
<label
  ><input type="radio" name="sexo" value="masculino" checked /> Masculino</label
>
<label><input type="radio" name="sexo" value="femenino" /> Femenino</label>
```

---

### **6. `type="checkbox"`** (Casilla de verificación)

- **Propósito**: Permite que el usuario seleccione una o más opciones. Cada casilla puede estar marcada o desmarcada.
- **Atributos comunes**:
  - **`checked`**: Hace que la casilla esté seleccionada por defecto.
  - **`value`**: Define el valor enviado al servidor si la casilla está marcada.

#### **Ejemplo**:

```html
<label
  ><input type="checkbox" name="intereses" value="deporte" /> Deporte</label
>
<label><input type="checkbox" name="intereses" value="musica" /> Música</label>
```

---

### **7. `type="file"`** (Campo de archivo)

- **Propósito**: Permite al usuario seleccionar un archivo de su dispositivo para cargarlo en el servidor (como imágenes, documentos, etc.).
- **Atributos comunes**:
  - **`accept`**: Define los tipos de archivo permitidos (por ejemplo, imágenes o documentos PDF).
  - **`multiple`**: Permite seleccionar varios archivos a la vez.

#### **Ejemplo**:

```html
<input
  type="file"
  id="archivo"
  name="archivo"
  accept=".jpg, .png, .pdf"
  required
/>
```

---

### **8. `type="submit"`** (Botón de envío)

- **Propósito**: Crea un botón que envía el formulario al servidor cuando se hace clic en él.
- **Atributos comunes**:
  - **`value`**: Define el texto que aparece en el botón.

#### **Ejemplo**:

```html
<input type="submit" value="Enviar" />
```

---

### **Resumen**

- **`type="text"`**: Campo de entrada de texto libre.
- **`type="password"`**: Campo para contraseñas, ocultando el texto ingresado.
- **`type="email"`**: Campo para direcciones de correo electrónico con validación automática.
- **`type="number"`**: Campo numérico que permite solo números.
- **`type="radio"`**: Botones de opción para seleccionar una opción entre varias.
- **`type="checkbox"`**: Casillas de verificación para seleccionar una o más opciones.
- **`type="file"`**: Campo para seleccionar y cargar archivos.
- **`type="submit"`**: Botón para enviar el formulario.

## Validación nativa

La validación nativa de formularios en HTML se refiere a la capacidad de validar la entrada del usuario directamente en el navegador, sin necesidad de JavaScript. Esto se logra mediante atributos específicos en las etiquetas de los elementos del formulario. Estos atributos permiten asegurar que los datos enviados sean correctos antes de enviar el formulario al servidor.

---

### **1. `required`**

- **Propósito**: Este atributo marca un campo como obligatorio, lo que significa que el formulario no se enviará si el campo está vacío.
- **Uso**: Se coloca dentro de un campo de entrada (como `<input>`, `<textarea>`, `<select>`, etc.) para indicar que debe ser completado.

#### **Ejemplo**:

```html
<input type="text" name="nombre" required placeholder="Ingresa tu nombre" />
```

- **Explicación**: En este caso, el campo "nombre" no podrá enviarse si está vacío, ya que el atributo **`required`** lo hace obligatorio.

---

### **2. `pattern`**

- **Propósito**: Permite definir una expresión regular (regex) que debe coincidir con el valor ingresado en el campo. Esto es útil para validaciones más complejas, como verificar un formato específico de texto (por ejemplo, un teléfono, código postal o contraseña).
- **Uso**: Se utiliza en campos como **`text`**, **`email`** y otros tipos de **`input`** que requieran un formato específico.

#### **Ejemplo**:

```html
<input
  type="text"
  name="telefono"
  pattern="\d{3}-\d{3}-\d{4}"
  placeholder="Formato: 123-456-7890"
  required
/>
```

- **Explicación**: Este campo de teléfono solo acepta un formato de número con guiones, como **`123-456-7890`**. Si el usuario ingresa algo que no coincide con el patrón, el formulario no se enviará.

---

### **3. `min` y `max`**

- **Propósito**: Los atributos **`min`** y **`max`** se utilizan para especificar los valores mínimo y máximo permitidos en campos de tipo **`number`**, **`date`**, **`range`**, entre otros.
  - **`min`**: Establece el valor mínimo permitido.
  - **`max`**: Establece el valor máximo permitido.

#### **Ejemplo**:

```html
<input type="number" name="edad" min="18" max="100" required />
```

- **Explicación**: Este campo solo acepta números entre 18 y 100. Si el usuario ingresa un número fuera de ese rango, el formulario no se enviará.

---

### **4. `maxlength`**

- **Propósito**: Define la longitud máxima de los caracteres permitidos en un campo de texto. Este atributo se puede usar en campos de tipo **`text`**, **`password`**, **`textarea`**, entre otros.
- **Uso**: Este atributo es útil para asegurarse de que el texto ingresado no exceda un número determinado de caracteres.

#### **Ejemplo**:

```html
<input
  type="text"
  name="usuario"
  maxlength="15"
  required
  placeholder="Máximo 15 caracteres"
/>
```

- **Explicación**: Este campo solo permite un máximo de 15 caracteres. Si el usuario intenta escribir más, el navegador no lo permitirá.

---

### **Otros atributos útiles de validación nativa**

#### **5. `minlength`**

- **Propósito**: Establece la longitud mínima de los caracteres permitidos en un campo de texto.

#### **Ejemplo**:

```html
<input
  type="password"
  name="contraseña"
  minlength="8"
  required
  placeholder="Mínimo 8 caracteres"
/>
```

- **Explicación**: En este caso, la contraseña debe tener al menos 8 caracteres para que el formulario sea válido.

#### **6. `step`**

- **Propósito**: Define los incrementos permitidos en un campo numérico o de rango. Este atributo es útil, por ejemplo, para valores decimales o para asegurarse de que los números sean múltiplos de un valor determinado.

#### **Ejemplo**:

```html
<input type="number" name="cantidad" step="0.01" min="0" required />
```

- **Explicación**: Este campo permite ingresar números decimales con hasta dos decimales (por ejemplo, **`1.99`** o **`2.50`**).

---

### **Comportamiento de la validación nativa**

- **Validación automática**: Si el formulario contiene un campo con un atributo de validación (como **`required`**, **`pattern`**, **`min`**, **`max`**, etc.) y el usuario intenta enviarlo sin completar o sin cumplir con los requisitos, el navegador evitará el envío y mostrará un mensaje de error informando al usuario qué campo no cumple con los requisitos.
- **Mensajes de error**: El navegador generalmente proporciona mensajes predeterminados, pero algunos campos, como **`pattern`**, permiten personalizar estos mensajes mediante el atributo **`title`**, que proporciona una descripción sobre cómo debe ser el valor ingresado.

#### **Ejemplo de mensaje personalizado**:

```html
<input
  type="text"
  name="codigoPostal"
  pattern="\d{5}"
  title="El código postal debe tener 5 dígitos"
  required
/>
```

---

### **Resumen de atributos para validación nativa**:

- **`required`**: Hace que el campo sea obligatorio.
- **`pattern`**: Permite definir una expresión regular para validar el formato.
- **`min`** y **`max`**: Establecen los valores mínimo y máximo permitidos.
- **`maxlength`**: Define la longitud máxima de los caracteres permitidos.
- **`minlength`**: Establece la longitud mínima de caracteres.
- **`step`**: Establece los incrementos permitidos para campos numéricos.

## Formularios accesibles

La accesibilidad en los formularios HTML es fundamental para garantizar que todos los usuarios, incluidos aquellos con discapacidades, puedan interactuar de manera efectiva con el contenido. La relación **`id`** y **`for`**, junto con el uso de las etiquetas **`<fieldset>`** y **`<legend>`**, son herramientas clave para mejorar la accesibilidad en los formularios.

---

### **1. Relación `id` y `for`**

- **Propósito**: La relación entre los atributos **`id`** y **`for`** mejora la accesibilidad al asociar una etiqueta de texto (por ejemplo, un **`<label>`**) con un campo de entrada específico (como un **`<input>`**).
- **Beneficios**: Esta relación permite que los usuarios puedan hacer clic en la etiqueta para activar el campo correspondiente. Además, los lectores de pantalla pueden anunciar correctamente la relación entre la etiqueta y el campo de entrada.

#### **Cómo funciona**:

- El atributo **`id`** se asigna al campo de entrada (como un **`<input>`** o un **`<textarea>`**).
- El atributo **`for`** se asigna a la etiqueta **`<label>`**, y su valor debe coincidir con el **`id`** del campo de entrada.

#### **Ejemplo**:

```html
<label for="nombre">Nombre:</label>
<input type="text" id="nombre" name="nombre" required />
```

- **Explicación**: En este caso, la etiqueta **`<label>`** tiene el atributo **`for="nombre"`**, que coincide con el **`id="nombre"`** del campo **`<input>`**. Esto mejora la accesibilidad porque:
  - El usuario puede hacer clic en la etiqueta **"Nombre:"** para enfocarse directamente en el campo de entrada.
  - Los lectores de pantalla también pueden identificar correctamente que el campo de entrada se refiere a "Nombre".

---

### **2. Uso de `<fieldset>` y `<legend>`**

Las etiquetas **`<fieldset>`** y **`<legend>`** son muy útiles para mejorar la organización y accesibilidad de los formularios, especialmente cuando se tienen múltiples grupos de campos relacionados.

#### **`<fieldset>`**:

- **Propósito**: Se usa para agrupar elementos relacionados dentro de un formulario, proporcionando una estructura clara y ayudando a los usuarios a comprender cómo están organizados los campos.
- **Beneficio**: Ayuda a los usuarios de lectores de pantalla a identificar los grupos de campos relacionados, mejorando la comprensión y la navegación en formularios complejos.

#### **`<legend>`**:

- **Propósito**: Se usa dentro de **`<fieldset>`** para proporcionar una descripción o título al grupo de campos.
- **Beneficio**: Proporciona un título descriptivo que explica el propósito del grupo de campos, lo cual es útil tanto para usuarios de lectores de pantalla como para la claridad visual.

#### **Ejemplo**:

```html
<fieldset>
  <legend>Información Personal</legend>
  <label for="nombre">Nombre:</label>
  <input type="text" id="nombre" name="nombre" required />

  <label for="edad">Edad:</label>
  <input type="number" id="edad" name="edad" min="18" max="100" required />
</fieldset>
```

- **Explicación**:
  - **`<fieldset>`** agrupa los campos "Nombre" y "Edad" en un bloque.
  - **`<legend>`** proporciona una descripción clara de lo que contiene ese bloque, en este caso, **"Información Personal"**.
  - Esto hace que el formulario sea más accesible, ya que los usuarios con discapacidades visuales podrán comprender que estos campos están relacionados con la información personal gracias al **`legend`**.

---

### **Beneficios para la accesibilidad**:

- **Lectores de pantalla**: Los lectores de pantalla pueden anunciar de manera más clara el propósito de cada campo o grupo de campos. Cuando un formulario tiene un **`<label>`** con el atributo **`for`** y está bien estructurado con **`<fieldset>`** y **`<legend>`**, los usuarios con discapacidades visuales pueden navegar por el formulario de manera más efectiva.
- **Interacción del usuario**: Los usuarios pueden hacer clic en las etiquetas asociadas con los campos de entrada, lo que mejora la usabilidad, especialmente para personas con movilidad reducida que tienen dificultades para hacer clic en los campos de entrada directamente.
- **Claridad y organización**: La agrupación de campos en un **`<fieldset>`** y la inclusión de un **`<legend>`** proporciona una estructura más lógica y comprensible, lo que facilita la navegación por el formulario.

---

### **Resumen**:

- **`id` y `for`**:
  - **`id`**: Se asigna al campo de entrada.
  - **`for`**: Se asigna a la etiqueta **`<label>`** y debe coincidir con el **`id`** del campo de entrada correspondiente. Mejora la accesibilidad al permitir que el usuario haga clic en la etiqueta para enfocar el campo de entrada.
- **`<fieldset>`** y **`<legend>`**:
  - **`<fieldset>`**: Agrupa elementos relacionados dentro del formulario, mejorando la estructura.
  - **`<legend>`**: Proporciona una descripción o título para el grupo de campos dentro del **`<fieldset>`**.
  - Ayudan a mejorar la accesibilidad y la organización visual de los formularios.

Usando estas herramientas, puedes crear formularios más accesibles y fáciles de usar para todos los usuarios.

# 6. **Etiquetas Semánticas**

...
