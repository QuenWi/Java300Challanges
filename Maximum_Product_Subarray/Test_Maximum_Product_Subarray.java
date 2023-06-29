package Maximum_Product_Subarray;

import Helpers.PrintArrayOrList;
import Maximum_Subarray.Maximum_Subarray;

public class Test_Maximum_Product_Subarray {

    public static void main(String[] args) {
        test(new Float[] {-2f, 0.4f, 4f, 2.3f, -3f, 1f, -4f, 2.2f, 4.3f, -1f, 3.3f, -6f});
        test(new Float[] {-1f, 2f, 3f, 4f, 5f});
        test(new Float[] {1f, 2f, -3f, 4f, 5f});
        test(new Float[] {1f, 2f, -3f, 2f, -1f});
        test(new Float[] {1f, -2f, -3f, 2f, -4f});
        test(new Float[] {7f, 2f, -2f, -3f, 2f, -4f, 5f, 6f});
    }

    private static void test(Float[] array){
        Float result = Maximum_Product_Subarray.maximum_Product_Subarray(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
