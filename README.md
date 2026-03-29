# Configuracion para el proyecto sistema de inventario - tienda de uniformes escolares

## Lo que necesitas instalar antes de abrir el proyecto

### 1. Java JDK 17 

El proyecto esta desarrollado en Java, asi que necesitas tener el JDK instalado en el computador

### 2. IntelliJ IDEA

Es el entorno de desarrollo que se uso para crear el proyecto

### 3. XAMPP

XAMPP es el programa que activa MySQL en tu computador de forma local y el puerto tiene que ser 3306.

### 4. MySQL Workbench

Es la herramienta para administrar la base de datos

---

## Configuracion de la base de datos

Una vez que tengas XAMPP con MySQL activo y MySQL Workbench, tiene que hacer lo siguiente:

Abre MySQL Workbench y ejecuta este comando en una consulta nueva:

    CREATE DATABASE tienda_uniformes;

---

## Configuracion del archivo de conexion

Dentro del proyecto, en la ruta src/main/resources/application.properties, encontraras el archivo de configuracion de la conexion los datos coincidan con tu configuracion local de MySQL:

    spring.datasource.url=jdbc:mysql://localhost:3306/tienda_uniformes
    spring.datasource.username=root
    spring.datasource.password=

---

## Como ejecutar el proyecto

Abre IntelliJ IDEA y selecciona la opcion File, luego Open, y busca la carpeta del proyecto espera a que IntelliJ descargue todas las dependencias automaticamente

Cuando termine de cargar, abre el archivo InventarioApplication.java que esta en src/main/java/com/tienda/inventario y haz clic en el boton de ejecutar. En la consola de IntelliJ veras un mensaje que dice algo como Started InventarioApplication in X seconds, eso indica que el servidor esta funcionando

Para verificar que todo esta bien, abre tu navegador y entra a:

    http://localhost:8080/api/productos
-
---

Desarrollado por Camilo Rodriguez Vargas
SENA - Analisis y Desarrollo de Software - 3134560