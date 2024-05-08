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
}