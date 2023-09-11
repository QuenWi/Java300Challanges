package Missing_Number;

import Helpers.PrintArrayOrList;

public class Test_Missing_Number {

    public static void main(String[] args) {
        test(new Double[]{1d, 2d, 3d, 4d, 6d, 7d});
        test(new Double[]{1.1d, 3.3d, 4.4d, 5.5d, 6.6d});
    }

    private static void test(Double[] array){
        Double result = Missing_Number.missing_Number(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
