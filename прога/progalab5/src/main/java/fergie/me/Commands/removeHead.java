package fergie.me.Commands;

public class removeHead implements Command {
    String description = "remove_head : вывести первый элемент коллекции и удалить его";
    public void execute(){};
    public String getDescription(){
        return description;
    }
}
