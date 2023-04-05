package fergie.me.Commands;

import fergie.me.CollectionManager;

public class AddIfMin extends CollectionCommand implements Command {
    String description = "add_if_min {element}: добавить новый элемент в коллекцию, если его значение меньше, " +
            "чем у наименьшего элемента этой коллекции";

    public AddIfMin(CollectionManager collectionManager) {
        super(collectionManager);
    }

    public void execute(){};
    public String getDescription(){
        return description;
    };
}
