# CSS

¡Bienvenido/a a esta sección avanzada de CSS! 🎨 Aquí profundizaremos en los fundamentos y las propiedades clave de **CSS**, cubriendo desde lo más básico hasta técnicas avanzadas de diseño y optimización.

<p align="center">  
  <img src="https://media.giphy.com/media/ZY3W96Mvat8EFTCclA/giphy.gif?cid=ecf05e47v3s5hrecx6ipd2m75t5newi7s8zv9unuuoi57g3t&ep=v1_gifs_search&rid=giphy.gif&ct=g">  
</p>

---

## 1. Introducción a CSS

### ¿Qué es CSS y para qué se usa?

- Explicación sobre el propósito de CSS en el diseño web.
- Diferencia entre estructura (HTML) y presentación (CSS).

### Tipos de CSS

- **Inline**: Uso del atributo `style=""` en los elementos.
- **Interno**: Definición de estilos dentro del `<style>`.
- **Externo**: Enlace a un archivo externo con `<link>`.

### Sintaxis básica

- Estructura: Selectores, propiedades y valores.

---

## 2. Selectores Básicos

### Selectores simples

- Uso de `element`, `.class`, `#id`.

### Combinadores

- **Descendiente**: `div p`.
- **Hijo directo**: `div > p`.
- **Hermanos**: `div + p`, `div ~ p`.

### Selectores de atributos

- Sintaxis: `[attr]`, `[attr=value]`, `[attr^=value]`, `[attr$=value]`.

---

## 3. Box Model

### Concepto del modelo de caja

- Explicación detallada del `box-sizing` y su impacto en el diseño.

### Propiedades

- **Margin**, **Padding**, **Border**, **Width**, **Height**: Cómo afectan el layout.

### `box-sizing`

- Diferencia entre `content-box` y `border-box`.

---

## 4. Colores y Fondos

### Colores

- Definición de colores: Nombres (`red`), hexadecimales (`#ff0000`), RGB, HSL.
- Transparencia: `rgba`, `hsla`, `opacity`.

### Fondos

- Propiedades: `background-color`, `background-image`, `background-size`, `background-position`, `background-repeat`.
- Gradientes: `linear-gradient`, `radial-gradient`.

---

## 5. Texto y Tipografía

### Propiedades de texto

- `color`, `font-size`, `font-weight`, `font-style`, `line-height`, `text-align`.
- Espaciado: `letter-spacing`, `word-spacing`.

### Familias tipográficas

- Uso de `font-family` y fuentes externas con `@font-face` o Google Fonts.

---

## 6. Posicionamiento

### Propiedad `position`

- Valores: `static`, `relative`, `absolute`, `fixed`, `sticky`.

### Propiedades relacionadas

- **top**, **right**, **bottom**, **left**, **z-index**: Controlando la posición.

---

## 7. Diseño con Flexbox

### Concepto

- Definición de ejes principal y cruzado.

### Propiedades

- **Contenedor**: `display: flex`, `justify-content`, `align-items`, `align-content`, `flex-wrap`, `gap`.
- **Ítems**: `order`, `flex-grow`, `flex-shrink`, `align-self`.

---

## 8. Diseño con Grid

### Conceptos básicos

- Líneas, áreas y celdas en el modelo de cuadrícula.

### Propiedades del contenedor

- `display: grid`, `grid-template-rows`, `grid-template-columns`, `gap`, `grid-area`.

### Colocación de ítems

- Propiedades: `grid-column`, `grid-row`.

---

## 9. Diseño Responsivo

### Media queries

- Sintaxis de `@media`.
- Breakpoints comunes para dispositivos móviles, tabletas y escritorios.

### Unidades relativas y absolutas

- Diferencia entre `px`, `%`, `em`, `rem`, `vh`, `vw`, `fr`.

### Diseño fluido

- Uso de propiedades como `max-width`, `min-width`, `clamp()`.

---

## 10. Animaciones y Transiciones

### Transiciones

- Propiedades: `transition`, `transition-duration`, `transition-timing-function`.

### Animaciones

- Uso de `@keyframes` y propiedades como `animation-name`, `animation-duration`, `animation-iteration-count`, `animation-delay`.

---

## 11. Selectores Avanzados y Pseudo-Clases

### Selectores avanzados

- Uso de `:not`, `:is`, `:where`.

### Pseudo-clases y pseudo-elementos

- **Pseudo-clases**: `:hover`, `:focus`, `:nth-child`, `:first-of-type`.
- **Pseudo-elementos**: `::before`, `::after`, `::placeholder`.

---

## 12. Variables y Funciones CSS

### Variables CSS

- Uso de `--variable` y `var()`.

### Funciones útiles

- `calc()`, `min()`, `max()`, `clamp()`.

---

## 13. Accesibilidad Visual

### Contraste de colores

- Mejores prácticas de accesibilidad según WCAG.

### Propiedades de navegación

- Uso de `outline` para facilitar la navegación por teclado.

---

## 14. Manipulación Visual

### Transformaciones

- Propiedades: `transform`: `translate`, `rotate`, `scale`.

### Filtros

- Propiedad `filter`: `blur`, `brightness`, `contrast`, etc.

### Recortes

- Uso de `clip-path` para crear formas.

---

## 15. Preprocesadores CSS

### Introducción a SASS

- Características: Nesting, variables, mixins, `@extend`, `@import`.

### Introducción a LESS

- Variables, mixins y funciones en LESS.

---

## 16. Metodologías CSS

### BEM (Block-Element-Modifier)

- Uso de la metodología BEM para crear clases más legibles y reutilizables.

### SMACSS y ITCSS

- Metodologías para proyectos grandes y escalables.

---

## 17. Compatibilidad y Propiedades Experimentales

### Herramientas útiles

- Uso de [Can I Use](https://caniuse.com/) para verificar compatibilidad.
- Prefijos de navegador y `@supports` para propiedades experimentales.

---

## 18. Performance en CSS

### Optimización de animaciones

- Preferir `transform` y `opacity` en lugar de `width`, `height` para mejores resultados.

### Minimización de reflujo y repintado

- Mejores prácticas para evitar estos problemas de rendimiento.

### Minificación de CSS

- Uso de herramientas para optimizar el tamaño de archivos CSS.

---

## 19. Depuración y Testing

### Uso de DevTools

- Cómo depurar tu CSS con las herramientas de desarrollo de los navegadores.

### Validación de CSS

- Herramientas externas para validar y mejorar tu CSS.

---

¡Disfrutá de este recorrido y lleva tus habilidades de diseño web a un nivel avanzado! 🚀
