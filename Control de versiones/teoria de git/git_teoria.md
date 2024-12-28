### ¿Qué es Git?

Git es un **sistema de control de versiones distribuido** que permite gestionar el historial de cambios de un proyecto de manera eficiente. Se usa principalmente para desarrollar software, pero también es útil en cualquier proyecto donde se necesite mantener un registro de versiones, como documentos o sitios web.

#### Características principales:

1. **Control de versiones**:  
   Permite guardar diferentes versiones de un archivo o conjunto de archivos, facilitando volver atrás en caso de errores.
2. **Distribuido**:  
   Cada copia del repositorio incluye todo el historial del proyecto, lo que hace que no dependa exclusivamente de un servidor central.

3. **Colaboración**:  
   Facilita el trabajo en equipo, ya que cada miembro puede trabajar en paralelo sin conflictos, integrando los cambios de manera organizada.

4. **Eficiencia**:  
   Git maneja grandes proyectos con rapidez gracias a su diseño basado en instantáneas y no en diferencias lineales de archivos.

#### Terminología básica:

- **Repositorio**: La carpeta donde Git guarda todo el historial y los cambios de tu proyecto.
- **Commit**: Una instantánea de tu proyecto en un momento específico.
- **Branch (rama)**: Una línea independiente de desarrollo dentro de un repositorio.
- **Staging area**: Un espacio intermedio donde se preparan los cambios antes de confirmarlos.

#### ¿Por qué usar Git?

- **Seguridad**: Git asegura el historial con funciones hash, evitando manipulaciones accidentales o malintencionadas.
- **Flexibilidad**: Compatible con flujos de trabajo individuales y colaborativos.
- **Amplia adopción**: Es el estándar de la industria, y plataformas como GitHub, GitLab y Bitbucket están diseñadas para integrarse con Git.

### Configuración inicial (`git config`)

Antes de usar Git, es importante configurarlo para que los commits que hagas incluyan tu información y puedas personalizarlo según tus necesidades.

#### 1. **Configurar el nombre de usuario y correo electrónico**

Estos datos son necesarios para identificarte en los commits. Es una configuración obligatoria.

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@ejemplo.com"
```

- **`--global`**: Aplica la configuración a todos los repositorios de tu sistema.
- **Sin `--global`**: Aplica la configuración solo al repositorio actual.

#### 2. **Ver configuraciones actuales**

Para verificar que tus configuraciones están correctas:

```bash
git config --list
```

Esto muestra todas las configuraciones activas, tanto globales como locales.

#### 3. **Configurar un editor por defecto**

Git usa un editor de texto para editar mensajes de commits largos o resolver conflictos. Podés elegir tu editor preferido.  
Ejemplo con VSCode:

```bash
git config --global core.editor "code --wait"
```

Otros editores populares:

- Vim: `"vim"`
- Nano: `"nano"`
- Sublime Text: `"subl --wait"`

#### 4. **Configurar colores para mayor claridad**

Podés habilitar colores en los mensajes de Git para que sean más legibles:

```bash
git config --global color.ui auto
```

#### 5. **Configurar el sistema de fin de línea (EOL)**

Si trabajás en un equipo con diferentes sistemas operativos, configurá cómo manejar los saltos de línea:

- En Windows:
  ```bash
  git config --global core.autocrlf true
  ```
- En macOS/Linux:
  ```bash
  git config --global core.autocrlf input
  ```

#### 6. **Ver configuraciones avanzadas**

Podés acceder al archivo de configuración directamente:

- **Global**: `~/.gitconfig`
- **Local** (en el repositorio actual): `.git/config`

#### Ejercicio práctico:

1. Configurá tu nombre y correo electrónico con `git config`.
2. Verificá tus configuraciones con `git config --list`.
3. Si tenés VSCode, configurá el editor como predeterminado.

### 2. **Comandos básicos**

Estos comandos son esenciales para iniciar y gestionar un repositorio de Git.

---

#### **1. `git init`**

Crea un nuevo repositorio de Git en la carpeta actual. Este comando inicializa un directorio oculto llamado `.git` donde se almacenará toda la información del repositorio.

**Uso:**

```bash
git init
```

- **Práctica:**
  1. Creá una carpeta nueva en tu computadora.
  2. Abrí la terminal en esa carpeta.
  3. Ejecutá `git init`.
  4. Verificá que se creó la carpeta oculta `.git` (podés usar `ls -a` para verla).

---

#### **2. `git add`**

Agrega archivos al área de preparación (**staging area**), preparándolos para el próximo commit.

**Usos:**

- Agregar un archivo específico:
  ```bash
  git add archivo.txt
  ```
- Agregar todos los archivos del directorio actual:

  ```bash
  git add .
  ```

- **Práctica:**
  1. Creá un archivo nuevo (por ejemplo, `archivo.txt`) en la carpeta donde inicializaste Git.
  2. Usá `git add archivo.txt` para agregarlo al área de preparación.

---

#### **3. `git commit`**

Confirma los cambios en el repositorio, creando una instantánea de los archivos preparados.

**Uso básico:**

```bash
git commit -m "Mensaje descriptivo del commit"
```

**Práctica recomendada:**

1. Después de usar `git add`, ejecutá:
   ```bash
   git commit -m "Añadí el archivo archivo.txt"
   ```

---

#### **4. `git status`**

Muestra el estado actual del repositorio, indicando:

- Archivos modificados.
- Archivos que están o no en el área de preparación.
- Si hay algo pendiente de commit.

**Uso:**

```bash
git status
```

- **Práctica:**  
  Después de crear o modificar archivos, probá usar `git status` para ver qué cambió.

---

#### **5. `git log`**

Muestra el historial de commits del repositorio.

**Uso básico:**

```bash
git log
```

**Opciones útiles:**

- Ver el historial en una sola línea por commit:
  ```bash
  git log --oneline
  ```
- Ver detalles con diferencias en cada commit:
  ```bash
  git log -p
  ```

---

### Ejercicio práctico:

1. Inicializá un repositorio con `git init`.
2. Creá un archivo nuevo y agregalo al área de preparación con `git add`.
3. Confirmá los cambios con `git commit -m "Primer commit"`.
4. Modificá el archivo y verificá su estado con `git status`.
5. Usá `git log` para ver el historial.

### 3. **Comandos intermedios**

#### **1. `git branch`**

Este comando permite gestionar las ramas (branches) de un repositorio.

- **Ver las ramas existentes**:

  ```bash
  git branch
  ```

  La rama activa estará marcada con un asterisco (\*).

- **Crear una nueva rama**:

  ```bash
  git branch nombre-de-la-rama
  ```

- **Eliminar una rama**:
  ```bash
  git branch -d nombre-de-la-rama
  ```

---

#### **2. `git checkout`**

Este comando se usa para cambiar entre ramas o restaurar archivos específicos.

- **Cambiar de rama**:

  ```bash
  git checkout nombre-de-la-rama
  ```

- **Crear y cambiar a una nueva rama al mismo tiempo** (versión moderna con `switch` y `checkout`):
  ```bash
  git checkout -b nueva-rama
  ```

---

#### **3. `git merge`**

Combina los cambios de una rama con otra.

- **Uso básico**:

  1. Cambiá a la rama donde querés combinar los cambios:
     ```bash
     git checkout rama-principal
     ```
  2. Ejecutá el merge:
     ```bash
     git merge rama-secundaria
     ```

- Git intentará fusionar automáticamente las ramas. Si encuentra conflictos, tendrás que resolverlos manualmente (veremos esto en detalle más adelante).

---

### Ejercicio práctico:

1. **Crear y usar ramas**:

   - En un repositorio existente, verificá las ramas con:
     ```bash
     git branch
     ```
   - Creá una nueva rama:
     ```bash
     git branch mi-rama
     ```
   - Cambiá a esa rama:
     ```bash
     git checkout mi-rama
     ```
   - Hacé cambios, confirmalos con un commit.

2. **Fusionar ramas**:
   - Volvé a la rama principal (`main` o `master`) con:
     ```bash
     git checkout main
     ```
   - Fusioná los cambios de `mi-rama`:
     ```bash
     git merge mi-rama
     ```

### 4. **Resolución de conflictos en `merge`**

Un conflicto ocurre cuando Git no puede fusionar automáticamente los cambios entre ramas porque afectan las mismas líneas de un archivo. En ese caso, vos tenés que resolverlo manualmente.

---

#### **1. ¿Cómo identificar un conflicto?**

Cuando intentás hacer un merge y ocurre un conflicto, Git muestra un mensaje similar a este:

```bash
Auto-merging archivo.txt
CONFLICT (content): Merge conflict in archivo.txt
Automatic merge failed; fix conflicts and then commit the result.
```

Si usás `git status`, verás los archivos en conflicto listados como:

```bash
both modified: archivo.txt
```

---

#### **2. ¿Cómo se ve un conflicto en el archivo?**

Git marca las líneas en conflicto con estas etiquetas dentro del archivo:

```plaintext
<<<<<<< HEAD
(Tu versión actual)
=======
(Versión de la rama fusionada)
>>>>>>> rama-secundaria
```

Vos tenés que decidir cuál versión conservar o combinar ambas.

---

#### **3. Pasos para resolver conflictos**

1. **Abrí el archivo en conflicto**:  
   Usá tu editor de texto preferido para revisar las secciones marcadas.

2. **Editá el archivo**:  
   Decidí qué cambios conservar. Por ejemplo:

   - Si querés mantener tu versión:
     ```plaintext
     (Tu versión actual)
     ```
   - Si querés usar la versión de la rama fusionada:
     ```plaintext
     (Versión de la rama fusionada)
     ```
   - Si querés combinar ambas versiones:
     ```plaintext
     (Tu versión actual)
     (Versión de la rama fusionada)
     ```

3. **Marcá el conflicto como resuelto**:  
   Después de editar el archivo, usá:

   ```bash
   git add archivo.txt
   ```

4. **Finalizá el merge con un commit**:
   ```bash
   git commit -m "Resolví el conflicto en archivo.txt"
   ```

---

#### **4. Cancelar el merge**

Si no querés resolver el conflicto y preferís deshacer el merge:

```bash
git merge --abort
```

---

### Ejercicio práctico:

1. Creá dos ramas (`main` y `rama-conflicto`) y realizá cambios en la misma línea de un archivo en ambas ramas.
2. Intentá fusionar `rama-conflicto` con `main`:
   ```bash
   git merge rama-conflicto
   ```
3. Resolvé el conflicto manualmente siguiendo los pasos anteriores.

### 5. **Comandos avanzados**

#### **1. `git rebase`**

El comando `rebase` reorganiza los commits de una rama aplicándolos sobre otra, creando un historial más lineal.

![git-rebase](https://tecadmin.net/wp-content/uploads/2023/05/git-rebase-practical-guide.png)

- **Uso básico**:  
  Supongamos que estás en la rama `mi-rama` y querés aplicar sus commits sobre la rama `main`:

  ```bash
  git rebase main
  ```

- **¿Qué hace `rebase`?**
  En lugar de fusionar (`merge`), `rebase` mueve los commits de tu rama y los reaplica encima de la rama base. Esto evita un historial con ramas divergentes.

- **Ejemplo práctico**:
  1. Creá dos ramas (`main` y `mi-rama`).
  2. Hacé commits en ambas ramas.
  3. Desde `mi-rama`, ejecutá:
     ```bash
     git rebase main
     ```

---

#### **2. `git cherry-pick`**

Este comando copia un commit específico de una rama y lo aplica a la rama activa.

![cherry-pick](https://ucarecdn.com/9a82bbf3-c595-437a-b78c-dd4debda1427/)

- **Uso básico**:  
  Si querés aplicar un commit de la rama `otra-rama` (identificado por su hash `abc123`) a la rama actual:

  ```bash
  git cherry-pick abc123
  ```

- **¿Cuándo usar `cherry-pick`?**  
  Cuando necesitás traer un cambio específico de otra rama sin fusionar todo su contenido.

- **Ejemplo práctico**:
  1. Identificá el hash del commit deseado con `git log`.
  2. Usá `git cherry-pick` para aplicarlo.

---

#### **3. `git stash`**

Guarda temporalmente cambios no confirmados para que puedas cambiar de rama o trabajar en otra tarea sin perderlos.

- **Guardar cambios en el stash**:

  ```bash
  git stash
  ```

  Esto guarda los cambios y deja el área de trabajo limpia.

- **Ver los stashes guardados**:

  ```bash
  git stash list
  ```

- **Restaurar el último stash**:

  ```bash
  git stash apply
  ```

- **Eliminar el último stash después de aplicarlo**:

  ```bash
  git stash pop
  ```

- **Borrar todos los stashes**:

  ```bash
  git stash clear
  ```

- **¿Cuándo usar `stash`?**  
  Si estás trabajando en algo pero necesitás cambiar de rama o empezar otra tarea sin perder tu progreso actual.

---

### Ejercicio práctico:

1. **`rebase`**:

   - Creá dos ramas (`main` y `mi-rama`), hacé cambios en ambas y reorganizá los commits con `git rebase`.

2. **`cherry-pick`**:

   - Identificá un commit específico en otra rama y aplicalo con `git cherry-pick`.

3. **`stash`**:
   - Realizá cambios en un archivo, guardalos con `git stash` y luego recupéralos.

### 6. **Manejo de etiquetas (`tag`)**

Las etiquetas se usan principalmente para marcar versiones de software o hitos importantes. Existen dos tipos de etiquetas en Git:

#### **1. Etiquetas ligeras (lightweight tags)**

Son simplemente un apuntador a un commit específico, sin más información adicional.

- **Crear una etiqueta ligera**:
  ```bash
  git tag nombre-de-la-etiqueta
  ```
- **Ejemplo**:
  ```bash
  git tag v1.0
  ```

---

#### **2. Etiquetas anotadas (annotated tags)**

Incluyen un mensaje, el nombre del autor y la fecha. Son recomendadas para etiquetar versiones formales.

- **Crear una etiqueta anotada**:
  ```bash
  git tag -a nombre-de-la-etiqueta -m "Mensaje descriptivo"
  ```
- **Ejemplo**:
  ```bash
  git tag -a v1.0 -m "Primera versión del proyecto"
  ```

---

#### **3. Ver etiquetas**

Para listar todas las etiquetas del repositorio:

```bash
git tag
```

---

#### **4. Mostrar información de una etiqueta**

Si querés ver detalles sobre una etiqueta anotada:

```bash
git show nombre-de-la-etiqueta
```

---

#### **5. Etiquetar commits antiguos**

Si querés crear una etiqueta para un commit pasado (por su hash):

```bash
git tag -a nombre-de-la-etiqueta hash-del-commit -m "Mensaje descriptivo"
```

---

#### **6. Subir etiquetas al repositorio remoto**

Por defecto, las etiquetas no se envían al remoto. Para subirlas:

- Subir una etiqueta específica:

  ```bash
  git push origin nombre-de-la-etiqueta
  ```

- Subir todas las etiquetas:
  ```bash
  git push --tags
  ```

---

#### **7. Eliminar etiquetas**

- Eliminar una etiqueta local:

  ```bash
  git tag -d nombre-de-la-etiqueta
  ```

- Eliminar una etiqueta del remoto:
  ```bash
  git push origin --delete nombre-de-la-etiqueta
  ```

---

### Ejercicio práctico:

1. Creá una etiqueta ligera con `git tag`.
2. Creá una etiqueta anotada con un mensaje.
3. Subí la etiqueta al remoto.
4. Verificá las etiquetas creadas con `git tag` y `git show`.

### 7. **Recuperación de cambios (`reset` y `revert`)**

#### **1. `git reset`**

Este comando permite deshacer cambios en el historial del repositorio. Tiene tres modos principales, dependiendo del alcance que quieras darle al "reseteo".

##### Modos de `reset`:

1. **`--soft`**:

   - Deshace el último commit, pero mantiene los cambios en el área de preparación (**staging area**).
   - **Uso**:
     ```bash
     git reset --soft HEAD~1
     ```
   - **Cuándo usarlo**: Si te equivocaste en el mensaje de un commit y querés corregirlo.

2. **`--mixed`** (por defecto):

   - Deshace el último commit y mueve los cambios al área de trabajo (working directory), sacándolos del área de preparación.
   - **Uso**:
     ```bash
     git reset --mixed HEAD~1
     ```
   - **Cuándo usarlo**: Si querés modificar los archivos antes de volver a confirmar el commit.

3. **`--hard`**:
   - Elimina completamente el commit y sus cambios. **No hay forma de recuperarlos**.
   - **Uso**:
     ```bash
     git reset --hard HEAD~1
     ```
   - **Cuándo usarlo**: Solo si estás completamente seguro de que no necesitás esos cambios.

---

#### **2. `git revert`**

Este comando crea un nuevo commit que revierte los cambios de un commit anterior, sin alterar el historial.

- **Revertir un commit específico**:

  ```bash
  git revert hash-del-commit
  ```

- **Revertir varios commits**:
  Si querés revertir varios commits en orden inverso (del más reciente al más antiguo):

  ```bash
  git revert hash1 hash2
  ```

- **¿Cuándo usar `revert`?**:
  Cuando necesitás deshacer un cambio pero querés conservar el historial intacto. Es útil en repositorios compartidos porque no afecta los commits ya enviados al remoto.

---

### **Diferencias principales entre `reset` y `revert`**

| **Comando** | **Efecto**                                                                   | **Cuándo usarlo**                                                          |
| ----------- | ---------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `reset`     | Modifica el historial, eliminando commits.                                   | Cuando trabajás solo en tu repositorio local y no compartiste los cambios. |
| `revert`    | Crea un nuevo commit que "deshace" otro commit sin eliminarlo del historial. | Cuando trabajás en equipo o ya empujaste cambios al repositorio remoto.    |

---

### Ejercicio práctico:

1. **`reset`**:

   - Hacé varios commits en un repositorio.
   - Usá `git reset --soft`, `--mixed` y `--hard` para probar sus efectos.

2. **`revert`**:
   - Identificá el hash de un commit anterior con `git log`.
   - Usá `git revert` para deshacer ese commit y verificá el nuevo commit creado.

### 8. **Trabajo con remotos (`fetch`, `pull`, `push`)**

#### **1. `git fetch`**

Este comando descarga las actualizaciones del repositorio remoto, como cambios en ramas o etiquetas, pero **no las aplica automáticamente** en tu repositorio local.

- **Uso básico**:

  ```bash
  git fetch
  ```

  Esto actualiza la información de todas las ramas remotas.

- **Actualizar una rama específica**:

  ```bash
  git fetch origin nombre-de-la-rama
  ```

- **¿Cuándo usar `fetch`?**:
  Cuando querés revisar los cambios en el remoto antes de integrarlos en tu rama local.

---

#### **2. `git pull`**

Este comando combina los efectos de `fetch` y `merge`. Descarga los cambios del remoto y los aplica directamente en tu rama actual.

- **Uso básico**:

  ```bash
  git pull
  ```

- **Actualizar desde una rama específica**:

  ```bash
  git pull origin nombre-de-la-rama
  ```

- **¿Cuándo usar `pull`?**:
  Cuando querés obtener los cambios remotos e integrarlos automáticamente en tu rama actual.

---

#### **3. `git push`**

Este comando sube los commits confirmados desde tu repositorio local al remoto.

- **Uso básico**:

  ```bash
  git push
  ```

- **Subir a una rama específica**:

  ```bash
  git push origin nombre-de-la-rama
  ```

- **Subir una nueva rama**:
  Si creaste una rama localmente y querés publicarla en el remoto:

  ```bash
  git push -u origin nombre-de-la-rama
  ```

  El flag `-u` establece un seguimiento entre la rama local y la remota.

- **¿Cuándo usar `push`?**:
  Cuando querés compartir tus cambios con el equipo o guardarlos en el remoto.

---

### **Diferencias entre `fetch`, `pull` y `push`**

| **Comando** | **Acción**                                                                       |
| ----------- | -------------------------------------------------------------------------------- |
| `fetch`     | Descarga información del remoto pero no actualiza tu rama local automáticamente. |
| `pull`      | Descarga cambios y los fusiona automáticamente con tu rama local.                |
| `push`      | Sube tus commits locales al remoto para compartirlos o sincronizarlos.           |

---

### Ejercicio práctico:

1. **`fetch`**:

   - Hacé un `git fetch` y revisá los cambios descargados con:
     ```bash
     git log origin/nombre-de-la-rama
     ```

2. **`pull`**:

   - Ejecutá `git pull` y observá cómo se integran los cambios en tu rama actual.

3. **`push`**:
   - Realizá un commit en tu repositorio local y subilo al remoto con `git push`.

### 9. **Manejo de ramas remotas**

#### **1. Ver ramas remotas**

Para listar todas las ramas remotas que existen en el repositorio, usás:

```bash
git branch -r
```

Esto mostrará algo como:

```bash
origin/main
origin/feature/nueva-funcionalidad
```

#### **2. Crear una rama remota**

Cuando creas una rama local y luego la subís al repositorio remoto, Git la crea en el remoto automáticamente.

- **Crear una nueva rama y subirla**:
  ```bash
  git checkout -b nueva-rama
  git push -u origin nueva-rama
  ```

El flag `-u` establece un seguimiento entre la rama local y la remota, por lo que luego podrás hacer `git push` o `git pull` sin especificar el nombre de la rama.

#### **3. Cambiar a una rama remota**

Si querés trabajar en una rama remota sin crearla primero de manera local, usás:

```bash
git checkout -b nombre-de-la-rama origin/nombre-de-la-rama
```

Esto creará una nueva rama local que rastrea la rama remota.

#### **4. Eliminar ramas remotas**

Para eliminar una rama remota que ya no necesitas, usás:

```bash
git push origin --delete nombre-de-la-rama
```

#### **5. Sincronizar ramas locales con remotas**

Si alguien más hizo cambios en una rama remota y querés obtener esas actualizaciones:

- **Actualizar tu rama local con los cambios remotos**:

  ```bash
  git fetch
  git merge origin/nombre-de-la-rama
  ```

  O podés usar directamente `git pull` para realizar ambas acciones (fetch + merge).

- **Eliminar ramas locales que ya no existen en el remoto**:
  Para eliminar las referencias locales a ramas remotas que ya fueron eliminadas, usás:
  ```bash
  git fetch -p
  ```

#### **6. Ver las diferencias entre tu rama local y la remota**

Si querés ver qué cambios existen entre tu rama local y la remota, podés usar:

```bash
git diff nombre-de-la-rama origin/nombre-de-la-rama
```

---

### **Resumen de los comandos de ramas remotas**:

| **Acción**                       | **Comando**                                                  |
| -------------------------------- | ------------------------------------------------------------ |
| Ver ramas remotas                | `git branch -r`                                              |
| Crear y subir una rama remota    | `git push -u origin nombre-de-la-rama`                       |
| Cambiar a una rama remota        | `git checkout -b nombre-de-la-rama origin/nombre-de-la-rama` |
| Eliminar una rama remota         | `git push origin --delete nombre-de-la-rama`                 |
| Sincronizar con la rama remota   | `git fetch` y luego `git merge origin/nombre-de-la-rama`     |
| Eliminar ramas locales obsoletas | `git fetch -p`                                               |
| Ver diferencias entre ramas      | `git diff nombre-de-la-rama origin/nombre-de-la-rama`        |

---

### Ejercicio práctico:

1. **Crear y subir una rama remota**:  
   Crea una nueva rama local, subila al remoto con `git push -u` y verifica que esté disponible en el remoto.

2. **Cambiar a una rama remota**:  
   Usá `git checkout -b` para cambiar a una rama remota existente sin haberla creado antes.

3. **Eliminar una rama remota**:  
   Elimina una rama remota que ya no necesites.

### 10. **Alias en Git y configuración personalizada**

#### **1. ¿Qué son los alias?**

Los alias en Git son nombres cortos para comandos más largos, lo que facilita su uso. Por ejemplo, podés crear un alias para un comando largo o complicado, haciendo que sea más rápido de escribir.

#### **2. Crear alias**

Los alias se definen a través del archivo de configuración de Git (`~/.gitconfig`). Podés crear alias para comandos de Git de la siguiente manera:

- **Crear un alias**:

  ```bash
  git config --global alias.nombre-comando 'comando-largo'
  ```

- **Ejemplo 1**: Crear un alias para `git status`:

  ```bash
  git config --global alias.st 'status'
  ```

  Ahora, en vez de escribir `git status`, podés escribir `git st`.

- **Ejemplo 2**: Crear un alias para `git commit -m "mensaje"`:
  ```bash
  git config --global alias.ci 'commit -m'
  ```
  Ahora, para hacer un commit con mensaje, podés usar `git ci "Mensaje del commit"`.

#### **3. Ver los alias configurados**

Para ver todos los alias que hayas configurado, podés revisar tu configuración de Git con:

```bash
git config --get-regexp alias
```

#### **4. Eliminar un alias**

Si querés eliminar un alias, simplemente eliminás la configuración asociada:

```bash
git config --global --unset alias.nombre-comando
```

### Ejercicio práctico:

1. **Crear alias**:  
   Configurá algunos alias para los comandos que más usas. Por ejemplo, crea alias para `git status`, `git commit -m`, y `git log`.

2. **Configurar usuario y correo**:  
   Asegurate de configurar tu nombre y correo en Git para que se asocien con tus commits.

3. **Habilitar colores en Git**:  
   Configurá Git para que use colores en la salida de comandos como `git status` y `git log`.
