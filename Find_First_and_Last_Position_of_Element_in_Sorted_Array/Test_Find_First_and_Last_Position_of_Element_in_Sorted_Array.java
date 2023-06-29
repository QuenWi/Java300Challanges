package Find_First_and_Last_Position_of_Element_in_Sorted_Array;

import Helpers.Interval;
import Helpers.PrintArrayOrList;

public class Test_Find_First_and_Last_Position_of_Element_in_Sorted_Array {

    public static void main(String[] args) {
        test(new Double[]{1d, 2d, 3.3d, 3.3d, 3.3d, 3.3d, 4d, 4d, 4.3d, 4.3d, 5d, 5d, 5d, 5.5d, 6d});
        test(new Double[]{3.3d, 3.3d, 3.3d, 3.3d});
        test(new Double[]{1d, 2d, 3.3d});
    }

    private static void test(Double[] array){
        Interval<Integer> result = Find_First_and_Last_Position_of_Element_in_Sorted_Array.find_First_and_Last_Position_of_Element_in_Sorted_Array(array, 3.3d);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
