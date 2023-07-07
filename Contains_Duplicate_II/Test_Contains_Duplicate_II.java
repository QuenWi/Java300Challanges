package Contains_Duplicate_II;

import Helpers.PrintArrayOrList;

public class Test_Contains_Duplicate_II {

    public static void main(String[] args) {
        test(new Byte[]{1, 2, 3, 1, 2, 4, 5, 2, 6}, 3);
        test(new Byte[]{1, 2, 3, 1, 2, 4, 5, 2, 6, 1}, 3);
    }

    private static void test(Byte[] array, Integer distance){
        Boolean result = Contains_Duplicate_II.contains_Duplicate_II(array, distance);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
