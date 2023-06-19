package Next_Permutation;

import Helpers.PrintArrayOrList;

public class Test_Next_Permutation {

    public static void main(String[] args) {
        Float[] array = {1.3f, 3f, 6f, 3.4f, 5.5f, 8.3f, 6.3f, 2f, 1f};

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        Next_Permutation.next_Permutation(array);
        System.out.println("Result: " + PrintArrayOrList.arrayToString(array));

        Integer[] array2 = {3, 2, 1};
        System.out.println("\nSecond\nGiven: " + PrintArrayOrList.arrayToString(array2));
        Next_Permutation.next_Permutation(array2);
        System.out.println("Result: " + PrintArrayOrList.arrayToString(array2));
    }
}
