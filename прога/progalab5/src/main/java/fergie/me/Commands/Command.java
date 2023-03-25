package fergie.me.Commands;

public interface Command {
    //boolean execute(String[] commandArgs);
    String Description = null;
    void execute();
    String getDescription();

}
