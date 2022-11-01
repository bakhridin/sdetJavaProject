package day_52.Task2;

import java.time.LocalDate;

public class Movie {
    private String movieName;
    private LocalDate yearOfRelease;

    private Double rentPrice;
    private Double buyPrice;

    public Movie(String movieName, LocalDate yearOfRelease) {
        this.movieName = movieName;
        this.yearOfRelease = yearOfRelease;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", yearOfRelease='" + yearOfRelease + '\'' +
                ", rentPrice=" + rentPrice +
                ", buyPrice=" + buyPrice +
                '}';
    }
}
