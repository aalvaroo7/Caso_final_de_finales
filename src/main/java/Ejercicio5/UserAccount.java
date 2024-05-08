package Ejercicio5;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private String alias;
    private String email;
    private List<Tweet> tweets;
    private List<Tweet> timeline;
    private List<UserAccount> followers;
    private List<UserAccount> following;

    public UserAccount(String alias, String email) {
        if (!Utils.isValidEmail(email) || !Utils.isValidAlias(alias)) {
            throw new IllegalArgumentException("Invalid email or alias");
        }
        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<>();
        this.timeline = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }
    public String getEmail() {
        return email;
    }
    public void follow(UserAccount user) {
        if (!following.contains(user)) {
            following.add(user);
            user.followers.add(this);
        }
    }

    public void tweet(Tweet tweet) {
        tweets.add(tweet);
        for (UserAccount follower : followers) {
            follower.timeline.add(tweet);
        }
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "alias='" + alias + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static UserAccount findUser(List<UserAccount> users, String alias) {
        // Añadimos el centinela al final de la lista
        UserAccount sentinel = new UserAccount(alias, "sentinel@example.com");
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