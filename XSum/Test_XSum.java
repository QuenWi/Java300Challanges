package XSum;

import Helpers.PrintArrayOrList;

public class Test_XSum {

    public static void main(String[] args) {
        Float[] array = {2.3f, 6.5f, 3.4f, 5.5f, 2f, 1.6f, 5.6f, 3.2f, 3.3f, 4.9f, 3.1f, 6f, 5.8f, 1.2f, 4.7f};
        Float wanted = 19.8f;
        int sumOfXVar = 5;
        Integer[] result = XSum.xSum(array, wanted, sumOfXVar);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Wanted: " + wanted + ", with " + sumOfXVar + " Variables.");
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
