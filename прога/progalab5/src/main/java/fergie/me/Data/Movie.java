package fergie.me.Data;

import javax.management.InvalidAttributeValueException;
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
    //private long Id;

    //private static long nextId = 1L;

    public Movie() {
    }

    public Movie(long id, String name, Coordinates coordinates, java.time.LocalDate creationDate, Long oscarsCount, MovieGenre genre, MpaaRating mpaaRating, Person operator) {
        //setId();
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.oscarsCount = oscarsCount;
        this.genre = genre;
        this.mpaaRating = mpaaRating;
        this.operator = operator;
    }

    //    Set<Long> Id = new HashSet<>();
//    // @NotNull
//    public void setId(){
//        if (nextId == Long.MAX_VALUE){
//            this.id = 1L;
//            nextId = 1;
//        }
//        else{
//            this.id = nextId;
//            nextId += 1;
//        }
//        Id.add(this.id);
//    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws InvalidAttributeValueException {
        if (name.equals("") || name == null) {
            throw new InvalidAttributeValueException("Имя фильма не может быть пустым");
        } else
            this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) throws InvalidAttributeValueException {
        if ((coordinates == null))
            throw new InvalidAttributeValueException("Координаты не могут быть null");
        else
            this.coordinates = coordinates;
    }

    public java.time.LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(java.time.LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Long getOscarsCount() {
        return oscarsCount;
    }

    public void setOscarsCountscarsCount(Long oscarsCount) throws InvalidAttributeValueException {
        if (oscarsCount == null || oscarsCount == 0)
            throw new InvalidAttributeValueException("Количество оскаров не может равнять 0 или null");
        this.oscarsCount = oscarsCount;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) throws InvalidAttributeValueException {
        if (genre == null)
            throw new InvalidAttributeValueException("Значение поля жанр не может быть null");
        this.genre = genre;
    }

    public MpaaRating getMpaaRating() {
        return this.mpaaRating;
    }

    public void setMpaaRating(MpaaRating mpaaRating) throws InvalidAttributeValueException {
        if (mpaaRating == null)
            throw new InvalidAttributeValueException("Значение поля MpaaRating не может быть null");
        this.mpaaRating = mpaaRating;
    }

    public Person getOperator() {
        return this.operator;
    }

    public void setOperator(Person operator) throws InvalidAttributeValueException {
        if (operator == null)
            throw new InvalidAttributeValueException("Значение поля operator не может быть null");
        this.operator = operator;
    }

    //переопределить equals hashcode и toString для movie
    @Override
    public String toString() {
        return "Название: " + this.name + " | id: " + this.id + " ";
    }

    public static Movie createNewMovie(Scanner scanner) {
        Movie movie = new Movie();
        { //movie: movieGenre, MpaaRating, coordinates
            movie.setCreationDate(LocalDate.from(LocalDateTime.now()));
            System.out.println("Введите название фильма:");
            Checker.Setter checker = () -> {
                movie.setName(scanner.nextLine());
            };
            Checker.checkData(checker);


            System.out.println("Введите количество оскаров:");
            checker = () -> {
                movie.setOscarsCountscarsCount(scanner.nextLong());
            };

            System.out.println("Выберите из списка MpaaRating и введите его:"
                    + "\\n" + Arrays.toString(MpaaRating.values()));
            checker = () -> {
                movie.setMpaaRating(MpaaRating.valueOf(scanner.nextLine()));
            };

            System.out.println("Выберите жанр из списка: ");
            System.out.println(Arrays.toString(Country.values()));
            checker = () -> {
                movie.setGenre(MovieGenre.valueOf(scanner.nextLine()));
            };
            //coordinates
            {
                Coordinates coordinates = new Coordinates();
                System.out.println("Введите координаты x, y: ");
                int x = scanner.nextInt();
                float y = scanner.nextFloat();
                coordinates.setX(x);
                checker = () -> {
                    coordinates.setY(y);
                };
                checker = () -> {
                    movie.setCoordinates(coordinates);
                };
                Checker.checkData(checker);


            }

            { //person
                Person operator = new Person();
                System.out.println("Введите имя режиссера:");
                checker = () -> {
                    operator.setName(scanner.nextLine());
                };
                //color
                System.out.println("Выберите цвет глаз режиссера из предложенных и введите его: ");
                System.out.println(Arrays.toString(Color.values()));
                checker = () -> {
                    operator.setEyeColor(Color.valueOf(scanner.nextLine()));
                };
                //country
                System.out.println("Введите национальность оператора: ");
                System.out.println(Arrays.toString(Country.values()));
                checker = () -> {
                    operator.setNationality(Country.valueOf(scanner.nextLine()));
                };
                //height
                System.out.println("Введите рост режиссера:");
                checker = () -> {
                    operator.setHeight(scanner.nextLong());
                };


                { //location + coordinates
                    Location location = new Location();
                    System.out.println("Введите координаты (x,y,z) оператора в формате 0.0 (КАКИЕ ЕЩЕ КООРДИНАТЫ ОПЕРАТОРА?????????): ");
                    location.setX(scanner.nextFloat());
                    location.setY(scanner.nextFloat());
                    location.setZ(scanner.nextLong());
                    checker = () -> {
                        location.setName(scanner.nextLine());
                    };
                    checker = () -> {
                        operator.setLocation(location);
                    };
                }
                checker = () -> {
                    movie.setOperator(operator);
                };
            }
        }
        return movie;
    }
}
