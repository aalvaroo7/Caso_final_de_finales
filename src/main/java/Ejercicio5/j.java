package Ejercicio5;

public class UserAccount {
    private String alias;
    private Email email;
    private Set<UserAccount> followers;
    private Set<UserAccount> following;
    private List<Tweet> tweets;
    private List<Tweet> timeline;

    // Existing code...

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        if (!Utils.isValidAlias(alias)) {
            throw new IllegalArgumentException("El alias no es válido");
        }
        this.alias = alias;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        if (!Utils.isValidEmail(email)) {
            throw new IllegalArgumentException("El email no es válido");
        }
        this.email = email;
    }

    public Set<UserAccount> getFollowers() {
        return followers;
    }

    public void setFollowers(Set<UserAccount> followers) {
        this.followers = followers;
    }

    public Set<UserAccount> getFollowing() {
        return following;
    }

    public void setFollowing(Set<UserAccount> following) {
        this.following = following;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public List<Tweet> getTimeline() {
        return timeline;
    }

    public void setTimeline(List<Tweet> timeline) {
        this.timeline = timeline;
    }
    public void tweet(Tweet tweet) {
        this.tweets.add(tweet);
        for (UserAccount follower : this.followers) {
            follower.timeline.add(tweet);
        }
    }
    @Override
    public String toString() {
        return "UserAccount{" +
                "alias='" + alias + '\'' +
                ", email=" + email +
                '}';
    }
}