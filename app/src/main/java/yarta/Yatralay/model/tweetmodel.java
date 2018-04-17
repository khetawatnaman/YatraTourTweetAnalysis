package yarta.Yatralay.model;

/**
 * Created by hitesh on 27/3/18.
 */

public class tweetmodel {
    String city;
    Long id;
    String tweet;
    String sentiment;

    public tweetmodel() {
    }

    public tweetmodel(String city, Long id, String tweet, String sentiment) {
        this.city = city;
        this.id = id;
        this.tweet = tweet;
        this.sentiment = sentiment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }
}
