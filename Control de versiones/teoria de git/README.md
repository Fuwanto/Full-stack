# Fundamentos de Git

¡Bienvenido/a al mundo de Git! 🧑‍💻 En esta sección, exploraremos los fundamentos esenciales de **Git**, una de las herramientas más poderosas para el control de versiones. Aprenderemos sus características, terminología básica y cómo configurarlo para empezar a trabajar de manera eficiente con tus proyectos.

<p align="center">  
  <img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExOWZsNGU1cHIzY3R4enFqc25sdWhzeTF1a2tkb3ByNWk4NXY2aWx0ZSZlcD12MV9naWZzX3NlYXJjaCZjdD1n/cFkiFMDg3iFoI/giphy.gif">  
</p>

---

## 1. ¿Qué es Git?

**Git** es un sistema de control de versiones distribuido, diseñado para gestionar proyectos de desarrollo de software de manera eficiente. Permite mantener un historial completo de cambios, colaborar con otros y realizar seguimiento de los cambios realizados en un proyecto.

### Características principales:

- **Distribuido**: Cada usuario tiene una copia completa del repositorio.
- **Rendimiento**: Operaciones como commit y checkout son rápidas.
- **Ramas (Branches)**: Facilita la creación y manejo de ramas para trabajar de manera aislada.
- **Fusión de cambios**: Potente herramienta para fusionar ramas y gestionar conflictos.

### Terminología básica:

- **Repositorio**: Es donde se almacena el proyecto y su historial de cambios.
- **Commit**: Es una instantánea de los cambios realizados.
- **Branch**: Una línea de desarrollo dentro de un proyecto.
- **Merge**: Unir dos ramas diferentes.
- **Push**: Subir cambios a un repositorio remoto.
- **Pull**: Traer cambios de un repositorio remoto.

### ¿Por qué usar Git?

- **Control de versiones**: Realiza un seguimiento detallado de todos los cambios.
- **Colaboración**: Facilita el trabajo en equipo, permitiendo que varios desarrolladores trabajen en paralelo.
- **Historial**: Accede al historial completo de cambios, lo que te permite deshacer errores fácilmente.

Consulta [Pro Git](https://git-scm.com/book/en/v2) para más información.

---

## 2. Configuración inicial (`git config`)

### 1. Configurar el nombre de usuario y correo electrónico

- Usar `git config --global user.name "Tu Nombre"`
- Usar `git config --global user.email "tu.email@example.com"`

### 2. Ver configuraciones actuales

- `git config --list` para ver las configuraciones activas.

### 3. Configurar un editor por defecto

- `git config --global core.editor "vim"` para elegir el editor de texto.

### 4. Configurar colores para mayor claridad

- `git config --global color.ui auto` para habilitar colores en la salida de los comandos.

### 5. Configurar el sistema de fin de línea (EOL)

- `git config --global core.autocrlf true` para manejar fin de líneas en diferentes sistemas operativos.

### 6. Ver configuraciones avanzadas

- `git config --list --show-origin` para ver la configuración y su origen.

---

## 3. Comandos básicos

### 1. `git init`

- Inicializa un nuevo repositorio de Git en el directorio actual.

### 2. `git add`

- Añade archivos al área de preparación (staging area).

### 3. `git commit`

- Realiza un commit con los cambios en el área de preparación.

### 4. `git status`

- Muestra el estado actual del repositorio, incluyendo los archivos modificados.

### 5. `git log`

- Muestra el historial de commits en el repositorio.

---

## 4. Comandos intermedios

### 1. `git branch`

- Muestra todas las ramas disponibles en el repositorio.

### 2. `git checkout`

- Cambia de rama o restablece archivos.

### 3. `git merge`

- Fusiona una rama con la rama actual.

---

## 5. Resolución de conflictos en merge

### 1. ¿Cómo identificar un conflicto?

- Un conflicto ocurre cuando dos ramas han modificado la misma línea de un archivo.

### 2. ¿Cómo se ve un conflicto en el archivo?

- Git marca las secciones conflictivas con `<<<<<<<`, `=======`, y `>>>>>>>`.

### 3. Pasos para resolver conflictos

1. Abre el archivo con el conflicto.
2. Decide qué cambios conservar y elimina las marcas de conflicto.
3. Realiza un commit para guardar la resolución.

### 4. Cancelar el merge

- `git merge --abort` cancela un merge en curso.

---

## 6. Comandos avanzados

### 1. `git rebase`

- Reescribe el historial de commits de la rama actual.

### 2. `git cherry-pick`

- Aplica un commit específico de otra rama.

### 3. `git stash`

- Guarda temporalmente los cambios no comprometidos.

---

## 7. Manejo de etiquetas (`git tag`)

### 1. Etiquetas ligeras (lightweight tags)

- `git tag v1.0` crea una etiqueta sin metadatos adicionales.

### 2. Etiquetas anotadas (annotated tags)

- `git tag -a v1.0 -m "Primera versión"` crea una etiqueta con metadatos.

### 3. Ver etiquetas

- `git tag` muestra todas las etiquetas en el repositorio.

### 4. Mostrar información de una etiqueta

- `git show v1.0` muestra los detalles de una etiqueta.

### 5. Etiquetar commits antiguos

- `git tag v1.0 <commit_hash>` etiqueta un commit específico.

### 6. Subir etiquetas al repositorio remoto

- `git push origin v1.0` sube una etiqueta específica al remoto.

### 7. Eliminar etiquetas

- `git tag -d v1.0` elimina una etiqueta local.
- `git push origin --delete v1.0` elimina una etiqueta en el remoto.

---

## 8. Recuperación de cambios (`git reset` y `git revert`)

### 1. `git reset`

- Deshace commits, moviendo el puntero de la rama a un commit anterior.

### Modos de `reset`:

- `--soft`, `--mixed`, `--hard`: Diferentes formas de mover el puntero y manejar los cambios.

### 2. `git revert`

- Crea un nuevo commit que deshace los cambios de un commit anterior.

### Diferencias entre `reset` y `revert`:

- `reset` modifica el historial, mientras que `revert` crea un nuevo commit.

---

## 9. Trabajo con remotos (`git fetch`, `git pull`, `git push`)

### 1. `git fetch`

- Trae los cambios de un repositorio remoto sin fusionarlos.

### 2. `git pull`

- Trae y fusiona los cambios de un repositorio remoto.

### 3. `git push`

- Sube los cambios locales a un repositorio remoto.

### Diferencias entre `fetch`, `pull` y `push`:

- `fetch` trae cambios sin fusionar, `pull` los trae y fusiona, y `push` sube cambios.

---

## 10. Manejo de ramas remotas

### 1. Ver ramas remotas

- `git branch -r` muestra las ramas remotas.

### 2. Crear una rama remota

- `git push origin <branch_name>` crea una nueva rama remota.

### 3. Cambiar a una rama remota

- `git checkout <branch_name>` para cambiar a una rama remota.

### 4. Eliminar ramas remotas

- `git push origin --delete <branch_name>` elimina una rama remota.

### 5. Sincronizar ramas locales con remotas

- `git pull origin <branch_name>` sincroniza tu rama local con la remota.

### 6. Ver diferencias entre tu rama local y la remota

- `git diff <branch_name>..<remote>/<branch_name>` muestra las diferencias.

---

## 11. Alias en Git y configuración personalizada

### 1. ¿Qué son los alias?

- Son comandos personalizados que puedes configurar para acortar comandos largos.

### 2. Crear alias

- `git config --global alias.st status` crea un alias.

### 3. Ver los alias configurados

- `git config --global --get-regexp alias` muestra los alias configurados.

### 4. Eliminar un alias

- `git config --global --unset alias.st` elimina un alias.

---

¡Con estos comandos podrás empezar a gestionar tu código de manera eficiente y colaborar con otros desarrolladores de manera efectiva! 🚀

Consulta [Pro Git](https://git-scm.com/book/en/v2) para más detalles y profundizar en cada comando y su uso.
