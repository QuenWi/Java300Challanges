package Maximum_Sum_of_Subarray_Close_to_K;

import Helpers.PrintArrayOrList;

public class Test_Maximum_Sum_of_Subarray_Close_to_K {

    public static void main(String[] args) {
        test(new Float[]{2.2f, 1.2f, -2f, 3.1f, 0.8f, 1.1f, -2.2f, 0.6f, 0.5f, - 0.3f, 2.3f, 3.7f, -1f, 1.7f, 1.8f, 2f} , 7f);
    }

    private static void test(Float[] array, Float max){
        Float result = Maximum_Sum_of_Subarray_Close_to_K.maximum_Sum_of_Subarray_Close_to_K(array, max);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array) + ", wanted " + max.toString());
        System.out.println("Result: " + result.toString());
    }
}
