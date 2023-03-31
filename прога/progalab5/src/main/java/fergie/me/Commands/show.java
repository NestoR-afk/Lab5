package fergie.me.Commands;

public class show implements Command {
    String description = "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    public void execute(){};
    public String getDescription(){
        return description;
    }
}
