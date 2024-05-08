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

    // Métodos de acceso y modificación (getters y setters)
    // Implementación del método toString()
}

public class Retweet extends Tweet {
    private Tweet retweetedTweet;

    public Retweet(LocalDate time, String message, UserAccount sender, Tweet retweetedTweet) {
        super(time, message, sender);
        this.retweetedTweet = retweetedTweet;
    }

    // Métodos de acceso y modificación (getters y setters)
    // Implementación del método toString()
}

public class DirectMessage extends Tweet {
    private UserAccount receiver;

    public DirectMessage(LocalDate time, String message, UserAccount sender, UserAccount receiver) {
        super(time, message, sender);
        this.receiver = receiver;
    }

    // Métodos de acceso y modificación (getters y setters)
    // Implementación del método toString()
}