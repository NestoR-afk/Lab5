package fergie.me.Exceptions;

public class CannotBeNullException extends Throwable {
    public CannotBeNullException(String s){}

    @Override
    public String toString(){
        return "Объект не может отсутствовать.";
    }

}
