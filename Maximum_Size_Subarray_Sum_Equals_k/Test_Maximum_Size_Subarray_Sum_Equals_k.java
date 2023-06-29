package Maximum_Size_Subarray_Sum_Equals_k;

import Helpers.PrintArrayOrList;
import XSum.XSum;

public class Test_Maximum_Size_Subarray_Sum_Equals_k {

    public static void main(String[] args) {
        test(new Float[] {2.3f, 6.5f, 3.4f, 5.5f, 2f, 1.6f, 5.6f, 3.2f, 3.3f, 4.9f, 3.1f, 6f, 5.8f, 1.2f, 4.7f}, 19.8f, 5);
    }

    private static void test(Float[] array, Float wanted, int sumOfXVar){
        Integer result = Maximum_Size_Subarray_Sum_Equals_k.maximum_Size_Subarray_Sum_Equals_k(array, wanted);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Wanted: " + wanted.toString() + ", with " + sumOfXVar + " variables");
        System.out.println("Result: " + result.toString());
    }
}
