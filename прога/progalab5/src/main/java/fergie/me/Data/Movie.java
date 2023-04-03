package fergie.me.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Movie {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Long oscarsCount; //Значение поля должно быть больше 0, Поле не может быть null
    private MovieGenre genre; //Поле не может быть null
    private MpaaRating mpaaRating; //Поле может быть null
    private Person operator; //Поле не может быть null

    public Movie(){}

    public Movie(long id, String name, Coordinates coordinates, java.time.LocalDate creationDate, Long oscarsCount, MovieGenre genre, MpaaRating mpaaRating, Person operator) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.oscarsCount = oscarsCount;
        this.genre = genre;
        this.mpaaRating = mpaaRating;
        this.operator = operator;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Coordinates getCoordinates(){
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates){
        this.coordinates = coordinates;
    }
    public java.time.LocalDate getCreationDate(){
        return creationDate;
    }

    public void setCreationDate(java.time.LocalDate creationDate){
        this.creationDate = creationDate;
    }
    public Long getOscarsCount(){
        return oscarsCount;
    }

    public void setOscarsCountscarsCount(Long oscarsCount){
        this.oscarsCount = oscarsCount;
    }
    public MovieGenre getGenre(){
        return genre;
    }

    public void setGenre(MovieGenre genre){
        this.genre = genre;
    }
    public MpaaRating getMpaaRating(){
        return this.mpaaRating;
    }
    public void setMpaaRating(MpaaRating mpaaRating){
        this.mpaaRating = mpaaRating;
    }
    public Person getOperator(){
        return this.operator;
    }
    public void setOperator(Person operator){
        this.operator = operator;
    }
    //переопределить equals hashcode и toString для movie
    @Override
    public String toString(){
        return "Название: " + this.name + " | id: " + this.id + " ";
    }
    public static Movie createNewMovie(Scanner scanner){
        Movie movie = new Movie();
        { //movie: movieGenre, MpaaRating, coordinates
            movie.setCreationDate(LocalDate.from(LocalDateTime.now()));

            System.out.println("Введите название фильма:");
            movie.setName(scanner.nextLine());

            System.out.println("Введите количество оскаров:");
            movie.setOscarsCountscarsCount(scanner.nextLong());

            System.out.println("Выберите из списка MpaaRating и введите его:"
                    + "\\n" + Arrays.toString(MpaaRating.values()));
            movie.setMpaaRating(MpaaRating.valueOf(scanner.nextLine()));

            System.out.println("Выберите жанр из списка: ");
            System.out.println(Arrays.toString(Country.values()));
            movie.setGenre(MovieGenre.valueOf(scanner.nextLine()));
            //coordinates
            {
                Coordinates coordinates = new Coordinates();
                System.out.println("Введите координаты x, y: ");
                int x = scanner.nextInt();
                float y = scanner.nextFloat();
                coordinates.setX(x);
                coordinates.setY(y);
                movie.setCoordinates(coordinates);
            }

            { //person
                Person operator = new Person();
                System.out.println("Введите имя режиссера:");
                operator.setName(scanner.nextLine());
                //color
                System.out.println("Выберите цвет глаз режиссера из предложенных и введите его: ");
                System.out.println(Arrays.toString(Color.values()));
                operator.setEyeColor(Color.valueOf(scanner.nextLine()));
                //country
                System.out.println("Введите национальность оператора: ");
                System.out.println(Arrays.toString(Country.values()));
                operator.setNationality(Country.valueOf(scanner.nextLine()));

                { //location + coordinates
                    Location location = new Location();
                    System.out.println("Введите координаты (x,y,z) оператора в формате 0.0 (КАКИЕ ЕЩЕ КООРДИНАТЫ ОПЕРАТОРА?????????): ");
                    location.setX(scanner.nextFloat());
                    location.setY(scanner.nextFloat());
                    location.setZ(scanner.nextLong());
                    location.setName(scanner.nextLine());
                    operator.setLocation(location);
                }
                movie.setOperator(operator);
            }
        }
        return movie;
    }
}
