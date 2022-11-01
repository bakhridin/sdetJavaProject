package day_52.Task2;

import java.util.ArrayList;

public class Cinema {
    private final ArrayList<Movie> listOfMovie = new ArrayList<>();

    public ArrayList<Movie> getListOfMovie() {
        return listOfMovie;
    }

    public void addMovie(Movie movie) {
        listOfMovie.add(movie);


    }

    public void removeMovie(String movieName) {
        for (Movie movie : listOfMovie) {

        }
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "listOfMovie=" + listOfMovie +
                '}';
    }
}
