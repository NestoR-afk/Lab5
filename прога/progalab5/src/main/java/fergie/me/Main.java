package fergie.me;

import fergie.me.Data.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CollectionManager collectionManager = new CollectionManager();
        CommandManager commandManager = new CommandManager(collectionManager, scanner);
        Parser parser = new Parser();

//        String fileName = System.getenv("file");
//        try {
//            List<Movie> movies = parser.readFromFile(fileName);
//            collectionManager.addAll(movies);
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл" + fileName + "не найден");
//        } catch (NumberFormatException e) {
//            System.out.println("Н");
//        }

        while (true) {
            String s = scanner.nextLine();
//            scanner.nextLine();
            String[] argssss = s.split("\s+");

            if (s.equals("exit")) {
                break;
            }
            if (argssss.length == 2)
                commandManager.commands.get(argssss[0]).execute(argssss[1]);
            else if (argssss.length == 1){
                commandManager.commands.get(argssss[0]).execute("");
            } else {
                System.out.println("Неверное кол-во аргументов");
            }
        }


    }
}