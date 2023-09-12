package First_Missing_Positive;

import Helpers.PrintArrayOrList;

public class Test_First_Missing_Positive {

    public static void main(String[] args) {
        test(new Integer[]{3, 5, 1, 7, 4, 8});
        test(new Integer[]{3, 5, 1, 7, 4, 8, 8});
        test(new Integer[]{3, 5, 1, 7, -1, 2, 8});
        test(new Integer[]{3, 5, 1, 7, 4, 8, 2, 6});
    }

    private static void test(Integer[] array){
        Integer result = First_Missing_Positive.first_Missing_Positive(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
