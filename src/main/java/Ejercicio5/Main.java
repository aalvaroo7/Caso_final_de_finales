package Ejercicio5;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
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
        List<UserAccount> users = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get("users.txt"));
            for (String line : lines) {
                String[] details = line.split(",");
                String alias = details[0];
                Email email = new Email(details[1]); // Assuming Email has a constructor that takes a String
                users.add(new UserAccount(alias, email));
            }
        } catch (IOException e) {
            System.out.println("Error reading users file: " + e.getMessage());
        }
        return users;
    }

    private static int mostrarMenuYObtenerOpcion() {
        System.out.println("1. Cargar usuario");
        System.out.println("2. Publicar tweet");
        System.out.println("3. Ordenar usuarios por email");
        System.out.println("4. Ordenar usuarios por alias");
        System.out.println("0. Salir");
        System.out.print("Ingrese la opción deseada: ");
        int opcion = Utils.readInt(); // Assuming Utils has a method to read integers
        return opcion;
    }

    private static void cargarUsuario(List<UserAccount> users) {
        System.out.print("Ingrese el alias del usuario: ");
        String alias = Utils.readString(); // Assuming Utils has a method to read strings
        System.out.print("Ingrese el email del usuario: ");
        String emailString = Utils.readString(); // Assuming Utils has a method to read strings
        Email email = new Email(emailString); // Assuming Email has a constructor that takes a String
        UserAccount user = new UserAccount(alias, email);
        users.add(user);
    }

    private static UserAccount buscarUsuario(List<UserAccount> users, String alias) {
        UserAccount sentinel = new UserAccount(alias, null); // Assuming UserAccount can have a null email
        users.add(sentinel);
        int i = 0;
        while (!users.get(i).getAlias().equals(alias)) {
            i++;
        }
        users.remove(sentinel);
        if (users.get(i) == sentinel) {
            return null;
        } else {
            return users.get(i);
        }
    }

    private static void publicarTweet(UserAccount user) {
        System.out.print("Ingrese el mensaje del tweet: ");
        String message = Utils.readString(); // Assuming Utils has a method to read strings
        if (message.length() > 140) {
            throw new IllegalArgumentException("El mensaje no puede tener más de 140 caracteres");
        }
        Tweet tweet = new Tweet(LocalDate.now(), message, user);
        user.getTweets().add(tweet);
    }

    private static void ordenarUsuariosPorEmail(List<UserAccount> users) {
        users.sort(Comparator.comparing(user -> user.getEmail().getAddress())); // Assuming Email has a getAddress method that returns the email address
    }

    private static void ordenarUsuariosPorAlias(List<UserAccount> users) {
        users.sort(Comparator.comparing(UserAccount::getAlias));
    }
}