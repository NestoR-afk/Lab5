package fergie.me;

import fergie.me.Commands.Command;
import fergie.me.Data.Movie;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionManager {
    private final ArrayDeque<Movie> arrayDeque;
    private LocalDate initializationDate;
    private long current_id = 0;

    public CollectionManager() {
        initializationDate = LocalDate.now();
        arrayDeque = new ArrayDeque();
        arrayDeque.pop();
        String className = arrayDeque.getClass().getName();
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

    public LocalDate getInitializationDate() {
        return initializationDate;
    }
}
