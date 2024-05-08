package Ejercicio5;

import java.time.LocalDateTime;

public class Tweet {
    private String content;
    private LocalDateTime timestamp;
    private UserAccount user;

    public Tweet(String content, UserAccount user) {
        this.content = content;
        this.user = user;
        this.timestamp = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public UserAccount getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "content='" + content + '\'' +
                ", timestamp=" + timestamp +
                ", user=" + user.getAlias() +
                '}';
    }
}
