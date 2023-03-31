package fergie.me;

import fergie.me.Commands.Command;
import fergie.me.Commands.addElement;
import fergie.me.Commands.add_if_min;
import fergie.me.Commands.clear;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private Command add_if_min;
    private Command addElement;
    private Command clear;
    private Command add;

    public Map<String, Command> commads = new HashMap<>() {
        {"add", add},
        {"add_if_min", add_if_min},

    }

    private CollectionManager collectionManager;

    public CommandManager(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
        add_if_min = new add_if_min();
        addElement = new addElement();
        clear = new clear();
    }



    public boolean execute(String[] commandArgs) {
        return true;
    }
    //через switch case или hashmap
}
