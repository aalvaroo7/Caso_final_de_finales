package Ejercicio5;
import java.util.Scanner;

public class Utils {
    private static Scanner scanner = new Scanner(System.in);

    public static String readString() {
        return scanner.nextLine();
    }

    public static int readInt() {
        int number = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        return number;
    }

    public static boolean isValidAlias(String alias) {
        // This is a simple example that checks if the alias contains only alphanumeric characters
        String aliasRegex = "^[a-zA-Z0-9]+$";
        return alias.matches(aliasRegex);
    }

    public static boolean isValidEmail(Email email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.getAddress().matches(emailRegex);
    }
}
