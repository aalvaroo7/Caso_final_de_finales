package Ejercicio5;

import java.time.LocalDateTime;

public class Tweet {
    protected String message;
    protected LocalDateTime time;
    protected UserAccount sender;

    public Tweet(String message, UserAccount sender) {
        if (message.length() > 140) {
            throw new IllegalArgumentException("Message cannot exceed 140 characters");
        }
        this.message = message;
        this.sender = sender;
        this.time = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        if (message.length() > 140) {
            throw new IllegalArgumentException("Message cannot exceed 140 characters");
        }
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "message='" + message + '\'' +
                ", time=" + time +
                ", sender=" + sender +
                '}';
    }
}
