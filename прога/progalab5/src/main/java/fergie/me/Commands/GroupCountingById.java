package fergie.me.Commands;

public class GroupCountingById implements Command {
    String description = "group_counting_by_id : сгруппировать элементы коллекции по значению поля id, вывести количество элементов в каждой группе";
    public void execute(){};
    public String getDescription(){
        return description;
    };
}
