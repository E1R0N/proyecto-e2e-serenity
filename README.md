# Proyecto E2E con Serenity, Cucumber y Gradle

Este repositorio contiene un proyecto de pruebas automatizadas end-to-end (E2E) utilizando **Serenity BDD**, **Cucumber** y **Gradle**. El objetivo principal es proporcionar una base sólida para realizar pruebas automatizadas de flujo completo en aplicaciones web, manteniendo una arquitectura modular y fácilmente escalable.

## Tecnologías Utilizadas:
- **Serenity BDD**: Framework para la escritura y gestión de pruebas con reportes detallados y fáciles de leer.
- **Cucumber**: Permite la escritura de casos de prueba en un formato BDD utilizando el lenguaje Gherkin.
- **Gradle**: Sistema de automatización de compilación y gestión de dependencias.
  
## Características Principales:
- **Modularidad**: Separación clara entre la lógica de tareas, runners, definiciones de pasos, y mapeos de la interfaz de usuario.
- **Escalabilidad**: Estructura diseñada para crecer a medida que se agregan más pruebas y funcionalidades.
- **Automatización de Navegación**: Manejo de la lógica de navegación entre diferentes páginas o secciones de la aplicación.
- **Serenity Reports**: Reportes automáticos y detallados de cada ejecución de prueba, generados en `target/site/serenity`.

## Requisitos:
- **JDK 1.8** o superior.
- **Gradle 7.6.1** o superior.
- **ChromeDriver** compatible con la versión de Google Chrome utilizada (v129.0.6668.70).

## Cómo Ejecutar el Proyecto
### 1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/proyecto-e2e-serenity.git
  ```
### 2. Ejecutar el archivo `build.gradle`:
El archivo `build.gradle` contiene la configuración de dependencias y tareas necesarias para ejecutar las pruebas.

Para descargar todas las dependencias y compilar el proyecto, ejecuta el siguiente comando desde la raíz del proyecto:
```bash
./gradlew build
```
Este comando también verificará la integridad del proyecto y generará los artefactos necesarios.
### 3. Ejecutar las pruebas con Gradle:
Una vez que el proyecto esté compilado y listo, puedes ejecutar todas las pruebas automatizadas con el siguiente comando:
```bash
./gradlew clean test
```
El comando clean asegura que se eliminen los archivos generados previamente, y el comando test ejecuta todas las pruebas de Cucumber integradas con Serenity. Después de la ejecución, se generarán reportes automáticos.
### 4. Ver los reportes de pruebas:
Después de ejecutar las pruebas, puedes visualizar los reportes detallados generados por Serenity en la siguiente ruta:
```bash
target/site/serenity/index.html
```
