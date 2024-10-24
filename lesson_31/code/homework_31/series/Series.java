package homework_31.series;

import java.util.Objects;

public class Series implements Comparable<Series>{

    private String name;
    private int numberOfEpisodes;

    public Series(String name, int numberOfEpisodes) {
        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Series series)) return false;
        return numberOfEpisodes == series.numberOfEpisodes && Objects.equals(name, series.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfEpisodes);
    }

    @Override
    public String toString() {
        return String.format("Series name: %s, number of episodes: %d", name, numberOfEpisodes);
    }

    @Override
    public int compareTo(Series o) {
        return Integer.compare(this.getNumberOfEpisodes(), o.getNumberOfEpisodes());
    }

}
