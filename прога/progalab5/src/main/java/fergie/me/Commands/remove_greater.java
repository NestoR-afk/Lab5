package fergie.me.Commands;

public class remove_greater implements Command {
    String description = "remove_greater {element} : удалить из коллекции все элементы, превышающие заданный";
    public void execute(){};
    public String getDescription(){
        return description;
    }
}
