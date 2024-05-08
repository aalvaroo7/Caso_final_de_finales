package Ejercicio5;

import java.util.ArrayList;
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
}