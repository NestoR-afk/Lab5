package fergie.me.Commands;

public class clear implements Command {
    String description = "clear: очистить коллекцию";
    public void execute(){};
    public String getDescription(){
        return description;
    };
}
