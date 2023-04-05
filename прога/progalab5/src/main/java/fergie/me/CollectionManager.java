package fergie.me;

import fergie.me.Data.Movie;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Scanner;

public class CollectionManager {
    private final ArrayDeque<Movie> arrayDeque;
    private LocalDate initializationDate;
    private long current_id = 1;
    private long currency = 0;
    String className;
    Scanner scanner;

    public CollectionManager() {
        initializationDate = LocalDate.now();
        arrayDeque = new ArrayDeque();
        arrayDeque.pop(); //???
        className = arrayDeque.getClass().getName();
        currency = arrayDeque.size();
    }

    public void addAll(Collection<Movie> collection) {
        for(Movie movie: collection) {
            movie.setId(current_id);
            arrayDeque.add(movie);
            current_id++;
        }
    }

    public void add(Movie movie) {
        movie.setId(current_id);
        arrayDeque.add(movie);
        current_id++;
    }
    public void clear(){
        this.arrayDeque.clear();
    }
    public void updateID(){
        System.out.println("Введите id фильма, который необходимо заменить:");
        long id = scanner.nextLong();

        System.out.println("Введите параметры.");
        Movie movie = Movie.createNewMovie(this.scanner);

        int count = 0;
        for (Movie currentMovie : this.arrayDeque){
           if (count == id) {
               currentMovie = movie;
           }
            count++;
       }
    }
    public void removeHead(){
        this.arrayDeque.removeFirst();
    }
    public void removeById(){
        System.out.println("Введите id фильма, который необходимо удалить:");
        long id = scanner.nextLong();
        int count = 0;
        Movie del = null;
        for (Movie currentMovie : this.arrayDeque) {
            if (count == id) {
                del = currentMovie;
                //currentMovie = null;
                //System.gc();
            }
            count++;
        }
        this.arrayDeque.remove(del);
    }

    public int SumOfOscarsCount() {
        int oscars = 0;
        for (Movie movie : this.arrayDeque) {
            oscars += movie.getOscarsCount();
        }
        return oscars;
    }

    public void show() {
        for (Movie movie : arrayDeque) {
            System.out.print(" " + movie.toString() + ", ");
        }
    }

    // создать новую коллекцию без этого элемента
    public LocalDate getInitializationDate() {
        return initializationDate;
    }

    public String getClassName() {
        return this.className;
    }

    public Long getCurrency() {
        return this.currency;
    }

}
