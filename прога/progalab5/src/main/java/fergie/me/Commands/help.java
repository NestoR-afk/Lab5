package fergie.me.Commands;

public class help implements Command{
    String description = "help : вывести справку по доступным командам";
    public void execute(){};
    public String getDescription(){
        return description;
    }
}
