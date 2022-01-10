package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie{
    private String name;
    private int year;
    private int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Movie(String name, int year, int rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }
}

public class Test{
    public static void main(String[] args) {
        Movie m1 = new Movie("Alien",1990,80);
        Movie m2 = new Movie("B Alien",2002,34);
        Movie m3 = new Movie("C Alien",1880,50);
        Movie m4 = new Movie("D Alien",2000,60);
        Movie m5 = new Movie("E Alien",1590,12);
        Movie m6 = new Movie("F Alien",1990,16);
        Movie m7 = new Movie("G Alien",2008,41);

        System.out.println("All movies: ");
        System.out.println(m1.toString()+"\n"+m2.toString()+"\n"+m3.toString()+"\n"+m4.toString()+"\n"+m5.toString()+"\n"+m6.toString()+"\n"+m7.toString());
        List<Movie> movieList = new ArrayList<>();
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        movieList.add(m4);
        movieList.add(m5);
        movieList.add(m6);
        movieList.add(m7);

        System.out.println("\nSorted movies with year:");
        Collections.sort(movieList, (m11, m22) -> m11.getYear() - m22.getYear());
        System.out.println(movieList);

        System.out.println("\nSorted movies with ratings:");
        Collections.sort(movieList, (m11, m22) -> m11.getRating() - m22.getRating());
        System.out.println(movieList);

        System.out.println("\nSorted movies with names:");
        movieList.sort(Comparator.comparing(Movie::getName));
        System.out.println(movieList);
    }
}