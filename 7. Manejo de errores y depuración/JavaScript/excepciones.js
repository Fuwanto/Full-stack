// 1. Crea un script en JavaScript que lance y capture excepciones usando `try-catch` y que tenga un bloque `finally` para limpiar recursos.
try {
  throw new Error("Error lanzado");
} catch (error) {
  console.error("Error capturado:", error.message);
} finally {
  console.log("Limpiando recursos...");
}

// 2. Escribe un programa en JavaScript que use `try-catch` para manejar un error al parsear JSON mal formado.
try {
  JSON.parse('{"name": "John", "age": 30, "city": "New York"}');
  JSON.parse('{"name": "John", "age": 30, "city": "New York"'); // Error de sintaxis
} catch (error) {
  console.error("Error al parsear JSON:", error.message);
} finally {
  console.log("Limpiando recursos...");
}
