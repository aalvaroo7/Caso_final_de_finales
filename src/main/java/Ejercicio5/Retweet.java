package Ejercicio5;

import java.time.LocalDate;

public class Retweet extends Tweet {
    private Tweet retweetedTweet;

    public Retweet(LocalDate time, String message, UserAccount sender, Tweet retweetedTweet) {
        super(time, message, sender);
        this.retweetedTweet = retweetedTweet;
    }

    public Tweet getRetweetedTweet() {
        return retweetedTweet;
    }

    public void setRetweetedTweet(Tweet retweetedTweet) {
        this.retweetedTweet = retweetedTweet;
    }
    @Override
    public String toString() {
        return "Retweet{" +
                "retweetedTweet=" + retweetedTweet +
                ", time=" + getTime() +
                ", message='" + getMessage() + '\'' +
                ", sender=" + getSender().getAlias() +
                '}';
    }
}