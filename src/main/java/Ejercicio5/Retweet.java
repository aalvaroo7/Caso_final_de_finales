package Ejercicio5;

import Ejercicio5.Tweet;
import Ejercicio5.UserAccount;

public class Retweet extends Tweet {
    private Tweet retweetedTweet;

    public Retweet(String message, UserAccount sender, Tweet retweetedTweet) {
        super(message, sender);
        this.retweetedTweet = retweetedTweet;
    }

    // ... getters and setters ...
}