package fergie.me.Data;

import fergie.me.Exceptions.CannotBeNullException;

import java.util.Objects;

public class Location {
    private float x;
    private float y;
    private long z;
    private String name; //Длина строки не должна быть больше 870, Поле не может быть null

    public float getX(){
        return x;
    }
    public void setX(){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(){
        this.y = y;
    }
    public long getZ(){
        return z;
    }
    public void setZ(){
        this.z = z;
    }

    public  String getName(){
        return name;
    }

    public  void setName(String name){
        try {
            this.name = name;
            if (name == null)
                throw new CannotBeNullException("Название локации не может отсутствовать.");
        }
        catch(CannotBeNullException o){
            o.toString();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location that = (Location) o;
        return Float.compare(that.x, x) == 0 && y == that.y && name.equals(that.name);
    } //???

    @Override
    public int hashCode() {
        return Objects.hash(x, y, name);
    }

    @Override
    public String toString() {
        return "Coordinates " + name + "{x= " + x + ", y= " + y + '}';
    }
}
