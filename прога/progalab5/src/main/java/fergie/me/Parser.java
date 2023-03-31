package fergie.me;

import fergie.me.Data.Coordinates;
import fergie.me.Data.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private Scanner scanner;
    private String field = "<(\\w+)>(.+)</\\w+>";
    private Pattern pattern = Pattern.compile(field);

    public List<Movie> readFromFile(String fileName) throws FileNotFoundException {
        List<Movie> movies = new ArrayList<>();
        scanner = new Scanner(new File("src\\main\\java\\fergie\\me\\" + fileName));

        Movie movie = new Movie();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().trim();

            if (s.equals("<Movie>")) {
                movie = new Movie();
                continue;
            }

            if (s.equals("Coordinates>")) {
                Coordinates coordinates = readCoordinates();
            }

            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) {
                String fieldName = matcher.group(1);
                String fieldValue = matcher.group(2);
            }

        }

        return movies;
    }

    private Coordinates readCoordinates() {
        Coordinates coordinates = new Coordinates();
        String s;
        while((s = scanner.nextLine()) != "</Coordinates>") {
            Matcher matcher = pattern.matcher(s);
            String fieldName = matcher.group(1);
            String fieldValue = matcher.group(2);

            if (fieldName.equals("x")) {
                coordinates.setX(Double.parseDouble(fieldValue));
            } else if(fieldName.equals("y")) {
                coordinates.setY(Float.parseFloat(fieldValue));
            }
        }

        return coordinates;
    }

}
