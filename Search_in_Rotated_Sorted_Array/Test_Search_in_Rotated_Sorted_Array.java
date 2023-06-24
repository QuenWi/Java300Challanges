package Search_in_Rotated_Sorted_Array;

import Helpers.Interval;
import Helpers.PrintArrayOrList;

public class Test_Search_in_Rotated_Sorted_Array {

    public static void main(String[] args) {
        Double[] array = {6.2d, 6.5d, 7d, 10d, 10.1d, 12d, 1d, 2.2d, 2.2d, 2.3d, 4d, 4.1d, 5d, 5d};
        //Double[] array = {5d, 5d, 6.2d, 6.5d, 7d, 10d, 10.1d, 12d, 1d, 2.2d, 2.2d, 2.3d, 4d, 4.1d};
        //Double[] array = {6.2d, 6.5d, 7d, 10d, 10.1d, 12d, 1d, 2.2d, 2.2d, 2.3d, 4d, 4.1d};
        //Double[] array = {6.2d, 6.5d, 7d, 10d, 10.1d, 12d, 1d, 2.2d, 2.2d, 2.3d, 4d, 4.1d, 5d, 5.1d};
        Double searched = 5d;
        Interval<Integer> result = Search_in_Rotated_Sorted_Array.search_in_Rotated_Sorted_Array(array, searched);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result for " + searched.toString() + ": " + result.toString());
    }
}
