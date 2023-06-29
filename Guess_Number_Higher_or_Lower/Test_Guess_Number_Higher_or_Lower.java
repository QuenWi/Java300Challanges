package Guess_Number_Higher_or_Lower;

import java.util.Random;

public class Test_Guess_Number_Higher_or_Lower {

    public static void main(String[] args) {
        Integer max = 1000;
        test(max);
    }

    private static void test(Integer max){
        Guess_Number_Higher_or_Lower game = new Guess_Number_Higher_or_Lower(max);

        int guess = max/2;
        int min = 0;
        while(game.Guess(guess) != 0){
            if(game.Guess(guess) == 1){
                System.out.println("Higher than: " + guess);
                if(min == guess){
                    min++;
                } else{
                    min = guess;
                }
            } else {
                System.out.println("Smaller than: " + guess);
                max = guess;
            }
            guess = (min + max)/2;
        }
        System.out.println("The number was: " + guess);
    }
}
