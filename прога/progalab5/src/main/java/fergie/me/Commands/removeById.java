package fergie.me.Commands;

public class removeById implements Command{
    String description = "remove_by_id id : удалить элемент из коллекции по его id";
    public void execute(){};
    public String getDescription(){
        return description;
    }
}
