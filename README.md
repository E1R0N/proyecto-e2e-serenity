# Proyecto E2E con Serenity, Cucumber y Gradle

Este repositorio contiene un proyecto de pruebas automatizadas end-to-end (E2E) utilizando **Serenity BDD**, **Cucumber** y **Gradle**. El objetivo principal es proporcionar una base sólida para realizar pruebas automatizadas de flujo completo en aplicaciones web, manteniendo una arquitectura modular y fácilmente escalable.

## Estructura del Proyecto:
El proyecto está organizado de la siguiente manera:

- **src/main**: Contiene el código fuente principal de la aplicación (vacío en esta plantilla, pero destinado para la lógica del sistema si es necesario).
- **src/test**:
  - **runners**: Aquí se encuentra el archivo `TestRunner`, que es el punto de entrada para la ejecución de las pruebas. Configura la integración entre **Serenity** y **Cucumber**, ejecutando los casos de prueba definidos en los archivos `.feature`.
  - **tasks**: Esta carpeta define las acciones que los usuarios pueden realizar en el sistema, como `AddProducts`, `DoLogin`, `DoCheckoutForm`, etc. Cada clase encapsula una tarea específica que será utilizada en los escenarios de prueba.
  - **navigation**: Aquí se define la lógica de navegación entre diferentes secciones de la aplicación web.
  - **userInterfaces**: Contiene los mapeos de la interfaz de usuario, permitiendo interactuar con los elementos web en la aplicación.
  - **stepDefinitions**: Define los pasos de Cucumber que enlazan los archivos `.feature` con el código de automatización.
- **resources**: Contiene archivos de configuración y otros recursos necesarios para la ejecución de las pruebas.
- **target**: Carpeta generada automáticamente para almacenar los reportes de ejecución y otros archivos temporales.

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

## Cómo Ejecutar las Pruebas:
1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/proyecto-e2e-serenity.git
