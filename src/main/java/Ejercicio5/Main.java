package Ejercicio5;

import Ejercicio5.Email;
import Ejercicio5.UserAccount;
import Ejercicio5.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;

public class Main {
    private static List<UserAccount> users = new ArrayList<>();

    public static void main(String[] args) {
        loadUsersFromFile();

        // Menú de opciones
        int option;
        do {
            option = showMenuAndGetOption();
            switch (option) {
                case 1:
                    loadUserInMemory();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        } while (option != 0);
    }

    public static void loadUsersFromFile() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("users.txt"));
            for (String line : lines) {
                String[] details = line.split(",");
                String alias = details[0];
                Email email = new Email(details[1]);
                users.add(new UserAccount(alias, email));
            }
        } catch (IOException e) {
            System.out.println("Error reading users file: " + e.getMessage());
        }
    }

    private static int showMenuAndGetOption() {
        System.out.println("1. Load user in memory");
        System.out.println("0. Exit");
        System.out.print("Enter the desired option: ");
        int option = Utils.readInt();
        return option;
    }

    private static UserAccount currentUser = null;

    public static void loadUserInMemory() {
        System.out.print("Enter the user alias: ");
        String alias = Utils.readString();
        UserAccount user = sentinelSearch(alias);
        if (user == null) {
            System.out.println("User not found.");
        } else {
            System.out.println("User found: " + user);
            currentUser = user; // Guardamos el usuario cargado en la variable currentUser
        }
    }

    public static void publishTweet() {
        if (currentUser == null) {
            System.out.println("No user is loaded in memory.");
            return;
        }
        System.out.print("Enter the content of the tweet: ");
        String content = Utils.readString();
        try {
            Tweet tweet = new Tweet(LocalDate.now(), content, currentUser);
            currentUser.tweet(tweet);
            System.out.println("Tweet published successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static UserAccount sentinelSearch(String alias) {
        UserAccount sentinel = new UserAccount(alias, null);
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
    public static void sortUsersByEmail() {
        Collections.sort(users, new Comparator<UserAccount>() {
            @Override
            public int compare(UserAccount user1, UserAccount user2) {
                return user1.getEmail().getAddress().compareTo(user2.getEmail().getAddress());
            }
        });
    }
    public static List<UserAccount> getUsers() {
        return users;
    }
    public static int showMenuAndGetOption(Scanner scanner) {
        System.out.println("1. Load user in memory");
        System.out.println("0. Exit");
        System.out.print("Enter the desired option: ");
        int option = scanner.nextInt();
        return option;
    }
    public static UserAccount getCurrentUser() {
        return currentUser;
    }
}