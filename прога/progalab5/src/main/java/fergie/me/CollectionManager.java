package fergie.me;

import fergie.me.Data.Movie;

import java.util.ArrayDeque;
import java.util.Collection;

public class CollectionManager {
    private final ArrayDeque<Movie> arrayDeque;
    private long current_id = 0;
    public CollectionManager() {
        arrayDeque = new ArrayDeque();
    }

    public void addAll(Collection<Movie> collection) {
        arrayDeque.addAll(collection);
    }

    public void add(Movie movie) {
        arrayDeque.add(movie);
    }
}
