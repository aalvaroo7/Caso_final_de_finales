package Ejercicio5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
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
        // Implementa la lógica de prueba para el método publishTweet.
        // Podrías, por ejemplo, verificar que después de llamar a este método,
        // el número de tweets del usuario actual ha aumentado en uno.
    }

    @Test
    void testSentinelSearch() {
        // Implementa la lógica de prueba para el método sentinelSearch.
        // Podrías, por ejemplo, verificar que este método devuelve el usuario correcto
        // cuando se le da un alias de usuario válido.
    }

    @Test
    void testSortUsersByEmail() {
        // Implementa la lógica de prueba para el método sortUsersByEmail.
        // Podrías, por ejemplo, verificar que después de llamar a este método,
        // los usuarios están ordenados correctamente por correo electrónico.
    }
}