package Ejercicio5;

import java.time.LocalDate;

public class Tweet {
    private LocalDate time;
    private String message;
    private UserAccount sender;

    public Tweet(LocalDate time, String message, UserAccount sender) {
        if (message.length() > 140) {
            throw new IllegalArgumentException("El mensaje no puede tener más de 140 caracteres");
        }
        this.time = time;
        this.message = message;
        this.sender = sender;
    }
    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        if (message.length() > 140) {
            throw new IllegalArgumentException("El mensaje no puede tener más de 140 caracteres");
        }
        this.message = message;
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
                "time=" + time +
                ", message='" + message + '\'' +
                ", sender=" + sender.getAlias() +
                '}';
    }
}