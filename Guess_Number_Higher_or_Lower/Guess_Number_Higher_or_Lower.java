package Guess_Number_Higher_or_Lower;

import java.util.Random;

public class Guess_Number_Higher_or_Lower {

    //Create an Object, which than saves a random Number from 0 to n
    private Integer number;

    public Guess_Number_Higher_or_Lower(Integer max){
        Random rand = new Random();
        number = rand.nextInt(0, max+1);
    }

    public Integer Guess(Integer guess){
        if(number > guess){
            return 1;
        } else if(number < guess){
            return -1;
        }
        return 0;
    }
}
