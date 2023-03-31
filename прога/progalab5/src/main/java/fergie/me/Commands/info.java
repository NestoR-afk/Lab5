package fergie.me.Commands;

public class info implements Command{
    String description = "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов)";
    public void execute(){};
    public String getDescription(){
        return description;
    };
}
