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

Las **etiquetas semánticas** en HTML proporcionan significado al contenido que envuelven, ayudando a los desarrolladores y navegadores a comprender mejor la estructura y propósito de las secciones de una página. Estas etiquetas mejoran la accesibilidad, el SEO y la mantenibilidad del código.

### **1. `<header>`**

- **Propósito**: Representa el encabezado de un documento o una sección específica.
- **Uso común**: Incluye elementos como el título, logotipos, navegación principal o un resumen introductorio.
- **Importante**: Puede haber múltiples `<header>` en una página, por ejemplo, uno para la página principal y otros para secciones específicas.

#### **Ejemplo**:

```html
<header>
  <h1>Mi Blog</h1>
  <nav>
    <ul>
      <li><a href="#inicio">Inicio</a></li>
      <li><a href="#articulos">Artículos</a></li>
      <li><a href="#contacto">Contacto</a></li>
    </ul>
  </nav>
</header>
```

---

### **2. `<main>`**

- **Propósito**: Representa el contenido principal de la página.
- **Uso común**: Incluye la información principal que describe el propósito de la página. Solo debe haber un `<main>` por documento.
- **Importante**: No debe contener contenido repetitivo como menús o encabezados comunes.

#### **Ejemplo**:

```html
<main>
  <article>
    <h2>Bienvenidos a Mi Blog</h2>
    <p>Este es el espacio donde comparto mis pensamientos y experiencias.</p>
  </article>
</main>
```

---

### **3. `<section>`**

- **Propósito**: Define una sección temática de contenido dentro de una página.
- **Uso común**: Se utiliza para dividir el contenido en bloques lógicos, como capítulos, apartados o categorías.
- **Importante**: Cada `<section>` debe tener un encabezado adecuado (**`<h1>` a `<h6>`**) que describa su contenido.

#### **Ejemplo**:

```html
<section>
  <h2>Artículos Recientes</h2>
  <p>Explora los últimos temas que hemos publicado en el blog.</p>
</section>
```

---

### **4. `<article>`**

- **Propósito**: Representa contenido independiente y auto-contenido, como un artículo, una publicación de blog o una entrada de noticias.
- **Uso común**: Se puede reutilizar en diferentes contextos, como un feed RSS.
- **Importante**: Cada `<article>` puede tener su propio `<header>` y `<footer>`.

#### **Ejemplo**:

```html
<article>
  <header>
    <h3>¿Cómo aprender HTML?</h3>
    <p>Publicado el 15 de enero de 2025</p>
  </header>
  <p>
    HTML es el lenguaje básico para construir páginas web. Aquí te explicamos
    cómo empezar.
  </p>
  <footer>
    <p>Escrito por Anto.</p>
  </footer>
</article>
```

---

### **5. `<aside>`**

- **Propósito**: Representa contenido relacionado con el contenido principal, pero no esencial.
- **Uso común**: Se utiliza para barras laterales, anuncios, enlaces relacionados, biografías de autores o citas.
- **Importante**: Generalmente, se coloca en un lado de la página, pero no es obligatorio.

#### **Ejemplo**:

```html
<aside>
  <h4>Sobre el Autor</h4>
  <p>Anto es desarrolladora y apasionada por el diseño web.</p>
</aside>
```

---

### **6. `<footer>`**

- **Propósito**: Representa el pie de página de un documento o sección específica.
- **Uso común**: Incluye información como derechos de autor, enlaces legales o de contacto.
- **Importante**: Puede haber múltiples `<footer>` en una página, uno para el contenido principal y otros para secciones individuales.

#### **Ejemplo**:

```html
<footer>
  <p>© 2025 Mi Blog. Todos los derechos reservados.</p>
  <nav>
    <a href="#politica">Política de privacidad</a> |
    <a href="#terminos">Términos de uso</a>
  </nav>
</footer>
```

---

### **Cómo se relacionan estas etiquetas**

Estas etiquetas ayudan a organizar el contenido semánticamente. Por ejemplo, una página típica podría estructurarse así:

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Mi Blog</title>
  </head>
  <body>
    <header>
      <h1>Mi Blog</h1>
      <nav>
        <ul>
          <li><a href="#inicio">Inicio</a></li>
          <li><a href="#articulos">Artículos</a></li>
          <li><a href="#contacto">Contacto</a></li>
        </ul>
      </nav>
    </header>

    <main>
      <section>
        <h2>Artículos Recientes</h2>
        <article>
          <header>
            <h3>¿Cómo aprender HTML?</h3>
          </header>
          <p>HTML es el lenguaje básico para construir páginas web.</p>
        </article>
      </section>

      <aside>
        <h4>Sobre el Autor</h4>
        <p>Anto es desarrolladora y apasionada por el diseño web.</p>
      </aside>
    </main>

    <footer>
      <p>© 2025 Mi Blog. Todos los derechos reservados.</p>
    </footer>
  </body>
</html>
```

---

### **Ventajas de las etiquetas semánticas**:

1. **SEO mejorado**: Los motores de búsqueda comprenden mejor el contenido y pueden clasificarlo adecuadamente.
2. **Accesibilidad**: Los lectores de pantalla pueden interpretar correctamente la estructura de la página.
3. **Mantenibilidad**: Facilita el trabajo en equipo y la edición futura del código.
4. **Estilo simplificado**: Es más fácil aplicar estilos específicos mediante CSS a estas etiquetas.

## Etiquetas adicionales

### **1. `<nav>`**

- **Propósito**: Representa una sección de navegación dentro de un documento, que generalmente contiene enlaces a otras partes del sitio web o a páginas externas.
- **Uso común**: Se utiliza para menús principales, barras laterales de navegación o índices de contenido.
- **Importante**: Aunque puedes tener múltiples elementos `<nav>` en una página (por ejemplo, uno en el encabezado y otro en el pie de página), asegúrate de que cada uno tenga un propósito claro.

#### **Ejemplo**:

```html
<nav>
  <ul>
    <li><a href="#inicio">Inicio</a></li>
    <li><a href="#servicios">Servicios</a></li>
    <li><a href="#contacto">Contacto</a></li>
  </ul>
</nav>
```

- **Explicación**:
  - El `<nav>` agrupa los enlaces de navegación.
  - Cada enlace apunta a una sección específica de la página o a otras páginas del sitio.

#### **Ventajas**:

- Mejora la accesibilidad: Los lectores de pantalla pueden identificar que esta sección es para navegación.
- Ayuda al SEO: Los motores de búsqueda reconocen los enlaces como navegación principal.

---

### **2. `<figure>`**

- **Propósito**: Representa contenido independiente, como una imagen, gráfico, ilustración o cualquier otro elemento visual que complementa el texto.
- **Uso común**: Se utiliza para agrupar elementos visuales y su descripción.
- **Importante**: Generalmente incluye un elemento **`<figcaption>`**, que proporciona una descripción o título para el contenido visual.

#### **Ejemplo**:

```html
<figure>
  <img src="paisaje.jpg" alt="Paisaje montañoso al atardecer" />
  <figcaption>Un hermoso paisaje al atardecer en las montañas.</figcaption>
</figure>
```

- **Explicación**:
  - **`<figure>`** agrupa la imagen y su descripción.
  - **`<figcaption>`** describe el contenido de la imagen para proporcionar contexto adicional.

#### **Ventajas**:

- Mejora la semántica del contenido visual.
- Facilita la accesibilidad: Los lectores de pantalla pueden anunciar tanto la imagen como su descripción.

---

### **3. `<figcaption>`**

- **Propósito**: Proporciona una descripción o título para el contenido dentro de un elemento `<figure>`.
- **Uso común**: Se coloca como el primer o último hijo dentro de `<figure>`.

#### **Ejemplo avanzado**:

```html
<figure>
  <img src="grafico-ventas.png" alt="Gráfico de ventas trimestrales" />
  <figcaption>
    Gráfico que muestra las ventas trimestrales de la empresa en 2024.
  </figcaption>
</figure>
```

#### **Posicionamiento del `<figcaption>`**:

- Puede ir antes o después del contenido dentro de `<figure>`, dependiendo de cómo desees organizar el contenido:

```html
<figure>
  <figcaption>Descripción antes del contenido.</figcaption>
  <img src="foto.jpg" alt="Ejemplo de posicionamiento" />
</figure>
```

---

### **Ejemplo combinado**:

Supongamos que tienes un sitio web con un menú de navegación, una imagen con descripción y texto explicativo. La estructura podría ser así:

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Ejemplo de Etiquetas</title>
  </head>
  <body>
    <header>
      <h1>Mi Página Web</h1>
      <nav>
        <ul>
          <li><a href="#inicio">Inicio</a></li>
          <li><a href="#galeria">Galería</a></li>
          <li><a href="#contacto">Contacto</a></li>
        </ul>
      </nav>
    </header>

    <main>
      <section id="galeria">
        <h2>Galería de Imágenes</h2>
        <figure>
          <img src="paisaje.jpg" alt="Paisaje al atardecer" />
          <figcaption>
            Paisaje al atardecer capturado en las montañas.
          </figcaption>
        </figure>
      </section>
    </main>

    <footer>
      <p>&copy; 2025 Mi Página Web</p>
    </footer>
  </body>
</html>
```

---

### **Resumen**:

| Etiqueta           | Propósito                                                                   |
| ------------------ | --------------------------------------------------------------------------- |
| **`<nav>`**        | Define una sección de navegación con enlaces importantes del sitio.         |
| **`<figure>`**     | Agrupa contenido visual como imágenes, gráficos o diagramas.                |
| **`<figcaption>`** | Proporciona un título o descripción para el contenido dentro de `<figure>`. |

# 7. **Metadatos y SEO Básico**

Los metadatos en HTML proporcionan información sobre la página web al navegador y a los motores de búsqueda. Las etiquetas `<meta>` son esenciales para configurar correctamente el sitio, mejorar el SEO y garantizar una buena experiencia de usuario.

### **1. ¿Qué es una etiqueta `<meta>`?**

- Es un elemento vacío (no tiene etiqueta de cierre) que se usa dentro de `<head>` para especificar metadatos sobre la página.
- Estos datos no son visibles para los usuarios, pero son importantes para navegadores, motores de búsqueda y redes sociales.

---

### **2. Tipos de metadatos principales**

#### **a) Encoding**

- Define la codificación de caracteres que utiliza el documento.
- **Propósito**: Asegurar que los caracteres especiales (como tildes, ñ o símbolos) se muestren correctamente.
- **Etiqueta**:
  ```html
  <meta charset="UTF-8" />
  ```
- **Valor común**:
  - `UTF-8`: Codificación universal que admite la mayoría de los idiomas.

---

#### **b) Viewport**

- Configura cómo se muestra la página en dispositivos móviles y controla el zoom.
- **Propósito**: Hacer que la página sea "responsive" (se adapte a pantallas pequeñas).
- **Etiqueta**:
  ```html
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  ```
- **Atributos comunes**:
  - `width=device-width`: Hace que el ancho de la página sea igual al ancho de la pantalla del dispositivo.
  - `initial-scale=1.0`: Establece el nivel de zoom inicial.

#### **Ejemplo de uso**:

```html
<meta
  name="viewport"
  content="width=device-width, initial-scale=1.0, maximum-scale=1.0"
/>
```

---

#### **c) Description**

- Proporciona una breve descripción del contenido de la página.
- **Propósito**: Mejora el SEO y es utilizada por los motores de búsqueda para mostrar fragmentos en los resultados (SERPs).
- **Etiqueta**:
  ```html
  <meta
    name="description"
    content="Blog sobre programación, diseño web y tecnología."
  />
  ```
- **Mejores prácticas**:
  - Limitar a 150-160 caracteres.
  - Describir claramente el contenido de la página.

---

#### **d) Keywords** (obsoleta, pero a veces usada)

- Lista de palabras clave relacionadas con el contenido.
- **Propósito**: Originalmente usada para SEO, pero hoy en día la mayoría de los motores de búsqueda ya no le prestan atención.
- **Etiqueta**:
  ```html
  <meta name="keywords" content="HTML, CSS, programación, diseño web" />
  ```
- **Nota**: No es relevante en el SEO moderno.

---

#### **e) Autor y derechos**

- Proporciona información adicional sobre el autor y los derechos de la página.
- **Etiqueta para el autor**:
  ```html
  <meta name="author" content="Anto" />
  ```
- **Etiqueta para derechos**:
  ```html
  <meta name="copyright" content="© 2025 Mi Sitio Web" />
  ```

---

#### **f) Robots**

- Indica a los motores de búsqueda cómo indexar y rastrear la página.
- **Propósito**: Controlar si la página debe ser indexada o si los enlaces deben seguirse.
- **Etiqueta**:
  ```html
  <meta name="robots" content="index, follow" />
  ```
- **Valores comunes**:
  - `index`: Permite que la página sea indexada.
  - `noindex`: Evita que la página sea indexada.
  - `follow`: Permite a los motores de búsqueda seguir los enlaces.
  - `nofollow`: Evita que los motores de búsqueda sigan los enlaces.

#### **Ejemplo avanzado**:

```html
<meta name="robots" content="noindex, nofollow" />
```

---

### **3. Ejemplo completo de uso en `<head>`**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta
      name="description"
      content="Aprende sobre desarrollo web, HTML, CSS y JavaScript."
    />
    <meta name="keywords" content="HTML, CSS, JavaScript, desarrollo web" />
    <meta name="author" content="Anto" />
    <meta name="robots" content="index, follow" />
    <title>Curso de HTML Básico</title>
  </head>
  <body>
    <h1>Bienvenidos al curso de HTML</h1>
  </body>
</html>
```

---

### **4. Beneficios de usar correctamente los metadatos**

1. **SEO**: Mejora la visibilidad en motores de búsqueda.
2. **Rendimiento**: Optimiza la carga y la visualización en dispositivos.
3. **Accesibilidad**: Ayuda a los navegadores y lectores de pantalla a interpretar mejor el contenido.
4. **Experiencia de usuario**: Una buena descripción y configuración de viewport mejoran la percepción del sitio.

## Open Graph para redes sociales.

**Open Graph (OG)** es un protocolo creado por Facebook que permite que las páginas web se integren mejor con las redes sociales. Esto se logra mediante el uso de etiquetas `<meta>` específicas que proporcionan información estructurada sobre el contenido de la página. Cuando alguien comparte tu página, estas etiquetas aseguran que se muestre de manera atractiva y con los datos correctos (imagen, título, descripción, etc.).

---

### **1. ¿Qué es el protocolo Open Graph?**

- Es un conjunto de etiquetas `<meta>` que define cómo se debe presentar tu contenido al ser compartido en redes sociales como Facebook, LinkedIn y Twitter.
- Mejora la apariencia de los enlaces compartidos, atrayendo más clics.

---

### **2. Principales etiquetas de Open Graph**

#### **a) `<meta property="og:title">`**

- Define el título del contenido.
- **Propósito**: Aparece como el encabezado en la vista previa del enlace.
- **Ejemplo**:
  ```html
  <meta property="og:title" content="Curso de HTML Básico" />
  ```

---

#### **b) `<meta property="og:description">`**

- Proporciona una breve descripción del contenido.
- **Propósito**: Resume el contenido en la vista previa.
- **Ejemplo**:
  ```html
  <meta
    property="og:description"
    content="Aprende los fundamentos de HTML y crea tus propias páginas web."
  />
  ```

---

#### **c) `<meta property="og:image">`**

- Especifica la URL de una imagen para la vista previa.
- **Propósito**: Aumenta la atracción visual del enlace.
- **Recomendaciones**:
  - Tamaño recomendado: 1200 x 630 píxeles.
  - Formato común: JPEG o PNG.
- **Ejemplo**:
  ```html
  <meta
    property="og:image"
    content="https://miweb.com/imagenes/curso-html.jpg"
  />
  ```

---

#### **d) `<meta property="og:url">`**

- Indica la URL canónica del contenido.
- **Propósito**: Ayuda a evitar confusiones si hay múltiples versiones de una URL.
- **Ejemplo**:
  ```html
  <meta property="og:url" content="https://miweb.com/curso-html" />
  ```

---

#### **e) `<meta property="og:type">`**

- Especifica el tipo de contenido.
- **Valores comunes**:
  - `website`: Página web estándar.
  - `article`: Publicación de blog o artículo.
  - `video`: Video compartido.
- **Ejemplo**:
  ```html
  <meta property="og:type" content="article" />
  ```

---

#### **f) `<meta property="og:locale">`**

- Indica el idioma del contenido.
- **Propósito**: Útil para sitios en varios idiomas.
- **Ejemplo**:
  ```html
  <meta property="og:locale" content="es_ES" />
  ```

---

### **3. Ejemplo completo de Open Graph**

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta property="og:title" content="Curso de HTML Básico" />
    <meta
      property="og:description"
      content="Aprende los fundamentos de HTML y crea tus propias páginas web."
    />
    <meta
      property="og:image"
      content="https://miweb.com/imagenes/curso-html.jpg"
    />
    <meta property="og:url" content="https://miweb.com/curso-html" />
    <meta property="og:type" content="website" />
    <meta property="og:locale" content="es_ES" />
    <title>Curso de HTML Básico</title>
  </head>
  <body>
    <h1>Bienvenidos al curso de HTML</h1>
  </body>
</html>
```

---

### **4. Ventajas del uso de Open Graph**

1. **Mayor visibilidad**: Los enlaces compartidos en redes sociales se ven más atractivos y generan más clics.
2. **Control total**: Decides qué información y apariencia tendrá tu página cuando se comparta.
3. **Experiencia consistente**: Las vistas previas son uniformes en diferentes plataformas.

---

### **5. Depuración de Open Graph**

Después de implementar las etiquetas OG, es importante probarlas para asegurarte de que funcionan correctamente. Algunas herramientas útiles son:

- **Facebook Sharing Debugger**: Permite verificar y depurar cómo Facebook interpreta las etiquetas OG.
  - URL: [https://developers.facebook.com/tools/debug/](https://developers.facebook.com/tools/debug/)
- **LinkedIn Post Inspector**: Similar al debugger de Facebook, pero para LinkedIn.
  - URL: [https://www.linkedin.com/post-inspector/](https://www.linkedin.com/post-inspector/)

---

### **Resumen de etiquetas OG más comunes**

| Etiqueta             | Descripción                           |
| -------------------- | ------------------------------------- |
| **`og:title`**       | Título del contenido.                 |
| **`og:description`** | Resumen del contenido.                |
| **`og:image`**       | Imagen de vista previa.               |
| **`og:url`**         | URL canónica del contenido.           |
| **`og:type`**        | Tipo de contenido (website, article). |
| **`og:locale`**      | Idioma del contenido.                 |

# 8. **Accesibilidad**

La **accesibilidad web** busca garantizar que todas las personas, incluidas aquellas con discapacidades, puedan usar y entender el contenido de un sitio web. En HTML, varios atributos accesibles facilitan la interacción de los usuarios con lectores de pantalla y otras tecnologías de asistencia.

### **1. Atributo `alt`**

- **¿Qué hace?**
  Proporciona un texto alternativo para las imágenes, que es leído por los lectores de pantalla o se muestra si la imagen no se carga.

- **Propósito**:

  - Ayudar a personas con discapacidad visual a comprender el contexto de una imagen.
  - Mejorar el SEO, ya que los motores de búsqueda usan este texto para indexar imágenes.

- **Ejemplo**:

  ```html
  <img src="gato.jpg" alt="Un gato naranja descansando en un sofá" />
  ```

- **Buenas prácticas**:
  - Describir la función de la imagen, no solo su apariencia.
  - Si la imagen es decorativa y no aporta información relevante, usar un `alt` vacío (`alt=""`).

---

### **2. Atributo `aria-label`**

- **¿Qué hace?**
  Proporciona una etiqueta personalizada para elementos interactivos como botones, enlaces o formularios.

- **Propósito**:

  - Ofrecer una descripción accesible cuando el contenido visual no es suficiente o no está disponible.
  - Mejora la navegación para usuarios de lectores de pantalla.

- **Ejemplo**:

  ```html
  <button aria-label="Abrir menú de navegación">☰</button>
  ```

- **Cuándo usarlo**:
  - Cuando el elemento no tiene texto visible (como íconos o botones minimalistas).

---

### **3. Atributo `aria-hidden`**

- **¿Qué hace?**
  Oculta un elemento del árbol de accesibilidad para los lectores de pantalla.

- **Propósito**:

  - Ignorar elementos que no son relevantes para la navegación accesible, como decoraciones o contenido duplicado.

- **Ejemplo**:

  ```html
  <div aria-hidden="true">
    Este texto no será leído por lectores de pantalla
  </div>
  ```

- **Cuándo usarlo**:
  - En íconos decorativos que no aportan información.
  - En elementos redundantes que ya están descritos de otra manera.

---

### **4. Ejemplo práctico combinado**

Supongamos que tienes un botón con un ícono y una imagen decorativa. Puedes usar estos atributos para garantizar la accesibilidad:

```html
<div>
  <!-- Imagen con descripción accesible -->
  <img src="perro.jpg" alt="Un perro jugando con una pelota" />

  <!-- Botón accesible -->
  <button aria-label="Abrir configuración">
    <img src="icono-configuracion.png" alt="" aria-hidden="true" />
  </button>
</div>
```

---

### **5. Beneficios de estos atributos**

1. **Mayor inclusión**: Los sitios se vuelven accesibles para personas con discapacidades visuales, motrices o cognitivas.
2. **Cumplimiento legal**: Muchas legislaciones, como la WCAG, exigen accesibilidad en sitios web.
3. **Mejora de SEO**: Google premia los sitios accesibles con mejor posicionamiento.

---

### **6. Herramientas para probar accesibilidad**

- **Wave Accessibility Tool**: Analiza y destaca problemas de accesibilidad.
- **Lighthouse (en DevTools de Chrome)**: Incluye una auditoría de accesibilidad.
- **NVDA** o **JAWS**: Lectores de pantalla populares para probar experiencias.

## Roles

### **¿Qué son los roles en HTML?**

Los roles son atributos que indican cómo un elemento debería ser interpretado por las tecnologías de asistencia (lectores de pantalla, etc.).

En **etiquetas semánticas** (como `<main>`, `<nav>`, `<header>`), **no es necesario agregar el atributo `role`**, ya que los navegadores y tecnologías de asistencia reconocen automáticamente su propósito.

### **Roles principales y ejemplos prácticos**

#### **1. Roles implícitos (no requieren `role`)**

Las siguientes etiquetas ya tienen un rol implícito:

- **`<main>`** → `role="main"`
- **`<nav>`** → `role="navigation"`
- **`<header>`** (global) → `role="banner"`
- **`<footer>`** (global) → `role="contentinfo"`
- **`<section>`** → `role="region"` (solo si tiene un encabezado `<h1>`-`<h6>`).
- **`<article>`** → `role="article"`
- **`<aside>`** → `role="complementary"`

**Ejemplo**:

```html
<header>
  <h1>Mi Sitio Web</h1>
</header>

<nav>
  <ul>
    <li><a href="#inicio">Inicio</a></li>
    <li><a href="#servicios">Servicios</a></li>
    <li><a href="#contacto">Contacto</a></li>
  </ul>
</nav>

<main>
  <section>
    <h2>Bienvenido</h2>
    <p>Disfruta de nuestros servicios.</p>
  </section>
</main>

<footer>
  <p>&copy; 2025 Mi Sitio Web</p>
</footer>
```

**Nota**: Este ejemplo ya es accesible sin necesidad de agregar atributos `role`.

---

#### **2. Roles explícitos (cuando se necesitan)**

Debemos usar `role` en los siguientes casos:

##### **a) Elementos no semánticos**

Cuando usás un `<div>` o `<span>` en lugar de una etiqueta semántica.

**Ejemplo**: Botón en un `<div>`:

```html
<div role="button" tabindex="0" onclick="alert('Hola!')">Presiona aquí</div>
```

- **`role="button"`** le indica al lector de pantalla que este elemento actúa como un botón.
- **`tabindex="0"`** lo hace navegable con el teclado.

---

##### **b) Reemplazar un rol predeterminado**

Si necesitás cambiar el propósito de una etiqueta.

**Ejemplo**: Usar un `<section>` como un cuadro de diálogo:

```html
<section role="dialog" aria-labelledby="titulo-dialogo">
  <h2 id="titulo-dialogo">Confirmar acción</h2>
  <p>¿Estás seguro de que querés continuar?</p>
</section>
```

- **`role="dialog"`** redefine el propósito del `<section>` como un diálogo.

---

##### **c) Elementos personalizados**

Si creás elementos interactivos personalizados con JavaScript, necesitás roles para definir su propósito.

**Ejemplo**: Crear una barra de progreso:

```html
<div
  role="progressbar"
  aria-valuenow="50"
  aria-valuemin="0"
  aria-valuemax="100"
>
  Cargando... 50%
</div>
```

- **`role="progressbar"`** indica que este es un indicador de progreso.
- **`aria-valuenow`, `aria-valuemin` y `aria-valuemax`** proporcionan información adicional.

---

### **Roles comunes**

| **Rol**           | **Descripción**                                               |
| ----------------- | ------------------------------------------------------------- |
| **`button`**      | Elemento que actúa como un botón interactivo.                 |
| **`navigation`**  | Área de navegación en la página.                              |
| **`banner`**      | Encabezado principal de una página.                           |
| **`contentinfo`** | Información del pie de página, como derechos de autor.        |
| **`dialog`**      | Cuadro de diálogo o modal.                                    |
| **`form`**        | Define un formulario interactivo.                             |
| **`list`**        | Lista genérica, como `<ul>` o `<ol>`.                         |
| **`listitem`**    | Elemento de una lista.                                        |
| **`progressbar`** | Barra de progreso que muestra el estado actual.               |
| **`search`**      | Área dedicada a la búsqueda.                                  |
| **`tab`**         | Pestaña dentro de una interfaz de usuario.                    |
| **`tabpanel`**    | Contenedor de contenido asociado a una pestaña.               |
| **`tooltip`**     | Información que aparece al pasar el cursor sobre un elemento. |

---

### **Ejemplo completo revisado**

Este ejemplo solo usa `role` donde es estrictamente necesario:

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Ejemplo de roles</title>
  </head>
  <body>
    <header>
      <h1>Mi Sitio Web</h1>
    </header>

    <nav>
      <ul>
        <li><a href="#inicio">Inicio</a></li>
        <li><a href="#servicios">Servicios</a></li>
        <li><a href="#contacto">Contacto</a></li>
      </ul>
    </nav>

    <main>
      <section>
        <h2>Bienvenido</h2>
        <p>Disfruta de nuestros servicios.</p>
      </section>
    </main>

    <aside>
      <h3>Noticias destacadas</h3>
      <p>Enterate de las últimas actualizaciones.</p>
    </aside>

    <footer>
      <p>&copy; 2025 Mi Sitio Web</p>
    </footer>

    <!-- Botón personalizado con role -->
    <div role="button" tabindex="0" onclick="alert('Hola!')">Haz clic aquí</div>
  </body>
</html>
```

---

### **Conclusión**

- **No uses roles redundantes** en etiquetas semánticas; ya son suficientes por sí mismas.
- **Usá `role` únicamente cuando sea necesario**, como en elementos no semánticos o personalizados.
- Esto garantiza que tu página sea más accesible, ligera y fácil de mantener.

## Navegación por teclado y mejores prácticas de accesibilidad.

La navegación por teclado es una de las principales formas en que las personas interactúan con un sitio web, especialmente aquellas con discapacidades visuales o motoras. Diseñar páginas que sean accesibles mediante el teclado asegura una experiencia inclusiva y mejora la usabilidad para todos.

---

### **¿Qué es la navegación por teclado?**

Es la capacidad de interactuar con una página web utilizando únicamente el teclado, sin un mouse. Esto implica poder:

1. Navegar por los elementos interactivos (`links`, `botones`, formularios, etc.).
2. Activar acciones (clics, envío de formularios, etc.).
3. Salir fácilmente de elementos complejos (como menús desplegables o modales).

---

### **Teclas comunes para navegación por teclado**

| **Tecla**       | **Función**                                                                      |
| --------------- | -------------------------------------------------------------------------------- |
| **Tab**         | Avanza al siguiente elemento interactivo (links, botones, campos de formulario). |
| **Shift + Tab** | Retrocede al elemento interactivo anterior.                                      |
| **Enter**       | Activa el elemento enfocado (botones, links, etc.).                              |
| **Espacio**     | Activa el elemento enfocado o desplaza la página hacia abajo.                    |
| **Flechas**     | Navega dentro de menús, listas, o controles personalizados (sliders, etc.).      |
| **Esc**         | Cierra modales o menús contextuales abiertos.                                    |

---

### **Mejores prácticas para garantizar accesibilidad mediante teclado**

#### **1. Asegurate de que todos los elementos sean navegables**

- Usá etiquetas HTML semánticas como `<a>`, `<button>`, `<input>`, `<select>`, etc. Estos elementos son navegables y tienen comportamientos nativos.
- Si necesitás un elemento interactivo no semántico (`<div>`, `<span>`), agregá:
  - **`tabindex="0"`**: Hace que el elemento sea navegable con `Tab`.
  - **Roles adecuados**: Ejemplo, `role="button"`.

**Ejemplo**:

```html
<div role="button" tabindex="0" onclick="alert('Hola!')">Presiona aquí</div>
```

---

#### **2. Usá `tabindex` sabiamente**

- **`tabindex="0"`**: Incluye un elemento en el flujo de navegación por teclado.
- **`tabindex="-1"`**: Excluye un elemento del flujo de navegación, pero permite que sea enfocado con JavaScript.
- **Evitar valores mayores a 0**: Esto interfiere con el orden natural de los elementos y puede confundir a los usuarios.

**Ejemplo**:

```html
<a href="#seccion1" tabindex="0">Ir a la sección 1</a>
<div tabindex="-1">Este elemento no es accesible con Tab.</div>
```

---

#### **3. Indicadores visuales de foco**

Asegurate de que los elementos enfocados con el teclado sean **visibles**. Esto se logra con el pseudo-selector `:focus`.

**Ejemplo CSS**:

```css
button:focus,
a:focus {
  outline: 2px solid #007bff; /* Indica claramente el foco */
  outline-offset: 2px;
}
```

**Evitar**: Nunca deshabilites el foco visual con `outline: none;` sin proporcionar una alternativa.

---

#### **4. Menús y modales accesibles**

Para menús, modales, o componentes interactivos:

- **Cerrar con `Esc`**.
- Usar **gestión del foco**:
  - Cuando un modal se abre, el foco debería moverse al primer elemento interactivo del modal.
  - Al cerrar el modal, el foco debería volver al elemento que lo activó.

**Ejemplo de JavaScript para gestionar el foco**:

```javascript
const modal = document.querySelector("#modal");
const openButton = document.querySelector("#abrir-modal");
const closeButton = document.querySelector("#cerrar-modal");

openButton.addEventListener("click", () => {
  modal.style.display = "block";
  closeButton.focus(); // Mover el foco al botón de cierre.
});

closeButton.addEventListener("click", () => {
  modal.style.display = "none";
  openButton.focus(); // Devolver el foco al botón que lo abrió.
});
```

---

#### **5. Uso de atributos ARIA**

- **`aria-label`**: Proporciona una descripción para elementos interactivos que no tienen texto visible.
- **`aria-hidden="true"`**: Oculta elementos de las tecnologías de asistencia.
- **`aria-expanded`**: Indica si un menú o sección está abierto.
- **`aria-live`**: Anuncia cambios dinámicos en el contenido (ej. notificaciones).

**Ejemplo de menú accesible**:

```html
<button aria-expanded="false" aria-controls="menu" onclick="toggleMenu()">
  Menú
</button>
<ul id="menu" hidden>
  <li><a href="#opcion1">Opción 1</a></li>
  <li><a href="#opcion2">Opción 2</a></li>
</ul>

<script>
  function toggleMenu() {
    const menu = document.querySelector("#menu");
    const button = document.querySelector('[aria-controls="menu"]');
    const isExpanded = button.getAttribute("aria-expanded") === "true";

    button.setAttribute("aria-expanded", !isExpanded);
    menu.hidden = isExpanded;
  }
</script>
```

---

### **Ejemplo completo**

Este ejemplo muestra cómo hacer una página navegable y accesible:

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Accesibilidad y Teclado</title>
    <style>
      button:focus,
      a:focus {
        outline: 2px solid #007bff;
        outline-offset: 2px;
      }
    </style>
  </head>
  <body>
    <header>
      <h1>Mi Sitio Accesible</h1>
      <nav>
        <ul>
          <li><a href="#inicio">Inicio</a></li>
          <li><a href="#sobre-nosotros">Sobre Nosotros</a></li>
          <li><a href="#contacto">Contacto</a></li>
        </ul>
      </nav>
    </header>

    <main id="inicio">
      <section id="contenido">
        <h2>Bienvenido</h2>
        <p>Este sitio es completamente navegable con teclado.</p>
        <button onclick="alert('Acción ejecutada')">
          Hacé clic o presioná Enter
        </button>
      </section>
    </main>

    <footer>
      <p>&copy; 2025 Mi Sitio Accesible</p>
    </footer>
  </body>
</html>
```

---

### **Conclusión**

1. Usá etiquetas semánticas y asegurate de que los elementos interactivos sean navegables.
2. Proporcioná indicadores claros de foco.
3. Implementá atributos ARIA solo cuando sea necesario.
4. Probá tu página usando solo el teclado para garantizar una experiencia fluida.

# 9. **Diseño Responsivo**

El diseño responsivo busca que las páginas web se adapten a diferentes tamaños de pantalla y dispositivos, mejorando la experiencia del usuario. Un aspecto clave es optimizar la carga de recursos como imágenes e iframes para mejorar la velocidad y el rendimiento.

### **¿Qué es `loading="lazy"`?**

El atributo `loading="lazy"` es una característica de HTML que permite cargar imágenes e iframes de manera diferida (lazy loading). Esto significa que los recursos se cargan **solo cuando están a punto de aparecer en la ventana visible del usuario (viewport)**.

### **Ventajas de usar `loading="lazy"`**

1. **Mejor rendimiento**: Reduce el tiempo de carga inicial de la página, ya que solo se cargan los recursos visibles de inmediato.
2. **Ahorro de ancho de banda**: No se descargan imágenes o iframes que el usuario nunca llega a ver.
3. **Experiencia optimizada**: Menor consumo de recursos en dispositivos móviles.

---

### **Uso en imágenes**

Para cargar imágenes de forma diferida, simplemente se agrega el atributo `loading="lazy"` a la etiqueta `<img>`.

**Ejemplo**:

```html
<img src="imagen1.jpg" alt="Descripción de la imagen" loading="lazy" />
<img
  src="imagen2.jpg"
  alt="Otra imagen"
  loading="lazy"
  width="600"
  height="400"
/>
```

### **Uso en iframes**

El atributo también se aplica a `<iframe>` para diferir la carga de contenido incrustado como mapas o videos.

**Ejemplo**:

```html
<iframe
  src="https://www.youtube.com/embed/videoID"
  loading="lazy"
  width="560"
  height="315"
></iframe>
<iframe
  src="https://www.google.com/maps/embed?pb=..."
  loading="lazy"
  width="600"
  height="450"
></iframe>
```

---

### **Cuándo no usar `loading="lazy"`**

1. **Elementos en el viewport inicial**: No uses `lazy` en imágenes o iframes que son visibles inmediatamente al cargar la página, ya que retrasar su carga puede afectar la experiencia del usuario.
2. **Imágenes críticas**: Como logos o imágenes principales, que deben estar disponibles desde el inicio.

---

### **Consejos adicionales para optimización**

#### **1. Tamaño y formatos adecuados**

- Utilizá formatos modernos como **WebP** o **AVIF** para imágenes más ligeras.
- Especificá los atributos `width` y `height` para evitar reflujo (reorganización) del contenido.

**Ejemplo**:

```html
<img
  src="imagen.webp"
  alt="Optimizada en WebP"
  loading="lazy"
  width="800"
  height="600"
/>
```

---

#### **2. Conjuntos de imágenes adaptables con `<picture>`**

Para ofrecer imágenes optimizadas según el dispositivo o tamaño de pantalla:

**Ejemplo**:

```html
<picture>
  <source srcset="imagen-pequena.webp" media="(max-width: 600px)" />
  <source srcset="imagen-mediana.webp" media="(max-width: 1200px)" />
  <img
    src="imagen-grande.jpg"
    alt="Ejemplo de imagen responsiva"
    loading="lazy"
  />
</picture>
```

Cuando un usuario visita tu página, el navegador evalúa las condiciones especificadas en las etiquetas <source> y carga la imagen correspondiente según el tamaño de la pantalla:

Si el dispositivo tiene una pantalla de menos de 600px de ancho (como un móvil), el navegador descargará la imagen imagen-pequena.webp.
Si el dispositivo tiene un ancho de pantalla entre 600px y 1200px (como una tablet), se descargará la imagen imagen-mediana.webp.
Si el dispositivo tiene un ancho de pantalla mayor a 1200px (como una laptop o desktop), se descargará la imagen imagen-grande.jpg.

---

#### **3. Prioridad en recursos críticos**

Asegurate de usar el atributo `loading="eager"` (carga inmediata) para elementos importantes en la experiencia del usuario.

**Ejemplo**:

```html
<img src="logo.jpg" alt="Logo de la empresa" loading="eager" />
```

---

### **¿Cómo probar el lazy loading?**

1. **Herramientas de desarrollo del navegador**:
   - En Chrome, abrí el panel de DevTools (`F12`) y navegá a la pestaña "Network".
   - Observá cómo los recursos con `loading="lazy"` se cargan solo cuando están cerca del viewport.
2. **Simulación de conexión lenta**: En DevTools, activá "Slow 3G" para verificar el comportamiento.

---

### **Conclusión**

El atributo `loading="lazy"` es una herramienta sencilla y efectiva para mejorar la velocidad de carga y la experiencia del usuario en un diseño responsivo. Su integración, junto con otras prácticas como el uso de formatos modernos y tamaños optimizados, asegura que tu sitio sea rápido y accesible en cualquier dispositivo.

## Elementos adaptativos: <picture>, <source>.

Los elementos `<picture>` y `<source>` permiten ofrecer imágenes optimizadas y adaptadas para diferentes dispositivos, resoluciones y condiciones de visualización. Estos elementos forman parte de una estrategia para el diseño responsivo y aseguran que las imágenes se ajusten adecuadamente a las características del dispositivo del usuario, como su tamaño de pantalla o la capacidad de carga.

---

### **1. Elemento `<picture>`**

El elemento `<picture>` es una solución avanzada para controlar cómo se cargan las imágenes en función de las características del dispositivo o del entorno de visualización. Este elemento actúa como un contenedor que puede incluir múltiples fuentes de imagen dentro de él.

- El `<picture>` permite definir diferentes versiones de una imagen, usando el elemento `<source>` para cada una de ellas.
- Ideal para imágenes de diferentes resoluciones (como para pantallas Retina) o imágenes específicas según el tamaño de pantalla (por ejemplo, para móviles o escritorios).

**Sintaxis básica**:

```html
<picture>
  <source srcset="imagen-desktop.jpg" media="(min-width: 1024px)" />
  <source srcset="imagen-tablet.jpg" media="(min-width: 768px)" />
  <source srcset="imagen-mobile.jpg" media="(max-width: 767px)" />
  <img src="imagen-default.jpg" alt="Descripción de la imagen" />
</picture>
```

En este ejemplo:

- La imagen "imagen-desktop.jpg" se carga en pantallas grandes (mayores a 1024px).
- La imagen "imagen-tablet.jpg" se carga en pantallas medianas (entre 768px y 1024px).
- La imagen "imagen-mobile.jpg" se carga en dispositivos móviles (pantallas menores a 768px).
- El atributo `src` del `<img>` es el valor de respaldo si el navegador no soporta `<picture>`.

---

### **2. Elemento `<source>`**

El elemento `<source>` se utiliza dentro de `<picture>` y define diferentes archivos de imagen, junto con condiciones para cuándo deben ser utilizados. Estas condiciones se especifican a través del atributo `media` o `srcset`.

- **`srcset`**: Define el conjunto de imágenes disponibles, especificando una URL de imagen.
- **`media`**: Define una condición para cargar una imagen en función de las características del dispositivo (como el ancho de pantalla).

**Ejemplo**:

```html
<picture>
  <source srcset="imagen-retina.jpg" media="(min-resolution: 2dppx)" />
  <source srcset="imagen-1x.jpg" media="(max-width: 767px)" />
  <img src="imagen-default.jpg" alt="Imagen de respaldo" />
</picture>
```

En este ejemplo:

- Si la resolución de la pantalla es mayor o igual a 2dppx (pantallas Retina), se carga "imagen-retina.jpg".
- Si el ancho de la pantalla es menor o igual a 767px (dispositivos móviles), se carga "imagen-1x.jpg".
- Si el navegador no soporta `<picture>`, se carga "imagen-default.jpg".

---

### **3. ¿Por qué usar `<picture>` y `<source>`?**

- **Optimización de imágenes**: Permite cargar imágenes específicas para cada tipo de dispositivo o condición, lo que reduce el tamaño de los archivos y mejora la carga de la página.
- **Rendimiento mejorado**: Si bien usar imágenes de mayor resolución puede ser útil en pantallas de alta definición, puede ser innecesario para dispositivos con pantallas más pequeñas o conexiones lentas.
- **Compatibilidad con pantallas Retina**: En pantallas de alta resolución (como las pantallas Retina de Apple), puedes ofrecer versiones de imágenes con mayor densidad de píxeles.
- **Diseño responsivo**: Permite adaptar las imágenes según el tamaño de la pantalla, evitando que los usuarios de dispositivos pequeños tengan que descargar imágenes grandes.

---

### **4. Ejemplo completo con diferentes tipos de imágenes y tamaños**

Aquí se muestra un ejemplo práctico en el que se cargan diferentes imágenes para distintos tamaños de pantalla y resoluciones.

**Ejemplo**:

```html
<picture>
  <!-- Imagen para pantallas Retina -->
  <source srcset="imagen-hd.jpg" media="(min-resolution: 2dppx)" />
  <!-- Imagen para dispositivos con pantalla pequeña (móviles) -->
  <source srcset="imagen-mobile.jpg" media="(max-width: 767px)" />
  <!-- Imagen para dispositivos medianos (tabletas) -->
  <source
    srcset="imagen-tablet.jpg"
    media="(min-width: 768px) and (max-width: 1023px)"
  />
  <!-- Imagen para dispositivos grandes (escritorios) -->
  <source srcset="imagen-desktop.jpg" media="(min-width: 1024px)" />

  <!-- Imagen de respaldo para navegadores que no soportan <picture> -->
  <img
    src="imagen-default.jpg"
    alt="Una imagen responsiva"
    width="800"
    height="600"
  />
</picture>
```

---

### **Conclusión**

El uso de `<picture>` y `<source>` es una excelente manera de optimizar imágenes en el contexto del diseño responsivo. Al implementar estos elementos, podrás ofrecer imágenes adaptadas a diferentes tamaños de pantalla, resoluciones y condiciones del entorno, lo que mejora el rendimiento y la experiencia del usuario en tu sitio web.

# 10. **HTML Avanzado**

## Etiqueta `<template>` para contenido dinámico

La etiqueta `<template>` es una característica avanzada de HTML que permite definir fragmentos de código HTML que no se renderizan inmediatamente cuando se carga la página, sino que pueden ser clonados y renderizados dinámicamente con JavaScript en el futuro. Es útil para situaciones donde necesitas definir estructuras HTML que se utilizarán más tarde, como en la manipulación del DOM o cuando se interactúa con datos dinámicos (por ejemplo, mostrar una lista de elementos).

---

### **¿Qué es la etiqueta `<template>`?**

La etiqueta `<template>` actúa como un contenedor invisible en la página web. Su contenido **no se muestra en la interfaz de usuario** cuando la página se carga. Solo se puede acceder a él a través de JavaScript, lo que te permite insertar contenido dinámicamente cuando sea necesario.

- **No renderizado**: El contenido dentro de `<template>` no se representa visualmente al cargar la página.
- **Uso con JavaScript**: Se puede usar JavaScript para acceder al contenido de `<template>`, clonarlo y agregarlo a otras partes del documento HTML.

### **Sintaxis básica de `<template>`**

```html
<template id="miTemplate">
  <div class="producto">
    <h2></h2>
    <p></p>
  </div>
</template>
```

En este ejemplo:

- El contenido de `<template>` (un `div` con una estructura de producto) no se mostrará cuando se cargue la página.
- El `id="miTemplate"` se usa para identificar el `<template>` y poder acceder a él más tarde con JavaScript.

---

### **¿Cómo funciona en conjunto con JavaScript?**

Para usar la etiqueta `<template>`, necesitas interactuar con ella usando JavaScript. El proceso básico consiste en:

1. Acceder al contenido del `<template>`.
2. Clonarlo.
3. Insertarlo en el DOM (Document Object Model) para que se visualice.

### **Ejemplo: Agregar dinámicamente contenido a la página**

Imaginemos que tienes una lista de productos y quieres mostrarla de manera dinámica. Definimos un `<template>` y luego usamos JavaScript para insertarlo varias veces.

**HTML**:

```html
<template id="productoTemplate">
  <div class="producto">
    <h2></h2>
    <p></p>
  </div>
</template>

<div id="productosList"></div>
```

**JavaScript**:

```javascript
// Datos de productos
const productos = [
  { nombre: "Producto A", descripcion: "Descripción del Producto A" },
  { nombre: "Producto B", descripcion: "Descripción del Producto B" },
  { nombre: "Producto C", descripcion: "Descripción del Producto C" },
];

// Obtener el template
const template = document.getElementById("productoTemplate");

// Obtener el contenedor donde se insertarán los productos
const lista = document.getElementById("productosList");

// Iterar sobre los productos y agregar cada uno al DOM
productos.forEach((producto) => {
  // Clonar el contenido del template
  const clone = template.content.cloneNode(true);

  // Acceder al contenido del clone y agregar datos dinámicos
  clone.querySelector("h2").textContent = producto.nombre;
  clone.querySelector("p").textContent = producto.descripcion;

  // Insertar el clone en la lista
  lista.appendChild(clone);
});
```

**Explicación**:

1. **Template**: Definimos un `<template>` con una estructura HTML básica para un producto (un título y una descripción).
2. **JavaScript**: Accedemos al `<template>` mediante `document.getElementById()`, luego clonamos su contenido con `cloneNode(true)`. Esto crea una copia del contenido del template.
3. **Dinamismo**: En cada clon, agregamos los datos de los productos (como el nombre y la descripción).
4. **Renderizado**: Finalmente, insertamos el contenido en el DOM (en el contenedor con el id `productosList`).

---

### **Ventajas de usar `<template>`**

1. **Organización del código**: Permite definir plantillas HTML que pueden ser reutilizadas y manipuladas sin necesidad de duplicar código en el archivo HTML.
2. **Mejora del rendimiento**: Evita la carga innecesaria de contenido que no será visible de inmediato, y permite que el contenido se agregue solo cuando sea necesario.
3. **Flexibilidad**: Se puede usar con cualquier tipo de contenido dinámico (por ejemplo, listas de elementos, formularios, componentes interactivos).

---

### **Casos de uso comunes para `<template>`**

- **Generación de contenido dinámico**: Cuando se necesitan insertar elementos de forma dinámica en la página (por ejemplo, en aplicaciones que requieren mostrar datos de un servidor).
- **Componentes reutilizables**: Definir una plantilla de componente (por ejemplo, una tarjeta de producto o un artículo) que se puede reutilizar muchas veces en la misma página.
- **Renderizado condicional**: Crear estructuras que solo se agregarán al DOM si se cumplen ciertas condiciones (por ejemplo, si hay datos para mostrar).

---

### **Ejemplo con una tabla dinámica**

Otro ejemplo de uso sería la generación de una tabla a partir de datos dinámicos.

**HTML**:

```html
<template id="templateFila">
  <tr>
    <td></td>
    <td></td>
    <td></td>
  </tr>
</template>

<table id="tabla">
  <thead>
    <tr>
      <th>Nombre</th>
      <th>Edad</th>
      <th>Ciudad</th>
    </tr>
  </thead>
  <tbody></tbody>
</table>
```

**JavaScript**:

```javascript
const personas = [
  { nombre: "Juan", edad: 30, ciudad: "Buenos Aires" },
  { nombre: "Ana", edad: 25, ciudad: "Córdoba" },
  { nombre: "Carlos", edad: 40, ciudad: "Rosario" },
];

const tabla = document.getElementById("tabla").getElementsByTagName("tbody")[0];
const template = document.getElementById("templateFila");

personas.forEach((persona) => {
  const clone = template.content.cloneNode(true);
  clone.querySelector("td:nth-child(1)").textContent = persona.nombre;
  clone.querySelector("td:nth-child(2)").textContent = persona.edad;
  clone.querySelector("td:nth-child(3)").textContent = persona.ciudad;
  tabla.appendChild(clone);
});
```

---

### **Conclusión**

La etiqueta `<template>` es una herramienta poderosa para crear contenido dinámico en una página web. Con su uso, puedes organizar y optimizar la carga de contenido HTML, mejorando la experiencia de usuario y manteniendo el código más limpio y eficiente. Combinado con JavaScript, permite crear páginas web interactivas y modernas con facilidad.

## Etiqueta `<slot>` para web components.

La etiqueta `<slot>` es una de las herramientas esenciales en la creación de **Web Components**. Los Web Components son un conjunto de tecnologías que permiten crear elementos HTML reutilizables y encapsulados, de manera similar a cómo funcionan los elementos estándar de HTML, pero con funcionalidades personalizadas. La etiqueta `<slot>` juega un papel clave en el sistema de **Light DOM** (DOM ligero), permitiendo que los usuarios de tu componente inserten contenido dentro del componente sin alterar su estructura interna.

---

### **¿Qué es un Web Component?**

Un **Web Component** es un conjunto de tecnologías que permite crear elementos HTML reutilizables, encapsulados y personalizados. Los Web Components están formados por cuatro principales tecnologías:

1. **Custom Elements**: Permite definir nuevos elementos HTML.
2. **Shadow DOM**: Proporciona un encapsulamiento completo del contenido y estilo de un componente, evitando que se mezclen con el DOM principal.
3. **HTML Templates**: Permite definir bloques de HTML que pueden ser reutilizados.
4. **Slots**: Permite insertar contenido en un Web Component sin alterar su estructura interna.

### **¿Qué es `<slot>`?**

La etiqueta `<slot>` se utiliza dentro del **Shadow DOM** de un Web Component para definir áreas en las que el contenido del documento principal (el contenido "light" DOM) puede ser insertado.

El contenido insertado en un `<slot>` será el contenido que se pase al Web Component cuando este se use en el HTML, como si fuera un espacio de sustitución dentro de la plantilla del componente.

### **Sintaxis básica de `<slot>`**

```html
<slot name="miSlot"></slot>
```

- **`name`**: Atributo opcional que se usa para identificar un área específica del slot. Si no se usa un nombre, el slot será anónimo.
- **Contenido de reemplazo**: Si el slot no recibe contenido del documento principal, puedes especificar un contenido predeterminado, que se mostrará en su lugar.

---

### **Uso básico de `<slot>`**

Vamos a crear un Web Component sencillo que use la etiqueta `<slot>` para permitir la inserción de contenido dinámico.

**Ejemplo de un Web Component con un slot:**

**HTML**:

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Web Component con Slot</title>
  </head>
  <body>
    <!-- Usando el Web Component -->
    <mi-componente>
      <p slot="contenido">¡Este es el contenido insertado en el slot!</p>
    </mi-componente>

    <script src="component.js"></script>
  </body>
</html>
```

**JavaScript (component.js)**:

```javascript
class MiComponente extends HTMLElement {
  constructor() {
    super();

    // Crear el Shadow DOM
    const shadowRoot = this.attachShadow({ mode: "open" });

    // Crear el HTML para el Web Component
    shadowRoot.innerHTML = `
      <style>
        :host {
          display: block;
          padding: 20px;
          background-color: #f4f4f4;
          border-radius: 8px;
        }
      </style>
      <h2>Componente Personalizado</h2>
      <div>
        <slot name="contenido">Este es un contenido predeterminado si no hay nada en el slot.</slot>
      </div>
    `;
  }
}

// Definir el nuevo elemento
customElements.define("mi-componente", MiComponente);
```

**Explicación**:

1. **Componente**: Hemos creado un Web Component llamado `<mi-componente>`. Dentro de su Shadow DOM, hemos utilizado un `<slot>` con el atributo `name="contenido"`. Esto indica que el contenido insertado en el documento principal debe colocarse en ese lugar dentro del componente.
2. **Contenido insertado**: En el HTML principal, hemos insertado un párrafo `<p>` con el atributo `slot="contenido"`, lo que indica que este párrafo debe ser insertado dentro del slot dentro del componente.

3. **Contenido predeterminado**: Si no se proporciona contenido para el slot, se mostrará un mensaje predeterminado: _"Este es un contenido predeterminado si no hay nada en el slot."_

---

### **Slots anónimos**

Si no se necesita nombrar un slot (es decir, si el componente solo necesita un lugar de inserción sin importar su nombre), se puede usar un slot anónimo:

**Ejemplo con slot anónimo**:

```html
<mi-componente>
  <p>Contenido sin nombre para el slot</p>
</mi-componente>

<script src="component.js"></script>
```

En este caso, no se utiliza el atributo `name`, por lo que el contenido se inserta en el slot anónimo.

**JavaScript (component.js)**:

```javascript
class MiComponente extends HTMLElement {
  constructor() {
    super();

    // Crear el Shadow DOM
    const shadowRoot = this.attachShadow({ mode: "open" });

    // Crear el HTML para el Web Component
    shadowRoot.innerHTML = `
      <style>
        :host {
          display: block;
          padding: 20px;
          background-color: #f4f4f4;
          border-radius: 8px;
        }
      </style>
      <h2>Componente Personalizado</h2>
      <div>
        <slot>Este es el contenido predeterminado si no hay nada en el slot.</slot>
      </div>
    `;
  }
}

// Definir el nuevo elemento
customElements.define("mi-componente", MiComponente);
```

---

### **Uso avanzado de `<slot>`**

Puedes tener múltiples slots dentro de un mismo componente, y cada uno puede estar destinado a diferentes partes del contenido que se inserte.

**Ejemplo con múltiples slots**:

```html
<mi-componente>
  <p slot="introduccion">Este es el contenido de introducción</p>
  <p slot="cuerpo">Este es el cuerpo del contenido</p>
  <p slot="conclusion">Este es el contenido de conclusión</p>
</mi-componente>
```

**JavaScript (component.js)**:

```javascript
class MiComponente extends HTMLElement {
  constructor() {
    super();

    // Crear el Shadow DOM
    const shadowRoot = this.attachShadow({ mode: "open" });

    // Crear el HTML para el Web Component
    shadowRoot.innerHTML = `
      <style>
        :host {
          display: block;
          padding: 20px;
          background-color: #f4f4f4;
          border-radius: 8px;
        }
      </style>
      <h2>Componente con Múltiples Slots</h2>
      <div>
        <h3>Introducción</h3>
        <slot name="introduccion">Contenido predeterminado de introducción.</slot>
      </div>
      <div>
        <h3>Cuerpo</h3>
        <slot name="cuerpo">Contenido predeterminado del cuerpo.</slot>
      </div>
      <div>
        <h3>Conclusión</h3>
        <slot name="conclusion">Contenido predeterminado de conclusión.</slot>
      </div>
    `;
  }
}

// Definir el nuevo elemento
customElements.define("mi-componente", MiComponente);
```

---

### **Conclusión**

La etiqueta `<slot>` es una parte fundamental en el desarrollo de Web Components, ya que permite crear contenido dinámico y reutilizable dentro de componentes personalizados. Gracias a su uso, los desarrolladores pueden crear elementos HTML encapsulados que permiten la inserción de contenido sin interferir con el resto del documento, haciendo que los componentes sean más flexibles y modulares.

## Uso de `<iframe>` y atributos de seguridad (`sandbox`, `allow`).

El `<iframe>` es una etiqueta HTML que permite incrustar un documento HTML dentro de otro. Se utiliza para cargar contenido de una fuente externa, como un video de YouTube, un mapa de Google, o incluso otro sitio web. Aunque muy útil, su uso debe ser manejado con cuidado debido a los posibles riesgos de seguridad.

---

### **Sintaxis básica de `<iframe>`**

```html
<iframe src="URL_del_contenido" width="600" height="400"></iframe>
```

- **`src`**: Especifica la URL del contenido que se desea cargar en el iframe.
- **`width`** y **`height`**: Definen las dimensiones del iframe en píxeles.
- **`frameborder`** (obsoleto): Determina si debe haber un borde alrededor del iframe. Aunque en versiones modernas de HTML este atributo está obsoleto, la recomendación es usar CSS para definir los bordes.

---

### **Atributos de Seguridad del `<iframe>`**

Aunque `<iframe>` es muy versátil, su uso puede generar riesgos de seguridad si se carga contenido de fuentes no confiables. Por esto, se han introducido varios atributos de seguridad para ayudar a controlar lo que puede hacer el contenido dentro de un iframe.

#### **1. Atributo `sandbox`**

El atributo `sandbox` impone restricciones sobre lo que el contenido del iframe puede hacer. Al usarlo, se limitan ciertos comportamientos que podrían ser peligrosos, como la ejecución de scripts, la apertura de nuevas ventanas o el envío de formularios. Puedes utilizar valores en el atributo `sandbox` para ajustar las restricciones.

**Sintaxis básica**:

```html
<iframe src="URL" sandbox></iframe>
```

Cuando se utiliza `sandbox` sin valores, se aplica un conjunto de restricciones predeterminado, que incluye:

- Deshabilitar la ejecución de scripts.
- Deshabilitar la navegación de formularios.
- Impedir la creación de ventanas emergentes.
- Bloquear el acceso a la información del navegador (por ejemplo, la geolocalización o las APIs de dispositivo).

**Valores del atributo `sandbox`**:

Puedes especificar valores dentro de `sandbox` para permitir ciertas acciones dentro del iframe. Los valores más comunes son:

- **`allow-forms`**: Permite el envío de formularios.
- **`allow-scripts`**: Permite la ejecución de scripts dentro del iframe (sin esta opción, los scripts están bloqueados por defecto).
- **`allow-same-origin`**: Permite que el iframe cargue contenido desde el mismo origen, habilitando interacciones como el acceso a cookies o almacenamiento local.
- **`allow-popups`**: Permite abrir nuevas ventanas o pestañas.
- **`allow-top-navigation`**: Permite que el iframe navegue por encima del contenido principal (por ejemplo, redirigir a la página principal).
- **`allow-pointer-lock`**: Permite la captura del puntero del mouse.

**Ejemplo de iframe con `sandbox`**:

```html
<iframe src="https://example.com" sandbox="allow-scripts allow-forms"></iframe>
```

En este ejemplo, se permite la ejecución de scripts y el envío de formularios dentro del iframe, pero se siguen aplicando otras restricciones como la deshabilitación de la navegación a otros orígenes.

#### **2. Atributo `allow`**

El atributo `allow` se utiliza en el `<iframe>` para especificar qué características o capacidades están permitidas para el contenido que se muestra en el iframe. Este atributo es útil para habilitar características específicas de HTML5, como la reproducción de medios (video/audio), la geolocalización, y el acceso a la cámara o micrófono.

**Sintaxis básica**:

```html
<iframe
  src="https://example.com"
  allow="autoplay; encrypted-media; fullscreen"
></iframe>
```

**Valores comunes para `allow`**:

- **`autoplay`**: Permite la reproducción automática de contenido multimedia (por ejemplo, videos o audios) dentro del iframe.
- **`encrypted-media`**: Permite la reproducción de contenido multimedia protegido, como contenido de plataformas de streaming.
- **`fullscreen`**: Permite que el iframe entre en modo de pantalla completa.
- **`geolocation`**: Permite que el iframe acceda a la ubicación geográfica del usuario.
- **`microphone`**: Permite el acceso al micrófono del usuario.
- **`camera`**: Permite el acceso a la cámara del usuario.

**Ejemplo de iframe con `allow`**:

```html
<iframe
  src="https://www.youtube.com/embed/dQw4w9WgXcQ"
  allow="autoplay; encrypted-media"
  width="600"
  height="400"
></iframe>
```

En este ejemplo, se permite que el video de YouTube se reproduzca automáticamente y que utilice contenido protegido por derechos de autor.

---

### **Consideraciones de Seguridad**

- **XSS (Cross-site Scripting)**: Al incrustar contenido de otros sitios, es importante asegurarse de que el contenido sea confiable, ya que puede ser una vía de ataque para inyectar scripts maliciosos.
- **Clickjacking**: El uso de iframes en sitios web puede ser aprovechado para ataques de **clickjacking**, donde el contenido de un iframe oculta una capa de interacción maliciosa. Puedes proteger tu sitio contra clickjacking utilizando el encabezado HTTP `X-Frame-Options` o el atributo `sandbox`.

- **Acceso entre orígenes (Cross-Origin)**: Si el contenido dentro del iframe proviene de un dominio diferente, las restricciones de seguridad del navegador (CORS) pueden bloquear la interacción entre el iframe y el sitio principal. Asegúrate de entender cómo funciona CORS si estás incrustando contenido de diferentes orígenes.

---

### **Ejemplo Completo con Atributos de Seguridad**

```html
<iframe
  src="https://example.com"
  width="600"
  height="400"
  sandbox="allow-scripts allow-forms allow-same-origin"
  allow="autoplay; fullscreen"
></iframe>
```

Este ejemplo permite que el iframe cargue contenido desde el mismo origen, ejecute scripts, envíe formularios, y también permita la reproducción automática de medios y la visualización en pantalla completa.

---

### **Conclusión**

El uso de `<iframe>` puede ser muy útil para incrustar contenido externo, pero siempre debe acompañarse de medidas de seguridad como los atributos `sandbox` y `allow` para proteger tanto a los usuarios como al propio sitio web. Asegurarse de que solo se habiliten las capacidades necesarias dentro del iframe ayuda a reducir los riesgos de seguridad y mejora la integridad del contenido cargado.

# 11. **Internacionalización (i18n)**

La **internacionalización** (abreviada como **i18n**) se refiere al proceso de diseñar y desarrollar aplicaciones y sitios web de manera que puedan adaptarse fácilmente a diferentes idiomas y regiones. Una parte fundamental de este proceso es la correcta implementación de la etiqueta `lang`, que indica el idioma del contenido en una página web.

---

### **Atributo `lang`**

El atributo `lang` es utilizado en HTML para especificar el idioma del contenido de un documento o de un elemento específico. Este atributo ayuda a los navegadores y a las herramientas de accesibilidad (como los lectores de pantalla) a interpretar y presentar el contenido de manera adecuada según el idioma que se indica.

#### **Sintaxis básica del atributo `lang`**:

```html
<html lang="es">
  <head>
    <title>Mi sitio web</title>
  </head>
  <body>
    <p>¡Bienvenidos a mi página web!</p>
  </body>
</html>
```

En este ejemplo, el atributo `lang="es"` en la etiqueta `<html>` indica que el contenido de la página está en español.

---

### **Importancia del atributo `lang`**

El atributo `lang` tiene varias ventajas importantes tanto para la accesibilidad como para el SEO (optimización para motores de búsqueda):

#### **1. Mejora la accesibilidad:**

- Los lectores de pantalla y otras tecnologías asistivas utilizan el atributo `lang` para adaptar el contenido según el idioma. Si un lector de pantalla sabe que el contenido está en español, puede leerlo con la pronunciación y entonación adecuada.
- También ayuda a los usuarios con dificultades visuales que usan tecnologías de asistencia, ya que los lectores de pantalla pueden cambiar entre diferentes voces y entonaciones según el idioma especificado.

#### **2. Optimización para motores de búsqueda (SEO):**

- Los motores de búsqueda, como Google, utilizan el atributo `lang` para determinar el idioma del contenido y mostrarlo a los usuarios adecuados según su configuración regional y preferencias de idioma. Esto es crucial para la clasificación y visibilidad de las páginas web en los resultados de búsqueda.
- La implementación correcta del atributo `lang` contribuye a una mejor indexación y localización de la página.

#### **3. Correcta representación de caracteres y codificación:**

- El atributo `lang` puede ayudar a los navegadores a seleccionar la codificación correcta para los caracteres del idioma especificado, evitando problemas de visualización en idiomas que utilizan caracteres especiales (como los acentos o caracteres no latinos).
- Aunque la codificación de caracteres (generalmente UTF-8) también es importante, el atributo `lang` ayuda a los navegadores a manejar de forma más efectiva los caracteres específicos de un idioma.

#### **4. Adaptación de recursos de la página:**

- Algunas funcionalidades de la página, como la orientación del texto (de izquierda a derecha o de derecha a izquierda), dependen del idioma. Por ejemplo, en árabe o hebreo, el texto se lee de derecha a izquierda. El atributo `lang` ayuda a los navegadores y a los desarrolladores a identificar estas necesidades y ajustar el diseño en consecuencia.

---

### **Valores comunes del atributo `lang`**

- **`lang="en"`**: Indica que el contenido está en inglés.
- **`lang="es"`**: Indica que el contenido está en español.
- **`lang="fr"`**: Indica que el contenido está en francés.
- **`lang="de"`**: Indica que el contenido está en alemán.
- **`lang="ja"`**: Indica que el contenido está en japonés.
- **`lang="ar"`**: Indica que el contenido está en árabe (de derecha a izquierda).

También es posible especificar variaciones regionales de un idioma, como por ejemplo:

- **`lang="en-US"`**: Inglés de Estados Unidos.
- **`lang="en-GB"`**: Inglés del Reino Unido.
- **`lang="es-AR"`**: Español de Argentina.

Esto es útil cuando se quiere adaptar el contenido no solo al idioma, sino también a una variante regional, por ejemplo, entre español de España y español de América Latina.

---

### **Ejemplos de uso del atributo `lang`**

#### **1. Especificar el idioma del documento completo**:

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="description" content="Sitio web en español" />
    <title>Mi página web</title>
  </head>
  <body>
    <h1>Bienvenidos</h1>
    <p>Este es un sitio web en español.</p>
  </body>
</html>
```

#### **2. Especificar el idioma de un solo bloque de texto dentro de un documento**:

A veces, dentro de un documento en un idioma principal, puedes tener fragmentos de texto en otro idioma (por ejemplo, citas o títulos en inglés dentro de una página en español). En esos casos, puedes usar el atributo `lang` en el elemento correspondiente:

```html
<p lang="en">This is a quote in English.</p>
<p lang="fr">C'est une citation en français.</p>
```

---

### **Consideraciones y mejores prácticas**

- **No olvidar establecer el idioma de la página**: Es esencial especificar el idioma en la etiqueta `<html>` para que los navegadores y tecnologías de asistencia puedan reconocerlo correctamente.
- **Usar variantes regionales si es necesario**: Si tu contenido está dirigido a una región específica, utiliza la variante regional correspondiente para una mejor precisión en la accesibilidad y el SEO.
- **Evitar la sobrecarga de idiomas**: Asegúrate de que el contenido del sitio sea coherente con el idioma que se está declarando, ya que un uso incorrecto o incoherente del atributo `lang` puede afectar negativamente la experiencia del usuario y el rendimiento de SEO.

---

### **Conclusión**

El atributo `lang` es una parte crucial para la internacionalización de páginas web, ya que no solo mejora la accesibilidad y la experiencia de usuario, sino que también tiene un impacto significativo en la optimización para motores de búsqueda (SEO). Es fundamental utilizarlo correctamente para garantizar que el contenido se muestre de manera adecuada y accesible para los usuarios de diferentes idiomas y regiones.

## Manejo de direcciones de texto

En HTML, el manejo de direcciones de texto es especialmente importante cuando se trabaja con idiomas que tienen diferentes direcciones de escritura, como el árabe o el hebreo, que se escriben de derecha a izquierda (RTL, por sus siglas en inglés), en contraposición a los idiomas que se escriben de izquierda a derecha (LTR, como el español o el inglés). Las etiquetas `<bdi>`, `<bdo>` y el atributo `dir` son herramientas útiles para controlar cómo se muestra y se comporta el texto en estas situaciones.

---

### **1. `<bdi>` (Bi-Directional Isolation)**

La etiqueta `<bdi>` (Bi-Directional Isolation) se utiliza para aislar una parte de texto con dirección de escritura diferente, de manera que no afecte el flujo del contenido circundante. Es especialmente útil cuando se tiene una cadena de texto que se encuentra dentro de un contexto de dirección de texto mixta (por ejemplo, en un párrafo en árabe que contiene un número en inglés).

**Sintaxis básica**:

```html
<p>El número es <bdi>1234</bdi> y está en inglés.</p>
```

#### **Características y utilidad**:

- Aísla el texto dentro de la etiqueta `<bdi>` de la dirección de escritura del texto circundante.
- Se utiliza cuando el texto dentro del elemento tiene una dirección de escritura diferente al contexto en el que se encuentra, evitando que afecte el flujo general de la página.

**Ejemplo**:

Si tienes una página en árabe y quieres incluir un número en un contexto de izquierda a derecha (LTR), puedes usar `<bdi>` para asegurarte de que el número se renderice correctamente:

```html
<p lang="ar">هذه الصفحة تحتوي على <bdi>1234</bdi> كنص إنجليزي.</p>
```

En este caso, el texto árabe se lee de derecha a izquierda, pero el número dentro del `<bdi>` se aísla y se muestra de izquierda a derecha.

---

### **2. `<bdo>` (Bi-Directional Override)**

La etiqueta `<bdo>` (Bi-Directional Override) permite sobrescribir la dirección de texto de una sección de contenido. A diferencia de `<bdi>`, que aísla el contenido y lo muestra según su propia dirección, `<bdo>` cambia la dirección de escritura de manera explícita, forzando una dirección específica, ya sea de izquierda a derecha (LTR) o de derecha a izquierda (RTL).

**Sintaxis básica**:

```html
<bdo dir="ltr">Este texto se mostrará de izquierda a derecha.</bdo>
```

**Atributo `dir`**:

- **`dir="ltr"`**: El texto se mostrará de izquierda a derecha.
- **`dir="rtl"`**: El texto se mostrará de derecha a izquierda.

#### **Características y utilidad**:

- Utiliza el atributo `dir` para controlar la dirección del texto.
- Se puede usar en fragmentos de texto dentro de un bloque de contenido para cambiar su dirección de manera explícita.

**Ejemplo**:

En una página con texto árabe, si deseas mostrar un nombre en inglés (de izquierda a derecha), puedes utilizar `<bdo>` para cambiar la dirección solo para ese fragmento de texto:

```html
<p lang="ar">إسم المستخدم هو <bdo dir="ltr">John Doe</bdo>.</p>
```

Aquí, el texto árabe se mantiene de derecha a izquierda, pero el nombre "John Doe" se muestra de izquierda a derecha debido al uso de `<bdo dir="ltr">`.

---

### **3. Atributo `dir`**

El atributo `dir` se utiliza dentro de las etiquetas HTML para especificar la dirección del texto de un documento o de un bloque específico de texto. El valor más comúnmente utilizado es `ltr` (izquierda a derecha) y `rtl` (derecha a izquierda). Este atributo es útil cuando se desea especificar la dirección de todo un documento o de un fragmento de texto, especialmente cuando se trabaja con idiomas de diferente dirección de escritura.

#### **Valores del atributo `dir`**:

- **`dir="ltr"`**: El texto se lee de izquierda a derecha.
- **`dir="rtl"`**: El texto se lee de derecha a izquierda.

#### **Uso en la etiqueta `<html>`**:

En el caso de una página web completa escrita en un idioma de derecha a izquierda, como árabe o hebreo, se debe establecer el atributo `dir` en el elemento `<html>` para definir la dirección de todo el contenido.

**Ejemplo**:

```html
<html dir="rtl">
  <body>
    <p>هذا نص باللغة العربية.</p>
  </body>
</html>
```

Este código establece que todo el contenido dentro del documento debe leerse de derecha a izquierda, lo cual es típico para idiomas como el árabe.

---

### **Resúmenes y Comparación de `<bdi>`, `<bdo>`, y `dir`**

| Etiqueta/Elemento | Propósito                                                         | Uso principal                                                               | Ejemplo                                  |
| ----------------- | ----------------------------------------------------------------- | --------------------------------------------------------------------------- | ---------------------------------------- |
| **`<bdi>`**       | Aislar texto con dirección diferente en un flujo de texto         | Evitar que el texto afecte la dirección del contenido circundante           | `<bdi>1234</bdi>` en una página en árabe |
| **`<bdo>`**       | Sobrescribir la dirección de texto en una sección específica      | Controlar explícitamente la dirección de un fragmento de texto              | `<bdo dir="ltr">Texto en inglés</bdo>`   |
| **`dir`**         | Definir la dirección de texto de un elemento o documento completo | Especificar la dirección del texto, ya sea en un bloque o todo el documento | `<html dir="rtl">`                       |

---

### **Conclusión**

- El uso de **`<bdi>`** es esencial para manejar direcciones mixtas de texto sin que un fragmento afecte el flujo de texto general, lo que resulta útil en contextos donde se mezclan diferentes idiomas o símbolos con direcciones distintas.
- **`<bdo>`** permite sobrescribir la dirección de escritura en un bloque de texto específico, útil cuando se necesita cambiar la dirección sin afectar el resto del contenido.
- El atributo **`dir`** se usa tanto en documentos como en bloques de contenido individuales para definir la dirección general del texto, y es importante para garantizar que el contenido se renderice de manera adecuada para los usuarios de idiomas RTL y LTR.

# 12. **Microdatos y Datos Estructurados**

Los **microdatos** son una especificación de HTML que permite incrustar datos estructurados en el código HTML de una página web. Esto facilita que los motores de búsqueda y otros servicios interpreten y comprendan mejor el contenido de la página, mejorando así la visibilidad en los resultados de búsqueda y proporcionando una mejor experiencia al usuario.

El uso de microdatos en HTML se realiza mediante los atributos `itemscope`, `itemtype`, `itemprop`, entre otros. Estos atributos permiten asociar contenido con un tipo específico de información y estructurarlo de manera estandarizada.

---

### **1. `itemscope` y `itemtype`**

#### **`itemscope`**:

El atributo `itemscope` se utiliza para indicar que un conjunto de elementos dentro de una página está relacionado con un tipo de información específico. Es una declaración de que los elementos de un bloque contienen datos estructurados.

#### **`itemtype`**:

El atributo `itemtype` define el tipo de los datos estructurados a los que se hace referencia, especificando la URL del vocabulario que describe ese tipo. Comúnmente se usan vocabularios como **Schema.org**, que es una fuente estándar de tipos y propiedades de datos estructurados.

**Sintaxis básica**:

```html
<div itemscope itemtype="https://schema.org/Person">
  <!-- Contenido relacionado con una persona -->
</div>
```

#### **Ejemplo**:

En este ejemplo, el bloque de HTML está marcado como una entidad del tipo **Persona** (según el vocabulario de Schema.org):

```html
<div itemscope itemtype="https://schema.org/Person">
  <h2 itemprop="name">John Doe</h2>
  <p itemprop="jobTitle">Software Developer</p>
  <p itemprop="telephone">123-456-7890</p>
  <p itemprop="address">123 Main St, Cityville</p>
</div>
```

En este fragmento de código:

- El `itemscope` marca el bloque como una entidad de tipo **Persona**.
- El `itemprop` se usa para describir las propiedades de la persona, como su nombre, puesto de trabajo, teléfono y dirección.

---

### **2. `itemprop`**

El atributo `itemprop` se usa para asociar un valor o contenido a una propiedad específica de un tipo de datos estructurados. Este atributo se utiliza dentro de un bloque marcado por `itemscope` y `itemtype`.

#### **Ejemplo**:

Supongamos que tienes un artículo y quieres proporcionar información estructurada sobre el autor y el título utilizando microdatos:

```html
<div itemscope itemtype="https://schema.org/Article">
  <h1 itemprop="headline">How to Implement Microdata in HTML</h1>
  <p itemprop="author">Jane Doe</p>
  <p itemprop="datePublished" content="2025-01-17">January 17, 2025</p>
  <p itemprop="publisher">Tech Magazine</p>
</div>
```

En este ejemplo:

- El bloque está marcado como un artículo (`Article`) con el `itemscope` y el `itemtype`.
- `itemprop` se usa para marcar las propiedades del artículo, como el titular (`headline`), el autor (`author`), la fecha de publicación (`datePublished`), y el editor (`publisher`).

---

### **3. Beneficios de Usar Microdatos**

- **Mejora del SEO**: Los motores de búsqueda, como Google, utilizan los microdatos para comprender mejor el contenido de una página web y mejorar la indexación. Esto puede resultar en mejores posiciones en los resultados de búsqueda y en la aparición de **rich snippets** (fragmentos enriquecidos), que son resultados enriquecidos con información adicional (como valoraciones de productos, horarios de eventos, precios, etc.).
- **Estandarización**: Los microdatos proporcionan una forma estandarizada de marcar contenido, lo que facilita su interpretación por parte de máquinas y servicios de análisis de datos.

- **Mejor comprensión para máquinas**: Al usar un vocabulario como **Schema.org**, los microdatos permiten que las máquinas comprendan de manera precisa el significado de los elementos en una página, mejorando así la experiencia del usuario.

---

### **4. Ejemplo Completo con Varios Elementos**

Un ejemplo más completo de cómo usar microdatos para marcar una página con información sobre un evento podría ser el siguiente:

```html
<div itemscope itemtype="https://schema.org/Event">
  <h1 itemprop="name">Concierto de Rock</h1>
  <p itemprop="startDate" content="2025-02-25T19:30">
    25 de febrero de 2025, 19:30
  </p>
  <p itemprop="location" itemscope itemtype="https://schema.org/Place">
    <span itemprop="name">Estadio Nacional</span>,
    <span itemprop="address">Ciudad Capital, País</span>
  </p>
  <p itemprop="description">
    Un concierto de rock con las mejores bandas locales.
  </p>
</div>
```

En este caso:

- El `itemscope` con `itemtype="https://schema.org/Event"` marca el bloque como un evento.
- Dentro del evento, usamos `itemprop` para describir varias propiedades, como el nombre del evento, la fecha de inicio, la ubicación y la descripción.
- Dentro de la propiedad `location`, también estamos utilizando un **subtipo** de datos estructurados, que es `Place`, con propiedades adicionales como `name` y `address`.

---

### **Vocabulario de Schema.org**

La mayoría de los microdatos en HTML se basan en el vocabulario de **Schema.org**, que proporciona una amplia gama de tipos y propiedades de datos estructurados. Algunos de los tipos más comunes incluyen:

- **Person**: Información sobre personas (como nombre, ocupación, etc.).
- **Product**: Información sobre productos (nombre, precio, disponibilidad, etc.).
- **Event**: Información sobre eventos (nombre, fecha, ubicación, etc.).
- **Article**: Información sobre artículos de noticias, blogs, etc.
- **Recipe**: Información sobre recetas (ingredientes, tiempo de cocción, etc.).

Para consultar más tipos y propiedades, puedes visitar el sitio web de [Schema.org](https://schema.org/).

---

### **Conclusión**

Los microdatos permiten estructurar el contenido de una página web de manera que sea más fácilmente entendible por los motores de búsqueda y otras aplicaciones que procesan información en la web. Usando los atributos `itemscope`, `itemtype` y `itemprop`, puedes asociar tu contenido con tipos de datos específicos (como personas, productos, artículos, etc.) y hacer que esa información sea más accesible tanto para usuarios como para máquinas. Esto mejora la visibilidad en los motores de búsqueda y puede resultar en un mejor rendimiento SEO.

## Implementación de JSON-LD para Schema.org.

**JSON-LD (JavaScript Object Notation for Linked Data)** es una forma de representar datos estructurados en formato JSON (JavaScript Object Notation). Es una alternativa a los microdatos y RDFa (Resource Description Framework in Attributes) para describir el contenido de una página web de manera que los motores de búsqueda y otros servicios puedan procesarlo fácilmente.

JSON-LD es ampliamente utilizado para implementar **Schema.org** en sitios web, ya que permite integrar datos estructurados de manera más flexible y limpia, sin necesidad de modificar el HTML de la página.

---

### **1. ¿Por qué usar JSON-LD?**

- **Separación del contenido HTML**: A diferencia de los microdatos que se mezclan con el contenido HTML, JSON-LD está completamente separado, lo que facilita la implementación y el mantenimiento del código.
- **Flexibilidad**: JSON-LD puede ser insertado dentro de un `<script>` en el encabezado o en cualquier parte del documento, lo que lo hace fácil de integrar en la página.
- **Recomendado por Google**: JSON-LD es el formato recomendado por Google para la implementación de datos estructurados.

---

### **2. Ejemplo Básico de JSON-LD con Schema.org**

A continuación, te muestro un ejemplo básico de cómo usar JSON-LD para describir un **Artículo** según el vocabulario de Schema.org:

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Ejemplo de Artículo</title>

    <!-- JSON-LD para describir un Artículo -->
    <script type="application/ld+json">
      {
        "@context": "https://schema.org",
        "@type": "Article",
        "headline": "Cómo Implementar JSON-LD en HTML",
        "author": {
          "@type": "Person",
          "name": "Juan Pérez"
        },
        "datePublished": "2025-01-17",
        "publisher": {
          "@type": "Organization",
          "name": "Revista Web"
        },
        "description": "En este artículo aprenderás cómo utilizar JSON-LD para agregar datos estructurados en una página web."
      }
    </script>
  </head>
  <body>
    <h1>Cómo Implementar JSON-LD en HTML</h1>
    <p>
      En este artículo aprenderás cómo utilizar JSON-LD para agregar datos
      estructurados en una página web.
    </p>
    <p>Publicado por Juan Pérez el 17 de enero de 2025 en Revista Web.</p>
  </body>
</html>
```

#### **Explicación del código**:

- El bloque de **JSON-LD** está dentro de una etiqueta `<script>` con el tipo `application/ld+json`.
- Se utiliza la clave `@context` para indicar que se está usando el vocabulario de **Schema.org**.
- Se especifica el tipo de contenido con `@type`, que en este caso es un **Artículo** (`Article`).
- Dentro del objeto, se describen varias propiedades del artículo, como el **título** (`headline`), el **autor** (que es una **Persona**), la **fecha de publicación** (`datePublished`), el **editor** (que es una **Organización**), y la **descripción** (`description`).

---

### **3. Ejemplo de JSON-LD para un Producto**

Imaginemos que queremos estructurar la información de un producto para que los motores de búsqueda comprendan mejor los detalles del mismo:

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Producto - Cámara Digital</title>

    <!-- JSON-LD para describir un Producto -->
    <script type="application/ld+json">
      {
        "@context": "https://schema.org",
        "@type": "Product",
        "name": "Cámara Digital XYZ",
        "image": "https://example.com/camara-xyz.jpg",
        "description": "Cámara digital de alta resolución con 20 megapíxeles y lente de gran angular.",
        "sku": "CAM-12345",
        "offers": {
          "@type": "Offer",
          "url": "https://example.com/comprar-camara-xyz",
          "priceCurrency": "USD",
          "price": "299.99",
          "priceValidUntil": "2025-12-31",
          "itemCondition": "https://schema.org/NewCondition",
          "availability": "https://schema.org/InStock",
          "seller": {
            "@type": "Organization",
            "name": "Tienda Online"
          }
        }
      }
    </script>
  </head>
  <body>
    <h1>Cámara Digital XYZ</h1>
    <p>Precio: $299.99</p>
    <p><a href="https://example.com/comprar-camara-xyz">Comprar ahora</a></p>
  </body>
</html>
```

#### **Explicación del código**:

- Aquí estamos describiendo un **Producto** utilizando el tipo `Product` de **Schema.org**.
- Se incluyen propiedades como el **nombre** del producto, la **imagen** asociada, la **descripción**, el **SKU** (número de referencia del producto) y una oferta (`offers`).
- Dentro de la oferta, se especifican detalles como el **precio**, la **moneda**, la **fecha de validez** de la oferta, y la **condición** del producto.

---

### **4. Beneficios de JSON-LD en SEO**

- **Mejor visibilidad en los motores de búsqueda**: El uso de datos estructurados en formato JSON-LD mejora la forma en que los motores de búsqueda entienden y muestran tu contenido, lo que puede resultar en **rich snippets** (fragmentos enriquecidos) en los resultados de búsqueda, como reseñas, precios, horarios de eventos, etc.
- **Fácil integración y mantenimiento**: Al estar separado del contenido HTML, el JSON-LD permite actualizar los datos estructurados sin tener que modificar directamente el contenido visual de la página.

- **Flexibilidad**: JSON-LD es más flexible que los microdatos, ya que puede ser agregado de forma dinámica, por ejemplo, mediante JavaScript, y es menos intrusivo en el código HTML.

---

### **5. Conclusión**

La implementación de **JSON-LD** es una excelente manera de agregar datos estructurados a tus páginas web sin modificar el contenido HTML. Es una técnica altamente recomendada para mejorar la visibilidad de tu sitio web en los motores de búsqueda, especialmente cuando se trabaja con **Schema.org** para describir entidades como artículos, productos, eventos, personas, etc. Al seguir las mejores prácticas de SEO y estructurar los datos de manera efectiva, puedes mejorar la experiencia del usuario y aumentar la probabilidad de obtener fragmentos enriquecidos (rich snippets) en los resultados de búsqueda.

# 13. **Rendimiento y Optimización**

## Minificación del HTML

**Minificación del HTML** es el proceso de eliminar caracteres innecesarios del código fuente de una página web sin afectar su funcionalidad. Esto incluye espacios en blanco, saltos de línea, comentarios y otros caracteres que no son necesarios para la correcta ejecución del HTML. El propósito de la minificación es reducir el tamaño del archivo, lo que puede mejorar el rendimiento de la página, disminuir el tiempo de carga y, en general, proporcionar una mejor experiencia para el usuario.

---

### **1. ¿Por qué es importante la minificación del HTML?**

- **Reducción del tamaño del archivo**: Al eliminar caracteres innecesarios, el tamaño del archivo HTML se reduce, lo que permite que la página se cargue más rápidamente.
- **Mejora del rendimiento**: Los navegadores pueden procesar archivos más pequeños más rápido, lo que reduce el tiempo de carga de la página.
- **Optimización para dispositivos móviles**: En conexiones móviles o lentas, la minificación del HTML es especialmente útil para mejorar la velocidad de carga de las páginas.
- **Mejora en el SEO**: Aunque la minificación no tiene un impacto directo en los rankings de SEO, una página que se carga más rápido puede mejorar la experiencia del usuario, lo que indirectamente puede influir en el SEO.

---

### **2. ¿Qué se elimina durante la minificación?**

Durante el proceso de minificación del HTML, se eliminan varios tipos de caracteres innecesarios:

- **Espacios en blanco**: Se eliminan los espacios adicionales entre elementos y en el interior de las etiquetas.
- **Saltos de línea**: Se eliminan los saltos de línea innecesarios que no afectan la estructura del documento.
- **Comentarios**: Los comentarios en el código HTML se eliminan, ya que no tienen ningún impacto en la ejecución de la página.
- **Carácteres de tabulación**: Se eliminan los caracteres de tabulación que ayudan a la legibilidad del código, pero no son necesarios para el funcionamiento.

---

### **3. Ejemplo de Minificación del HTML**

#### **Código HTML original**:

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Mi página web</title>
    <!-- Esto es un comentario que se eliminaría en la minificación -->
  </head>
  <body>
    <header>
      <h1>Bienvenido a mi página web</h1>
    </header>
    <main>
      <p>Este es un ejemplo de página web optimizada.</p>
    </main>
    <footer>
      <p>Derechos reservados © 2025</p>
    </footer>
  </body>
</html>
```

#### **Código HTML después de la minificación**:

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Mi página web</title>
  </head>
  <body>
    <header><h1>Bienvenido a mi página web</h1></header>
    <main><p>Este es un ejemplo de página web optimizada.</p></main>
    <footer><p>Derechos reservados © 2025</p></footer>
  </body>
</html>
```

Como puedes ver, el HTML minificado es considerablemente más compacto, eliminando los saltos de línea, espacios innecesarios y comentarios, lo que reduce su tamaño.

---

### **4. Herramientas para Minificar HTML**

Existen diversas herramientas que te permiten minificar el código HTML de manera automática. Algunas de ellas son:

- **Online HTML Minifier**: Una herramienta en línea fácil de usar para minificar archivos HTML.

  - [Link: HTML Minifier Online](https://www.minifier.org/)

- **Terser**: Una herramienta para JavaScript y HTML que puedes utilizar para minificar ambos tipos de archivos.

  - [Link: Terser](https://terser.org/)

- **UglifyJS**: Una herramienta popular para minificar archivos JavaScript que también puede ser utilizada para archivos HTML.

- **Gulp y Webpack**: Si trabajas en un flujo de trabajo con herramientas de construcción (build), puedes integrar la minificación en el proceso de automatización utilizando plugins de Gulp o Webpack.
  - **Gulp**: Usa el plugin `gulp-htmlmin`.
  - **Webpack**: Usa el plugin `html-webpack-plugin` junto con `html-minifier`.

---

### **5. Consideraciones al Minificar HTML**

- **Compresión en servidores**: La minificación puede complementarse con la **compresión** del archivo en el servidor, utilizando algoritmos como **GZIP** o **Brotli**, para comprimir aún más el contenido antes de enviarlo al navegador.
- **Preocupaciones de depuración**: La minificación puede dificultar la depuración del código, ya que elimina la legibilidad. Por eso, es recomendable mantener una versión no minificada del HTML en el entorno de desarrollo y solo minificar el código para producción.

- **Archivos externos**: Si bien minificar el HTML es importante, también debes considerar minificar otros recursos como CSS y JavaScript para lograr una optimización completa del rendimiento de la página.

---

### **6. Conclusión**

La minificación del HTML es una práctica de optimización esencial para mejorar el rendimiento de las páginas web. Al reducir el tamaño de los archivos, se mejora la velocidad de carga y la experiencia del usuario, especialmente en dispositivos móviles y conexiones lentas. Aunque no es la única técnica de optimización, es un paso fundamental en el proceso de mejora del rendimiento web. Utilizar herramientas adecuadas y comprender cuándo y cómo aplicar la minificación te ayudará a aprovechar mejor el potencial de tus páginas web.

## Evitar Etiquetas y Prácticas Obsoletas

En el desarrollo web moderno, es crucial evitar el uso de etiquetas y prácticas obsoletas para asegurar que las páginas web sean accesibles, eficientes y compatibles con los estándares actuales. Los navegadores han evolucionado y, con ello, las mejores prácticas para el desarrollo web.

---

### **1. Etiquetas Obsoletas en HTML**

Algunas etiquetas de HTML han sido declaradas obsoletas en las versiones más recientes del lenguaje. Usar estas etiquetas puede llevar a problemas de compatibilidad con navegadores modernos, dificultando el mantenimiento y afectando la accesibilidad. Es importante evitar su uso y optar por soluciones más actuales.

#### **Ejemplos de etiquetas obsoletas**:

- **`<font>`**: Esta etiqueta se usaba para definir el tipo, tamaño y color de la fuente. Hoy en día, se utiliza **CSS** para controlar el estilo del texto.

  **Obsoleto:**

  ```html
  <font size="3" color="blue">Texto con fuente antigua</font>
  ```

  **Alternativa:**

  ```html
  <span style="font-size: 16px; color: blue;">Texto con fuente moderna</span>
  ```

- **`<center>`**: Esta etiqueta se usaba para centrar el contenido. Ahora se hace con **CSS** usando la propiedad `text-align: center` o `display: flex` para centrar elementos.

  **Obsoleto:**

  ```html
  <center>Texto centrado</center>
  ```

  **Alternativa:**

  ```html
  <div style="text-align: center;">Texto centrado</div>
  ```

- **`<big>` y `<small>`**: Se usaban para cambiar el tamaño del texto. Ahora, se recomienda usar **CSS** para el control del tamaño del texto.

  **Obsoleto:**

  ```html
  <big>Texto grande</big>
  ```

  **Alternativa:**

  ```html
  <span style="font-size: larger;">Texto grande</span>
  ```

- **`<u>`**: Originalmente, esta etiqueta subrayaba el texto. Se prefiere el uso de **CSS** para los estilos.

  **Obsoleto:**

  ```html
  <u>Texto subrayado</u>
  ```

  **Alternativa:**

  ```html
  <span style="text-decoration: underline;">Texto subrayado</span>
  ```

---

## Mejores Prácticas para Cargar Recursos Externos (`async`, `defer` en Scripts)

Cuando cargas recursos externos como **scripts de JavaScript** en una página web, la forma en que los cargas puede afectar significativamente el rendimiento de la página. Las etiquetas `async` y `defer` son dos atributos importantes para optimizar la carga de scripts sin bloquear el procesamiento del HTML.

#### **`async` (Asynchronous)**

El atributo `async` se utiliza para cargar un script de manera **asíncrona**, lo que significa que el navegador puede seguir procesando el HTML mientras descarga el archivo JavaScript. Esto es útil cuando no hay dependencias entre los scripts o entre el script y el contenido HTML.

- **¿Cuándo usar `async`?**
  - Cuando el script no depende de otros scripts.
  - Cuando el script no modifica el contenido HTML antes de su ejecución.

**Ejemplo:**

```html
<script src="script.js" async></script>
```

- **Ventajas:**

  - No bloquea el renderizado de la página.
  - La carga de los scripts no interrumpe el procesamiento de la página HTML.

- **Desventajas:**
  - Los scripts pueden ejecutarse en cualquier orden, lo que puede ser un problema si uno depende de otro.

#### **`defer` (Deferred)**

El atributo `defer` asegura que el script se descargue de forma asíncrona, pero no se ejecutará hasta que el documento HTML esté completamente cargado. Esto es ideal cuando los scripts dependen del contenido HTML y es necesario que el DOM esté listo antes de ejecutarlos.

- **¿Cuándo usar `defer`?**
  - Cuando el script depende del contenido HTML (por ejemplo, manipulación del DOM).
  - Cuando el orden de ejecución de los scripts es importante (por ejemplo, cuando un script depende de otro).

**Ejemplo:**

```html
<script src="script.js" defer></script>
```

- **Ventajas:**

  - Los scripts se ejecutan solo después de que el HTML esté completamente cargado.
  - Garantiza que los scripts se ejecuten en el orden en que se incluyen en el HTML.

- **Desventajas:**
  - Los scripts no se ejecutan hasta que el HTML se haya completado, lo que podría retrasar su ejecución si hay contenido dinámico.

#### **Comparación entre `async` y `defer`**

| Característica               | `async`                             | `defer`                                                   |
| ---------------------------- | ----------------------------------- | --------------------------------------------------------- |
| Orden de ejecución           | No garantiza el orden de ejecución. | Mantiene el orden en que se cargan.                       |
| Ejecución de los scripts     | Tan pronto como se descargan.       | Después de que el documento HTML se haya parseado.        |
| Dependencia de otros scripts | No debe depender de otros scripts.  | Puede depender de otros scripts.                          |
| Uso recomendado              | Scripts independientes.             | Scripts que manipulan el DOM o dependen de otros scripts. |

---

### **3. Buenas Prácticas al Usar `async` y `defer`**

- **Usar `defer` para scripts que manipulan el DOM**: Es recomendable usar `defer` en scripts que necesiten interactuar con el contenido HTML, ya que garantiza que el DOM estará completamente cargado antes de ejecutar el script.
- **Usar `async` para scripts independientes**: Si un script no depende de otros scripts ni del contenido HTML, usar `async` puede ser más eficiente, ya que se descarga sin bloquear el procesamiento del HTML.

- **No usar `async` y `defer` en el mismo script**: No debes usar ambos atributos en el mismo `<script>`, ya que se anulan entre sí. Si un script es independiente y no requiere acceso al DOM, usa `async`, y si depende del DOM, usa `defer`.

- **Cargar scripts al final del documento**: Si no puedes usar `async` o `defer`, otra buena práctica es incluir los scripts al final del archivo HTML (antes de `</body>`), lo que permite que el contenido de la página se cargue primero.

---

### **4. Conclusión**

Evitar el uso de etiquetas obsoletas y adoptar mejores prácticas de carga de recursos, como `async` y `defer`, son pasos importantes para mejorar la compatibilidad, el rendimiento y la accesibilidad de tus páginas web. Usar estas herramientas correctamente puede hacer que tus sitios web se carguen más rápido y funcionen mejor en una amplia variedad de dispositivos y navegadores.

# 14. **Pruebas y Validación**

Es fundamental asegurarse de que el código HTML de una página web cumpla con los estándares de calidad y accesibilidad. Para esto, existen herramientas y técnicas que te permiten validar y depurar el código HTML, asegurando que el sitio web sea funcional, accesible y compatible con todos los navegadores.

---

### **1. Uso de Herramientas de Validación: W3C Validator**

El **W3C Validator** es una herramienta en línea proporcionada por el World Wide Web Consortium (W3C) que permite validar el código HTML de una página web. Esta herramienta verifica que el código cumpla con los estándares y especificaciones oficiales de HTML, y ayuda a detectar errores, advertencias y buenas prácticas.

#### **Cómo usar el W3C Validator**:

1. **Accede al W3C Validator**: Dirígete al sitio oficial del validador en [https://validator.w3.org/](https://validator.w3.org/).
2. **Introduce la URL o carga el archivo HTML**: Puedes validar tu página web proporcionando la URL de la página, subiendo el archivo HTML desde tu computadora o pegando el código HTML directamente en el formulario.
3. **Revisa los resultados**: El validador te dará un informe detallado que incluye:
   - **Errores**: Problemas críticos que deben corregirse para que el HTML sea válido.
   - **Advertencias**: Sugerencias para mejorar el código, aunque no son estrictamente necesarias.
   - **Recomendaciones**: Buenas prácticas y estándares recomendados.

#### **Beneficios de Usar el W3C Validator**:

- **Cumplimiento de estándares**: Ayuda a garantizar que el código cumpla con las especificaciones y estándares del W3C.
- **Mejora la accesibilidad y compatibilidad**: Al corregir errores y advertencias, el sitio web será más accesible y funcionará correctamente en diversos navegadores y dispositivos.
- **Depuración rápida**: Permite identificar rápidamente problemas de sintaxis y estructura en el código HTML.

#### **Ejemplo**:

Si tu HTML contiene un error como una etiqueta mal cerrada o una propiedad no soportada, el validador te lo indicará y proporcionará detalles sobre cómo corregirlo.

---

### **2. Depuración de HTML con DevTools**

Las **Herramientas de Desarrollo (DevTools)** son un conjunto de herramientas integradas en la mayoría de los navegadores web modernos (como Google Chrome, Firefox, Edge) que permiten depurar, inspeccionar y modificar el código HTML de una página web en tiempo real.

#### **Cómo usar DevTools para depurar HTML**:

1. **Accede a DevTools**:

   - En Google Chrome o en la mayoría de los navegadores, haz clic derecho en cualquier parte de la página web y selecciona **Inspeccionar** o presiona **F12**.
   - También puedes abrir DevTools desde el menú de opciones del navegador: **Más herramientas > Herramientas para desarrolladores**.

2. **Inspeccionar el HTML**:

   - Dentro de DevTools, selecciona la pestaña **Elements** (Elementos). Aquí verás el HTML actual de la página.
   - Puedes hacer clic en cualquier etiqueta HTML para ver su estructura y, si lo deseas, modificarla en tiempo real para probar cambios.

3. **Depuración en tiempo real**:

   - Si el HTML no se está mostrando como esperabas o hay problemas de diseño, puedes inspeccionar las propiedades CSS o el DOM en tiempo real.
   - Si hay errores en el HTML (como etiquetas no cerradas o mal formadas), DevTools lo marcará y te permitirá solucionarlos directamente.

4. **Ver errores en la consola**:
   - La pestaña **Console** (Consola) muestra errores de JavaScript, advertencias de acceso o problemas de carga de recursos. Si hay errores de HTML o problemas con el CSS, se mostrarán aquí.
   - También puedes escribir comandos JavaScript para interactuar con el DOM o realizar pruebas rápidas.

#### **Beneficios de Usar DevTools**:

- **Depuración en vivo**: Modificar el HTML y CSS directamente en el navegador te permite ver los cambios instantáneamente sin necesidad de recargar la página.
- **Ver errores de rendimiento y accesibilidad**: DevTools puede ayudarte a identificar problemas de accesibilidad, como elementos con etiquetas faltantes, o problemas de rendimiento, como recursos no cargados correctamente.
- **Pruebas rápidas**: Puedes probar cambios de forma rápida sin tener que realizar actualizaciones constantes en tu archivo HTML.

---

### **3. Buenas Prácticas en Pruebas y Validación de HTML**

- **Validación regular**: Es recomendable validar el HTML de manera periódica durante el desarrollo para evitar la acumulación de errores.
- **Revisar los errores críticos**: Presta atención a los errores que son marcados como críticos en el W3C Validator. Estos problemas pueden afectar la accesibilidad, la compatibilidad y el rendimiento del sitio.
- **Usar DevTools para pruebas de interfaz**: DevTools es útil no solo para depurar el HTML, sino también para probar cómo se ve y se comporta tu página en diferentes tamaños de pantalla (responsividad) y dispositivos.
- **Probar accesibilidad**: Asegúrate de que tu página sea accesible utilizando herramientas como **Lighthouse** (integrada en DevTools), que evalúa aspectos de accesibilidad, rendimiento, SEO y mejores prácticas.

---

### **4. Conclusión**

El uso de herramientas de validación como el **W3C Validator** y la depuración en vivo con **DevTools** son dos enfoques esenciales para garantizar que tu código HTML sea limpio, válido y accesible. Estas herramientas no solo ayudan a detectar errores y advertencias, sino que también mejoran la compatibilidad del sitio con diferentes dispositivos y navegadores, lo que resulta en una experiencia de usuario más fluida y confiable.

# 15. **Buenas Prácticas**

Seguir buenas prácticas al escribir código HTML no solo mejora la legibilidad y el mantenimiento del código, sino que también ayuda a la colaboración con otros desarrolladores, facilita la depuración y asegura que el sitio sea accesible y fácil de entender para todos los involucrados en el desarrollo.

---

### **1. Organización y Legibilidad del Código**

La organización y la legibilidad del código son aspectos clave para facilitar la comprensión, la edición y la depuración de un proyecto, tanto para ti como para otros desarrolladores que puedan trabajar en el código en el futuro.

#### **Consejos para mejorar la organización y legibilidad**:

- **Indentar correctamente**: Usar indentación coherente (generalmente 2 o 4 espacios) para organizar las jerarquías de etiquetas dentro del HTML. Esto hace que el código sea más fácil de leer y entender.

  Ejemplo:

  ```html
  <html>
    <head>
      <title>Mi Página Web</title>
    </head>
    <body>
      <header>
        <h1>Bienvenidos a mi página</h1>
      </header>
      <main>
        <p>Este es el contenido principal de la página.</p>
      </main>
    </body>
  </html>
  ```

- **Separar bloques de código**: Organizar el código en bloques lógicos (por ejemplo, encabezado, cuerpo, pie de página) y dejar líneas en blanco entre secciones puede hacer que el código sea más fácil de leer.

  Ejemplo:

  ```html
  <header>
    <!-- Aquí va el menú de navegación -->
  </header>

  <main>
    <!-- Contenido principal de la página -->
  </main>

  <footer>
    <!-- Información de pie de página -->
  </footer>
  ```

- **Evitar código innecesario o redundante**: Elimina cualquier código HTML que no sea necesario. Esto no solo hace que el archivo sea más limpio, sino que también ayuda a mejorar el rendimiento de la página.

---

### **2. Comentarios Claros y Útiles**

Los comentarios en el código son esenciales para explicar el propósito de ciertas secciones, mejorar la colaboración con otros desarrolladores y ayudar a entender la lógica del código. Es importante ser claro y conciso al escribir los comentarios.

#### **Cómo escribir comentarios útiles**:

- Usa los comentarios para describir bloques de código complejos o que no sean fáciles de entender a simple vista.

  Ejemplo:

  ```html
  <!-- Sección de navegación principal -->
  <nav>
    <!-- Enlaces de navegación -->
    <ul>
      <li><a href="#">Inicio</a></li>
      <li><a href="#">Servicios</a></li>
    </ul>
  </nav>
  ```

- **No exageres con los comentarios**: Evita comentar cada línea de código, ya que esto puede hacer que el código se vea sobrecargado y difícil de leer. Los comentarios deben ser útiles y no redundantes.

- **No dejes comentarios obsoletos**: Asegúrate de actualizar o eliminar los comentarios cuando se cambien partes del código que mencionan. Los comentarios desactualizados pueden ser más confusos que útiles.

  Ejemplo de un comentario desactualizado:

  ```html
  <!-- Este es el antiguo menú de navegación (ya no se usa) -->
  ```

---

### **3. Convenciones para Nombres de `id` y `class`**

Los nombres de `id` y `class` son cruciales para la organización y el estilo de un documento HTML. Al seguir ciertas convenciones, garantizas que el código sea consistente, fácil de entender y mantenible.

#### **Buenas prácticas para nombrar `id` y `class`**:

- **Usar nombres descriptivos**: Los nombres de `id` y `class` deben ser lo más descriptivos posible para reflejar su propósito. Un buen nombre ayuda a entender la función de un elemento en el contexto de la página.

  Ejemplo:

  ```html
  <div id="contact-form">
    <form>...</form>
  </div>
  ```

- **Utilizar notación en minúsculas y guiones**: Para mantener la coherencia y facilitar la legibilidad, se recomienda usar minúsculas y separar las palabras con guiones (`-`), especialmente en los nombres de las clases. Esto también mejora la compatibilidad con CSS.

  Ejemplo:

  ```html
  <div class="main-header">
    <h1>Bienvenido</h1>
  </div>
  ```

- **Evitar el uso de nombres genéricos**: No uses nombres genéricos como `box`, `container` o `item` para `id` y `class`. En su lugar, intenta ser más específico acerca de su propósito.

  Ejemplo (incorrecto):

  ```html
  <div id="box">...</div>
  ```

  Ejemplo (correcto):

  ```html
  <div id="user-profile-box">...</div>
  ```

- **Nombres de `id` deben ser únicos**: Los `id` deben ser únicos dentro de una página, ya que se utilizan para identificar elementos específicos. Asegúrate de no repetir el mismo `id` en diferentes partes del HTML.

- **Uso de prefijos para clases**: Para organizar mejor las clases, especialmente en proyectos grandes, puedes usar un prefijo que identifique el componente o módulo. Esto es comúnmente usado en metodologías como **BEM** (Block Element Modifier).

  Ejemplo de BEM:

  ```html
  <div class="menu__item">Inicio</div>
  <div class="menu__item">Servicios</div>
  ```

### Explicación

BEM es una metodología de nomenclatura para CSS que tiene como objetivo hacer que las clases sean más claras y predecibles, especialmente en proyectos grandes donde muchos elementos tienen clases similares.

La idea principal detrás de BEM es dividir las clases en tres partes fundamentales:

- **Block** (Bloque): El componente principal o contenedor.
- **Element** (Elemento): Parte de un bloque que depende del bloque para existir.
- **Modifier** (Modificador): Variaciones o estados del bloque o del elemento.

#### **Estructura de BEM**:

1. **Block**: El bloque representa el componente principal, por ejemplo, un contenedor o una sección de la página.
2. **Element**: El elemento es una parte del bloque, una sub-sección que no tiene sentido fuera del bloque.
3. **Modifier**: El modificador representa una variación del bloque o del elemento, como un cambio de estilo o comportamiento.

#### **Sintaxis de BEM**:

- **Bloque**: `block`
- **Elemento**: `block__element`
- **Modificador**: `block__element--modifier`

---

### **Ejemplo en la práctica**:

Supón que estás creando un componente de **menú**:

1. **Block** (bloque principal): `menu` (representa el contenedor del menú completo).
2. **Element** (elemento dentro del menú): `menu__item` (representa un ítem dentro del menú).
3. **Modifier** (modificador de un elemento): `menu__item--active` (representa un ítem que está activo o seleccionado).

#### **Código HTML**:

```html
<div class="menu">
  <ul class="menu__list">
    <li class="menu__item menu__item--active">Inicio</li>
    <li class="menu__item">Servicios</li>
    <li class="menu__item">Contacto</li>
  </ul>
</div>
```

#### **Explicación**:

- `menu`: Es el **bloque** que representa el menú completo.
- `menu__list`: Es un **elemento** dentro del bloque `menu`, específicamente la lista de ítems del menú.
- `menu__item`: Es un **elemento** dentro de la lista.
- `menu__item--active`: Es un **modificador** que indica que este ítem está activo o seleccionado.

---

### **Ventajas de usar BEM y prefijos en las clases**:

- **Clarity**: Las clases son más claras y autodescriptivas. Puedes entender fácilmente qué es lo que representa cada clase.
- **Reusabilidad**: Puedes reutilizar bloques y elementos sin que sus estilos se afecten entre sí.
- **Evita conflictos**: Al usar prefijos específicos, como `menu__item`, reduces el riesgo de que las clases se sobreescriban o entren en conflicto con otras partes del código.
- **Escalabilidad**: En proyectos grandes, BEM ayuda a mantener el código organizado a medida que el proyecto crece, especialmente cuando tienes muchos elementos que comparten el mismo estilo base pero con ligeras diferencias.

---

### **Conclusión**

Seguir buenas prácticas en la organización y legibilidad del código HTML, el uso de comentarios claros y útiles, y aplicar convenciones coherentes para los nombres de `id` y `class` son pasos clave para crear un código limpio, fácil de mantener y entender. Estas prácticas también ayudan a mejorar la accesibilidad y el rendimiento, y permiten una colaboración más eficiente entre equipos de desarrollo.
