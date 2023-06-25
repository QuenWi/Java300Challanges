package HIndex;

import Helpers.PrintArrayOrList;

public class Test_HIndex {

    public static void main(String[] args) {
        Integer[] array = {1, 5, 6, 7, 3, 9, 12, 2, 4, 3, 8};
        //Integer[] array = {1, 5, 6, 7, 3, 9, 12, 2, 4, 3, 8, 9};
        //Integer[] array = {1, 6, 7, 9, 12, 3, 8};
        Integer result = HIndex.hIndex(array);

        System.out.println("Given:" + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
