package fergie.me.Data;

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
}
