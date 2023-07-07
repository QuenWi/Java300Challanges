package Minimum_Cost_to_Hire_K_Workers;

import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Minimum_Cost_to_Hire_K_Workers {

    public static void main(String[] args) {
        test(
                new Double[]{15d, 12.5d, 14d, 16d, 10.5d, 11d, 19d, 15.5d},
                new Double[]{40d, 35.5d, 38d, 41d, 36d, 34.5d, 50d, 41d},
                4
        );

        test(
                new Double[]{7.5d, 12.5d, 14d, 16d, 10.5d, 11d, 19d, 15.5d}, //15 -> 7.5
                new Double[]{20d, 35.5d, 48d, 41d, 36d, 34.5d, 50d, 41d}, //38 -> 48, 40 -> 20
                4 //To understand why I choose this numbers, I just used some Console outputs, which are now
                    //as commands left in the Minimum_Cost_to_Hire_K_Workers class.
        );
    }

    private static void test(Double[] quality, Double[] minimumWage, Integer size){
        Integer[] result = Minimum_Cost_to_Hire_K_Workers.minimum_Cost_to_Hire_K_Workers(quality, minimumWage, size);

        System.out.println(String.format("Given: Quality %s, Minimum wage %s, Amount %s",
                PrintArrayOrList.arrayToString(quality), PrintArrayOrList.arrayToString(minimumWage), size.toString()));
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
