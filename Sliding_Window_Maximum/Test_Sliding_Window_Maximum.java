package Sliding_Window_Maximum;

import Helpers.PrintArrayOrList;

public class Test_Sliding_Window_Maximum {

    public static void main(String[] args) {
        test(new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'}, 4);
    }

    private static void test(Character[] array, Integer size){
        Sliding_Window_Maximum slidingWindowMaximum = new Sliding_Window_Maximum(array, size);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array) + ", " + size);
        System.out.println("First Result: " + PrintArrayOrList.listToString(slidingWindowMaximum.getResult()));
        for(int i = 0; i < 1; i++){
            slidingWindowMaximum.next();
        }
        System.out.println("Second Result: " + PrintArrayOrList.listToString(slidingWindowMaximum.getResult()));
        for(int i = 0; i < 7; i++){
            slidingWindowMaximum.next();
        }
        System.out.println("Third Result: " + PrintArrayOrList.listToString(slidingWindowMaximum.getResult()));
        for(int i = 0; i < 8; i++){
            slidingWindowMaximum.next();
        }
        System.out.println("Fourth Result: " + PrintArrayOrList.listToString(slidingWindowMaximum.getResult()));
        for(int i = 0; i < 1; i++){
            slidingWindowMaximum.next();
        }
        System.out.println("Fithed Result: " + PrintArrayOrList.listToString(slidingWindowMaximum.getResult()));
        for(int i = 0; i < 1; i++){
            slidingWindowMaximum.next();
        }
        System.out.println("Sixst Result: " + PrintArrayOrList.listToString(slidingWindowMaximum.getResult()));
        for(int i = 0; i < 1; i++){
            slidingWindowMaximum.next();
        }
        System.out.println("Seventhed Result: " + PrintArrayOrList.listToString(slidingWindowMaximum.getResult()));
    }
}
