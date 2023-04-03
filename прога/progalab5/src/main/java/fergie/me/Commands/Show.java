package fergie.me.Commands;

import fergie.me.CollectionManager;
import fergie.me.Data.Movie;

import java.util.ArrayDeque;

public class Show extends CollectionCommand{
    String description = "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении";

    public Show(CollectionManager collectionManager) {
        super(collectionManager);
    }

    public void execute(ArrayDeque<Movie> movies){
        for (Movie movie: movies) {
            System.out.print(" " + movie.toString() + ", " );
        }
    };
    public String getDescription(){
        return description;
    }
}
