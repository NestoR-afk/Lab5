package fergie.me.Commands;

public class add_if_min implements Command {
    String description = "add_if_min {element}: добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции";
    public void execute(){};
    public String getDescription(){
        return description;
    };
}
