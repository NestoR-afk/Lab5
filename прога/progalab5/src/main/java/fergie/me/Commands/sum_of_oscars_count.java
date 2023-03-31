package fergie.me.Commands;

public class sum_of_oscars_count implements Command {
    String description = "sum_of_oscars_count : вывести сумму значений поля oscarsCount для всех элементов коллекции";
    public void execute(){};
    public String getDescription(){
        return description;
    }
}
