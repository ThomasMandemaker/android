package xyz.moviecast.base.providers.models.movies;

import org.codehaus.jackson.annotate.JsonProperty;

public class Rating {

    @JsonProperty("votes")
    private int votes;
    @JsonProperty("watching")
    private int watching;
    @JsonProperty("percentage")
    private int percentage;

    public int getVotes() {
        return votes;
    }

    public int getWatching() {
        return watching;
    }

    public int getPercentage() {
        return percentage;
    }
}
