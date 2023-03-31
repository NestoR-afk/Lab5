package fergie.me.Commands;

import fergie.me.CollectionManager;
import fergie.me.Data.Movie;

public class addElement extends CollectionCommand implements Command{
    String description = "add {element} : добавить новый элемент в коллекцию";

    public addElement(CollectionManager collectionManager) {
        super(collectionManager);
    }

    public void execute(){
        Movie movie = new Movie();
        this.collectionManager.add(movie);
    };
    public String getDescription(){
        return description;
    };
}
