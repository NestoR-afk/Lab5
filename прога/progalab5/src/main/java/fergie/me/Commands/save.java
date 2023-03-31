package fergie.me.Commands;

public class save implements Command{
    String description = "save : сохранить коллекцию в файл";
    public void execute(){};
    public String getDescription(){
        return description;
    }
}
