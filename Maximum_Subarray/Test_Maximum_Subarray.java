package Maximum_Subarray;

import Helpers.PrintArrayOrList;

public class Test_Maximum_Subarray {

    public static void main(String[] args) {
        test(new Float[] {-2f, 0.4f, 4f, 2.3f, -3f, 1f, -4f, 2.2f, 4.3f, -1f, 3.3f, -6f});
    }

    private static void test(Float[] array){
        Float result = Maximum_Subarray.maximum_Subarray(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
