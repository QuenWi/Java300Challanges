package Find_Median_from_Data_Stream;

import Helpers.PrintArrayOrList;

public class Test_Find_Median_from_Data_Stream {

    public static void main(String[] args) {
        test(new Integer[]{3, 4, 2, 8, 7, 0, 8, 1, 5});
        System.out.println("Here you've one Integer Array and one Double. Thats why the different results!");
        test(new Integer[]{3, 4, 2, 8, 7, 8, 1, 5});
        test(new Double[]{3d, 4d, 2d, 8d, 7d, 8d, 1d, 5d});
    }

    private static void test(Integer[] array){
        Integer result = Find_Median_from_Data_Stream.find_Median_from_Data_Stream(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }

    private static void test(Double[] array){
        Double result = Find_Median_from_Data_Stream.find_Median_from_Data_Stream(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
