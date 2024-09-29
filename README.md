# Proyecto E2E con Serenity, Cucumber y Gradle

Este repositorio contiene un proyecto de pruebas automatizadas end-to-end (E2E) utilizando **Serenity BDD**, **Cucumber** y **Gradle**. El objetivo principal es proporcionar una base sólida para realizar pruebas automatizadas de flujo completo en aplicaciones web, manteniendo una arquitectura modular y fácilmente escalable.

## Prerequisitos
Para configurar y ejecutar el proyecto en tu máquina local, asegúrate de tener instaladas las siguientes dependencias:

- **Sistema Operativo:** Windows 10 o Windows 11
- **IDE:** IntelliJ IDEA versión 2023.1
- **JDK:** versión 1.8 (debe estar configurado en la variable de entorno JAVA_HOME)
- **Gradle:** versión 7.6.1 (se puede utilizar el wrapper proporcionado)
- **Google Chrome:** versión 129.0.6668.70 (asegúrate de tener ChromeDriver compatible)

## Tecnologías Utilizadas:
- **Serenity BDD:** Framework para la escritura y gestión de pruebas con reportes detallados y fáciles de leer.
- **Cucumber:** Permite la escritura de casos de prueba en un formato BDD utilizando el lenguaje Gherkin.
- **Screenplay:** Un patrón de diseño de pruebas centrado en las interacciones de los actores, que facilita la escritura de pruebas altamente mantenibles y reutilizables.
- **Gradle:** Sistema de automatización de compilación y gestión de dependencias.
  
## Características Principales:
- **Screenplay Pattern:** Implementación del patrón Screenplay, que organiza las pruebas en términos de actores y tareas, mejorando la legibilidad y mantenibilidad de las pruebas.
- **Modularidad**: Separación clara entre la lógica de tareas, runners, definiciones de pasos, y mapeos de la interfaz de usuario.
- **Escalabilidad**: Estructura diseñada para crecer a medida que se agregan más pruebas y funcionalidades.
- **Automatización de Navegación**: Manejo de la lógica de navegación entre diferentes páginas o secciones de la aplicación.
- **Serenity Reports**: Reportes automáticos y detallados de cada ejecución de prueba, generados en `target/site/serenity`.

## Cómo Ejecutar el Proyecto
Para descargar las dependencias y compilar el proyecto, sigue los siguientes pasos:

### 1. Clonar el repositorio:
   ```bash
  git clone https://github.com/E1R0N/proyecto-e2e-serenity.git
  cd proyecto-e2e-serenity
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

## Información Adicional
- **Drivers:** Asegúrate de que el ChromeDriver utilizado sea compatible con la versión de Google Chrome instalada en tu máquina local (v129.0.6668.70). La configuración del build.gradle ya está preparada para descargar el ChromeDriver adecuado.

- **Estructura del proyecto:** El proyecto está estructurado de manera modular, separando la lógica de los tests (Cucumber Steps y Feature files), las páginas web (Page Objects) y las definiciones del navegador (Drivers).

