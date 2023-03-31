package fergie.me;

import fergie.me.Data.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CollectionManager collectionManager = new CollectionManager();
        CommandManager commandManager = new CommandManager(collectionManager);
        Parser parser = new Parser();

        Scanner scanner = new Scanner(System.in);
        String fileName = System.getenv("file");
        try {
            List<Movie> movies = parser.readFromFile(fileName);
            collectionManager.addAll(movies);
        } catch (FileNotFoundException e) {
            System.out.println("Файл" + fileName + "не найден");
        }

        String s;
        while ((s=scanner.nextLine()) != "exit") {
            commandManager.commads.get(s).execute();
        }


    }
}