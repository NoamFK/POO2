# Trabajo Práctico: Patrones de Diseño Creacionales
**Materia:** Programación Orientada a Objetos II

## 1. Requerimiento 1: Motor de Renderizado
* **Patrón elegido:** Factory Method (Simple Factory).
* **Justificación:** Es la solución adecuada porque permite crear objetos de tipo `Renderizador` (PDF, Excel, CSV) sin exponer la lógica de instanciación al cliente.
* **Problemas que evita:** Desacopla el código cliente de las clases concretas (`RenderizadorPDF`, etc.). Cumple con el principio Abierto/Cerrado: si mañana queremos agregar `ReporteXML`, solo creamos la clase y actualizamos la fábrica, sin tocar el código del módulo de Finanzas.

## 2. Requerimiento 2: Construcción de Reportes
* **Patrón elegido:** Builder.
* **Justificación:** Un objeto `Reporte` tiene una construcción compleja con parámetros obligatorios (título, cuerpo) y muchos opcionales (autor, fecha, etc.).
* **Problemas que evita:** Evita el anti-patrón del "Constructor Telescópico" (múltiples constructores sobrecargados) y evita tener que pasar `null` en los parámetros que no queremos usar. Hace el código mucho más legible.

## 3. Requerimiento 3: Gestor de Configuración
* **Patrón elegido:** Singleton.
* **Justificación:** Necesitamos garantizar que exista una única instancia de la configuración (URL de BD, paths) compartida por toda la aplicación.
* **Garantía de unicidad:** Se logra haciendo el constructor `private` y proveyendo un método estático `getInstancia()` que crea el objeto solo si no existe previamente.