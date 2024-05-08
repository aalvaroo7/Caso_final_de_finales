package Ejercicio5;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cargar la lista de usuarios de un fichero
        List<UserAccount> users = cargarUsuariosDesdeArchivo();

        // Menú de opciones
        int opcion;
        do {
            opcion = mostrarMenuYObtenerOpcion();
            switch (opcion) {
                case 1:
                    cargarUsuario(users);
                    break;
                case 2:
                    publicarTweet();
                    break;
                case 3:
                    ordenarUsuariosPorEmail();
                    break;
                case 4:
                    ordenarUsuariosPorAlias();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }

    private static List<UserAccount> cargarUsuariosDesdeArchivo() {
        // Implementación de la carga de usuarios desde un archivo
        // Utilizar las estructuras de datos más adecuadas
        // Justificar el uso de dichas estructuras
    }

    private static int mostrarMenuYObtenerOpcion() {
        // Implementación del menú y obtención de la opción del usuario
        // Utilizar los métodos de la clase Utils para la lectura de datos
    }

    private static void cargarUsuario(List<UserAccount> users) {
        // Implementación de la carga de un usuario en memoria
        // Utilizar búsqueda secuencial con centinela
    }

    private static void publicarTweet() {
        // Implementación de la publicación de un tweet
        // Gestionar la excepción si el tweet supera los 140 caracteres
    }

    private static void ordenarUsuariosPorEmail() {
        // Implementación del ordenamiento de usuarios por email en orden ascendente
    }

    private static void ordenarUsuariosPorAlias() {
        // Implementación del ordenamiento de usuarios por alias
    }
}