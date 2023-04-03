package fergie.me.Commands;

import fergie.me.CollectionManager;

public class Info extends CollectionCommand{
    String description = "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов)";

    public Info(CollectionManager collectionManager) {
        super(collectionManager);
    }

    public void execute(CollectionManager collectionManager){
    collectionManager.getInitializationDate();
    collectionManager.getCurrency();
    collectionManager.getClassName();
    };
    public String getDescription(){
        return description;
    }
}
