# Proyecto: HttpsExample

## Descripción
Este programa realiza una solicitud HTTPS a una API pública (`https://jsonplaceholder.typicode.com/posts/1`) y muestra en la consola:
- El código de respuesta HTTP.
- El contenido de la respuesta en formato JSON.

El objetivo es demostrar cómo usar `HttpsURLConnection` en Java para manejar solicitudes seguras.

## Requisitos
- Java 8 o superior.
- IntelliJ IDEA (opcional, cualquier IDE o terminal funciona).

## Instrucciones para ejecutar
1. Clona este repositorio o descarga los archivos.
2. Asegúrate de tener el JDK configurado en tu entorno.
3. Compila y ejecuta el archivo `HttpsExample.java`:
    - En IntelliJ: Haz clic en **Run**.
    - En terminal:
      ```bash
      javac HttpsExample.java
      java main.java.HttpsExample
      ```

## Empaquetar en un JAR
1. Configura un artefacto JAR en IntelliJ (ver documentación del proyecto).
2. Construye el proyecto.
3. Ejecuta el archivo JAR:
   ```bash
   java -jar HttpsExample.jar
    ```