package Contains_Duplicate_III;

import Helpers.PrintArrayOrList;

public class Test_Contains_Duplicate_III {

    public static void main(String[] args) {
        test(new Double[]{4d, 9.5d, 18d, 25d, 31d, 3d, 36.2d, 9d, 16d, 45d, 66d}, 5d, 4);
        test(new Double[]{4d, 9.5d, 18d, 25d, 31d, 3d, 36.2d, 9d, 16d, 45d, 14d, 66d}, 5d, 4);
    }

    private static void test(Double[] array, Double maxValueDiff, Integer maxPositionDiff){
        Boolean result = Contains_Duplicate_III.contains_Duplicate_III(array, maxValueDiff, maxPositionDiff);

        System.out.println(String.format("Given: Array %s, Maximum Value Difference %s, Maximum Position Difference %s",
                PrintArrayOrList.arrayToString(array), maxValueDiff, maxPositionDiff));
        System.out.println("Result: " + result);
    }
}
