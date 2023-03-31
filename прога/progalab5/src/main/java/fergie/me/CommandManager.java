package fergie.me;

import fergie.me.Commands.Command;
import fergie.me.Commands.addElement;
import fergie.me.Commands.add_if_min;
import fergie.me.Commands.clear;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private CollectionManager collectionManager;

    public Map<String, Command> commands = new HashMap<>();


    public CommandManager(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;

        Command addElement = new addElement(collectionManager);

    }

    public void help() {

        for( Command cmd: commands.values()) {
            System.out.println(cmd.getDescription() + "\\n");
        }
    }





    public boolean execute(String[] commandArgs) {
        return true;
    }
    //через switch case или hashmap
}
