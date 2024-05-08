package Ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de usuarios para el ejemplo
        List<UserAccount> users = new ArrayList<>();
        users.add(new UserAccount("aliasDelUsuario", "email@example.com"));

        UserAccount user = findUser(users, "aliasDelUsuario");
        if (user != null) {
            System.out.println("Usuario encontrado: " + user);
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    public static UserAccount findUser(List<UserAccount> users, String alias) {
        // Añadimos el centinela al final de la lista
        UserAccount sentinel = new UserAccount(alias, "");
        users.add(sentinel);

        int i = 0;
        while (!users.get(i).getAlias().equals(alias)) {
            i++;
        }

        // Eliminamos el centinela
        users.remove(users.size() - 1);

        // Si encontramos el usuario antes del centinela, devolvemos el usuario
        if (i != users.size()) {
            return users.get(i);
        }

        // Si no encontramos el usuario, devolvemos null
        return null;
    }
    public static void publishTweet(UserAccount user, String message) {
        try {
            Tweet tweet = new Tweet(message, user);
            user.tweet(tweet);
            System.out.println("Tweet publicado: " + tweet);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al publicar el tweet: " + e.getMessage());
        }
    }
    public static void sortUsersByEmail(List<UserAccount> users) {
        Collections.sort(users, new Comparator<UserAccount>() {
            @Override
            public int compare(UserAccount user1, UserAccount user2) {
                return user1.getEmail().compareTo(user2.getEmail());
            }
        });
    }
}