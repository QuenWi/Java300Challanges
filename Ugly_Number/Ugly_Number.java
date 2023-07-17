package Ugly_Number;

public class Ugly_Number {

    //Returns if a number is an ugly number
    public static Boolean ugly_Number(Integer number){
        if(number.equals(1)){
            return true;
        }
        if(number % 2 == 0){
            return true;
        }
        if(number % 3 == 0){
            return true;
        }
        if(number % 5 == 0){
            return true;
        }
        return false;
    }
}
