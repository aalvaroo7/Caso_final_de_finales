package Ejercicio5;

public class Retweet extends Tweet {
    private Tweet retweetedTweet;

    public Retweet(String message, UserAccount sender, Tweet retweetedTweet) {
        super(message, sender);
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
                "message='" + message + '\'' +
                ", time=" + time +
                ", sender=" + sender +
                ", retweetedTweet=" + retweetedTweet +
                '}';
    }
}