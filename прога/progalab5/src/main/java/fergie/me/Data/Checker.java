package fergie.me.Data;

import javax.management.InvalidAttributeValueException;

public class Checker {
    public interface Setter {
        void set() throws InvalidAttributeValueException;
    }
    public static void checkData(Setter setter){
        while (true){
            try{
                setter.set();
                break;
            }
            catch (InvalidAttributeValueException e){
                e.getMessage();
                System.out.println("Хрень ввел. Введите правильные данные: ");
            }
        }
    }

}
