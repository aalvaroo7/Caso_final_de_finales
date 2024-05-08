package Ejercicio5;

import java.time.LocalDate;

public class Retweet extends Tweet {
    private Tweet retweetedTweet;

    public Retweet(LocalDate time, String message, UserAccount sender, Tweet retweetedTweet) {
        super(time, message, sender);
        this.retweetedTweet = retweetedTweet;
    }
    // Métodos de acceso y modificación (getters y setters)
    // Implementación del método toString()
}