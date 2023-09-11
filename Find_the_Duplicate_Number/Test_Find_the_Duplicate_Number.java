package Find_the_Duplicate_Number;

import Helpers.PrintArrayOrList;

public class Test_Find_the_Duplicate_Number {

    public static void main(String[] args) {
        test(new Integer[]{1, 4, 3, 2, 7, 6, 5, 3});
        test(new Integer[]{1, 4, 3, 2, 7, 6, 5, 9, 8, 9, 10});
        test(new Integer[]{1, 4, 3, 2, 7, 6, 5, 9, 8, 9});
        test(new Integer[]{1, 4, 3, 2, 7, 6, 5, 9, 8, 4, 10});
        test(new Integer[]{1, 4, 3, 2, 7, 6, 5, 9, 8, 3});
    }

    private static void test(Integer[] array){
        Integer result = Find_the_Duplicate_Number.find_the_Duplicate_Number(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
