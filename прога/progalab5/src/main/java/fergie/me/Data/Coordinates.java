package fergie.me.Data;

import javax.management.InvalidAttributeValueException;
import java.util.Objects;

public class Coordinates {
    private double x;
    private Float y; //Поле не может быть null

    public double getX(){
        return x;
    }

    public void setX(String s) {
        setX(Integer.parseInt(s));
    }

    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(Float y) throws InvalidAttributeValueException{
        if (y == null)
            throw new InvalidAttributeValueException("Значение поля Y не может быть null");
        this.y = y;
    }
   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates th = (Coordinates) o;
        return (Double.compare((double)th, x) == 0) && (y == th.y);
    } */

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Coordinates{" + "x=" + x + ", y=" + y + '}';
    }



}

