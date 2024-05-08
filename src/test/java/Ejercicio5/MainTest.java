package Ejercicio5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
        // Este método se ejecuta antes de cada prueba.
        // Puedes usarlo para configurar cualquier estado necesario para tus pruebas.
    }

    @Test
    void testLoadUsersFromFile() {
        Main.loadUsersFromFile();
        assertFalse(Main.getUsers().isEmpty(), "After loading users from file, the user list should not be empty");
    }

    @Test
    void testShowMenuAndGetOption() {
        String input = "1\n"; // Simula la entrada del usuario
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        int option = Main.showMenuAndGetOption(scanner);
        assertEquals(1, option, "The returned option should be 1");
    }

    @Test
    void testLoadUserInMemory() {
        // Asegúrate de que el usuario con este alias exista en la lista de usuarios
        String testAlias = "existingUserAlias";

        // Simula la entrada del usuario
        ByteArrayInputStream in = new ByteArrayInputStream(testAlias.getBytes());
        System.setIn(in);

        Main.loadUserInMemory();
        assertNotNull(Main.getCurrentUser(), "After loading a user in memory, the current user should not be null");
    }
    @Test
    void testPublishTweet() {
        // Asegúrate de que el usuario con este alias exista en la lista de usuarios
        String testAlias = "existingUserAlias";

        // Simula la entrada del usuario
        ByteArrayInputStream in = new ByteArrayInputStream(testAlias.getBytes());
        System.setIn(in);

        Main.loadUserInMemory();
        UserAccount userBeforeTweet = Main.getCurrentUser();
        int initialTweetCount = userBeforeTweet.getTweets().size();

        // Simula la entrada del contenido del tweet
        String tweetContent = "Test tweet\n";
        ByteArrayInputStream tweetIn = new ByteArrayInputStream(tweetContent.getBytes());
        System.setIn(tweetIn);

        Main.publishTweet();
        UserAccount userAfterTweet = Main.getCurrentUser();
        int finalTweetCount = userAfterTweet.getTweets().size();

        assertEquals(initialTweetCount + 1, finalTweetCount, "After publishing a tweet, the tweet count of the current user should increase by 1");
    }

    @Test
    void testSentinelSearch() {
        // Asegúrate de que el usuario con este alias exista en la lista de usuarios
        String testAlias = "existingUserAlias";

        // Carga los usuarios desde el archivo
        Main.loadUsersFromFile();

        // Busca el usuario con el alias de prueba
        UserAccount user = Main.sentinelSearch(testAlias);

        // Verifica que el usuario devuelto no es nulo y tiene el alias correcto
        assertNotNull(user, "The returned user should not be null");
        assertEquals(testAlias, user.getAlias(), "The alias of the returned user should match the test alias");
    }

    @Test
    void testSortUsersByEmail() {
        // Carga los usuarios desde el archivo
        Main.loadUsersFromFile();

        // Ordena los usuarios por correo electrónico
        Main.sortUsersByEmail();

        // Obtiene la lista de usuarios
        List<UserAccount> users = Main.getUsers();

        // Verifica que la lista está ordenada por correo electrónico
        for (int i = 0; i < users.size() - 1; i++) {
            String email1 = users.get(i).getEmail().getAddress();
            String email2 = users.get(i + 1).getEmail().getAddress();
            assertTrue(email1.compareTo(email2) <= 0, "The users should be sorted by email");
        }
    }
}