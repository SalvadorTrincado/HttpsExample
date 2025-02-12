package com.salvador;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Clase principal que demuestra cómo realizar una solicitud HTTPS en Java.
 */
public class HttpsExample {

    /**
     * Metodo principal que ejecuta la solicitud HTTPS.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        // URL de la API a la que haremos la solicitud HTTPS
        String httpsURL = "https://jsonplaceholder.typicode.com/posts/1";

        try {
            // Crear un objeto URL a partir de la cadena de texto
            URL url = new URL(httpsURL);

            // Abrir una conexión HTTPS
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

            // Configurar el metodo de solicitud (GET en este caso)
            connection.setRequestMethod("GET");

            // Obtener el código de respuesta del servidor
            int responseCode = connection.getResponseCode();
            System.out.println("Código de respuesta: " + responseCode);

            // Si la respuesta es exitosa (código 200), leer la respuesta
            if (responseCode == HttpsURLConnection.HTTP_OK) {
                // Leer la respuesta del servidor
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                // Leer línea por línea y almacenar en un StringBuilder
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Mostrar la respuesta en la consola
                System.out.println("Respuesta del servidor:");
                System.out.println(response.toString());
            } else {
                System.out.println("Error en la solicitud. Código: " + responseCode);
            }
        } catch (IOException e) {
            // Manejar excepciones de conexión o lectura
            System.out.println("Ocurrió un error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
