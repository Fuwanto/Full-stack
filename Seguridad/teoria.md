# Seguridad

### **1. Conceptos básicos de seguridad**

#### **Definición general:**

La seguridad en el desarrollo de software, especialmente en aplicaciones web, se refiere a las prácticas y estrategias para proteger las aplicaciones contra diversas amenazas, como el robo de datos, ataques maliciosos, acceso no autorizado, o la manipulación de información. Estas amenazas pueden comprometer tanto la integridad de los datos como la privacidad de los usuarios.

La seguridad web implica una combinación de medidas técnicas y políticas que buscan prevenir, detectar y responder a los ataques, con el objetivo de mantener los sistemas y datos seguros.

---

### **CORS (Cross-Origin Resource Sharing):**

**¿Qué es CORS?**
CORS es una política de seguridad que restringe cómo los recursos en una página web pueden ser solicitados desde otro dominio distinto al de la propia página. Por defecto, los navegadores bloquean las solicitudes HTTP entre sitios (cross-origin), es decir, si un sitio web intenta hacer una solicitud a otro dominio, esa solicitud será bloqueada a menos que el servidor al que se hace la solicitud permita explícitamente el acceso.

CORS está diseñado para proteger a los usuarios y garantizar que solo se realicen solicitudes seguras entre orígenes confiables.

#### **Configuración de CORS:**

Cuando estás desarrollando una API o un servidor, puedes configurar qué dominios tienen permiso para hacer solicitudes a tus recursos. Esto se hace a través de las cabeceras HTTP.

1. **En un servidor Express (Node.js)**, por ejemplo, podrías configurar CORS de la siguiente manera:

```javascript
const cors = require("cors");
const app = require("express")();

// Configuración de CORS para permitir solo un dominio
app.use(
  cors({
    origin: "https://tudominio.com", // Permite solicitudes solo desde este dominio
  })
);
```

2. **En un servidor Django (Python)**, puedes utilizar el paquete `django-cors-headers` para manejar CORS:

```python
# settings.py en Django
INSTALLED_APPS = [
    # Otras apps
    'corsheaders',
]

CORS_ALLOWED_ORIGINS = [
    "https://tudominio.com",
]
```

3. **En un servidor de Flask (Python)**, puedes usar `flask-cors`:

```python
from flask import Flask
from flask_cors import CORS

app = Flask(__name__)
CORS(app, origins=["https://tudominio.com"])
```

#### **Resolución de errores de CORS:**

Los errores de CORS ocurren cuando un navegador bloquea una solicitud entre orígenes, generalmente porque el servidor no incluye las cabeceras necesarias en la respuesta.

1. **Acceso bloqueado:**
   Cuando se realiza una solicitud a un servidor que no ha permitido explícitamente tu origen, el navegador mostrará un error como este:

   ```
   Access to XMLHttpRequest at 'http://ejemplo.com/data' from origin 'http://miapp.com' has been blocked by CORS policy.
   ```

   **Solución:**
   Configura las cabeceras adecuadas en tu servidor para permitir solicitudes desde orígenes confiables. Asegúrate de que las cabeceras `Access-Control-Allow-Origin` y `Access-Control-Allow-Methods` estén correctamente configuradas.

2. **Preflight request:**
   Si la solicitud realiza un método HTTP que no sea `GET` o `POST` (por ejemplo, `PUT`, `DELETE`, etc.), el navegador primero enviará una "solicitud preliminar" (`OPTIONS`) al servidor para verificar si está permitido.

   Si la respuesta del servidor no incluye las cabeceras correctas para permitir este tipo de solicitud, el navegador bloquea la solicitud real.

   **Solución:**
   Asegúrate de que el servidor incluya cabeceras como `Access-Control-Allow-Methods` y `Access-Control-Allow-Headers` en las respuestas a las solicitudes preliminares.

---

### **Inyección SQL**

#### **¿Qué es la Inyección SQL?**

La inyección SQL es un tipo de ataque que permite a un atacante ejecutar consultas SQL maliciosas en una base de datos. Esto sucede cuando una aplicación permite la entrada de datos del usuario sin validación o saneamiento adecuados y esos datos son luego incorporados directamente en las consultas SQL.

El atacante puede modificar las consultas para obtener información confidencial, modificar registros o incluso eliminar datos.

#### **Ejemplo de un ataque de Inyección SQL:**

Imagina una aplicación que recibe un nombre de usuario y una contraseña para autenticar a un usuario. Un código vulnerable podría ser algo como esto (en Node.js, por ejemplo):

```javascript
const username = req.body.username;
const password = req.body.password;

// Consulta vulnerable
const query = `SELECT * FROM users WHERE username = '${username}' AND password = '${password}'`;
```

Si un atacante introduce un valor como el siguiente en el campo de "usuario":

```sql
' OR '1'='1
```

La consulta SQL resultante sería:

```sql
SELECT * FROM users WHERE username = '' OR '1'='1' AND password = ''
```

Esto siempre devolvería un resultado verdadero y permitiría al atacante acceder a la aplicación sin conocer el nombre de usuario o la contraseña.

---

#### **Prevención de Inyección SQL:**

La mejor forma de prevenir la inyección SQL es **no confiar en los datos de entrada del usuario**. Hay varias estrategias para hacerlo:

1. **Uso de ORMs (Object-Relational Mapping):**
   Los ORMs permiten interactuar con la base de datos utilizando objetos y métodos, y no construyen consultas SQL manualmente. Esto ayuda a evitar la inyección SQL, ya que los datos del usuario se escapan automáticamente.

   Ejemplo con **Sequelize** (Node.js):

   ```javascript
   User.findOne({
     where: { username: req.body.username },
   });
   ```

   En este ejemplo, el ORM se encarga de construir la consulta de manera segura.

2. **Uso de consultas parametrizadas:**
   En lugar de construir consultas concatenando cadenas de texto, debes usar consultas parametrizadas, que permiten que los valores del usuario se pasen como parámetros separados y no formen parte de la consulta SQL directa.

   Ejemplo con **MySQL2** en Node.js:

   ```javascript
   const query = "SELECT * FROM users WHERE username = ? AND password = ?";
   connection.execute(query, [username, password], (err, results) => {
     // Procesar resultados
   });
   ```

   En este caso, el valor del `username` y el `password` se pasan como parámetros separados y no como parte de la cadena SQL.

3. **Escapado de datos de entrada:**
   Si no puedes usar ORMs o consultas parametrizadas, asegúrate de escapar correctamente los datos de entrada. Esto asegura que los datos no se interpreten como código SQL.

   Por ejemplo, en **Node.js** con **mysql2**:

   ```javascript
   const escapedUsername = mysql.escape(username);
   const escapedPassword = mysql.escape(password);
   const query = `SELECT * FROM users WHERE username = ${escapedUsername} AND password = ${escapedPassword}`;
   ```

   De todas formas, esta es una solución menos recomendada que el uso de consultas parametrizadas.

4. **Principio de privilegios mínimos:**
   Asegúrate de que las credenciales de acceso a la base de datos solo tengan los permisos necesarios. Si una aplicación solo necesita leer datos, la cuenta de acceso a la base de datos no debería tener permisos de escritura o eliminación.

5. **Uso de Stored Procedures (Procedimientos Almacenados):**
   Los procedimientos almacenados pueden ayudar a prevenir la inyección SQL, ya que las consultas son predefinidas y no permiten la ejecución dinámica de código SQL basado en la entrada del usuario. Sin embargo, esto también depende de cómo se implementen.

### **XSS (Cross-Site Scripting)**

#### **¿Qué es XSS?**

El Cross-Site Scripting (XSS) es una vulnerabilidad que permite a los atacantes inyectar scripts maliciosos en páginas web vistas por otros usuarios. Estos scripts se ejecutan en el navegador de la víctima, lo que puede llevar al robo de información sensible, como cookies o credenciales de sesión, redireccionamientos a sitios maliciosos, o la ejecución de acciones no autorizadas en nombre del usuario.

Los atacantes aprovechan XSS para manipular el contenido de las páginas web y su interacción con los usuarios, sin necesidad de vulnerar el servidor de la aplicación.

#### **Tipos de XSS:**

1. **XSS Reflejado (Reflected XSS):**
   Este tipo de XSS ocurre cuando el script malicioso es inyectado a través de parámetros de URL o formularios y es reflejado directamente en la respuesta del servidor. El atacante engaña a la víctima para que haga clic en un enlace malicioso.

   Ejemplo:
   Un enlace que contiene un parámetro como este:

   ```
   http://miapp.com/buscar?query=<script>alert('XSS')</script>
   ```

   Si la aplicación refleja el parámetro `query` sin sanitizarlo, el script se ejecutará en el navegador de la víctima.

2. **XSS Almacenado (Stored XSS):**
   En este caso, el script malicioso se guarda en el servidor (por ejemplo, en una base de datos) y luego es ejecutado cada vez que se visualiza el contenido afectado. Este es el tipo más peligroso de XSS, ya que el atacante puede comprometer la seguridad de todos los usuarios que visiten la página afectada.

   Ejemplo:
   Un usuario inserta un comentario malicioso con un script en una sección de comentarios de un blog. Si no se valida y sana adecuadamente, otros usuarios que vean el comentario ejecutarán el script sin saberlo.

3. **XSS DOM-based (DOM-based XSS):**
   Ocurre cuando el script malicioso es inyectado y ejecutado en el lado del cliente (en el navegador) al manipular el Document Object Model (DOM) de la página. Este tipo de XSS no depende de una respuesta del servidor, sino de cómo el navegador procesa y manipula la página.

   Ejemplo:

   ```javascript
   var searchQuery = window.location.hash.substring(1); // Obtiene el parámetro de la URL
   document.getElementById("resultado").innerHTML = searchQuery; // Muestra el valor en la página
   ```

   Si el parámetro en la URL es algo como `#<script>alert('XSS')</script>`, el script se ejecutará.

---

#### **Prevención de XSS:**

1. **Validación y Saneamiento de Entradas:**
   Una de las medidas más efectivas es validar y sanear todas las entradas del usuario, es decir, asegurarse de que los datos introducidos no contengan código malicioso.

   - **Validación** significa verificar que los datos sean del tipo esperado (por ejemplo, una dirección de correo electrónico o un número de teléfono).
   - **Saneamiento** significa eliminar o escapar cualquier contenido peligroso (por ejemplo, etiquetas `<script>` o eventos `onmouseover`).

   Una herramienta útil para sanitizar el HTML es **DOMPurify**, que limpia cualquier entrada HTML antes de que sea procesada.

   Ejemplo en JavaScript:

   ```javascript
   const sanitizedInput = DOMPurify.sanitize(userInput);
   ```

2. **Escapar caracteres especiales:**
   Siempre que se inserte contenido de usuario en el HTML, debes escapar caracteres especiales como `<`, `>`, `&`, `'`, y `"` para que no se interpreten como HTML o JavaScript.

   Por ejemplo, en lugar de permitir que se inyecte directamente código, convierte los caracteres especiales en sus equivalentes HTML:

   ```javascript
   const userInput = '<script>alert("XSS")</script>';
   const escapedInput = userInput.replace(/</g, "&lt;").replace(/>/g, "&gt;");
   ```

3. **Uso de Content Security Policy (CSP):**
   La **CSP** es una cabecera HTTP que ayuda a mitigar el riesgo de XSS al controlar los recursos que un navegador puede cargar en una página web.

   Ejemplo de una política CSP:

   ```http
   Content-Security-Policy: default-src 'self'; script-src 'self' https://apis.google.com;
   ```

   Esto restringe la carga de scripts solo desde el dominio actual (`'self'`) o desde `apis.google.com`, evitando la ejecución de scripts inyectados.

4. **No permitir la ejecución de JavaScript en áreas donde no se debe:**
   Evita usar `innerHTML` para insertar contenido del usuario en el DOM, ya que esto puede permitir la ejecución de código malicioso. En su lugar, usa métodos más seguros como `textContent` o `createElement` para crear elementos.

   Ejemplo:

   ```javascript
   const el = document.createElement("div");
   el.textContent = userInput; // Esto previene la ejecución de scripts
   document.body.appendChild(el);
   ```

### **CSRF (Cross-Site Request Forgery)**

#### **¿Qué es CSRF?**

El Cross-Site Request Forgery (CSRF) es un tipo de ataque en el que un atacante engaña a un usuario autenticado para que realice acciones no deseadas en un sitio web en el que está autenticado. A través de un enlace o una petición maliciosa, el atacante puede hacer que el navegador del usuario envíe una solicitud a un servidor en el que el usuario ya esté autenticado, aprovechando la sesión activa del usuario.

En un ataque CSRF, el atacante no necesita conocer las credenciales del usuario, pero puede ejecutar acciones en su nombre, como cambiar la contraseña, transferir dinero, o realizar compras.

#### **Ejemplo de un ataque CSRF:**

Supón que un usuario está autenticado en un sitio web bancario. Un atacante le envía un enlace como este:

```
http://banco.com/transferir?destino=123456&cantidad=1000
```

Si el usuario hace clic en este enlace mientras está autenticado en el sitio bancario, el navegador enviará la solicitud a `http://banco.com/transferir` con los parámetros `destino` y `cantidad`, y si el banco no tiene protección, podría procesarse la transferencia sin que el usuario lo sepa.

---

#### **Prevención de CSRF:**

1. **Uso de Tokens CSRF:**
   La forma más común de protegerse contra CSRF es utilizando un **token CSRF**, que es un valor único y aleatorio que se asocia con cada sesión de usuario y debe ser enviado junto con cada solicitud crítica (por ejemplo, formularios de cambio de contraseña o de transferencia de dinero).

   Cuando el servidor recibe la solicitud, verifica que el token en la solicitud coincida con el token almacenado en la sesión del usuario. Si no coinciden, la solicitud es rechazada.

   Ejemplo en un formulario HTML:

   ```html
   <form action="/cambiar-contrasena" method="POST">
     <input type="hidden" name="csrf_token" value="{{ csrf_token }}" />
     <input type="password" name="new_password" required />
     <button type="submit">Cambiar Contraseña</button>
   </form>
   ```

   En el servidor, el token se valida:

   ```python
   if request.form['csrf_token'] != session['csrf_token']:
       abort(403)  # Solicitud inválida
   ```

2. **Verificación de la cabecera `Referer`:**
   El servidor puede verificar la cabecera HTTP `Referer` para asegurarse de que la solicitud provenga de una página legítima del sitio. Si el valor de `Referer` no coincide con el dominio esperado, se puede rechazar la solicitud.

   Aunque no es completamente infalible (ya que los atacantes pueden falsificar la cabecera en algunos casos), es una capa adicional de seguridad.

3. **Uso de SameSite Cookies:**
   La directiva **SameSite** en las cookies ayuda a prevenir que las cookies se envíen en solicitudes cross-site (de otro dominio), lo que dificulta que los atacantes puedan aprovechar la sesión del usuario.

   Puedes configurar las cookies con el atributo `SameSite` en tus respuestas HTTP:

   ```http
   Set-Cookie: sessionid=abc123; SameSite=Strict; HttpOnly;
   ```

   - `SameSite=Strict`: La cookie solo se envía en solicitudes al mismo sitio.
   - `SameSite=Lax`: La cookie se envía en solicitudes GET de navegación, pero no en solicitudes POST o en solicitudes de formularios.
   - `SameSite=None`: La cookie se envía en solicitudes cross-site, pero debe estar marcada como `Secure` (solo se enviará a través de HTTPS).

4. **Verificación de métodos HTTP:**
   Los ataques CSRF a menudo se realizan con métodos HTTP no seguros, como `GET` o `POST`. Es una buena práctica limitar las solicitudes sensibles a los métodos `POST`, `PUT` o `DELETE` y asegurarse de que las solicitudes de lectura (como `GET`) no alteren datos.

   Además, es recomendable que las operaciones críticas, como las transferencias de dinero o la modificación de contraseñas, solo se realicen a través de solicitudes con `POST`, que deberían incluir un token CSRF.

### **HTTPS (Hypertext Transfer Protocol Secure)**

#### **¿Qué es HTTPS?**

HTTPS es una versión segura de HTTP (Hypertext Transfer Protocol), el protocolo utilizado para la comunicación entre navegadores y servidores web. La "S" en HTTPS significa "Secure" y se refiere a la capa de seguridad que proporciona mediante el uso de **SSL/TLS** (Secure Sockets Layer / Transport Layer Security).

El principal objetivo de HTTPS es cifrar los datos que se transmiten entre el cliente (usuario) y el servidor para garantizar la **confidencialidad**, la **integridad** y la **autenticidad** de la comunicación. Esto evita que los datos puedan ser interceptados o manipulados por atacantes.

#### **¿Por qué es importante HTTPS?**

1. **Confidencialidad:** Los datos transmitidos están cifrados, por lo que no pueden ser leídos por personas no autorizadas (por ejemplo, en un ataque de "man-in-the-middle").
2. **Integridad:** Asegura que los datos no hayan sido alterados o corrompidos durante la transmisión.

3. **Autenticidad:** Verifica que el servidor con el que el cliente está comunicándose es realmente el servidor legítimo, y no un atacante que intenta suplantarlo.

---

#### **Certificados SSL/TLS:**

Para habilitar HTTPS en un sitio web, es necesario instalar un **certificado SSL/TLS** en el servidor. Este certificado asegura que las comunicaciones entre el cliente y el servidor estén cifradas.

Un certificado SSL/TLS contiene:

- La **clave pública** que se utiliza para cifrar la información.
- La **firma digital** de una **autoridad certificadora (CA)** que valida la autenticidad del sitio web.

Cuando un usuario visita un sitio web con HTTPS, el navegador realiza un proceso llamado **"handshake"** (apretón de manos) para verificar la validez del certificado y establecer una conexión segura.

---

#### **Generación de Certificados SSL (Let's Encrypt):**

Una de las formas más populares de obtener un certificado SSL gratuito es a través de **Let's Encrypt**, una autoridad certificadora que proporciona certificados SSL/TLS de forma automática y gratuita.

Para generar e instalar un certificado SSL de Let's Encrypt, generalmente se utiliza una herramienta llamada **Certbot**. Aquí hay un ejemplo básico de cómo usar Certbot con Nginx:

1. Instalar Certbot:

   ```bash
   sudo apt update
   sudo apt install certbot python3-certbot-nginx
   ```

2. Obtener el certificado SSL:

   ```bash
   sudo certbot --nginx
   ```

   Certbot detectará automáticamente tu configuración de Nginx y te pedirá que elijas qué dominios deseas asegurar. Después de la validación, Certbot instalará el certificado SSL y configurará Nginx para usar HTTPS.

3. Renovación automática:
   Los certificados de Let's Encrypt son válidos por 90 días, pero Certbot puede renovar el certificado automáticamente con el siguiente comando:

   ```bash
   sudo certbot renew
   ```

   También puedes configurar una tarea cron para que se ejecute periódicamente.

---

#### **Configuración básica en servidores (Nginx y Apache):**

**Nginx:**
Para habilitar HTTPS en Nginx, después de instalar el certificado SSL, necesitas configurar el bloque de servidor de la siguiente manera:

```nginx
server {
    listen 80;
    server_name ejemplo.com www.ejemplo.com;

    # Redireccionar HTTP a HTTPS
    return 301 https://$host$request_uri;
}

server {
    listen 443 ssl;
    server_name ejemplo.com www.ejemplo.com;

    ssl_certificate /etc/letsencrypt/live/ejemplo.com/fullchain.pem;
    ssl_certificate_key /etc/letsencrypt/live/ejemplo.com/privkey.pem;

    ssl_protocols TLSv1.2 TLSv1.3;
    ssl_ciphers 'ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-RSA-AES128-GCM-SHA256:...';

    # Configuración adicional de seguridad
    ssl_prefer_server_ciphers on;

    # Resto de la configuración
}
```

**Apache:**
Para habilitar HTTPS en Apache, habilitas los módulos necesarios y configuras el archivo `000-default.conf`:

1. Habilitar los módulos SSL:

   ```bash
   sudo a2enmod ssl
   sudo a2ensite default-ssl
   ```

2. Editar la configuración:

   ```apache
   <VirtualHost *:443>
       ServerAdmin webmaster@ejemplo.com
       ServerName ejemplo.com
       DocumentRoot /var/www/html

       SSLEngine on
       SSLCertificateFile /etc/letsencrypt/live/ejemplo.com/fullchain.pem
       SSLCertificateKeyFile /etc/letsencrypt/live/ejemplo.com/privkey.pem

       # Configuración adicional de seguridad
       SSLProtocol all -SSLv2 -SSLv3
       SSLCipherSuite HIGH:!aNULL:!MD5
   </VirtualHost>
   ```

3. Reiniciar Apache:
   ```bash
   sudo systemctl restart apache2
   ```

---

#### **Ventajas de HTTPS:**

1. **Mejor clasificación en motores de búsqueda:** Google da preferencia a los sitios web con HTTPS, mejorando el SEO.
2. **Confianza del usuario:** Los navegadores muestran un candado verde o un indicador visual de seguridad para los sitios con HTTPS, lo que genera confianza en los usuarios.
3. **Protección contra ataques Man-in-the-Middle:** HTTPS cifra la comunicación, evitando que los atacantes puedan interceptar o modificar los datos transmitidos.

### **Cifrado básico**

#### **¿Qué es el cifrado?**

El **cifrado** es el proceso de convertir datos legibles (texto claro) en un formato ilegible (texto cifrado) utilizando un algoritmo y una clave. El objetivo del cifrado es proteger la confidencialidad de los datos, de manera que solo aquellos con la clave adecuada puedan descifrarlos y obtener el formato original.

Existen dos tipos principales de cifrado:

1. **Cifrado simétrico**: Utiliza la misma clave para cifrar y descifrar los datos.
2. **Cifrado asimétrico**: Utiliza un par de claves: una clave pública para cifrar los datos y una clave privada para descifrarlos.

---

#### **1. Hashing de contraseñas (bcrypt):**

El **hashing** es una técnica de cifrado unidireccional, es decir, que convierte los datos en un valor fijo de longitud (el "hash"), pero no puede ser revertido para obtener el valor original.

El hashing es particularmente útil para almacenar contraseñas, ya que nunca debes almacenar la contraseña en texto claro. En lugar de eso, almacenas el **hash** de la contraseña y lo comparas con el hash ingresado por el usuario durante el inicio de sesión.

**bcrypt** es un algoritmo de hashing diseñado para ser lento, lo que dificulta los ataques de fuerza bruta (intentos de adivinar la contraseña probando todas las combinaciones posibles).

**Proceso de hashing con bcrypt:**

1. El algoritmo **bcrypt** genera un **sal** aleatorio (un valor único) que se usa junto con la contraseña para crear el hash.
2. El hash resultante incluye el sal, lo que hace que incluso contraseñas idénticas tengan hashes diferentes.

Ejemplo de cómo generar un hash con **bcrypt** en Python:

```python
import bcrypt

# Generar un sal
salt = bcrypt.gensalt()

# Hash de la contraseña
password = b"miContraseñaSecreta"
hashed = bcrypt.hashpw(password, salt)

# Verificar el hash
if bcrypt.checkpw(password, hashed):
    print("¡Contraseña correcta!")
else:
    print("Contraseña incorrecta.")
```

La principal ventaja de bcrypt es su capacidad para hacer que los cálculos de hashing sean lentos, lo que hace más difícil que los atacantes realicen ataques de fuerza bruta.

---

#### **2. Cifrado simétrico (AES):**

El **cifrado simétrico** utiliza la misma clave para cifrar y descifrar los datos. Un ejemplo común de cifrado simétrico es el **AES (Advanced Encryption Standard)**, que es muy utilizado en criptografía moderna debido a su eficiencia y seguridad.

**Proceso de cifrado simétrico con AES:**

1. Se utiliza una clave secreta (por ejemplo, 128, 192 o 256 bits).
2. El algoritmo cifra los datos con la clave y genera un texto cifrado.
3. Para descifrar los datos, se necesita la misma clave.

Ejemplo de cómo cifrar y descifrar con **AES** en Python utilizando la librería `pycryptodome`:

```python
from Crypto.Cipher import AES
from Crypto.Util.Padding import pad, unpad
from Crypto.Random import get_random_bytes

# Generar una clave aleatoria de 16 bytes (128 bits)
key = get_random_bytes(16)

# Crear el cifrador AES en modo CBC
cipher = AES.new(key, AES.MODE_CBC)

# Datos a cifrar
data = b"Mensaje secreto"

# Asegurarse de que los datos tengan un tamaño múltiplo de 16 bytes
ciphertext = cipher.encrypt(pad(data, AES.block_size))

# Para descifrar los datos
decipher = AES.new(key, AES.MODE_CBC, iv=cipher.iv)
original_data = unpad(decipher.decrypt(ciphertext), AES.block_size)

print("Texto cifrado:", ciphertext)
print("Texto original:", original_data.decode())
```

En este ejemplo:

- **`pad` y `unpad`** aseguran que los datos tengan un tamaño adecuado para el cifrado (en múltiplos de 16 bytes).
- **`AES.MODE_CBC`** es uno de los modos de operación más comunes, que utiliza un vector de inicialización (IV) para garantizar que el mismo mensaje cifrado con la misma clave sea diferente cada vez.

**Ventajas del cifrado simétrico (AES):**

- **Eficiencia**: Es más rápido que el cifrado asimétrico.
- **Seguridad**: AES es considerado muy seguro cuando se utiliza con claves adecuadas.

---

#### **3. Cifrado asimétrico (RSA):**

El **cifrado asimétrico** utiliza un par de claves: una clave pública para cifrar y una clave privada para descifrar. Solo la clave privada puede descifrar los datos cifrados con la clave pública, lo que permite realizar comunicaciones seguras sin necesidad de compartir una clave secreta de antemano.

**Proceso de cifrado asimétrico con RSA:**

1. Se genera un par de claves: una clave pública y una clave privada.
2. La clave pública se usa para cifrar los datos.
3. Solo la clave privada puede descifrar esos datos.

Ejemplo de cifrado y descifrado con **RSA** en Python utilizando la librería `pycryptodome`:

```python
from Crypto.PublicKey import RSA
from Crypto.Cipher import PKCS1_OAEP
from Crypto.Random import get_random_bytes

# Generar un par de claves RSA
key = RSA.generate(2048)
private_key = key
public_key = key.publickey()

# Crear el cifrador con la clave pública
cipher = PKCS1_OAEP.new(public_key)

# Datos a cifrar
data = b"Mensaje secreto con RSA"

# Cifrar los datos
ciphertext = cipher.encrypt(data)

# Crear el descifrador con la clave privada
decipher = PKCS1_OAEP.new(private_key)

# Descifrar los datos
original_data = decipher.decrypt(ciphertext)

print("Texto cifrado:", ciphertext)
print("Texto original:", original_data.decode())
```

**Ventajas del cifrado asimétrico (RSA):**

- **Seguridad sin compartir claves**: La clave pública se puede compartir abiertamente, mientras que la clave privada permanece secreta.
- **Uso en firmas digitales**: RSA se usa para autenticar mensajes a través de firmas digitales.

---

#### **4. Tokens de acceso (JWT - JSON Web Tokens):**

Los **JWT** son una forma compacta y segura de transmitir información entre dos partes, como un servidor y un cliente, en forma de un objeto JSON que puede ser firmado y, opcionalmente, cifrado.

**Estructura de un JWT:**
Un JWT consta de tres partes:

1. **Header**: Contiene el tipo de token (JWT) y el algoritmo de cifrado (como HS256 o RS256).
2. **Payload**: Contiene los datos o claims (información que se está transmitiendo).
3. **Signature**: Se utiliza para verificar que el token no haya sido alterado.

Ejemplo de un JWT en Python usando `pyjwt`:

```python
import jwt
import datetime

# Clave secreta para firmar el token
secret_key = "miClaveSecreta"

# Datos a incluir en el token
payload = {
    "user_id": 123,
    "exp": datetime.datetime.utcnow() + datetime.timedelta(hours=1)  # Expira en 1 hora
}

# Crear el token JWT
token = jwt.encode(payload, secret_key, algorithm="HS256")

# Verificar y decodificar el token
decoded_payload = jwt.decode(token, secret_key, algorithms=["HS256"])

print("Token JWT:", token)
print("Datos decodificados:", decoded_payload)
```

### **Buenas prácticas de seguridad**

#### **¿Por qué son importantes las buenas prácticas de seguridad?**

Las **buenas prácticas de seguridad** son esenciales para garantizar que las aplicaciones y sistemas sean robustos y resistentes frente a amenazas. Implementar estas prácticas ayuda a proteger la información sensible, evitar brechas de seguridad y cumplir con las normativas y regulaciones de privacidad.

Aquí se abordan algunas de las mejores prácticas para mantener una buena postura de seguridad en tus aplicaciones web y sistemas.

---

#### **1. Configuración de cabeceras HTTP seguras:**

Las **cabeceras HTTP** son elementos clave en las solicitudes y respuestas entre el servidor y el cliente. Algunas cabeceras pueden ayudar a proteger tu sitio web contra varios tipos de ataques, como XSS, clickjacking y ataques de inyección.

Algunas de las cabeceras más importantes para la seguridad son:

- **Content-Security-Policy (CSP):**
  La cabecera **CSP** es una medida de seguridad que permite a los desarrolladores controlar qué recursos pueden cargarse y ejecutarse en su página. Esto ayuda a prevenir ataques como **XSS** al restringir qué scripts se pueden ejecutar.

  Ejemplo de configuración de CSP:

  ```http
  Content-Security-Policy: default-src 'self'; script-src 'self' https://apis.example.com; object-src 'none'; report-uri /csp-violation-report-endpoint/
  ```

  En este ejemplo:

  - **`default-src 'self'`**: Solo permite cargar recursos del mismo dominio.
  - **`script-src 'self' https://apis.example.com`**: Permite cargar scripts solo desde el mismo dominio o desde `apis.example.com`.
  - **`object-src 'none'`**: Bloquea la carga de objetos (como Flash).
  - **`report-uri`**: Indica la URL donde se deben enviar los informes de violación de CSP.

- **Strict-Transport-Security (HSTS):**
  La cabecera **HSTS** instruye a los navegadores para que siempre accedan al sitio a través de HTTPS, incluso si el usuario intenta hacerlo mediante HTTP. Esto ayuda a prevenir ataques de **downgrade** de HTTP a HTTP no seguro.

  Ejemplo de configuración de HSTS:

  ```http
  Strict-Transport-Security: max-age=31536000; includeSubDomains
  ```

  - **`max-age=31536000`**: La directiva indica que el navegador debe recordar durante 1 año que solo debe acceder al sitio a través de HTTPS.
  - **`includeSubDomains`**: Aplica HSTS a todos los subdominios del sitio.

- **X-Content-Type-Options:**
  Esta cabecera evita que los navegadores realicen "sniffing" de los tipos de contenido, lo que previene la ejecución de archivos con tipos MIME incorrectos, reduciendo el riesgo de ataques.

  Ejemplo de configuración:

  ```http
  X-Content-Type-Options: nosniff
  ```

- **X-Frame-Options:**
  La cabecera **X-Frame-Options** previene que tu sitio sea cargado dentro de un iframe, lo que ayuda a evitar ataques de **clickjacking**.

  Ejemplo de configuración:

  ```http
  X-Frame-Options: DENY
  ```

- **X-XSS-Protection:**
  La cabecera **X-XSS-Protection** protege contra ataques **XSS** habilitando el filtro de XSS del navegador.

  Ejemplo de configuración:

  ```http
  X-XSS-Protection: 1; mode=block
  ```

---

#### **2. Revisión de dependencias vulnerables:**

Las dependencias de terceros (librerías, frameworks, etc.) pueden ser una fuente importante de vulnerabilidades. Asegurarse de que las dependencias no contengan vulnerabilidades conocidas es una parte crítica de la seguridad.

- **npm audit** (para proyectos Node.js):
  `npm audit` es una herramienta que analiza las dependencias del proyecto para encontrar vulnerabilidades conocidas en ellas. Puedes ejecutarla con:

  ```bash
  npm audit
  ```

  Para aplicar las correcciones automáticamente, puedes usar:

  ```bash
  npm audit fix
  ```

- **Snyk**:
  Snyk es otra herramienta que puede analizar tus dependencias y ayudarte a encontrar vulnerabilidades conocidas. Snyk proporciona una versión gratuita con análisis de seguridad de código abierto.

  Para usar Snyk:

  ```bash
  snyk test
  ```

  Si Snyk encuentra vulnerabilidades, proporcionará recomendaciones sobre cómo solucionarlas.

---

#### **3. Monitorización de actividad sospechosa:**

La monitorización constante de tus sistemas es vital para detectar comportamientos inusuales o potencialmente maliciosos. Algunas técnicas y herramientas comunes incluyen:

- **Logs y auditoría:** Registra todas las actividades relevantes en tu sistema, como inicio de sesión, acceso a recursos sensibles, cambios de configuración, etc. Los logs deben ser revisados periódicamente para detectar patrones sospechosos.
- **Herramientas de monitoreo:** Existen diversas herramientas para monitorear tus aplicaciones y servidores en busca de actividades sospechosas, tales como:

  - **Prometheus** + **Grafana** para monitoreo de métricas.
  - **Fail2ban** para proteger tus servidores contra intentos de acceso no autorizado.
  - **OSSEC** (sistema de detección de intrusos basado en host) para monitorear y detectar actividades inusuales.

- **Alertas y notificaciones:** Configura alertas cuando se detecten patrones anormales, como intentos fallidos de inicio de sesión o accesos a archivos sensibles desde direcciones IP inusuales.

---

### **Resumen de buenas prácticas de seguridad:**

1. Configurar cabeceras HTTP de seguridad (CSP, HSTS, X-Content-Type-Options, X-Frame-Options, X-XSS-Protection).
2. Realizar revisiones periódicas de dependencias vulnerables mediante herramientas como `npm audit` o **Snyk**.
3. Monitorizar la actividad del sistema para detectar accesos no autorizados o comportamientos inusuales mediante logs, herramientas de monitoreo y alertas.
