# GitHub

### **¿Qué es GitHub?**

#### **Definición básica**

GitHub es una plataforma basada en la nube que permite a desarrolladores gestionar, almacenar y colaborar en proyectos de código utilizando Git como sistema de control de versiones. Es ampliamente utilizado para:

- **Control de versiones:** Hacer seguimiento de los cambios en el código.
- **Colaboración:** Facilitar el trabajo en equipo en proyectos de desarrollo.
- **Despliegue:** Automatizar la entrega de aplicaciones mediante integraciones como CI/CD.

#### **Características principales**

1. **Repositorio:** Es como una carpeta donde se almacena el código y su historial de cambios.
2. **Colaboración:** Funcionalidades como pull requests y revisiones de código.
3. **Integración con herramientas:** GitHub Actions, Pages, y gestión de Issues.
4. **Visibilidad:** Permite crear repositorios públicos (accesibles para todos) o privados (solo accesibles por el equipo).

#### **Beneficios principales**

- Facilita el trabajo remoto.
- Mantiene un registro detallado del progreso del proyecto.
- Promueve prácticas modernas como CI/CD y DevOps.

### **Creación y configuración de repositorios en GitHub**

Un repositorio (o "repo") es donde se almacena todo el código, historial de cambios y otros recursos relacionados con un proyecto.

#### **1. Creación de un repositorio**

1. **Iniciar sesión en GitHub:**

   - Accedé a [GitHub](https://github.com) e iniciá sesión en tu cuenta.

2. **Crear un nuevo repositorio:**
   - Hacé clic en el botón verde **"New"** en la esquina superior derecha o navegá a la pestaña "Repositories" en tu perfil y seleccioná **"New"**.
   - Completá los campos:
     - **Repository name:** Nombre del proyecto.
     - **Description (opcional):** Breve descripción del repositorio.
     - **Visibility:** Elegí entre público (visible para todos) o privado (visible solo para colaboradores autorizados).
   - Opcionales:
     - **Initialize this repository with:**
       - **README.md:** Archivo que describe el propósito del repositorio.
       - **.gitignore:** Define qué archivos o carpetas no se incluirán en el repositorio.
       - **License:** Seleccioná una licencia para definir el uso del proyecto.
   - Finalmente, clic en **"Create repository"**.

---

#### **2. Configuración inicial**

- **Clonar el repositorio (opcional):** Para empezar a trabajar localmente:

  ```bash
  git clone <URL_del_repositorio>
  ```

  La URL se encuentra en la opción **"Code"** del repositorio.

- **Agregar colaboradores (si es privado):**

  1.  En el repositorio, dirigite a **Settings > Collaborators and teams**.
  2.  Agregá a otros usuarios por su nombre de usuario o correo electrónico.

- **Habilitar Issues (si no están activos):**
  - Ve a **Settings > Features** y asegurate de que la casilla de **Issues** esté marcada.

### **Clonación de repositorios (`git clone`)**

La clonación de un repositorio te permite descargar una copia completa de un proyecto desde GitHub a tu máquina local. Esto es útil para trabajar localmente y sincronizar cambios con el repositorio remoto.

---

#### **1. ¿Qué es clonar un repositorio?**

- Es copiar el repositorio remoto (almacenado en GitHub) a tu máquina local.
- Se descarga todo el historial de cambios, ramas y archivos.

---

#### **2. Cómo clonar un repositorio**

1. **Obtener la URL del repositorio:**

   - En el repositorio de GitHub, hacé clic en el botón verde **"Code"**.
   - Elegí la opción que prefieras:
     - **HTTPS:** Es la más común. Ejemplo:
       ```
       https://github.com/usuario/repositorio.git
       ```
     - **SSH:** Requiere configurar claves SSH previamente.
     - **GitHub CLI:** Si usás GitHub CLI.

2. **Ejecutar el comando de clonación:**

   - Abre una terminal o consola y ejecutá:
     ```bash
     git clone <URL_del_repositorio>
     ```
   - Ejemplo:
     ```bash
     git clone https://github.com/usuario/repositorio.git
     ```

3. **Acceder al repositorio clonado:**
   - Luego de clonar, ingresá al directorio del repositorio:
     ```bash
     cd repositorio
     ```

---

#### **3. Configuración post-clonación**

Después de clonar un repositorio, podés:

- **Crear nuevas ramas:**
  ```bash
  git branch nombre_de_rama
  git checkout nombre_de_rama
  ```
- **Sincronizar con el repositorio remoto:**
  ```bash
  git pull
  ```

---

#### **Nota sobre SSH:**

Si querés usar la opción de SSH para clonar:

1. Configurá tu clave SSH siguiendo [esta guía de GitHub](https://docs.github.com/es/authentication/connecting-to-github-with-ssh).
2. Usá la URL de SSH:
   ```bash
   git clone git@github.com:usuario/repositorio.git
   ```

### **Pull Requests y revisión de código**

Un **Pull Request (PR)** es una característica clave de GitHub que permite proponer cambios en un proyecto. Es especialmente útil para la colaboración, ya que facilita la revisión y discusión de los cambios antes de integrarlos al código principal.

---

#### **1. ¿Qué es un Pull Request?**

- Es una solicitud para que tus cambios (en una rama) sean revisados e integrados en otra rama, generalmente la rama principal (`main` o `master`).
- Incluye un resumen de los cambios realizados y puede contener discusiones, revisiones y comentarios.

---

#### **2. Proceso para crear un Pull Request**

1. **Realizar cambios en una rama:**

   - Crear una rama para trabajar:
     ```bash
     git checkout -b nombre_rama
     ```
   - Hacer cambios, agregarlos y confirmarlos:
     ```bash
     git add .
     git commit -m "Descripción de los cambios"
     ```
   - Subir la rama al repositorio remoto:
     ```bash
     git push origin nombre_rama
     ```

2. **Crear el Pull Request en GitHub:**
   - En GitHub, aparecerá un botón **"Compare & pull request"** después de subir tu rama. Si no, navegá a la pestaña **"Pull Requests"** y hacé clic en **"New pull request"**.
   - Seleccioná las ramas:
     - **Base branch:** Donde querés integrar los cambios (ej. `main`).
     - **Compare branch:** Tu rama con los cambios.
   - Escribí un título y una descripción para explicar los cambios.
   - Hacé clic en **"Create pull request"**.

---

#### **3. Revisión y aprobación de Pull Requests**

1. **Revisión de código:**

   - Los colaboradores del proyecto pueden:
     - Comentar líneas específicas del código.
     - Solicitar cambios adicionales.
     - Aprobar el PR si están conformes.

2. **Resolución de conflictos:**

   - Si hay conflictos (cuando los cambios en la rama base y en la rama del PR son incompatibles), GitHub lo indicará.
   - Podés resolverlos directamente en la interfaz de GitHub o localmente:
     ```bash
     git merge base_branch
     git resolve <archivo>
     git add archivo
     git commit
     git push
     ```

3. **Hacer merge del Pull Request:**
   - Una vez aprobado, el PR se puede fusionar a la rama base:
     - **Merge commit:** Agrega un commit de fusión.
     - **Squash and merge:** Combina los commits en uno solo.
     - **Rebase and merge:** Reescribe el historial de commits.

---

#### **Ventajas del Pull Request:**

- Fomenta la revisión colaborativa.
- Previene errores antes de integrar cambios importantes.
- Facilita la documentación del historial de cambios.

### **Branch Protection Rules (Reglas de protección de ramas)**

Las **Branch Protection Rules** en GitHub son configuraciones que protegen ramas importantes del repositorio (como `main` o `master`) para evitar cambios accidentales o no revisados. Estas reglas aseguran un flujo de trabajo seguro y estructurado, especialmente en equipos de desarrollo.

---

#### **1. ¿Qué son las reglas de protección de ramas?**

- Son restricciones aplicadas a ramas específicas.
- Garantizan que los cambios sean revisados, probados y aprobados antes de fusionarse.
- Evitan eliminaciones o modificaciones accidentales de ramas críticas.

---

#### **2. Configuración de reglas de protección de ramas**

1. **Acceder a la configuración del repositorio:**

   - Ve al repositorio en GitHub.
   - Hacé clic en la pestaña **Settings**.

2. **Configurar reglas para una rama:**

   - Desplazate a la sección **Branches**.
   - En el apartado **Branch protection rules**, hacé clic en **Add rule**.
   - Especificá el nombre o patrón de la rama que querés proteger (por ejemplo, `main`).

3. **Opciones comunes de protección:**

   - **Require a pull request before merging:**
     - Obliga a que los cambios se integren mediante Pull Requests en lugar de commits directos.
   - **Require approvals:**
     - Define cuántas aprobaciones de revisores son necesarias antes de fusionar un PR.
   - **Require status checks to pass before merging:**
     - Asegura que las pruebas automatizadas (CI/CD) se completen exitosamente antes de aceptar cambios.
   - **Restrict who can push to matching branches:**
     - Restringe quién puede hacer cambios directos en la rama.
   - **Require signed commits:**
     - Obliga a que los commits estén firmados con una clave GPG válida.

4. **Guardar la regla:**
   - Una vez configuradas las opciones, hacé clic en **Create** o **Save changes**.

---

#### **3. Beneficios clave**

- Mejora la calidad del código al requerir revisiones.
- Evita problemas de integridad en el código al forzar pruebas exitosas antes del merge.
- Protege ramas críticas de eliminaciones o sobrescrituras accidentales.

---

#### **Ejemplo práctico:**

Imaginemos que protegés la rama `main` y configurás las siguientes reglas:

- Requerir 1 aprobación en PR.
- Requerir que las pruebas de CI pasen.
- Restringir los pushes directos.

En este caso:

1. Los desarrolladores deben crear una rama, proponer un PR y esperar la revisión.
2. Los cambios solo se integrarán si las pruebas automatizadas son exitosas y un revisor aprueba el PR.

### **Uso de Issues para gestión de tareas**

Los **Issues** en GitHub son herramientas para reportar problemas, sugerir mejoras y gestionar tareas relacionadas con un proyecto. Son esenciales para mantener la organización y la colaboración en equipos de desarrollo.

---

#### **1. ¿Qué es un Issue?**

- Un **Issue** es un ticket o registro que detalla:
  - Un problema en el código.
  - Una solicitud de nueva funcionalidad.
  - Una tarea pendiente o discusión general.

---

#### **2. Cómo crear un Issue**

1. **Acceder al repositorio:**

   - Ingresá al repositorio donde querés crear el Issue.

2. **Abrir la pestaña de Issues:**

   - Hacé clic en **Issues** en la barra de navegación del repositorio.

3. **Crear un nuevo Issue:**

   - Hacé clic en **"New Issue"**.
   - Completá los campos:
     - **Título:** Un resumen breve del problema o tarea.
     - **Descripción:** Detallá el contexto, pasos para reproducir un problema, capturas de pantalla, etc.
   - (Opcional) **Asignar responsables:** Asigná el Issue a colaboradores específicos.
   - (Opcional) **Etiquetas (Labels):** Agregá etiquetas para clasificar el Issue (ej. `bug`, `enhancement`, `documentation`).

4. **Publicar el Issue:**
   - Hacé clic en **"Submit new issue"**.

---

#### **3. Características avanzadas**

- **Discusión y colaboración:**

  - Los colaboradores pueden comentar en el Issue para discutir posibles soluciones.
  - Se pueden mencionar usuarios con `@usuario` para asignarles o involucrarlos en la conversación.

- **Cierre automático de Issues:**

  - Si el Issue está relacionado con un Pull Request, podés cerrarlo automáticamente al fusionar el PR usando palabras clave en el mensaje del commit o PR, como:
    ```text
    Fixes #123
    Closes #456
    ```

- **Uso de templates:**
  - Podés definir plantillas para que todos los Issues sigan un formato estándar. Esto se configura creando un archivo en `.github/ISSUE_TEMPLATE/`.

---

#### **4. Ventajas del uso de Issues**

- Centralizan la gestión de tareas y problemas.
- Fomentan la comunicación dentro del equipo.
- Mejoran la trazabilidad del progreso en un proyecto.

### **GitHub Actions: Configuración básica para CI/CD**

GitHub Actions es una herramienta integrada en GitHub que permite automatizar tareas en tu flujo de trabajo, como pruebas, despliegues y construcción de proyectos. Es especialmente útil para implementar prácticas de [CI/CD (**Integración Continua y Despliegue Continuo**)](<https://github.com/Fuwanto/Full-stack/tree/main/Ciclo%20de%20vida%20del%20desarrollo%20(CI-CD)>).

### **Pequeño resume de conceptos de CI/CD:**

#### **1. ¿Qué es CI/CD?**

- **CI (Continuous Integration):** Automatiza la integración de código nuevo con el proyecto principal, verificando que no rompa el sistema mediante pruebas automatizadas.
- **CD (Continuous Deployment):** Automatiza el despliegue de código en entornos de producción o pruebas.

---

#### **2. ¿Qué son las Actions en GitHub?**

- **Workflows:** Son scripts que definen una serie de pasos a seguir cuando ocurre un evento (ejemplo: push, pull request, merge, etc.).
- **Runners:** Son los servidores donde se ejecutan los workflows.
- **Marketplace:** Proporciona Actions predefinidas para tareas comunes (ejemplo: ejecutar pruebas, desplegar en un servidor, etc.).

---

#### **3. Cómo configurar un workflow básico**

1. **Crear un archivo de configuración:**

   - En tu repositorio, creá una carpeta llamada `.github/workflows/`.
   - Dentro de esa carpeta, creá un archivo YAML (por ejemplo, `ci.yml`).

2. **Definir el workflow básico:**
   Aquí tenés un ejemplo para ejecutar pruebas en un proyecto Node.js:

   ```yaml
   name: CI Workflow

   on:
     push:
       branches:
         - main
     pull_request:

   jobs:
     build:
       runs-on: ubuntu-latest

       steps:
         - name: Checkout code
           uses: actions/checkout@v3

         - name: Setup Node.js
           uses: actions/setup-node@v3
           with:
             node-version: 16

         - name: Install dependencies
           run: npm install

         - name: Run tests
           run: npm test
   ```

3. **Elementos clave del archivo:**

   - `on:` Define los eventos que disparan el workflow (`push`, `pull_request`, etc.).
   - `jobs:` Agrupa las tareas a realizar.
   - `steps:` Son los pasos específicos dentro de cada tarea:
     - `uses:` Usa una Action predefinida del Marketplace.
     - `run:` Ejecuta comandos específicos.

4. **Guardar y probar:**
   - Al hacer un push o crear un Pull Request, GitHub ejecutará automáticamente el workflow definido.

---

#### **4. Visualización del workflow**

- Podés verificar el estado del workflow en la pestaña **Actions** del repositorio.
- Cada ejecución muestra detalles como pasos completados, logs de errores y estado general (éxito o fallo).

---

#### **5. Ventajas de GitHub Actions**

- Completamente integrado con GitHub.
- Soporta múltiples lenguajes y entornos.
- Gran flexibilidad para personalizar workflows.

### **GitHub Pages para desplegar sitios estáticos**

**GitHub Pages** es una herramienta gratuita que te permite alojar y desplegar sitios web estáticos directamente desde un repositorio de GitHub. Es ideal para proyectos personales, blogs, portafolios o documentación de proyectos.

---

#### **1. ¿Qué es un sitio web estático?**

- Un sitio que no requiere procesamiento en el servidor, compuesto solo por HTML, CSS y JavaScript.
- No incluye bases de datos ni lógica del lado del servidor.

---

#### **2. Requisitos para usar GitHub Pages**

- Un repositorio público (para proyectos privados, solo está disponible en planes pagos).
- Archivos estáticos como `index.html`, `style.css`, etc.

---

#### **3. Configuración de GitHub Pages**

1. **Subir el contenido al repositorio:**

   - Creá o subí los archivos de tu sitio (como `index.html`) a una rama de tu repositorio.

2. **Habilitar GitHub Pages:**

   - Ve a la pestaña **Settings** del repositorio.
   - Desplazate a la sección **Pages**.
   - Seleccioná la rama desde la que querés desplegar el sitio (por ejemplo, `main`) y la carpeta (generalmente, `/root`).
   - Hacé clic en **Save**.

3. **Acceder al sitio:**
   - GitHub generará automáticamente la URL de tu sitio, que tendrá el formato:
     ```
     https://<tu_usuario>.github.io/<nombre_repositorio>/
     ```

---

#### **4. Ejemplo práctico**

Supongamos que tenés un proyecto con un archivo `index.html`:

1. Subís el archivo al repositorio.
2. Configurás GitHub Pages para que use la rama `main`.
3. Accedés al sitio en la URL generada.

---

#### **5. Personalización avanzada**

- **Temas predefinidos:**
  Si el repositorio contiene solo un archivo `README.md`, podés usar los temas predefinidos de GitHub para convertirlo en un sitio.
- **Dominios personalizados:**
  Podés asociar tu propio dominio al sitio configurando un archivo `CNAME` en la raíz del repositorio y configurando tu proveedor de dominio.

---

#### **6. Ventajas de GitHub Pages**

- Gratis y fácil de usar.
- Perfecto para proyectos pequeños y documentación.
- Integrado con repositorios de GitHub.

### **Uso de Forks y contribuciones a proyectos de código abierto**

Un **fork** en GitHub es una copia de un repositorio que se aloja en tu cuenta personal. Los forks son una herramienta esencial para colaborar en proyectos de código abierto, ya que te permiten hacer cambios en un repositorio sin afectar directamente el original.

---

#### **1. ¿Qué es un fork?**

- Un fork es una copia independiente de un repositorio que podés modificar libremente.
- Se utiliza principalmente para:
  - Proponer cambios en proyectos que no controlás directamente.
  - Experimentar con el código sin afectar el repositorio original.

---

#### **2. Cómo hacer un fork**

1. Ve al repositorio que querés forkar.
2. Hacé clic en el botón **Fork** en la parte superior derecha.
3. Seleccioná tu cuenta personal como destino del fork.
4. GitHub creará una copia del repositorio en tu cuenta.

---

#### **3. Proceso para contribuir a un proyecto usando forks**

1. **Hacer el fork del repositorio:**

   - Creá una copia en tu cuenta siguiendo los pasos anteriores.

2. **Clonar el fork en tu computadora:**

   ```bash
   git clone https://github.com/tu_usuario/nombre_repositorio.git
   cd nombre_repositorio
   ```

3. **Configurar el remoto original (opcional):**
   Para mantener tu fork sincronizado con el repositorio original:

   ```bash
   git remote add upstream https://github.com/original_usuario/nombre_repositorio.git
   git fetch upstream
   ```

4. **Crear una rama para tus cambios:**

   - Nunca trabajes directamente en `main` para mantenerlo limpio.

   ```bash
   git checkout -b nombre_rama
   ```

5. **Hacer cambios y confirmarlos:**

   - Editá los archivos y confirmá los cambios:
     ```bash
     git add .
     git commit -m "Descripción de los cambios"
     ```

6. **Subir la rama a tu fork:**

   ```bash
   git push origin nombre_rama
   ```

7. **Crear un Pull Request (PR):**
   - Ve a tu fork en GitHub y hacé clic en **Compare & pull request**.
   - Seleccioná el repositorio y la rama del proyecto original como destino.
   - Agregá una descripción clara de tus cambios y creá el PR.

---

#### **4. Sincronizar tu fork con el repositorio original**

Si el repositorio original tiene cambios nuevos, sincronizalos con tu fork:

```bash
git fetch upstream
git checkout main
git merge upstream/main
git push origin main
```

---

#### **5. Ventajas del uso de forks**

- Fomenta contribuciones organizadas en proyectos grandes.
- Te permite trabajar de manera independiente sin afectar al repositorio original.
- Facilita la colaboración en proyectos de código abierto.

### **Manejo de secretos y configuraciones sensibles en GitHub**

En un proyecto de software, a menudo necesitas manejar información sensible como claves API, contraseñas o configuraciones específicas del entorno. **GitHub** proporciona herramientas para manejar estos secretos de manera segura, evitando que esta información se exponga en el código fuente.

---

#### **1. ¿Qué son los secretos?**

Los **secretos** son variables de entorno que contienen información sensible, como:

- Claves de API.
- Contraseñas de bases de datos.
- Tokens de autenticación.
- Certificados.

Es crucial no exponer estos secretos en los repositorios, especialmente si son públicos, ya que pueden comprometer la seguridad de tu aplicación.

---

#### **2. ¿Dónde se deben guardar los secretos?**

- **Variables de entorno:** Son la mejor manera de almacenar secretos en un entorno de CI/CD. Los secretos no deben estar directamente en el código fuente (por ejemplo, en archivos `.env` que pueden ser subidos accidentalmente a GitHub).

---

#### **3. Manejo de secretos en GitHub Actions**

GitHub permite almacenar secretos de manera segura en el repositorio, para ser utilizados en workflows de **GitHub Actions**.

1. **Agregar secretos a tu repositorio:**

   - Ve a **Settings** del repositorio.
   - En el menú lateral, seleccioná **Secrets and variables** > **Actions**.
   - Haz clic en **New repository secret**.
   - Introducí el **nombre** y el **valor** del secreto (por ejemplo, `API_KEY`).
   - Haz clic en **Add secret**.

2. **Uso de secretos en un workflow de GitHub Actions:**
   Para usar un secreto en tu archivo de workflow, podés acceder a él a través de `secrets`:

   ```yaml
   jobs:
     build:
       runs-on: ubuntu-latest
       steps:
         - name: Checkout code
           uses: actions/checkout@v3

         - name: Use secret in environment variable
           run: echo "API_KEY=${{ secrets.API_KEY }}"
           env:
             API_KEY: ${{ secrets.API_KEY }}
   ```

3. **Acceso seguro a secretos:**
   - GitHub nunca muestra los secretos en los logs de ejecución.
   - Si intentás imprimir un secreto en los logs, GitHub lo ocultará automáticamente para mantener la seguridad.

---

#### **4. Mejoras de seguridad**

- **No almacenar secretos en archivos de código fuente** (por ejemplo, no subas archivos `.env` a GitHub). Utilizá la funcionalidad de secretos para manejar esta información.
- **Use el mínimo acceso necesario:** Solo da acceso a los secretos que realmente necesitas en cada workflow o acción.
- **Revocar secretos antiguos:** Si un secreto se ve comprometido, revócalo desde los **Settings** de GitHub y genera uno nuevo.

---

#### **5. Otras herramientas relacionadas con seguridad en GitHub**

- **Dependabot:** GitHub tiene herramientas como Dependabot para gestionar actualizaciones de dependencias y vulnerabilidades de seguridad en tu código.
- **GitHub Advanced Security:** Para equipos que necesitan características avanzadas de seguridad, como escaneo de código estático.

---

#### **6. Ventajas del manejo de secretos en GitHub**

- Almacenamiento seguro de credenciales.
- Evita exposiciones accidentales de información sensible.
- Permite un manejo más organizado de configuraciones de diferentes entornos (producción, pruebas, desarrollo).
