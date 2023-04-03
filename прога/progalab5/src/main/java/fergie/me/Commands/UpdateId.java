package fergie.me.Commands;


import fergie.me.CollectionManager;

public class UpdateId extends CollectionCommand{
    String description = "update id {element} : обновить значение элемента коллекции, id которого равен заданному";

    public UpdateId(CollectionManager collectionManager) {
        super(collectionManager);
    }

    public void execute(){
        collectionManager.updateID();
    };
    public String getDescription(){
        return description;
    }
}
