package fergie.me.Data;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Long height; //Поле может быть null, Значение поля должно быть больше 0
    private Color eyeColor; //Поле не может быть null
    private Country nationality; //Поле не может быть null
    private Location location; //Поле может быть null

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Long getHeight(){
        return this.height;
    }
    public void setHeight(Long height){
        this.height = height;
    }
    public Color getEyeColor(){
        return this.eyeColor;
    }
    public void setEyeColor(Color color){
        this.eyeColor = color;
    }
    public Country getNationality(){
        return this.nationality;
    }
    public void setNationality(Country nationality){
        this.nationality = nationality;
    }
    public Location getLocation(){
        return this.location;
    }
    public void setLocation(Location location){
        this.location = location;
    }
}
