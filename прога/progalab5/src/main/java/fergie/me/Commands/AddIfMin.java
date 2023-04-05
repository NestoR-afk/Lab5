package fergie.me.Commands;

import fergie.me.CollectionManager;
import fergie.me.Data.Movie;

public class AddIfMin extends InputCommand implements Command {
    String description = "add_if_min {element}: добавить новый элемент в коллекцию, если его значение меньше, " +
            "чем у наименьшего элемента этой коллекции";

    public AddIfMin(CollectionManager collectionManager) {
        super(collectionManager);
    }

    public void execute(){
        Movie movie = Movie.createNewMovie(scanner);
        co
    };
    public String getDescription(){
        return description;
    };
}
