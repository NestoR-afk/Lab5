package fergie.me;

import fergie.me.Commands.Command;
import fergie.me.Commands.AddElement;
import fergie.me.Commands.UpdateId;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandManager {
    private CollectionManager collectionManager;

    public Map<String, Command> commands = new HashMap<>();


    public CommandManager(CollectionManager collectionManager, Scanner scanner) {
        this.collectionManager = collectionManager;
        Command update = new UpdateId(collectionManager, scanner);


        Command addElement = new AddElement(collectionManager, scanner);


        commands.put("update", update);
        commands.put("add", addElement);
    }

//    public static void help() {
//
//        for( Command cmd: commands.values()) {
//            System.out.println(cmd.getDescription() + "\\n");
//        }
//    }





    public boolean execute(String[] commandArgs) {
        return true;
    }
    //через switch case или hashmap
}
