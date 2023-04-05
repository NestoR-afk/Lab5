package fergie.me.Commands;



public interface Command {
    void execute(String commandArgs);

    String getDescription();

}
