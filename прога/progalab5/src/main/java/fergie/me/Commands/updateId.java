package fergie.me.Commands;

public class updateId implements Command {
    String description = "update id {element} : обновить значение элемента коллекции, id которого равен заданному";
    public void execute(){};
    public String getDescription(){
        return description;
    }
}
