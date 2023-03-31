package fergie.me.Commands;

public class addElement implements Command{
    String description = "add {element} : добавить новый элемент в коллекцию";
    public void execute(){};
    public String getDescription(){
        return description;
    };
}
