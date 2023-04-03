package fergie.me.Commands;

import fergie.me.CollectionManager;
import fergie.me.Data.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class AddElement extends CollectionCommand implements Command {
    Scanner scanner;
    String description = "add {element} : добавить новый элемент в коллекцию";

    public AddElement(CollectionManager collectionManager, Scanner scanner) {
        super(collectionManager);
        this.scanner = scanner;
    }

    public void execute() {

        this.collectionManager.add(Movie.createNewMovie(this.scanner));
    }
    public String getDescription(){
        return description;
    };
}
