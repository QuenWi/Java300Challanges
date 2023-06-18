package Candy;

import Helpers.PrintArrayOrList;

import java.util.Arrays;

public class Test_Candy {

    public static void main(String[] args) {
        Float[] marks = {1.3f, 2.4f, 2.2f, 1.8f, 1.7f, 1.7f, 3f, 3.3f, 3.4f, 3.4f, 2f, 3f, 2.2f, 2f, 2.1f};
        int[] result = Candy.candy(marks);
        Integer[] resultObj = Arrays.stream(result).boxed().toArray(Integer[]::new);

        System.out.println("Example: " + PrintArrayOrList.arrayToString(marks));
        System.out.println("Result: " + PrintArrayOrList.arrayToString(resultObj));
    }
}
