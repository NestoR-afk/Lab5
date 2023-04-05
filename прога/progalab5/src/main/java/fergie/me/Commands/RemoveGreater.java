package fergie.me.Commands;

import fergie.me.CollectionManager;

public class RemoveGreater extends CollectionCommand implements Command {
    String description = "remove_greater {element} : удалить из коллекции все элементы, превышающие заданный";

    public RemoveGreater(CollectionManager collectionManager) {
        super(collectionManager);
    }

    public void execute(){};
    public String getDescription(){
        return description;
    }
}
